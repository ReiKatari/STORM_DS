package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nl1  reason: default package */
/* loaded from: classes.dex */
public final class nl1 implements le2 {
    public final le2 A;
    public final qn2 B;

    public nl1(le2 le2Var, qn2 qn2Var) {
        this.A = le2Var;
        this.B = qn2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dh5, java.lang.Object] */
    @Override // defpackage.le2
    public final Object b(ne2 ne2Var, r41 r41Var) {
        ?? obj = new Object();
        obj.A = fh4.a;
        Object b = this.A.b(new vc(this, obj, ne2Var), r41Var);
        if (b == x61.COROUTINE_SUSPENDED) {
            return b;
        }
        return jg7.a;
    }
}
