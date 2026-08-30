package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ul3  reason: default package */
/* loaded from: classes.dex */
public final class ul3 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ ul3[] $VALUES;
    public static final ul3 RC_CLIENT = new ul3("RC_CLIENT", 0);
    public static final ul3 LEGACY = new ul3("LEGACY", 1);
    public static final ul3 NONE = new ul3("NONE", 2);

    private static final /* synthetic */ ul3[] $values() {
        return new ul3[]{RC_CLIENT, LEGACY, NONE};
    }

    static {
        ul3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private ul3(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static ul3 valueOf(String str) {
        return (ul3) Enum.valueOf(ul3.class, str);
    }

    public static ul3[] values() {
        return (ul3[]) $VALUES.clone();
    }
}
