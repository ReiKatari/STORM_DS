package defpackage;

import java.util.concurrent.TimeUnit;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: om1  reason: default package */
/* loaded from: classes.dex */
public final class om1 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ om1[] $VALUES;
    private final TimeUnit timeUnit;
    public static final om1 NANOSECONDS = new om1("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
    public static final om1 MICROSECONDS = new om1("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    public static final om1 MILLISECONDS = new om1("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    public static final om1 SECONDS = new om1("SECONDS", 3, TimeUnit.SECONDS);
    public static final om1 MINUTES = new om1("MINUTES", 4, TimeUnit.MINUTES);
    public static final om1 HOURS = new om1("HOURS", 5, TimeUnit.HOURS);
    public static final om1 DAYS = new om1("DAYS", 6, TimeUnit.DAYS);

    private static final /* synthetic */ om1[] $values() {
        return new om1[]{NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS};
    }

    static {
        om1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private om1(String str, int i, TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static om1 valueOf(String str) {
        return (om1) Enum.valueOf(om1.class, str);
    }

    public static om1[] values() {
        return (om1[]) $VALUES.clone();
    }

    public final TimeUnit getTimeUnit$kotlin_stdlib() {
        return this.timeUnit;
    }
}
