package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ql0  reason: default package */
/* loaded from: classes.dex */
public final class ql0 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ ql0[] $VALUES;
    public static final ql0 NOT_IMPORTING = new ql0("NOT_IMPORTING", 0);
    public static final ql0 STARTING = new ql0("STARTING", 1);
    public static final ql0 ONGOING = new ql0("ONGOING", 2);
    public static final ql0 FINISHED = new ql0("FINISHED", 3);
    public static final ql0 FAILED = new ql0("FAILED", 4);

    private static final /* synthetic */ ql0[] $values() {
        return new ql0[]{NOT_IMPORTING, STARTING, ONGOING, FINISHED, FAILED};
    }

    static {
        ql0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private ql0(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static ql0 valueOf(String str) {
        return (ql0) Enum.valueOf(ql0.class, str);
    }

    public static ql0[] values() {
        return (ql0[]) $VALUES.clone();
    }
}
