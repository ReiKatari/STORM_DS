package n1;

import a4.o0;
import h1.j2;
import l.i0;
import l4.c0;
import n2.f1;
import n2.w0;
import p1.a0;
import p1.l0;
import p1.n0;
import zc.l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x implements j2 {

    /* renamed from: x  reason: collision with root package name */
    public static final a0 f9846x = y2.k.b(new mg.m(3, (byte) 0), new c0(20));

    /* renamed from: a  reason: collision with root package name */
    public final a f9847a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9848b;

    /* renamed from: c  reason: collision with root package name */
    public p f9849c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9850d;

    /* renamed from: e  reason: collision with root package name */
    public final r f9851e;

    /* renamed from: f  reason: collision with root package name */
    public final f1 f9852f;

    /* renamed from: g  reason: collision with root package name */
    public final j1.i f9853g;

    /* renamed from: h  reason: collision with root package name */
    public float f9854h;

    /* renamed from: i  reason: collision with root package name */
    public final h1.n f9855i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f9856j;

    /* renamed from: k  reason: collision with root package name */
    public o0 f9857k;

    /* renamed from: l  reason: collision with root package name */
    public final v f9858l;
    public final p1.d m;

    /* renamed from: n  reason: collision with root package name */
    public final p1.w f9859n;

    /* renamed from: o  reason: collision with root package name */
    public final h1.a f9860o;

    /* renamed from: p  reason: collision with root package name */
    public final p1.o0 f9861p;

    /* renamed from: q  reason: collision with root package name */
    public final i0 f9862q;

    /* renamed from: r  reason: collision with root package name */
    public final l0 f9863r;

    /* renamed from: s  reason: collision with root package name */
    public final w0 f9864s;

    /* renamed from: t  reason: collision with root package name */
    public final f1 f9865t;

    /* renamed from: u  reason: collision with root package name */
    public final f1 f9866u;

    /* renamed from: v  reason: collision with root package name */
    public final w0 f9867v;

    /* renamed from: w  reason: collision with root package name */
    public final a0 f9868w;

    /* JADX WARN: Type inference failed for: r0v0, types: [n1.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [p1.d, java.lang.Object] */
    public x(int i2, int i10) {
        ?? obj = new Object();
        obj.f9747a = -1;
        obj.f9749c = -1;
        this.f9847a = obj;
        this.f9851e = new r(i2, i10, 0);
        this.f9852f = new f1(z.f9870a, n2.e.R);
        this.f9853g = new j1.i();
        this.f9855i = new h1.n(new mh.z(3, this));
        this.f9856j = true;
        this.f9858l = new v(this, 0);
        this.m = new Object();
        this.f9859n = new p1.w();
        this.f9860o = new h1.a(1);
        this.f9861p = new p1.o0(new t(this, i2));
        this.f9862q = new i0(7, this);
        this.f9863r = new l0();
        this.f9864s = p1.l.h();
        Boolean bool = Boolean.FALSE;
        this.f9865t = n2.s.w(bool);
        this.f9866u = n2.s.w(bool);
        this.f9867v = p1.l.h();
        this.f9868w = new a0(1);
    }

    @Override // h1.j2
    public final boolean a() {
        return ((Boolean) this.f9866u.getValue()).booleanValue();
    }

    @Override // h1.j2
    public final boolean b() {
        return this.f9855i.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        if (r5.m.h(r0) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
        if (r5.f9855i.c(r6, r7, r0) != r1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    @Override // h1.j2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(f1.f1 r6, mc.p r7, cc.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof n1.w
            if (r0 == 0) goto L13
            r0 = r8
            n1.w r0 = (n1.w) r0
            int r1 = r0.f9845b0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9845b0 = r1
            goto L18
        L13:
            n1.w r0 = new n1.w
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.Y
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.f9845b0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            p7.j.I(r8)
            goto L6b
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r6)
            r6 = 0
            return r6
        L31:
            ec.j r6 = r0.X
            r7 = r6
            mc.p r7 = (mc.p) r7
            f1.f1 r6 = r0.R
            p7.j.I(r8)
            goto L5b
        L3c:
            p7.j.I(r8)
            n2.f1 r8 = r5.f9852f
            java.lang.Object r8 = r8.getValue()
            n1.p r2 = n1.z.f9870a
            if (r8 != r2) goto L5b
            r0.R = r6
            r8 = r7
            ec.j r8 = (ec.j) r8
            r0.X = r8
            r0.f9845b0 = r4
            p1.d r8 = r5.m
            java.lang.Object r8 = r8.h(r0)
            if (r8 != r1) goto L5b
            goto L6a
        L5b:
            r8 = 0
            r0.R = r8
            r0.X = r8
            r0.f9845b0 = r3
            h1.n r8 = r5.f9855i
            java.lang.Object r6 = r8.c(r6, r7, r0)
            if (r6 != r1) goto L6b
        L6a:
            return r1
        L6b:
            yb.y r6 = yb.y.f14813a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.x.c(f1.f1, mc.p, cc.c):java.lang.Object");
    }

    @Override // h1.j2
    public final boolean d() {
        return ((Boolean) this.f9865t.getValue()).booleanValue();
    }

    @Override // h1.j2
    public final float e(float f8) {
        return this.f9855i.e(f8);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public final void f(p pVar, boolean z10, boolean z11) {
        int i2;
        boolean z12;
        String str;
        long j2;
        long j10;
        Object obj;
        boolean z13;
        int i10;
        mc.l lVar;
        ?? r22 = pVar.f9810k;
        int i11 = pVar.f9812n;
        int i12 = pVar.f9801b;
        q qVar = pVar.f9800a;
        this.f9861p.f11242e = r22.size();
        a0 a0Var = this.f9868w;
        r rVar = this.f9851e;
        if (!z10 && this.f9848b) {
            this.f9849c = pVar;
            z2.f e6 = z2.q.e();
            if (e6 != null) {
                lVar = e6.e();
            } else {
                lVar = null;
            }
            z2.f h2 = z2.q.h(e6);
            try {
                if (((Number) ((d1.k) a0Var.L).B.getValue()).floatValue() != 0.0f && qVar != null && qVar.f9816a == rVar.f9834b.g() && i12 == rVar.f9835c.g()) {
                    l1 l1Var = (l1) a0Var.B;
                    if (l1Var != null) {
                        l1Var.i(null);
                    }
                    a0Var.L = new d1.k(d1.d.f3545j, Float.valueOf(0.0f), null, 60);
                }
                return;
            } finally {
                z2.q.k(e6, h2, lVar);
            }
        }
        boolean z14 = true;
        if (z10) {
            this.f9848b = true;
        }
        if (qVar != null) {
            i2 = qVar.f9816a;
        } else {
            i2 = 0;
        }
        if (i2 == 0 && i12 == 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.f9866u.setValue(Boolean.valueOf(z12));
        this.f9865t.setValue(Boolean.valueOf(pVar.f9802c));
        this.f9854h -= pVar.f9803d;
        this.f9852f.setValue(pVar);
        if (z11) {
            rVar.getClass();
            if (i12 < 0.0f) {
                z14 = false;
            }
            if (!z14) {
                k1.b.c("scrollOffset should be non-negative");
            }
            rVar.f9835c.h(i12);
        } else {
            q qVar2 = (q) zb.l.T(r22);
            q qVar3 = (q) zb.l.a0(r22);
            if (qVar2 != null) {
                str = "scrollOffset should be non-negative";
                j2 = qVar2.f9816a;
            } else {
                str = "scrollOffset should be non-negative";
                j2 = -1;
            }
            p7.k.y(j2, "firstVisibleItem:index");
            if (qVar3 != null) {
                j10 = qVar3.f9816a;
            } else {
                j10 = -1;
            }
            p7.k.y(j10, "lastVisibleItem:index");
            rVar.getClass();
            if (qVar != null) {
                obj = qVar.f9824i;
            } else {
                obj = null;
            }
            rVar.f9837e = obj;
            if (rVar.f9836d || i11 > 0) {
                rVar.f9836d = true;
                if (i12 >= 0.0f) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    k1.b.c(str);
                }
                if (qVar != null) {
                    i10 = qVar.f9816a;
                } else {
                    i10 = 0;
                }
                rVar.a(i10, i12);
            }
            if (this.f9856j) {
                a aVar = this.f9847a;
                int i13 = aVar.f9747a;
                boolean z15 = aVar.f9748b;
                if (i13 != -1 && !r22.isEmpty() && i13 != a.a(pVar, z15)) {
                    aVar.f9747a = -1;
                    n0 n0Var = (n0) aVar.f9751e;
                    if (n0Var != null) {
                        n0Var.cancel();
                    }
                    aVar.f9751e = null;
                }
                int i14 = aVar.f9749c;
                if (i14 != -1 && aVar.f9750d != 0.0f && i14 != i11 && !r22.isEmpty()) {
                    if (aVar.f9750d >= 0.0f) {
                        z14 = false;
                    }
                    int a10 = a.a(pVar, z14);
                    if (a10 >= 0 && a10 < i11) {
                        aVar.f9747a = a10;
                        aVar.f9751e = i0.p(this.f9862q, a10);
                    }
                }
                aVar.f9749c = i11;
            }
        }
        if (z10) {
            a0Var.M(pVar.f9805f, pVar.f9808i, pVar.f9807h);
        }
    }

    public final int g() {
        return this.f9851e.f9834b.g();
    }

    public final int h() {
        return this.f9851e.f9835c.g();
    }

    public final p i() {
        return (p) this.f9852f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    public final void j(float f8, p pVar) {
        boolean z10;
        n0 n0Var;
        n0 n0Var2;
        if (this.f9856j) {
            boolean isEmpty = pVar.f9810k.isEmpty();
            a aVar = this.f9847a;
            if (!isEmpty) {
                if (f8 < 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int a10 = a.a(pVar, z10);
                if (a10 >= 0 && a10 < pVar.f9812n) {
                    if (a10 != aVar.f9747a) {
                        if (aVar.f9748b != z10) {
                            aVar.f9747a = -1;
                            n0 n0Var3 = (n0) aVar.f9751e;
                            if (n0Var3 != null) {
                                n0Var3.cancel();
                            }
                            aVar.f9751e = null;
                        }
                        aVar.f9748b = z10;
                        aVar.f9747a = a10;
                        aVar.f9751e = i0.p(this.f9862q, a10);
                    }
                    ?? r22 = pVar.f9810k;
                    if (z10) {
                        q qVar = (q) zb.l.Z(r22);
                        if (((qVar.f9827l + qVar.m) + pVar.f9815q) - pVar.m < (-f8) && (n0Var2 = (n0) aVar.f9751e) != null) {
                            n0Var2.a();
                        }
                    } else if (pVar.f9811l - ((q) zb.l.R(r22)).f9827l < f8 && (n0Var = (n0) aVar.f9751e) != null) {
                        n0Var.a();
                    }
                }
            }
            aVar.f9750d = f8;
        }
    }

    public final void k(int i2) {
        r rVar = this.f9851e;
        if (rVar.f9834b.g() != i2 || rVar.f9835c.g() != 0) {
            p1.w wVar = this.f9859n;
            wVar.d();
            wVar.f11273b = null;
        }
        rVar.a(i2, 0);
        rVar.f9837e = null;
        o0 o0Var = this.f9857k;
        if (o0Var != null) {
            o0Var.k();
        }
    }
}
