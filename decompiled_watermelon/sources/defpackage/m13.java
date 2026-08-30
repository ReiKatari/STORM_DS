package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m13  reason: default package */
/* loaded from: classes.dex */
public final class m13 extends nk6 implements aj2 {
    public int X;
    public final /* synthetic */ u92 Y;
    public final /* synthetic */ jc2 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m13(u92 u92Var, jc2 jc2Var, j11 j11Var) {
        super(2, j11Var);
        this.Y = u92Var;
        this.Z = jc2Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((m13) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        return new m13(this.Y, this.Z, j11Var);
    }

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
            x6 x6Var = new x6(10, this.Z);
            this.X = 1;
            if (this.Y.a(x6Var, this) == p31Var) {
                return p31Var;
            }
        }
        return o27.a;
    }
}
