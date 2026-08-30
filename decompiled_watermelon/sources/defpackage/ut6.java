package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ut6  reason: default package */
/* loaded from: classes.dex */
public final class ut6 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ ut6[] $VALUES;
    public static final tt6 Companion;
    private final String javaName;
    public static final ut6 TLS_1_3 = new ut6("TLS_1_3", 0, "TLSv1.3");
    public static final ut6 TLS_1_2 = new ut6("TLS_1_2", 1, "TLSv1.2");
    public static final ut6 TLS_1_1 = new ut6("TLS_1_1", 2, "TLSv1.1");
    public static final ut6 TLS_1_0 = new ut6("TLS_1_0", 3, "TLSv1");
    public static final ut6 SSL_3_0 = new ut6("SSL_3_0", 4, "SSLv3");

    private static final /* synthetic */ ut6[] $values() {
        return new ut6[]{TLS_1_3, TLS_1_2, TLS_1_1, TLS_1_0, SSL_3_0};
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [tt6, java.lang.Object] */
    static {
        ut6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
        Companion = new Object();
    }

    private ut6(String str, int i, String str2) {
        this.javaName = str2;
    }

    public static final ut6 forJavaName(String str) {
        Companion.getClass();
        return tt6.a(str);
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static ut6 valueOf(String str) {
        return (ut6) Enum.valueOf(ut6.class, str);
    }

    public static ut6[] values() {
        return (ut6[]) $VALUES.clone();
    }

    @zd1
    /* renamed from: -deprecated_javaName  reason: not valid java name */
    public final String m15deprecated_javaName() {
        return this.javaName;
    }

    public final String javaName() {
        return this.javaName;
    }
}
