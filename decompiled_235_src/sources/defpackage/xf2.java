package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xf2  reason: default package */
/* loaded from: classes.dex */
public final class xf2 implements le2 {
    public final /* synthetic */ le2 A;
    public final /* synthetic */ le2 B;
    public final /* synthetic */ fo2 L;

    public xf2(le2 le2Var, le2 le2Var2, fo2 fo2Var) {
        this.A = le2Var;
        this.B = le2Var2;
        this.L = fo2Var;
    }

    @Override // defpackage.le2
    public final Object b(ne2 ne2Var, r41 r41Var) {
        Object o = nb3.o(r41Var, ne2Var, jz.R, new o12(this.L, (r41) null, 5), new le2[]{this.A, this.B});
        if (o == x61.COROUTINE_SUSPENDED) {
            return o;
        }
        return jg7.a;
    }
}
