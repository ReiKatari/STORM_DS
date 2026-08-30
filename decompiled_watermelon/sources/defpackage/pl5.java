package defpackage;

import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.domain.model.MicSource;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pl5  reason: default package */
/* loaded from: classes.dex */
public final class pl5 extends nk6 implements ej2 {
    public int X;
    public /* synthetic */ ti5 Y;
    public /* synthetic */ ti4 Z;
    public /* synthetic */ nl5 c0;
    public /* synthetic */ ty6 d0;
    public /* synthetic */ boolean e0;
    public final /* synthetic */ sl5 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl5(sl5 sl5Var, j11 j11Var) {
        super(6, j11Var);
        this.f0 = sl5Var;
    }

    @Override // defpackage.ej2
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj5).booleanValue();
        pl5 pl5Var = new pl5(this.f0, (j11) obj6);
        pl5Var.Y = (ti5) obj;
        pl5Var.Z = (ti4) obj2;
        pl5Var.c0 = (nl5) obj3;
        pl5Var.d0 = (ty6) obj4;
        pl5Var.e0 = booleanValue;
        return pl5Var.v(o27.a);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        ti5 ti5Var = this.Y;
        ti4 ti4Var = this.Z;
        nl5 nl5Var = this.c0;
        ty6 ty6Var = this.d0;
        boolean z = this.e0;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i != 0) {
            if (i == 1) {
                me2.a0(obj);
                return obj;
            }
            i.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        me2.a0(obj);
        boolean booleanValue = ((Boolean) ty6Var.L).booleanValue();
        this.Y = null;
        this.Z = null;
        this.c0 = null;
        this.d0 = null;
        this.e0 = z;
        this.X = 1;
        Object a = this.f0.b.a(ti5Var, (ConsoleType) ti4Var.A, (MicSource) ti4Var.B, nl5Var.a, nl5Var.b, nl5Var.c, nl5Var.d, (String) ty6Var.A, (String) ty6Var.B, booleanValue, z, this);
        if (a == p31Var) {
            return p31Var;
        }
        return a;
    }
}
