package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nm4  reason: default package */
/* loaded from: classes.dex */
public final class nm4 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ nm4[] $VALUES;
    public static final nm4 READ = new nm4("READ", 0);
    public static final nm4 WRITE = new nm4("WRITE", 1);
    public static final nm4 READ_WRITE = new nm4("READ_WRITE", 2);

    private static final /* synthetic */ nm4[] $values() {
        return new nm4[]{READ, WRITE, READ_WRITE};
    }

    static {
        nm4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private nm4(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static nm4 valueOf(String str) {
        return (nm4) Enum.valueOf(nm4.class, str);
    }

    public static nm4[] values() {
        return (nm4[]) $VALUES.clone();
    }

    public final int toFlags() {
        int i = mm4.a[ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i == 3) {
                    return 3;
                }
                i.c();
                return 0;
            }
        }
        return i2;
    }
}
