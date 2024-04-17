import java.math.BigDecimal;

public class Fruit {

    /** 名称 */
    private String name;
    /** 单价 */
    private BigDecimal price;
    /** 折扣 */
    private BigDecimal discount;

    Fruit(String name, BigDecimal price,BigDecimal discount){
        this.name = name;
        this.price = price;
        this.discount = discount;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * 购买数量
     * @param num
     * @return
     */
    public BigDecimal totalPrice (BigDecimal num){
        BigDecimal totalPrice = price.multiply(num).multiply(discount);
        System.out.printf(name+":单价"+price+" 数量"+num+" 折扣"+discount+" 总价"+totalPrice+",");
        return totalPrice;
    }
}
