package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nj6  reason: default package */
/* loaded from: classes.dex */
public final class nj6 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ nj6[] $VALUES;
    public static final nj6 PRIV = new nj6("PRIV", 0);
    public static final nj6 YUV = new nj6("YUV", 1);
    public static final nj6 JPEG = new nj6("JPEG", 2);
    public static final nj6 JPEG_R = new nj6("JPEG_R", 3);
    public static final nj6 RAW = new nj6("RAW", 4);

    private static final /* synthetic */ nj6[] $values() {
        return new nj6[]{PRIV, YUV, JPEG, JPEG_R, RAW};
    }

    static {
        nj6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private nj6(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static nj6 valueOf(String str) {
        return (nj6) Enum.valueOf(nj6.class, str);
    }

    public static nj6[] values() {
        return (nj6[]) $VALUES.clone();
    }
}
