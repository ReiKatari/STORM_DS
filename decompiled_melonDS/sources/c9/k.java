package c9;

import a4.r0;
import ah.h0;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import cd.q1;
import n2.b1;
import n2.f1;
import n2.x1;
import zc.g0;
import zc.m1;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends n3.b implements x1 {

    /* renamed from: m0  reason: collision with root package name */
    public static final a7.a f2733m0 = new a7.a(13);
    public h0 X;
    public final q1 Y = cd.q.c(new h3.e(0));
    public final f1 Z = n2.s.w(null);

    /* renamed from: b0  reason: collision with root package name */
    public final b1 f2734b0 = new b1(1.0f);

    /* renamed from: c0  reason: collision with root package name */
    public final f1 f2735c0 = n2.s.w(null);

    /* renamed from: d0  reason: collision with root package name */
    public g f2736d0;

    /* renamed from: e0  reason: collision with root package name */
    public n3.b f2737e0;

    /* renamed from: f0  reason: collision with root package name */
    public mc.l f2738f0;

    /* renamed from: g0  reason: collision with root package name */
    public y3.o f2739g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f2740h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f2741i0;

    /* renamed from: j0  reason: collision with root package name */
    public final f1 f2742j0;

    /* renamed from: k0  reason: collision with root package name */
    public final f1 f2743k0;

    /* renamed from: l0  reason: collision with root package name */
    public final f1 f2744l0;

    public k(m9.j jVar, b9.h hVar) {
        c cVar = c.f2726a;
        this.f2736d0 = cVar;
        this.f2738f0 = f2733m0;
        this.f2739g0 = y3.n.f14709a;
        this.f2740h0 = 1;
        this.f2742j0 = n2.s.w(cVar);
        this.f2743k0 = n2.s.w(jVar);
        this.f2744l0 = n2.s.w(hVar);
    }

    @Override // n2.x1
    public final void a() {
        x1 x1Var;
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            if (this.X == null) {
                m1 c4 = x.c();
                gd.f fVar = g0.f15015a;
                h0 a10 = x.a(pc.a.G(c4, ed.n.f4465a.Y));
                this.X = a10;
                n3.b bVar = this.f2737e0;
                n3.b bVar2 = null;
                if (bVar instanceof x1) {
                    x1Var = (x1) bVar;
                } else {
                    x1Var = null;
                }
                if (x1Var != null) {
                    x1Var.a();
                }
                if (this.f2741i0) {
                    m9.h a11 = m9.j.a((m9.j) this.f2743k0.getValue());
                    a11.f9387b = ((b9.h) this.f2744l0.getValue()).f2124b;
                    a11.f9402r = null;
                    Drawable drawable = a11.a().A.f9372j;
                    m9.c cVar = q9.e.f12391a;
                    if (drawable != null) {
                        bVar2 = j(drawable);
                    }
                    k(new e(bVar2));
                } else {
                    x.v(a10, null, null, new a9.b(4, null, this), 3);
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // n2.x1
    public final void b() {
        h0 h0Var = this.X;
        x1 x1Var = null;
        if (h0Var != null) {
            x.f(h0Var, null);
        }
        this.X = null;
        n3.b bVar = this.f2737e0;
        if (bVar instanceof x1) {
            x1Var = (x1) bVar;
        }
        if (x1Var != null) {
            x1Var.b();
        }
    }

    @Override // n2.x1
    public final void c() {
        h0 h0Var = this.X;
        x1 x1Var = null;
        if (h0Var != null) {
            x.f(h0Var, null);
        }
        this.X = null;
        n3.b bVar = this.f2737e0;
        if (bVar instanceof x1) {
            x1Var = (x1) bVar;
        }
        if (x1Var != null) {
            x1Var.c();
        }
    }

    @Override // n3.b
    public final void d(float f8) {
        this.f2734b0.h(f8);
    }

    @Override // n3.b
    public final void e(i3.l lVar) {
        this.f2735c0.setValue(lVar);
    }

    @Override // n3.b
    public final long h() {
        n3.b bVar = (n3.b) this.Z.getValue();
        if (bVar != null) {
            return bVar.h();
        }
        return 9205357640488583168L;
    }

    @Override // n3.b
    public final void i(r0 r0Var) {
        k3.b bVar = r0Var.A;
        h3.e eVar = new h3.e(bVar.c());
        q1 q1Var = this.Y;
        q1Var.getClass();
        q1Var.k(null, eVar);
        n3.b bVar2 = (n3.b) this.Z.getValue();
        if (bVar2 != null) {
            bVar2.g(r0Var, bVar.c(), this.f2734b0.g(), (i3.l) this.f2735c0.getValue());
        }
    }

    public final n3.b j(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return pc.a.e(new i3.f(((BitmapDrawable) drawable).getBitmap()), this.f2740h0);
        }
        return new r9.b(drawable.mutate());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(c9.g r13) {
        /*
            r12 = this;
            c9.g r0 = r12.f2736d0
            mc.l r1 = r12.f2738f0
            java.lang.Object r13 = r1.k(r13)
            c9.g r13 = (c9.g) r13
            r12.f2736d0 = r13
            n2.f1 r1 = r12.f2742j0
            r1.setValue(r13)
            boolean r1 = r13 instanceof c9.f
            r2 = 0
            if (r1 == 0) goto L1c
            r1 = r13
            c9.f r1 = (c9.f) r1
            m9.q r1 = r1.f2731b
            goto L25
        L1c:
            boolean r1 = r13 instanceof c9.d
            if (r1 == 0) goto L60
            r1 = r13
            c9.d r1 = (c9.d) r1
            m9.e r1 = r1.f2728b
        L25:
            m9.j r3 = r1.b()
            p9.e r3 = r3.f9410h
            c9.l r4 = c9.m.f2745a
            p9.f r3 = r3.a(r4, r1)
            boolean r4 = r3 instanceof p9.b
            if (r4 == 0) goto L60
            n3.b r4 = r0.a()
            boolean r5 = r0 instanceof c9.e
            if (r5 == 0) goto L3f
            r7 = r4
            goto L40
        L3f:
            r7 = r2
        L40:
            n3.b r8 = r13.a()
            y3.o r9 = r12.f2739g0
            p9.b r3 = (p9.b) r3
            int r10 = r3.f11520c
            boolean r3 = r1 instanceof m9.q
            if (r3 == 0) goto L58
            m9.q r1 = (m9.q) r1
            boolean r1 = r1.f9449g
            if (r1 != 0) goto L55
            goto L58
        L55:
            r1 = 0
        L56:
            r11 = r1
            goto L5a
        L58:
            r1 = 1
            goto L56
        L5a:
            c9.t r6 = new c9.t
            r6.<init>(r7, r8, r9, r10, r11)
            goto L61
        L60:
            r6 = r2
        L61:
            if (r6 == 0) goto L64
            goto L68
        L64:
            n3.b r6 = r13.a()
        L68:
            r12.f2737e0 = r6
            n2.f1 r1 = r12.Z
            r1.setValue(r6)
            ah.h0 r1 = r12.X
            if (r1 == 0) goto L9e
            n3.b r1 = r0.a()
            n3.b r3 = r13.a()
            if (r1 == r3) goto L9e
            n3.b r0 = r0.a()
            boolean r1 = r0 instanceof n2.x1
            if (r1 == 0) goto L88
            n2.x1 r0 = (n2.x1) r0
            goto L89
        L88:
            r0 = r2
        L89:
            if (r0 == 0) goto L8e
            r0.c()
        L8e:
            n3.b r13 = r13.a()
            boolean r0 = r13 instanceof n2.x1
            if (r0 == 0) goto L99
            r2 = r13
            n2.x1 r2 = (n2.x1) r2
        L99:
            if (r2 == 0) goto L9e
            r2.a()
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.k.k(c9.g):void");
    }
}
