package me.giulianomaxwell.mods.util;

import java.util.Set;

public interface PartitionedRangeInterface <T extends Number>{

    boolean addInnerRange(InnerRangeInterface<T> innerRangeInterface);

    boolean isIntersectingInnerRange(InnerRangeInterface<T> innerRangeInterface);

    Set<InnerRangeInterface<T>> getInnerRanges();
}
