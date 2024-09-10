package ch.codexs.jackson.jsonSchema.testData;

import ch.codexs.jackson.jsonSchema.annotations.JsonSchemaInject;
import ch.codexs.jackson.jsonSchema.annotations.JsonSchemaInject;

@JsonSchemaInject(json = "{\"JsonSchemaInjectOnEnum\":true}")
public enum MyEnum {
    E,B,A,D,C
}
