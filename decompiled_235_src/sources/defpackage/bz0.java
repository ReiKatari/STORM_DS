package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bz0  reason: default package */
/* loaded from: classes.dex */
public final class bz0 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ bz0[] $VALUES;
    public static final bz0 PRESENT = new bz0("PRESENT", 0);
    public static final bz0 MISSING = new bz0("MISSING", 1);
    public static final bz0 INVALID = new bz0("INVALID", 2);

    private static final /* synthetic */ bz0[] $values() {
        return new bz0[]{PRESENT, MISSING, INVALID};
    }

    static {
        bz0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private bz0(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static bz0 valueOf(String str) {
        return (bz0) Enum.valueOf(bz0.class, str);
    }

    public static bz0[] values() {
        return (bz0[]) $VALUES.clone();
    }
}
