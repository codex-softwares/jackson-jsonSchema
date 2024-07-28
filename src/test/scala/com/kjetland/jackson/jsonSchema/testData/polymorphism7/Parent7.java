package com.kjetland.jackson.jsonSchema.testData.polymorphism7;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.DEDUCTION
)
@JsonSubTypes({@JsonSubTypes.Type(Child71.class), @JsonSubTypes.Type(Child72.class)})
public abstract class Parent7 {

    public String parentString;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parent7 parent = (Parent7) o;

        return parentString != null ? parentString.equals(parent.parentString) : parent.parentString == null;

    }

    @Override
    public int hashCode() {
        return parentString != null ? parentString.hashCode() : 0;
    }
}
