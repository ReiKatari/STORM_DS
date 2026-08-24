package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ck3  reason: default package */
/* loaded from: classes.dex */
public final class ck3 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ck3[] $VALUES;
    public static final ck3 FOLLOW_SYSTEM = new ck3("FOLLOW_SYSTEM", 0);
    public static final ck3 PORTRAIT = new ck3("PORTRAIT", 1);
    public static final ck3 LANDSCAPE = new ck3("LANDSCAPE", 2);

    private static final /* synthetic */ ck3[] $values() {
        return new ck3[]{FOLLOW_SYSTEM, PORTRAIT, LANDSCAPE};
    }

    static {
        ck3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private ck3(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ck3 valueOf(String str) {
        return (ck3) Enum.valueOf(ck3.class, str);
    }

    public static ck3[] values() {
        return (ck3[]) $VALUES.clone();
    }
}
