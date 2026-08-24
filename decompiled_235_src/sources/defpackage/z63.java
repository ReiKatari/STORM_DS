package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z63  reason: default package */
/* loaded from: classes.dex */
public final class z63 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ z63[] $VALUES;
    public static final z63 Focused = new z63("Focused", 0);
    public static final z63 UnfocusedEmpty = new z63("UnfocusedEmpty", 1);
    public static final z63 UnfocusedNotEmpty = new z63("UnfocusedNotEmpty", 2);

    private static final /* synthetic */ z63[] $values() {
        return new z63[]{Focused, UnfocusedEmpty, UnfocusedNotEmpty};
    }

    static {
        z63[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private z63(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static z63 valueOf(String str) {
        return (z63) Enum.valueOf(z63.class, str);
    }

    public static z63[] values() {
        return (z63[]) $VALUES.clone();
    }
}
