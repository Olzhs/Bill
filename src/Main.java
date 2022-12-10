import com.sun.source.tree.NewArrayTree;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new Bill(new BigDecimal("100.00"), new IncomeTaxType(),taxService),
                new Bill(new BigDecimal("100.00"),new VATaxType(),taxService),
                new Bill(new BigDecimal("100000.00"),new ProgressiveTaxType(),taxService)
        };
        for(int i = 0; i< payments.length; ++i){
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
