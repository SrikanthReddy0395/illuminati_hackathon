package com.arcesium.archetypewar.utils;

import com.arcesium.archetypewar.domain.Slot;
import org.joda.time.Duration;

import java.util.List;


public class SlotUtil {

    public static List<Integer> getSlotIds(Slot slot) {

        Duration duration = new Duration(slot.getStartTime(), slot.getEndTime());
        final long standardHours = duration.getStandardHours();

        return null;
    }
}
