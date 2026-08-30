package i4;

import a1.m0;
import a1.u0;
import b4.l0;
import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m implements x, Iterable, oc.a {
    public final m0 A;
    public a1.u B;
    public boolean L;
    public boolean R;

    public m() {
        long[] jArr = u0.f103a;
        this.A = new m0();
    }

    @Override // i4.x
    public final void a(w wVar, Object obj) {
        boolean z10 = obj instanceof a;
        m0 m0Var = this.A;
        if (z10 && m0Var.c(wVar)) {
            Object g10 = m0Var.g(wVar);
            g10.getClass();
            a aVar = (a) g10;
            a aVar2 = (a) obj;
            String str = aVar2.f6707a;
            if (str == null) {
                str = aVar.f6707a;
            }
            yb.d dVar = aVar2.f6708b;
            if (dVar == null) {
                dVar = aVar.f6708b;
            }
            m0Var.m(wVar, new a(str, dVar));
        } else {
            m0Var.m(wVar, obj);
        }
        wVar.getClass();
    }

    public final m b() {
        m mVar = new m();
        mVar.L = this.L;
        mVar.R = this.R;
        m0 m0Var = mVar.A;
        m0Var.getClass();
        m0 m0Var2 = this.A;
        m0Var2.getClass();
        Object[] objArr = m0Var2.f68b;
        Object[] objArr2 = m0Var2.f69c;
        long[] jArr = m0Var2.f67a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j2) < 128) {
                            int i12 = (i2 << 3) + i11;
                            m0Var.m(objArr[i12], objArr2[i12]);
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
        return mVar;
    }

    public final Object c(w wVar) {
        Object g10 = this.A.g(wVar);
        if (g10 != null) {
            return g10;
        }
        a0.j.o(wVar, " - consider getOrElse or getOrNull", "Key not present: ");
        return null;
    }

    public final void d(m mVar) {
        m0 m0Var = mVar.A;
        Object[] objArr = m0Var.f68b;
        Object[] objArr2 = m0Var.f69c;
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
                            int i12 = (i2 << 3) + i11;
                            Object obj = objArr[i12];
                            Object obj2 = objArr2[i12];
                            w wVar = (w) obj;
                            m0 m0Var2 = this.A;
                            Object g10 = m0Var2.g(wVar);
                            wVar.getClass();
                            Object j10 = wVar.f6810b.j(g10, obj2);
                            if (j10 != null) {
                                m0Var2.m(wVar, j10);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i10 != 8) {
                        return;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m) {
                m mVar = (m) obj;
                if (!nc.k.a(this.A, mVar.A) || this.L != mVar.L || this.R != mVar.R) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.R) + w.d.e(this.A.hashCode() * 31, this.L, 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        a1.u uVar = this.B;
        if (uVar == null) {
            m0 m0Var = this.A;
            m0Var.getClass();
            a1.u uVar2 = new a1.u(m0Var);
            this.B = uVar2;
            uVar = uVar2;
        }
        return ((a1.h) uVar.entrySet()).iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.L) {
            sb2.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.R) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        m0 m0Var = this.A;
        Object[] objArr = m0Var.f68b;
        Object[] objArr2 = m0Var.f69c;
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
                            int i12 = (i2 << 3) + i11;
                            Object obj = objArr[i12];
                            Object obj2 = objArr2[i12];
                            sb2.append(str);
                            sb2.append(((w) obj).f6809a);
                            sb2.append(" : ");
                            sb2.append(obj2);
                            str = ", ";
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
        return l0.r(this) + "{ " + ((Object) sb2) + " }";
    }
}
