package com.javi.bot;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ChatBot chatbot = new ChatBot();
		
		chatbot.run(scanner);
	}

}
