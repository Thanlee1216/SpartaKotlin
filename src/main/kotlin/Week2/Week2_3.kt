package org.example.Week2

/**
 * 조건문
 */
fun main() {
    val number = 10

    // if 문 예시
    if (number > 0) {
        println("$number 는 양수입니다.")
    } else if (number < 0) {
        println("$number 는 음수입니다.")
    } else {
        println("$number 는 0 입니다.")
    }

    // when 문 예시
    val day = 3
    val dayString = when (day) {
        1 -> "월요일"
        2 -> "화요일"
        3 -> "수요일"
        4 -> "목요일"
        5 -> "금요일"
        6 -> "토요일"
        7 -> "일요일"
        else -> "잘못된 요일"
    }
    println("오늘은 $dayString 입니다.")


    //특정 이름을 가진 사람일때 축하메시지를 띄워줘요
    var eventName = "참새"
    var myName = "참새"

    if(myName == eventName) {
        println("환영합니다 ${myName}님! 이벤트에 당첨됐어요!")
    } else {
        println("환영합니다 ${myName}님!")
    }


    //티켓 100개가 전부 매진되면 더 이상 구매할 수 없다고 알림창을 띄워줘요의 예시입니다.

    var ticketCount = 0

    if(ticketCount > 0) {
        println("티켓을 구매했어요")
    } else {
        println("티켓이 모두 매진되었습니다")
    }

    //기말고사 평균점수를 구간별로 나눠서 A,B,C,D 등급을 매겨요 (고정값)
    var koreanScore1 = 88
    var englishScore1 = 92
    var mathScore1 = 99
    var average1 = (koreanScore1 + englishScore1 + mathScore1) / 3

    if(average1 >= 90) {
        println("당신의 등급은 A입니다")
    } else if(average1 >= 80) {
        println("당신의 등급은 B입니다")
    } else if(average1 >= 70) {
        println("당신의 등급은 C입니다")
    } else {
        println("당신의 등급은 F입니다")
    }

    //기말고사 평균점수를 구간별로 나눠서 A,B,C,D 등급을 매겨요 (입력값)
    var koreanScore2 = readLine()!!.toInt() // 국어점수 입력
    var englishScore2 = readLine()!!.toInt() // 영어점수 입력
    var mathScore2 = readLine()!!.toInt() // 수학점수 입력
    var average2 = (koreanScore2 + englishScore2 + mathScore2) / 3

    if(average2 >= 90) {
        println("당신의 등급은 A입니다")
    } else if(average2 >= 80) {
        println("당신의 등급은 B입니다")
    } else if(average2 >= 70) {
        println("당신의 등급은 C입니다")
    } else {
        println("당신의 등급은 F입니다")
    }

    //행운의 숫자를 뽑아서 운세를 알려줘요
    var todayNumber = readLine()!!.toInt()

    when(todayNumber) {
        1 -> {
            println("재물이 들어올것입니다")
        }
        2 -> {
            println("검정색을 조심하세요")
        }
        3 -> {
            println("지인과의 관계에 조심하세요")
        }
        else -> {
            println("물을 조심하십시오...")
        }
    }

}