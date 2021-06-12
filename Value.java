public class Value extends Object {
    public static Value VOID = new Value(new Object());

    final Object value;
    
    public Value(Object value) {
        this.value = value;
    }

    public Boolean asBoolean() {
        return (Boolean) value;
    }

    public Float asFloat() {
        return Float.valueOf(value.toString());
    }

    public Integer asInteger() {
        return Integer.valueOf(value.toString());
    }

    public String asString() {
        return String.valueOf(value);
    }

    public boolean isFloat() {
        return value instanceof Float;
    }

    public boolean isInteger() {
        return value instanceof Integer;
    }

    public boolean isString() {
        return value instanceof String;
    }

    public String getType() {
        if (this.isInteger()) {
            return "int";
        } else if (this.isFloat()) {
            return "float";
        } else if (this.isString()) {
            return "string";
        }

        return "null";
    }

    @Override
    public int hashCode() {

        if(value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object object) {

        if (value == object) {
            return true;
        }

        if (value == null || object == null || object.getClass() != this.getClass()) {
            return false;
        }

        Value that = (Value) object;

        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
