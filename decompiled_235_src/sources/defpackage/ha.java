package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ha  reason: default package */
/* loaded from: classes.dex */
public final class ha {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ha[] $VALUES;
    public static final ha UnsupportedBuild = new ha("UnsupportedBuild", 0);
    public static final ha NotZip = new ha("NotZip", 1);
    public static final ha InvalidZip = new ha("InvalidZip", 2);
    public static final ha NoDriver = new ha("NoDriver", 3);
    public static final ha AmbiguousDriver = new ha("AmbiguousDriver", 4);

    private static final /* synthetic */ ha[] $values() {
        return new ha[]{UnsupportedBuild, NotZip, InvalidZip, NoDriver, AmbiguousDriver};
    }

    static {
        ha[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private ha(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ha valueOf(String str) {
        return (ha) Enum.valueOf(ha.class, str);
    }

    public static ha[] values() {
        return (ha[]) $VALUES.clone();
    }
}
