/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assembler.project;
import java.io.*;
import java.util.Hashtable;
import java.util.Enumeration;

import java.util.Queue;
import java.util.LinkedList;
/**
 *
 * @author usuario
 */
public class translate {
   
   //instances
    private Hashtable<String, String> dictionary = new Hashtable<String, String>();
    private Queue<String> HackCode = new LinkedList<String>();
    private int RAMCount = 16;
    public String codeContent="";
    
    //instances about the C instruction
    private Hashtable<String, String> comp_0 = new Hashtable<String, String>();
    private Hashtable<String, String> comp_1 = new Hashtable<String, String>();
    private Hashtable<String, String> dest_ = new Hashtable<String, String>();
    private Hashtable<String, String> jmp_ = new Hashtable<String, String>();
    
    //methods...................................................................................
    
      /*
      * The constructor method fills the the dictionaries
      */

    public translate(String HackCodeFileName) throws Exception{
       dictionary = ReadSymbolsFile(dictionary, ".\\src\\assembler\\project\\Files source\\DefaultSymbols.txt");
       comp_0 = ReadSymbolsFile(comp_0, ".\\src\\assembler\\project\\Files source\\comp0.txt");
       comp_1 = ReadSymbolsFile(comp_1, ".\\src\\assembler\\project\\Files source\\comp1.txt");
       dest_ = ReadSymbolsFile(dest_, ".\\src\\assembler\\project\\Files source\\dest.txt");
       jmp_ = ReadSymbolsFile(jmp_, ".\\src\\assembler\\project\\Files source\\jump.txt");
       ReadHackCode(HackCodeFileName);
    }
    
     /*
      * This method convert the hack code to assembler with the specific runs
      */
    public String ConvertToAssembler(){
       String results ="";
       results+=RunZero()+"%";
       results+=FirstRun()+"%";
       results+=SecondRun()+"%";
       
       //translate process
       Queue<String> temp = new LinkedList<String>();
       while (HackCode.size()>0)
       {
          if(IsBinary(HackCode.peek())){
             temp.add(HackCode.peek());
             results+=HackCode.remove()+"\n";
          }else{
             temp.add(InstructionTypeC(HackCode.peek().trim()));
             results+=InstructionTypeC(HackCode.remove().trim())+"\n";
          }
          
       }
       results+="%" + getDictionary();
       return results;
    }
   
     /*
      * This method deletes the comments for the hack code
      */
    private String RunZero(){
       Queue<String> temp = new LinkedList<String>();
       String withoutComments="";
       int limit = HackCode.size();
       for (int i = 0; i <limit; i++)
       {
          String line = HackCode.remove().split("//")[0];
          if(!line.equals("")){
             temp.add(line.trim());
             withoutComments+=line.trim()+"\n";
          }
          
       }
       HackCode = temp;
       return withoutComments;
    }
    
     /*
      * This method finds the tags and save this on memory ROM
      */
    private String FirstRun(){
        Queue<String> temp = new LinkedList<String>();
        String withoutTags="";
       int limit = HackCode.size();
       for (int i = 0; i < limit; i++)
       {
          if(HackCode.peek().contains("(")){
             //It is a tag
             String tag = "@"+HackCode.peek().replace("(", "").replace(")", "").trim();
             dictionary.put(tag,ConvertToBinary(i+""));
             HackCode.remove();
             i-=1;
             limit-=1;
          }else{
             //It is not a tag
             withoutTags+=HackCode.peek()+"\n";
             temp.add(HackCode.remove());
          }
       }
       HackCode = temp;
       return withoutTags;
    }
    
    
    /*
      * This method finds the variables and save this on memory RAM 
      */
    private String SecondRun(){
       Queue<String> temp = new LinkedList<String>();
        String result="";
       int limit = HackCode.size();
       for (int i = 0; i < limit; i++)
       {
           if(HackCode.peek().contains("@")){
             //It is a variable or tag
              if(IsNumber(HackCode.peek().replace("@", ""))){
                 dictionary.put(HackCode.peek(), ConvertToBinary(HackCode.peek().replace("@", "")));
                 result+= ConvertToBinary(HackCode.peek().replace("@", ""));
                 temp.add(ConvertToBinary(HackCode.remove().replace("@", "")));
              }else{
                  if(dictionary.containsKey(HackCode.peek())){
                 //It is a tag or variable before entered
                    temp.add(dictionary.get(HackCode.peek()));
                    result+=dictionary.get(HackCode.remove())+"\n";
                 }else{
                 //It is a variable
                    dictionary.put(HackCode.peek(), ConvertToBinary(RAMCount+""));
                    result+=ConvertToBinary(RAMCount+"")+"\n";
                    temp.add(ConvertToBinary(RAMCount+""));
                    HackCode.remove();
                     RAMCount++;
                 }
              }
             
          }else{
             //It is instruction
              result+=HackCode.peek()+"\n";
             temp.add(HackCode.remove());
          }
       }
       HackCode = temp;
       return result;
    }
    
