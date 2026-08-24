package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l6  reason: default package */
/* loaded from: classes.dex */
public final class l6 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ l6[] $VALUES;
    public static final l6 All = new l6("All", 0, 0);
    public static final l6 Core = new l6("Core", 1, 1);
    public static final l6 Leaderboards = new l6("Leaderboards", 2, 2);
    public static final l6 Unofficial = new l6("Unofficial", 3, 3);
    private final int displayOrder;

    private static final /* synthetic */ l6[] $values() {
        return new l6[]{All, Core, Leaderboards, Unofficial};
    }

    static {
        l6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private l6(String str, int i, int i2) {
        this.displayOrder = i2;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static l6 valueOf(String str) {
        return (l6) Enum.valueOf(l6.class, str);
    }

    public static l6[] values() {
        return (l6[]) $VALUES.clone();
    }

    public final int getDisplayOrder() {
        return this.displayOrder;
    }

    public final boolean matches(n75 n75Var) {
        n75Var.getClass();
        int i = k6.a[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    if (n75Var == n75.UNOFFICIAL) {
                        return true;
                    }
                    return false;
                }
                i.d();
            }
            return false;
        } else if (n75Var == n75.CORE) {
            return true;
        } else {
            return false;
        }
    }
}
