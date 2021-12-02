package ch.unibe.playground;

import java.util.ArrayList;

public class ActivitySelector {
    public static void main(String[] args) {

    }

    public static void activitySelector(ArrayList<Activity> activities) {
        ArrayList<Activity> maxActivities = new ArrayList<>();

        Activity latestActivity = activities.get(0);
        maxActivities.add(latestActivity);

        for (Activity act: activities) {
            if (act.compareTo(latestActivity) < 0) {
                maxActivities.add(act);
                latestActivity = act;
            }
        }
    }
}


class Activity implements Comparable<Activity> {
    int startTime;
    int endTime;
    String name;

    public Activity(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public int compareTo(Activity o) {
        return this.endTime - o.endTime;
    }
}