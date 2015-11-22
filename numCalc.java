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
public class numCalc {

    /**
     * @param args the command line arguments
     */
    
    int Num_Calc(int N) {
        int step = 0;
        while (N != 1){
            N = (N % 2 == 0) ? (N / 2) : N+1;
            step++;
        }
        return step;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        numCalc practice = new numCalc();
        System.out.println(practice.Num_Calc(10));
    }    
}
