package gg;

import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    private final int nightMode;
    public static final a LIGHT = new a("LIGHT", 0, 1);
    public static final a DARK = new a("DARK", 1, 2);
    public static final a SYSTEM = new a("SYSTEM", 2, -1);

    private static final /* synthetic */ a[] $values() {
        return new a[]{LIGHT, DARK, SYSTEM};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = r.x($values);
    }

    private a(String str, int i2, int i10) {
        this.nightMode = i10;
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

    public final int getNightMode() {
        return this.nightMode;
    }
}
