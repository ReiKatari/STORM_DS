package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: ga4  reason: default package */
/* loaded from: classes.dex */
public final class ga4 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ ga4[] $VALUES;
    private static final gh3 $cachedSerializer$delegate;
    public static final fa4 Companion;
    public static final ga4 SESSION_START = new ga4("SESSION_START", 0);
    public static final ga4 SESSION_END = new ga4("SESSION_END", 1);
    public static final ga4 ACHIEVEMENT_UNLOCK = new ga4("ACHIEVEMENT_UNLOCK", 2);
    public static final ga4 ACHIEVEMENT_ACK = new ga4("ACHIEVEMENT_ACK", 3);

    private static final /* synthetic */ ga4[] $values() {
        return new ga4[]{SESSION_START, SESSION_END, ACHIEVEMENT_UNLOCK, ACHIEVEMENT_ACK};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [fa4, java.lang.Object] */
    static {
        ga4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
        Companion = new Object();
        $cachedSerializer$delegate = yf2.H(wk3.PUBLICATION, new vq3(13));
    }

    private ga4(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m93 _init_$_anonymous_() {
        ga4[] values = values();
        values.getClass();
        return new g12("me.magnum.melonds.impl.retroachievements.offline.OfflineLedgerRecordType", values);
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static ga4 valueOf(String str) {
        return (ga4) Enum.valueOf(ga4.class, str);
    }

    public static ga4[] values() {
        return (ga4[]) $VALUES.clone();
    }
}
