import java.util.Arrays;

public class SimulationResults
{
    int randomIndex = 1;
    public double getSampleMean(int number)
    {
        double[] sampleX = populateSamples(number);
        double total = sum(sampleX);
        //System.out.println(total);
        return total/ number;
    }

    private double sum(double[] sampleX)
    {
        double total = 0;
        for(double x : sampleX) {
            //System.out.println(x);
            total += x;
        }
        return total;
    }
    private double[] populateSamples(int number)
    {
        double[] doubles = new double[number];
        for(int i = 0; i < number; i++)
        {
            doubles[i] = getNextRealization();
            //System.out.println(x);
        }
        return doubles;
    }

    private double getNextRealization()
    {
        double random = Main.getAnyRandomValue(randomIndex);
        double inverseRealization = Math.sqrt(-6498 * Math.log( 1- random));
        randomIndex++;
        return inverseRealization;
    }
}
