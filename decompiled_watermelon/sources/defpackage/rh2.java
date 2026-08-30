package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rh2  reason: default package */
/* loaded from: classes.dex */
public final class rh2 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ rh2[] $VALUES;
    public static final rh2 STARTED = new rh2("STARTED", 0);
    public static final rh2 FRAME_INFO_COMPLETE = new rh2("FRAME_INFO_COMPLETE", 1);
    public static final rh2 STREAM_RESULTS_COMPLETE = new rh2("STREAM_RESULTS_COMPLETE", 2);
    public static final rh2 COMPLETE = new rh2("COMPLETE", 3);

    private static final /* synthetic */ rh2[] $values() {
        return new rh2[]{STARTED, FRAME_INFO_COMPLETE, STREAM_RESULTS_COMPLETE, COMPLETE};
    }

    static {
        rh2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private rh2(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static rh2 valueOf(String str) {
        return (rh2) Enum.valueOf(rh2.class, str);
    }

    public static rh2[] values() {
        return (rh2[]) $VALUES.clone();
    }
}
