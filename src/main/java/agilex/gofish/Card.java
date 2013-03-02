package agilex.gofish;

public class Card {
    private Rank rank;

    public Card(Rank rank) {
        if (rank == null) throw new IllegalArgumentException();
        this.rank = rank;
    }

    public boolean isRank(Rank rank) {
        return this.rank == rank;
    }

    public static Card Ace() {
        return new Card(Rank.Ace);
    }

    public static Card Two() {
        return new Card(Rank.Two);
    }

    public static Card Three() {
        return new Card(Rank.Three);
    }

    public static Card Four() {
        return new Card(Rank.Four);
    }

    public static Card Five() {
        return new Card(Rank.Five);
    }

    public static Card Six() {
        return new Card(Rank.Six);
    }

    public static Card Seven() {
        return new Card(Rank.Seven);
    }

    public static Card Eight() {
        return new Card(Rank.Eight);
    }

    public static Card Nine() {
        return new Card(Rank.Nine);
    }

    public static Card Ten() {
        return new Card(Rank.Ten);
    }

    public static Card Jack() {
        return new Card(Rank.Jack);
    }

    public static Card Queen() {
        return new Card(Rank.Queen);
    }

    public static Card King() {
        return new Card(Rank.King);
    }
}
