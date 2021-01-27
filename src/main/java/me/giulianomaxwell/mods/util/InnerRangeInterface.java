package me.giulianomaxwell.mods.util;

public interface InnerRangeInterface<T extends Number>{

    PartitionedRangeInterface<T, ?> getPartitionedRange();
}
