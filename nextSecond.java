/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

/**
 *
 * @author Hieu Tran
 */
public class nextSecond {
    
    int[] nextSecond(int[] currentTime) {

  if (currentTime[2] == 59) {
    currentTime[2] = 0;
    if (currentTime[1] == 59) {
      currentTime[1] = 0;
      currentTime[0] = (currentTime[0] % 12) + 1;
    }
    else {
      currentTime[1]++;
    }
  }
  else {
    currentTime[2]++;
  }

  return currentTime;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        nextSecond n = new nextSecond();
        int[] result = n.nextSecond(new int[]{12, 59, 59});
        System.out.println(result[0] + " " + result[1] + " " + result[2] + "\n");
    } 
}
