import java.util.Arrays;

public class SimulationResults
{
    int randomIndex = 1;
    public double getSampleMean(int number)
    {
        double[] sampleX = new double[number];
        populateSamples(sampleX);
        double total = sum(sampleX);
        System.out.println(total);
        return total/ number;
    }

    private double sum(double[] sampleX)
    {
        double total = 0;
        for(double x : sampleX)
            total += x;
        return total;
    }
    private void populateSamples(double[] sampleX)
    {
        for(double x : sampleX)
        {
            x = getNextRealization();
            //System.out.println(x);
        }
    }

    private double getNextRealization()
    {
        double random = Main.getAnyRandomValue(randomIndex);
        double inverseRealization = Math.sqrt(-6498 * Math.log( 1- random));
        randomIndex++;
        return inverseRealization;
    }
}
