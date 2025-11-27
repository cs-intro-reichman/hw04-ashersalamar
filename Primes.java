public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("Prime numbers up to " + n + ":");
        boolean[] result = new boolean[n+1];
        int counter = 0;
        int i = 0;
        while (i < result.length){
            if (i > 1) {
                int x = 2, y = 2;
                result[i] = true;
                while (x <= i && y <= i){
                    while(i != y*x && x < i && y <= i) {
                       x++;
                    }
                    if(i == y*x) {
                        result[i] = false;
                        break;
                    }
                    x = 2;
                    y++;
                     
                } 
                if(result[i] == true){
                    System.out.println(i);
                    counter++;
                } 
            }
        i++;
        } 
        int perc = (int)(100.0*counter/n+0.5);
        System.out.println("There are " + counter+ " primes between 2 and " + args[0] + " (" + perc + "% are primes)");
    }
}