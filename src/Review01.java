
public class Review01 {

    public static void main(String[] args) { //〇〇円の商品の税込価格は〇〇円（消費税は〇〇円）です。
        int price = 1500; //商品の値段
        int tax = 10; //消費税
        int result; //税込価格
        result = taxMethod(price,tax);
        System.out.println(price + "円の商品の税込価格は" + (price + result) + "円（消費税は" + result + "円）です。");

    }

    public static int taxMethod(int price,int tax) {
        int result = (int) (price * (int) tax/(1000 * 0.1));
        return result;
    }
}