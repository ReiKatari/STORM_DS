package defpackage;

import android.content.Context;
import android.view.Surface;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: re5  reason: default package */
/* loaded from: classes.dex */
public final class re5 implements v23 {
    public boolean A;
    public final Object B;
    public int L;
    public final Object R;
    public final Object X;
    public Object Y;
    public final Object Z;

    public re5(ea eaVar, il5 il5Var, je5 je5Var, boolean z) {
        List k;
        il5Var.getClass();
        this.R = eaVar;
        this.X = il5Var;
        this.A = z;
        yt1 yt1Var = yt1.A;
        this.B = yt1Var;
        this.Y = yt1Var;
        this.Z = new ArrayList();
        i03 i03Var = eaVar.h;
        i03Var.getClass();
        URI h = i03Var.h();
        if (h.getHost() == null) {
            k = az7.k(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> select = eaVar.g.select(h);
            if (select != null && !select.isEmpty()) {
                k = az7.j(select);
            } else {
                k = az7.k(new Proxy[]{Proxy.NO_PROXY});
            }
        }
        this.B = k;
        this.L = 0;
    }

    @Override // defpackage.v23
    public s23 a() {
        x13 x13Var;
        synchronized (this.R) {
            s23 a = ((v23) this.X).a();
            if (a != null) {
                this.L++;
                x13Var = new x13(a);
                x13Var.e((w13) this.Z);
            } else {
                x13Var = null;
            }
        }
        return x13Var;
    }

    @Override // defpackage.v23
    public int b() {
        int b;
        synchronized (this.R) {
            b = ((v23) this.X).b();
        }
        return b;
    }

    public void c(z23 z23Var, w42 w42Var) {
        Context context = z23Var.a;
        z23 z23Var2 = (z23) this.R;
        if (context == z23Var2.a) {
            if (z23Var.b != cs1.i0) {
                if (z23Var.c == z23Var2.c) {
                    if (z23Var.w == z23Var2.w) {
                        if (z23Var.x == z23Var2.x) {
                            return;
                        }
                        e41.g(w42Var, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.", "Interceptor '");
                        return;
                    }
                    e41.g(w42Var, "' cannot modify the request's lifecycle.", "Interceptor '");
                    return;
                }
                e41.g(w42Var, "' cannot modify the request's target.", "Interceptor '");
                return;
            }
            e41.g(w42Var, "' cannot set the request's data to null.", "Interceptor '");
            return;
        }
        e41.g(w42Var, "' cannot modify the request's context.", "Interceptor '");
    }

    @Override // defpackage.v23
    public void close() {
        synchronized (this.R) {
            try {
                Surface surface = (Surface) this.B;
                if (surface != null) {
                    surface.release();
                }
                ((v23) this.X).close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.v23
    public void d() {
        synchronized (this.R) {
            ((v23) this.X).d();
        }
    }

    @Override // defpackage.v23
    public void e(u23 u23Var, Executor executor) {
        synchronized (this.R) {
            ((v23) this.X).e(new pk0(5, this, u23Var), executor);
        }
    }

    @Override // defpackage.v23
    public int f() {
        int f;
        synchronized (this.R) {
            f = ((v23) this.X).f();
        }
        return f;
    }

    public boolean g() {
        if (this.L < ((List) this.B).size() || !((ArrayList) this.Z).isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.v23
    public int getHeight() {
        int height;
        synchronized (this.R) {
            height = ((v23) this.X).getHeight();
        }
        return height;
    }

    @Override // defpackage.v23
    public Surface getSurface() {
        Surface surface;
        synchronized (this.R) {
            surface = ((v23) this.X).getSurface();
        }
        return surface;
    }

    @Override // defpackage.v23
    public int getWidth() {
        int width;
        synchronized (this.R) {
            width = ((v23) this.X).getWidth();
        }
        return width;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(z23 z23Var, s41 s41Var) {
        qe5 qe5Var;
        int i;
        z23 z23Var2;
        w42 w42Var;
        Object d;
        re5 re5Var = this;
        Object obj = re5Var.B;
        List list = (List) obj;
        int i2 = re5Var.L;
        if (s41Var instanceof qe5) {
            qe5Var = (qe5) s41Var;
            int i3 = qe5Var.d0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qe5Var.d0 = i3 - Integer.MIN_VALUE;
                Object obj2 = qe5Var.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = qe5Var.d0;
                if (i == 0) {
                    if (i == 1) {
                        w42 w42Var2 = qe5Var.X;
                        re5 re5Var2 = qe5Var.R;
                        oi2.Y(obj2);
                        w42Var = w42Var2;
                        re5Var = re5Var2;
                        d = obj2;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj2);
                    if (i2 > 0) {
                        z23Var2 = z23Var;
                        re5Var.c(z23Var2, (w42) list.get(i2 - 1));
                    } else {
                        z23Var2 = z23Var;
                    }
                    w42Var = (w42) list.get(i2);
                    wi6 wi6Var = (wi6) re5Var.Y;
                    re5 re5Var3 = new re5((z23) re5Var.R, (List) obj, i2 + 1, z23Var2, wi6Var, (k62) re5Var.Z, re5Var.A);
                    qe5Var.R = re5Var;
                    qe5Var.X = w42Var;
                    qe5Var.d0 = 1;
                    d = w42Var.d(re5Var3, qe5Var);
                    if (d == x61Var) {
                        return x61Var;
                    }
                }
                a33 a33Var = (a33) d;
                re5Var.c(a33Var.b(), w42Var);
                return a33Var;
            }
        }
        qe5Var = new qe5(re5Var, s41Var);
        Object obj22 = qe5Var.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = qe5Var.d0;
        if (i == 0) {
        }
        a33 a33Var2 = (a33) d;
        re5Var.c(a33Var2.b(), w42Var);
        return a33Var2;
    }

    public void i() {
        synchronized (this.R) {
            try {
                this.A = true;
                ((v23) this.X).d();
                if (this.L == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.v23
    public s23 j() {
        x13 x13Var;
        synchronized (this.R) {
            s23 j = ((v23) this.X).j();
            if (j != null) {
                this.L++;
                x13Var = new x13(j);
                x13Var.e((w13) this.Z);
            } else {
                x13Var = null;
            }
        }
        return x13Var;
    }

    public re5(z23 z23Var, List list, int i, z23 z23Var2, wi6 wi6Var, k62 k62Var, boolean z) {
        this.R = z23Var;
        this.B = list;
        this.L = i;
        this.X = z23Var2;
        this.Y = wi6Var;
        this.Z = k62Var;
        this.A = z;
    }

    public re5(v23 v23Var) {
        this.R = new Object();
        this.L = 0;
        this.A = false;
        this.Z = new w13(this, 1);
        this.X = v23Var;
        this.B = v23Var.getSurface();
    }
}
