package coffeeshop

import coffeeshop.menu.PickList

class CashDesk {
    fun orderList(pickList: List<PickList>) { //받아주기
        val sortedArray = pickList.sortedBy { item -> item.menuName }
        for (i in sortedArray.indices) {
            val item = sortedArray[i]
            println("${i + 1} / ${item.menuName} / ${item.menuPrice} / ${item.menuQuantity} / ")
        }
    }

}