package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w77  reason: default package */
/* loaded from: classes.dex */
public final class w77 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ w77[] $VALUES;
    public static final w77 STRICT = new w77("STRICT", 0);
    public static final w77 LOG = new w77("LOG", 1);
    public static final w77 QUIET = new w77("QUIET", 2);

    private static final /* synthetic */ w77[] $values() {
        return new w77[]{STRICT, LOG, QUIET};
    }

    static {
        w77[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private w77(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static w77 valueOf(String str) {
        return (w77) Enum.valueOf(w77.class, str);
    }

    public static w77[] values() {
        return (w77[]) $VALUES.clone();
    }
}
