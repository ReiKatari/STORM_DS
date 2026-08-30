package b4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t2 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ t2[] $VALUES;
    public static final t2 Shown = new t2("Shown", 0);
    public static final t2 Hidden = new t2("Hidden", 1);

    private static final /* synthetic */ t2[] $values() {
        return new t2[]{Shown, Hidden};
    }

    static {
        t2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private t2(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static t2 valueOf(String str) {
        return (t2) Enum.valueOf(t2.class, str);
    }

    public static t2[] values() {
        return (t2[]) $VALUES.clone();
    }
}
