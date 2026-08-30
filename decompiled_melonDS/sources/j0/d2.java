package j0;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d2 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ d2[] $VALUES;
    public static final d2 PRIV = new d2("PRIV", 0);
    public static final d2 YUV = new d2("YUV", 1);
    public static final d2 JPEG = new d2("JPEG", 2);
    public static final d2 JPEG_R = new d2("JPEG_R", 3);
    public static final d2 RAW = new d2("RAW", 4);

    private static final /* synthetic */ d2[] $values() {
        return new d2[]{PRIV, YUV, JPEG, JPEG_R, RAW};
    }

    static {
        d2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private d2(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static d2 valueOf(String str) {
        return (d2) Enum.valueOf(d2.class, str);
    }

    public static d2[] values() {
        return (d2[]) $VALUES.clone();
    }
}
