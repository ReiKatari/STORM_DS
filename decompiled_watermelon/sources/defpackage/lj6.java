package defpackage;

import android.util.Size;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lj6  reason: default package */
/* loaded from: classes.dex */
public final class lj6 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ lj6[] $VALUES;
    private final int id;
    private final Size relatedFixedSize;
    public static final lj6 VGA = new lj6("VGA", 0, 0, new Size(640, 480));
    public static final lj6 X_VGA = new lj6("X_VGA", 1, 1, new Size(1024, 768));
    public static final lj6 S720P_16_9 = new lj6("S720P_16_9", 2, 2, new Size(1280, 720));
    public static final lj6 PREVIEW = new lj6("PREVIEW", 3, 3, null, 2, null);
    public static final lj6 S1080P_4_3 = new lj6("S1080P_4_3", 4, 4, new Size(1440, 1080));
    public static final lj6 S1080P_16_9 = new lj6("S1080P_16_9", 5, 5, new Size(1920, 1080));
    public static final lj6 S1440P_4_3 = new lj6("S1440P_4_3", 6, 6, new Size(1920, 1440));
    public static final lj6 S1440P_16_9 = new lj6("S1440P_16_9", 7, 7, new Size(2560, 1440));
    public static final lj6 UHD = new lj6("UHD", 8, 8, new Size(3840, 2160));
    public static final lj6 RECORD = new lj6("RECORD", 9, 9, null, 2, null);
    public static final lj6 MAXIMUM = new lj6("MAXIMUM", 10, 10, null, 2, null);
    public static final lj6 MAXIMUM_4_3 = new lj6("MAXIMUM_4_3", 11, 11, null, 2, null);
    public static final lj6 MAXIMUM_16_9 = new lj6("MAXIMUM_16_9", 12, 12, null, 2, null);
    public static final lj6 ULTRA_MAXIMUM = new lj6("ULTRA_MAXIMUM", 13, 13, null, 2, null);
    public static final lj6 NOT_SUPPORT = new lj6("NOT_SUPPORT", 14, 14, null, 2, null);

    private static final /* synthetic */ lj6[] $values() {
        return new lj6[]{VGA, X_VGA, S720P_16_9, PREVIEW, S1080P_4_3, S1080P_16_9, S1440P_4_3, S1440P_16_9, UHD, RECORD, MAXIMUM, MAXIMUM_4_3, MAXIMUM_16_9, ULTRA_MAXIMUM, NOT_SUPPORT};
    }

    static {
        lj6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    public /* synthetic */ lj6(String str, int i, int i2, Size size, int i3, n91 n91Var) {
        this(str, i, i2, (i3 & 2) != 0 ? null : size);
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static lj6 valueOf(String str) {
        return (lj6) Enum.valueOf(lj6.class, str);
    }

    public static lj6[] values() {
        return (lj6[]) $VALUES.clone();
    }

    public final int getId() {
        return this.id;
    }

    public final Size getRelatedFixedSize() {
        return this.relatedFixedSize;
    }

    private lj6(String str, int i, int i2, Size size) {
        this.id = i2;
        this.relatedFixedSize = size;
    }
}
