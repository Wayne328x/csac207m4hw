package theater;

/**
 * Class representing a play..
 */
public class Play {

    private final String name;
    private final String type;

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Return the play's name.
     *
     * @return the name of this play
     */
    public String getName() {
        return name;
    }

    /**
     * Return the play's type.
     *
     * @return the type of this play
     */
    public String getType() {
        return type;
    }
}
