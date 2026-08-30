package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k6  reason: default package */
/* loaded from: classes.dex */
public final class k6 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ k6[] $VALUES;
    public static final k6 All = new k6("All", 0, 0);
    public static final k6 Core = new k6("Core", 1, 1);
    public static final k6 Leaderboards = new k6("Leaderboards", 2, 2);
    public static final k6 Unofficial = new k6("Unofficial", 3, 3);
    private final int displayOrder;

    private static final /* synthetic */ k6[] $values() {
        return new k6[]{All, Core, Leaderboards, Unofficial};
    }

    static {
        k6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private k6(String str, int i, int i2) {
        this.displayOrder = i2;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static k6 valueOf(String str) {
        return (k6) Enum.valueOf(k6.class, str);
    }

    public static k6[] values() {
        return (k6[]) $VALUES.clone();
    }

    public final int getDisplayOrder() {
        return this.displayOrder;
    }

    public final boolean matches(cy4 cy4Var) {
        cy4Var.getClass();
        int i = j6.a[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    if (cy4Var == cy4.UNOFFICIAL) {
                        return true;
                    }
                    return false;
                }
                i.c();
            }
            return false;
        } else if (cy4Var == cy4.CORE) {
            return true;
        } else {
            return false;
        }
    }
}
