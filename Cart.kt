package coffeeshop

import coffeeshop.menu.Price

data class Cart (
    val cusNumber: Int,
    val cash: Int,
    val price: Price,
) {
    fun displayInfo() {

        println("고객 번호: $cusNumber")
        println("보유 금액: $cash 원")
        println("장바구니 메뉴: ${price.menuName}, ${price.menuPrice}원, ${price.menuQuantity}개")
    }
}