package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sp5  reason: default package */
/* loaded from: classes.dex */
public final class sp5 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ sp5[] $VALUES;
    public static final sp5 SCANNING = new sp5("SCANNING", 0);
    public static final sp5 NOT_SCANNING = new sp5("NOT_SCANNING", 1);

    private static final /* synthetic */ sp5[] $values() {
        return new sp5[]{SCANNING, NOT_SCANNING};
    }

    static {
        sp5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private sp5(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static sp5 valueOf(String str) {
        return (sp5) Enum.valueOf(sp5.class, str);
    }

    public static sp5[] values() {
        return (sp5[]) $VALUES.clone();
    }
}
