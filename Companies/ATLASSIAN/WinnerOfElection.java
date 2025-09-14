import java.util.Map;
import java.util.TreeMap;

class solution{
    // Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n) {
      TreeMap<String, Integer> map = new TreeMap();
      for(int i = 0 ; i < arr.length ; i++){
          map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
      }
      
      String winner = "";
      int maxVotes = 0;
      for(Map.Entry<String, Integer> entry : map.entrySet()){
          String name = entry.getKey();
          int value = entry.getValue();
          if(value > maxVotes ){
              maxVotes = value;
              winner = name;
          } 
      }
      
      return new String[]{winner, String.valueOf(maxVotes)};
    }
}
