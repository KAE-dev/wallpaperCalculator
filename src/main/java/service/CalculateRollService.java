package service;

public class CalculateRollService {
    public double calculationOfRolls(double length, double width, double wallpaperWidth, double wallpaperLength, double roomHeight) {
        double roomPerimeter = (length + width) * 2;
        double sumStrip = roomPerimeter / wallpaperWidth;
        if (sumStrip % 1 != 0) {
            sumStrip -= sumStrip % 1;
            sumStrip++;
        }

        double stripsFromARoll = wallpaperLength / (roomHeight + 0.1);

        double calculateRoll = sumStrip / stripsFromARoll;
        if (calculateRoll % 1 != 0) {
            calculateRoll -= calculateRoll % 1;
            calculateRoll++;
        }

        return (int) calculateRoll;
    }
}
