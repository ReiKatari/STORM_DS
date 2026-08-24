package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cz0  reason: default package */
/* loaded from: classes.dex */
public final class cz0 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ cz0[] $VALUES;
    public static final cz0 UNSET = new cz0("UNSET", 0);
    public static final cz0 INVALID = new cz0("INVALID", 1);
    public static final cz0 VALID = new cz0("VALID", 2);

    private static final /* synthetic */ cz0[] $values() {
        return new cz0[]{UNSET, INVALID, VALID};
    }

    static {
        cz0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private cz0(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static cz0 valueOf(String str) {
        return (cz0) Enum.valueOf(cz0.class, str);
    }

    public static cz0[] values() {
        return (cz0[]) $VALUES.clone();
    }
}
