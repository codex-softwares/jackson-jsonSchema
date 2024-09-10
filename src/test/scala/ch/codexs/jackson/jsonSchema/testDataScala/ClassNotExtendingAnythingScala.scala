package ch.codexs.jackson.jsonSchema.testDataScala

import ch.codexs.jackson.jsonSchema.testData.MyEnum

case class ClassNotExtendingAnythingScala(someString:String, myEnum: MyEnum, myEnumO: Option[MyEnum])
