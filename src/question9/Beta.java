package question9;

public class Beta extends Alpha {
    @Override
    public String doStuff(String msg) {
        return msg.replace('a', 'e');
    }
}
