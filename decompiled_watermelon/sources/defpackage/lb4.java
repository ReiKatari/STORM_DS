package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: lb4 */
/* loaded from: classes.dex */
public final class lb4 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ lb4[] $VALUES;
    private static final gh3 $cachedSerializer$delegate;
    public static final kb4 Companion;
    public static final lb4 UNKNOWN = new lb4("UNKNOWN", 0);
    public static final lb4 OFFLINE_FROM_START = new lb4("OFFLINE_FROM_START", 1);
    public static final lb4 OFFLINE_AFTER_START = new lb4("OFFLINE_AFTER_START", 2);

    private static final /* synthetic */ lb4[] $values() {
        return new lb4[]{UNKNOWN, OFFLINE_FROM_START, OFFLINE_AFTER_START};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kb4] */
    static {
        lb4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
        Companion = new Object();
        $cachedSerializer$delegate = yf2.H(wk3.PUBLICATION, new vq3(17));
    }

    private lb4(String str, int i) {
        super(str, i);
    }

    public static final m93 _init_$_anonymous_() {
        lb4[] values = values();
        values.getClass();
        return new g12("me.magnum.melonds.impl.retroachievements.offline.OfflineUnlockType", values);
    }

    public static /* synthetic */ m93 a() {
        return _init_$_anonymous_();
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static lb4 valueOf(String str) {
        return (lb4) Enum.valueOf(lb4.class, str);
    }

    public static lb4[] values() {
        return (lb4[]) $VALUES.clone();
    }
}
