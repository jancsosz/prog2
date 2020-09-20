public class BBP {
    
    double piii = 0.0;

    public double Pi(int pos){
        for(int i = 0; i < 100000; ++i){
            piii = (4 * sCalc(1, pos)) - (2 * sCalc(4, pos)) - (sCalc(5, pos)) - (sCalc(6, pos));
        }

        return piii;
    }

    public int mod(int b, int n, int k){

        int t = n;
        int r = 1;

        if (n >= t){
            r = mod(b*r, 1, k);
            n = n-t;
        }

        t = t/2;

        if (t >= 1){
            r = mod(r, 2, k);
        } else return r;


    } 

    public double sCalc(int num, int pos){

        double result1 = 0.0;
        double result2 = 0.0;
        double result = 0.0;

        for (int i = 0; i <= pos; ++i){
            result1 += ((mod(16, (pos-i), (8 * i + num))) / (8 * i + num));
        }

        System.out.println("elso1" + result1);

        if (result1 > 1) while (result1 > 1) --result1;

        for (int i = (pos + 1); i < 10000000; ++i){
            result2 += (Math.pow(16.0, pos - i)/(8 * i + num));
        }

        //testing
        System.out.println("masodik" + result1);
        System.out.println(result2);

        result = result1 + result2;

        if (result > 1) while (result > 1) --result;

        if (result > 1) {
            while (result > 1) --result;
        }    

        return result;
    }


    
    public static void main(String[] args) {
        BBP pii = new BBP();
        System.out.println(pii.sCalc(1, 1000000));

        //testing
        System.out.print(Math.pow(16.0, 10000.0) );
    }
}
