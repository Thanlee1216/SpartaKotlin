package org.example.Week2

/**
 * 연산자
 */
//fun main() {
//    var num1 = 30
//    var num2 = 10
//
//    // 덧셈 연산자(+)사용해서 num1과 num2를 더한후에 plusResult에 대입함
//    var plusResult = num1 + num2
//    println("num1 + num2는 ${plusResult}이야")
//
//    // 뺄셈 연산자(-)사용해서 num1에서 num2를 뺀후에 minusResult에 대입함
//    var minusResult = num1 - num2
//    println("num1 - num2는 ${minusResult}이야")
//
//    // 곱셈 연산자(*)사용해서 num1과 num2를 곱한후에 multipleResult에 대입함
//    var multipleResult = num1 * num2
//    println("num1 * num2는 ${multipleResult}이야")
//
//    // 나눗셈 연산자(/)사용해서 num1에서 num2를 나눈후에 divideResult에 대입함
//    var divideResult = num1 / num2
//    println("num1 / num2는 ${divideResult}이야")
//
//    // num2를 10에서 7로 변경
//    num2 = 7
//
//    // 나머지 연산자(%)사용해서 num1에서 num2를 나눈 나머지를 modResult에 대입함
//    var modResult = num1 % num2
//    println("num1 % num2는 정수로 ${modResult}야")
//}

/**
 * 대입 연산자
 */
//fun main() {
//    // = 기준으로
//    // 오른쪽: "참새"
//    // 왼쪽의 이름: name
//    // 즉, "참새"를 name변수에 대입한다라고 읽을 수 있음
//    var name = "참새"
//    println("내 이름은 ${name}")
//
//    // = 기준으로
//    // 오른쪽: 10
//    // 왼쪽의 이름: age
//    // 즉, 10을 age변수에 대입한다라고 읽을 수 있음
//    val age = 10
//    println("내 나이는 ${age}")
//}

/**
 * 산술 연산자와 대입 연산자를 함께 사용
 */
//fun main() {
//    var num1 = 30
//    var num2 = 10
//
//    // 산술연산자와 대입연산자를 따로 사용
//    // num1의 값을 10 증가시켜서 40을 만들고 싶다면?
//    num1 = num1 + 10
//    println("산술, 대입 따로 적용한 결과 ${num1}")
//
//    // 복합대입연산자를 사용
//    // num2의 값을 10 증가시켜서 20을 만들고 싶다면?
//    num2 += 10
//    println("산술, 대입 따로 적용한 결과 ${num2}")
//
//    // 뺄셈, 곱셈, 나눗셈, 나머지연산도 동일하게 사용가능해요
//    // 뺄셈: a-=b
//    // 곱셈: a*=b
//    // 나눗셈: a/=b
//    // 나머지: a%=b
//}

/**
 * 증감 연산자
 */
//fun main() {
//    var num1 = 30
//    var num2 = 10
//
//    // num1의 값을 1 증가시키고 싶다면?
//
//    // 1) 산술연산자, 대입연산자 따로 사용
//    num1 = num1 + 1
//    println("(num1_1): 산술,대입 연산자 따로 사용해서 1증가 ${num1}")
//
//    // 2) 복합대입연산자 사용
//    num1 += 1
//    println("(num1_2): 복합대입연산자 사용해서 1증가 ${num1}")
//
//    // 3) 증감 연산자
//    num1++
//    println("(num1_3): 증가연산자 사용해서 1증가 ${num1}")
//
//    println("====================================================")
//
//    // num2의 값을 1 감소시키고 싶다면?
//
//    // 1) 산술연산자, 대입연산자 따로 사용
//    num2 = num2 - 1
//    println("(num2_1): 산술,대입 연산자 따로 사용해서 1감소 ${num2}")
//
//    // 2) 복합대입연산자 사용
//    num2 -= 1
//    println("(num2_2): 복합대입연산자 사용해서 1감소 ${num2}")
//
//    // 3) 증감 연산자
//    num2--
//    println("(num2_3): 증가연산자 사용해서 1감소 ${num2}")
//}

/**
 * 증감 연산자2(전위, 후위)
 */
//fun main() {
//    var num1 = 10
//    var num2 = 20
//    var num3 = 30
//
//    // 후위연산자는 println연산을 실행후에 증감해요
//    println(num1++)
//    println(num1)
//
//    // 전위연산자는 println연산 실행전에 증감해요
//    println(++num2)
//    println(num2)
//
//    num3++
//    println(num3)
//
//    ++num3
//    println(num3)
//}

/**
 * 로직 연산자
 */
fun main() {
    // 수학은 94점
    var mathScore = 94

    // 수학점수가 90점 초과인지 판단
    var isMathHighRank = mathScore > 90

    // 90점 초과라면 true (참)
    // 90점 이하라면 false (거짓)
    println("내 수학점수는 고등급이 맞나요? ${isMathHighRank}")

    // 영어는 60점
    var englishScore = 60

    // 국어점수가 60점 이상인지 판단
    var isEnglishMiddleRank = englishScore >= 60

    // 60점 이상이라면 true (참)
    // 60점 미만이라면 false (거짓)
    println("내 영어점수는 턱걸이로 중위권이 맞나요? ${isEnglishMiddleRank}")

    var baseAge = 20
    var myAge = 20
    var teacherAge = 50
    var babyAge = 7

    var isMyAgePass = myAge == baseAge
    var isTeacherAgePass = teacherAge == baseAge
    var isBabyAgeNoPass = babyAge != baseAge

    println("어서오세요~")
    println("이번 이벤트는 ${baseAge}살만 참여할 수 있습니다!")

    println("================신분증 검사중================")

    println("내 나이는 ${myAge}니까 ${isMyAgePass}다!")
    println("선생님 연세는 ${teacherAge}니까 ${isTeacherAgePass}네요.. 미안해요!")
    println("${babyAge}살은 참여할수 없는게 맞아요! ${isBabyAgeNoPass}")
}