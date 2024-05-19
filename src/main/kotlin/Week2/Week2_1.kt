package org.example.Week2

/**
 * 자료형 & 변수 & 상수
 */

//fun main() {
//    //모니터에 간단한 정보를 출력해볼게요
//    println("안녕하세요")
//    println("나는 코틀린이 좋아요")
//    print("나는 코틀린으로 앱을 만들거예요")
//    println("고마워요!")
//    println("굿럭!")
//
//    //키보드에서 입력한 텍스트를 불러오는 실습을 해볼게요
//    val dataString = readLine()
//    println("나는 ${dataString }를 입력했어요!")
//
//    //키보드에서 입력한 숫자(정수)를 불러오는 실습을 해볼게요
//    val dataNumber = readLine()!!.toInt()
//    val sum = dataNumber + 3
//    println("입력은 ${dataNumber}인데 3을 더해서 ${sum }이예요!")
//}

/**
 * 자료형
 */
//fun main() {
//    // 예시 1: 정수형 변수
//    val myNumber: Int = 10
//    println("정수형 변수: $myNumber")
//
//    // 예시 2: 부동소수점 변수
//    val myFloat: Float = 3.14f
//    println("부동소수점 변수: $myFloat")
//
//    // 예시 3: 문자형 변수
//    val myChar: Char = 'A'
//    println("문자형 변수: $myChar")
//
//    // 예시 4: 문자열 변수
//    val myString: String = "Hello, Kotlin!"
//    println("문자열 변수: $myString")
//
//    // 예시 5: 논리형 변수
//    val myBoolean: Boolean = true
//    println("논리형 변수: $myBoolean")
//}

/**
 * 변수
 */
//fun main() {
//    //숫자를 나타내는 변수
//    // var num1:Int = 1
//    // var 변수이름:자료형(생략가능) = 값
//    // 값을 특정 자료형을 저장할 수 있는 변수이름에 대입한다
//    var num1 = 1
//    println("내 첫변수 num1 변수에는 ${num1}이 들어있어")
//
//    num1 = 5
//    println("변경한 변수 num1 변수에는 ${num1}이 들어있어")
//
//    //문자를 나타내는 변수
//    // var one1:Char = '김'
//    // var 변수이름:타입(생략가능) = 값
//    var one1 = '김'
//    println("내 첫변수 one1 변수에는 ${one1}이 들어있어")
//
//    one1 = '나' // one1변수에 들어있던 '김' 대신에 '나'를 대입
//    println("변경한 변수 one1 변수에는 ${one1}가 들어있어")
//
//    //문자열을 나타내는 변수
//    // var name:String = "참새"
//    var name = "참새"
//    println("새의 이름을 저장하는 name 변수에는 ${name}가 들어있어")
//
//    name = "조롱박이" // name변수에 들어있던 "참새" 대신에 "조롱박이"를 대입
//    println("변경한 변수 name에는 ${name}가 들어있어")
//}

/**
 * 상수
 */
fun main() {
    val num1 = 1
    println("내 첫변수 num1 변수에는 ${num1}이 들어있어")

    // Val cannot be reassigned 에러 발생!!
    // num1은 var이 아니라 val이기때문에 들어있는 값을 변경하지 못함
    //num1 = 5

    println("변경한 변수 num1 변수에는 ${num1}이 들어있어")
}