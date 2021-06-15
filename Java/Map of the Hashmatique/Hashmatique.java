import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("In The End", "I tried so hard and got so far, But in the end it doesn't even matter");
        trackList.put("Astronaut In The Ocean", "What you know about rollin' down in the deep?");
        trackList.put("Believer", "First things first I'ma say all the words inside my head");
        trackList.put("Falling", "My last made me feel like I would never try again");

        String name = trackList.get("Believer");
        System.out.println(name);

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key + " : " + trackList.get(key));
        }
    }
    
}