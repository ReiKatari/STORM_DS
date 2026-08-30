package j0;

import android.util.Size;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b2 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ b2[] $VALUES;

    /* renamed from: id  reason: collision with root package name */
    private final int f7163id;
    private final Size relatedFixedSize;
    public static final b2 VGA = new b2("VGA", 0, 0, new Size(640, 480));
    public static final b2 X_VGA = new b2("X_VGA", 1, 1, new Size(1024, 768));
    public static final b2 S720P_16_9 = new b2("S720P_16_9", 2, 2, new Size(1280, 720));
    public static final b2 PREVIEW = new b2("PREVIEW", 3, 3, null, 2, null);
    public static final b2 S1080P_4_3 = new b2("S1080P_4_3", 4, 4, new Size(1440, 1080));
    public static final b2 S1080P_16_9 = new b2("S1080P_16_9", 5, 5, new Size(1920, 1080));
    public static final b2 S1440P_4_3 = new b2("S1440P_4_3", 6, 6, new Size(1920, 1440));
    public static final b2 S1440P_16_9 = new b2("S1440P_16_9", 7, 7, new Size(2560, 1440));
    public static final b2 UHD = new b2("UHD", 8, 8, new Size(3840, 2160));
    public static final b2 RECORD = new b2("RECORD", 9, 9, null, 2, null);
    public static final b2 MAXIMUM = new b2("MAXIMUM", 10, 10, null, 2, null);
    public static final b2 MAXIMUM_4_3 = new b2("MAXIMUM_4_3", 11, 11, null, 2, null);
    public static final b2 MAXIMUM_16_9 = new b2("MAXIMUM_16_9", 12, 12, null, 2, null);
    public static final b2 ULTRA_MAXIMUM = new b2("ULTRA_MAXIMUM", 13, 13, null, 2, null);
    public static final b2 NOT_SUPPORT = new b2("NOT_SUPPORT", 14, 14, null, 2, null);

    private static final /* synthetic */ b2[] $values() {
        return new b2[]{VGA, X_VGA, S720P_16_9, PREVIEW, S1080P_4_3, S1080P_16_9, S1440P_4_3, S1440P_16_9, UHD, RECORD, MAXIMUM, MAXIMUM_4_3, MAXIMUM_16_9, ULTRA_MAXIMUM, NOT_SUPPORT};
    }

    static {
        b2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    public /* synthetic */ b2(String str, int i2, int i10, Size size, int i11, nc.f fVar) {
        this(str, i2, i10, (i11 & 2) != 0 ? null : size);
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static b2 valueOf(String str) {
        return (b2) Enum.valueOf(b2.class, str);
    }

    public static b2[] values() {
        return (b2[]) $VALUES.clone();
    }

    public final int getId() {
        return this.f7163id;
    }

    public final Size getRelatedFixedSize() {
        return this.relatedFixedSize;
    }

    private b2(String str, int i2, int i10, Size size) {
        this.f7163id = i10;
        this.relatedFixedSize = size;
    }
}
