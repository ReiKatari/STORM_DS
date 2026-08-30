package i4;

import a1.m0;
import a4.l2;
import a4.o0;
import a4.r1;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import java.util.List;
import y3.c0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public static final h3.c f6780a = new h3.c(0.0f, 0.0f, 10.0f, 10.0f);

    public static final p a(o0 o0Var, boolean z10) {
        b3.o oVar = o0Var.A0.f268f;
        l2 l2Var = null;
        if ((oVar.R & 8) != 0) {
            loop0: while (true) {
                if (oVar == null) {
                    break;
                }
                if ((oVar.L & 8) != 0) {
                    b3.o oVar2 = oVar;
                    p2.b bVar = null;
                    while (oVar2 != null) {
                        if (oVar2 instanceof l2) {
                            l2Var = oVar2;
                            break loop0;
                        }
                        if ((oVar2.L & 8) != 0 && (oVar2 instanceof a4.k)) {
                            int i2 = 0;
                            for (b3.o oVar3 = ((a4.k) oVar2).f247j0; oVar3 != null; oVar3 = oVar3.Y) {
                                if ((oVar3.L & 8) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        oVar2 = oVar3;
                                    } else {
                                        if (bVar == null) {
                                            bVar = new p2.b(new b3.o[16]);
                                        }
                                        if (oVar2 != null) {
                                            bVar.b(oVar2);
                                            oVar2 = null;
                                        }
                                        bVar.b(oVar3);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        oVar2 = a4.l.e(bVar);
                    }
                }
                if ((oVar.R & 8) == 0) {
                    break;
                }
                oVar = oVar.Y;
            }
        }
        l2Var.getClass();
        b3.o oVar4 = ((b3.o) l2Var).A;
        m x9 = o0Var.x();
        if (x9 == null) {
            x9 = new m();
        }
        return new p(oVar4, z10, o0Var, x9);
    }

    public static final a1.x b(r rVar, mc.l lVar) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            p a10 = rVar.a();
            o0 o0Var = a10.f6769c;
            if (o0Var.I() && o0Var.H()) {
                a1.x xVar = new a1.x(48);
                d2.t tVar = new d2.t(19, (byte) 0);
                x4.k o5 = p7.o.o(a10.g());
                ((Region) tVar.B).set(o5.f14342a, o5.f14343b, o5.f14344c, o5.f14345d);
                c(tVar, a10, xVar, lVar, a10, new d2.t(19, (byte) 0));
                return xVar;
            }
            a1.x xVar2 = a1.m.f66a;
            xVar2.getClass();
            return xVar2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void c(d2.t tVar, p pVar, a1.x xVar, mc.l lVar, p pVar2, d2.t tVar2) {
        boolean z10;
        h3.c s12;
        h3.c cVar;
        o0 o0Var;
        p pVar3 = pVar;
        int i2 = pVar3.f6773g;
        d2.t tVar3 = tVar2;
        Region region = (Region) tVar3.B;
        o0 o0Var2 = pVar2.f6769c;
        int i10 = pVar2.f6773g;
        boolean z11 = false;
        if (o0Var2.I() && o0Var2.H()) {
            z10 = false;
        } else {
            z10 = true;
        }
        d2.t tVar4 = tVar;
        Region region2 = (Region) tVar4.B;
        if (!region2.isEmpty() || i10 == i2) {
            if (!z10 || pVar2.f6771e) {
                l2 f8 = pVar2.f();
                if (f8 == null) {
                    s12 = o0Var2.A0.f265c.s1();
                } else {
                    b3.o oVar = ((b3.o) f8).A;
                    Object g10 = pVar2.f6770d.A.g(l.f6741b);
                    if (g10 == null) {
                        g10 = null;
                    }
                    if (g10 != null) {
                        z11 = true;
                    }
                    if (!oVar.A.f1777h0) {
                        s12 = h3.c.f6051e;
                    } else if (!z11) {
                        r1 r5 = a4.l.r(oVar, 8);
                        s12 = c0.i(r5).k(r5, true);
                    } else {
                        s12 = a4.l.r(oVar, 8).s1();
                    }
                }
                x4.k o5 = p7.o.o(s12);
                region.set(o5.f14342a, o5.f14343b, o5.f14344c, o5.f14345d);
                if (i10 == i2) {
                    i10 = -1;
                }
                if (region.op(region2, Region.Op.INTERSECT)) {
                    Rect bounds = region.getBounds();
                    xVar.i(i10, new q(pVar2, new x4.k(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                    List j2 = p.j(4, pVar2);
                    int size = j2.size() - 1;
                    while (-1 < size) {
                        if (!((Boolean) lVar.k(j2.get(size))).booleanValue()) {
                            c(tVar4, pVar3, xVar, lVar, (p) j2.get(size), tVar3);
                        }
                        size--;
                        tVar4 = tVar;
                        pVar3 = pVar;
                        tVar3 = tVar2;
                    }
                    if (f(pVar2)) {
                        region2.op(o5.f14342a, o5.f14343b, o5.f14344c, o5.f14345d, Region.Op.DIFFERENCE);
                    }
                } else if (pVar2.f6771e) {
                    p l10 = pVar2.l();
                    if (l10 != null && (o0Var = l10.f6769c) != null && o0Var.I()) {
                        cVar = l10.g();
                    } else {
                        cVar = f6780a;
                    }
                    xVar.i(i10, new q(pVar2, p7.o.o(cVar)));
                } else if (i10 == -1) {
                    Rect bounds2 = region.getBounds();
                    xVar.i(i10, new q(pVar2, new x4.k(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                }
            }
        }
    }

    public static final Object d(m mVar, w wVar) {
        Object g10 = mVar.A.g(wVar);
        if (g10 == null) {
            return null;
        }
        return g10;
    }

    public static final boolean e(p pVar) {
        boolean z10;
        r1 d4 = pVar.d();
        m0 m0Var = pVar.f6770d.A;
        if (d4 != null) {
            z10 = d4.f1();
        } else {
            z10 = false;
        }
        if (!z10 && !m0Var.c(t.f6795p) && !m0Var.c(t.f6794o)) {
            return false;
        }
        return true;
    }

    public static final boolean f(p pVar) {
        if (!e(pVar)) {
            m mVar = pVar.f6770d;
            if (!mVar.L) {
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
                                    if (((w) obj).f6811c) {
                                        return true;
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
            } else {
                return true;
            }
        }
        return false;
    }
}
