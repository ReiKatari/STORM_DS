package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: as3  reason: default package */
/* loaded from: classes.dex */
public final class as3 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ as3[] $VALUES;
    public static final as3 TRACKING = new as3("TRACKING", 0);
    public static final as3 PENDING = new as3("PENDING", 1);
    public static final as3 SCOREBOARD = new as3("SCOREBOARD", 2);
    public static final as3 FAILED = new as3("FAILED", 3);
    public static final as3 CANCELED = new as3("CANCELED", 4);

    private static final /* synthetic */ as3[] $values() {
        return new as3[]{TRACKING, PENDING, SCOREBOARD, FAILED, CANCELED};
    }

    static {
        as3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private as3(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static as3 valueOf(String str) {
        return (as3) Enum.valueOf(as3.class, str);
    }

    public static as3[] values() {
        return (as3[]) $VALUES.clone();
    }
}
