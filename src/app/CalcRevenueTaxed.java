package app;

// Клас розрахунку доходу,
// враховуючи податок на доход.
// Клас успадковує клас CalcRevenueBase.
public class CalcRevenueTaxed extends CalcRevenueBase {

    // Ставка податку на доход у відсотках
    private  double TAX_RATE = 5;

    @Override
    public double calcRevenue(Sale sale) {
        return (sale.getQuota() * sale.getPrice()) * (1 - TAX_RATE / 100);
    }
}