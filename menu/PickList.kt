package coffeeshop.menu

data class PickList (
    val menuName: String,
    val menuPrice: Int,
    var menuQuantity: Int,
    val cash: Int = (50000 .. 100000).random()// 고객 잔액 랜덤설정
) {
    val pickList = arrayListOf<PickList>()

    fun addPrice(): Int = (menuPrice * menuQuantity) // 합계가격

    fun calctotal(): Array<Int> = arrayOf((cash - addPrice())) // 통장에서 빠져나간 돈


    fun addPickList(menuName: String, menuPrice: Int, menuQuantity: Int) {
        val pickListItem = PickList(menuName, menuPrice, menuQuantity)
        pickList.add(pickListItem)
    }

    fun priceDisplayInfo() {
        println("보유 금액 :: $cash 원  |  잔액 :: ${calctotal()[0]}")
        println(" ---------------------------------------------------------------------------------------------------")
        println("선택 메뉴 :: ${menuName}  |  ${menuPrice}원  |  ${menuQuantity}개  |  가격 합계: ${addPrice()} ")
        println(" ---------------------------------------------------------------------------------------------------")
    }
}
