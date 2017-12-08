package iterator;



public class NameRepository implements Container {

	private String[] names= {"Robert","John","Julie","lora"};
	
	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}
	
	private class NameIterator implements Iterator{

		int index;
		@Override
		public boolean hasNext() {
			
			return index<names.length;
		}

		@Override
		public Object next() {
			
			if(hasNext()){
				return names[index++];
			}
			
			return null;
		}
		
	}
	
}
