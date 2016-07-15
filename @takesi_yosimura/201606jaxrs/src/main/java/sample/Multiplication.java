package sample;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;

@Path("multiplication")
public class Multiplication {
    @GET
    public int calculate(
            @MatrixParam("left") int left,
            @MatrixParam("right")int right) {
        return left * right;
    }
}
