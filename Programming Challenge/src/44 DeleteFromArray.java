// import java.util.Scanner;

// class DeleteFromArray {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Welcome to Array Deletion\n");
//         int[] numArr = ArrayUtility.inputArray();
//         System.out.print("Now, enter then number you want to delete: ");
//         int numToDelete = input.nextInt();
//         int[] newArr = deleteNumber(numArr, numToDelete);
//         System.out.println("Here is your new array");
//         ArrayUtility.displayArray(newArr);
//     }

//     public static int[] deleteNumber(int[] numArr, int numToDelete) {
//         int occ = OccurrencesArray.noOfOccurrences(numArr, numToDelete);
//         if (occ == 0) {
//             return numArr;
//         }
//         int newSize = numArr.length - occ;
//         int[] newArr = new int[newSize];

//         int i = 0, j = 0;
//         while (i < numArr.length) {
//             if (numArr[i] != numToDelete) {
//                 newArr[j] = numArr[i];
//                 j++;
//             }
//             i++;
//         }

//         return newArr;
//     }
// }


import java.util.Scanner;

class DeleteArrayElementComplete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Array Element Deletion Program ===\n");

        // Input array
        int[] numArr = inputArray();

        // Display original array
        System.out.print("Original array: ");
        displayArray(numArr);

        // Input number to delete
        System.out.print("\nEnter the number you want to delete: ");
        int numToDelete = input.nextInt();

        // Delete the number
        int[] newArr = deleteNumber(numArr, numToDelete);

        // Display result
        if (newArr.length == numArr.length) {
            System.out.println("\nNumber " + numToDelete + " not found in array!");
        } else {
            System.out.println("\nArray after deletion:");
            displayArray(newArr);
            System.out.println("Deleted " + countOccurrences(numArr, numToDelete) + " occurrence(s) of " + numToDelete);
        }

        input.close();
    }

    // Method to input array from user
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        return arr;
    }

    // Method to display array
    public static void displayArray(int[] arr) {
        if (arr.length == 0) {
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Method to count occurrences of a number
    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    // Method to delete all occurrences of a number
    public static int[] deleteNumber(int[] numArr, int numToDelete) {
        int occurrences = countOccurrences(numArr, numToDelete);

        if (occurrences == 0) {
            return numArr.clone(); // Return copy if number not found
        }

        int newSize = numArr.length - occurrences;
        int[] newArr = new int[newSize];

        int index = 0;
        for (int num : numArr) {
            if (num != numToDelete) {
                newArr[index++] = num;
            }
        }

        return newArr;
    }
}







