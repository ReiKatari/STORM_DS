package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u82  reason: default package */
/* loaded from: classes.dex */
public final class u82 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ u82[] $VALUES;
    public static final u82 MIRROR = new u82("MIRROR", 0);
    public static final u82 MELON_DUAL_DS = new u82("MELON_DUAL_DS", 1);

    private static final /* synthetic */ u82[] $values() {
        return new u82[]{MIRROR, MELON_DUAL_DS};
    }

    static {
        u82[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private u82(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static u82 valueOf(String str) {
        return (u82) Enum.valueOf(u82.class, str);
    }

    public static u82[] values() {
        return (u82[]) $VALUES.clone();
    }
}
