import java.math.BigDecimal;

class TaxService {
    public void playOut(BigDecimal Taxamount) {
        System.out.format("Уплачен налог в размере %.2f%n", Taxamount);
    }
}