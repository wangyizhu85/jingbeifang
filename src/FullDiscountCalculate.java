import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FullDiscountCalculate {
    public static List<FullDiscount> fullDiscountList = new ArrayList<>();

    /**
     * 增加满减
     * @param discount
     */
    public static void addFullDiscount(FullDiscount discount){
        fullDiscountList.add(discount);
    }

    /**
     * 删除满减
     * @param discount
     */
    public static void removeFullDiscount(FullDiscount discount){
        fullDiscountList.remove(discount);
    }

    /**
     * 清空所有满减
     */
    public static void emptyFullDisDiscount(){
        fullDiscountList.clear();
    }

    public static BigDecimal calculate(BigDecimal decimal){
        BigDecimal minPrice = decimal;
        for (FullDiscount fullDiscount:fullDiscountList){
            System.out.printf("满减活动：满"+fullDiscount.full+"减"+fullDiscount.discount+",");
            if(decimal.compareTo(fullDiscount.full)>=0){
                BigDecimal price = decimal.subtract(fullDiscount.discount);
                if(minPrice.compareTo(price)>0){
                    minPrice = price;
                }
            }
        }
        return minPrice;
    }

}
