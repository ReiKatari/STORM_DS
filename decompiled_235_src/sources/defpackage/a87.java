package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a87  reason: default package */
/* loaded from: classes.dex */
public final class a87 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ a87[] $VALUES;
    public static final a87 On = new a87("On", 0);
    public static final a87 Off = new a87("Off", 1);
    public static final a87 Indeterminate = new a87("Indeterminate", 2);

    private static final /* synthetic */ a87[] $values() {
        return new a87[]{On, Off, Indeterminate};
    }

    static {
        a87[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private a87(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static a87 valueOf(String str) {
        return (a87) Enum.valueOf(a87.class, str);
    }

    public static a87[] values() {
        return (a87[]) $VALUES.clone();
    }
}
