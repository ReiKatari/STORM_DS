package defpackage;

import android.app.Application;
import android.app.job.JobParameters;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uo2  reason: default package */
/* loaded from: classes.dex */
public final class uo2 implements Runnable {
    public final /* synthetic */ int A;
    public Object B;
    public final Object L;

    public uo2(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.A = 16;
        this.L = swipeDismissBehavior;
        this.B = view;
    }

    private final void a() {
        int i = 0;
        while (true) {
            ((Runnable) this.B).run();
            Runnable n0 = ((ru3) this.L).n0();
            if (n0 != null) {
                try {
                    this.B = n0;
                    i++;
                    if (i >= 16) {
                        ru3 ru3Var = (ru3) this.L;
                        if (ok1.c(ru3Var.R, ru3Var)) {
                            ru3 ru3Var2 = (ru3) this.L;
                            ok1.b(ru3Var2.R, ru3Var2, this);
                            return;
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    private final void b() {
        try {
            ((Runnable) this.L).run();
            synchronized (((zb6) this.B).X) {
                ((zb6) this.B).a();
            }
        } catch (Throwable th) {
            synchronized (((zb6) this.B).X) {
                ((zb6) this.B).a();
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [gx3] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v5, types: [ll0] */
    @Override // java.lang.Runnable
    public final void run() {
        g44 g44Var;
        d90 d90Var;
        yw7 yw7Var = 0;
        try {
            switch (this.A) {
                case 0:
                    so2 so2Var = (so2) this.L;
                    try {
                        so2Var.onSuccess(l.v((Future) this.B));
                        return;
                    } catch (Error e) {
                        e = e;
                        so2Var.i(e);
                        return;
                    } catch (RuntimeException e2) {
                        e = e2;
                        so2Var.i(e);
                        return;
                    } catch (ExecutionException e3) {
                        Throwable cause = e3.getCause();
                        if (cause == null) {
                            so2Var.i(e3);
                            return;
                        } else {
                            so2Var.i(cause);
                            return;
                        }
                    }
                case 1:
                    d8 d8Var = (d8) this.B;
                    g8 g8Var = (g8) this.L;
                    i44 i44Var = g8Var.L;
                    if (i44Var != null && (g44Var = i44Var.e) != null) {
                        g44Var.H(i44Var);
                    }
                    View view = (View) g8Var.d0;
                    if (view != null && view.getWindowToken() != null) {
                        if (!d8Var.b()) {
                            if (d8Var.e != null) {
                                d8Var.d(0, 0, false, false);
                            }
                        }
                        g8Var.o0 = d8Var;
                    }
                    g8Var.q0 = null;
                    return;
                case 2:
                    ((w8) this.B).A = this.L;
                    return;
                case 3:
                    ((Application) this.B).unregisterActivityLifecycleCallbacks((w8) this.L);
                    return;
                case 4:
                    Object obj = this.L;
                    Object obj2 = this.B;
                    try {
                        Method method = x8.d;
                        if (method != null) {
                            method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                        } else {
                            x8.e.invoke(obj2, obj, Boolean.FALSE);
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
                    gi2 gi2Var = (gi2) ((j97) this.B).B;
                    if (gi2Var != null) {
                        gi2Var.L(typeface);
                        return;
                    }
                    return;
                case 6:
                    try {
                        Object w = l.w((gx3) this.B);
                        qb0 qb0Var = ((ll0) this.L).B;
                        if (qb0Var != null) {
                            qb0Var.a(w);
                        }
                    } catch (CancellationException unused) {
                        ((ll0) this.L).cancel(false);
                    } catch (ExecutionException e5) {
                        Throwable cause2 = e5.getCause();
                        qb0 qb0Var2 = ((ll0) this.L).B;
                        if (qb0Var2 != null) {
                            qb0Var2.c(cause2);
                        }
                    }
                    return;
                case 7:
                    do4 do4Var = (do4) this.B;
                    o55 o55Var = (o55) this.L;
                    if (do4Var.b == wv0.c) {
                        synchronized (do4Var) {
                            d90Var = do4Var.a;
                            do4Var.a = null;
                            do4Var.b = o55Var;
                        }
                        d90Var.getClass();
                        return;
                    }
                    i.m("provide() can be called only once.");
                    return;
                case 8:
                    tr3 tr3Var = (tr3) this.B;
                    o55 o55Var2 = (o55) this.L;
                    synchronized (tr3Var) {
                        try {
                            if (tr3Var.b == null) {
                                tr3Var.a.add(o55Var2);
                            } else {
                                tr3Var.b.add(o55Var2.get());
                            }
                        } finally {
                        }
                    }
                    return;
                case 9:
                    ga0 f = ga0.f();
                    String str = wg1.e;
                    StringBuilder sb = new StringBuilder("Scheduling work ");
                    yw7 yw7Var2 = (yw7) this.B;
                    sb.append(yw7Var2.a);
                    f.b(str, sb.toString());
                    ((wg1) this.L).a.e(yw7Var2);
                    return;
                case 10:
                    int i = JobInfoSchedulerService.A;
                    ((JobInfoSchedulerService) this.B).jobFinished((JobParameters) this.L, false);
                    return;
                case 11:
                    np2.V((si3) this.B).i(oi2.p((Throwable) this.L));
                    return;
                case 12:
                    a();
                    return;
                case 13:
                    ((jr1) this.B).accept(this.L);
                    return;
                case 14:
                    ((rj0) this.L).I((f72) this.B, jg7.a);
                    return;
                case 15:
                    b();
                    return;
                case 16:
                    ho7 ho7Var = ((SwipeDismissBehavior) this.L).a;
                    if (ho7Var != null && ho7Var.f()) {
                        ((View) this.B).postOnAnimation(this);
                        return;
                    }
                    return;
                default:
                    o35 o35Var = ((mx6) this.L).A.f;
                    String str2 = (String) this.B;
                    synchronized (o35Var.k) {
                        try {
                            rx7 c = o35Var.c(str2);
                            if (c != null) {
                            }
                        } finally {
                        }
                    }
                    if (yw7Var != 0 && !nb3.k(p21.j, yw7Var.j)) {
                        synchronized (((mx6) this.L).L) {
                            ((mx6) this.L).Y.put(rr7.a(yw7Var), yw7Var);
                            mx6 mx6Var = (mx6) this.L;
                            ((mx6) this.L).Z.put(rr7.a(yw7Var), zv7.a(mx6Var.d0, yw7Var, mx6Var.B.b, mx6Var));
                        }
                        return;
                    }
                    return;
            }
        } finally {
            ((ll0) this.L).Z = null;
        }
    }

    public String toString() {
        switch (this.A) {
            case 0:
                return uo2.class.getSimpleName() + "," + ((so2) this.L);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ uo2(int i, Object obj, Object obj2, boolean z) {
        this.A = i;
        this.L = obj;
        this.B = obj2;
    }

    public /* synthetic */ uo2(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }
}
