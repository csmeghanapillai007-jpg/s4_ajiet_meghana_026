class Main {
    public static void main(String[] args) {

        int[] arr = {4, 3, 7, 2, 6, 1}

        int minRank = arr[0];
        int count = 0;

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] < minRank) {
                count++;
                minRank = arr[i];
            }
        }

        System.out.println(count);
    }
}
