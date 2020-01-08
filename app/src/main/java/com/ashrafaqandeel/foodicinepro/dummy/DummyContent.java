package com.ashrafaqandeel.foodicinepro.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();


    static {
        // Add some sample items.
      addItem(new DummyItem("1","this is a test","the treatment will be according to the following steps \n" +
              "1- prevent eating refined sugre.\n" +
              "2- prevent eating wite flour.\n" +
              "1- prevent eating refined sugre.\n" +
              "2- prevent eating wite flour.\n" +
              "1- prevent eating refined sugre.\n" +
              "2- prevent eating wite flour.\n" +
              "1- prevent eating refined sugre.\n" +
              "2- prevent eating wite flour.\n" +
              "1- prevent eating refined sugre.\n" +
              "2- prevent eating wite flour.\n" +
              "1- prevent eating refined sugre.\n" +
              "2- prevent eating wite flour.\n" +
              "1- prevent eating refined sugre.\n" +
              "2- prevent eating wite flour.\n" +
              "1- prevent eating refined sugre.\n" +
              "2- prevent eating wite flour.\n" +
              "1- prevent eating refined sugre.\n" +
              "2- prevent eating wite flour.\n" +
              "1- prevent eating refined sugre.\n" +
              "2- prevent eating wite flour.\n" +
              "1- prevent eating refined sugre.\n" +
              "2- prevent eating wite flour.\n" +
              "1- prevent eating refined sugre.\n" +
              "2- prevent eating wite flour.\n" +
              "1- prevent eating refined sugre.\n" +
              "2- prevent eating wite flour.\n" +
              "1- prevent eating refined sugre.\n" +
              "2- prevent eating wite flour.\n" +
              "1- prevent eating refined sugre.\n" +
              "2- prevent eating wite flour.\n" +
              "99- prevent eating all types of Soda"));
        addItem(new DummyItem("2","treatment_2","treatment_2_details"));
        addItem(new DummyItem("3","treatment_3","treatment_3_details"));

    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }
    public static class DummyItem {
        public final String id;
        public final String treatment;
        public final String details;

        public DummyItem(String id, String treatment, String details) {
            this.id = id;
            this.treatment = treatment;
            this.details = details;
        }

        @Override
        public String toString() {
            return treatment;
        }
    }
}
