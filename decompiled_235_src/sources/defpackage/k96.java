package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k96  reason: default package */
/* loaded from: classes.dex */
public final class k96 extends hw6 implements qn2 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ n96 d0;
    public final /* synthetic */ ga7 e0;
    public final /* synthetic */ float f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k96(Object obj, Object obj2, n96 n96Var, ga7 ga7Var, float f, r41 r41Var) {
        super(1, r41Var);
        this.Y = obj;
        this.Z = obj2;
        this.d0 = n96Var;
        this.e0 = ga7Var;
        this.f0 = f;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        ga7 ga7Var = this.e0;
        float f = this.f0;
        return new k96(this.Y, this.Z, this.d0, ga7Var, f, (r41) obj).s(jg7.a);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i != 0) {
            if (i == 1) {
                oi2.Y(obj);
            } else {
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            j96 j96Var = new j96(this.Y, this.Z, this.d0, this.e0, this.f0, null);
            this.X = 1;
            if (g04.C(j96Var, this) == x61Var) {
                return x61Var;
            }
        }
        return jg7.a;
    }
}
