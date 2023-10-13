package tddProject;

import java.util.HashMap;
import java.util.Map;

public class PracticeSearch {

	private Map<String, Integer> getcoursedata() {
		
		Map<String, Integer> pMap = new HashMap<>();
		pMap.put("Data Science & Business Analytics", 40);
		pMap.put("AI & Machine Learning", 25);
		pMap.put("Project Management", 20);
		pMap.put("Cyber Security", 50);
		pMap.put("Cloud Computing", 58);
		pMap.put("DevOps", 47);
		pMap.put("Business and Leadership", 15);
		pMap.put("Quality Management", 68);
		pMap.put("Software Development", 86);
		pMap.put("Agile and Scrum", 10);
		pMap.put("IT Service and Architecture", 30);
		pMap.put("Digital Marketing", 25);
		pMap.put("Big Data", 43);

		return pMap;
	}
	
	public int getPractices(String course) {
		
		Map<String, Integer> pMap = null ;
		int count =0;
		
		pMap = getcoursedata();
		
		if(course.isEmpty())
			
			System.out.println("Course name cannot be empty");
		
		else if(!pMap.containsKey(course))
		
			System.out.println(course+ "-> Course doesnot exist");
		
		else 
			
			count = pMap.get(course);
		
		return count;
		
	
	}

}
