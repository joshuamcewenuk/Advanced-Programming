import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Created by Joshua on 14/11/2017.
 */
public class GetHomeHandler implements HttpHandler {
    public void handle(HttpExchange he) throws IOException {
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(he.getResponseBody()));
        he.sendResponseHeaders(200, 0);

        out.write("You should visit /get-date");
        out.close();
    }
}
