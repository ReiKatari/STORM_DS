package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qd5  reason: default package */
/* loaded from: classes.dex */
public final class qd5 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ qd5[] $VALUES;
    public static final pd5 Companion;
    private final String preferenceValue;
    public static final qd5 BUILT_IN = new qd5("BUILT_IN", 0, "built_in");
    public static final qd5 RA_OFFLINE_PROXY = new qd5("RA_OFFLINE_PROXY", 1, "ra_offline_proxy");

    private static final /* synthetic */ qd5[] $values() {
        return new qd5[]{BUILT_IN, RA_OFFLINE_PROXY};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [pd5, java.lang.Object] */
    static {
        qd5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
        Companion = new Object();
    }

    private qd5(String str, int i, String str2) {
        this.preferenceValue = str2;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static qd5 valueOf(String str) {
        return (qd5) Enum.valueOf(qd5.class, str);
    }

    public static qd5[] values() {
        return (qd5[]) $VALUES.clone();
    }

    public final String getPreferenceValue() {
        return this.preferenceValue;
    }
}
