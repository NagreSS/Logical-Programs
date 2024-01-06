public class FindDuplicates {

	public static void main(String[] args) {
		
		// find duplicates using stream api
		
	List<Integer> list=Arrays.asList(5,5,4,8,9,9,8,2,3);
	Set<Integer> dulicates=new HashSet<Integer>();
	Set<Integer> duplicateSet=list.stream().filter(n->!dulicates.add(n)).collect(Collectors.toSet());
	
	System.out.println(duplicateSet);
		

	}

}
