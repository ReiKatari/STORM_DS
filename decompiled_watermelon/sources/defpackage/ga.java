package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ga  reason: default package */
/* loaded from: classes.dex */
public final class ga {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ ga[] $VALUES;
    public static final ga UnsupportedBuild = new ga("UnsupportedBuild", 0);
    public static final ga NotZip = new ga("NotZip", 1);
    public static final ga InvalidZip = new ga("InvalidZip", 2);
    public static final ga NoDriver = new ga("NoDriver", 3);
    public static final ga AmbiguousDriver = new ga("AmbiguousDriver", 4);

    private static final /* synthetic */ ga[] $values() {
        return new ga[]{UnsupportedBuild, NotZip, InvalidZip, NoDriver, AmbiguousDriver};
    }

    static {
        ga[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private ga(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static ga valueOf(String str) {
        return (ga) Enum.valueOf(ga.class, str);
    }

    public static ga[] values() {
        return (ga[]) $VALUES.clone();
    }
}
