import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String text = "i love cats and you should love them";
        System.out.println("your text:"+text);
        System.out.println("1 Task");
        String[] words = text.split(" ");
        for(String word : words) {
            if (word.length()==4) {
                System.out.println(word);
            }
        }
        task2();
        task3();
        task4();
        task5();
    }
    public static void task2(){
        String[] english = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q",
                "r","s","t","u","v","w","x","y","z",};
        String [] russian = {"а","б","к","д","э","ф","г","х","и","ж","к","л","м","н","о","п","к",
                "р","с","т","у","в","в","кс","й","з"};
        String word;
        System.out.println("Task 2. Enter word: ");
        Scanner s =  new Scanner (System.in);
        word = s.next();
        StringBuilder newWord = new StringBuilder();
        for(int i = 0; i < word.length(); i++) {
            for(int j = 0; j < english.length; j++) {
                if(Character.toString(word.charAt(i)).equals(english[j])) {
                    newWord=newWord.append(russian[j]);
                }
            }

        }
        System.out.println(newWord);
    }
    public static void task3(){
        int count = 0;
        System.out.println("Task 3. Enter string: ");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] words = line.split(" ");
        for(String word : words){
            if(word.matches("^[a-zA-Z]+$")) {
                System.out.println(word);
                count++;
            }
        }
        System.out.println("The number of words containing only Latin alphabet characters: "+count);
    }

    public static void task4(){
        System.out.println("Task 4. Enter string: ");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] words = line.split(" ");
        int k = 0;
        for(String word : words){
            if(word.matches("^[0-9]+$")) {
                k++;
            }
        }
        System.out.println("Amount of words that consist only from numbers: " + k);
    }
    public static boolean checkNumbers(int num) {
        char[] x = String.valueOf(num).toCharArray();
        boolean check = true;
        for (int i=0, j=x.length-1; i < x.length; i++, j--) {
            if (x[i] == x[j]) {
                check = true;
            }
            else {
                return false;
            }
        }
        return check;
    }

    public static void task5(){
        System.out.println("Task 5. Enter string: ");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] words = line.split(" ");
        for(String word : words){
            if(word.matches("^[0-9]+$")) {
                if(checkNumbers(Integer.parseInt(word))){
                    System.out.println("Word palyndrom: " + word);
                }else {
                    System.out.println("there is no palindrome number in the string");
                }
            }
        }
    }
}
