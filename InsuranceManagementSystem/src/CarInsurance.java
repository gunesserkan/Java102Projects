import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CarInsurance extends Insurance{
    public CarInsurance(Date insuranceStartDate, Date insuranceFinishDate) {
        super("Car Insurance", insuranceStartDate, insuranceFinishDate);
    }

    @Override
    public int calculate() {
        DateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.format(insuranceStartDate);
        dateFormat.format(insuranceFinishDate);
        return (int)(insuranceStartDate.getTime()-insuranceFinishDate.getTime())/(1000*60*60*24)*400;
    }
}
