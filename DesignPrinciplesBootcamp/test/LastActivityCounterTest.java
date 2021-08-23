import org.junit.Test;

import java.util.TreeMap;

public class LastActivityCounterTest {

    private static final Long MILLIS_PER_HOUR = 1000 * 3600L;
    private static final Long MILLIS_PER_DAY = MILLIS_PER_HOUR * 24;
    public TreeMap<Long,String> mapTimeToString = new TreeMap<>();


    @Test
    public void test(){

        mapTimeToString.put(MILLIS_PER_HOUR,"hour");
        mapTimeToString.put(MILLIS_PER_DAY,"day");
        LastActivityCounter lastActivityCounter = new LastActivityCounter(mapTimeToString);
        long twoDaysAgo = System.currentTimeMillis() - MILLIS_PER_HOUR * 2;
        String lastSeenTimeString = lastActivityCounter.getLastSeenTime(twoDaysAgo);
        System.out.println(lastSeenTimeString);

    }

}
