package coffeeshop

import coffeeshop.menu.*
import kotlin.system.exitProcess

// displayinfo 는 계산화면에서 활용하면될듯?!
// 잠깐!! 대기번호는 현재주문고객 -1로 하면 되긴하겠는데 이걸 랜덤한 초수 경과마다 줄이려면어쩌지
// 커피메뉴 완성하고 알파벳 메뉴 완성하기
// 잔액을 바로 표시하지 말고 따로 받아놨다가 카트에 금액이랑 잔액 표시

class OrderSheet {
    fun totalMenu(shop: String) {
        val coffees = Coffee() // 커피
        val decaf = Decaf() // 디카페인
        val drink = Drink() // 사이드 음료
        val desBakery = DesBakery() // 빵과 디저트
        val cashDesk = CashDesk() // 주문조회

        // 앞에서 누른 번호 여기서 받아 실행
        while (true) {
            when (shop.toInt()) {
                1 -> coffees.coffOrder()
                2 -> decaf.decafOrder()
                3 -> drink.drinkOrder()
                4 -> desBakery.desbakOrder()
                9 -> cashDesk.orderList()
                0 -> exitProcess(0)

                else -> {
                    println(" ---------------------------------------------------------------------------------------------------")
                    println("                                         잘못된 입력입니다.")
                    println(" ---------------------------------------------------------------------------------------------------")
                    Thread.sleep(1000)
                    break
                }
            }
        }
    }
}