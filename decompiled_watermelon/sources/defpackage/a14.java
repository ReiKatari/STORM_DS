package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a14  reason: default package */
/* loaded from: classes.dex */
public final class a14 {
    public final d24 a;

    public /* synthetic */ a14(d24 d24Var) {
        this.a = d24Var;
    }

    public static final Object a(d24 d24Var) {
        Object g = d24Var.g(null);
        if (g == null) {
            return null;
        }
        if (g instanceof w14) {
            w14 w14Var = (w14) g;
            if (!w14Var.h()) {
                int i = w14Var.b - 1;
                Object f = w14Var.f(i);
                w14Var.k(i);
                f.getClass();
                if (w14Var.h()) {
                    d24Var.k(null);
                }
                if (w14Var.b == 1) {
                    d24Var.m(null, w14Var.e());
                }
                return f;
            }
            vd6.e("List is empty.");
            return null;
        }
        d24Var.k(null);
        return g;
    }

    public static final w14 b(d24 d24Var) {
        if (d24Var.i()) {
            w14 w14Var = b94.b;
            w14Var.getClass();
            return w14Var;
        }
        w14 w14Var2 = new w14();
        Object[] objArr = d24Var.c;
        long[] jArr = d24Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof w14) {
                                w14Var2.b((w14) obj);
                            } else {
                                obj.getClass();
                                w14Var2.a(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return w14Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a14) {
            if (!this.a.equals(((a14) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ')';
    }
}
