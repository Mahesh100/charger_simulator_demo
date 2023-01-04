package charger.Simulator.demo;

import io.micronaut.websocket.WebSocketSession;
import io.micronaut.websocket.annotation.*;

@ClientWebSocket("/simulatorSocket/{topic}/")
public abstract class SimulatorSocketClient implements AutoCloseable {

    private WebSocketSession session;

    @OnOpen
    public void onOpen(WebSocketSession session) {
        this.session = session;
    }

    @OnMessage
    public void onMessage() {}

    public WebSocketSession getSession() {
        return session;
    }
}