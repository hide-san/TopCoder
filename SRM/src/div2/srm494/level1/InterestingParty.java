package div2.srm494.level1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hideo on 14/09/28.
 */
public class InterestingParty {
    public int bestInvitation(String[] first, String[] second){
        int invitationCount = 0;

        Map<String, Integer> hm = new HashMap<String, Integer>();
        countTopic(first, hm);
        countTopic(second, hm);

        for(String key: hm.keySet()){
            if (invitationCount < hm.get(key)) {
                invitationCount = hm.get(key);
            }
        }

        return invitationCount;
    }

    private void countTopic(String[] topics, Map<String, Integer> hm) {
        for (String topic : topics) {
            if (!hm.containsKey(topic)) {
                hm.put(topic, 0);
            }
            hm.put(topic, hm.get(topic) + 1);
        }
    }
}
