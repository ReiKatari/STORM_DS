package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tr6  reason: default package */
/* loaded from: classes.dex */
public final class tr6 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ tr6[] $VALUES;
    private final long value;
    public static final tr6 DEFAULT = new tr6("DEFAULT", 0, 0);
    public static final tr6 PREVIEW = new tr6("PREVIEW", 1, 1);
    public static final tr6 VIDEO_RECORD = new tr6("VIDEO_RECORD", 2, 3);
    public static final tr6 STILL_CAPTURE = new tr6("STILL_CAPTURE", 3, 2);
    public static final tr6 VIDEO_CALL = new tr6("VIDEO_CALL", 4, 5);
    public static final tr6 PREVIEW_VIDEO_STILL = new tr6("PREVIEW_VIDEO_STILL", 5, 4);
    public static final tr6 CROPPED_RAW = new tr6("CROPPED_RAW", 6, 6);

    private static final /* synthetic */ tr6[] $values() {
        return new tr6[]{DEFAULT, PREVIEW, VIDEO_RECORD, STILL_CAPTURE, VIDEO_CALL, PREVIEW_VIDEO_STILL, CROPPED_RAW};
    }

    static {
        tr6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private tr6(String str, int i, int i2) {
        this.value = i2;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static tr6 valueOf(String str) {
        return (tr6) Enum.valueOf(tr6.class, str);
    }

    public static tr6[] values() {
        return (tr6[]) $VALUES.clone();
    }

    public final long getValue() {
        return this.value;
    }
}
