package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bd2  reason: default package */
/* loaded from: classes.dex */
public final class bd2 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ bd2[] $VALUES;
    public static final bd2 Active = new bd2("Active", 0);
    public static final bd2 ActiveParent = new bd2("ActiveParent", 1);
    public static final bd2 Captured = new bd2("Captured", 2);
    public static final bd2 Inactive = new bd2("Inactive", 3);

    private static final /* synthetic */ bd2[] $values() {
        return new bd2[]{Active, ActiveParent, Captured, Inactive};
    }

    static {
        bd2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private bd2(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static bd2 valueOf(String str) {
        return (bd2) Enum.valueOf(bd2.class, str);
    }

    public static bd2[] values() {
        return (bd2[]) $VALUES.clone();
    }

    public boolean getHasFocus() {
        int i = ad2.a[ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        i.c();
        return false;
    }

    public boolean isCaptured() {
        int i = ad2.a[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2 && i != 3 && i != 4) {
            i.c();
            return false;
        }
        return false;
    }

    public boolean isFocused() {
        int i = ad2.a[ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i != 3 && i != 4) {
            i.c();
            return false;
        }
        return false;
    }
}
