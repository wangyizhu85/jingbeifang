import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Test {

    public static void main(String[] args) {
        //顾客购买数量
        BigDecimal number = new BigDecimal("6");

        Apple apple = new Apple(new BigDecimal("8"),new BigDecimal("1"));
        Strawberry strawberry = new Strawberry(new BigDecimal("13"),new BigDecimal("1"));

        BigDecimal totalA = apple.totalPrice(number).add(strawberry.totalPrice(number));
        System.out.println("顾客A购买总价：" + FullDiscountCalculate.calculate(totalA));

        //新增芒果
        Mango mango = new Mango(new BigDecimal("20"),new BigDecimal("1"));
        BigDecimal totalB = apple.totalPrice(number).add(strawberry.totalPrice(number)).add(mango.totalPrice(number));
        System.out.println("顾客B购买总价：" + FullDiscountCalculate.calculate(totalB));

        //草莓打8折
        strawberry.setDiscount(new BigDecimal("0.8"));
        BigDecimal totalC = apple.totalPrice(number).add(strawberry.totalPrice(number)).add(mango.totalPrice(number));
        System.out.println("顾客C购买总价：" + FullDiscountCalculate.calculate(totalC));

        //满减活动满100减10
        FullDiscountCalculate.addFullDiscount(new FullDiscount(new BigDecimal("100"),new BigDecimal("10")));
        BigDecimal totalD = apple.totalPrice(number).add(strawberry.totalPrice(number)).add(mango.totalPrice(number));
        System.out.println("顾客D购买总价：" + FullDiscountCalculate.calculate(totalD));


    }
}
