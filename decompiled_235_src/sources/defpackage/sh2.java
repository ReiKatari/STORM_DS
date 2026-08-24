package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sh2  reason: default package */
/* loaded from: classes.dex */
public final class sh2 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ sh2[] $VALUES;
    public static final sh2 Active = new sh2("Active", 0);
    public static final sh2 ActiveParent = new sh2("ActiveParent", 1);
    public static final sh2 Captured = new sh2("Captured", 2);
    public static final sh2 Inactive = new sh2("Inactive", 3);

    private static final /* synthetic */ sh2[] $values() {
        return new sh2[]{Active, ActiveParent, Captured, Inactive};
    }

    static {
        sh2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private sh2(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static sh2 valueOf(String str) {
        return (sh2) Enum.valueOf(sh2.class, str);
    }

    public static sh2[] values() {
        return (sh2[]) $VALUES.clone();
    }

    public boolean getHasFocus() {
        int i = rh2.a[ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        i.d();
        return false;
    }

    public boolean isCaptured() {
        int i = rh2.a[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2 && i != 3 && i != 4) {
            i.d();
            return false;
        }
        return false;
    }

    public boolean isFocused() {
        int i = rh2.a[ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i != 3 && i != 4) {
            i.d();
            return false;
        }
        return false;
    }
}
