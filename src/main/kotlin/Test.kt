import java.awt.geom.Arc2D
import java.util.Scanner

fun main(){
    println("task 1 : ${task1()}")
    println("task 2 : ${task2()}")
    println("task 3 : ${task3()}")
    println("task 4 : ${task4()}")
    println("task 5 : ${task5()}")
    println("task 6 : ${task6()}")
    println("task 7 : ${task7()}")
    println("task 8 : ${task8()}")
    println("task 9 : ${task9()}")
    println("task 10 : ${task10()}")
}

fun task1():Int{
    //1.1278217 ədədində 78 ədədini mod və div əməliyyatlarından istifadə edərək ekrana cixardin
    var num = 1278217
    var getDigit = (num/1000)%100
    return getDigit
}
fun task2():Int{
   // 2.1278217 ədədində 2782 ədədini mod və div əməliyyatlarından istifadə edərək ekrana cixardin
    var num = 1278217
    var getDigit = (num/100)%10000
    return getDigit
}
fun task3():Int{
//    3.238545 ədədində 8 ədədini mod və div əməliyyatlarından istifadə edərək ekrana cixardin
    var num = 238545
    var getDigit = (num/1000)%10
    return getDigit
}
fun task4():Int{
    // 4.238545 ədədində 23 ədədini mod və div əməliyyatlarından istifadə edərək ekrana cixardin
    var num = 238545
    var getDigit = (num/10000)
    return getDigit
}
fun task5():Int{
   // 5.238545 ədədində hər bir ədədi mod və div əməliyyatlarından istifadə edərək tapin və onlarin cemini tapin.(Numune:2+3+8+5+4+5)
    var num = 238545
    var getDigit1 = num%10
    var getDigit2 = (num/10)%10
    var getDigit3 = (num/100)%10
    var getDigit4 = (num/1000)%10
    var getDigit5 = (num/10000)%10
    var getDigit6 = (num/100000)%10
    var sum = getDigit1 + getDigit2 +getDigit3 +getDigit4 + getDigit5 +getDigit6
    return sum
}

fun task6():Int{
    // 6.238545 ədədində ədədləri iki-iki mod və div əməliyyatlarından istifadə edərək tapin və onlarin cemini tapin.(Numune:23+85+45)
    var num = 238545
    var getDigits1 = num%100
    var getDigits2 = (num/100)%100
    var getDigits3 = (num/10000)%100
    return getDigits1 + getDigits2 +getDigits3
}

fun task7():Int{
    // 7.3423432 ədədində son iki və ilk ədədi mod və div əməliyyatlarından istifadə edərək tapin və onlarin cemini tapin.(Numune:34+32)
    var num = 3423432
    var getDigits1 = num%100
    var getDigits2 = (num/100000)%100
    return getDigits1 + getDigits2
}

fun task8():Int{
    // 8.3423432 ədədində 343 ədədini mod və div əməliyyatlarından istifadə edərək ekrana cixardin.
    var num = 3423432
    var getDigits = (num/10)%1000
    return getDigits
}

fun task9():Int{
//9.9423435 ədədində ilk və son ədədi mod və div əməliyyatlarından istifadə edərək tapın və onlarin cemini ekrana cixardin (Numune:9+5)
    var num = 9423435
    var getDigit1 = (num/1000000)%10
    var getDigit2 = num%10
    return getDigit1+getDigit2
}

fun task10():Float{
//9.10.9423435 ədədində hər bir ədədi mod və div əməliyyatlarından istifadə edərək tapin və onlarin ədədi ortasını tapin.
    var num = 9423435
    var getDigit1 = num%10
    var getDigit2 = (num/10)%10
    var getDigit3 = (num/100)%10
    var getDigit4 = (num/1000)%10
    var getDigit5 = (num/10000)%10
    var getDigit6 = (num/100000)%10
    var getDigit7 = (num/1000000)%10

    val average = (getDigit1 + getDigit2 + getDigit3 + getDigit4 + getDigit5 + getDigit6 + getDigit7)/7f
    return average

}
