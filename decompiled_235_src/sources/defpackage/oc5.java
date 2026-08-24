package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oc5  reason: default package */
/* loaded from: classes.dex */
public final class oc5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ oc5[] $VALUES;
    public static final oc5 EXIT = new oc5("EXIT", 0);
    public static final oc5 KEEP_SESSION_OPEN = new oc5("KEEP_SESSION_OPEN", 1);

    private static final /* synthetic */ oc5[] $values() {
        return new oc5[]{EXIT, KEEP_SESSION_OPEN};
    }

    static {
        oc5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private oc5(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static oc5 valueOf(String str) {
        return (oc5) Enum.valueOf(oc5.class, str);
    }

    public static oc5[] values() {
        return (oc5[]) $VALUES.clone();
    }
}
