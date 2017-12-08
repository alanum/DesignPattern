package filter;

import java.util.List;

public class OrCriteria implements Criteria {

	private Criteria criteria;
	private Criteria other;
	public OrCriteria(Criteria criteria,Criteria other) {
		this.criteria = criteria;
		this.other = other;
	}
	
	@Override
	public List<Person> meetCriterial(List<Person> persons) {
		
		List<Person> firstCriteriaPersons = criteria.meetCriterial(persons);
		
		return other.meetCriterial(firstCriteriaPersons);
	}

}
