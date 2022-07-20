package IntroToJava;
class Marathon {
    Marathon() {
    }

    public static int getMaxIndex(int[] nArray) {
        int n = Integer.MIN_VALUE;
        int n2 = -1;
        for (int i = 0; i < nArray.length; ++i) {
            if (nArray[i] <= n) continue;
            n = nArray[i];
            n2 = i;
        }
        return n2;
    }

    public static void main(String[] stringArray) {
        String[] stringArray2 = new String[]{"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] nArray = new int[]{341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};
        System.out.println("First place is " + stringArray2[Marathon.getMaxIndex(nArray)] + " at " + nArray[Marathon.getMaxIndex(nArray)] + " minutes");
        System.out.println("Second place is " + stringArray2[Marathon.getMaxIndex(nArray) - 1] + " at " + nArray[Marathon.getMaxIndex(nArray) - 1] + " minutes");
    }
}
