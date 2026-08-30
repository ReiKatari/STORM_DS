package wc;

import java.util.concurrent.TimeUnit;
import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    private final TimeUnit timeUnit;
    public static final e NANOSECONDS = new e("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
    public static final e MICROSECONDS = new e("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    public static final e MILLISECONDS = new e("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    public static final e SECONDS = new e("SECONDS", 3, TimeUnit.SECONDS);
    public static final e MINUTES = new e("MINUTES", 4, TimeUnit.MINUTES);
    public static final e HOURS = new e("HOURS", 5, TimeUnit.HOURS);
    public static final e DAYS = new e("DAYS", 6, TimeUnit.DAYS);

    private static final /* synthetic */ e[] $values() {
        return new e[]{NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = r.x($values);
    }

    private e(String str, int i2, TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final TimeUnit getTimeUnit$kotlin_stdlib() {
        return this.timeUnit;
    }
}
