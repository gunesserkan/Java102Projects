import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Insurance {
    String name;
    int insurancePrice;
    Date insuranceStartDate;
    Date insuranceFinishDate;

    public Insurance(String name, Date insuranceStartDate, Date insuranceFinishDate) {
        this.name = name;
        this.insuranceStartDate=insuranceStartDate;
        this.insuranceFinishDate=insuranceFinishDate;
    }
    public static void showInsurances(){
        System.out.println("1- Sağlık sigortası");
        System.out.println("2- Araç sigortası");
        System.out.println("3- Seyahat sigortası");
        System.out.println("4- Konut sigortası");
    }
    public static Insurance createInsurance(int insuranceType){
        Scanner input = new Scanner(System.in);
        Date insuranceStart=null;
        Date insuranceFinish=null;
        System.out.println("Sigorta başlangıç tarihini giriniz (18/05/2020):");
        String startDate=input.nextLine();
        System.out.println("Sigorta bitiş tarihi girinz (18/05/2020)");
        String finishDate=input.nextLine();
        DateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        try{
            insuranceStart=dateFormat.parse(startDate);
            insuranceFinish=dateFormat.parse(finishDate);
        }catch (Exception e){
            System.out.println("Hatalı Tarih girişi!");
        }

        if(insuranceType==1)
            return new HealthInsurance(insuranceStart,insuranceFinish);
        else if (insuranceType==2)
            return new CarInsurance(insuranceStart,insuranceFinish);
        else if(insuranceType==3)
            return new TravelInsurance(insuranceStart,insuranceFinish);
        else if (insuranceType==4)
            return new ResidenceInsurance(insuranceStart,insuranceFinish);
        return null;
    }
    public abstract int calculate();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInsurancePrice() {
        return insurancePrice;
    }

    public void setInsurancePrice(int insurancePrice) {
        this.insurancePrice = insurancePrice;
    }

    public Date getInsuranceStartDate() {
        return insuranceStartDate;
    }

    public void setInsuranceStartDate(Date insuranceStartDate) {
        this.insuranceStartDate = insuranceStartDate;
    }

    public Date getInsuranceFinishDate() {
        return insuranceFinishDate;
    }

    public void setInsuranceFinishDate(Date insuranceFinishDate) {
        this.insuranceFinishDate = insuranceFinishDate;
    }
}
