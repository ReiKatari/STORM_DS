package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cz6  reason: default package */
/* loaded from: classes.dex */
public final class cz6 extends dm5 implements eo2 {
    public int L;
    public /* synthetic */ Object R;
    public final /* synthetic */ w61 X;
    public final /* synthetic */ j25 Y;
    public final /* synthetic */ qn2 Z;
    public final /* synthetic */ qn2 d0;
    public final /* synthetic */ fo2 e0;
    public final /* synthetic */ qn2 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz6(w61 w61Var, j25 j25Var, qn2 qn2Var, qn2 qn2Var2, fo2 fo2Var, qn2 qn2Var3, r41 r41Var) {
        super(2, r41Var);
        this.X = w61Var;
        this.Y = j25Var;
        this.Z = qn2Var;
        this.d0 = qn2Var2;
        this.e0 = fo2Var;
        this.f0 = qn2Var3;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((cz6) q((r41) obj2, (mw6) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        cz6 cz6Var = new cz6(this.X, this.Y, this.Z, this.d0, this.e0, this.f0, r41Var);
        cz6Var.R = obj;
        return cz6Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.L;
        if (i != 0) {
            if (i == 1) {
                oi2.Y(obj);
            } else {
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            this.L = 1;
            if (hz6.g((mw6) this.R, this.X, this.Y, this.Z, this.d0, this.e0, this.f0, this) == x61Var) {
                return x61Var;
            }
        }
        return jg7.a;
    }
}
