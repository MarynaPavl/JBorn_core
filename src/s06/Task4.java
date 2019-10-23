package s06;

public class Task4 {
    public static void main(String[] args) {
        LowerCaseHendler lower = new LowerCaseHendler();
        System.out.println(lower.handleMessage("МнЕ КаЖеТсЯ я нЕ до КоНцА ПоНялА заДанИе?") + "  " + lower.lower());
        AlphabetHandler alphabet = new AlphabetHandler();
        System.out.println(alphabet.handleMessage("Или нет?") + "  " + alphabet.alphabet());
        LongWordHandler longWord = new LongWordHandler(1, 9);
        System.out.println(longWord.handleMessage("Хотелось бы решить его правильно") + "  " + longWord.longWord());

    }
}