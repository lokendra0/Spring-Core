package com.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {

	public static void main(String[] args) {

//		
//		List<Integer> list = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5,6));
//		Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.partitioningBy(i->i%2==0));
//		List<Integer> evenList = map.get(true);
//		List<Integer> oddList = map.get(false);
//		System.out.println("Even number list"+ evenList);
//		System.out.println("Odd number list"+ oddList);

		
//	 int[] input = {1,2,3,1,3,4};
//	 Map<Object,Long> map = Arrays.stream(input).boxed().collect(Collectors.groupingBy(value->value,Collectors.counting()));
//   Iterator<Map.Entry<Object,Long>> iteratorMap = map.entrySet().iterator();
//   while(iteratorMap.hasNext()) {
//	 Map.Entry<Object,Long> entrySet = iteratorMap.next();
//	 System.out.println("VALUE IS "+  entrySet.getKey() + " = OCCURENCES IS "+ entrySet.getValue());
//   }

//		String string = "Lokendraa";
//		string.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(value -> value, Collectors.counting()))
//				.entrySet().stream().filter(entrySet -> entrySet.getValue() == 2).collect(Collectors.toMap(e-> e.getKey(), e-> e.getKey()));
//				.forEach(entry -> System.out.println("CHARACTER IS " + entry.getKey()));

		/*
		 * There is an array of products and need to find total amount. Each element in
		 * that array has product details format like productName , ProductQuantity,
		 * ProductPrice seperated with space each. For example
		 * ["apple 5 20","mango 2 100"], so the total amount is sum of all
		 * productQuantity * productPrice, here total amount is 5*20+ 2*100 which is
		 * 300. And if any product/element in that array has negative price / quantity
		 * or invalid format , then that product should be not considered while
		 * calculating total amount
		 * 
		 */

//	  int totalAmount = 0;
//	  
//		String[] stringArray = {"apple -5 20","mango 2 100"};
//		
//		for(String string : stringArray) {
//			String[] splitString = string.split(" ");
//			if(Integer.valueOf(splitString[1])>0 || Integer.valueOf(splitString[1])>0) {
//			totalAmount +=  Integer.valueOf(splitString[1])* Integer.valueOf(splitString[2]);
//			}
//		}
//		
//		System.out.println(totalAmount);

		// COMMERSE TOOL -> NOTE
		// ZONE TIME

//		List<String> list = new LinkedList<String>(Arrays.asList("a","a","a","vasfcas"));
//		 list.stream().collect(Collectors.groupingBy(s->s.startsWith("a")
//			 ,Collectors.counting())).entrySet().stream().filter(entry->entry.getKey()==true).forEach(entry-> System.out.println(entry.getValue()));
//		 }
//	

//		List<String> list = new LinkedList<String>(Arrays.asList("c","b","a"));
//	     List<String> gotList = 	list.stream().sorted(new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				
//			 return  o1.compareTo(o2);
//			}
//			
//		}).collect(Collectors.toList());
//		System.out.println(gotList);

//		List<Integer> list = new LinkedList<Integer>(Arrays.asList(9,8,7,6,5,4,3,2,1));
//		List<Integer> gotList = 	list.stream().sorted(new Comparator<Integer>() {
//		
//					@Override
//					public int compare(Integer o1, Integer o2) {
//						
//					 return o1-o2;
//					}
//					
//				}).skip(1).limit(1).collect(Collectors.toList());
//			 
//				System.out.println(gotList);

//		calculate the sum of the squares of all odd numbers in the list.

//		List<Integer> list = new LinkedList<Integer>(Arrays.asList(9,8,7,6,5,4,3,2,1));
//		Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.partitioningBy(i->i%2==0));
//		List<Integer> oddList = map.get(false);
//		int i =oddList.stream().map(value->value*value).mapToInt(v->v).sum();
//		System.out.println(i);

//
//		List<String> list = new LinkedList<String>(Arrays.asList("ccc","bbbb","aasdfasd","aa"));
//	    list.stream().map(s->s.substring(0,1)).collect(Collectors.toList()).stream().collect(Collectors.groupingBy(c->c,Collectors.counting())).forEach((k,v)->System.out.println(k+" "+v));
//	   
		

//		
//		List<List<String>> list = new LinkedList<List<String>>();
//		List<String> list1 = new LinkedList<String>(Arrays.asList("1","2","3","4"));
//		List<String> list2 = new LinkedList<String>(Arrays.asList("5","6","7","8"));
//		list.add(list1);
//		list.add(list2);
//      List ll = list.stream().flatMap(l-> l.stream()).collect(Collectors.toList());
//      System.out.println(ll);

//		Stream<Integer> s1 = Arrays.asList(1, 2, 3).stream();
//		Stream<Integer> s2 = Arrays.asList(1, 2, 3).stream();
//
//		Stream<Integer> result = Stream.concat(s1, s2);
//		result.forEach(value -> System.out.println(value));

		// Stream Infinite Series: Create a program that generates an infinite stream of
		// Fibonacci numbers and then calculates the sum of the first N Fibonacci
		// numbers, where N is provided by the user.
		
//		int n = 10; // Number of Fibonacci numbers to sum
//		long sum = Stream.iterate(new long[] { 0, 1 }, f -> new long[] { f[1], f[0] + f[1] }).limit(n)
//				.mapToLong(f -> f[0]).sum();
//		System.out.println("Sum of first " + n + " Fibonacci numbers: " + sum);
		
//		Stream Custom Collectors: Implement a custom collector that calculates the median of a stream of integers.
		
//		       List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3);
//		       double median = numbers.stream()
//		                              .sorted()
//		                              .collect(new MedianCollector());
//		       System.out.println("Median: " + median);
		
//
//String s = "LOKENDRAA";
//Map<Object,Long> map = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(v->v,Collectors.counting()));
//System.out.println(map);
//
//int[] input = {1,4,3,5,7,9,2,2};
//
//Arrays.stream(input).boxed().collect(Collectors.groupingBy(i->i,Collectors.counting())).entrySet().stream().forEach(entry-> System.out.println(entry.getKey()+" "+ entry.getValue()));
//


//int[] input = {1,4,3,5,7,9,2,2};
//Arrays.stream(input).boxed().collect(Collectors.partitioningBy(i->i%2==0)).entrySet().stream().forEach(entry-> {
//if(entry.getKey() == true){
//System.out.println("EVEN NUMBERS:"+ entry.getValue());
//}else{
//System.out.println("Odd NUMBERS:"+ entry.getValue());
//}
//});

		
//		int[] input = {1,4,3,5,7,9,2,2};
//
//		long o = Arrays.stream(input).boxed().filter(i->i%2!=0).map(l->l*l).mapToInt(k->k).sum();
//System.out.println(o);



//List<String> list = new LinkedList<String>(Arrays.asList("LOKENDRA","ASAP","AS"));
//List<String> sorted = list.stream().sorted(new Comparator<String>(){
//
//public int compare(String s1, String s2){
//return s2.length()-s1.length();
//}
//
//}).collect(Collectors.toList());
		

//List<String> list = new LinkedList<String>(Arrays.asList("LOKENDRA","ASAP","AS"));
//
//list.stream().map(s->s.substring(0,1)).collect(Collectors.groupingBy(c->c,Collectors.counting())).entrySet().stream().forEach(i->System.out.println(i.getKey()+" "+i.getValue()));
//



//int[] input = {1,4,3,5,7,9,2,2};
//
//Integer i = Arrays.stream(input).boxed().reduce(0,(a,b)->a*b);
		
	
		   
		}

}
