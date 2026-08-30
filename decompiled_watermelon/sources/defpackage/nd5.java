package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nd5  reason: default package */
/* loaded from: classes.dex */
public final class nd5 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ nd5[] $VALUES;
    public static final nd5 FETCHING_LATEST_DATA = new nd5("FETCHING_LATEST_DATA", 0);

    private static final /* synthetic */ nd5[] $values() {
        return new nd5[]{FETCHING_LATEST_DATA};
    }

    static {
        nd5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private nd5(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static nd5 valueOf(String str) {
        return (nd5) Enum.valueOf(nd5.class, str);
    }

    public static nd5[] values() {
        return (nd5[]) $VALUES.clone();
    }
}
