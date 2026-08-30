package u1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a0 implements PointerInputEventHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v0 f13276a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f2.b1 f13277b;

    public a0(v0 v0Var, f2.b1 b1Var) {
        this.f13276a = v0Var;
        this.f13277b = b1Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(v3.w wVar, cc.c cVar) {
        Object g10 = zc.x.g(new z(wVar, this.f13276a, this.f13277b, null), cVar);
        if (g10 == dc.a.COROUTINE_SUSPENDED) {
            return g10;
        }
        return yb.y.f14813a;
    }
}
