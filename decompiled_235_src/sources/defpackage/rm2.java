package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rm2  reason: default package */
/* loaded from: classes.dex */
public final class rm2 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ rm2[] $VALUES;
    public static final rm2 STARTED = new rm2("STARTED", 0);
    public static final rm2 FRAME_INFO_COMPLETE = new rm2("FRAME_INFO_COMPLETE", 1);
    public static final rm2 STREAM_RESULTS_COMPLETE = new rm2("STREAM_RESULTS_COMPLETE", 2);
    public static final rm2 COMPLETE = new rm2("COMPLETE", 3);

    private static final /* synthetic */ rm2[] $values() {
        return new rm2[]{STARTED, FRAME_INFO_COMPLETE, STREAM_RESULTS_COMPLETE, COMPLETE};
    }

    static {
        rm2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private rm2(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static rm2 valueOf(String str) {
        return (rm2) Enum.valueOf(rm2.class, str);
    }

    public static rm2[] values() {
        return (rm2[]) $VALUES.clone();
    }
}
