package defpackage;

import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qj2  reason: default package */
/* loaded from: classes.dex */
public final class qj2 implements Runnable {
    public final /* synthetic */ int A;
    public Object B;
    public final Object L;

    public qj2(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.A = 13;
        this.L = swipeDismissBehavior;
        this.B = view;
    }

    private final void a() {
        try {
            ((Runnable) this.L).run();
            synchronized (((k06) this.B).X) {
                ((k06) this.B).a();
            }
        } catch (Throwable th) {
            synchronized (((k06) this.B).X) {
                ((k06) this.B).a();
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [fq3] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v5, types: [cj0] */
    @Override // java.lang.Runnable
    public final void run() {
        sw3 sw3Var;
        int i = 0;
        xh7 xh7Var = 0;
        try {
            switch (this.A) {
                case 0:
                    oj2 oj2Var = (oj2) this.L;
                    try {
                        oj2Var.l(jv3.A((Future) this.B));
                        return;
                    } catch (Error e) {
                        e = e;
                        oj2Var.h(e);
                        return;
                    } catch (RuntimeException e2) {
                        e = e2;
                        oj2Var.h(e);
                        return;
                    } catch (ExecutionException e3) {
                        Throwable cause = e3.getCause();
                        if (cause == null) {
                            oj2Var.h(e3);
                            return;
                        } else {
                            oj2Var.h(cause);
                            return;
                        }
                    }
                case 1:
                    c8 c8Var = (c8) this.B;
                    f8 f8Var = (f8) this.L;
                    uw3 uw3Var = f8Var.L;
                    if (uw3Var != null && (sw3Var = uw3Var.e) != null) {
                        sw3Var.D(uw3Var);
                    }
                    View view = (View) f8Var.c0;
                    if (view != null && view.getWindowToken() != null) {
                        if (!c8Var.b()) {
                            if (c8Var.e != null) {
                                c8Var.d(0, 0, false, false);
                            }
                        }
                        f8Var.n0 = c8Var;
                    }
                    f8Var.p0 = null;
                    return;
                case 2:
                    ((v8) this.B).a = this.L;
                    return;
                case 3:
                    ((Application) this.B).unregisterActivityLifecycleCallbacks((v8) this.L);
                    return;
                case 4:
                    Object obj = this.L;
                    Object obj2 = this.B;
                    try {
                        Method method = w8.d;
                        if (method != null) {
                            method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                        } else {
                            w8.e.invoke(obj2, obj, Boolean.FALSE);
                        }
                        return;
                    } catch (RuntimeException e4) {
                        if (e4.getClass() == RuntimeException.class && e4.getMessage() != null && e4.getMessage().startsWith("Unable to stop")) {
                            throw e4;
                        }
                        return;
                    } catch (Throwable th) {
                        Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                        return;
                    }
                case 5:
                    Typeface typeface = (Typeface) this.L;
                    io2 io2Var = (io2) ((dz4) this.B).A;
                    if (io2Var != null) {
                        io2Var.d0(typeface);
                        return;
                    }
                    return;
                case ig7.b /* 6 */:
                    try {
                        Object I = jv3.I((fq3) this.B);
                        i90 i90Var = ((cj0) this.L).B;
                        if (i90Var != null) {
                            i90Var.a(I);
                        }
                    } catch (CancellationException unused) {
                        ((cj0) this.L).cancel(false);
                    } catch (ExecutionException e5) {
                        Throwable cause2 = e5.getCause();
                        i90 i90Var2 = ((cj0) this.L).B;
                        if (i90Var2 != null) {
                            i90Var2.c(cause2);
                        }
                    }
                    return;
                case 7:
                    y70 f = y70.f();
                    String str = uc1.e;
                    StringBuilder sb = new StringBuilder("Scheduling work ");
                    xh7 xh7Var2 = (xh7) this.B;
                    sb.append(xh7Var2.a);
                    f.b(str, sb.toString());
                    ((uc1) this.L).a.c(xh7Var2);
                    return;
                case 8:
                    nk2.J((ac3) this.B).k(me2.o((Throwable) this.L));
                    return;
                case 9:
                    break;
                case 10:
                    ((dn1) this.B).accept(this.L);
                    return;
                case 11:
                    ((ih0) this.L).H((n22) this.B, o27.a);
                    return;
                case mj2.L /* 12 */:
                    a();
                    return;
                case 13:
                    ha7 ha7Var = ((SwipeDismissBehavior) this.L).a;
                    if (ha7Var != null && ha7Var.f()) {
                        ((View) this.B).postOnAnimation(this);
                        return;
                    }
                    return;
                default:
                    ku4 ku4Var = ((ql6) this.L).A.f;
                    String str2 = (String) this.B;
                    synchronized (ku4Var.k) {
                        try {
                            ui7 c = ku4Var.c(str2);
                            if (c != null) {
                            }
                        } finally {
                        }
                    }
                    if (xh7Var != 0 && !b53.x(kz0.j, xh7Var.j)) {
                        synchronized (((ql6) this.L).L) {
                            ((ql6) this.L).Y.put(ei7.b(xh7Var), xh7Var);
                            ql6 ql6Var = (ql6) this.L;
                            ((ql6) this.L).Z.put(ei7.b(xh7Var), zg7.a(ql6Var.c0, xh7Var, ql6Var.B.b, ql6Var));
                        }
                        return;
                    }
                    return;
            }
            while (true) {
                ((Runnable) this.B).run();
                Runnable n0 = ((pn3) this.L).n0();
                if (n0 != null) {
                    try {
                        this.B = n0;
                        i++;
                        if (i >= 16) {
                            pn3 pn3Var = (pn3) this.L;
                            if (kg1.c(pn3Var.R, pn3Var)) {
                                pn3 pn3Var2 = (pn3) this.L;
                                kg1.b(pn3Var2.R, pn3Var2, this);
                                return;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        } finally {
            ((cj0) this.L).Z = null;
        }
    }

    public String toString() {
        switch (this.A) {
            case 0:
                return qj2.class.getSimpleName() + "," + ((oj2) this.L);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ qj2(int i, Object obj, Object obj2, boolean z) {
        this.A = i;
        this.L = obj;
        this.B = obj2;
    }

    public /* synthetic */ qj2(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }
}
