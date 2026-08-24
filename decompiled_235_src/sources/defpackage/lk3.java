package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lk3  reason: default package */
/* loaded from: classes.dex */
public final class lk3 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ lk3[] $VALUES;
    public static final lk3 BUILT_IN = new lk3("BUILT_IN", 0);
    public static final lk3 EXTERNAL = new lk3("EXTERNAL", 1);

    private static final /* synthetic */ lk3[] $values() {
        return new lk3[]{BUILT_IN, EXTERNAL};
    }

    static {
        lk3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private lk3(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static lk3 valueOf(String str) {
        return (lk3) Enum.valueOf(lk3.class, str);
    }

    public static lk3[] values() {
        return (lk3[]) $VALUES.clone();
    }
}
