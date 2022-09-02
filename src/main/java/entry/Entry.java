package entry;

import lombok.Getter;

import java.time.ZonedDateTime;

@Getter
public abstract class Entry {
    private long amount;
    private ZonedDateTime date;
}
