package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: px7  reason: default package */
/* loaded from: classes.dex */
public final class px7 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ rx7 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ px7(rx7 rx7Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = rx7Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((px7) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((px7) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        rx7 rx7Var = this.Z;
        switch (i) {
            case 0:
                return new px7(rx7Var, r41Var, 0);
            default:
                return new px7(rx7Var, r41Var, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        final nx7 kx7Var;
        int i = this.X;
        final rx7 rx7Var = this.Z;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                this.Y = 1;
                Object a = rx7.a(rx7Var, this);
                if (a == x61Var) {
                    return x61Var;
                }
                return a;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        tc3 tc3Var = rx7Var.m;
                        px7 px7Var = new px7(rx7Var, null, 0);
                        this.Y = 1;
                        obj = hv.d0(tc3Var, px7Var, this);
                        if (obj == x61Var2) {
                            return x61Var2;
                        }
                    }
                    kx7Var = (nx7) obj;
                } catch (ix7 e) {
                    kx7Var = new mx7(e.A);
                } catch (CancellationException unused) {
                    kx7Var = new kx7();
                } catch (Throwable th) {
                    ga0.f().e(sx7.a, "Unexpected error in WorkerWrapper", th);
                    kx7Var = new kx7();
                }
                Object o = rx7Var.h.o(new er2(new Callable() { // from class: ox7
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        rx7 rx7Var2 = rx7Var;
                        String str = rx7Var2.l;
                        String str2 = rx7Var2.c;
                        dx7 dx7Var = rx7Var2.i;
                        yw7 yw7Var = rx7Var2.a;
                        nx7 nx7Var = nx7.this;
                        boolean z = true;
                        boolean z2 = false;
                        if (nx7Var instanceof lx7) {
                            mx3 mx3Var = ((lx7) nx7Var).a;
                            iw7 c = dx7Var.c(str2);
                            sw7 v = rx7Var2.h.v();
                            v.getClass();
                            hv.Q(v.a, false, true, new c70(str2, 20));
                            if (c != null) {
                                if (c == iw7.RUNNING) {
                                    if (mx3Var instanceof lx3) {
                                        String str3 = sx7.a;
                                        ga0.f().g(str3, "Worker result SUCCESS for " + str);
                                        if (yw7Var.c()) {
                                            rx7Var2.c();
                                        } else {
                                            dx7Var.h(iw7.SUCCEEDED, str2);
                                            xb1 xb1Var = ((lx3) mx3Var).a;
                                            xb1Var.getClass();
                                            hv.Q(dx7Var.a, false, true, new ja7(14, xb1Var, str2));
                                            rx7Var2.f.getClass();
                                            long currentTimeMillis = System.currentTimeMillis();
                                            zh1 zh1Var = rx7Var2.j;
                                            for (String str4 : zh1Var.a(str2)) {
                                                if (dx7Var.c(str4) == iw7.BLOCKED && ((Boolean) hv.Q(zh1Var.a, true, false, new c70(str4, 4))).booleanValue()) {
                                                    ga0.f().g(sx7.a, "Setting status to enqueued for ".concat(str4));
                                                    dx7Var.h(iw7.ENQUEUED, str4);
                                                    dx7Var.g(currentTimeMillis, str4);
                                                }
                                            }
                                        }
                                    } else if (mx3Var instanceof kx3) {
                                        String str5 = sx7.a;
                                        ga0.f().g(str5, "Worker result RETRY for " + str);
                                        rx7Var2.b(-256);
                                        z2 = z;
                                        return Boolean.valueOf(z2);
                                    } else {
                                        String str6 = sx7.a;
                                        ga0.f().g(str6, "Worker result FAILURE for " + str);
                                        if (yw7Var.c()) {
                                            rx7Var2.c();
                                        } else {
                                            rx7Var2.d(mx3Var);
                                        }
                                    }
                                } else if (!c.isFinished()) {
                                    rx7Var2.b(-512);
                                    z2 = z;
                                    return Boolean.valueOf(z2);
                                }
                            }
                            z = false;
                            z2 = z;
                            return Boolean.valueOf(z2);
                        } else if (nx7Var instanceof kx7) {
                            mx3 mx3Var2 = ((kx7) nx7Var).a;
                            String str7 = sx7.a;
                            ga0.f().g(str7, "Worker result FAILURE for " + str);
                            if (yw7Var.c()) {
                                rx7Var2.c();
                            } else {
                                rx7Var2.d(mx3Var2);
                            }
                            return Boolean.valueOf(z2);
                        } else if (nx7Var instanceof mx7) {
                            int i4 = ((mx7) nx7Var).a;
                            if (nb3.k(yw7Var.y, Boolean.TRUE)) {
                                String str8 = sx7.a;
                                ga0.f().b(str8, "Worker " + yw7Var.c + " was interrupted. Backing off.");
                                rx7Var2.b(i4);
                            } else {
                                iw7 c2 = dx7Var.c(str2);
                                if (c2 != null && !c2.isFinished()) {
                                    String str9 = sx7.a;
                                    ga0.f().b(str9, "Status for " + str2 + " is " + c2 + "; not doing any work and rescheduling for later execution");
                                    dx7Var.h(iw7.ENQUEUED, str2);
                                    dx7Var.i(i4, str2);
                                    dx7Var.e(-1L, str2);
                                } else {
                                    String str10 = sx7.a;
                                    ga0.f().b(str10, "Status for " + str2 + " is " + c2 + " ; not doing any work");
                                    z = false;
                                }
                            }
                            z2 = z;
                            return Boolean.valueOf(z2);
                        } else {
                            i.d();
                            return null;
                        }
                    }
                }, 25));
                o.getClass();
                return o;
        }
    }
}
