public class LinearSearchExample {
    public static void main(String[] args) {
        int index = linearSearch(new int[] { 89, 57, 91, 47, 95, 3, 27, 22, 67, 99 }, 67);
        print(67, index);
    }

    static int linearSearch(int arr[], int elementToSearch) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == elementToSearch)
                return index;
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
