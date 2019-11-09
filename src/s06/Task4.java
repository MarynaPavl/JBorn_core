package s06;

public class Task4 {
    public static void main(String[] args) {
        LowerCaseHandler lower = new LowerCaseHandler();
        AlphabetHandler alphabet = new AlphabetHandler();
        LongWordHandler longWord = new LongWordHandler(1, 9);
        System.out.println(longWord.handleMessage(alphabet.handleMessage(lower.handleMessage("   ХОТЕЛОСЬ БЫ РЕШИТЬ ЕГО ПРАВИЛЬНО   "))));

    }
}