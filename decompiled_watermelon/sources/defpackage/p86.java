package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p86  reason: default package */
/* loaded from: classes.dex */
public final class p86 extends nk6 implements aj2 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ float Z;
    public final /* synthetic */ float c0;
    public final /* synthetic */ float d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p86(float f, float f2, float f3, j11 j11Var) {
        super(2, j11Var);
        this.Z = f;
        this.c0 = f2;
        this.d0 = f3;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((p86) t((j11) obj2, (oc) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        p86 p86Var = new p86(this.Z, this.c0, this.d0, j11Var);
        p86Var.Y = obj;
        return p86Var;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [k75, java.lang.Object] */
    @Override // defpackage.m00
    public final Object v(Object obj) {
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i != 0) {
            if (i == 1) {
                me2.a0(obj);
            } else {
                i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            me2.a0(obj);
            ?? obj2 = new Object();
            float f = this.Z;
            obj2.A = f;
            um c = a53.c(f);
            Float f2 = new Float(this.c0);
            xy6 xy6Var = t86.b;
            Float f3 = new Float(this.d0);
            zr4 zr4Var = new zr4(12, (oc) this.Y, (Object) obj2);
            this.X = 1;
            Object d = c.d();
            bz6 bz6Var = dt3.g0;
            if (y24.a(c.f, new rm(c, f3, new zm6(xy6Var, bz6Var, d, f2, (oo) bz6Var.a.n(f3)), c.c.R, zr4Var, null), this) == p31Var) {
                return p31Var;
            }
        }
        return o27.a;
    }
}
