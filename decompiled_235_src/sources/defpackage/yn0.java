package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yn0  reason: default package */
/* loaded from: classes.dex */
public final class yn0 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ yn0[] $VALUES;
    public static final yn0 NOT_IMPORTING = new yn0("NOT_IMPORTING", 0);
    public static final yn0 STARTING = new yn0("STARTING", 1);
    public static final yn0 ONGOING = new yn0("ONGOING", 2);
    public static final yn0 FINISHED = new yn0("FINISHED", 3);
    public static final yn0 FAILED = new yn0("FAILED", 4);

    private static final /* synthetic */ yn0[] $values() {
        return new yn0[]{NOT_IMPORTING, STARTING, ONGOING, FINISHED, FAILED};
    }

    static {
        yn0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private yn0(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static yn0 valueOf(String str) {
        return (yn0) Enum.valueOf(yn0.class, str);
    }

    public static yn0[] values() {
        return (yn0[]) $VALUES.clone();
    }
}
