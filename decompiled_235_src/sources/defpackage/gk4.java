package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: gk4 */
/* loaded from: classes.dex */
public final class gk4 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ gk4[] $VALUES;
    private static final go3 $cachedSerializer$delegate;
    public static final fk4 Companion;
    public static final gk4 UNKNOWN = new gk4("UNKNOWN", 0);
    public static final gk4 SOFTCORE = new gk4("SOFTCORE", 1);
    public static final gk4 HARDCORE = new gk4("HARDCORE", 2);

    private static final /* synthetic */ gk4[] $values() {
        return new gk4[]{UNKNOWN, SOFTCORE, HARDCORE};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, fk4] */
    static {
        gk4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
        Companion = new Object();
        $cachedSerializer$delegate = kj2.M(xr3.PUBLICATION, new pi3(22));
    }

    private gk4(String str, int i) {
        super(str, i);
    }

    public static final gg3 _init_$_anonymous_() {
        gk4[] values = values();
        values.getClass();
        return new v52("me.magnum.melonds.impl.retroachievements.offline.OfflineUnlockMode", values);
    }

    public static /* synthetic */ gg3 a() {
        return _init_$_anonymous_();
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static gk4 valueOf(String str) {
        return (gk4) Enum.valueOf(gk4.class, str);
    }

    public static gk4[] values() {
        return (gk4[]) $VALUES.clone();
    }
}
