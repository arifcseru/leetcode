package com.leetcode.arifcseru.practice;

import java.util.ArrayList;
import java.util.List;

public class _500_FindWords {
	public String[] findWords(String[] words) {
		List<String> foundWords = new ArrayList<String>();
		String[] keyboardRows = { "qwertyuiop", "asdfghjkl", "zxcvbnm" };
		for (String word : words) {
			boolean isFound = true;
			for (int j = 0; j < word.length(); j++) {
				String currentRow = "";
				for (int i = 0; i < keyboardRows.length; i++) {
					if (keyboardRows[i].contains(Character.toString(Character.toLowerCase(word.charAt(0))))) {
						currentRow = keyboardRows[i];
						break;
					}
				}
				// System.out.println("currentRow: " + currentRow + ", checking word: " + word + ", char: " + word.charAt(0));
				if (!currentRow.contains(Character.toString(Character.toLowerCase(word.charAt(j))))) {
					// System.out.println(":not found");
					isFound = false;
					break;
				}
			}
			if (isFound) {
				foundWords.add(word);
			}

		}
		String[] arr = new String[foundWords.size()];
		arr = foundWords.toArray(arr);
		return arr;
	}

	public static void main(String[] args) {
		String[] strs = { "Alaska", "Bat", "mbn", "man" };
		String[] values = new _500_FindWords().findWords(strs);
		for (String string : values) {
			System.out.println(string);
		}
	}
}
