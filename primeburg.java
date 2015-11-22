package javapractice;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hieu Tran
 */
public class primeburg {
    boolean notPrime(int num) {
    for (int i=2; i<Math.abs(num)/2; i++)
        if (num % i == 0)
            return false;
        return true;
    }
    int Prime_sum(int A, int B) {
        int sum = 0;
        for (int num=A; num<=B; num++)
            if (notPrime(num))
                sum += num;
        return sum;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        primeburg p = new primeburg();
        System.out.println(p.Prime_sum(-8, -1));
    }    

}
