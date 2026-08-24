package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: su7  reason: default package */
/* loaded from: classes.dex */
public abstract class su7 {
    public static int a(int i) {
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i != 8) {
                if (i == 16) {
                    return 4;
                }
                if (i != 32) {
                    if (i != 64) {
                        if (i != 128) {
                            if (i == 256) {
                                return 8;
                            }
                            if (i == 512) {
                                return 9;
                            }
                            i.h(lb1.g(i, "type needs to be >= FIRST and <= LAST, type="));
                            return 0;
                        }
                        return 7;
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 0;
    }

    public static void b(int i, int i2) {
        String g;
        if (i >= 0 && i < i2) {
            return;
        }
        if (i >= 0) {
            if (i2 < 0) {
                i.h(lb1.g(i2, "negative size: "));
                return;
            }
            g = bv7.g("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            g = bv7.g("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(g);
    }

    public static void c(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return;
        }
        e41.q(e(i, i2, "index"));
    }

    public static void d(int i, int i2, int i3) {
        String e;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                e = bv7.g("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                e = e(i2, i3, "end index");
            }
        } else {
            e = e(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(e);
    }

    public static String e(int i, int i2, String str) {
        if (i < 0) {
            return bv7.g("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return bv7.g("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        i.h(lb1.g(i2, "negative size: "));
        return null;
    }
}
