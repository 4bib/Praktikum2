public class BingoSong {
    private int claps; // Jumlah ketukan tepuk

    public BingoSong(int claps) {
        this.claps = claps;
    }

    public void sing() {
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");

        String clapSequence = "";
        for (int i = 0; i < claps; i++) {
            clapSequence += "(clap)-";
        }

        String[] letters = {"B", "I", "N", "G", "O"};
        for (String letter : letters) {
            System.out.println(clapSequence + letter);
        }

        System.out.println("And Bingo was his name-o.");
    }

    public static void main(String[] args) {
        BingoSong bingo1 = new BingoSong(1);
        BingoSong bingo2 = new BingoSong(2);
        BingoSong bingo3 = new BingoSong(3);
        BingoSong bingo4 = new BingoSong(4);
        BingoSong bingo5 = new BingoSong(5);

        bingo1.sing();
        bingo2.sing();
        bingo3.sing();
        bingo4.sing();
        bingo5.sing();
    }
}