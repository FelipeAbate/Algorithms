package binarysearchalgorithm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        int[] array = {2, 3, 4, 10, 40};
        
        try (Scanner scanner = new Scanner (System.in)) {
            System.out.println("Digite o numero a ser buscado: ");
            int guess = scanner.nextInt();
            
            BinarySearch resultSearch = new BinarySearch();
            int result = resultSearch.binarySearch(array, guess);
            
            if (result == -1) {
                System.out.println("Elemento não encontrado");
            } else {
                System.out.println("Elemento encontrado no índice: " + result);
            }
        }
    }
}

