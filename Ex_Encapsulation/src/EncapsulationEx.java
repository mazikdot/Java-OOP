import java.math.RoundingMode;
import java.text.DecimalFormat;

class Car {

    private String name;
    private double topSpeed;

    public String getName() {
        return name;
    }

    public double getTopSpeedMph() {
        return topSpeed;
    }

    public double getTopSpeedKmph() {
        return topSpeed * 1.609344; // MPH = 1.609344 Km/H
    }

    public void setName(String new_name) {
        name = new_name;
    }

    public void setTopSpeedMph(double speedMPH) {
        topSpeed = speedMPH;
    }

}

public class EncapsulationEx {
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {
        Car c = new Car();
        c.setName("SSC Tuatara");
        c.setTopSpeedMph(316.11);
        
        System.out.println("ชื่อรถที่เร็วที่สุดในโลก :" + c.getName());
        System.out.println("ความเร็วสูงสุด : " + c.getTopSpeedMph() + " ไมล์/ชั่วโมง");
        System.out.println("หรือ ความเร็วสูงสุด : " + df2.format(c.getTopSpeedKmph()) + " กิโลเมตร/ชั่วโมง");
    }
}