package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ph7  reason: default package */
/* loaded from: classes.dex */
public final class ph7 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ph7[] $VALUES;
    public static final ph7 SIZE_MISMATCH = new ph7("SIZE_MISMATCH", 0);
    public static final ph7 PACKAGE_MISMATCH = new ph7("PACKAGE_MISMATCH", 1);
    public static final ph7 VERSION_CODE_NOT_NEWER = new ph7("VERSION_CODE_NOT_NEWER", 2);
    public static final ph7 VERSION_NAME_MISMATCH = new ph7("VERSION_NAME_MISMATCH", 3);
    public static final ph7 SIGNATURE_MISMATCH = new ph7("SIGNATURE_MISMATCH", 4);

    private static final /* synthetic */ ph7[] $values() {
        return new ph7[]{SIZE_MISMATCH, PACKAGE_MISMATCH, VERSION_CODE_NOT_NEWER, VERSION_NAME_MISMATCH, SIGNATURE_MISMATCH};
    }

    static {
        ph7[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private ph7(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ph7 valueOf(String str) {
        return (ph7) Enum.valueOf(ph7.class, str);
    }

    public static ph7[] values() {
        return (ph7[]) $VALUES.clone();
    }
}
