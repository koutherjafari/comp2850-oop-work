// Task 5.2.2: conversion of marks into grades, using a function
fun grade(mark: Int) = when (mark) {
    in 0..39   -> "Fail"
    in 40..69  -> "Pass"
    in 70..100 -> "Distinction"
    else       -> "?"
}

fun main(args: Array<String>) {
    if (args.size != 0) {
        println("detected arguments")
        for (mark in args) {
            var result = grade(mark.toInt())
            println("$mark is a $result")
        }
    }
    else {
        println("invalid arguments")
    }
}