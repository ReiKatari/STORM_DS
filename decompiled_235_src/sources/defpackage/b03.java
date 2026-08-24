package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b03  reason: default package */
/* loaded from: classes.dex */
public final class b03 extends c03 {
    public final ib0 d;
    public final boolean e;

    public b03(vk5 vk5Var, xk4 xk4Var, b51 b51Var, ib0 ib0Var, boolean z) {
        super(vk5Var, xk4Var, b51Var);
        this.d = ib0Var;
        this.e = z;
    }

    @Override // defpackage.c03
    public final Object a(vk4 vk4Var, Object[] objArr) {
        gb0 gb0Var = (gb0) this.d.b(vk4Var);
        r41 r41Var = (r41) objArr[objArr.length - 1];
        try {
            if (this.e) {
                try {
                    gb0Var.getClass();
                    return np2.o(gb0Var, r41Var);
                } catch (ThreadDeath e) {
                    throw e;
                }
            }
            return np2.n(gb0Var, r41Var);
        } catch (LinkageError | ThreadDeath | VirtualMachineError e2) {
            throw e2;
        } catch (Throwable th) {
            return np2.h0(th, r41Var);
        }
    }
}
