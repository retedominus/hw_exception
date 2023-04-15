import java.io.IOException;

public class counter implements AutoCloseable {
    private int var = 0;

    public void add() throws IOException {
        if (ifClose()) {
            throw new IOException("Ресурс закрыт!");
        }
        var += 1;
    }

    public int getVar() {
        return var;
    }

    @Override
    public void close() {
        var = -1;
    }

    public boolean ifClose() {
        return var < 0;
    }
}
