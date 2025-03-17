class Invest(var inAmount: Double, var rate: Double) {
    private var years: Double = 0.0

    public fun Calculate(years: Double){
        this.years = years
        var cal = inAmount*Math.pow((1+rate), this.years)
        return println(String.format("%.3f", cal))
    }
    public fun Info(){
        println("Начальная сумма: ${inAmount}\n" +
                "Процентная ставка: ${rate}%\n" +
                "Количество лет: ${years}")
    }
    public fun Amount(){
        var am = inAmount*(1+rate*years)
        println(String.format("%.3f", am))
    }
}