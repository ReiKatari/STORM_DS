package f2;

import u1.k1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z0 implements u1.v0 {

    /* renamed from: b  reason: collision with root package name */
    public l4.q0 f4815b;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b1 f4817d;

    /* renamed from: a  reason: collision with root package name */
    public boolean f4814a = true;

    /* renamed from: c  reason: collision with root package name */
    public a0.j f4816c = w.f4801d;

    public z0(b1 b1Var) {
        this.f4817d = b1Var;
    }

    @Override // u1.v0
    public final void a(long j2, a0.j jVar) {
        long j10;
        k1 d4;
        k1 d10;
        b1 b1Var = this.f4817d;
        n2.f1 f1Var = b1Var.f4722r;
        if (b1Var.k() && ((u1.c0) f1Var.getValue()) == null) {
            f1Var.setValue(u1.c0.SelectionEnd);
            b1Var.f4724t = -1;
            this.f4814a = true;
            this.f4816c = jVar;
            b1Var.o();
            u1.p0 p0Var = b1Var.f4709d;
            if (p0Var != null && (d10 = p0Var.d()) != null && d10.c(j2)) {
                if (b1Var.n().f12276a.B.length() != 0) {
                    b1Var.h(false);
                    long c4 = b1.c(b1Var, q4.x.a(b1Var.n(), null, l4.q0.f8883b, 5), j2, true, false, this.f4816c, true);
                    j10 = j2;
                    b1Var.f4720p = new l4.q0(c4);
                    this.f4815b = new l4.q0(c4);
                } else {
                    return;
                }
            } else {
                j10 = j2;
                u1.p0 p0Var2 = b1Var.f4709d;
                if (p0Var2 != null && (d4 = p0Var2.d()) != null) {
                    int l10 = b1Var.f4707b.l(d4.b(j10, true));
                    q4.x e6 = b1.e(b1Var.n().f12276a, l4.i0.b(l10, l10));
                    b1Var.h(false);
                    q3.a aVar = b1Var.f4716k;
                    if (aVar != null) {
                        aVar.a(9);
                    }
                    b1Var.f4708c.k(e6);
                    b1Var.f4727w = new l4.q0(e6.f12277b);
                }
                this.f4814a = false;
            }
            b1Var.q(u1.d0.None);
            b1Var.f4719o = j10;
            b1Var.f4723s.setValue(new h3.b(j10));
            b1Var.f4721q = 0L;
        }
    }

    @Override // u1.v0
    public final void b() {
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d8  */
    @Override // u1.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r9) {
        /*
            r8 = this;
            f2.b1 r0 = r8.f4817d
            boolean r1 = r0.k()
            if (r1 == 0) goto Ldd
            q4.x r1 = r0.n()
            l4.h r1 = r1.f12276a
            java.lang.String r1 = r1.B
            int r1 = r1.length()
            if (r1 != 0) goto L18
            goto Ldd
        L18:
            long r1 = r0.f4721q
            long r9 = h3.b.e(r1, r9)
            r0.f4721q = r9
            u1.p0 r9 = r0.f4709d
            r10 = 0
            if (r9 == 0) goto Lda
            u1.k1 r9 = r9.d()
            if (r9 == 0) goto Lda
            long r1 = r0.f4719o
            long r3 = r0.f4721q
            long r1 = h3.b.e(r1, r3)
            h3.b r3 = new h3.b
            r3.<init>(r1)
            n2.f1 r1 = r0.f4723s
            r1.setValue(r3)
            l4.q0 r1 = r0.f4720p
            if (r1 != 0) goto L8e
            h3.b r1 = r0.i()
            r1.getClass()
            long r1 = r1.f6050a
            boolean r1 = r9.c(r1)
            if (r1 != 0) goto L8e
            q4.q r1 = r0.f4707b
            long r2 = r0.f4719o
            r4 = 1
            int r2 = r9.b(r2, r4)
            int r1 = r1.l(r2)
            q4.q r2 = r0.f4707b
            h3.b r3 = r0.i()
            r3.getClass()
            long r5 = r3.f6050a
            int r9 = r9.b(r5, r4)
            int r9 = r2.l(r9)
            if (r1 != r9) goto L76
            a0.j r9 = f2.w.f4801d
        L74:
            r6 = r9
            goto L79
        L76:
            a0.j r9 = f2.w.f4802e
            goto L74
        L79:
            q4.x r1 = r0.n()
            h3.b r9 = r0.i()
            r9.getClass()
            long r2 = r9.f6050a
            r5 = 0
            r7 = 1
            r4 = 0
            long r1 = f2.b1.c(r0, r1, r2, r4, r5, r6, r7)
            goto Lc9
        L8e:
            l4.q0 r1 = r0.f4720p
            if (r1 == 0) goto L99
            long r1 = r1.f8885a
            r3 = 32
            long r1 = r1 >> r3
            int r1 = (int) r1
            goto L9f
        L99:
            long r1 = r0.f4719o
            int r1 = r9.b(r1, r10)
        L9f:
            h3.b r2 = r0.i()
            r2.getClass()
            long r2 = r2.f6050a
            int r9 = r9.b(r2, r10)
            l4.q0 r2 = r0.f4720p
            if (r2 != 0) goto Lb3
            if (r1 != r9) goto Lb3
            goto Ldd
        Lb3:
            q4.x r1 = r0.n()
            h3.b r9 = r0.i()
            r9.getClass()
            long r2 = r9.f6050a
            a0.j r6 = r8.f4816c
            r7 = 1
            r4 = 0
            r5 = 0
            long r1 = f2.b1.c(r0, r1, r2, r4, r5, r6, r7)
        Lc9:
            l4.q0 r9 = new l4.q0
            r9.<init>(r1)
            r8.f4815b = r9
            l4.q0 r9 = r0.f4720p
            boolean r9 = l4.q0.a(r1, r9)
            if (r9 != 0) goto Lda
            r8.f4814a = r10
        Lda:
            r0.t(r10)
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.z0.e(long):void");
    }

    public final void f() {
        long j2;
        u1.d0 d0Var;
        boolean z10;
        boolean z11;
        b1 b1Var = this.f4817d;
        b1Var.f4722r.setValue(null);
        b1Var.f4723s.setValue(null);
        this.f4816c = w.f4801d;
        boolean z12 = true;
        b1Var.t(true);
        l4.q0 q0Var = this.f4815b;
        if (q0Var != null) {
            j2 = q0Var.f8885a;
        } else {
            j2 = b1Var.n().f12277b;
        }
        boolean c4 = l4.q0.c(j2);
        if (c4) {
            d0Var = u1.d0.Cursor;
        } else {
            d0Var = u1.d0.Selection;
        }
        b1Var.q(d0Var);
        u1.p0 p0Var = b1Var.f4709d;
        if (p0Var != null) {
            if (!c4 && pc.a.C(b1Var, true)) {
                z11 = true;
            } else {
                z11 = false;
            }
            p0Var.m.setValue(Boolean.valueOf(z11));
        }
        u1.p0 p0Var2 = b1Var.f4709d;
        if (p0Var2 != null) {
            if (!c4 && pc.a.C(b1Var, false)) {
                z10 = true;
            } else {
                z10 = false;
            }
            p0Var2.f13391n.setValue(Boolean.valueOf(z10));
        }
        u1.p0 p0Var3 = b1Var.f4709d;
        if (p0Var3 != null) {
            if (!c4 || !pc.a.C(b1Var, true)) {
                z12 = false;
            }
            p0Var3.f13392o.setValue(Boolean.valueOf(z12));
        }
        if (this.f4814a) {
            b1.b(b1Var, b1Var.f4720p);
        }
        b1Var.f4720p = null;
    }

    @Override // u1.v0
    public final void onCancel() {
        f();
    }

    @Override // u1.v0
    public final void c() {
    }

    @Override // u1.v0
    public final void d() {
    }
}
