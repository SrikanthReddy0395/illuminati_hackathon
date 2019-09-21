package com.arcesium.archetypewar.domain.com.arcesium.archetypewar.domain.utils;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.Duration;

import com.arcesium.archetypewar.domain.Slot;


public class SlotUtil {

    private static final int slotDurationMinutes = 30;

    public static List<Integer> getSlotIds(Slot slot) {
        DateTime date = slot.getStartTime();
        final DateTime dayStartTime = new DateTime(date.getYear(), date.getMonthOfYear(), date.getDayOfMonth(), 0, 0, 0, date.getZone());
        Duration duration = new Duration(dayStartTime, slot.getStartTime());
        List<Integer> res = new ArrayList<Integer>();
        res.add((int)duration.getStandardMinutes() / 30 + 1);
        duration = new Duration(dayStartTime, slot.getEndTime());
        res.add((int)duration.getStandardMinutes() / 30 + 1);
        return res;
    }
}
