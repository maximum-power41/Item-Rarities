package me.giulianomaxwell.mods.util;

public abstract class Range<T extends Number> {

    private T minimum;
    private T maximum;
    private NumberType minimumType;
    private NumberType maximumType;

    public Range(T minimum, T maximum, NumberType minimumType, NumberType maximumType) {
        this.minimum = minimum;
        this.maximum = maximum;
        this.minimumType = minimumType;
        this.maximumType = maximumType;
    }

    public T getMinimum() {
        return minimum;
    }

    public void setMinimum(T minimum, NumberType type) {
        this.minimum = minimum;
        this.minimumType = type;
    }

    @Override
    public abstract boolean equals(Object obj);

    public T getMaximum() {
        return maximum;
    }

    public void setMaximum(T maximum, NumberType type) {
        this.maximum = maximum;
        this.maximumType = type;
    }

    public NumberType getMinimumType() {
        return minimumType;
    }

    public NumberType getMaximumType() {
        return maximumType;
    }

    public abstract boolean isInRange(T value);

    public abstract boolean isIntersecting(Range<T> range);

    public enum NumberType {
        INCLUSIVE,
        EXCLUSIVE
    }
}
