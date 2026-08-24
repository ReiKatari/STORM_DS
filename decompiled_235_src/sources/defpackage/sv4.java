package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sv4  reason: default package */
/* loaded from: classes.dex */
public final class sv4 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ sv4[] $VALUES;
    public static final sv4 READ = new sv4("READ", 0);
    public static final sv4 WRITE = new sv4("WRITE", 1);
    public static final sv4 READ_WRITE = new sv4("READ_WRITE", 2);

    private static final /* synthetic */ sv4[] $values() {
        return new sv4[]{READ, WRITE, READ_WRITE};
    }

    static {
        sv4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private sv4(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static sv4 valueOf(String str) {
        return (sv4) Enum.valueOf(sv4.class, str);
    }

    public static sv4[] values() {
        return (sv4[]) $VALUES.clone();
    }

    public final int toFlags() {
        int i = rv4.a[ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i == 3) {
                    return 3;
                }
                i.d();
                return 0;
            }
        }
        return i2;
    }
}
