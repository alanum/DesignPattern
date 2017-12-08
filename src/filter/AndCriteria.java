package filter;

import java.util.List;

public class AndCriteria implements Criteria {

	private Criteria criteria;
	private Criteria other;
	public AndCriteria(Criteria criteria,Criteria other) {
		this.criteria = criteria;
		this.other = other;
	}
	
	@Override
	public List<Person> meetCriterial(List<Person> persons) {
		
		List<Person> firstCriteriaPersons = criteria.meetCriterial(persons);
		List<Person> secondCriteriaPersons = other.meetCriterial(persons);
		
		for(Person p: secondCriteriaPersons){
			if(!firstCriteriaPersons.contains(p)){
				firstCriteriaPersons.add(p);
			}
		}
		
		return firstCriteriaPersons;
	}

}
