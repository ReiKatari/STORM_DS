package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cg6  reason: default package */
/* loaded from: classes.dex */
public final class cg6 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ cg6[] $VALUES;
    private final long value;
    public static final cg6 DEFAULT = new cg6("DEFAULT", 0, 0);
    public static final cg6 PREVIEW = new cg6("PREVIEW", 1, 1);
    public static final cg6 VIDEO_RECORD = new cg6("VIDEO_RECORD", 2, 3);
    public static final cg6 STILL_CAPTURE = new cg6("STILL_CAPTURE", 3, 2);
    public static final cg6 VIDEO_CALL = new cg6("VIDEO_CALL", 4, 5);
    public static final cg6 PREVIEW_VIDEO_STILL = new cg6("PREVIEW_VIDEO_STILL", 5, 4);
    public static final cg6 CROPPED_RAW = new cg6("CROPPED_RAW", 6, 6);

    private static final /* synthetic */ cg6[] $values() {
        return new cg6[]{DEFAULT, PREVIEW, VIDEO_RECORD, STILL_CAPTURE, VIDEO_CALL, PREVIEW_VIDEO_STILL, CROPPED_RAW};
    }

    static {
        cg6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private cg6(String str, int i, int i2) {
        this.value = i2;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static cg6 valueOf(String str) {
        return (cg6) Enum.valueOf(cg6.class, str);
    }

    public static cg6[] values() {
        return (cg6[]) $VALUES.clone();
    }

    public final long getValue() {
        return this.value;
    }
}
