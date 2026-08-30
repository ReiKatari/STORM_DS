package p8;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c0 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ c0[] $VALUES;
    public static final c0 RUN_AS_NON_EXPEDITED_WORK_REQUEST = new c0("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
    public static final c0 DROP_WORK_REQUEST = new c0("DROP_WORK_REQUEST", 1);

    private static final /* synthetic */ c0[] $values() {
        return new c0[]{RUN_AS_NON_EXPEDITED_WORK_REQUEST, DROP_WORK_REQUEST};
    }

    static {
        c0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private c0(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) $VALUES.clone();
    }
}
