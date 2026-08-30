package ah;

import android.net.Uri;
import cd.q1;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;
import kf.d2;
import kf.u1;
import kf.y1;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.impl.emulator.EmulatorMessageQueue;
import q.q3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h1 extends androidx.lifecycle.y0 {
    public final cd.y0 A;
    public final q1 B;
    public final cd.y0 C;
    public final cd.e1 D;
    public final cd.x0 E;
    public final cd.e1 F;
    public final cd.x0 G;
    public final q1 H;
    public final cd.y0 I;
    public final cd.e1 J;
    public final cd.x0 K;
    public final cd.e1 L;
    public final cd.x0 M;
    public final l0 N;
    public final cd.e1 O;
    public final cd.x0 P;

    /* renamed from: b  reason: collision with root package name */
    public final cf.d f763b;

    /* renamed from: c  reason: collision with root package name */
    public final cf.c f764c;

    /* renamed from: d  reason: collision with root package name */
    public final cf.a f765d;

    /* renamed from: e  reason: collision with root package name */
    public final cf.b f766e;

    /* renamed from: f  reason: collision with root package name */
    public final xf.a f767f;

    /* renamed from: g  reason: collision with root package name */
    public final kf.b1 f768g;

    /* renamed from: h  reason: collision with root package name */
    public final kf.r0 f769h;

    /* renamed from: i  reason: collision with root package name */
    public final kf.m0 f770i;

    /* renamed from: j  reason: collision with root package name */
    public final ae.a f771j;

    /* renamed from: k  reason: collision with root package name */
    public final d5.f f772k;

    /* renamed from: l  reason: collision with root package name */
    public final pf.j f773l;
    public final pf.p m;

    /* renamed from: n  reason: collision with root package name */
    public final q3 f774n;

    /* renamed from: o  reason: collision with root package name */
    public final h0 f775o;

    /* renamed from: p  reason: collision with root package name */
    public zc.l1 f776p;

    /* renamed from: q  reason: collision with root package name */
    public final q1 f777q;

    /* renamed from: r  reason: collision with root package name */
    public final cd.y0 f778r;

    /* renamed from: s  reason: collision with root package name */
    public final q1 f779s;

    /* renamed from: t  reason: collision with root package name */
    public final cd.x0 f780t;

    /* renamed from: u  reason: collision with root package name */
    public final q1 f781u;

    /* renamed from: v  reason: collision with root package name */
    public final cd.y0 f782v;

    /* renamed from: w  reason: collision with root package name */
    public final q1 f783w;

    /* renamed from: x  reason: collision with root package name */
    public final q1 f784x;

    /* renamed from: y  reason: collision with root package name */
    public final cd.y0 f785y;

    /* renamed from: z  reason: collision with root package name */
    public final q1 f786z;

    public h1(cf.d dVar, cf.c cVar, cf.a aVar, cf.b bVar, xf.a aVar2, kf.b1 b1Var, kf.r0 r0Var, kf.m0 m0Var, ae.a aVar3, d5.f fVar, pf.j jVar, pf.p pVar, q3 q3Var, androidx.lifecycle.p0 p0Var) {
        Uri uri;
        dVar.getClass();
        cVar.getClass();
        aVar.getClass();
        bVar.getClass();
        aVar2.getClass();
        b1Var.getClass();
        r0Var.getClass();
        m0Var.getClass();
        aVar3.getClass();
        jVar.getClass();
        pVar.getClass();
        p0Var.getClass();
        this.f763b = dVar;
        this.f764c = cVar;
        this.f765d = aVar;
        this.f766e = bVar;
        this.f767f = aVar2;
        this.f768g = b1Var;
        this.f769h = r0Var;
        this.f770i = m0Var;
        this.f771j = aVar3;
        this.f772k = fVar;
        this.f773l = jVar;
        this.m = pVar;
        this.f774n = q3Var;
        h0 h0Var = new h0();
        h0Var.B = cc.h.A;
        this.f775o = h0Var;
        q1 c4 = cd.q.c(hh.l.f6543a);
        this.f777q = c4;
        this.f778r = new cd.y0(c4);
        pc.a aVar4 = null;
        this.f779s = cd.q.c(null);
        this.f780t = cd.q.y((cd.u0) fVar.f3846h, androidx.lifecycle.s0.h(this), cd.i1.f2833b, 0);
        q1 c10 = cd.q.c(null);
        this.f781u = c10;
        this.f782v = new cd.y0(c10);
        this.f783w = (q1) ((d2) dVar).f8184e.getValue();
        q1 c11 = cd.q.c(null);
        this.f784x = c11;
        this.f785y = new cd.y0(c11);
        oe.h0 h0Var2 = oe.h0.f10933c;
        q1 c12 = cd.q.c(h0Var2);
        this.f786z = c12;
        this.A = new cd.y0(c12);
        q1 c13 = cd.q.c(h0Var2);
        this.B = c13;
        this.C = new cd.y0(c13);
        cd.e1 b10 = cd.q.b(0, 100, bd.a.DROP_OLDEST, 1);
        this.D = b10;
        this.E = new cd.x0(b10);
        cd.e1 b11 = cd.q.b(0, 100, bd.a.SUSPEND, 1);
        this.F = b11;
        this.G = new cd.x0(b11);
        q1 c14 = cd.q.c(null);
        this.H = c14;
        this.I = new cd.y0(c14);
        cd.e1 b12 = aj.g.b();
        this.J = b12;
        this.K = new cd.x0(b12);
        cd.e1 b13 = aj.g.b();
        this.L = b13;
        this.M = new cd.x0(b13);
        this.N = new l0((q1) q3Var.f11999f, 2);
        cd.e1 b14 = aj.g.b();
        this.O = b14;
        this.P = new cd.x0(b14);
        zc.x.v(androidx.lifecycle.s0.h(this), null, null, new g0(this, null, 0), 3);
        if (nc.k.a(p0Var.a("boot_firmware_only"), Boolean.TRUE)) {
            Integer num = (Integer) p0Var.a("boot_firmware_console");
            if (num != null) {
                aVar4 = new hh.a0((ConsoleType) ((fc.b) ConsoleType.getEntries()).get(num.intValue()));
            }
        } else {
            eg.j jVar2 = (eg.j) p0Var.a("rom");
            if (jVar2 != null) {
                aVar4 = new hh.b0(jVar2.A);
            } else {
                Object a10 = p0Var.a("uri");
                if (a10 instanceof String) {
                    uri = Uri.parse((String) a10);
                } else if (a10 instanceof Uri) {
                    uri = (Uri) a10;
                } else {
                    uri = null;
                }
                if (uri != null) {
                    aVar4 = new hh.d0(uri);
                } else {
                    String str = (String) p0Var.a("PATH");
                    if (str != null) {
                        aVar4 = new hh.c0(str);
                    }
                }
            }
        }
        if (aVar4 != null) {
            p(aVar4);
        } else {
            b14.p(hh.p.f6558a);
        }
    }

    public static final a9.i e(h1 h1Var) {
        return new a9.i(1, new a9.i(3, new l0(h1Var.f777q, 0)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
        if (r5 == r1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f7, code lost:
        if (r0 == r1) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e8  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List, zb.q] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(ah.h1 r21, ze.a r22, ec.c r23) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.h1.f(ah.h1, ze.a, ec.c):java.lang.Object");
    }

    public static final Serializable g(h1 h1Var, oe.e0 e0Var, ec.j jVar) {
        if (((d2) h1Var.f763b).f8181b.getBoolean("cheats_enabled", false)) {
            pf.p pVar = h1Var.m;
            if (!pVar.f11642a || !pVar.f11643b) {
                return ((u1) h1Var.f765d).h(e0Var, jVar);
            }
        }
        return zb.q.A;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(ah.h1 r4, java.util.UUID r5, ve.a r6, ec.c r7) {
        /*
            boolean r0 = r7 instanceof ah.s0
            if (r0 == 0) goto L13
            r0 = r7
            ah.s0 r0 = (ah.s0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ah.s0 r0 = new ah.s0
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ve.a r6 = r0.R
            p7.j.I(r7)
            goto L49
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r4)
            r4 = 0
            return r4
        L30:
            p7.j.I(r7)
            if (r5 != 0) goto L3c
            oe.h0 r4 = new oe.h0
            r5 = 0
            r4.<init>(r5, r6)
            return r4
        L3c:
            kf.r0 r4 = r4.f769h
            r0.R = r6
            r0.Z = r3
            java.lang.Object r7 = r4.c(r5, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            oe.a r7 = (oe.a) r7
            oe.h0 r4 = new oe.h0
            r4.<init>(r7, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.h1.h(ah.h1, java.util.UUID, ve.a, ec.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
        if (r9 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(ah.h1 r6, ze.a r7, oe.j0 r8, ec.c r9) {
        /*
            boolean r0 = r9 instanceof ah.v0
            if (r0 == 0) goto L13
            r0 = r9
            ah.v0 r0 = (ah.v0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ah.v0 r0 = new ah.v0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2d
            boolean r6 = r0.R
            p7.j.I(r9)
            goto L77
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r6)
            return r5
        L33:
            p7.j.I(r9)
            goto L5f
        L37:
            p7.j.I(r9)
            boolean r9 = r8.f10943b
            if (r9 != 0) goto L41
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L41:
            kf.m0 r9 = r6.f770i
            android.net.Uri r7 = r9.c(r7, r8)
            pf.j r8 = r6.f773l
            r0.Z = r4
            r8.getClass()
            gd.f r8 = zc.g0.f15015a
            gd.e r8 = gd.e.L
            pf.g r9 = new pf.g
            r2 = 0
            r9.<init>(r7, r5, r2)
            java.lang.Object r9 = zc.x.F(r8, r9, r0)
            if (r9 != r1) goto L5f
            goto L75
        L5f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r7 = r9.booleanValue()
            if (r7 == 0) goto L78
            cd.e1 r6 = r6.F
            r0.R = r7
            r0.Z = r3
            hh.v0 r8 = hh.v0.f6582a
            java.lang.Object r6 = r6.a(r8, r0)
            if (r6 != r1) goto L76
        L75:
            return r1
        L76:
            r6 = r7
        L77:
            r7 = r6
        L78:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.h1.i(ah.h1, ze.a, oe.j0, ec.c):java.lang.Object");
    }

    public static final void j(h1 h1Var, hh.o oVar) {
        h0 h0Var = h1Var.f775o;
        zc.x.e(h0Var.B, null);
        zc.m1 c4 = zc.x.c();
        gd.f fVar = zc.g0.f15015a;
        h0Var.B = pc.a.G(c4, ed.n.f4465a.Y);
        pf.p pVar = h1Var.m;
        pVar.f11643b = false;
        pVar.f11642a = false;
        pVar.f11644c = false;
        pVar.f11645d = null;
        h1Var.f776p = null;
        h1Var.H.j(null);
        q1 q1Var = h1Var.f777q;
        q1Var.getClass();
        q1Var.k(null, oVar);
        q1 q1Var2 = h1Var.f786z;
        oe.h0 h0Var2 = oe.h0.f10933c;
        q1Var2.j(h0Var2);
        h1Var.B.j(h0Var2);
        h1Var.f779s.j(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(ah.h1 r10, ze.a r11, oe.j0 r12, ec.c r13) {
        /*
            boolean r0 = r13 instanceof ah.a1
            if (r0 == 0) goto L13
            r0 = r13
            ah.a1 r0 = (ah.a1) r0
            int r1 = r0.f720b0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f720b0 = r1
            goto L18
        L13:
            ah.a1 r0 = new ah.a1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.Y
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.f720b0
            r3 = 1
            r8 = 0
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2e
            oe.j0 r12 = r0.X
            ze.a r11 = r0.R
            p7.j.I(r13)
        L2b:
            r6 = r11
            r7 = r12
            goto L59
        L2e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r10)
            r10 = 0
            return r10
        L35:
            p7.j.I(r13)
            kf.m0 r13 = r10.f770i
            android.net.Uri r13 = r13.c(r11, r12)
            pf.j r2 = r10.f773l
            r0.R = r11
            r0.X = r12
            r0.f720b0 = r3
            r2.getClass()
            gd.f r2 = zc.g0.f15015a
            gd.e r2 = gd.e.L
            pf.g r4 = new pf.g
            r4.<init>(r13, r8, r3)
            java.lang.Object r13 = zc.x.F(r2, r4, r0)
            if (r13 != r1) goto L2b
            return r1
        L59:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r11 = r13.booleanValue()
            if (r11 != 0) goto L64
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            return r10
        L64:
            ah.h0 r11 = r10.f775o
            a2.o r4 = new a2.o
            r9 = 4
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r10 = 3
            zc.x.v(r11, r8, r8, r4, r10)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.h1.k(ah.h1, ze.a, oe.j0, ec.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(ah.h1 r4, p7.o r5, ec.c r6) {
        /*
            boolean r0 = r6 instanceof ah.b1
            if (r0 == 0) goto L13
            r0 = r6
            ah.b1 r0 = (ah.b1) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ah.b1 r0 = new ah.b1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            p7.o r5 = r0.R
            p7.j.I(r6)
            goto L42
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r4)
            r4 = 0
            return r4
        L30:
            p7.j.I(r6)
            cf.b r6 = r4.f766e
            r0.R = r5
            r0.Z = r3
            kf.z r6 = (kf.z) r6
            java.lang.Object r6 = r6.k(r0)
            if (r6 != r1) goto L42
            return r1
        L42:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            cf.d r0 = r4.f763b
            kf.d2 r0 = (kf.d2) r0
            android.content.SharedPreferences r0 = r0.f8181b
            java.lang.String r1 = "ra_hardcore_enabled"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            pf.p r4 = r4.m
            r4.getClass()
            r5.getClass()
            r4.f11643b = r6
            if (r6 == 0) goto L64
            if (r0 == 0) goto L64
            goto L65
        L64:
            r3 = r2
        L65:
            r4.f11642a = r3
            r4.f11645d = r5
            yb.y r4 = yb.y.f14813a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.h1.l(ah.h1, p7.o, ec.c):java.lang.Object");
    }

    @Override // androidx.lifecycle.y0
    public final void d() {
        zc.x.e(this.f775o.B, null);
        pf.j jVar = this.f773l;
        jVar.f11634g.dispose();
        EmulatorMessageQueue emulatorMessageQueue = jVar.f11638k;
        emulatorMessageQueue.f9482c.post(new pf.l(emulatorMessageQueue, 0));
        emulatorMessageQueue.f9481b.quitSafely();
    }

    public final void m(boolean z10) {
        cd.e1 e1Var = this.O;
        if (!z10) {
            q3 q3Var = this.f774n;
            if (!((Collection) ((q1) q3Var.f11999f).getValue()).isEmpty()) {
                e1Var.p(hh.v.f6581a);
                ((bd.h) q3Var.f12000g).a(yb.y.f14813a);
                return;
            }
        }
        pf.j jVar = this.f773l;
        jVar.getClass();
        MelonEmulator.f9466a.stopEmulation();
        jVar.f11634g.a();
        EmulatorMessageQueue emulatorMessageQueue = jVar.f11638k;
        emulatorMessageQueue.f9482c.post(new pf.l(emulatorMessageQueue, 0));
        e1Var.p(hh.p.f6558a);
    }

    public final dd.k n() {
        d2 d2Var = (d2) this.f763b;
        d2Var.getClass();
        return cd.q.z(d2Var.b("input_layout_id", new y1(d2Var, 13)), new n0(0, null, this));
    }

    public final List o(ze.a aVar) {
        String a10;
        kf.m0 m0Var = this.f770i;
        m0Var.getClass();
        aVar.getClass();
        k6.a d4 = m0Var.d(aVar);
        if (d4 == null || (a10 = m0Var.a(aVar)) == null) {
            return zb.q.A;
        }
        oe.j0[] j0VarArr = new oe.j0[9];
        for (int i2 = 0; i2 < 9; i2++) {
            j0VarArr[i2] = new oe.j0(i2, false, null, null);
        }
        String quote = Pattern.quote(a10);
        quote.getClass();
        Pattern compile = Pattern.compile(quote.concat("\\.ml[0-8]"));
        compile.getClass();
        k6.a[] k10 = d4.k();
        k10.getClass();
        for (k6.a aVar2 : k10) {
            String f8 = aVar2.f();
            if (f8 != null && compile.matcher(f8).matches()) {
                char k02 = vc.h.k0(f8);
                int digit = Character.digit((int) k02, 10);
                if (digit >= 0) {
                    oe.j0 j0Var = new oe.j0(digit, true, new Date(aVar2.j()), null);
                    j0VarArr[digit] = oe.j0.a(j0Var, m0Var.f8256b.b(aVar, j0Var));
                } else {
                    throw new IllegalArgumentException("Char " + k02 + " is not a decimal digit");
                }
            }
        }
        return zb.k.Q(j0VarArr);
    }

    public final void p(pc.a aVar) {
        if (aVar instanceof hh.b0) {
            zc.x.v(androidx.lifecycle.s0.h(this), null, null, new t0(this, ((hh.b0) aVar).f6510d, null, 1), 3);
        } else if (aVar instanceof hh.d0) {
            zc.x.v(androidx.lifecycle.s0.h(this), null, null, new u0(this, ((hh.d0) aVar).f6514d, null, 0), 3);
        } else if (aVar instanceof hh.c0) {
            zc.x.v(androidx.lifecycle.s0.h(this), null, null, new u0(this, ((hh.c0) aVar).f6512d, null, 1), 3);
        } else if (aVar instanceof hh.a0) {
            hh.m mVar = new hh.m(((hh.a0) aVar).f6508d);
            q1 q1Var = this.f777q;
            q1Var.getClass();
            q1Var.k(null, mVar);
        } else {
            m9.o.o();
        }
    }

    public final void q(boolean z10) {
        zc.x.v(this.f775o, null, null, new z0(this, z10, null, 0), 3);
    }

    public final void r() {
        if (((hh.o) this.f777q.getValue()).a()) {
            zc.x.v(this.f775o, null, null, new g0(this, null, 3), 3);
        }
    }

    public final void s() {
        zc.x.v(this.f775o, null, null, new g0(this, null, 4), 3);
    }
}
