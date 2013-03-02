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
}
