package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filter {
	
	public static void main(String[] args) {

		List<Integer> myNumberList = new ArrayList<Integer>();
		for(int i = 0; i < 5 ; i++) myNumberList.add(i);
		
		// Processing Stream 
		myNumberList.stream().forEach(n ->{
			System.out.println(" Stream For Each Value ::" +n);
		});
			
			
		//Process Stream, Apply Operation and Store Result
		
		Function<Integer,Double> toDoubleFunction = Integer::doubleValue;
		Predicate<Integer> isEvenFunction = n -> n>0 && n%2 ==0;
		
		List<Double> doubleList = myNumberList.stream().filter(isEvenFunction).map(toDoubleFunction).collect(Collectors.toList());
		System.out.println("Printing Double List : " + doubleList);
	}

}