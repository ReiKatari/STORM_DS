package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: il3  reason: default package */
/* loaded from: classes.dex */
public final class il3 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ il3[] $VALUES;
    public static final il3 WIDTH = new il3("WIDTH", 0);
    public static final il3 HEIGHT = new il3("HEIGHT", 1);

    private static final /* synthetic */ il3[] $values() {
        return new il3[]{WIDTH, HEIGHT};
    }

    static {
        il3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private il3(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static il3 valueOf(String str) {
        return (il3) Enum.valueOf(il3.class, str);
    }

    public static il3[] values() {
        return (il3[]) $VALUES.clone();
    }
}
