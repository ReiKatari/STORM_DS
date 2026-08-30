package o1;

import a4.o0;
import g2.c3;
import h1.j2;
import h1.n1;
import l.i0;
import l4.c0;
import mh.z;
import n2.f1;
import n2.w0;
import p1.a0;
import p1.l0;
import p1.n0;
import p1.w;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t implements j2 {

    /* renamed from: w  reason: collision with root package name */
    public static final a0 f10588w = y2.k.b(new mg.m(6, (byte) 0), new c0(26));

    /* renamed from: a  reason: collision with root package name */
    public final n1.a f10589a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10590b;

    /* renamed from: c  reason: collision with root package name */
    public n f10591c;

    /* renamed from: d  reason: collision with root package name */
    public final n1.r f10592d;

    /* renamed from: e  reason: collision with root package name */
    public final f1 f10593e;

    /* renamed from: f  reason: collision with root package name */
    public final j1.i f10594f;

    /* renamed from: g  reason: collision with root package name */
    public float f10595g;

    /* renamed from: h  reason: collision with root package name */
    public final h1.n f10596h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f10597i;

    /* renamed from: j  reason: collision with root package name */
    public o0 f10598j;

    /* renamed from: k  reason: collision with root package name */
    public final n1.v f10599k;

    /* renamed from: l  reason: collision with root package name */
    public final p1.d f10600l;
    public final w m;

    /* renamed from: n  reason: collision with root package name */
    public final h1.a f10601n;

    /* renamed from: o  reason: collision with root package name */
    public final p1.o0 f10602o;

    /* renamed from: p  reason: collision with root package name */
    public final i0 f10603p;

    /* renamed from: q  reason: collision with root package name */
    public final l0 f10604q;

    /* renamed from: r  reason: collision with root package name */
    public final w0 f10605r;

    /* renamed from: s  reason: collision with root package name */
    public final w0 f10606s;

    /* renamed from: t  reason: collision with root package name */
    public final f1 f10607t;

    /* renamed from: u  reason: collision with root package name */
    public final f1 f10608u;

    /* renamed from: v  reason: collision with root package name */
    public final a0 f10609v;

    /* JADX WARN: Type inference failed for: r0v0, types: [n1.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [p1.d, java.lang.Object] */
    public t(int i2, int i10) {
        ?? obj = new Object();
        obj.f9747a = -1;
        obj.f9751e = new p2.b(new n0[16]);
        obj.f9749c = -1;
        this.f10589a = obj;
        this.f10592d = new n1.r(i2, i10, 1);
        this.f10593e = new f1(u.f10610a, n2.e.R);
        this.f10594f = new j1.i();
        this.f10596h = new h1.n(new z(11, this));
        this.f10597i = true;
        this.f10599k = new n1.v(this, 1);
        this.f10600l = new Object();
        this.m = new w();
        this.f10601n = new h1.a(1);
        this.f10602o = new p1.o0(new c3(i2, 2, this));
        this.f10603p = new i0(11, this);
        this.f10604q = new l0();
        this.f10605r = p1.l.h();
        this.f10606s = p1.l.h();
        Boolean bool = Boolean.FALSE;
        this.f10607t = n2.s.w(bool);
        this.f10608u = n2.s.w(bool);
        this.f10609v = new a0(1);
    }

    @Override // h1.j2
    public final boolean a() {
        return ((Boolean) this.f10608u.getValue()).booleanValue();
    }

    @Override // h1.j2
    public final boolean b() {
        return this.f10596h.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        if (r5.f10600l.h(r0) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
        if (r5.f10596h.c(r6, r7, r0) != r1) goto L11;
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
            boolean r0 = r8 instanceof o1.s
            if (r0 == 0) goto L13
            r0 = r8
            o1.s r0 = (o1.s) r0
            int r1 = r0.f10587b0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10587b0 = r1
            goto L18
        L13:
            o1.s r0 = new o1.s
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.Y
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.f10587b0
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
            n2.f1 r8 = r5.f10593e
            java.lang.Object r8 = r8.getValue()
            o1.n r2 = o1.u.f10610a
            if (r8 != r2) goto L5b
            r0.R = r6
            r8 = r7
            ec.j r8 = (ec.j) r8
            r0.X = r8
            r0.f10587b0 = r4
            p1.d r8 = r5.f10600l
            java.lang.Object r8 = r8.h(r0)
            if (r8 != r1) goto L5b
            goto L6a
        L5b:
            r8 = 0
            r0.R = r8
            r0.X = r8
            r0.f10587b0 = r3
            h1.n r8 = r5.f10596h
            java.lang.Object r6 = r8.c(r6, r7, r0)
            if (r6 != r1) goto L6b
        L6a:
            return r1
        L6b:
            yb.y r6 = yb.y.f14813a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.t.c(f1.f1, mc.p, cc.c):java.lang.Object");
    }

    @Override // h1.j2
    public final boolean d() {
        return ((Boolean) this.f10607t.getValue()).booleanValue();
    }

    @Override // h1.j2
    public final float e(float f8) {
        return this.f10596h.e(f8);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(o1.n r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.t.f(o1.n, boolean, boolean):void");
    }

    public final n g() {
        return (n) this.f10593e.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    public final void h(float f8, n nVar) {
        boolean z10;
        int i2;
        long j2;
        if (this.f10597i) {
            n1.a aVar = this.f10589a;
            p2.b bVar = (p2.b) aVar.f9751e;
            ?? r22 = nVar.m;
            ?? r32 = nVar.m;
            n1 n1Var = nVar.f10557q;
            if (!r22.isEmpty()) {
                int i10 = 0;
                if (f8 < 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int b10 = n1.a.b(nVar, z10);
                if (z10) {
                    i2 = ((o) zb.l.Z(r32)).f10560a + 1;
                } else {
                    i2 = ((o) zb.l.R(r32)).f10560a - 1;
                }
                if (i2 >= 0 && i2 < nVar.f10556p) {
                    if (b10 != aVar.f9747a && b10 >= 0) {
                        if (aVar.f9748b != z10) {
                            Object[] objArr = bVar.A;
                            int i11 = bVar.L;
                            for (int i12 = 0; i12 < i11; i12++) {
                                ((n0) objArr[i12]).cancel();
                            }
                        }
                        aVar.f9748b = z10;
                        aVar.f9747a = b10;
                        bVar.g();
                        bVar.c(bVar.L, this.f10603p.m(b10));
                    }
                    if (z10) {
                        o oVar = (o) zb.l.Z(r32);
                        if (n1Var == n1.Vertical) {
                            j2 = oVar.f10572n & 4294967295L;
                        } else {
                            j2 = oVar.f10572n >> 32;
                        }
                        int i13 = (int) j2;
                        if (((q8.r.J(oVar, n1Var) + i13) + nVar.f10559s) - nVar.f10555o < (-f8)) {
                            Object[] objArr2 = bVar.A;
                            int i14 = bVar.L;
                            while (i10 < i14) {
                                ((n0) objArr2[i10]).a();
                                i10++;
                            }
                        }
                    } else if (nVar.f10554n - q8.r.J((o) zb.l.R(r32), n1Var) < f8) {
                        Object[] objArr3 = bVar.A;
                        int i15 = bVar.L;
                        while (i10 < i15) {
                            ((n0) objArr3[i10]).a();
                            i10++;
                        }
                    }
                }
            }
            aVar.f9750d = f8;
        }
    }
}
