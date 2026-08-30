package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mf4  reason: default package */
/* loaded from: classes.dex */
public final class mf4 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ mf4[] $VALUES;
    public static final mf4 RUN_AS_NON_EXPEDITED_WORK_REQUEST = new mf4("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
    public static final mf4 DROP_WORK_REQUEST = new mf4("DROP_WORK_REQUEST", 1);

    private static final /* synthetic */ mf4[] $values() {
        return new mf4[]{RUN_AS_NON_EXPEDITED_WORK_REQUEST, DROP_WORK_REQUEST};
    }

    static {
        mf4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private mf4(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static mf4 valueOf(String str) {
        return (mf4) Enum.valueOf(mf4.class, str);
    }

    public static mf4[] values() {
        return (mf4[]) $VALUES.clone();
    }
}
