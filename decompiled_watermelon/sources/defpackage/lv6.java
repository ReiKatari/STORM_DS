package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lv6  reason: default package */
/* loaded from: classes.dex */
public final class lv6 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ lv6[] $VALUES;
    public static final lv6 On = new lv6("On", 0);
    public static final lv6 Off = new lv6("Off", 1);
    public static final lv6 Indeterminate = new lv6("Indeterminate", 2);

    private static final /* synthetic */ lv6[] $values() {
        return new lv6[]{On, Off, Indeterminate};
    }

    static {
        lv6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private lv6(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static lv6 valueOf(String str) {
        return (lv6) Enum.valueOf(lv6.class, str);
    }

    public static lv6[] values() {
        return (lv6[]) $VALUES.clone();
    }
}
