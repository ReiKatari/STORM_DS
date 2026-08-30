package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sm6  reason: default package */
/* loaded from: classes.dex */
public final class sm6 extends jc5 implements aj2 {
    public int L;
    public /* synthetic */ Object R;
    public final /* synthetic */ o31 X;
    public final /* synthetic */ ht4 Y;
    public final /* synthetic */ mi2 Z;
    public final /* synthetic */ mi2 c0;
    public final /* synthetic */ bj2 d0;
    public final /* synthetic */ mi2 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm6(o31 o31Var, ht4 ht4Var, mi2 mi2Var, mi2 mi2Var2, bj2 bj2Var, mi2 mi2Var3, j11 j11Var) {
        super(2, j11Var);
        this.X = o31Var;
        this.Y = ht4Var;
        this.Z = mi2Var;
        this.c0 = mi2Var2;
        this.d0 = bj2Var;
        this.e0 = mi2Var3;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((sm6) t((j11) obj2, (sk6) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        sm6 sm6Var = new sm6(this.X, this.Y, this.Z, this.c0, this.d0, this.e0, j11Var);
        sm6Var.R = obj;
        return sm6Var;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.L;
        if (i != 0) {
            if (i == 1) {
                me2.a0(obj);
            } else {
                i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            me2.a0(obj);
            this.L = 1;
            if (xm6.g((sk6) this.R, this.X, this.Y, this.Z, this.c0, this.d0, this.e0, this) == p31Var) {
                return p31Var;
            }
        }
        return o27.a;
    }
}
