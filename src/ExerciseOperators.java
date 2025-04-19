public class ExerciseOperators {
    public static void main(String[] args) {
        int[] myArray = {3, 4, 6, 3, 5, 3, 7, 6, 9, 2};
        System.out.println("Addition elements at index 0,1: " + (myArray[0] + myArray[1]));
        System.out.println("Subtraction elements at index 2,3: " + (myArray[2] - myArray[3]));
        System.out.println("Multiplication elements at index 4,5: " + (myArray[4] * myArray[5]));
        System.out.println("Division elements at index 6,7: " + (myArray[6] / myArray[7]));
        System.out.println("Modulus elements at index 8,9: " + (myArray[8] % myArray[9]));

        for(int i = 1; i < myArray.length; i++) {
            String answer = myArray[i] > myArray[i-1]?
                    "bigger than ":(myArray[i] == myArray[i-1]?"the same as ":"smaller than ");
            System.out.println(myArray[i] + " is " + answer + myArray[i-1]);
        }
    }
}
