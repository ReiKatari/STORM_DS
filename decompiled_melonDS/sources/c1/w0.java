package c1;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class w0 {

    /* renamed from: a  reason: collision with root package name */
    public static final d1.w1 f2539a = new d1.w1(e.f2406c0, e.f2407d0);

    /* renamed from: b  reason: collision with root package name */
    public static final d1.a1 f2540b = d1.d.q(5, null);

    /* renamed from: c  reason: collision with root package name */
    public static final d1.a1 f2541c;

    /* renamed from: d  reason: collision with root package name */
    public static final d1.a1 f2542d;

    static {
        d1.d.q(5, null);
        long j2 = 1;
        long j10 = (j2 & 4294967295L) | (j2 << 32);
        f2541c = d1.d.q(1, new x4.j(j10));
        f2542d = d1.d.q(1, new x4.l(j10));
    }

    public static c1 a(int i2) {
        b3.f fVar;
        b3.h hVar;
        b3.f fVar2 = b3.c.f1760i0;
        b3.f fVar3 = b3.c.f1758g0;
        long j2 = 1;
        d1.a1 q10 = d1.d.q(1, new x4.l((j2 & 4294967295L) | (j2 << 32)));
        if ((i2 & 2) != 0) {
            fVar = fVar2;
        } else {
            fVar = fVar3;
        }
        if (nc.k.a(fVar, fVar3)) {
            hVar = b3.c.R;
        } else if (nc.k.a(fVar, fVar2)) {
            hVar = b3.c.Y;
        } else {
            hVar = b3.c.X;
        }
        return b(q10, hVar, true, new e(1, 14));
    }

    public static final c1 b(d1.a1 a1Var, b3.h hVar, boolean z10, mc.l lVar) {
        return new c1(new s2((e1) null, (p2) null, new k0(hVar, lVar, a1Var, z10), (e0) null, (LinkedHashMap) null, 123));
    }

    public static c1 c(int i2) {
        boolean z10;
        b3.h hVar;
        b3.g gVar = b3.c.f1757f0;
        b3.g gVar2 = b3.c.f1756e0;
        long j2 = 1;
        d1.a1 q10 = d1.d.q(1, new x4.l((j2 & 4294967295L) | (j2 << 32)));
        if ((i2 & 2) != 0) {
            gVar2 = gVar;
        }
        if ((i2 & 4) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (nc.k.a(gVar2, b3.c.f1755d0)) {
            hVar = b3.c.B;
        } else if (nc.k.a(gVar2, gVar)) {
            hVar = b3.c.f1753b0;
        } else {
            hVar = b3.c.X;
        }
        return b(q10, hVar, z10, new e(1, 15));
    }

    public static c1 d(d1.v1 v1Var, int i2) {
        d1.x xVar = v1Var;
        if ((i2 & 1) != 0) {
            xVar = d1.d.q(5, null);
        }
        return new c1(new s2(new e1(xVar), (p2) null, (k0) null, (e0) null, (LinkedHashMap) null, 126));
    }

    public static d1 e(d1.v1 v1Var, int i2) {
        d1.x xVar = v1Var;
        if ((i2 & 1) != 0) {
            xVar = d1.d.q(5, null);
        }
        return new d1(new s2(new e1(xVar), (p2) null, (k0) null, (e0) null, (LinkedHashMap) null, 126));
    }

    public static final d1 f(d1.x xVar, b3.h hVar, mc.l lVar) {
        return new d1(new s2((e1) null, (p2) null, new k0(hVar, lVar, xVar, true), (e0) null, (LinkedHashMap) null, 123));
    }

    public static d1 g(d1.v1 v1Var, int i2) {
        b3.g gVar;
        b3.h hVar;
        b3.g gVar2 = b3.c.f1757f0;
        b3.g gVar3 = b3.c.f1755d0;
        d1.x xVar = v1Var;
        if ((i2 & 1) != 0) {
            long j2 = 1;
            xVar = d1.d.q(1, new x4.l((j2 & 4294967295L) | (j2 << 32)));
        }
        if ((i2 & 2) != 0) {
            gVar = gVar2;
        } else {
            gVar = gVar3;
        }
        if (nc.k.a(gVar, gVar3)) {
            hVar = b3.c.B;
        } else if (nc.k.a(gVar, gVar2)) {
            hVar = b3.c.f1753b0;
        } else {
            hVar = b3.c.X;
        }
        return f(xVar, hVar, new e(1, 16));
    }

    public static c1 h(mc.l lVar) {
        long j2 = 1;
        return new c1(new s2((e1) null, new p2(new v0(lVar, 1), d1.d.q(1, new x4.j((j2 & 4294967295L) | (j2 << 32)))), (k0) null, (e0) null, (LinkedHashMap) null, 125));
    }

    public static c1 i(mc.l lVar, int i2) {
        long j2 = 1;
        d1.a1 q10 = d1.d.q(1, new x4.j((j2 & 4294967295L) | (j2 << 32)));
        if ((i2 & 2) != 0) {
            lVar = e.f2410g0;
        }
        return new c1(new s2((e1) null, new p2(new v0(lVar, 2), q10), (k0) null, (e0) null, (LinkedHashMap) null, 125));
    }

    public static d1 j(mc.l lVar, int i2) {
        long j2 = 1;
        d1.a1 q10 = d1.d.q(1, new x4.j((j2 & 4294967295L) | (j2 << 32)));
        if ((i2 & 2) != 0) {
            lVar = e.f2411h0;
        }
        return new d1(new s2((e1) null, new p2(new v0(lVar, 3), q10), (k0) null, (e0) null, (LinkedHashMap) null, 125));
    }

    public static d1 k(mc.l lVar) {
        long j2 = 1;
        return new d1(new s2((e1) null, new p2(new v0(lVar, 4), d1.d.q(1, new x4.j((j2 & 4294967295L) | (j2 << 32)))), (k0) null, (e0) null, (LinkedHashMap) null, 125));
    }
}
