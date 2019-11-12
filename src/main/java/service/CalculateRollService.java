package service;

public class CalculateRollService {
    public double calculationOfRolls(double roomLength, double roomWidth, double wallpaperWidth, double wallpaperLength, double roomHeight) {
        double wallpaperClearance = 0.1;

        double roomPerimeter = (roomLength + roomWidth) * 2;
        int sumStrip = (int) (roomPerimeter / wallpaperWidth);
        if (roomPerimeter % wallpaperWidth != 0) {
            sumStrip++;
        }

        double stripsFromARoll = wallpaperLength / (roomHeight + wallpaperClearance);

        int calculateRoll = (int) (sumStrip / stripsFromARoll);
        if (sumStrip % stripsFromARoll != 0) {
            calculateRoll++;
        }

        return calculateRoll;
    }
}
