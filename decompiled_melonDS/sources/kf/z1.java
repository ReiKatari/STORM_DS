package kf;

import me.magnum.melonds.domain.model.RendererConfiguration;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z1 extends ec.j implements mc.s {
    public /* synthetic */ VideoRenderer X;
    public /* synthetic */ oe.u0 Y;
    public /* synthetic */ boolean Z;

    /* renamed from: b0  reason: collision with root package name */
    public /* synthetic */ int f8290b0;

    /* JADX WARN: Type inference failed for: r0v0, types: [ec.j, kf.z1] */
    @Override // mc.s
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        int intValue = ((Number) obj4).intValue();
        ?? jVar = new ec.j(5, (cc.c) obj5);
        jVar.X = (VideoRenderer) obj;
        jVar.Y = (oe.u0) obj2;
        jVar.Z = booleanValue;
        jVar.f8290b0 = intValue;
        return jVar.v(yb.y.f14813a);
    }

    @Override // ec.a
    public final Object v(Object obj) {
        VideoRenderer videoRenderer = this.X;
        oe.u0 u0Var = this.Y;
        boolean z10 = this.Z;
        int i2 = this.f8290b0;
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        p7.j.I(obj);
        return new RendererConfiguration(videoRenderer, u0Var, z10, i2);
    }
}
