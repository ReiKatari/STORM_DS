package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qb6  reason: default package */
/* loaded from: classes.dex */
public final class qb6 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ qb6[] $VALUES;
    public static final qb6 ALPHABETICALLY = new qb6("ALPHABETICALLY", 0, rb6.ASCENDING);
    public static final qb6 MOST_PLAYED;
    public static final qb6 RECENTLY_PLAYED;
    private final rb6 defaultOrder;

    private static final /* synthetic */ qb6[] $values() {
        return new qb6[]{ALPHABETICALLY, RECENTLY_PLAYED, MOST_PLAYED};
    }

    static {
        rb6 rb6Var = rb6.DESCENDING;
        RECENTLY_PLAYED = new qb6("RECENTLY_PLAYED", 1, rb6Var);
        MOST_PLAYED = new qb6("MOST_PLAYED", 2, rb6Var);
        qb6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private qb6(String str, int i, rb6 rb6Var) {
        this.defaultOrder = rb6Var;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static qb6 valueOf(String str) {
        return (qb6) Enum.valueOf(qb6.class, str);
    }

    public static qb6[] values() {
        return (qb6[]) $VALUES.clone();
    }

    public final rb6 getDefaultOrder() {
        return this.defaultOrder;
    }
}
