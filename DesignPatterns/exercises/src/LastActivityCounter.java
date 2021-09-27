import java.util.Map;
import java.util.TreeMap;

public class LastActivityCounter {

    public TreeMap<Long, String> mapTimeToString = new TreeMap<>();

    public LastActivityCounter(TreeMap<Long, String> mapTimeToString) {
        this.mapTimeToString = mapTimeToString;
    }

    public String getLastSeenTime(long lastSeen) {
        lastSeen = System.currentTimeMillis() - lastSeen;
        Map.Entry<Long, String> longStringEntry = mapTimeToString.floorEntry(lastSeen);
        long l = lastSeen / longStringEntry.getKey();
        return l + "" + longStringEntry.getValue();
    }

}
