package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jb3  reason: default package */
/* loaded from: classes.dex */
public final class jb3 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ jb3[] $VALUES;
    public static final jb3 Width = new jb3("Width", 0);
    public static final jb3 Height = new jb3("Height", 1);

    private static final /* synthetic */ jb3[] $values() {
        return new jb3[]{Width, Height};
    }

    static {
        jb3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private jb3(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static jb3 valueOf(String str) {
        return (jb3) Enum.valueOf(jb3.class, str);
    }

    public static jb3[] values() {
        return (jb3[]) $VALUES.clone();
    }
}
