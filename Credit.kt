class Credit(var sum: Double, var precent: Double, var term: Int) {
    private var monthPay = sum*precent+(sum/365*31)
    public fun Info(){
        println("Кредит на сумму ${sum} руб" +
                "На срок ${term}" +
                "Ежемесячный платёж ${monthPay}")
    }
    public fun
}