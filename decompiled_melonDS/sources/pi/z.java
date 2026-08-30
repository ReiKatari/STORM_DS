package pi;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ z[] $VALUES;
    public static final y Companion;
    private final String protocol;
    public static final z HTTP_1_0 = new z("HTTP_1_0", 0, "http/1.0");
    public static final z HTTP_1_1 = new z("HTTP_1_1", 1, "http/1.1");
    @yb.c
    public static final z SPDY_3 = new z("SPDY_3", 2, "spdy/3.1");
    public static final z HTTP_2 = new z("HTTP_2", 3, "h2");
    public static final z H2_PRIOR_KNOWLEDGE = new z("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
    public static final z QUIC = new z("QUIC", 5, "quic");
    public static final z HTTP_3 = new z("HTTP_3", 6, "h3");

    private static final /* synthetic */ z[] $values() {
        return new z[]{HTTP_1_0, HTTP_1_1, SPDY_3, HTTP_2, H2_PRIOR_KNOWLEDGE, QUIC, HTTP_3};
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [pi.y, java.lang.Object] */
    static {
        z[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
        Companion = new Object();
    }

    private z(String str, int i2, String str2) {
        this.protocol = str2;
    }

    public static final z get(String str) {
        Companion.getClass();
        return y.a(str);
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
