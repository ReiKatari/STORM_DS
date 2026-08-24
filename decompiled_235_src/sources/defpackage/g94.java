package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g94  reason: default package */
/* loaded from: classes.dex */
public final class g94 {
    public final ja4 a;

    public /* synthetic */ g94(ja4 ja4Var) {
        this.a = ja4Var;
    }

    public static final Object a(ja4 ja4Var) {
        Object g = ja4Var.g(null);
        if (g == null) {
            return null;
        }
        if (g instanceof ca4) {
            ca4 ca4Var = (ca4) g;
            if (!ca4Var.h()) {
                int i = ca4Var.b - 1;
                Object f = ca4Var.f(i);
                ca4Var.k(i);
                f.getClass();
                if (ca4Var.h()) {
                    ja4Var.k(null);
                }
                if (ca4Var.b == 1) {
                    ja4Var.m(null, ca4Var.e());
                }
                return f;
            }
            fa6.e("List is empty.");
            return null;
        }
        ja4Var.k(null);
        return g;
    }

    public static final ca4 b(ja4 ja4Var) {
        if (ja4Var.i()) {
            ca4 ca4Var = uh4.b;
            ca4Var.getClass();
            return ca4Var;
        }
        ca4 ca4Var2 = new ca4();
        Object[] objArr = ja4Var.c;
        long[] jArr = ja4Var.a;
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
                            if (obj instanceof ca4) {
                                ca4Var2.b((ca4) obj);
                            } else {
                                obj.getClass();
                                ca4Var2.a(obj);
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
        return ca4Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g94) {
            if (!this.a.equals(((g94) obj).a)) {
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
