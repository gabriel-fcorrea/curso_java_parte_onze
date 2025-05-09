package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import entities.VotingRegister;

public class Exercicio3 {

	public static void main(String[] args) {

		Map<String, Integer> totalVotes = new LinkedHashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
			String votes = bf.readLine();
			while (votes != null) {
				String[] fields = votes.split(",");
				VotingRegister vt = new VotingRegister(fields[0], Integer.parseInt(fields[1]));

				if (totalVotes.containsKey(vt.getName())) {
					int sum = totalVotes.get(vt.getName());
					totalVotes.put(vt.getName(), vt.getVote() + sum);
				} else {
					totalVotes.put(vt.getName(), vt.getVote());
				}

				votes = bf.readLine();
			}

			for (String s : totalVotes.keySet()) {
				System.out.println(s + ": " + totalVotes.get(s));
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}
