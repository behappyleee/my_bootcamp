package com.boot.kotlin.addison.test

class KoltinTypeInferred {

}

interface AnimalParents

interface TestInterfaceKotlin {

    fun interfaceTest()

    fun interfaceTest2()
}

open class AnimalParentsClass(): AnimalParents{}

open class AnimalChild1(): AnimalParentsClass(), AnimalParents {}

class InterfaceImpl: AnimalParents

class AnimalChild2(): AnimalChild1() {}

fun main() {

    val list1 = listOf(1, 2, 3, 4, 5)
    val intInList = list1.getOrElse(index = 6) {
        127
    }
    println(intInList)


    var typeInf1 = AnimalChild1()
//    typeInf1 = AnimalParentsClass() // type 을 명시하지 않았을 시 오른쪽 피 연산자 객체 타입으로만 생성이 가능 !
    typeInf1 = AnimalChild1()

    var typeInf2: AnimalParents = AnimalChild1()
    typeInf2 = InterfaceImpl() // Type 을 명시 해주어야 부모 클래스로 선언이 가능 !

    val aaInter = InterfaceImpl()
}
