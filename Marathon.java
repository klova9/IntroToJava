class Marathon {
    public static int getMaxIndex(int[] times) {
        int maxValue = Integer.MIN_VALUE;
        int maxIndex = -1;
        for(int i=0; i<times.length; i++)
        if (times[i] > maxValue) {
        maxValue = times[i];
        maxIndex = i;
        }
        return maxIndex;
}        public static void main (String[] arguments) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };
        System.out.println("First place is " + names[getMaxIndex(times)] + 
        " at " + times[getMaxIndex(times)] + " minutes");
        System.out.println("Second place is " + names[getMaxIndex(times)-1] + 
        " at " + times[getMaxIndex(times)-1] + " minutes");
} 
}