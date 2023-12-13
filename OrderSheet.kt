package coffeeshop

import coffeeshop.menu.*
import kotlin.system.exitProcess

// 대기번호 부여하고 하나씩 줄이기
// 잔액을 바로 표시하지 말고 따로 받아놨다가 카트에 금액이랑 잔액 표시

class OrderSheet {
    fun totalMenu(shop: String) {
        val pickList = arrayListOf<PickList>()

        val cart = Cart()
        val coffees = Coffee() // 커피
        val decaf = Decaf() // 디카페인
        val drink = Drink() // 사이드 음료
        val desBakery = DesBakery() // 빵과 디저트
        val cashDesk = CashDesk() // 주문조회

        // 앞에서 누른 번호 여기서 받아 실행
        while (true) {
            when (shop.toInt()) {
                1 -> coffees.coffOrder(cart)
                2 -> decaf.decafOrder(cart)
                3 -> drink.drinkOrder(cart)
                4 -> desBakery.desbakOrder(cart)
                9 -> cashDesk.orderList(pickList)
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