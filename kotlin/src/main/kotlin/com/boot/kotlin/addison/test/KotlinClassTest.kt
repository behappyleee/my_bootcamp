package com.boot.kotlin.addison.test

class KotlinClassTest {

}

class BankAccount {
    var balance = 0.0
        private set

    fun deposit(depositAmount: Double) {
        balance += depositAmount
    }

    @Throws(InsufficientFunds::class)
    fun withdraw(withdrawAmount: Double) {
        if (balance < withdrawAmount) {
            throw InsufficientFunds()
        }
        balance -= withdrawAmount
    }
}

class InsufficientFunds : Exception()

class PersonClass {
    var name: String = ""
        get() = "PERSONE NAME $field"

        set(value) {
            field = "PERSON SET NAME VALUE : $value"
        }
}

interface OverrideTest {
    var testNum: Int;
    val testNum2: Int;
}

class ChildClass: OverrideTest {
    override var testNum: Int = 3
        get() {
            return field + 2
        }
        set(value) {
            field += 777
        }

    override var testNum2: Int = 7
}

data class UserTest(val userName: String, val surnName: String) {}

fun main() {
    val li1 = listOf(1, 2, 3, 4, 5, 6, 7)
    println(li1.size)
    li1.first()
    println(li1.size)

    val us1 = UserTest(userName = "USER1", surnName = "USER2")
    println(us1.toString())

    val us2 = us1.copy("USER3")
    println(us2.toString())

    val pe1 = PersonClass()
    pe1.name = "SS TEST"
    pe1.name = "GIVE NAME"
    println(pe1.name)

    val account = BankAccount()

    println(account.balance) // 0.0
    account.deposit(100.0)
    println(account.balance) // 100.0
    account.deposit(50.0)
    println(account.balance) // 50.0
}
