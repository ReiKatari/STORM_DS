package defpackage;

import me.magnum.melonds.domain.model.RendererConfiguration;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jg6  reason: default package */
/* loaded from: classes.dex */
public final class jg6 extends hw6 implements ho2 {
    public /* synthetic */ RendererConfiguration X;
    public /* synthetic */ bg6 Y;
    public /* synthetic */ String Z;
    public /* synthetic */ String d0;
    public final /* synthetic */ ng6 e0;
    public final /* synthetic */ jt5 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg6(ng6 ng6Var, jt5 jt5Var, r41 r41Var) {
        super(5, r41Var);
        this.e0 = ng6Var;
        this.f0 = jt5Var;
    }

    @Override // defpackage.ho2
    public final Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        jg6 jg6Var = new jg6(this.e0, this.f0, (r41) obj5);
        jg6Var.X = (RendererConfiguration) obj;
        jg6Var.Y = (bg6) obj2;
        jg6Var.Z = (String) obj3;
        jg6Var.d0 = (String) obj4;
        return jg6Var.s(jg7.a);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        RendererConfiguration rendererConfiguration = this.X;
        bg6 bg6Var = this.Y;
        String str = this.Z;
        String str2 = this.d0;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        po5 po5Var = ng6.l;
        return this.e0.b(rendererConfiguration, this.f0, bg6Var, str, str2);
    }
}
