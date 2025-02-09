package com.muhammedturgut.calculatorapp_mt

sealed class CalculatorOperation(val sybol:String) {
    object Add:CalculatorOperation("+")
    object Subtract:CalculatorOperation("-")
    object Multiply:CalculatorOperation("x")
    object Divide:CalculatorOperation("/")
}