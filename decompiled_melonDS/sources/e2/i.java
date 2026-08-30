package e2;

import a2.n;
import a4.a0;
import a4.l2;
import a4.p;
import a4.x0;
import android.os.Trace;
import b3.o;
import i3.m0;
import i3.s;
import i3.t;
import i4.v;
import i4.w;
import i4.x;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l4.j0;
import l4.n0;
import l4.o0;
import l4.r0;
import me.magnum.melonds.common.camera.DSiCameraSource;
import u1.l0;
import y3.i1;
import y3.u0;
import y3.w0;
import zb.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends o implements a0, p, l2 {

    /* renamed from: i0  reason: collision with root package name */
    public l4.h f4212i0;

    /* renamed from: j0  reason: collision with root package name */
    public r0 f4213j0;

    /* renamed from: k0  reason: collision with root package name */
    public p4.d f4214k0;

    /* renamed from: l0  reason: collision with root package name */
    public mc.l f4215l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f4216m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f4217n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f4218o0;
    public int p0;

    /* renamed from: q0  reason: collision with root package name */
    public List f4219q0;

    /* renamed from: r0  reason: collision with root package name */
    public mc.l f4220r0;

    /* renamed from: s0  reason: collision with root package name */
    public t f4221s0;

    /* renamed from: t0  reason: collision with root package name */
    public mc.l f4222t0;

    /* renamed from: u0  reason: collision with root package name */
    public Map f4223u0;

    /* renamed from: v0  reason: collision with root package name */
    public d f4224v0;

    /* renamed from: w0  reason: collision with root package name */
    public g f4225w0;

    /* renamed from: x0  reason: collision with root package name */
    public h f4226x0;

    @Override // a4.a0
    public final int B0(x0 x0Var, u0 u0Var, int i2) {
        return P0(x0Var).a(i2, x0Var.getLayoutDirection());
    }

    @Override // b3.o
    public final boolean D0() {
        return false;
    }

    @Override // a4.a0
    public final int K(x0 x0Var, u0 u0Var, int i2) {
        return P0(x0Var).a(i2, x0Var.getLayoutDirection());
    }

    public final d O0() {
        if (this.f4224v0 == null) {
            this.f4224v0 = new d(this.f4212i0, this.f4213j0, this.f4214k0, this.f4216m0, this.f4217n0, this.f4218o0, this.p0, this.f4219q0);
        }
        d dVar = this.f4224v0;
        dVar.getClass();
        return dVar;
    }

    public final d P0(x4.c cVar) {
        d dVar;
        h hVar = this.f4226x0;
        if (hVar != null && hVar.f4210c && (dVar = hVar.f4211d) != null) {
            dVar.d(cVar);
            return dVar;
        }
        d O0 = O0();
        O0.d(cVar);
        return O0;
    }

    @Override // a4.a0
    public final w0 d(y3.x0 x0Var, u0 u0Var, long j2) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            d P0 = P0(x0Var);
            boolean c4 = P0.c(j2, x0Var.getLayoutDirection());
            o0 o0Var = P0.f4174n;
            if (o0Var != null) {
                long j10 = o0Var.f8867c;
                o0Var.f8866b.f8875a.b();
                if (c4) {
                    a4.l.r(this, 2).e1();
                    mc.l lVar = this.f4215l0;
                    if (lVar != null) {
                        lVar.k(o0Var);
                    }
                    Map map = this.f4223u0;
                    if (map == null) {
                        map = new LinkedHashMap(2);
                    }
                    map.put(y3.c.f14665a, Integer.valueOf(Math.round(o0Var.f8868d)));
                    map.put(y3.c.f14666b, Integer.valueOf(Math.round(o0Var.f8869e)));
                    this.f4223u0 = map;
                }
                mc.l lVar2 = this.f4220r0;
                if (lVar2 != null) {
                    lVar2.k(o0Var.f8870f);
                }
                int i2 = (int) (j10 >> 32);
                int i10 = (int) (j10 & 4294967295L);
                i1 e6 = u0Var.e(p7.k.n(i2, i2, i10, i10));
                Map map2 = this.f4223u0;
                map2.getClass();
                w0 u02 = x0Var.u0(i2, i10, map2, new c9.o(e6, 2));
                Trace.endSection();
                return u02;
            }
            throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + P0);
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [e2.g] */
    @Override // a4.l2
    public final void f0(x xVar) {
        g gVar = this.f4225w0;
        g gVar2 = gVar;
        if (gVar == null) {
            ?? r02 = new mc.l(this) { // from class: e2.g
                public final /* synthetic */ i B;

                {
                    this.B = this;
                }

                @Override // mc.l
                public final Object k(Object obj) {
                    o0 o0Var;
                    boolean z10;
                    long j2;
                    boolean z11;
                    switch (r2) {
                        case 0:
                            List list = (List) obj;
                            i iVar = this.B;
                            o0 o0Var2 = iVar.O0().f4174n;
                            if (o0Var2 != null) {
                                n0 n0Var = o0Var2.f8865a;
                                l4.h hVar = n0Var.f8853a;
                                r0 r0Var = iVar.f4213j0;
                                t tVar = iVar.f4221s0;
                                if (tVar != null) {
                                    j2 = tVar.a();
                                } else {
                                    j2 = s.f6687h;
                                }
                                o0Var = new o0(new n0(hVar, r0.e(r0Var, j2, 0L, null, 0L, 0, 0L, 16777214), n0Var.f8855c, n0Var.f8856d, n0Var.f8857e, n0Var.f8858f, n0Var.f8859g, n0Var.f8860h, n0Var.f8861i, n0Var.f8862j), o0Var2.f8866b, o0Var2.f8867c);
                                list.add(o0Var);
                            } else {
                                o0Var = null;
                            }
                            if (o0Var != null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            return Boolean.valueOf(z10);
                        case DSiCameraSource.FrontCamera /* 1 */:
                            l4.h hVar2 = (l4.h) obj;
                            i iVar2 = this.B;
                            h hVar3 = iVar2.f4226x0;
                            q qVar = q.A;
                            if (hVar3 != null) {
                                if (!nc.k.a(hVar2, hVar3.f4209b)) {
                                    hVar3.f4209b = hVar2;
                                    d dVar = hVar3.f4211d;
                                    if (dVar != null) {
                                        r0 r0Var2 = iVar2.f4213j0;
                                        p4.d dVar2 = iVar2.f4214k0;
                                        int i2 = iVar2.f4216m0;
                                        boolean z12 = iVar2.f4217n0;
                                        int i10 = iVar2.f4218o0;
                                        int i11 = iVar2.p0;
                                        dVar.f4162a = hVar2;
                                        boolean c4 = r0Var2.c(dVar.f4172k);
                                        dVar.f4172k = r0Var2;
                                        if (!c4) {
                                            dVar.f4177q <<= 2;
                                            dVar.f4173l = null;
                                            dVar.f4174n = null;
                                            dVar.f4176p = -1;
                                            dVar.f4175o = -1;
                                        }
                                        dVar.f4163b = dVar2;
                                        dVar.f4164c = i2;
                                        dVar.f4165d = z12;
                                        dVar.f4166e = i10;
                                        dVar.f4167f = i11;
                                        dVar.f4168g = qVar;
                                        dVar.f4177q = (dVar.f4177q << 2) | 2;
                                        dVar.f4173l = null;
                                        dVar.f4174n = null;
                                        dVar.f4176p = -1;
                                        dVar.f4175o = -1;
                                    }
                                }
                            } else {
                                h hVar4 = new h(iVar2.f4212i0, hVar2);
                                d dVar3 = new d(hVar2, iVar2.f4213j0, iVar2.f4214k0, iVar2.f4216m0, iVar2.f4217n0, iVar2.f4218o0, iVar2.p0, qVar);
                                dVar3.d(iVar2.O0().f4171j);
                                hVar4.f4211d = dVar3;
                                iVar2.f4226x0 = hVar4;
                            }
                            a4.l.l(iVar2);
                            a4.l.k(iVar2);
                            a4.l.j(iVar2);
                            return Boolean.TRUE;
                        default:
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            i iVar3 = this.B;
                            h hVar5 = iVar3.f4226x0;
                            if (hVar5 == null) {
                                z11 = false;
                            } else {
                                mc.l lVar = iVar3.f4222t0;
                                if (lVar != null) {
                                    lVar.k(hVar5);
                                }
                                h hVar6 = iVar3.f4226x0;
                                if (hVar6 != null) {
                                    hVar6.f4210c = booleanValue;
                                }
                                a4.l.l(iVar3);
                                a4.l.k(iVar3);
                                a4.l.j(iVar3);
                                z11 = true;
                            }
                            return Boolean.valueOf(z11);
                    }
                }
            };
            this.f4225w0 = r02;
            gVar2 = r02;
        }
        l4.h hVar = this.f4212i0;
        tc.c[] cVarArr = v.f6808a;
        xVar.a(i4.t.B, p7.t.x(hVar));
        h hVar2 = this.f4226x0;
        if (hVar2 != null) {
            l4.h hVar3 = hVar2.f4209b;
            w wVar = i4.t.C;
            tc.c[] cVarArr2 = v.f6808a;
            tc.c cVar = cVarArr2[16];
            xVar.a(wVar, hVar3);
            boolean z10 = hVar2.f4210c;
            w wVar2 = i4.t.D;
            tc.c cVar2 = cVarArr2[17];
            xVar.a(wVar2, Boolean.valueOf(z10));
        }
        xVar.a(i4.l.f6751l, new i4.a(null, new mc.l(this) { // from class: e2.g
            public final /* synthetic */ i B;

            {
                this.B = this;
            }

            @Override // mc.l
            public final Object k(Object obj) {
                o0 o0Var;
                boolean z102;
                long j2;
                boolean z11;
                switch (r2) {
                    case 0:
                        List list = (List) obj;
                        i iVar = this.B;
                        o0 o0Var2 = iVar.O0().f4174n;
                        if (o0Var2 != null) {
                            n0 n0Var = o0Var2.f8865a;
                            l4.h hVar4 = n0Var.f8853a;
                            r0 r0Var = iVar.f4213j0;
                            t tVar = iVar.f4221s0;
                            if (tVar != null) {
                                j2 = tVar.a();
                            } else {
                                j2 = s.f6687h;
                            }
                            o0Var = new o0(new n0(hVar4, r0.e(r0Var, j2, 0L, null, 0L, 0, 0L, 16777214), n0Var.f8855c, n0Var.f8856d, n0Var.f8857e, n0Var.f8858f, n0Var.f8859g, n0Var.f8860h, n0Var.f8861i, n0Var.f8862j), o0Var2.f8866b, o0Var2.f8867c);
                            list.add(o0Var);
                        } else {
                            o0Var = null;
                        }
                        if (o0Var != null) {
                            z102 = true;
                        } else {
                            z102 = false;
                        }
                        return Boolean.valueOf(z102);
                    case DSiCameraSource.FrontCamera /* 1 */:
                        l4.h hVar22 = (l4.h) obj;
                        i iVar2 = this.B;
                        h hVar32 = iVar2.f4226x0;
                        q qVar = q.A;
                        if (hVar32 != null) {
                            if (!nc.k.a(hVar22, hVar32.f4209b)) {
                                hVar32.f4209b = hVar22;
                                d dVar = hVar32.f4211d;
                                if (dVar != null) {
                                    r0 r0Var2 = iVar2.f4213j0;
                                    p4.d dVar2 = iVar2.f4214k0;
                                    int i2 = iVar2.f4216m0;
                                    boolean z12 = iVar2.f4217n0;
                                    int i10 = iVar2.f4218o0;
                                    int i11 = iVar2.p0;
                                    dVar.f4162a = hVar22;
                                    boolean c4 = r0Var2.c(dVar.f4172k);
                                    dVar.f4172k = r0Var2;
                                    if (!c4) {
                                        dVar.f4177q <<= 2;
                                        dVar.f4173l = null;
                                        dVar.f4174n = null;
                                        dVar.f4176p = -1;
                                        dVar.f4175o = -1;
                                    }
                                    dVar.f4163b = dVar2;
                                    dVar.f4164c = i2;
                                    dVar.f4165d = z12;
                                    dVar.f4166e = i10;
                                    dVar.f4167f = i11;
                                    dVar.f4168g = qVar;
                                    dVar.f4177q = (dVar.f4177q << 2) | 2;
                                    dVar.f4173l = null;
                                    dVar.f4174n = null;
                                    dVar.f4176p = -1;
                                    dVar.f4175o = -1;
                                }
                            }
                        } else {
                            h hVar42 = new h(iVar2.f4212i0, hVar22);
                            d dVar3 = new d(hVar22, iVar2.f4213j0, iVar2.f4214k0, iVar2.f4216m0, iVar2.f4217n0, iVar2.f4218o0, iVar2.p0, qVar);
                            dVar3.d(iVar2.O0().f4171j);
                            hVar42.f4211d = dVar3;
                            iVar2.f4226x0 = hVar42;
                        }
                        a4.l.l(iVar2);
                        a4.l.k(iVar2);
                        a4.l.j(iVar2);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        i iVar3 = this.B;
                        h hVar5 = iVar3.f4226x0;
                        if (hVar5 == null) {
                            z11 = false;
                        } else {
                            mc.l lVar = iVar3.f4222t0;
                            if (lVar != null) {
                                lVar.k(hVar5);
                            }
                            h hVar6 = iVar3.f4226x0;
                            if (hVar6 != null) {
                                hVar6.f4210c = booleanValue;
                            }
                            a4.l.l(iVar3);
                            a4.l.k(iVar3);
                            a4.l.j(iVar3);
                            z11 = true;
                        }
                        return Boolean.valueOf(z11);
                }
            }
        }));
        xVar.a(i4.l.m, new i4.a(null, new mc.l(this) { // from class: e2.g
            public final /* synthetic */ i B;

            {
                this.B = this;
            }

            @Override // mc.l
            public final Object k(Object obj) {
                o0 o0Var;
                boolean z102;
                long j2;
                boolean z11;
                switch (r2) {
                    case 0:
                        List list = (List) obj;
                        i iVar = this.B;
                        o0 o0Var2 = iVar.O0().f4174n;
                        if (o0Var2 != null) {
                            n0 n0Var = o0Var2.f8865a;
                            l4.h hVar4 = n0Var.f8853a;
                            r0 r0Var = iVar.f4213j0;
                            t tVar = iVar.f4221s0;
                            if (tVar != null) {
                                j2 = tVar.a();
                            } else {
                                j2 = s.f6687h;
                            }
                            o0Var = new o0(new n0(hVar4, r0.e(r0Var, j2, 0L, null, 0L, 0, 0L, 16777214), n0Var.f8855c, n0Var.f8856d, n0Var.f8857e, n0Var.f8858f, n0Var.f8859g, n0Var.f8860h, n0Var.f8861i, n0Var.f8862j), o0Var2.f8866b, o0Var2.f8867c);
                            list.add(o0Var);
                        } else {
                            o0Var = null;
                        }
                        if (o0Var != null) {
                            z102 = true;
                        } else {
                            z102 = false;
                        }
                        return Boolean.valueOf(z102);
                    case DSiCameraSource.FrontCamera /* 1 */:
                        l4.h hVar22 = (l4.h) obj;
                        i iVar2 = this.B;
                        h hVar32 = iVar2.f4226x0;
                        q qVar = q.A;
                        if (hVar32 != null) {
                            if (!nc.k.a(hVar22, hVar32.f4209b)) {
                                hVar32.f4209b = hVar22;
                                d dVar = hVar32.f4211d;
                                if (dVar != null) {
                                    r0 r0Var2 = iVar2.f4213j0;
                                    p4.d dVar2 = iVar2.f4214k0;
                                    int i2 = iVar2.f4216m0;
                                    boolean z12 = iVar2.f4217n0;
                                    int i10 = iVar2.f4218o0;
                                    int i11 = iVar2.p0;
                                    dVar.f4162a = hVar22;
                                    boolean c4 = r0Var2.c(dVar.f4172k);
                                    dVar.f4172k = r0Var2;
                                    if (!c4) {
                                        dVar.f4177q <<= 2;
                                        dVar.f4173l = null;
                                        dVar.f4174n = null;
                                        dVar.f4176p = -1;
                                        dVar.f4175o = -1;
                                    }
                                    dVar.f4163b = dVar2;
                                    dVar.f4164c = i2;
                                    dVar.f4165d = z12;
                                    dVar.f4166e = i10;
                                    dVar.f4167f = i11;
                                    dVar.f4168g = qVar;
                                    dVar.f4177q = (dVar.f4177q << 2) | 2;
                                    dVar.f4173l = null;
                                    dVar.f4174n = null;
                                    dVar.f4176p = -1;
                                    dVar.f4175o = -1;
                                }
                            }
                        } else {
                            h hVar42 = new h(iVar2.f4212i0, hVar22);
                            d dVar3 = new d(hVar22, iVar2.f4213j0, iVar2.f4214k0, iVar2.f4216m0, iVar2.f4217n0, iVar2.f4218o0, iVar2.p0, qVar);
                            dVar3.d(iVar2.O0().f4171j);
                            hVar42.f4211d = dVar3;
                            iVar2.f4226x0 = hVar42;
                        }
                        a4.l.l(iVar2);
                        a4.l.k(iVar2);
                        a4.l.j(iVar2);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        i iVar3 = this.B;
                        h hVar5 = iVar3.f4226x0;
                        if (hVar5 == null) {
                            z11 = false;
                        } else {
                            mc.l lVar = iVar3.f4222t0;
                            if (lVar != null) {
                                lVar.k(hVar5);
                            }
                            h hVar6 = iVar3.f4226x0;
                            if (hVar6 != null) {
                                hVar6.f4210c = booleanValue;
                            }
                            a4.l.l(iVar3);
                            a4.l.k(iVar3);
                            a4.l.j(iVar3);
                            z11 = true;
                        }
                        return Boolean.valueOf(z11);
                }
            }
        }));
        xVar.a(i4.l.f6752n, new i4.a(null, new n(14, this)));
        v.a(xVar, gVar2);
    }

    @Override // a4.a0
    public final int p0(x0 x0Var, u0 u0Var, int i2) {
        return l0.o(P0(x0Var).e(x0Var.getLayoutDirection()).c());
    }

    @Override // a4.a0
    public final int y0(x0 x0Var, u0 u0Var, int i2) {
        return l0.o(P0(x0Var).e(x0Var.getLayoutDirection()).a());
    }

    @Override // a4.p
    public final void z(a4.r0 r0Var) {
        boolean z10;
        long j2;
        boolean v10;
        if (this.f1777h0) {
            i3.q p10 = r0Var.A.B.p();
            d P0 = P0(r0Var);
            o0 o0Var = P0.f4174n;
            if (o0Var != null) {
                l4.q qVar = o0Var.f8866b;
                long j10 = o0Var.f8867c;
                boolean z11 = true;
                if ((((int) (j10 >> 32)) >= qVar.f8878d && !qVar.f8877c && ((int) (j10 & 4294967295L)) >= qVar.f8879e) || this.f4216m0 == 3) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    h3.c h2 = pc.a.h(0L, (Float.floatToRawIntBits((int) (j10 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j10 & 4294967295L)) & 4294967295L));
                    p10.p();
                    i3.q.e(p10, h2);
                }
                try {
                    j0 j0Var = this.f4213j0.f8887a;
                    w4.l lVar = j0Var.m;
                    if (lVar == null) {
                        lVar = w4.l.f14143b;
                    }
                    w4.l lVar2 = lVar;
                    m0 m0Var = j0Var.f8839n;
                    if (m0Var == null) {
                        m0Var = m0.f6659d;
                    }
                    m0 m0Var2 = m0Var;
                    k3.e eVar = j0Var.f8841p;
                    if (eVar == null) {
                        eVar = k3.g.f7961a;
                    }
                    k3.e eVar2 = eVar;
                    i3.o c4 = j0Var.f8827a.c();
                    if (c4 != null) {
                        l4.q.j(qVar, p10, c4, this.f4213j0.f8887a.f8827a.a(), m0Var2, lVar2, eVar2);
                    } else {
                        t tVar = this.f4221s0;
                        if (tVar != null) {
                            j2 = tVar.a();
                        } else {
                            j2 = s.f6687h;
                        }
                        if (j2 == 16) {
                            if (this.f4213j0.b() != 16) {
                                j2 = this.f4213j0.b();
                            } else {
                                j2 = s.f6681b;
                            }
                        }
                        l4.q.i(qVar, p10, j2, m0Var2, lVar2, eVar2);
                    }
                    if (z10) {
                        p10.m();
                    }
                    h hVar = this.f4226x0;
                    if (hVar != null && hVar.f4210c) {
                        v10 = false;
                    } else {
                        v10 = k7.w.v(this.f4212i0);
                    }
                    if (!v10) {
                        List list = this.f4219q0;
                        if (list != null && !list.isEmpty()) {
                            z11 = false;
                        }
                        if (z11) {
                            return;
                        }
                    }
                    r0Var.a();
                    return;
                } catch (Throwable th2) {
                    if (z10) {
                        p10.m();
                    }
                    throw th2;
                }
            }
            m9.o.h(P0, "Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ");
        }
    }
}
