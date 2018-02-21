package question5;

public class Cricket extends Sport {

    int num_umpires;
    int num_substitutes;

    Cricket() {
        super(11, "Cricket", "Condition OK");
        num_umpires = 3;
        num_substitutes = 2;
    }

    /*Cricket() {
        super.ground_condition = "Condition OK";
        super.name = "Cricket";
        super.num_players = 11;
        num_umpires = 3;
        num_substitutes = 2;
    }*/

    /*Cricket() {
        this(3, 2);
        super(11, "Cricket", "Condition OK");
    }

    Cricket(int nu, ns) {
        this.num_umpires = nu;
        this.num_substitutes = ns;
    } */

    /*Cricket() {
        this.num_umpires = 3;
        this.num_substitutes = 2;
        super(11, "Cricket", "Condition OK");
    }*/
}
