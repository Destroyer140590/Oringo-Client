package com.jagrosh.discordipc;

import org.slf4j.LoggerFactory;
import org.json.JSONObject;
import com.jagrosh.discordipc.entities.*;
import com.jagrosh.discordipc.entities.pipe.PipeStatus;
import com.jagrosh.discordipc.exceptions.NoDiscordClientException;
import java.io.Closeable;
import java.util.HashMap;
import org.slf4j.Logger;

public final class IPCClient implements Closeable
{
    private static final Logger LOGGER = LoggerFactory.getLogger(IPCClient.class);
    private final long clientId;
    private final HashMap<String, Callback> callbacks;
    
    public IPCClient(final long clientId) {
        this.callbacks = new HashMap<String, Callback>();
        this.clientId = clientId;
    }

    public void setListener(final IPCListener listener) {
        // Disabled
    }
    
    public void connect(final DiscordBuild... preferredOrder) throws NoDiscordClientException {
        // Log that connection is intentionally blocked
        IPCClient.LOGGER.debug("Discord connection blocked by user.");
    }
    
    public void sendRichPresence(final RichPresence presence) {
        // Disabled
    }
    
    public void sendRichPresence(final RichPresence presence, final Callback callback) {
        // Disabled
    }
    
    public void subscribe(final Event sub) {}
    
    public void subscribe(final Event sub, final Callback callback) {}
    
    public PipeStatus getStatus() {
        // Always return DISCONNECTED so other code doesn't try to use it
        return PipeStatus.DISCONNECTED;
    }
    
    @Override
    public void close() {
        // Nothing to close
    }
    
    public DiscordBuild getDiscordBuild() {
        return null;
    }
    
    private void checkConnected(final boolean connected) {
        // Removed logic that throws exceptions
    }
    
    private void startReading() {
        // Completely removed the background thread logic
    }

    private static int getPID() {
        return -1;
    }
}
