package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: dj4  reason: default package */
/* loaded from: classes.dex */
public final class dj4 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ dj4[] $VALUES;
    private static final go3 $cachedSerializer$delegate;
    public static final cj4 Companion;
    public static final dj4 SESSION_START = new dj4("SESSION_START", 0);
    public static final dj4 SESSION_END = new dj4("SESSION_END", 1);
    public static final dj4 ACHIEVEMENT_UNLOCK = new dj4("ACHIEVEMENT_UNLOCK", 2);
    public static final dj4 ACHIEVEMENT_ACK = new dj4("ACHIEVEMENT_ACK", 3);

    private static final /* synthetic */ dj4[] $values() {
        return new dj4[]{SESSION_START, SESSION_END, ACHIEVEMENT_UNLOCK, ACHIEVEMENT_ACK};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, cj4] */
    static {
        dj4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
        Companion = new Object();
        $cachedSerializer$delegate = kj2.M(xr3.PUBLICATION, new pi3(19));
    }

    private dj4(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg3 _init_$_anonymous_() {
        dj4[] values = values();
        values.getClass();
        return new v52("me.magnum.melonds.impl.retroachievements.offline.OfflineLedgerRecordType", values);
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static dj4 valueOf(String str) {
        return (dj4) Enum.valueOf(dj4.class, str);
    }

    public static dj4[] values() {
        return (dj4[]) $VALUES.clone();
    }
}
