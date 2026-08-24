package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xc1  reason: default package */
/* loaded from: classes.dex */
public final class xc1 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ xc1[] $VALUES;
    public static final xc1 CONFIRM = new xc1("CONFIRM", 0);
    public static final xc1 DECRYPTING = new xc1("DECRYPTING", 1);
    public static final xc1 SUCCESS = new xc1("SUCCESS", 2);
    public static final xc1 ERROR = new xc1("ERROR", 3);

    private static final /* synthetic */ xc1[] $values() {
        return new xc1[]{CONFIRM, DECRYPTING, SUCCESS, ERROR};
    }

    static {
        xc1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private xc1(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static xc1 valueOf(String str) {
        return (xc1) Enum.valueOf(xc1.class, str);
    }

    public static xc1[] values() {
        return (xc1[]) $VALUES.clone();
    }
}
