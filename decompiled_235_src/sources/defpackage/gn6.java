package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gn6  reason: default package */
/* loaded from: classes.dex */
public final class gn6 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ gn6[] $VALUES;
    public static final gn6 ALPHABETICALLY = new gn6("ALPHABETICALLY", 0, hn6.ASCENDING);
    public static final gn6 MOST_PLAYED;
    public static final gn6 RECENTLY_PLAYED;
    private final hn6 defaultOrder;

    private static final /* synthetic */ gn6[] $values() {
        return new gn6[]{ALPHABETICALLY, RECENTLY_PLAYED, MOST_PLAYED};
    }

    static {
        hn6 hn6Var = hn6.DESCENDING;
        RECENTLY_PLAYED = new gn6("RECENTLY_PLAYED", 1, hn6Var);
        MOST_PLAYED = new gn6("MOST_PLAYED", 2, hn6Var);
        gn6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private gn6(String str, int i, hn6 hn6Var) {
        this.defaultOrder = hn6Var;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static gn6 valueOf(String str) {
        return (gn6) Enum.valueOf(gn6.class, str);
    }

    public static gn6[] values() {
        return (gn6[]) $VALUES.clone();
    }

    public final hn6 getDefaultOrder() {
        return this.defaultOrder;
    }
}
