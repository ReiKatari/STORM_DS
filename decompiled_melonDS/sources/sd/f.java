package sd;

import m9.o;
import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f READ = new f("READ", 0);
    public static final f WRITE = new f("WRITE", 1);
    public static final f READ_WRITE = new f("READ_WRITE", 2);

    private static final /* synthetic */ f[] $values() {
        return new f[]{READ, WRITE, READ_WRITE};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = r.x($values);
    }

    private f(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final int toFlags() {
        int i2 = e.f12870a[ordinal()];
        int i10 = 1;
        if (i2 != 1) {
            i10 = 2;
            if (i2 != 2) {
                if (i2 == 3) {
                    return 3;
                }
                o.o();
                return 0;
            }
        }
        return i10;
    }
}
