public class Cheers {
        public static void main(String[] args) {
	    String word = args[0];
            int num = Integer.parseInt(args[1]);
            String wordUpper = word.toUpperCase();
            String an = "AEFHILMNORSX";
            for (int i=0; i<word.length(); i++){
                char ch = wordUpper.charAt(i);
                if (an.indexOf(ch) == -1){
                        System.out.println("Give me a  " + ch + ": " + ch + "!");
                } else {
                        System.out.println("Give me an " + ch + ": " + ch + "!");
                }
            }
            System.out.println("What does that spell?");
            for (int j=0; j<num; j++){
                System.out.println(wordUpper + "!!!");
            }
        }
}

