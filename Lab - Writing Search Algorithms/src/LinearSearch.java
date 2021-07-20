
public class LinearSearch {
    public static void main(String[] args) {
        //create some dummy data for our method
        char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r','s', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        
        char letter = 'm';
        //call your methods here
        LinearSearch ls = new LinearSearch();
        
        System.out.println(ls.findIndex(letter, letters));
    }

    //create your first method here
    public static int findIndex(char target, char[] data) {
    	int result = -1;
    			for (int i = 0; i < data.length; i++) {
    				char temp = data[i];
    				if (temp == target) {
    					return i;
    				}
    			}
    	return result;
    }
}