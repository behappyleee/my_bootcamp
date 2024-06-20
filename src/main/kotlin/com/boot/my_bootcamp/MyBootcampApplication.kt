package com.boot.my_bootcamp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyBootcampApplication

fun main(args: Array<String>) {
    runApplication<MyBootcampApplication>(*args)
}
