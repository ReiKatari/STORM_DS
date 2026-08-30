package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u37  reason: default package */
/* loaded from: classes.dex */
public final class u37 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ u37[] $VALUES;
    public static final u37 SIZE_MISMATCH = new u37("SIZE_MISMATCH", 0);
    public static final u37 PACKAGE_MISMATCH = new u37("PACKAGE_MISMATCH", 1);
    public static final u37 VERSION_CODE_NOT_NEWER = new u37("VERSION_CODE_NOT_NEWER", 2);
    public static final u37 VERSION_NAME_MISMATCH = new u37("VERSION_NAME_MISMATCH", 3);
    public static final u37 SIGNATURE_MISMATCH = new u37("SIGNATURE_MISMATCH", 4);

    private static final /* synthetic */ u37[] $values() {
        return new u37[]{SIZE_MISMATCH, PACKAGE_MISMATCH, VERSION_CODE_NOT_NEWER, VERSION_NAME_MISMATCH, SIGNATURE_MISMATCH};
    }

    static {
        u37[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private u37(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static u37 valueOf(String str) {
        return (u37) Enum.valueOf(u37.class, str);
    }

    public static u37[] values() {
        return (u37[]) $VALUES.clone();
    }
}
