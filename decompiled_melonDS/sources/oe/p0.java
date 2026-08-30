package oe;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p0 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ p0[] $VALUES;
    public static final p0 ALPHABETICALLY = new p0("ALPHABETICALLY", 0, q0.ASCENDING);
    public static final p0 RECENTLY_PLAYED = new p0("RECENTLY_PLAYED", 1, q0.DESCENDING);
    private final q0 defaultOrder;

    private static final /* synthetic */ p0[] $values() {
        return new p0[]{ALPHABETICALLY, RECENTLY_PLAYED};
    }

    static {
        p0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private p0(String str, int i2, q0 q0Var) {
        this.defaultOrder = q0Var;
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) $VALUES.clone();
    }

    public final q0 getDefaultOrder() {
        return this.defaultOrder;
    }
}
