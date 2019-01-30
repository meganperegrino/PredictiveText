public class predictiveText {
	
	public class t9Pad {
		
		public t9Pad() {
			
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(PredText("dog"));
	}
	
	public static String PredText(String word) {
		
		StringBuilder result = new StringBuilder();
		String ch = "";
		
		for(int i = 0; i < word.length(); i++) {
			ch = word.substring(i, i + 1);
			if(ch.equals("a") || ch.equals("b") || ch.equals("c")) {
				result.append("2");
			}
			if(ch.equals("d") || ch.equals("e") || ch.equals("f")) {
				result.append("3");
			}
			if(ch.equals("g") || ch.equals("h") || ch.equals("i")) {
				result.append("4");
			}
			if(ch.equals("j") || ch.equals("k") || ch.equals("l")) {
				result.append("5");
			}
			if(ch.equals("m") || ch.equals("n") || ch.equals("o")) {
				result.append("6");
			}
			if(ch.equals("p") || ch.equals("q") || ch.equals("r") || ch.equals("s")) {
				result.append("7");
			}
			if(ch.equals("t") || ch.equals("u") || ch.equals("v")) {
				result.append("8");
			}
			if(ch.equals("w") || ch.equals("x") || ch.equals("y") || ch.equals("z")) {
				result.append("9");
			}
		}
		
		return result.toString();
	}
	
}