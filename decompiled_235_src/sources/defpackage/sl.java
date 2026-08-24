package defpackage;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sl  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class sl implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public /* synthetic */ sl(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.A = i;
        this.L = obj;
        this.B = z;
        this.R = obj2;
        this.X = obj3;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        Object obj2 = this.X;
        Object obj3 = this.R;
        boolean z = this.B;
        Object obj4 = this.L;
        switch (i) {
            case 0:
                zh zhVar = (zh) obj3;
                z40 z40Var = (z40) obj2;
                um3 um3Var = (um3) obj;
                um3Var.b();
                zj0 zj0Var = um3Var.A;
                if (((Boolean) ((on2) obj4).c()).booleanValue()) {
                    if (z) {
                        long t0 = zj0Var.t0();
                        bt btVar = zj0Var.B;
                        long L = btVar.L();
                        btVar.G().h();
                        try {
                            ((os0) btVar.B).f0(-1.0f, 1.0f, t0);
                            zj0Var.f(zhVar, z40Var);
                        } finally {
                            xg6.v(btVar, L);
                        }
                    } else {
                        zj0Var.f(zhVar, z40Var);
                    }
                }
                return jg7Var;
            default:
                nx3 nx3Var = (nx3) obj4;
                String str = (String) obj3;
                rx7 rx7Var = (rx7) obj2;
                Throwable th = (Throwable) obj;
                if (th instanceof ix7) {
                    nx3Var.c.compareAndSet(-256, ((ix7) th).A);
                }
                if (z && str != null) {
                    xd5 xd5Var = rx7Var.e.m;
                    int hashCode = rx7Var.a.hashCode();
                    xd5Var.getClass();
                    if (Build.VERSION.SDK_INT >= 29) {
                        rp.b(hashCode, ln2.f0(str));
                    } else {
                        String f0 = ln2.f0(str);
                        try {
                            if (ln2.e == null) {
                                ln2.e = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                            }
                            Method method = ln2.e;
                            if (method != null) {
                                method.invoke(null, Long.valueOf(ln2.b), f0, Integer.valueOf(hashCode));
                            } else {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        } catch (Exception e) {
                            ln2.F("asyncTraceEnd", e);
                        }
                    }
                }
                return jg7Var;
        }
    }
}
