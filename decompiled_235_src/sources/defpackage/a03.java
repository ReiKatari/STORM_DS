package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a03  reason: default package */
/* loaded from: classes.dex */
public final class a03 extends c03 {
    public final /* synthetic */ int d;
    public final ib0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a03(vk5 vk5Var, xk4 xk4Var, b51 b51Var, ib0 ib0Var, int i) {
        super(vk5Var, xk4Var, b51Var);
        this.d = i;
        this.e = ib0Var;
    }

    @Override // defpackage.c03
    public final Object a(vk4 vk4Var, Object[] objArr) {
        int i = this.d;
        ib0 ib0Var = this.e;
        switch (i) {
            case 0:
                return ib0Var.b(vk4Var);
            default:
                gb0 gb0Var = (gb0) ib0Var.b(vk4Var);
                r41 r41Var = (r41) objArr[objArr.length - 1];
                try {
                    rj0 rj0Var = new rj0(1, np2.V(r41Var));
                    rj0Var.v();
                    rj0Var.z(new ri3(gb0Var, 2));
                    gb0Var.h(new sp2(rj0Var, 3));
                    Object s = rj0Var.s();
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    return s;
                } catch (Exception e) {
                    return np2.h0(e, r41Var);
                }
        }
    }
}
