package u1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import h1.a3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c1 implements PointerInputEventHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zc.u f13289a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n2.w0 f13290b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j1.i f13291c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ n2.w0 f13292d;

    public c1(zc.u uVar, n2.w0 w0Var, j1.i iVar, n2.w0 w0Var2) {
        this.f13289a = uVar;
        this.f13290b = w0Var;
        this.f13291c = iVar;
        this.f13292d = w0Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(v3.w wVar, cc.c cVar) {
        b1 b1Var = new b1(this.f13289a, this.f13290b, this.f13291c, null);
        ai.o oVar = new ai.o(this.f13292d, 11);
        h1.m0 m0Var = a3.f5853a;
        Object g10 = zc.x.g(new b7.z(wVar, b1Var, oVar, new h1.r1(wVar), (cc.c) null), cVar);
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        yb.y yVar = yb.y.f14813a;
        if (g10 != aVar) {
            g10 = yVar;
        }
        if (g10 == aVar) {
            return g10;
        }
        return yVar;
    }
}
