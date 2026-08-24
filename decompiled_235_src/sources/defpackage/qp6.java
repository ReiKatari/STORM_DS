package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qp6  reason: default package */
/* loaded from: classes.dex */
public final class qp6 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ qp6[] $VALUES;
    public static final qp6 NoRequest = new qp6("NoRequest", 0);
    public static final qp6 MatchFound = new qp6("MatchFound", 1);
    public static final qp6 VisibleContentAbsentDuringTransition = new qp6("VisibleContentAbsentDuringTransition", 2);
    public static final qp6 NoMatchFound = new qp6("NoMatchFound", 3);

    private static final /* synthetic */ qp6[] $values() {
        return new qp6[]{NoRequest, MatchFound, VisibleContentAbsentDuringTransition, NoMatchFound};
    }

    static {
        qp6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private qp6(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static qp6 valueOf(String str) {
        return (qp6) Enum.valueOf(qp6.class, str);
    }

    public static qp6[] values() {
        return (qp6[]) $VALUES.clone();
    }
}
