package m0;

import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import gk.x;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import k7.a0;
import l.i0;
import me.magnum.melonds.common.camera.DSiCameraSource;
import p8.v;
import q8.b0;
import x8.p;
import yb.y;
import zc.s0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements Runnable {
    public final /* synthetic */ int A;
    public Object B;
    public final Object L;

    public h(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z10) {
        this.A = 11;
        this.L = swipeDismissBehavior;
        this.B = view;
    }

    private final void a() {
        try {
            ((Runnable) this.L).run();
            synchronized (((a0) this.B).X) {
                ((a0) this.B).a();
            }
        } catch (Throwable th2) {
            synchronized (((a0) this.B).X) {
                ((a0) this.B).a();
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar;
        switch (this.A) {
            case 0:
                c cVar = (c) this.L;
                try {
                    cVar.D(i.a((Future) this.B));
                    return;
                } catch (Error e6) {
                    e = e6;
                    cVar.z(e);
                    return;
                } catch (RuntimeException e10) {
                    e = e10;
                    cVar.z(e);
                    return;
                } catch (ExecutionException e11) {
                    Throwable cause = e11.getCause();
                    if (cause == null) {
                        cVar.z(e11);
                        return;
                    } else {
                        cVar.z(cause);
                        return;
                    }
                }
            case DSiCameraSource.FrontCamera /* 1 */:
                int i2 = 0;
                while (true) {
                    ((Runnable) this.B).run();
                    Runnable b02 = ((ed.g) this.L).b0();
                    if (b02 != null) {
                        try {
                            this.B = b02;
                            i2++;
                            if (i2 >= 16) {
                                ed.g gVar = (ed.g) this.L;
                                if (ed.b.j(gVar.R, gVar)) {
                                    ed.g gVar2 = (ed.g) this.L;
                                    ed.b.i(gVar2.R, gVar2, this);
                                    return;
                                }
                            }
                        }
                    } else {
                        return;
                    }
                }
            case 2:
                pc.a.A((x) this.B).h(p7.j.o((Throwable) this.L));
                return;
            case 3:
                try {
                    try {
                        Object b10 = i.b((ta.a) this.B);
                        b5.i iVar = ((b) this.L).B;
                        if (iVar != null) {
                            iVar.b(b10);
                        }
                    } catch (CancellationException unused) {
                        ((b) this.L).cancel(false);
                    } catch (ExecutionException e12) {
                        Throwable cause2 = e12.getCause();
                        b5.i iVar2 = ((b) this.L).B;
                        if (iVar2 != null) {
                            iVar2.c(cause2);
                        }
                    }
                    return;
                } finally {
                    ((b) this.L).Z = null;
                }
            case 4:
                ((m5.a) this.B).f9234a = this.L;
                return;
            case l1.c.f8511g /* 5 */:
                ((Application) this.B).unregisterActivityLifecycleCallbacks((m5.a) this.L);
                return;
            case l1.c.f8509e /* 6 */:
                Object obj = this.L;
                Object obj2 = this.B;
                try {
                    Method method = m5.b.f9243d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        m5.b.f9244e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e13) {
                    if (e13.getClass() == RuntimeException.class && e13.getMessage() != null && e13.getMessage().startsWith("Unable to stop")) {
                        throw e13;
                    }
                    return;
                } catch (Throwable th2) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
                    return;
                }
            case 7:
                v e14 = v.e();
                String str = r8.a.f12620e;
                StringBuilder sb2 = new StringBuilder("Scheduling work ");
                p pVar2 = (p) this.B;
                sb2.append(pVar2.f14420a);
                e14.a(str, sb2.toString());
                ((r8.a) this.L).f12621a.c(pVar2);
                return;
            case 8:
                Typeface typeface = (Typeface) this.L;
                p5.b bVar = (p5.b) ((i0) this.B).B;
                if (bVar != null) {
                    bVar.j(typeface);
                    return;
                }
                return;
            case l1.c.f8508d /* 9 */:
                ((r0.e) this.B).accept(this.L);
                return;
            case l1.c.f8510f /* 10 */:
                q8.d dVar = ((w8.a) this.L).A.f12376f;
                String str2 = (String) this.B;
                synchronized (dVar.f12351k) {
                    try {
                        b0 c4 = dVar.c(str2);
                        if (c4 != null) {
                            pVar = c4.f12324a;
                        } else {
                            pVar = null;
                        }
                    } finally {
                    }
                }
                if (pVar != null && !nc.k.a(p8.e.f11470j, pVar.f14429j)) {
                    synchronized (((w8.a) this.L).L) {
                        ((w8.a) this.L).Y.put(p7.l.k(pVar), pVar);
                        w8.a aVar = (w8.a) this.L;
                        ((w8.a) this.L).Z.put(p7.l.k(pVar), t8.h.a(aVar.f14169b0, pVar, aVar.B.f14970b, aVar));
                    }
                    return;
                }
                return;
            case 11:
                j6.d dVar2 = ((SwipeDismissBehavior) this.L).f2938a;
                if (dVar2 != null && dVar2.f()) {
                    ((View) this.B).postOnAnimation(this);
                    return;
                }
                return;
            case 12:
                a();
                return;
            default:
                ((zc.h) this.L).F((s0) this.B, y.f14813a);
                return;
        }
    }

    public String toString() {
        switch (this.A) {
            case 0:
                return h.class.getSimpleName() + "," + ((c) this.L);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ h(int i2, Object obj, Object obj2, boolean z10) {
        this.A = i2;
        this.L = obj;
        this.B = obj2;
    }

    public /* synthetic */ h(int i2, Object obj, Object obj2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
    }
}
