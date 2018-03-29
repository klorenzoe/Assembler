/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assembler.project;
import java.io.*;
import java.util.Hashtable;
import java.util.Queue;
import java.util.List;
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
    public translate(String HackCodeFileName) throws Exception{
       dictionary = ReadSymbolsFile(dictionary, ".\\src\\assembler\\project\\Files source\\DefaultSymbols.txt");
       comp_0 = ReadSymbolsFile(comp_0, ".\\src\\assembler\\project\\Files source\\comp0.txt");
       comp_1 = ReadSymbolsFile(comp_1, ".\\src\\assembler\\project\\Files source\\comp1.txt");
       dest_ = ReadSymbolsFile(dest_, ".\\src\\assembler\\project\\Files source\\dest.txt");
       jmp_ = ReadSymbolsFile(jmp_, ".\\src\\assembler\\project\\Files source\\jmp.txt");
       ReadHackCode(HackCodeFileName);
    }
    
     /*
      * This method convert the hack code to assembler with the specific runs
      */
    public String ConvertToAssembler(){
       String results ="";
       results+=RunZero()+"$";
       results+=FirstRun()+"$";
       results+=SecondRun()+"$";
       
       //translate process
       
       
       return results;
    }
   
     /*
      * This method delete the comments for the hack code
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
      * This method find the tags and save this on memory ROM
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
             dictionary.put(tag, i+"");
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
      * This method find the variables and save this on memory RAM 
      */
    private String SecondRun(){
       Queue<String> temp = new LinkedList<String>();
        String result="";
       int limit = HackCode.size();
       for (int i = 0; i < limit; i++)
       {
           if(HackCode.peek().contains("@")){
             //It is a variable or tag
             if(dictionary.containsKey(HackCode.peek())){
             //It is a tag or variable before entered
                temp.add(dictionary.get(ConvertToBinary(HackCode.remove()))); //¿´Para regresar a la etiqueta como reconoce que no es una instruccion tipo a?
             }else{
             //It is a variable
                dictionary.put(HackCode.peek(), RAMCount+"");
                RAMCount++;
             }
          }else{
             //It is instruction
             temp.add(HackCode.remove());
          }
           result+=temp.peek()+"\n";
       }
       HackCode = temp;
       return result;
    }
    
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
    
    private String ConvertToBinary(String number){
       int intNumber = Integer.parseInt(number);
       String bin = Integer.toBinaryString(intNumber);
       
       for (int i = 0; i < 16 - bin.length(); i++)
       {
          bin = "0"+bin;
       }
       return bin;
    }
 
    private boolean IsBinary(String expretion){
       return expretion.contains("0") || expretion.contains("1");
    }
    
    private String WhatConstains(String expretion){
       
       if(expretion.contains("=")){
          return "=";
       }else if(expretion.contains("0")){
          return "0";
       }
       else if(expretion.contains("1")){
          return "1";
       }else if(expretion.contains("-1")){
          return "-1";
       }else{
          return "J";
       }
    }
    
    private String InstructionTypeC(String expretion){
       String bitA = "";
       String comp ="000000";
       String dest = "000";
       String jump ="000";
       
       while(true){
          switch(WhatConstains(expretion)){
             case "=":
                dest = dest_.get(expretion.split("=")[0].trim());
                expretion=expretion.split("=")[1].trim();
                break;
             case "0":
                comp = comp_0.get("0");
                break;
             case "1":
                 comp = comp_0.get("1");
                break;
             case "-1":
                 comp = comp_0.get("-1");
                break;
             case "J":
                comp = comp_0.get(expretion.split(";")[0].trim());
                jump = jmp_.get(expretion.split(";")[1].trim());
                expretion="";
                break;
             default:
                if(expretion.contains("M")){
                   comp = comp_1.get(expretion.trim());
                }else{
                   comp = comp_0.get(expretion.trim());
                }
                expretion="";
                break;
          }
       }
    }
    public  Hashtable<String, String> ReadSymbolsFile( Hashtable<String, String> dictionary_,String fileName) throws Exception{
        File file = new File(fileName);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        
         String instruction;
         while (!((instruction = reader.readLine()).equals("")) && instruction != null){
          dictionary_.put(instruction.split(",")[0], instruction.split(",")[1]);
         }
        reader.close();
       return dictionary_;
    }
 
   
}
