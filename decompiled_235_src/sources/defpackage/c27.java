package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c27  reason: default package */
/* loaded from: classes.dex */
public final class c27 extends hw6 implements fo2 {
    public int X;
    public /* synthetic */ j25 Y;
    public /* synthetic */ long Z;
    public final /* synthetic */ w61 d0;
    public final /* synthetic */ qa4 e0;
    public final /* synthetic */ r94 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c27(w61 w61Var, qa4 qa4Var, r94 r94Var, r41 r41Var) {
        super(3, r41Var);
        this.d0 = w61Var;
        this.e0 = qa4Var;
        this.f0 = r94Var;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        long j = ((jk4) obj2).a;
        qa4 qa4Var = this.e0;
        r94 r94Var = this.f0;
        c27 c27Var = new c27(this.d0, qa4Var, r94Var, (r41) obj3);
        c27Var.Y = (j25) obj;
        c27Var.Z = j;
        return c27Var.s(jg7.a);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        w61 w61Var = this.d0;
        if (i != 0) {
            if (i == 1) {
                oi2.Y(obj);
            } else {
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            j25 j25Var = this.Y;
            hv.L(w61Var, null, null, new c0(5, this.Z, (r41) null, this.e0, this.f0), 3);
            this.X = 1;
            obj = j25Var.i(this);
            if (obj == x61Var) {
                return x61Var;
            }
        }
        hv.L(w61Var, null, null, new f12(this.e0, ((Boolean) obj).booleanValue(), this.f0, (r41) null), 3);
        return jg7.a;
    }
}
