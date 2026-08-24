package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pb3  reason: default package */
/* loaded from: classes.dex */
public final class pb3 extends s41 {
    public int R;
    public final /* synthetic */ eo2 X;
    public final /* synthetic */ Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb3(r41 r41Var, l61 l61Var, eo2 eo2Var, Object obj) {
        super(r41Var, l61Var);
        this.X = eo2Var;
        this.Y = obj;
        r41Var.getClass();
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.R;
        if (i != 0) {
            if (i == 1) {
                this.R = 2;
                oi2.Y(obj);
                return obj;
            }
            i.m("This coroutine had already completed");
            return null;
        }
        this.R = 1;
        oi2.Y(obj);
        eo2 eo2Var = this.X;
        eo2Var.getClass();
        ge7.p(2, eo2Var);
        return eo2Var.o(this.Y, this);
    }
}
