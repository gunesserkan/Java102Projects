package CriticalSectionsAndRaceCondition;

public class OrderMatic implements Runnable{
    private int ornderNo;
    private final Object LOCK=new Object();
    public OrderMatic() {
        this.ornderNo = 0;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        increaseOrder();
    }
    public synchronized void increaseOrder(){
            this.setOrnderNo(this.getOrnderNo()+1);
            System.out.println("Thread: "+Thread.currentThread().getName()+" OrderNo: "+this.getOrnderNo());
    }

    public int getOrnderNo() {
        return ornderNo;
    }

    public void setOrnderNo(int ornderNo) {
        this.ornderNo = ornderNo;
    }
}
