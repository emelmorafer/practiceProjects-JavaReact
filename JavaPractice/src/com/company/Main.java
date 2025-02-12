package com.company;


import com.company.collections.CollectionsSection;

public class Main {

    /*public static void main(String[] args) {

        //Streams section = new Streams();
        //Optionals section = new Optionals();
        //CheesQueens section = new CheesQueens();
        CollectionsSection section = new CollectionsSection();

        section.execute();
    }*/

    /*public static void main(String[] args) {

        Integer[] numbers = {1,2,3,3,4,5};
        TestSection section = new TestSection();

        int repetitions = getNumberRepetitions(numbers,3);
        System.out.print("Number of repetitions: " + repetitions);
    }

    public static Integer getNumberRepetitions(Integer[] numbers, Integer repNum) {

        int repetitions = 0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==repNum){
                repetitions++;
            }
        }
        return repetitions;
    }*/

    /*public static void main(String[] args) {

        int n = 3;
        System.out.println("Number of unique ways: " + getWaysToClimb(n, ""));
    }

    public static int getWaysToClimb(int n, String path) {
        if (n == 0) {
            System.out.println(path);
            return 1;
        }
        if (n < 0) return 0;

        return getWaysToClimb(n - 1, path + "1 ") + getWaysToClimb(n - 2, path + "2 ");
    }*/

        /*public static void main(String[] args) {

        int n = 3;
        System.out.println("Number of unique ways: " + getWaysToClimb(n, ""));
    }*/

    public static void main(String[] args) {

        String word = "arenera";
        System.out.println(isPalindrome(word));
    }


    public static String isPalindrome(String word) {

        String reverseWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {

            reverseWord = reverseWord + word.charAt(i);
        }
        return reverseWord;

        if(word)


    }

}
