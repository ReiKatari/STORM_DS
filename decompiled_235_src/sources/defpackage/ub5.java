package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ub5  reason: default package */
/* loaded from: classes.dex */
public final class ub5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ub5[] $VALUES;
    public static final ub5 ONLINE_LIVE = new ub5("ONLINE_LIVE", 0);
    public static final ub5 OFFLINE_ACCUMULATING = new ub5("OFFLINE_ACCUMULATING", 1);
    public static final ub5 PENDING_RA_SUBMISSIONS = new ub5("PENDING_RA_SUBMISSIONS", 2);
    public static final ub5 RECONCILING_RA_SUBMISSIONS = new ub5("RECONCILING_RA_SUBMISSIONS", 3);

    private static final /* synthetic */ ub5[] $values() {
        return new ub5[]{ONLINE_LIVE, OFFLINE_ACCUMULATING, PENDING_RA_SUBMISSIONS, RECONCILING_RA_SUBMISSIONS};
    }

    static {
        ub5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private ub5(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ub5 valueOf(String str) {
        return (ub5) Enum.valueOf(ub5.class, str);
    }

    public static ub5[] values() {
        return (ub5[]) $VALUES.clone();
    }
}
