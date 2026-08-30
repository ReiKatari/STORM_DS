package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yc7  reason: default package */
/* loaded from: classes.dex */
public final class yc7 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ yc7[] $VALUES;
    public static final yc7 SYSTEM = new yc7("SYSTEM", 0);
    public static final yc7 CUSTOM = new yc7("CUSTOM", 1);

    private static final /* synthetic */ yc7[] $values() {
        return new yc7[]{SYSTEM, CUSTOM};
    }

    static {
        yc7[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private yc7(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static yc7 valueOf(String str) {
        return (yc7) Enum.valueOf(yc7.class, str);
    }

    public static yc7[] values() {
        return (yc7[]) $VALUES.clone();
    }
}
