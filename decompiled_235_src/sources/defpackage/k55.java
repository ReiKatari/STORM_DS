package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k55  reason: default package */
/* loaded from: classes.dex */
public final class k55 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ k55[] $VALUES;
    public static final j55 Companion;
    private final String protocol;
    public static final k55 HTTP_1_0 = new k55("HTTP_1_0", 0, "http/1.0");
    public static final k55 HTTP_1_1 = new k55("HTTP_1_1", 1, "http/1.1");
    @di1
    public static final k55 SPDY_3 = new k55("SPDY_3", 2, "spdy/3.1");
    public static final k55 HTTP_2 = new k55("HTTP_2", 3, "h2");
    public static final k55 H2_PRIOR_KNOWLEDGE = new k55("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
    public static final k55 QUIC = new k55("QUIC", 5, "quic");
    public static final k55 HTTP_3 = new k55("HTTP_3", 6, "h3");

    private static final /* synthetic */ k55[] $values() {
        return new k55[]{HTTP_1_0, HTTP_1_1, SPDY_3, HTTP_2, H2_PRIOR_KNOWLEDGE, QUIC, HTTP_3};
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, j55] */
    static {
        k55[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
        Companion = new Object();
    }

    private k55(String str, int i, String str2) {
        this.protocol = str2;
    }

    public static final k55 get(String str) {
        Companion.getClass();
        return j55.a(str);
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static k55 valueOf(String str) {
        return (k55) Enum.valueOf(k55.class, str);
    }

    public static k55[] values() {
        return (k55[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
