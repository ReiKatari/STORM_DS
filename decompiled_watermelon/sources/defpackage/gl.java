package defpackage;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gl  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gl implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public /* synthetic */ gl(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.A = i;
        this.L = obj;
        this.B = z;
        this.R = obj2;
        this.X = obj3;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.A;
        o27 o27Var = o27.a;
        Object obj2 = this.X;
        Object obj3 = this.R;
        boolean z = this.B;
        Object obj4 = this.L;
        switch (i) {
            case 0:
                nh nhVar = (nh) obj3;
                b30 b30Var = (b30) obj2;
                xf3 xf3Var = (xf3) obj;
                xf3Var.a();
                rh0 rh0Var = xf3Var.A;
                if (((Boolean) ((ki2) obj4).c()).booleanValue()) {
                    if (z) {
                        long f0 = rh0Var.f0();
                        os osVar = rh0Var.B;
                        long E = osVar.E();
                        osVar.s().m();
                        try {
                            ((bq0) osVar.B).d0(-1.0f, 1.0f, f0);
                            rh0Var.f(nhVar, b30Var);
                        } finally {
                            wh1.u(osVar, E);
                        }
                    } else {
                        rh0Var.f(nhVar, b30Var);
                    }
                }
                return o27Var;
            default:
                mq3 mq3Var = (mq3) obj4;
                String str = (String) obj3;
                ui7 ui7Var = (ui7) obj2;
                Throwable th = (Throwable) obj;
                if (th instanceof li7) {
                    mq3Var.c.compareAndSet(-256, ((li7) th).A);
                }
                if (z && str != null) {
                    y60 y60Var = ui7Var.e.m;
                    int hashCode = ui7Var.a.hashCode();
                    y60Var.getClass();
                    if (Build.VERSION.SDK_INT >= 29) {
                        fp.b(hashCode, io2.p0(str));
                    } else {
                        String p0 = io2.p0(str);
                        try {
                            if (io2.g == null) {
                                io2.g = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                            }
                            Method method = io2.g;
                            if (method != null) {
                                method.invoke(null, Long.valueOf(io2.d), p0, Integer.valueOf(hashCode));
                            } else {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        } catch (Exception e) {
                            io2.O("asyncTraceEnd", e);
                        }
                    }
                }
                return o27Var;
        }
    }
}
