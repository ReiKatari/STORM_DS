package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kd3  reason: default package */
/* loaded from: classes.dex */
public final class kd3 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ kd3[] $VALUES;
    public static final kd3 FOLLOW_SYSTEM = new kd3("FOLLOW_SYSTEM", 0);
    public static final kd3 PORTRAIT = new kd3("PORTRAIT", 1);
    public static final kd3 LANDSCAPE = new kd3("LANDSCAPE", 2);

    private static final /* synthetic */ kd3[] $values() {
        return new kd3[]{FOLLOW_SYSTEM, PORTRAIT, LANDSCAPE};
    }

    static {
        kd3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private kd3(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static kd3 valueOf(String str) {
        return (kd3) Enum.valueOf(kd3.class, str);
    }

    public static kd3[] values() {
        return (kd3[]) $VALUES.clone();
    }
}
