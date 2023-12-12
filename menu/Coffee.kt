package coffeeshop.menu

import coffeeshop.Cart
import coffeeshop.CashDesk
import coffeeshop.isNumeric
import kotlin.system.exitProcess

// 숫자 외 입력시 오류처리
fun String.isNumeric(): Boolean {
    return try {
        this.toInt()
        true
    } catch (e: Exception) {
        false
    }
}

class Coffee {
    fun coffOrder() {
        val cashDesk = CashDesk() // 주문조회

        println("어서오세요! 고객님.  |  현재 주문 대기 수는 [ 0 ] 명 입니다.")
        println(" ---------------------------------------------------------------------------------------------------")
        println("[ Coffee Menu ]  [Price]  [Menu description]")
        println(" ---------------------------------------------------------------------------------------------------")
        println("1. 아메리카노       5,000  진하게 로스팅한 커피 원두의 풍미가 느껴지는 음료.\n" +
                "2. 카페라떼         6,000  에스프레소와 스팀밀크 위에 부드러운 우유 거품을 살짝 올려준 음료.\n" +
                "3. 카라멜마끼아또    8,000  스팀밀크 위에 에스프레소 샷을 넣고 카라멜 소스를 뿌린 음료.\n" +
                "4. 아인슈페너       7,000  진한 에스프레소에 폭신한 크림을 듬뿍 얹은 음료.\n" +
                "5. 에스프레소       6,000  쌉싸름한 맛을 느낄 수 있는 깊고 진한 풍미의 음료.\n")
        println(" ---------------------------------------------------------------------------------------------------")
        println(":: MENU :: a. 메인  |  b. 디카페인  |  c. 사이드 음료  |  d. 디저트 & 베이커리  |  9. 주문조회  |  0. 종료  ")
        println(" ---------------------------------------------------------------------------------------------------")

        while (true) {
            var cPick = readln() // 메뉴 고르기
            if (!cPick.isNumeric()) {
                println(" ---------------------------------------------------------------------------------------------------")
                println("                                  메뉴 입력은 숫자만 해주세요.")
                println(" ---------------------------------------------------------------------------------------------------")
                continue
            }

            when (cPick.toInt()) {
                1 -> {
                    val americano = Price("아메리카노", 5000, 1)
                    println(" ---------------------------------------------------------------------------------------------------")
                    println("                           선택하신 메뉴는 ${americano.menuName}, ${americano.menuPrice}원 입니다.")
                    println("                                 구입하실 갯수를 입력해 주세요.")
                    println(" ---------------------------------------------------------------------------------------------------")
                    var cPick = readln() // 갯수 선택
                    if (!cPick.isNumeric()) {
                        println(" ---------------------------------------------------------------------------------------------------")
                        println("                                  메뉴 입력은 숫자만 해주세요.")
                        println(" ---------------------------------------------------------------------------------------------------")
                        continue
                    }
                    
                    // 선택한 품목, 값, 합계, 잔액 표시
                    if (cPick.toInt() >= 1) {
                        val price = Price("아메리카노", 5000, 1 * cPick.toInt())
                            price.priceDisplayInfo()
                        continue
                    } else {
                        println(" ---------------------------------------------------------------------------------------------------")
                        println("                                   1보다 적은 갯수는 선택할 수 없습니다.")
                        println(" ---------------------------------------------------------------------------------------------------")
                        return
                    }

                }

                2 -> {
                    val latte = Price("카페라떼", 6000, 1)
                    println("선택하신 메뉴는 ${latte.menuName}, ${latte.menuPrice}원, ${latte.menuQuantity}개 입니다.")
                    return
                }

                3 -> {
                    val macchiato = Price("카라멜마끼아또", 8000, 1)
                    println("선택하신 메뉴는 ${macchiato.menuName}, ${macchiato.menuPrice}원, ${macchiato.menuQuantity}개 입니다.")
                    return
                }

                4 -> {
                    val affogato = Price("아인슈페너", 7000, 1)
                    println("선택하신 메뉴는 ${affogato.menuName}, ${affogato.menuPrice}원, ${affogato.menuQuantity}개 입니다.")
                    return
                }

                5 -> {
                    val espresso = Price("에스프레소", 6000, 1)
                    println("선택하신 메뉴는 ${espresso.menuName}, ${espresso.menuPrice}원, ${espresso.menuQuantity}개 입니다.")
                    return
                }

                9 -> cashDesk.orderList()

                0 -> exitProcess(0)

                else -> {
                    when (cPick) {
                        "a" -> {

                        }

                        "b" -> {

                        }

                        "c" -> {

                        }

                        "d" -> {

                        }

                        else -> {

                        }
                    }
                }
            }

        }

    }
}