package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Hotel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		Room[] room = new Room[10];
		
		System.out.println("Quantos quartos voce quer alugar? ");
		int qnt = read.nextInt();
		read.nextLine();
		
		for(int i=0; i<qnt; i++) {
			System.out.println("Qual quarto sera alugado? ");
			int roomNumber = read.nextInt();
			read.nextLine();
			
			System.out.println("Qual o nome do cliente? ");			
			String name = read.nextLine();
			
			System.out.println("Qual o email do cliente? ");
			String email = read.nextLine();
			
			room[roomNumber] = new Room();
			
			room[roomNumber].rentRoom(name, email);
		}
		
		for(int i = 0; i < room.length; i++) {
			if(room[i] != null) {
				System.out.println(room[i]);
				System.out.println(i);
			}
		}
		
		read.close();
	}

}
