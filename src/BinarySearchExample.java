public class BinarySearchExample {
    public static void main(String[] args) {
        int index = 0;

        // Iterative
        index = iterativeBinarySearch(new int[] { 89, 57, 91, 47, 95, 3, 27, 22, 67, 99 }, 67);
        print(67, index);

        System.out.println("===========================================");

        // Recursive
        index = recursiveBinarySearch(new int[] { 3, 22, 27, 47, 57, 67, 89, 91, 95, 99 }, 0, 9, 67);
        print(67, index);
    }

    static int iterativeBinarySearch(int[] arr, int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            System.out.println(
                    "firstIndex: " + firstIndex + ", middleIndex: " + middleIndex + ", lastIndex: " + lastIndex);

            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            } else if (arr[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            } else if (arr[middleIndex] > elementToSearch) {
                lastIndex = middleIndex - 1;
            }
        }

        return -1;
    }

    static int recursiveBinarySearch(int arr[], int firstElement, int lastElement, int elementToSearch) {
        // termination condition
        if (lastElement >= firstElement) {
            System.out.println("firstElement: " + firstElement + ", lastElement: " + lastElement);
            int mid = firstElement + (lastElement - firstElement) / 2;
            System.out.println("mid: " + mid);

            // if the middle element is our goal element, return its index
            if (arr[mid] == elementToSearch)
                return mid;

            // if the middle element is bigger than the goal element
            // recursively call the method with narrowed data
            if (arr[mid] > elementToSearch)
                return recursiveBinarySearch(arr, firstElement, mid - 1, elementToSearch);

            // else, recursively call the method with narrowed data
            return recursiveBinarySearch(arr, mid + 1, lastElement, elementToSearch);
        }

        return -1;
    }

    static void print(int elementToSearch, int index) {
        if (index == -1) {
            System.out.println(elementToSearch + " not found.");
        } else {
            System.out.println(elementToSearch + " found at index: " + index);
        }
    }
}
