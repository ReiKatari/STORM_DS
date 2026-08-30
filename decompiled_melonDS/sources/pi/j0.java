package pi;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j0 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ j0[] $VALUES;
    public static final i0 Companion;
    private final String javaName;
    public static final j0 TLS_1_3 = new j0("TLS_1_3", 0, "TLSv1.3");
    public static final j0 TLS_1_2 = new j0("TLS_1_2", 1, "TLSv1.2");
    public static final j0 TLS_1_1 = new j0("TLS_1_1", 2, "TLSv1.1");
    public static final j0 TLS_1_0 = new j0("TLS_1_0", 3, "TLSv1");
    public static final j0 SSL_3_0 = new j0("SSL_3_0", 4, "SSLv3");

    private static final /* synthetic */ j0[] $values() {
        return new j0[]{TLS_1_3, TLS_1_2, TLS_1_1, TLS_1_0, SSL_3_0};
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [pi.i0, java.lang.Object] */
    static {
        j0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
        Companion = new Object();
    }

    private j0(String str, int i2, String str2) {
        this.javaName = str2;
    }

    public static final j0 forJavaName(String str) {
        Companion.getClass();
        return i0.a(str);
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) $VALUES.clone();
    }

    @yb.c
    /* renamed from: -deprecated_javaName  reason: not valid java name */
    public final String m16deprecated_javaName() {
        return this.javaName;
    }

    public final String javaName() {
        return this.javaName;
    }
}
