package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ig4  reason: default package */
/* loaded from: classes.dex */
public final class ig4 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ig4[] $VALUES;
    public static final ig4 Width = new ig4("Width", 0);
    public static final ig4 Height = new ig4("Height", 1);

    private static final /* synthetic */ ig4[] $values() {
        return new ig4[]{Width, Height};
    }

    static {
        ig4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private ig4(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ig4 valueOf(String str) {
        return (ig4) Enum.valueOf(ig4.class, str);
    }

    public static ig4[] values() {
        return (ig4[]) $VALUES.clone();
    }
}
