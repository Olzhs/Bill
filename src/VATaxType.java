import java.math.BigDecimal;

public class VATaxType extends TaxType{
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount){
        BigDecimal b = BigDecimal.valueOf(0.18);
        BigDecimal sum2 = amount.multiply(b);
        return sum2;

    }
}


