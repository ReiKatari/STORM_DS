package n9;

import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f FILL = new f("FILL", 0);
    public static final f FIT = new f("FIT", 1);

    private static final /* synthetic */ f[] $values() {
        return new f[]{FILL, FIT};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = r.x($values);
    }

    private f(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
