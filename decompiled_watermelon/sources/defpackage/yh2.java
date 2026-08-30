package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yh2  reason: default package */
/* loaded from: classes.dex */
public final class yh2 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ yh2[] $VALUES;
    public static final yh2 ON_CONFIGURE = new yh2("ON_CONFIGURE", 0);
    public static final yh2 ON_CREATE = new yh2("ON_CREATE", 1);
    public static final yh2 ON_UPGRADE = new yh2("ON_UPGRADE", 2);
    public static final yh2 ON_DOWNGRADE = new yh2("ON_DOWNGRADE", 3);
    public static final yh2 ON_OPEN = new yh2("ON_OPEN", 4);

    private static final /* synthetic */ yh2[] $values() {
        return new yh2[]{ON_CONFIGURE, ON_CREATE, ON_UPGRADE, ON_DOWNGRADE, ON_OPEN};
    }

    static {
        yh2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private yh2(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static yh2 valueOf(String str) {
        return (yh2) Enum.valueOf(yh2.class, str);
    }

    public static yh2[] values() {
        return (yh2[]) $VALUES.clone();
    }
}
