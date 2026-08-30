package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q47  reason: default package */
/* loaded from: classes.dex */
public final class q47 extends nk6 implements mi2 {
    public int X;
    public int Y;
    public final /* synthetic */ t47 Z;
    public final /* synthetic */ int c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q47(t47 t47Var, int i, j11 j11Var) {
        super(1, j11Var);
        this.Z = t47Var;
        this.c0 = i;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        return new q47(this.Z, this.c0, (j11) obj).v(o27.a);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i;
        gs0 gs0Var;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i2 = this.Y;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    i = this.X;
                    me2.a0(obj);
                } else {
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                me2.a0(obj);
                if (ve2.D("CXCP")) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl#setTorchOffAsync");
                }
                t47 t47Var = this.Z;
                int i3 = this.c0;
                jd0 a = t47Var.c.a();
                this.X = i3;
                this.Y = 1;
                obj = a.i(this);
                if (obj == p31Var) {
                    return p31Var;
                }
                i = i3;
            }
            AutoCloseable autoCloseable = (AutoCloseable) obj;
            md0 md0Var = (md0) autoCloseable;
            ja jaVar = new ja(i);
            if (!md0Var.A.a()) {
                l11 l11Var = md0Var.L;
                l11Var.getClass();
                gs0Var = l11.a(l11Var, jaVar, null, null, new x82(0), null, null, null, 118);
            } else {
                i.m(md0Var, " after close.", "Cannot call setTorchOff on ");
                gs0Var = null;
            }
            iq2.h(autoCloseable, null);
            return gs0Var;
        } catch (CancellationException e) {
            if (ve2.D("CXCP")) {
                Log.d("CXCP", "Cannot acquire the CameraGraph.Session", e);
            }
            return t47.l;
        }
    }
}
