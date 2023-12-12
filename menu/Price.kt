package coffeeshop.menu

data class Price (
    val menuName: String,
    val menuPrice: Int,
    var menuQuantity: Int,
) {
    val ranMoney = (50000 .. 100000).random() // 고객 잔액 랜덤설정

    fun addPrice(): Int = (menuPrice * menuQuantity)

    fun calctotal(): Int = (ranMoney - addPrice())

    fun priceDisplayInfo() {
        println(" ---------------------------------------------------------------------------------------------------")
        println("선택 메뉴 :: ${menuName}  |  ${menuPrice}원  |  ${menuQuantity}개 ")
        println("보유 금액 :: ${ranMoney} 원  |  가격 합계: ${addPrice()}  |  잔액: ${calctotal()}")
        println(" ---------------------------------------------------------------------------------------------------")
    }
}
