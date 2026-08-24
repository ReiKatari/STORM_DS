package defpackage;

import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fw5  reason: default package */
/* loaded from: classes.dex */
public final class fw5 extends hw6 implements ho2 {
    public /* synthetic */ VideoRenderer X;
    public /* synthetic */ boolean Y;
    public /* synthetic */ int Z;
    public /* synthetic */ VideoFiltering d0;

    /* JADX WARN: Type inference failed for: r4v2, types: [fw5, hw6] */
    @Override // defpackage.ho2
    public final Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        int intValue = ((Number) obj3).intValue();
        ?? hw6Var = new hw6(5, (r41) obj5);
        hw6Var.X = (VideoRenderer) obj;
        hw6Var.Y = booleanValue;
        hw6Var.Z = intValue;
        hw6Var.d0 = (VideoFiltering) obj4;
        return hw6Var.s(jg7.a);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        VideoRenderer videoRenderer = this.X;
        boolean z = this.Y;
        int i = this.Z;
        VideoFiltering videoFiltering = this.d0;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        return new cw5(videoRenderer, z, i, videoFiltering);
    }
}
