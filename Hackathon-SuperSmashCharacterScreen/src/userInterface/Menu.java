package userInterface;

import java.util.ArrayList;
import java.util.Scanner;
import businessLogic.GameLogic;


import models.Character;


public class Menu {
	
	//private static Logger logger = new Logger();
	private static GameLogic gl = new GameLogic();
	
	public static void showWelcomeText() {
		System.out.println();
		System.out.println("===================================================");
		System.out.println("Welcome to Super Smash Bros Console App!");
		showAsciiArt();
	}
	
	public static void showPlayerText() {
		System.out.println();
		System.out.println("======================================");
		System.out.println("CHOOSE YOUR Character!!!!");
		System.out.println("======================================\n");
	}
	
	public static void showOpponentText() {
		System.out.println();
		System.out.println("======================================");
		System.out.println("CHOOSE YOUR Opponent!!!!");
		System.out.println("======================================\n");
	}
	
	public static void showAsciiArt() {
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣴⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣦⣾⢟⢁⡄⠀⠀⠀⠀⠀⠀⠀⢀⡤⠂⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⢟⣿⣿⣾⠟⠁⠀⣠⣾⠀⠀⠀⢠⣿⠄⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⢀⠀⠀⣼⣧⠀⢺⣿⣿⡃⠀⣴⣿⡟⠁⣼⠅⣠⣿⡗⡠⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⢰⣧⣠⣾⣿⣿⣆⣼⣿⣿⣡⢀⣿⣿⣿⣾⣿⣾⣿⣷⠟⠁⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣾⣿⣿⣿⣿⡿⠟⢛⠁⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⣀⣠⣾⣿⣿⣿⡏⠉⠉⠙⠛⠿⣿⣿⣿⣿⣿⣋⣀⣤⣏⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⣤⣿⣿⠋⣿⣿⣿⡇⠀⠀⠀⠀⠀⠈⢻⣿⣿⣿⣿⠿⠟⠁⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⢿⣿⠃⠀⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⢻⣿⡟⠀⠀⠀⠀⣠⠆⠀⠀⠀⠀⠀\r\n"
				+ "⢀⣼⡏⠀⠀⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⣿⡉⢀⣀⣤⣾⠇⠀⠀⠀⠀⣀⠄\r\n"
				+ "⢻⣿⣧⣤⣤⣿⣿⣿⣧⣤⣤⣤⣤⣤⣤⣤⣤⣿⣿⣿⡿⠋⠁⠀⠀⠀⣠⣾⡁⠀\r\n"
				+ "⠈⢻⣿⡍⠉⣿⣿⣿⡏⠉⠉⠉⠉⠉⠉⠉⣽⣿⣿⣿⣯⣴⣿⣥⣶⡾⢟⠉⠀⠀\r\n"
				+ "⠀⢨⣿⣿⣦⣿⣿⣿⡇⠀⠀⠀⠀⠀⣀⣾⣿⣿⣿⣿⡿⠿⠿⠿⠾⠛⠁⠀⠀⠀\r\n"
				+ "⠀⠀⠻⠿⢿⣿⣿⣿⣇⣀⣀⣤⣴⣾⣿⣿⣿⣿⣿⣿⠶⠄⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠙⠛⠛⠻⠟⠛⠿⠿⠿⢿⣷⣤⡾⠯⠁⠀");
	}
	
	public static void printVersus(String match) {
		System.out.println();
		System.out.println("*******************************************");
		System.out.println(match.toUpperCase());
		System.out.println("*******************************************");
	}
	
	public static void presentMainMenu() {
		
		String userInput = "";
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("======================================");
			System.out.println("Main Menu");
			System.out.println("======================================");
			System.out.println("[1] VS Match");
			System.out.println("[2] Inspect Character");
			System.out.println("[x] Exit Game");
			
			userInput = scanner.nextLine();
			
			switch(userInput) {
			case "1":
				int numPlayers = gameSetup(scanner);
				characterMenu(scanner, numPlayers);
				break;
			case "2":
				//int numPlayers = gameSetup(scanner);
				//characterMenu(scanner, numPlayers);
				break;
			case "x":
				System.out.println("Exiting Game, Goodbye!");
				scanner.close();
				break;
			default:
				System.out.println("Wrong input. Please try again using one of the valid options.");
				break;
			}
			
		} while(!(userInput.equals("x")));
		
		scanner.close();
	}
	
	public static int gameSetup(Scanner scanner) {
		System.out.println();
		
		while(true) {
			System.out.println("======================================");
			System.out.println("Game Setup");
			System.out.println("======================================");
			System.out.println("Enter # of players (2-8)");
			
			 return gl.userSelectionNumOfPlayers(scanner);
		}
	}
	
	public static void characterMenu(Scanner scanner, int numPlayers) {
		
		String matchResult = ""; 
		
		for(int i = 0; i < numPlayers; i++) {
			if(i == 0) {
				showPlayerText();
				matchResult = matchResult + characterPrompt(scanner);
			} else {
				showOpponentText();
				matchResult = matchResult + " vs " + characterPrompt(scanner);
			}
		}
		
		for(int i = 0; i < gl.getSmashCharListSize(); i++) {
			System.out.println("[" + i + "] " + gl.getCharNameAtIndex(i));
		}
		
		printVersus(matchResult);
		
	}
	
	public static String characterPrompt(Scanner scanner) {
		
		for(int i = 0; i < gl.getSmashCharListSize(); i++) {
			System.out.println("[" + i + "] " + gl.getCharNameAtIndex(i));
		}
		
		String userInput = scanner.nextLine();
		
		int intSelection = Integer.parseInt(userInput);
		return gl.getCharNameAtIndex(intSelection);
	}

}
