package me.giulianomaxwell.mods.util;

public class IntegerRange extends Range<Integer> {

    public IntegerRange(Integer minimum, Integer maximum, NumberType minimumType, NumberType maximumType) {
        super(minimum, maximum, minimumType, maximumType);
    }

    @Override
    public boolean isInRange(Integer value) {
        boolean passesMinCheck;
        boolean passesMaxCheck;
        if (getMinimumType().equals(NumberType.INCLUSIVE)) {
            passesMinCheck = getMinimum() <= value;
        } else {
            passesMinCheck = getMinimum() < value;
        }

        if (getMaximumType().equals(NumberType.INCLUSIVE)) {
            passesMaxCheck = getMaximum() >= value;
        } else {
            passesMaxCheck = getMaximum() > value;
        }

        return passesMinCheck && passesMaxCheck;
    }

    @Override
    public boolean isIntersecting(Range<Integer> range) {
        int minRange = range.getMinimum();
        int maxRange = range.getMaximum();

        boolean isMinIntersecting = isInRange(minRange);
        boolean isMaxIntersecting = isInRange(maxRange);

        return isMaxIntersecting || isMinIntersecting;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof IntegerRange)) return false;
        IntegerRange integerRange = (IntegerRange) obj;
        return integerRange.getMinimum().equals(getMinimum()) && integerRange.getMaximum().equals(getMaximum()) && integerRange.getMinimumType().equals(getMinimumType()) && integerRange.getMaximumType().equals(getMaximumType());
    }
}
