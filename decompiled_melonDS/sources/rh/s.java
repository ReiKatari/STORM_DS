package rh;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s WIDTH = new s("WIDTH", 0);
    public static final s HEIGHT = new s("HEIGHT", 1);

    private static final /* synthetic */ s[] $values() {
        return new s[]{WIDTH, HEIGHT};
    }

    static {
        s[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private s(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
