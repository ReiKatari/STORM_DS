package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g81  reason: default package */
/* loaded from: classes.dex */
public final class g81 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ g81[] $VALUES;
    public static final g81 None = new g81("None", 0);
    public static final g81 Cancelled = new g81("Cancelled", 1);
    public static final g81 Redirected = new g81("Redirected", 2);
    public static final g81 RedirectCancelled = new g81("RedirectCancelled", 3);

    private static final /* synthetic */ g81[] $values() {
        return new g81[]{None, Cancelled, Redirected, RedirectCancelled};
    }

    static {
        g81[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private g81(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static g81 valueOf(String str) {
        return (g81) Enum.valueOf(g81.class, str);
    }

    public static g81[] values() {
        return (g81[]) $VALUES.clone();
    }
}
