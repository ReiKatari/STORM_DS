package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ob3  reason: default package */
/* loaded from: classes.dex */
public final class ob3 extends cm5 {
    public int B;
    public final /* synthetic */ eo2 L;
    public final /* synthetic */ Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob3(eo2 eo2Var, Object obj, r41 r41Var) {
        super(r41Var);
        this.L = eo2Var;
        this.R = obj;
        r41Var.getClass();
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.B;
        if (i != 0) {
            if (i == 1) {
                this.B = 2;
                oi2.Y(obj);
                return obj;
            }
            i.m("This coroutine had already completed");
            return null;
        }
        this.B = 1;
        oi2.Y(obj);
        eo2 eo2Var = this.L;
        eo2Var.getClass();
        ge7.p(2, eo2Var);
        return eo2Var.o(this.R, this);
    }
}
