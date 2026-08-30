package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x77  reason: default package */
/* loaded from: classes.dex */
public final class x77 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ x77[] $VALUES;
    public static final x77 ALPHA = new x77("ALPHA", 0);
    public static final x77 BETA = new x77("BETA", 1);
    public static final x77 RC = new x77("RC", 2);
    public static final x77 FINAL = new x77("FINAL", 3);
    public static final x77 NIGHTLY = new x77("NIGHTLY", 4);

    private static final /* synthetic */ x77[] $values() {
        return new x77[]{ALPHA, BETA, RC, FINAL, NIGHTLY};
    }

    static {
        x77[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private x77(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static x77 valueOf(String str) {
        return (x77) Enum.valueOf(x77.class, str);
    }

    public static x77[] values() {
        return (x77[]) $VALUES.clone();
    }
}
