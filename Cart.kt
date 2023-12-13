package coffeeshop

import coffeeshop.menu.PickList

data class Cart(
    val pickLists: MutableList<PickList> = mutableListOf()
) {
    fun addPickList(pickList: PickList) {
        pickLists.add(pickList)
    }

}