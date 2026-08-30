package h8;

import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i STRICT = new i("STRICT", 0);
    public static final i LOG = new i("LOG", 1);
    public static final i QUIET = new i("QUIET", 2);

    private static final /* synthetic */ i[] $values() {
        return new i[]{STRICT, LOG, QUIET};
    }

    static {
        i[] $values = $values();
        $VALUES = $values;
        $ENTRIES = r.x($values);
    }

    private i(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
