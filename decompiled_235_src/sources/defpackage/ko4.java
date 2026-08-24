package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ko4  reason: default package */
/* loaded from: classes.dex */
public final class ko4 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ko4[] $VALUES;
    public static final ko4 PORTRAIT = new ko4("PORTRAIT", 0);
    public static final ko4 LANDSCAPE = new ko4("LANDSCAPE", 1);

    private static final /* synthetic */ ko4[] $values() {
        return new ko4[]{PORTRAIT, LANDSCAPE};
    }

    static {
        ko4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private ko4(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ko4 valueOf(String str) {
        return (ko4) Enum.valueOf(ko4.class, str);
    }

    public static ko4[] values() {
        return (ko4[]) $VALUES.clone();
    }
}
