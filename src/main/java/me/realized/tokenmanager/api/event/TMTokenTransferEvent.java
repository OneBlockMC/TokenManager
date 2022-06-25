package me.realized.tokenmanager.api.event;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class TMTokenTransferEvent extends Event implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final CommandSender sender;
    private final Player target;
    private long amount;

    public TMTokenTransferEvent(CommandSender sender, Player target, long amount) {
        this.sender = sender;
        this.target = target;
        this.amount = amount;
    }

    private boolean cancelled;

    public Player getTarget() {
        return target;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    public CommandSender getSender() {
        return sender;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
