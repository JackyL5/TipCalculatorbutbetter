public class TipCalculator {

private int numPeople;
private int tipPercentage;
private double totalBillBeforeTip;
    public TipCalculator(int numPeople, int tipPercentage){
        this.numPeople= numPeople;
        this.tipPercentage = tipPercentage;
        totalBillBeforeTip = 0.0;
    }
    public double getTotalBillBeforeTip(){
        return totalBillBeforeTip;
    }
    public double getTipPercentage(){
        return tipPercentage;
    }
    public double addMeal(double cost){
        totalBillBeforeTip+=cost;
    }
    public double tipAmount(){
        return tipPercentage * totalBillBeforeTip /100;
    }
    public double totalBill(){
       return totalBillBeforeTip +=tipAmount() ;
    }
    public double perPersonCostBeforeTip(){
       return totalBillBeforeTip/numPeople;
    }
    public double perPersonTipAmount(){
        return tipAmount()/numPeople;
    }
    public double perPersonTotalCost(){
        return totalBill()/numPeople;
    }

}
