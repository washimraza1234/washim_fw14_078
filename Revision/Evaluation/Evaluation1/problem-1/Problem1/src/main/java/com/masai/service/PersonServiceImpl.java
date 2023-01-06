package com.masai.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.masai.entities.Gym;
import com.masai.entities.Person;

@Service
public class PersonServiceImpl implements PersonService{

	
	private Map<Person, Gym> theMap;
	
	@Autowired
	private List<Person> theList;
	
	@Value("${appName}")
	private String appName;
	
	@Override
	public void printMap() {
		
		theMap.put(new Person(1, "Washim", "washim@gmail.com","23" , "123456"), new Gym(1, "MuscleMania", "1200"));
		theMap.put(new Person(2, "Kuheli", "kuheli@gmail.com","23" , "123456"), new Gym(2, "MuscleMania", "1200"));
		theMap.put(new Person(3, "Lina", "lina@gmail.com","23" , "123456"), new Gym(3, "MuscleMania", "1200"));

		
//		System.out.println(theMap);
		
		for (Map.Entry<Person, Gym> entry: theMap.entrySet()) {
			System.out.println(entry.getKey()+" = "+ entry.getValue());
		}
		
	}

	@Override
	public void printList() {
		
		theList.add(new Person(1, "Washim", "washim@gmail.com","23" , "123456"));
		theList.add(new Person(2, "Kuheli", "kuheli@gmail.com","23" , "123456"));
		theList.add(new Person(2, "Lina", "lina@gmail.com","23" , "123456"));
		theList.add(new Person(2, "Ayan", "ayan@gmail.com","23" , "123456"));
		theList.add(new Person(2, "Mamu", "mmu@gmail.com","23" , "123456"));
		
		
		
		for (Person p: theList) {
			System.out.println(p);
		}
		
	}

	@Override
	public void printAppName() {
		System.out.println(appName);
		
	}

}
