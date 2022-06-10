class WordEntry {
	String word;
	int frequency;
}

public class WordHistogramSample {
	static WordEntry[] entries;
	static int entryCount;

	static void addWord (String word) {
		int i = 0;
		while (i < entryCount && !word.equals(entries[i].word)) i++;
		if (i >= entryCount) {
			if (entryCount >= entries.length) Out.println("Zu viele Einträge.");
			else {
				WordEntry we = new WordEntry();
				we.word = word;
				we.frequency = 1;
				entries[entryCount] = we;
				entryCount++;
			}
		}
		else
			entries[i].frequency += 1;
	}

	static void removeWord (String word) {
		int i = 0;
		while (i < entryCount && !word.equals(entries[i].word)) i++;
		if (i < entryCount) {
			entries[i].frequency -= 1;
			if (entries[i].frequency <= 0) {
				entries[i] = entries[entryCount - 1];
				entryCount -= 1;
				entries[entryCount] = null;  // required by class invariant and improves garbage collection
			}
		}
	}

	static void printEntries () {
		Out.println("Anzahl Einträge: " + entryCount);
		for (int i = 0; i < entryCount; i++) {
			WordEntry we = entries[i];
			Out.println("#" + (i+1) + " " + we.word + ": " + we.frequency);
		}
	}

	static void readWordList (String filename) {
		In.open(filename);
		if (!In.done()) {
			Out.println("Datei nicht gefunden.");
			return;
		}
		String line = In.readLine();
		while (In.done()) {
			addWord(line);
			line = In.readLine();
		}
		In.close();
	}

	public static void main (String[] args) {
		entries = new WordEntry[1000];
		entryCount = 0;
		readWordList("words.txt");
		printEntries();
	}
}