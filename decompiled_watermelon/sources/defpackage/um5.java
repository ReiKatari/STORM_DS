package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: um5  reason: default package */
/* loaded from: classes.dex */
public final class um5 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ um5[] $VALUES;
    public static final um5 NONE = new um5("NONE", 0);
    public static final um5 LINEAR = new um5("LINEAR", 1);

    private static final /* synthetic */ um5[] $values() {
        return new um5[]{NONE, LINEAR};
    }

    static {
        um5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private um5(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static um5 valueOf(String str) {
        return (um5) Enum.valueOf(um5.class, str);
    }

    public static um5[] values() {
        return (um5[]) $VALUES.clone();
    }
}
