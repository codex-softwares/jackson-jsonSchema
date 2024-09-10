package ch.codexs.jackson.jsonSchema.testData.polymorphism7;

public class Child72 extends Parent7 {

    public Integer child2int;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Child72 child2 = (Child72) o;

        return child2int != null ? child2int.equals(child2.child2int) : child2.child2int == null;

    }

    @Override
    public int hashCode() {
        return child2int != null ? child2int.hashCode() : 0;
    }
}
