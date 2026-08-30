package l1;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c0 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ c0[] $VALUES;
    public static final c0 Vertical = new c0("Vertical", 0);
    public static final c0 Horizontal = new c0("Horizontal", 1);
    public static final c0 Both = new c0("Both", 2);

    private static final /* synthetic */ c0[] $values() {
        return new c0[]{Vertical, Horizontal, Both};
    }

    static {
        c0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private c0(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) $VALUES.clone();
    }
}
