package q8;

import g2.z1;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import p8.e0;
import u1.l1;
import zc.a1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ b0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(b0 b0Var, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = b0Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((z) t(cVar, uVar)).v(yb.y.f14813a);
            default:
                return ((z) t(cVar, uVar)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new z(this.Z, cVar, 0);
            default:
                return new z(this.Z, cVar, 1);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        final x uVar;
        switch (this.X) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        p7.j.I(obj);
                        return obj;
                    }
                    a0.j.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p7.j.I(obj);
                this.Y = 1;
                Object a10 = b0.a(this.Z, this);
                if (a10 == aVar) {
                    return aVar;
                }
                return a10;
            default:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                final b0 b0Var = this.Z;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            p7.j.I(obj);
                        } else {
                            a0.j.p("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        p7.j.I(obj);
                        a1 a1Var = b0Var.m;
                        z zVar = new z(b0Var, null, 0);
                        this.Y = 1;
                        obj = zc.x.F(a1Var, zVar, this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    }
                    uVar = (x) obj;
                } catch (s e6) {
                    uVar = new w(e6.A);
                } catch (CancellationException unused) {
                    uVar = new u();
                } catch (Throwable th2) {
                    p8.v.e().d(c0.f12339a, "Unexpected error in WorkerWrapper", th2);
                    uVar = new u();
                }
                Object o5 = b0Var.f12331h.o(new a2.n(28, new Callable() { // from class: q8.y
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        b0 b0Var2 = b0Var;
                        x8.p pVar = b0Var2.f12324a;
                        String str = b0Var2.f12326c;
                        x8.u uVar2 = b0Var2.f12332i;
                        x xVar = x.this;
                        boolean z10 = true;
                        boolean z11 = false;
                        if (xVar instanceof v) {
                            p8.t tVar = ((v) xVar).f12385a;
                            e0 c4 = uVar2.c(str);
                            x8.m v10 = b0Var2.f12331h.v();
                            v10.getClass();
                            r.K(v10.f14399a, false, true, new z1(str, 11));
                            if (c4 != null) {
                                if (c4 == e0.RUNNING) {
                                    String str2 = b0Var2.f12335l;
                                    if (tVar instanceof p8.s) {
                                        String str3 = c0.f12339a;
                                        p8.v.e().f(str3, "Worker result SUCCESS for " + str2);
                                        if (pVar.c()) {
                                            b0Var2.c();
                                        } else {
                                            uVar2.h(e0.SUCCEEDED, str);
                                            p8.h hVar = ((p8.s) tVar).f11502a;
                                            hVar.getClass();
                                            r.K(uVar2.f14444a, false, true, new l1(10, hVar, str));
                                            b0Var2.f12329f.getClass();
                                            long currentTimeMillis = System.currentTimeMillis();
                                            x8.b bVar = b0Var2.f12333j;
                                            for (String str4 : bVar.a(str)) {
                                                if (uVar2.c(str4) == e0.BLOCKED && ((Boolean) r.K(bVar.f14380a, true, false, new z1(str4, 7))).booleanValue()) {
                                                    p8.v.e().f(c0.f12339a, "Setting status to enqueued for ".concat(str4));
                                                    uVar2.h(e0.ENQUEUED, str4);
                                                    uVar2.g(currentTimeMillis, str4);
                                                }
                                            }
                                        }
                                    } else if (tVar instanceof p8.r) {
                                        String str5 = c0.f12339a;
                                        p8.v.e().f(str5, "Worker result RETRY for " + str2);
                                        b0Var2.b(-256);
                                        z11 = z10;
                                        return Boolean.valueOf(z11);
                                    } else {
                                        String str6 = c0.f12339a;
                                        p8.v.e().f(str6, "Worker result FAILURE for " + str2);
                                        if (pVar.c()) {
                                            b0Var2.c();
                                        } else {
                                            b0Var2.d(tVar);
                                        }
                                    }
                                } else if (!c4.isFinished()) {
                                    b0Var2.b(-512);
                                    z11 = z10;
                                    return Boolean.valueOf(z11);
                                }
                            }
                            z10 = false;
                            z11 = z10;
                            return Boolean.valueOf(z11);
                        } else if (xVar instanceof u) {
                            b0Var2.d(((u) xVar).f12384a);
                            return Boolean.valueOf(z11);
                        } else if (xVar instanceof w) {
                            int i11 = ((w) xVar).f12386a;
                            if (nc.k.a(pVar.f14443y, Boolean.TRUE)) {
                                String str7 = c0.f12339a;
                                p8.v.e().a(str7, "Worker " + pVar.f14422c + " was interrupted. Backing off.");
                                b0Var2.b(i11);
                            } else {
                                e0 c10 = uVar2.c(str);
                                if (c10 != null && !c10.isFinished()) {
                                    String str8 = c0.f12339a;
                                    p8.v.e().a(str8, "Status for " + str + " is " + c10 + "; not doing any work and rescheduling for later execution");
                                    uVar2.h(e0.ENQUEUED, str);
                                    uVar2.i(i11, str);
                                    uVar2.e(-1L, str);
                                } else {
                                    String str9 = c0.f12339a;
                                    p8.v.e().a(str9, "Status for " + str + " is " + c10 + " ; not doing any work");
                                    z10 = false;
                                }
                            }
                            z11 = z10;
                            return Boolean.valueOf(z11);
                        } else {
                            m9.o.o();
                            return null;
                        }
                    }
                }));
                o5.getClass();
                return o5;
        }
    }
}
