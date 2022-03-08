import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
public class  Puzz{

    public void getTenRolls(){
        Random randMachine =  new Random();
        int[] numbers;
        numbers = new int[10];
        int bound = 20;
        for (int i=0 ; i<10 ; i++){
            int random = randMachine.nextInt(bound);
            numbers[i] = random;
        }
        System.out.println(Arrays.toString(numbers));
        
        }

    public void getRandomLetter(){
        Random randMachine =  new Random();
        char [] letters;
        letters = new char[26];
        String characters = "abcdefghijklmnopqrstuvwxys";

        for (int i=0 ; i<26; i++){
            int randomInt = randMachine.nextInt(characters.length());
            letters[i] = characters.charAt(randomInt);
        }
        System.out.println(Arrays.toString(letters));

    }
    public void generatePassword(){
        Random randMachine =  new Random();
        String password ="";
        String characters = "abcdefghijklmnopqrstuvwxys";

        for (int i=0 ; i<8; i++){
            int randomInt = randMachine.nextInt(characters.length());
            char letter= characters.charAt(randomInt);
            password +=letter;

        }
        System.out.println(password);
    }
    public void getNewPasswordSet(int length){
        ArrayList<String> passwords = new ArrayList<String>();
        Random randMachine =  new Random();
        // String password ="";
        String characters = "abcdefghijklmnopqrstuvwxys";

        for (int j=0 ; j<length ; j++){
            String password ="";
        for (int i=0 ; i<8; i++){
            int randomInt = randMachine.nextInt(characters.length());
            char letter= characters.charAt(randomInt);
            password +=letter;
        }
        passwords.add(password);
    }
    System.out.println(passwords);
        
    }

}