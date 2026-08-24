package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vl7  reason: default package */
/* loaded from: classes.dex */
public final class vl7 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ vl7[] $VALUES;
    public static final vl7 STRICT = new vl7("STRICT", 0);
    public static final vl7 LOG = new vl7("LOG", 1);
    public static final vl7 QUIET = new vl7("QUIET", 2);

    private static final /* synthetic */ vl7[] $values() {
        return new vl7[]{STRICT, LOG, QUIET};
    }

    static {
        vl7[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private vl7(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static vl7 valueOf(String str) {
        return (vl7) Enum.valueOf(vl7.class, str);
    }

    public static vl7[] values() {
        return (vl7[]) $VALUES.clone();
    }
}
