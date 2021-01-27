package me.giulianomaxwell.mods.util;

import java.util.Set;
import java.util.TreeSet;

public class PartitionedIntegerRange extends IntegerRange implements PartitionedRangeInterface<Integer, PartitionedIntegerRange.InnerIntegerRange> {

     private final Set<InnerIntegerRange> innerRanges;

    public PartitionedIntegerRange(Integer minimum, Integer maximum, NumberType minimumType, NumberType maximumType) {
        super(minimum, maximum, minimumType, maximumType);
        innerRanges = new TreeSet<>((range1, range2) -> {
            if (range1.getMinimum() < range2.getMinimum()) {
                return 1;
            } else if (range1.getMinimum().equals(range2.getMinimum())) {
                return 0;
            } else {
                return -1;
            }
        });
    }

    @Override
    public boolean addInnerRange(InnerIntegerRange innerRange) {
        if (!(isInRange(this.getMinimum()) && isInRange(this.getMaximum()))) return false;

        for (InnerIntegerRange range : innerRanges) {
            if (range.isIntersecting(innerRange)) return false;
        }


        return innerRanges.add(innerRange);
    }

    @Override
    public <R extends Range<Integer>> boolean isIntersectingInnerRange(R range) {
        return false;
    }

    @Override
    public Set<InnerIntegerRange> getInnerRanges() {
        return innerRanges;
    }


    public static class InnerIntegerRange extends IntegerRange implements InnerRangeInterface<Integer> {

        private final PartitionedRangeInterface<Integer, InnerIntegerRange> partitionedRange;

        public InnerIntegerRange(Integer minimum, Integer maximum, NumberType minimumType, NumberType maximumType, PartitionedRangeInterface<Integer, InnerIntegerRange> partitionedRange) {
            super(minimum, maximum, minimumType, maximumType);
            this.partitionedRange = partitionedRange;
        }

        @Override
        public PartitionedRangeInterface<Integer, InnerIntegerRange> getPartitionedRange() {
            return partitionedRange;
        }
    }
}