   /*
    * Fills a Queue with Hack code selected
    */

    private void ReadHackCode(String fileName)throws  Exception{
      
       File entry = new File(fileName);
       BufferedReader codeFile = new BufferedReader(new FileReader(entry));
       
       String line;
         while ((line = codeFile.readLine()) != null){
           HackCode.add(line.trim());
           codeContent+=line.trim()+"\n";
         }
       codeFile.close();
    }
    
  /*
   * This method receives a number (in String format) and converts it to binary
   */
    private String ConvertToBinary(String number){
       int intNumber = Integer.parseInt(number);
       String bin = Integer.toBinaryString(intNumber);
       
       
       while(bin.length()<16)
       {
          bin = "0"+bin;
       }
       return bin;
    }
 
  /*
   * Returns if a entry is a binary number
   */
    private boolean IsBinary(String expression){
       char[] array = expression.toCharArray();
       
       for (int i = 0; i < array.length; i++)
       {
          if(array[i]!='0' && array[i]!='1'){
             return false;
          }
       }
       return true;
    }
    
    /*
   * Returns if a entry is a number
   */
    private boolean IsNumber(String number){
        char[] array = number.toCharArray();
       
       for (int i = 0; i < array.length; i++)
       {
          if(!"1234567890".contains(array[i]+"")){
             return false;
          }
       }
       return true;
    }
    
    
  /*
   * Returns our dictionary of equivalences in string format
   */
    private String getDictionary(){
       String result="";
       int count =1;
         Enumeration e = dictionary.keys();
         Object clave;
         while( e.hasMoreElements() ){
           clave = e.nextElement();
           result+=count+") " + clave + " => " + dictionary.get( clave )+"\n";
           count++;
         }
         
         return  result;
    }
    
    
    /*
   * Returns the symbol more relevant on expression, but if it does not find one, returns the expression.
   */
    private String WhatConstains(String expression){
       
       if(expression.contains("=")){
          return "=";
       }else if(expression.contains("J")) {
          return "J";
       }else if(expression.trim().length()==1) {
          if(expression.contains("A")){
          return "A"; 
         }else if(expression.contains("D") && expression.trim().length()==1) {
            return "D";
         }else if(expression.contains("M")&& expression.trim().length()==1) {
            return "M";
         }else if(expression.contains("0")){
          return "0";
         }else if(expression.contains("1")){
            return "1";
         }else if(expression.contains("-1")){
            return "-1";
       }
    }
       return expression;
    }
    
    
    /*
   * Translate the expression type C in a code of 16'bits
   */
    private String InstructionTypeC(String expression){
       String bitA = "";
       String comp ="000000";
       String dest = "000";
       String jump ="000";
       
       while(true){
          switch(WhatConstains(expression)){
             case "=":
                dest = dest_.get(expression.split("=")[0].trim());
                expression=expression.split("=")[1].trim();
                break;
             case "0":
                bitA="0";
                comp = comp_0.get("0");
                expression="";
                break;
             case "1":
                bitA="0";
                 comp = comp_0.get("1");
                 expression="";
                 break;
             case "-1":
                bitA="0";
                 comp = comp_0.get("-1");
                 expression="";
                break;
             case "J":
                jump = jmp_.get(expression.split(";")[1].trim());
                expression=expression.split(";")[0];
                break;
            case "A":
               bitA="0";
              comp = comp_0.get(expression.trim());
              expression="";
              break;
             case "M":
              bitA="1";
              comp = comp_1.get(expression.trim());
              expression="";
              break;
             case "D":
              bitA="0";
              comp = comp_0.get(expression.trim());
              expression="";
              break;
             case "":
                return "111"+bitA+comp+dest+jump;
             default:
                if(expression.contains("M")){
                   bitA="1";
                   comp = comp_1.get(expression.trim());
                }else{
                   bitA="0";
                   comp = comp_0.get(expression.trim());
                }
                expression="";
                break;
          }
       }
    }
    
    /*
   * Generic method that reads files and fills dictionaries
   */
    public  Hashtable<String, String> ReadSymbolsFile( Hashtable<String, String> dictionary_,String fileName) throws Exception{
        File file = new File(fileName);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        
         String instruction;
         try{
            while(!(instruction = reader.readLine()).equals("")){
               dictionary_.put(instruction.split(",")[0], instruction.split(",")[1]);
            }
         }catch(Exception e){ }
         
        reader.close();
       return dictionary_;
    }
 
   
}
