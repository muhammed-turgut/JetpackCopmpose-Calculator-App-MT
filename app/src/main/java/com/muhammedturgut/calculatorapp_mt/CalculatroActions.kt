package com.muhammedturgut.calculatorapp_mt

sealed  class CalculatroActions {
    data class Number(val number:Int):CalculatroActions()
    object clear:CalculatroActions()
    object  Delete:CalculatroActions()
    object  Decimal:CalculatroActions()
    object  Calculate:CalculatroActions()
    data class Opertion(val operation: CalculatorOperation):CalculatroActions()

}