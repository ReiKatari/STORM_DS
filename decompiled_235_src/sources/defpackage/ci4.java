package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ci4  reason: default package */
/* loaded from: classes.dex */
public final class ci4 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ci4[] $VALUES;
    public static final ci4 NO_OP = new ci4("NO_OP", 0);
    public static final ci4 ADD = new ci4("ADD", 1);
    public static final ci4 REMOVE = new ci4("REMOVE", 2);

    private static final /* synthetic */ ci4[] $values() {
        return new ci4[]{NO_OP, ADD, REMOVE};
    }

    static {
        ci4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private ci4(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ci4 valueOf(String str) {
        return (ci4) Enum.valueOf(ci4.class, str);
    }

    public static ci4[] values() {
        return (ci4[]) $VALUES.clone();
    }
}
