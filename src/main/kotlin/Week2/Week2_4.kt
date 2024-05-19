package org.example.Week2

/**
 * 반복문
 */
fun main() {
    //내 이름을 10번 출력해요 (for)
    // 1부터 10까지 변화하는 i변수
    for(i in 1..10) {
        println("${i}번째: 내 이름은 참새")
    }

    //내 이름을 10번 출력해요 (while)
    var i = 0

    while(i < 10) {
        println("${i}번째: 내 이름은 참새")
        i++
    }

    //for와 while로 동일한 결과를 출력해요
    // for 문 예시
    println("for 문 예시:")
    for (i in 1..5) {
        println("현재 값은 $i 입니다.")
    }

    // while 문 예시
    println("\nwhile 문 예시:")
    var j = 0
    while (j < 5) {
        println("현재 값은 $j 입니다.")
        j++
    }

    //전화번호부에서 이름이 “참새”인 사람을 찾을때까지 한명씩 조회하고 비교해요
    var infos = arrayOf("꿩", "닭", "참새", "오목눈이", "공작새")

    for(info in infos) {

        if(info == "참새") {
            println("찾았다 참새!")
            break
        } else {
            continue
        }
    }

    //상자에서 사료를꺼내 고양이에게 10번 먹여줘요
    var catStatus = false
    println("고양이는 매우 배고픕니다..")
    println("사료를 10번 먹여주세요")


    // 고양이가 현재 배고프니까(false) 사료 배급가능
    if(catStatus == false) {
        for(idx in 0..9) {
            println("${idx}번째: 냠냠")
        }
    }

    // 사료를 10번 준 이후의 상태변화
    catStatus = true
    if(catStatus == true) {
        println("배부른 고양이입니다")
    }

}