package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: da2  reason: default package */
/* loaded from: classes.dex */
public final class da2 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ da2[] $VALUES;
    public static final da2 DYNAMIC_RANGE = new da2("DYNAMIC_RANGE", 0);
    public static final da2 FPS_RANGE = new da2("FPS_RANGE", 1);
    public static final da2 VIDEO_STABILIZATION = new da2("VIDEO_STABILIZATION", 2);
    public static final da2 IMAGE_FORMAT = new da2("IMAGE_FORMAT", 3);
    public static final da2 RECORDING_QUALITY = new da2("RECORDING_QUALITY", 4);

    private static final /* synthetic */ da2[] $values() {
        return new da2[]{DYNAMIC_RANGE, FPS_RANGE, VIDEO_STABILIZATION, IMAGE_FORMAT, RECORDING_QUALITY};
    }

    static {
        da2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private da2(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static da2 valueOf(String str) {
        return (da2) Enum.valueOf(da2.class, str);
    }

    public static da2[] values() {
        return (da2[]) $VALUES.clone();
    }
}
