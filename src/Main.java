public class Main {
    final static long multiplier = 24693; //a
    final static long increment = 3967;
    final static long startX = 1000; //x naught // x sub 0
    final static double modulus = Math.pow(2, 18);    //k
    public static void main(String[] args) {
        //getAnyRandomValues(51, 52, 53);
        double total = 0; SimulationResults sim = new SimulationResults();
        for(int i = 0; i < 110; i++)
        {
            total += sim.getSampleMean(10);
        }
        System.out.println(total/10);
    }
    public static double getAnyX(int i)
    {   //Conditions: i >= 0
        if(i >= 1)
        {
            return (multiplier * getAnyX(i -1) + increment) % modulus;
        }
        return startX;
    }

    public static double getAnyRandomValue(int i)
    {
        return getAnyX(i)/ modulus;
    }

    public static void getAnyRandomValues(Integer... ints)
    {
        for(int each: ints)
        {
            System.out.println(getAnyRandomValue(each));
        }
    }
}