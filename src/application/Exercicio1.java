package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.User;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<User> set = new HashSet<>();

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String logRegister = br.readLine();
			while (logRegister != null) {
				String[] fields = logRegister.split(" ");
				String user = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				set.add(new User(user, moment));

				logRegister = br.readLine();
			}

			System.out.println("Total Users: " + set.size());

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}

}
