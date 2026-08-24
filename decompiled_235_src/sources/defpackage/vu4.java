package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vu4  reason: default package */
/* loaded from: classes.dex */
public final class vu4 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ vu4[] $VALUES;
    public static final vu4 Invalid = new vu4("Invalid", 0);
    public static final vu4 Cancelled = new vu4("Cancelled", 1);
    public static final vu4 InitialPending = new vu4("InitialPending", 2);
    public static final vu4 RecomposePending = new vu4("RecomposePending", 3);
    public static final vu4 Recomposing = new vu4("Recomposing", 4);
    public static final vu4 ApplyPending = new vu4("ApplyPending", 5);
    public static final vu4 Applied = new vu4("Applied", 6);

    private static final /* synthetic */ vu4[] $values() {
        return new vu4[]{Invalid, Cancelled, InitialPending, RecomposePending, Recomposing, ApplyPending, Applied};
    }

    static {
        vu4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private vu4(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static vu4 valueOf(String str) {
        return (vu4) Enum.valueOf(vu4.class, str);
    }

    public static vu4[] values() {
        return (vu4[]) $VALUES.clone();
    }
}
