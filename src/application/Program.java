package application;

import java.util.Scanner;

import entities.MatInteger;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da Matriz(X/Y) ");
		System.out.print("X: ");
		Integer x = sc.nextInt();
		System.out.print("Y: ");
		Integer y = sc.nextInt();
		sc.nextLine();
		
		
		Integer[][] matrix = new Integer[x][y];
		
		for(int l=0;l<matrix.length;l++) {
			for(int c=0;c<matrix[l].length;c++) {
				matrix[l][c] = sc.nextInt();
			}
		}
		
		for(int l=0;l<matrix.length;l++) {
			System.out.println(" ");
			for(int c=0;c<matrix[l].length;c++) {
				System.out.print(matrix[l][c] + " ");
			}
		}
		
		
		
		sc.close();
	}

}
