package coffeeshop.menu

import kotlin.system.exitProcess

class Drink {
    fun drinkOrder() {
        println("어서오세요! 고객님.                                                   현재 주문 대기 수는 [ 0 ] 명 입니다.")
        println(" ---------------------------------------------------------------------------------------------------")
        println("[ Coffee Menu ]  [Price]  [Menu description]")
        println(" ---------------------------------------------------------------------------------------------------")
        println("1. 레몬 셔벗에이드   6,000  생라임, 민트 잎이 어우러져 시원하고 청량하게 즐길 수 있는 에이드.\n" +
                "2. 밀크티 쉐이크     7,000  얼그레이 향이 감도는 블랙 티와 진한 소프트 아이스크림이 어우러진 디저트 음료.\n" +
                "3. 오렌지 자몽 주스  6,000  오렌지와 자몽의 상큼한 맛이 입안 가득 느껴지는 주스.\n" +
                "4. 수박 주스        5,000  수박을 통째로 갈아 넣어 만든 시원한 수박 주스.\n" +
                "5. 초콜릿 라떼      6,000  초콜릿의 풍부한 맛과 휘핑크림, 초코칩이 조화로운 달콤한 초콜릿 음료.\n")
        println(" ---------------------------------------------------------------------------------------------------")
        println(":: MENU :: a. 메인  |  b. 디카페인  |  c. 메인  |  d. 디저트 & 베이커리  |  9. 주문조회  |  0. 종료  ")
        println(" ---------------------------------------------------------------------------------------------------")
        exitProcess(0)
    }
}