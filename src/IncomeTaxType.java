import java.math.BigDecimal;

public class IncomeTaxType extends TaxType{
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount){
        BigDecimal v = BigDecimal.valueOf(0.13);
        BigDecimal sum = amount.multiply(v);
        return sum;

    }
}


