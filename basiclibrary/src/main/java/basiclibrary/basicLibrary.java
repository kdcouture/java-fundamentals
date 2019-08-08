/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.HashSet;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class basicLibrary {
    public boolean someLibraryMethod() {
        return true;
    }

    // ----     Lab 3       ----
    // Maps
    public static String analyzeWeather(int[][] weatherData) {
        String retStr = "";
        int min = 9999;
        int max = -9999;
        HashSet<Integer> set = new HashSet();
        for(int i = 0; i < weatherData.length; i++) {
            for(int j = 0; j < weatherData[i].length; j++){
                set.add(weatherData[i][j]);
                if(weatherData[i][j] < min){
                    min = weatherData[i][j];
                }
                else if(weatherData[i][j] > max) {
                    max = weatherData[i][j];
                }
            }
        }
        retStr += "High: " + max;
        retStr += "\nLow: " + min + "\n";
        for(int k = min; k < max; k++){
            if(!set.contains(k)){
                retStr += "Never saw temperature: " + k + "\n";
            }
        }
        return retStr;
    }
    // Tally Votes
    public static String tallyVotes(List<String> votes) {
        String retStr = "";
        String currentVote = "";
        int max = -9999;
        Map<String, Integer> votedFor = new HashMap<String, Integer>();
        for(int i = 0; i < votes.size(); i++) {
            currentVote = votes.get(i);
            if(votedFor.putIfAbsent(currentVote,1) != null){
                // Already voted for before
                votedFor.put(currentVote, votedFor.get(currentVote)+1);
            }
        }
        for (Map.Entry mapElement : votedFor.entrySet()) {
            String key = (String) mapElement.getKey();
            int value = (int) mapElement.getValue();
            if(value > max){
                max = value;
                retStr = key;
            }
        }
        return retStr;
    }

    // ----     Lab 2       ----

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

    public static int[] lowestAvg(int[][] inArrs) {
        double minAvg = 9999;
        int[] minArr = new int[] {};
        double curAvg;
        if(inArrs.length == 0){
            return new int[]{};
        }
        for(int i = 0; i < inArrs.length; i++) {
            curAvg = calcAvg((inArrs[i]));
            if(curAvg <= minAvg) {
                minAvg = curAvg;
                minArr = inArrs[i];
            }
        }
        return minArr;
    } // End calcAvg
}
