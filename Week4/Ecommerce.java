package Week4;

public class Ecommerce {
    public static void calculatePrice(double[] prices){
       double totalPrice=0;
       for(double price: prices){
           totalPrice+=price;
       }
       double finalPrice = 0;
       if (totalPrice>1000){//discount 20%
           finalPrice=totalPrice-(totalPrice*20/100);
       } else if (totalPrice<=1000 && totalPrice>600) {// discount 10%

       }
       else {
           finalPrice=totalPrice;
       }
        System.out.println("final price"+ finalPrice);
    }
    static void main(String[] args){
        double[] prices={1200};
        calculatePrice(prices);
    }
}
