package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dw4  reason: default package */
/* loaded from: classes.dex */
public final class dw4 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ dw4[] $VALUES;
    public static final cw4 Companion;
    private final String protocol;
    public static final dw4 HTTP_1_0 = new dw4("HTTP_1_0", 0, "http/1.0");
    public static final dw4 HTTP_1_1 = new dw4("HTTP_1_1", 1, "http/1.1");
    @zd1
    public static final dw4 SPDY_3 = new dw4("SPDY_3", 2, "spdy/3.1");
    public static final dw4 HTTP_2 = new dw4("HTTP_2", 3, "h2");
    public static final dw4 H2_PRIOR_KNOWLEDGE = new dw4("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
    public static final dw4 QUIC = new dw4("QUIC", 5, "quic");
    public static final dw4 HTTP_3 = new dw4("HTTP_3", 6, "h3");

    private static final /* synthetic */ dw4[] $values() {
        return new dw4[]{HTTP_1_0, HTTP_1_1, SPDY_3, HTTP_2, H2_PRIOR_KNOWLEDGE, QUIC, HTTP_3};
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [cw4, java.lang.Object] */
    static {
        dw4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
        Companion = new Object();
    }

    private dw4(String str, int i, String str2) {
        this.protocol = str2;
    }

    public static final dw4 get(String str) {
        Companion.getClass();
        return cw4.a(str);
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static dw4 valueOf(String str) {
        return (dw4) Enum.valueOf(dw4.class, str);
    }

    public static dw4[] values() {
        return (dw4[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
