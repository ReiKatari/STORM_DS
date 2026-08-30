package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k52  reason: default package */
/* loaded from: classes.dex */
public final class k52 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ k52[] $VALUES;
    public static final k52 DYNAMIC_RANGE = new k52("DYNAMIC_RANGE", 0);
    public static final k52 FPS_RANGE = new k52("FPS_RANGE", 1);
    public static final k52 VIDEO_STABILIZATION = new k52("VIDEO_STABILIZATION", 2);
    public static final k52 IMAGE_FORMAT = new k52("IMAGE_FORMAT", 3);
    public static final k52 RECORDING_QUALITY = new k52("RECORDING_QUALITY", 4);

    private static final /* synthetic */ k52[] $values() {
        return new k52[]{DYNAMIC_RANGE, FPS_RANGE, VIDEO_STABILIZATION, IMAGE_FORMAT, RECORDING_QUALITY};
    }

    static {
        k52[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private k52(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static k52 valueOf(String str) {
        return (k52) Enum.valueOf(k52.class, str);
    }

    public static k52[] values() {
        return (k52[]) $VALUES.clone();
    }
}
