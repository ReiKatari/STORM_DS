package g2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o4 implements PointerInputEventHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f5321a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ float f5322b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ n2.w0 f5323c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ n2.s2 f5324d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ zc.u f5325e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ h1.p0 f5326f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ n2.w0 f5327g;

    public o4(boolean z10, float f8, n2.w0 w0Var, n2.s2 s2Var, zc.u uVar, h1.p0 p0Var, n2.w0 w0Var2) {
        this.f5321a = z10;
        this.f5322b = f8;
        this.f5323c = w0Var;
        this.f5324d = s2Var;
        this.f5325e = uVar;
        this.f5326f = p0Var;
        this.f5327g = w0Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(v3.w wVar, cc.c cVar) {
        Object d4 = h1.a3.d(wVar, new n4(this.f5321a, this.f5322b, this.f5323c, this.f5324d, null), new ai.c0(this.f5325e, this.f5326f, this.f5327g, 5), cVar, 3);
        if (d4 == dc.a.COROUTINE_SUSPENDED) {
            return d4;
        }
        return yb.y.f14813a;
    }
}
