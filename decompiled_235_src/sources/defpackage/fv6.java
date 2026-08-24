package defpackage;

import android.util.Size;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fv6  reason: default package */
/* loaded from: classes.dex */
public final class fv6 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ fv6[] $VALUES;
    private final int id;
    private final Size relatedFixedSize;
    public static final fv6 VGA = new fv6("VGA", 0, 0, new Size(640, 480));
    public static final fv6 X_VGA = new fv6("X_VGA", 1, 1, new Size(1024, 768));
    public static final fv6 S720P_16_9 = new fv6("S720P_16_9", 2, 2, new Size(1280, 720));
    public static final fv6 PREVIEW = new fv6("PREVIEW", 3, 3, null, 2, null);
    public static final fv6 S1080P_4_3 = new fv6("S1080P_4_3", 4, 4, new Size(1440, 1080));
    public static final fv6 S1080P_16_9 = new fv6("S1080P_16_9", 5, 5, new Size(1920, 1080));
    public static final fv6 S1440P_4_3 = new fv6("S1440P_4_3", 6, 6, new Size(1920, 1440));
    public static final fv6 S1440P_16_9 = new fv6("S1440P_16_9", 7, 7, new Size(2560, 1440));
    public static final fv6 UHD = new fv6("UHD", 8, 8, new Size(3840, 2160));
    public static final fv6 RECORD = new fv6("RECORD", 9, 9, null, 2, null);
    public static final fv6 MAXIMUM = new fv6("MAXIMUM", 10, 10, null, 2, null);
    public static final fv6 MAXIMUM_4_3 = new fv6("MAXIMUM_4_3", 11, 11, null, 2, null);
    public static final fv6 MAXIMUM_16_9 = new fv6("MAXIMUM_16_9", 12, 12, null, 2, null);
    public static final fv6 ULTRA_MAXIMUM = new fv6("ULTRA_MAXIMUM", 13, 13, null, 2, null);
    public static final fv6 NOT_SUPPORT = new fv6("NOT_SUPPORT", 14, 14, null, 2, null);

    private static final /* synthetic */ fv6[] $values() {
        return new fv6[]{VGA, X_VGA, S720P_16_9, PREVIEW, S1080P_4_3, S1080P_16_9, S1440P_4_3, S1440P_16_9, UHD, RECORD, MAXIMUM, MAXIMUM_4_3, MAXIMUM_16_9, ULTRA_MAXIMUM, NOT_SUPPORT};
    }

    static {
        fv6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    public /* synthetic */ fv6(String str, int i, int i2, Size size, int i3, id1 id1Var) {
        this(str, i, i2, (i3 & 2) != 0 ? null : size);
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static fv6 valueOf(String str) {
        return (fv6) Enum.valueOf(fv6.class, str);
    }

    public static fv6[] values() {
        return (fv6[]) $VALUES.clone();
    }

    public final int getId() {
        return this.id;
    }

    public final Size getRelatedFixedSize() {
        return this.relatedFixedSize;
    }

    private fv6(String str, int i, int i2, Size size) {
        this.id = i2;
        this.relatedFixedSize = size;
    }
}
