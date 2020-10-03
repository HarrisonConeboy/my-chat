package com.mindlinksoft.recruitment.mychat.filters;

import com.mindlinksoft.recruitment.mychat.models.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ActivityFilter {
    
    public void produceReport(Conversation convo) {
        HashMap<String, Integer> counterMap = new HashMap<String, Integer>();
        for (Message message : convo.messages) {
            String sender = message.getSender();
            if (counterMap.containsKey(sender)) {
                counterMap.put(sender, counterMap.get(sender) + 1);
            } else {
                counterMap.put(sender, 1);
            }
        }

        List<Activity> activity = new ArrayList<Activity>();
        for (String sender : counterMap.keySet()) {
            Activity tempActivity = new Activity(sender, counterMap.get(sender));
            activity.add(tempActivity);
        }

        convo.addReport(activity);

    }

}
