package g0;

import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b DYNAMIC_RANGE = new b("DYNAMIC_RANGE", 0);
    public static final b FPS_RANGE = new b("FPS_RANGE", 1);
    public static final b VIDEO_STABILIZATION = new b("VIDEO_STABILIZATION", 2);
    public static final b IMAGE_FORMAT = new b("IMAGE_FORMAT", 3);

    private static final /* synthetic */ b[] $values() {
        return new b[]{DYNAMIC_RANGE, FPS_RANGE, VIDEO_STABILIZATION, IMAGE_FORMAT};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = r.x($values);
    }

    private b(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
