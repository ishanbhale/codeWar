package com.practice.implementation.minimaxsum;

import java.io.*;
import java.util.*;

public class Solution {
  public static int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
  }

  public static void main(String[] args) throws FileNotFoundException {
		File file = new File("D:/Study/Prog_Input/myfile.txt");
		Scanner in = new Scanner(file);
    int MAXN = 500010;
    boolean[] prime = new boolean[MAXN];
    Arrays.fill(prime, true);
    int total = 0;
    for (int i = 2; i < MAXN; i++) {
      if (prime[i]) {
        total++;
        for (int j = i+i; j < MAXN; j += i) prime[j] = false;
      }
    }
    int t = in.nextInt();
    while (t-- > 0) {
      int n = in.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) a[i] = in.nextInt();
      
      boolean ok = true;
      int gg = 0;
      for (int i = 0; i < n; i++) {
        if (a[i] == 1) {
          ok = false;
          break;
        }
        gg = gcd(a[i], gg);
      }
      
      if (gg == 1) {
        int[] count = new int[MAXN];
        for (int i = 0; i < n; i++) {
          int w = a[i];
          for (int j = 2; j * j <= w; j++) {
            if (w % j == 0) {
              count[j]++;
              while (w % j == 0) w /= j;
            }
          }
          if (w > 1) count[w]++;
        }
        ArrayList<Integer> cand = new ArrayList<Integer>();
        for (int i = 0; i < MAXN; i++) if (count[i] >= n/2) cand.add(i);
        boolean can = false;
        outer : for (int i = 0; i < cand.size(); i++) for (int j = i+1; j < cand.size(); j++) {
          int a1 = cand.get(i), a2 = cand.get(j);
          int c1 = count[a1], c2 = count[a2], c3 = 0;
          long q = a1 * (long)a2;
          if (q <= MAXN) for (int m = 0; m < n; m++) {
            if (a[m] % q == 0) c3++;
          }
          c1 -= c3;
          c2 -= c3;
          int n1 = n/2 - c1, n2 = n/2 - c2;
          if (n1+n2 <= c3) {
            can = true;
            break outer;
          }
        }
        
        ok = can;
      }
      
      System.out.println(ok ? "YES" : "NO");
    }
    System.exit(0);
  }



    

   
  


}