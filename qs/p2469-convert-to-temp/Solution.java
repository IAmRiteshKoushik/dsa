class Solution {
    public double[] convertTemperature(double celsius) {

        double [] temp = new double[]{celsius + 273.15,celsius * 1.80 + 32.00};
        return temp;
    }
}
