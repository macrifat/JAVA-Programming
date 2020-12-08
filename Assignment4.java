package Assignment4;

public class Assignment4 {

    // Main method

    public static void main(String[] args) {

        // Array of Task 1
        int[] values = {9, -3, 5, 0, 1};
        sort(values);

        // Array of Task 2
        Assignment4 task2 = new Assignment4();
        System.out.println(task2.decimalToBinary(17));
        
        // Task 3
        int[] array = {1, 1, 2, 3, 11, 12, 13, 24, 38, 55};

        /* check all the validation for code is ok for task 3 */
        System.out.println("Array is :  [ 1, 1, 2, 3, 11, 12, 13, 24, 38, 55 ]");
        
        System.out.println(" find (array, -1) :" + find(array, -1));
        
        System.out.println(" find (array, 0) : " + find(array, 0));
        
        System.out.println(" find (array, 3) :" + find(array, 3));
    
        System.out.println(" find (array, 7) :" + find(array, 7));
       

        System.out.println();

       
        
     



    }

    // ///////////////////Task 1///////////////////////////

    public static void sort(int[] numbers) {

        if (numbers== null) {
            return;
        }
        if (numbers.length == 1) {
            return;
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            int min = i;

            for (int j = 0; j < numbers.length - i - 1; j++) {

                if (numbers[j + 1] < numbers[j]) {
                    int temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }

            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }


    ///////////////// Task 2///////////////////////

    public String decimalToBinary(int number) {

        String output = " ";

        while (number > 0) {

            int reminder = number % 2;

            output = reminder + output; 

            number = number / 2;
        }

        return output;
    }

    //////////////////////////Task : 3 ////////////////////////

    public static int find(int[] numbers, int numberToCheck) {

        int firstHalf = 0;
        int lastHalf = numbers.length - 1;

        while (firstHalf <lastHalf) {
        	
            int middle = (firstHalf + lastHalf) / 2;
            
          //when not found in the list
            if (numberToCheck < numbers[0]) {
                return -1;
            }

            if (numberToCheck < numbers[middle]) {
            	lastHalf = middle - 1;
            } else if (numberToCheck > numbers[middle]) {
            	firstHalf = middle + 1;
            } else {
                return middle;
            }
        }
        
        // negative index showing
        
        if (numberToCheck > numbers[firstHalf])
        	firstHalf +=  1;
        return -(firstHalf + 1);

    }

}

