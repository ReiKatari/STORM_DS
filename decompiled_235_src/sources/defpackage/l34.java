package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l34  reason: default package */
/* loaded from: classes.dex */
public final class l34 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ l34[] $VALUES;
    public static final l34 Width = new l34("Width", 0);
    public static final l34 Height = new l34("Height", 1);

    private static final /* synthetic */ l34[] $values() {
        return new l34[]{Width, Height};
    }

    static {
        l34[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private l34(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static l34 valueOf(String str) {
        return (l34) Enum.valueOf(l34.class, str);
    }

    public static l34[] values() {
        return (l34[]) $VALUES.clone();
    }
}
