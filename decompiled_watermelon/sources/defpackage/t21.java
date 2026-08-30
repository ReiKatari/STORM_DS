package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t21  reason: default package */
/* loaded from: classes.dex */
public final class t21 implements PointerInputEventHandler {
    public final /* synthetic */ vo6 a;
    public final /* synthetic */ bq6 b;

    public t21(vo6 vo6Var, bq6 bq6Var) {
        this.a = vo6Var;
        this.b = bq6Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(vp4 vp4Var, j11 j11Var) {
        Object k = iq2.k(new s21(vp4Var, this.a, this.b, null), j11Var);
        if (k == p31.COROUTINE_SUSPENDED) {
            return k;
        }
        return o27.a;
    }
}
