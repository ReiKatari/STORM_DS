package p2;

import a1.h0;
import a1.m0;
import a1.s0;
import m9.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final m0 f11296a;

    public /* synthetic */ a(m0 m0Var) {
        this.f11296a = m0Var;
    }

    public static final Object a(m0 m0Var) {
        Object g10 = m0Var.g(null);
        if (g10 == null) {
            return null;
        }
        if (g10 instanceof h0) {
            h0 h0Var = (h0) g10;
            if (!h0Var.h()) {
                int i2 = h0Var.f45b - 1;
                Object f8 = h0Var.f(i2);
                h0Var.k(i2);
                f8.getClass();
                if (h0Var.h()) {
                    m0Var.k(null);
                }
                if (h0Var.f45b == 1) {
                    m0Var.m(null, h0Var.e());
                }
                return f8;
            }
            o.x("List is empty.");
            return null;
        }
        m0Var.k(null);
        return g10;
    }

    public static final h0 b(m0 m0Var) {
        if (m0Var.i()) {
            h0 h0Var = s0.f101b;
            h0Var.getClass();
            return h0Var;
        }
        h0 h0Var2 = new h0();
        Object[] objArr = m0Var.f69c;
        long[] jArr = m0Var.f67a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j2) < 128) {
                            Object obj = objArr[(i2 << 3) + i11];
                            if (obj instanceof h0) {
                                h0Var2.b((h0) obj);
                            } else {
                                obj.getClass();
                                h0Var2.a(obj);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return h0Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!this.f11296a.equals(((a) obj).f11296a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11296a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f11296a + ')';
    }
}
