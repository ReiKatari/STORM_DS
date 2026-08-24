package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wj1  reason: default package */
/* loaded from: classes.dex */
public final class wj1 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ wj1[] $VALUES;
    public static final wj1 Vertical = new wj1("Vertical", 0);
    public static final wj1 Horizontal = new wj1("Horizontal", 1);
    public static final wj1 Both = new wj1("Both", 2);

    private static final /* synthetic */ wj1[] $values() {
        return new wj1[]{Vertical, Horizontal, Both};
    }

    static {
        wj1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private wj1(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static wj1 valueOf(String str) {
        return (wj1) Enum.valueOf(wj1.class, str);
    }

    public static wj1[] values() {
        return (wj1[]) $VALUES.clone();
    }
}
