package g3;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e0 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ e0[] $VALUES;
    public static final e0 Active = new e0("Active", 0);
    public static final e0 ActiveParent = new e0("ActiveParent", 1);
    public static final e0 Captured = new e0("Captured", 2);
    public static final e0 Inactive = new e0("Inactive", 3);

    private static final /* synthetic */ e0[] $values() {
        return new e0[]{Active, ActiveParent, Captured, Inactive};
    }

    static {
        e0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private e0(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) $VALUES.clone();
    }

    public boolean getHasFocus() {
        int i2 = d0.f5502a[ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return true;
        }
        if (i2 == 4) {
            return false;
        }
        m9.o.o();
        return false;
    }

    public boolean isCaptured() {
        int i2 = d0.f5502a[ordinal()];
        if (i2 == 1) {
            return true;
        }
        if (i2 != 2 && i2 != 3 && i2 != 4) {
            m9.o.o();
            return false;
        }
        return false;
    }

    public boolean isFocused() {
        int i2 = d0.f5502a[ordinal()];
        if (i2 == 1 || i2 == 2) {
            return true;
        }
        if (i2 != 3 && i2 != 4) {
            m9.o.o();
            return false;
        }
        return false;
    }
}
