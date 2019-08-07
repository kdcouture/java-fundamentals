/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

public class Lab2 {
    public boolean someLibraryMethod() {
        return true;
    }

    // Roll Function
    public static int[] roll(int n) {
        int[] rolls = new int[n];
        for(int i = 0; i < n; i ++) {
            rolls[i] = (int)Math.ceil(Math.random()*6);
        }
        return rolls;
    } // End Roll function

    // Duplicate check
    public static boolean containsDuplicates(int[] values) {
        int[] haveSeen = new int[values.length];
        int seenCounter = 0;
        for(int i = 0; i < values.length; i++) {
            if(dupHelper(haveSeen, seenCounter, values[i])){
                return true;
            }
            else{
                haveSeen[seenCounter] = values[i];
                seenCounter++;
            }
        }
        return false;
    }

    // Checks our seen array if any duplicates have been found.
    private static boolean dupHelper(int[] seen,int seenCounter, int checking) {
        for(int i = 0; i < seenCounter; i++) {
            if(seen[i] == checking){
                return true;
            }
        }
        return false;
    } // End Duplicate check

    // Calculating Avg
    public static double calcAvg(int[] inArr) {
        double avg = 0.0;
        for(int i = 0; i < inArr.length; i++) {
            avg+= inArr[i];
        }
        if(inArr.length > 0)
            avg /= inArr.length;
        return avg;
    }

    public static double lowestAvg(int[][] inArrs) {
        double minAvg = 9999;
        double curAvg;
        if(inArrs.length == 0){
            return -1;
        }
        for(int i = 0; i < inArrs.length; i++) {
            curAvg = calcAvg((inArrs[i]));
            if(curAvg <= minAvg) {
                minAvg = curAvg;
            }
        }
        return minAvg;
    }


}
