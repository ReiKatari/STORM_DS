package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: si7  reason: default package */
/* loaded from: classes.dex */
public final class si7 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ ui7 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ si7(ui7 ui7Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = ui7Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((si7) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((si7) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        ui7 ui7Var = this.Z;
        switch (i) {
            case 0:
                return new si7(ui7Var, j11Var, 0);
            default:
                return new si7(ui7Var, j11Var, 1);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        final qi7 ni7Var;
        int i = this.X;
        final ui7 ui7Var = this.Z;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        me2.a0(obj);
                        return obj;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                this.Y = 1;
                Object a = ui7.a(ui7Var, this);
                if (a == p31Var) {
                    return p31Var;
                }
                return a;
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            me2.a0(obj);
                        } else {
                            i.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        me2.a0(obj);
                        e63 e63Var = ui7Var.m;
                        si7 si7Var = new si7(ui7Var, null, 0);
                        this.Y = 1;
                        obj = tq5.G(e63Var, si7Var, this);
                        if (obj == p31Var2) {
                            return p31Var2;
                        }
                    }
                    ni7Var = (qi7) obj;
                } catch (li7 e) {
                    ni7Var = new pi7(e.A);
                } catch (CancellationException unused) {
                    ni7Var = new ni7();
                } catch (Throwable th) {
                    y70.f().e(vi7.a, "Unexpected error in WorkerWrapper", th);
                    ni7Var = new ni7();
                }
                Object o = ui7Var.h.o(new bz2(18, new Callable() { // from class: ri7
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ui7 ui7Var2 = ui7Var;
                        String str = ui7Var2.l;
                        String str2 = ui7Var2.c;
                        di7 di7Var = ui7Var2.i;
                        xh7 xh7Var = ui7Var2.a;
                        qi7 qi7Var = qi7.this;
                        boolean z = true;
                        boolean z2 = false;
                        if (qi7Var instanceof oi7) {
                            lq3 lq3Var = ((oi7) qi7Var).a;
                            ih7 c = di7Var.c(str2);
                            rh7 v = ui7Var2.h.v();
                            v.getClass();
                            mh7.X(v.a, false, true, new ok0(str2, 15));
                            if (c != null) {
                                if (c == ih7.RUNNING) {
                                    if (lq3Var instanceof kq3) {
                                        String str3 = vi7.a;
                                        y70.f().g(str3, "Worker result SUCCESS for " + str);
                                        if (xh7Var.c()) {
                                            ui7Var2.c();
                                        } else {
                                            di7Var.h(ih7.SUCCEEDED, str2);
                                            g81 g81Var = ((kq3) lq3Var).a;
                                            g81Var.getClass();
                                            mh7.X(di7Var.a, false, true, new h57(7, g81Var, str2));
                                            ui7Var2.f.getClass();
                                            long currentTimeMillis = System.currentTimeMillis();
                                            vd1 vd1Var = ui7Var2.j;
                                            for (String str4 : vd1Var.a(str2)) {
                                                if (di7Var.c(str4) == ih7.BLOCKED && ((Boolean) mh7.X(vd1Var.a, true, false, new ok0(str4, 3))).booleanValue()) {
                                                    y70.f().g(vi7.a, "Setting status to enqueued for ".concat(str4));
                                                    di7Var.h(ih7.ENQUEUED, str4);
                                                    di7Var.g(currentTimeMillis, str4);
                                                }
                                            }
                                        }
                                    } else if (lq3Var instanceof jq3) {
                                        String str5 = vi7.a;
                                        y70.f().g(str5, "Worker result RETRY for " + str);
                                        ui7Var2.b(-256);
                                        z2 = z;
                                        return Boolean.valueOf(z2);
                                    } else {
                                        String str6 = vi7.a;
                                        y70.f().g(str6, "Worker result FAILURE for " + str);
                                        if (xh7Var.c()) {
                                            ui7Var2.c();
                                        } else {
                                            ui7Var2.d(lq3Var);
                                        }
                                    }
                                } else if (!c.isFinished()) {
                                    ui7Var2.b(-512);
                                    z2 = z;
                                    return Boolean.valueOf(z2);
                                }
                            }
                            z = false;
                            z2 = z;
                            return Boolean.valueOf(z2);
                        } else if (qi7Var instanceof ni7) {
                            lq3 lq3Var2 = ((ni7) qi7Var).a;
                            String str7 = vi7.a;
                            y70.f().g(str7, "Worker result FAILURE for " + str);
                            if (xh7Var.c()) {
                                ui7Var2.c();
                            } else {
                                ui7Var2.d(lq3Var2);
                            }
                            return Boolean.valueOf(z2);
                        } else if (qi7Var instanceof pi7) {
                            int i4 = ((pi7) qi7Var).a;
                            if (b53.x(xh7Var.y, Boolean.TRUE)) {
                                String str8 = vi7.a;
                                y70.f().b(str8, "Worker " + xh7Var.c + " was interrupted. Backing off.");
                                ui7Var2.b(i4);
                            } else {
                                ih7 c2 = di7Var.c(str2);
                                if (c2 != null && !c2.isFinished()) {
                                    String str9 = vi7.a;
                                    y70.f().b(str9, "Status for " + str2 + " is " + c2 + "; not doing any work and rescheduling for later execution");
                                    di7Var.h(ih7.ENQUEUED, str2);
                                    di7Var.i(i4, str2);
                                    di7Var.e(-1L, str2);
                                } else {
                                    String str10 = vi7.a;
                                    y70.f().b(str10, "Status for " + str2 + " is " + c2 + " ; not doing any work");
                                    z = false;
                                }
                            }
                            z2 = z;
                            return Boolean.valueOf(z2);
                        } else {
                            i.c();
                            return null;
                        }
                    }
                }));
                o.getClass();
                return o;
        }
    }
}
