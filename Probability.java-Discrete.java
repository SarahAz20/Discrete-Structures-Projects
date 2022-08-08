public class Probability {
    // . What is the probability that out of 100 circuit boards made exactly 0 have defects? (3 points)
    //
    //2. What is the probability that out of 100 circuit boards made exactly 1 have defects? (3 points)
    //
    //3. What is the probability that out of 100 circuit boards made exactly 2 have defects? (3 points)
    //
    //4. What is the probability that out of 100 circuit boards made at least 3 have defects? (3 points)

    public static void main(String[] args) {
        double noDefect;
        double defect1;
        double defect2;
        double defect3;

        // (n choose k)*p^k(q^(n-k))
        //  n!/(k!(n-k)!)
        // total number of ways to arrange n objects
        // divided by total numbers of ways to arrange n minus k object
        // divided by number of ways to arrange k objects.


        noDefect = formula(100, 0, .01);
        defect1 = formula (100, 1, .01);
        defect2 = formula(100, 2, 0.01);
        defect3 = 1-noDefect-defect1-defect2;

        System.out.println("There is a probability of " + noDefect + " to have no defects in a batch of 100 circuit boards.");
        System.out.println("There is a probability of " + defect1 +  " to have 1 defect in a batch of 100 circuit boards.");
        System.out.println("There is a probability of " + defect2 +  " to have 2 defects in a batch of 100 circuit boards.");
        System.out.println("There is a probability of " + defect3 + " to have 3 or more defects in a batch of 100 circuit boards.");
    }

    static double formula(int n, int k, double p){
        double q = 1-p;
        double choose = 1.0;
        for (int i =1; i<=k; i++){
            choose *= n-i+1;
            choose /= i;

        }
        double prob = Math.pow(p, k)*Math.pow(q, n-k);
        return choose*prob;


    }
}
