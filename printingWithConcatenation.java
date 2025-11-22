class printingWithConcatenation {

	public static void main(String[] args) {
		var x = 10;
		var y = 5;
		var result1 = x + y; // --> + this Will Act as addition
		System.out.println(result1);
		var a = "Manoja";
		var b = 10;
		var res = a + b; // if Num + Num --> Addition , String + Num --> Concatenation
		System.out.println(res);
		var c = 10;
		var d = 5;
		var e = "Man";
		var f = 20;
		var g = 4;
		var result = c + d + e + f + g;
		System.out.println(result); /** output :- 15Man204 why?
		                                10 + 5 + "Man" + 20 + 4
		                                10 + 5 -> This will Add --> 15 ---> Num + Num -> Add
		                                15 + "Man" -> This will do Concatenation --> 15Man --> Num + String -> Concatenation
		                                15Man + 20 -> THis will also do Concatenation --> 15Man20 Num + String -> Concatenation
		                                15Man20 + 4 -> this will also do Concatenation --> 15Man204 Num + String -> Concatenation**/
	}

}
