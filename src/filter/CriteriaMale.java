package filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria{

	@Override
	public List<Person> meetCriterial(List<Person> persons) {
		
		List<Person> result = new ArrayList<>();
		
		for(Person p:persons){
			
			if(p.getGender().equalsIgnoreCase("male")){
				result.add(p);
			}
		}
		
		return result;
	}

}
