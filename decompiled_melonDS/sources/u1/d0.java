package u1;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ d0[] $VALUES;
    public static final d0 None = new d0("None", 0);
    public static final d0 Selection = new d0("Selection", 1);
    public static final d0 Cursor = new d0("Cursor", 2);

    private static final /* synthetic */ d0[] $values() {
        return new d0[]{None, Selection, Cursor};
    }

    static {
        d0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private d0(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) $VALUES.clone();
    }
}
