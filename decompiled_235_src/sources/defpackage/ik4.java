package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: ik4 */
/* loaded from: classes.dex */
public final class ik4 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ik4[] $VALUES;
    private static final go3 $cachedSerializer$delegate;
    public static final hk4 Companion;
    public static final ik4 UNKNOWN = new ik4("UNKNOWN", 0);
    public static final ik4 OFFLINE_FROM_START = new ik4("OFFLINE_FROM_START", 1);
    public static final ik4 OFFLINE_AFTER_START = new ik4("OFFLINE_AFTER_START", 2);

    private static final /* synthetic */ ik4[] $values() {
        return new ik4[]{UNKNOWN, OFFLINE_FROM_START, OFFLINE_AFTER_START};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [hk4, java.lang.Object] */
    static {
        ik4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
        Companion = new Object();
        $cachedSerializer$delegate = kj2.M(xr3.PUBLICATION, new pi3(23));
    }

    private ik4(String str, int i) {
        super(str, i);
    }

    public static final gg3 _init_$_anonymous_() {
        ik4[] values = values();
        values.getClass();
        return new v52("me.magnum.melonds.impl.retroachievements.offline.OfflineUnlockType", values);
    }

    public static /* synthetic */ gg3 a() {
        return _init_$_anonymous_();
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ik4 valueOf(String str) {
        return (ik4) Enum.valueOf(ik4.class, str);
    }

    public static ik4[] values() {
        return (ik4[]) $VALUES.clone();
    }
}
