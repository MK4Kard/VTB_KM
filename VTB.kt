fun main() {
    try {
        /*var creditCard = Credit(100000.0, 30.0, 10)
        creditCard.Month()
        println("Информация о кредите")
        creditCard.Info()
        println()
        println("Оформлять кредит?")
        creditCard.Reg(readln()!!.toBoolean())
        println()*/

        /*var investor = Invest(25000.0, 0.15)
        print("Будущая стоимость инвестиций через ")
        var year = readln()!!.toDouble()
        investor.Calculate(year)
        investor.Info()
        println("Текущая сумма")
        investor.Amount()*/

        var mort = Mortgage(2000000.0, 10)
        mort.MonthPay()
        mort.Info()
        mort.ChangeYearSt(readln()!!.toDouble())
    } catch(e:Exception){
        println("неверные данные")
    }
}