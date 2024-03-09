import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ResidenceInsurance extends Insurance{
    public ResidenceInsurance(Date insuranceStartDate, Date insuranceFinishDate) {
        super("Residence Insurance", insuranceStartDate, insuranceFinishDate);
    }

    @Override
    public int calculate() {
        DateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.format(insuranceStartDate);
        dateFormat.format(insuranceFinishDate);
        return (int)(insuranceStartDate.getTime()-insuranceFinishDate.getTime())/(1000*60*60*24)*500;
    }
}
