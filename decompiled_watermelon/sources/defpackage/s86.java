package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s86  reason: default package */
/* loaded from: classes.dex */
public final class s86 implements PointerInputEventHandler {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ k24 c;
    public final /* synthetic */ ae6 d;
    public final /* synthetic */ o31 e;
    public final /* synthetic */ ak1 f;
    public final /* synthetic */ k24 g;

    public s86(boolean z, float f, k24 k24Var, ae6 ae6Var, o31 o31Var, ak1 ak1Var, k24 k24Var2) {
        this.a = z;
        this.b = f;
        this.c = k24Var;
        this.d = ae6Var;
        this.e = o31Var;
        this.f = ak1Var;
        this.g = k24Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(vp4 vp4Var, j11 j11Var) {
        Object d = xm6.d(vp4Var, new r86(this.a, this.b, this.c, this.d, null), new cz(this.e, this.f, this.g, 23), j11Var, 3);
        if (d == p31.COROUTINE_SUSPENDED) {
            return d;
        }
        return o27.a;
    }
}
