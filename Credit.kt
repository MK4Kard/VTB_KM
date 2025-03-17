class Credit(var sum: Double, var precent: Double, var term: Int) {
    private var annualPay = 0.0
    public fun Month(){
        var monthlyRate = precent/100/12
        var totalPay = term*12.0
        if(monthlyRate>0){
            annualPay = sum * (monthlyRate*Math.pow(1+monthlyRate, totalPay))/(Math.pow(1+monthlyRate, totalPay)-1)
        } else {
            annualPay = sum/totalPay
        }
    }
    public fun Info(){
        println("Кредит на сумму ${sum} руб\n" +
                "На срок в годах ${term}\n" +
                "Ежемесячная плата: ${String.format("%.3f", annualPay)} руб")
    }
    public fun Reg(answer: Boolean){
        if (answer){
            println("Кредит на сумму ${sum} руб сроком в годах ${term} был оформлен")
        }
        else {
            println("Кредит не оформлен")
        }
    }
}