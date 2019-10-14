package pt.brunohorta;

import io.smallrye.reactive.messaging.annotations.Broadcast;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Outgoing;

import javax.enterprise.context.ApplicationScoped;
import javax.validation.constraints.NotBlank;

@ApplicationScoped
public class StringsService {

    @Incoming("cenas")
    @Outgoing("upper-msg-stream")
    @Broadcast
    public String toUpper(@NotBlank String msg) {
        return msg.toUpperCase();
    }
}
