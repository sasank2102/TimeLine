package TimeLine.resources;

import com.codahale.metrics.annotation.ExceptionMetered;
import com.codahale.metrics.annotation.Timed;
import org.checkerframework.checker.units.qual.Time;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/timeLine")
public class TimeLineResource {

    @GET
    @Timed
    @ExceptionMetered
    public int testInt() {
        return 0;
    }

}
