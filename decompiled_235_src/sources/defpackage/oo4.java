package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oo4  reason: default package */
/* loaded from: classes.dex */
public final class oo4 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ oo4[] $VALUES;
    public static final oo4 RUN_AS_NON_EXPEDITED_WORK_REQUEST = new oo4("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
    public static final oo4 DROP_WORK_REQUEST = new oo4("DROP_WORK_REQUEST", 1);

    private static final /* synthetic */ oo4[] $values() {
        return new oo4[]{RUN_AS_NON_EXPEDITED_WORK_REQUEST, DROP_WORK_REQUEST};
    }

    static {
        oo4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private oo4(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static oo4 valueOf(String str) {
        return (oo4) Enum.valueOf(oo4.class, str);
    }

    public static oo4[] values() {
        return (oo4[]) $VALUES.clone();
    }
}
