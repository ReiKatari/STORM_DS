package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oi7  reason: default package */
/* loaded from: classes.dex */
public final class oi7 extends hw6 implements qn2 {
    public int X;
    public int Y;
    public final /* synthetic */ ri7 Z;
    public final /* synthetic */ int d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi7(ri7 ri7Var, int i, r41 r41Var) {
        super(1, r41Var);
        this.Z = ri7Var;
        this.d0 = i;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        return new oi7(this.Z, this.d0, (r41) obj).s(jg7.a);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i;
        tu0 tu0Var;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i2 = this.Y;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    i = this.X;
                    oi2.Y(obj);
                } else {
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                oi2.Y(obj);
                if (kj2.F("CXCP")) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl#setTorchOffAsync");
                }
                ri7 ri7Var = this.Z;
                int i3 = this.d0;
                sf0 a = ri7Var.c.a();
                this.X = i3;
                this.Y = 1;
                obj = a.h(this);
                if (obj == x61Var) {
                    return x61Var;
                }
                i = i3;
            }
            AutoCloseable autoCloseable = (AutoCloseable) obj;
            vf0 vf0Var = (vf0) autoCloseable;
            oa oaVar = new oa(i);
            if (!vf0Var.A.a()) {
                t41 t41Var = vf0Var.L;
                t41Var.getClass();
                tu0Var = t41.a(t41Var, oaVar, null, null, new pd2(0), null, null, null, 118);
            } else {
                e41.g(vf0Var, " after close.", "Cannot call setTorchOff on ");
                tu0Var = null;
            }
            lb4.p(autoCloseable, null);
            return tu0Var;
        } catch (CancellationException e) {
            if (kj2.F("CXCP")) {
                Log.d("CXCP", "Cannot acquire the CameraGraph.Session", e);
            }
            return ri7.l;
        }
    }
}
