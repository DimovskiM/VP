/*
Operating Systems Homework 1
Exercise 5
@Author
Mihajlo Dimovski
*/
import java.io.*;
import java.util.*;
public class HW01_2 {
  public static void main (String[] args) throws IOException{
    File file = new File("rezultati.csv");
    if(file.exists()){
    	BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("rezultati.csv"),"UTF-8"));
    	String line="";
    	List<String> courses=new ArrayList<>();
    	Map<Integer,List<Integer>> map = new HashMap<>();
    	boolean readCourses=false;
    	while((line=br.readLine())!=null){
    	String [] parts=line.split(",");
    	if(!readCourses){
    		for(int i=1;i<parts.length;i++){
    			courses.add(parts[i]);
    		}
       readCourses=true;
       continue;
    	}
    	else{
    		int ID = Integer.parseInt(parts[0]);
    		if(map.containsKey(ID))
    		{
    			List<Integer> grades=map.get(ID);
    			for(int i=1;i<parts.length;i++){
    				grades.add(Integer.parseInt(parts[i]));
    			}
    		}
    	
    	}
    	
    	}
    
    	 
    }
    
  }
}
