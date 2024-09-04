
fun main() {
    val amount = 30_000
    val isRegular = false
    val discountIfRegular = 0.01
    var discount: Int = 0
    if (1000<amount && amount<=10_000){
        discount = amount - 100
    } else if(amount>10_000) {
        discount = (amount*0.95).toInt()
    }

    if (isRegular == true){
        discount = (discount*(1-discountIfRegular)).toInt()
    }


    println ("Итоговая стоимость " + discount)
}
