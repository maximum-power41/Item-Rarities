package me.giulianomaxwell.mods.util;

import java.util.Set;

public interface PartitionedRangeInterface <T extends Number, E extends Range<T> & InnerRangeInterface<T>>{

    boolean addInnerRange(E innerRange);

    <R extends Range<T>> boolean isIntersectingInnerRange(R range);

    Set<E> getInnerRanges();
}
