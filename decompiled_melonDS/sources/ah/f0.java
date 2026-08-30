package ah;

import cd.q1;
import kf.d2;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.impl.emulator.EmulatorMessageQueue;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f0 implements cd.i {
    public final /* synthetic */ int A;
    public final /* synthetic */ h1 B;

    public /* synthetic */ f0(h1 h1Var, int i2) {
        this.A = i2;
        this.B = h1Var;
    }

    @Override // cd.i
    public final Object a(Object obj, cc.c cVar) {
        switch (this.A) {
            case 0:
                ve.f fVar = (ve.f) obj;
                d5.f fVar2 = this.B.f772k;
                fVar2.getClass();
                fVar.getClass();
                q1 q1Var = (q1) fVar2.f3845g;
                q1Var.getClass();
                q1Var.k(null, fVar);
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                xe.l lVar = (xe.l) obj;
                h1 h1Var = this.B;
                cf.d dVar = h1Var.f763b;
                h0 h0Var = h1Var.f775o;
                if (lVar instanceof xe.d) {
                    long j2 = ((xe.d) lVar).f14565a;
                    if (((d2) dVar).f8181b.getBoolean("ra_active_challenge_indicators", true)) {
                        zc.x.v(h0Var, null, null, new x0(h1Var, j2, null, 0), 3);
                    }
                } else if (lVar instanceof xe.g) {
                    zc.x.v(h0Var, null, null, new x0(h1Var, ((xe.g) lVar).f14571a, null, 1), 3);
                } else if (lVar instanceof xe.f) {
                    zc.x.v(h0Var, null, null, new y0(h1Var, ((xe.f) lVar).f14570a, null, 0), 3);
                } else if (lVar instanceof xe.e) {
                    xe.e eVar = (xe.e) lVar;
                    if (((d2) dVar).f8181b.getBoolean("ra_progress_indicators", true)) {
                        zc.x.v(h0Var, null, null, new a2.o(h1Var, eVar, (cc.c) null, 1), 3);
                    }
                } else if (lVar instanceof xe.j) {
                    zc.x.v(h0Var, null, null, new a2.o(h1Var, (xe.j) lVar, (cc.c) null, 2), 3);
                } else if (lVar instanceof xe.k) {
                    zc.x.v(h0Var, null, null, new a5.o(h1Var, (xe.k) lVar, null, 8), 3);
                } else if (lVar instanceof xe.i) {
                    zc.x.v(h0Var, null, null, new a5.o(h1Var, (xe.i) lVar, null, 7), 3);
                } else if (lVar instanceof xe.h) {
                    zc.x.v(h0Var, null, null, new a5.o(h1Var, (xe.h) lVar, null, 6), 3);
                } else {
                    m9.o.o();
                    return null;
                }
                return yb.y.f14813a;
            default:
                se.e eVar2 = (se.e) obj;
                h1 h1Var2 = this.B;
                cd.e1 e1Var = h1Var2.J;
                cd.e1 e1Var2 = h1Var2.D;
                if (eVar2 instanceof se.a) {
                    e1Var2.p(new hh.b1(((se.a) eVar2).f12875a));
                } else if (nc.k.a(eVar2, se.b.f12876a)) {
                    e1Var2.p(hh.c1.f6513a);
                } else {
                    if (eVar2 instanceof se.d) {
                        int i2 = c1.f749a[((se.d) eVar2).f12877a.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    m9.o.o();
                                }
                            } else {
                                e1Var.p(hh.m1.f6548a);
                            }
                        } else {
                            e1Var.p(hh.l1.f6545a);
                        }
                        pf.j jVar = h1Var2.f773l;
                        jVar.getClass();
                        MelonEmulator.f9466a.stopEmulation();
                        jVar.f11634g.a();
                        EmulatorMessageQueue emulatorMessageQueue = jVar.f11638k;
                        emulatorMessageQueue.f9482c.post(new pf.l(emulatorMessageQueue, 0));
                        h1Var2.O.p(hh.p.f6558a);
                    } else {
                        m9.o.o();
                    }
                    return null;
                }
                return yb.y.f14813a;
        }
    }
}
