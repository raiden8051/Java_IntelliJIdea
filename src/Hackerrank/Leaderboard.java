package Hackerrank;
import java.io.*;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class SolutionLeader {

    public static void climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here

        List<Integer> newList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for(Integer val:ranked)
            if(!newList.contains(val))
                newList.add(val);

        int rank = newList.size()-1;
        for(int i=0;i<player.size();i++){
            int p = player.get(i);

            if(newList.get(rank)<=p){
                result.add(rank+1);
            }
            else if(rank==newList.size()-1)
                result.add(newList.size()+1);
        }
        System.out.println(result);
    }
}

public class Leaderboard {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        SolutionLeader.climbingLeaderboard(ranked, player);
    }
}
