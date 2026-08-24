package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: im1  reason: default package */
/* loaded from: classes.dex */
public final class im1 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ im1[] $VALUES;
    public static final im1 Up = new im1("Up", 0);
    public static final im1 Drag = new im1("Drag", 1);
    public static final im1 Timeout = new im1("Timeout", 2);
    public static final im1 Cancel = new im1("Cancel", 3);

    private static final /* synthetic */ im1[] $values() {
        return new im1[]{Up, Drag, Timeout, Cancel};
    }

    static {
        im1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private im1(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static im1 valueOf(String str) {
        return (im1) Enum.valueOf(im1.class, str);
    }

    public static im1[] values() {
        return (im1[]) $VALUES.clone();
    }
}
