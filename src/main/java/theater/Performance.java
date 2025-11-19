package theater;

/**
 * Class representing a performance of a play..
 */
public class Performance {

    private final String playID;
    private final int audience;

    public Performance(String playID, int audience) {
        this.playID = playID;
        this.audience = audience;
    }

    /**
     * Return the play ID for this performance.
     *
     * @return the ID of the play
     */
    public String getPlayID() {
        return playID;
    }

    /**
     * Return the audience size.
     *
     * @return number of people attending
     */
    public int getAudience() {
        return audience;
    }
}
