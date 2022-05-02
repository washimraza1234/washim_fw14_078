package com.evaluation4.q1;

import java.util.ArrayList;
import java.util.HashMap;

public class Mobile{

    HashMap<String, ArrayList<String>> mobiles = new HashMap<>();

    public String addMobile(String company, String model)
    { 
        if(mobiles.containsKey(company))
        {
            ArrayList<String> templist = mobiles.get(company);
            templist.add(model);
            mobiles.replace(company,templist);
        }
        else
        {
            ArrayList<String> templist = new ArrayList<>();
            templist.add(model);
            mobiles.put(company,templist);
        }
       return "Mobile successfully added";
    }
    
    public ArrayList<String>getModels(String company) throws InvalidMobileException
    {
        ArrayList<String> temp = mobiles.get(company);
//        if(mobiles.containsKey(company))
        if(mobiles.containsKey(company)&&!temp.isEmpty())
        {
            return temp;
        }
        else{
        	InvalidMobileException ae=new InvalidMobileException("Invalid Company");
        	throw ae;
        }
    }
    
    public static void main(String[] args) {
//    	Call the addMobile method by adding some mobiles with their details
    	Mobile obj = new Mobile();
    	String show=obj.addMobile("Nokia", "X-2");
    	System.out.println(show);
    	
    	//Call the getModels method and print the list of the models of the supplied
//    	company
    	try {
    	ArrayList<String> listOfModels=obj.getModels("Nokia");
    	System.out.println(listOfModels);
    	}
    	catch(Exception iMe){
    		System.out.println(iMe.getMessage());
    	}
        
	}

    
}