package defpackage;

import me.magnum.melonds.domain.model.RendererConfiguration;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x46  reason: default package */
/* loaded from: classes.dex */
public final class x46 extends nk6 implements dj2 {
    public /* synthetic */ RendererConfiguration X;
    public /* synthetic */ p46 Y;
    public /* synthetic */ String Z;
    public /* synthetic */ String c0;
    public final /* synthetic */ b56 d0;
    public final /* synthetic */ ti5 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x46(b56 b56Var, ti5 ti5Var, j11 j11Var) {
        super(5, j11Var);
        this.d0 = b56Var;
        this.e0 = ti5Var;
    }

    @Override // defpackage.dj2
    public final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        x46 x46Var = new x46(this.d0, this.e0, (j11) obj5);
        x46Var.X = (RendererConfiguration) obj;
        x46Var.Y = (p46) obj2;
        x46Var.Z = (String) obj3;
        x46Var.c0 = (String) obj4;
        return x46Var.v(o27.a);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        RendererConfiguration rendererConfiguration = this.X;
        p46 p46Var = this.Y;
        String str = this.Z;
        String str2 = this.c0;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        me2.a0(obj);
        ue5 ue5Var = b56.l;
        return this.d0.b(rendererConfiguration, this.e0, p46Var, str, str2);
    }
}
