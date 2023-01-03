package Charger.Simulator.demo;

import io.micronaut.websocket.WebSocketBroadcaster;
import io.micronaut.websocket.WebSocketSession;
import io.micronaut.websocket.annotation.*;

@ServerWebSocket("/simulatorSocket/{topic}")
public class SimulatorSocketServer {
    private WebSocketBroadcaster broadcaster;

    public SimulatorSocketServer(WebSocketBroadcaster broadcaster) {
        this.broadcaster = broadcaster;
    }

    @OnOpen
    public void onOpen() {}

    @OnMessage
    public void onMessage() {}

    @OnClose
    public void onClose() {}

}