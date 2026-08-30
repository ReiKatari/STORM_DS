package dh;

import ah.k1;
import me.magnum.melonds.R;
import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements k1 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    private final int textResource;
    public static final a SETTINGS = new a("SETTINGS", 0, R.string.settings);
    public static final a RESET = new a("RESET", 1, R.string.reset);
    public static final a EXIT = new a("EXIT", 2, R.string.exit);

    private static final /* synthetic */ a[] $values() {
        return new a[]{SETTINGS, RESET, EXIT};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = r.x($values);
    }

    private a(String str, int i2, int i10) {
        this.textResource = i10;
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    @Override // ah.k1
    public int getTextResource() {
        return this.textResource;
    }
}
