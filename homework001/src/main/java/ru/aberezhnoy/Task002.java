package ru.aberezhnoy;

public class Task002 {
    public static void main(String[] args) {
        Answer ans = new Answer();
        ans.printPrimeNums();
    }

    static class Answer {
        public void printPrimeNums() {
            int n = 1000;
            boolean[] isPrime = new boolean[n + 1];

            for (int i = 2; i <= n; i++) {
                isPrime[i] = true;
            }

            for (int p = 2; p * p <= n; p++) {
                if (isPrime[p]) {
                    for (int i = p * p; i <= n; i += p) {
                        isPrime[i] = false;
                    }
                }
            }

            for (int i = 2; i <= n; i++) {
                if (isPrime[i]) {
                    System.out.println(i);
                }
            }
        }
    }
}

