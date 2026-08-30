package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jd5  reason: default package */
/* loaded from: classes.dex */
public final class jd5 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ jd5[] $VALUES;
    public static final jd5 OFFICIAL = new jd5("OFFICIAL", 0);
    public static final jd5 RA_OFFLINE_PROXY = new jd5("RA_OFFLINE_PROXY", 1);
    public static final jd5 RA_OFFLINE_PROXY_UNAVAILABLE = new jd5("RA_OFFLINE_PROXY_UNAVAILABLE", 2);

    private static final /* synthetic */ jd5[] $values() {
        return new jd5[]{OFFICIAL, RA_OFFLINE_PROXY, RA_OFFLINE_PROXY_UNAVAILABLE};
    }

    static {
        jd5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private jd5(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static jd5 valueOf(String str) {
        return (jd5) Enum.valueOf(jd5.class, str);
    }

    public static jd5[] values() {
        return (jd5[]) $VALUES.clone();
    }
}
