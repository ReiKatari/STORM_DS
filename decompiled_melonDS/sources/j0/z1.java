package j0;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z1 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ z1[] $VALUES;
    private final long value;
    public static final z1 DEFAULT = new z1("DEFAULT", 0, 0);
    public static final z1 PREVIEW = new z1("PREVIEW", 1, 1);
    public static final z1 VIDEO_RECORD = new z1("VIDEO_RECORD", 2, 3);
    public static final z1 STILL_CAPTURE = new z1("STILL_CAPTURE", 3, 2);
    public static final z1 VIDEO_CALL = new z1("VIDEO_CALL", 4, 5);
    public static final z1 PREVIEW_VIDEO_STILL = new z1("PREVIEW_VIDEO_STILL", 5, 4);
    public static final z1 CROPPED_RAW = new z1("CROPPED_RAW", 6, 6);

    private static final /* synthetic */ z1[] $values() {
        return new z1[]{DEFAULT, PREVIEW, VIDEO_RECORD, STILL_CAPTURE, VIDEO_CALL, PREVIEW_VIDEO_STILL, CROPPED_RAW};
    }

    static {
        z1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private z1(String str, int i2, int i10) {
        this.value = i10;
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static z1 valueOf(String str) {
        return (z1) Enum.valueOf(z1.class, str);
    }

    public static z1[] values() {
        return (z1[]) $VALUES.clone();
    }

    public final long getValue() {
        return this.value;
    }
}
