package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pp6  reason: default package */
/* loaded from: classes.dex */
public final class pp6 implements PointerInputEventHandler {
    public final /* synthetic */ o31 a;
    public final /* synthetic */ k24 b;
    public final /* synthetic */ l14 c;
    public final /* synthetic */ k24 d;

    public pp6(o31 o31Var, k24 k24Var, l14 l14Var, k24 k24Var2) {
        this.a = o31Var;
        this.b = k24Var;
        this.c = l14Var;
        this.d = k24Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(vp4 vp4Var, j11 j11Var) {
        op6 op6Var = new op6(this.a, this.b, this.c, null);
        j4 j4Var = new j4(this.d, 24);
        xj1 xj1Var = xm6.a;
        Object k = iq2.k(new xh(vp4Var, op6Var, j4Var, new ht4(vp4Var), null, 13), j11Var);
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        o27 o27Var = o27.a;
        if (k != p31Var) {
            k = o27Var;
        }
        if (k == p31Var) {
            return k;
        }
        return o27Var;
    }
}
