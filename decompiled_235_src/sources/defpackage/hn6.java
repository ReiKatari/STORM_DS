package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hn6  reason: default package */
/* loaded from: classes.dex */
public final class hn6 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ hn6[] $VALUES;
    public static final hn6 ASCENDING = new hn6("ASCENDING", 0);
    public static final hn6 DESCENDING = new hn6("DESCENDING", 1);

    private static final /* synthetic */ hn6[] $values() {
        return new hn6[]{ASCENDING, DESCENDING};
    }

    static {
        hn6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private hn6(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static hn6 valueOf(String str) {
        return (hn6) Enum.valueOf(hn6.class, str);
    }

    public static hn6[] values() {
        return (hn6[]) $VALUES.clone();
    }
}
