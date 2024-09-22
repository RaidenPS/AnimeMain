package raidengame.server.events;

/** Implementing this interface marks an event as cancellable. */
public interface Cancellable {
    void cancel();
}
