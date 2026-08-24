package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l67  reason: default package */
/* loaded from: classes.dex */
public final class l67 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ l67[] $VALUES;
    public static final k67 Companion;
    private final String javaName;
    public static final l67 TLS_1_3 = new l67("TLS_1_3", 0, "TLSv1.3");
    public static final l67 TLS_1_2 = new l67("TLS_1_2", 1, "TLSv1.2");
    public static final l67 TLS_1_1 = new l67("TLS_1_1", 2, "TLSv1.1");
    public static final l67 TLS_1_0 = new l67("TLS_1_0", 3, "TLSv1");
    public static final l67 SSL_3_0 = new l67("SSL_3_0", 4, "SSLv3");

    private static final /* synthetic */ l67[] $values() {
        return new l67[]{TLS_1_3, TLS_1_2, TLS_1_1, TLS_1_0, SSL_3_0};
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, k67] */
    static {
        l67[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
        Companion = new Object();
    }

    private l67(String str, int i, String str2) {
        this.javaName = str2;
    }

    public static final l67 forJavaName(String str) {
        Companion.getClass();
        return k67.a(str);
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static l67 valueOf(String str) {
        return (l67) Enum.valueOf(l67.class, str);
    }

    public static l67[] values() {
        return (l67[]) $VALUES.clone();
    }

    @di1
    /* renamed from: -deprecated_javaName  reason: not valid java name */
    public final String m4deprecated_javaName() {
        return this.javaName;
    }

    public final String javaName() {
        return this.javaName;
    }
}
