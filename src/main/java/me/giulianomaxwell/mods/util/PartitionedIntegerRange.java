package me.giulianomaxwell.mods.util;

import java.util.Set;

public class PartitionedIntegerRange extends IntegerRange implements PartitionedRangeInterface<Integer> {

    public PartitionedIntegerRange(Integer minimum, Integer maximum, NumberType minimumType, NumberType maximumType) {
        super(minimum, maximum, minimumType, maximumType);
    }

    @Override
    public boolean addInnerRange(InnerRangeInterface<Integer> innerRangeInterface) {
        return false;
    }

    @Override
    public boolean isIntersectingInnerRange(InnerRangeInterface<Integer> innerRangeInterface) {
        return false;
    }

    @Override
    public Set<InnerRangeInterface<Integer>> getInnerRanges() {
        return null;
    }

    public static class InnerIntegerRange extends IntegerRange implements InnerRangeInterface<Integer> {

        public InnerIntegerRange(Integer minimum, Integer maximum, NumberType minimumType, NumberType maximumType) {
            super(minimum, maximum, minimumType, maximumType);
        }

        @Override
        public PartitionedRangeInterface<Integer> getPartitionedRange() {
            return null;
        }
    }
}
