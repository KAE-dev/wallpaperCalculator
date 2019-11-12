package service;

public class CalculateRollService {
    public double calculationOfRolls(double roomLength, double roomWidth, double wallpaperWidth, double wallpaperLength, double roomHeight) {
        double wallpaperClearance = 0.1;

        double roomPerimeter = (roomLength + roomWidth) * 2;
        double sumStrip = roomPerimeter / wallpaperWidth;
        if (sumStrip % 1 != 0) {
            sumStrip -= sumStrip % 1;
            sumStrip++;
        }

        double stripsFromARoll = wallpaperLength / (roomHeight + wallpaperClearance);

        double calculateRoll = sumStrip / stripsFromARoll;
        if (calculateRoll % 1 != 0) {
            calculateRoll -= calculateRoll % 1;
            calculateRoll++;
        }

        return (int) calculateRoll;
    }
}
