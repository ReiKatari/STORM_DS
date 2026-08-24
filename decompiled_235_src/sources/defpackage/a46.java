package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a46  reason: default package */
/* loaded from: classes.dex */
public final class a46 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ a46[] $VALUES;
    public static final a46 SAVE_DIR = new a46("SAVE_DIR", 0);
    public static final a46 ROM_DIR = new a46("ROM_DIR", 1);
    public static final a46 INTERNAL_DIR = new a46("INTERNAL_DIR", 2);

    private static final /* synthetic */ a46[] $values() {
        return new a46[]{SAVE_DIR, ROM_DIR, INTERNAL_DIR};
    }

    static {
        a46[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private a46(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static a46 valueOf(String str) {
        return (a46) Enum.valueOf(a46.class, str);
    }

    public static a46[] values() {
        return (a46[]) $VALUES.clone();
    }
}
