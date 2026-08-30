package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o86  reason: default package */
/* loaded from: classes.dex */
public final class o86 extends nk6 implements aj2 {
    public int X;
    public final /* synthetic */ b86 Y;
    public final /* synthetic */ float Z;
    public final /* synthetic */ float c0;
    public final /* synthetic */ float d0;
    public final /* synthetic */ ki2 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o86(b86 b86Var, float f, float f2, float f3, ki2 ki2Var, j11 j11Var) {
        super(2, j11Var);
        this.Y = b86Var;
        this.Z = f;
        this.c0 = f2;
        this.d0 = f3;
        this.e0 = ki2Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((o86) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        return new o86(this.Y, this.Z, this.c0, this.d0, this.e0, j11Var);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.X;
        o27 o27Var = o27.a;
        if (i != 0) {
            if (i == 1) {
                me2.a0(obj);
            } else {
                i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            me2.a0(obj);
            this.X = 1;
            zy3 zy3Var = t86.a;
            p86 p86Var = new p86(this.Z, this.c0, this.d0, null);
            Object c = this.Y.c(r24.Default, p86Var, this);
            if (c != p31Var) {
                c = o27Var;
            }
            if (c == p31Var) {
                return p31Var;
            }
        }
        ki2 ki2Var = this.e0;
        if (ki2Var != null) {
            ki2Var.c();
        }
        return o27Var;
    }
}
