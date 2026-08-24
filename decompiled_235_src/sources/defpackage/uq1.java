package defpackage;

import java.util.concurrent.TimeUnit;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uq1  reason: default package */
/* loaded from: classes.dex */
public final class uq1 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ uq1[] $VALUES;
    private final TimeUnit timeUnit;
    public static final uq1 NANOSECONDS = new uq1("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
    public static final uq1 MICROSECONDS = new uq1("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    public static final uq1 MILLISECONDS = new uq1("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    public static final uq1 SECONDS = new uq1("SECONDS", 3, TimeUnit.SECONDS);
    public static final uq1 MINUTES = new uq1("MINUTES", 4, TimeUnit.MINUTES);
    public static final uq1 HOURS = new uq1("HOURS", 5, TimeUnit.HOURS);
    public static final uq1 DAYS = new uq1("DAYS", 6, TimeUnit.DAYS);

    private static final /* synthetic */ uq1[] $values() {
        return new uq1[]{NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS};
    }

    static {
        uq1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private uq1(String str, int i, TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static uq1 valueOf(String str) {
        return (uq1) Enum.valueOf(uq1.class, str);
    }

    public static uq1[] values() {
        return (uq1[]) $VALUES.clone();
    }

    public final TimeUnit getTimeUnit$kotlin_stdlib() {
        return this.timeUnit;
    }
}
