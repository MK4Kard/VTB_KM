class Mortgage(var sum: Double, var term: Int) {
    private var yearsSt: Double = 10.0

    public fun MonthPay() {
        var monthSt = yearsSt/12/100
        var countPay = term*12.0
        var pay = sum*(monthSt+monthSt/(Math.pow(1+monthSt, countPay)-1))
        println("Ежемесячный платеж: ${String.format("%.3f", pay)}")
    }

    public fun Info() {
        println(
            "Начальная сумма: ${sum}\n" +
                    "Срок в годах: ${term}%\n" +
                    "Годовая процентная ставка: ${yearsSt}"
        )
    }

    public fun ChangeYearSt(newYearSt: Double) {
        if (newYearSt > 0 && newYearSt <= 100){
            yearsSt = newYearSt
            println("Новая годовая процентная ставка установлена: ${yearsSt}")
        }else{
            println("Недопустимое значение")
        }
    }
}