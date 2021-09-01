package ds.numbertheory;

public class BinaryExponentiation {

    // Recursive
    Long power(Long a, Long b){
        if (b == 0)
            return 1L;
        Long res = power(a, b / 2);
        if (b%2 == 1)
            return res * res * a;
        else
            return res * res;
    }

    Long binpow(Long a, Long b) {
        Long res = 1L;
        while (b > 0L) {
            if ((b & 1L) != 0) {
                res = res * a;
            }
            a = a * a;
            b >>= 1;
        }
        return res;
    }

}
