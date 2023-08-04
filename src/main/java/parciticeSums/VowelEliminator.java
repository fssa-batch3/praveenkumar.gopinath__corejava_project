package parciticeSums;

public class VowelEliminator {
    public static void main(String[] args) {
        String input = "PRAVEEN";
        StringBuilder result = new StringBuilder();    
        for (int i = 0; i < input.length(); i++) {
            char c = Character.toLowerCase(input.charAt(i));
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'){
                result.append(input.charAt(i));
            }
        }
        String output = result.toString();
        System.out.println(output);
    }
}
