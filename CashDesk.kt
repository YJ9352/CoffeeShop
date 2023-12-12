package coffeeshop

import coffeeshop.menu.Price


class CashDesk {
    fun orderList() {
        val cartList = arrayListOf<Cart>()
        val priceList = arrayListOf<Price>()

//        for (i in 0 .. cartList.size) {
//            val item = cartList[i]
//
//            println("${item.cusNumber}/ ${item.cash} / ${item.Price}")
//        }

        for (i in 0 .. priceList.size) {
            val item = priceList[i]

            println("${item.menuName}/ ${item.menuPrice} / ${item.menuQuantity}")
        }

    }
}