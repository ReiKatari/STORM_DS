package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: jb4 */
/* loaded from: classes.dex */
public final class jb4 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ jb4[] $VALUES;
    private static final gh3 $cachedSerializer$delegate;
    public static final ib4 Companion;
    public static final jb4 UNKNOWN = new jb4("UNKNOWN", 0);
    public static final jb4 SOFTCORE = new jb4("SOFTCORE", 1);
    public static final jb4 HARDCORE = new jb4("HARDCORE", 2);

    private static final /* synthetic */ jb4[] $values() {
        return new jb4[]{UNKNOWN, SOFTCORE, HARDCORE};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, ib4] */
    static {
        jb4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
        Companion = new Object();
        $cachedSerializer$delegate = yf2.H(wk3.PUBLICATION, new vq3(16));
    }

    private jb4(String str, int i) {
        super(str, i);
    }

    public static final m93 _init_$_anonymous_() {
        jb4[] values = values();
        values.getClass();
        return new g12("me.magnum.melonds.impl.retroachievements.offline.OfflineUnlockMode", values);
    }

    public static /* synthetic */ m93 a() {
        return _init_$_anonymous_();
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static jb4 valueOf(String str) {
        return (jb4) Enum.valueOf(jb4.class, str);
    }

    public static jb4[] values() {
        return (jb4[]) $VALUES.clone();
    }
}
