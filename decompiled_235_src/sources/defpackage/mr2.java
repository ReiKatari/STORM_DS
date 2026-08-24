package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mr2  reason: default package */
/* loaded from: classes.dex */
public abstract class mr2 implements Cloneable {
    public final pr2 A;
    public pr2 B;
    public boolean L = false;

    public mr2(pr2 pr2Var) {
        this.A = pr2Var;
        this.B = (pr2) pr2Var.f(or2.NEW_MUTABLE_INSTANCE);
    }

    public final pr2 a() {
        pr2 b = b();
        if (b.i()) {
            return b;
        }
        throw new ug(14);
    }

    public final pr2 b() {
        boolean z = this.L;
        pr2 pr2Var = this.B;
        if (z) {
            return pr2Var;
        }
        pr2Var.getClass();
        y45 y45Var = y45.c;
        y45Var.getClass();
        y45Var.a(pr2Var.getClass()).a(pr2Var);
        this.L = true;
        return this.B;
    }

    public final void c() {
        if (this.L) {
            pr2 pr2Var = (pr2) this.B.f(or2.NEW_MUTABLE_INSTANCE);
            pr2 pr2Var2 = this.B;
            y45 y45Var = y45.c;
            y45Var.getClass();
            y45Var.a(pr2Var.getClass()).g(pr2Var, pr2Var2);
            this.B = pr2Var;
            this.L = false;
        }
    }

    public final Object clone() {
        pr2 pr2Var = this.A;
        pr2Var.getClass();
        mr2 mr2Var = (mr2) pr2Var.f(or2.NEW_BUILDER);
        mr2Var.d(b());
        return mr2Var;
    }

    public final void d(pr2 pr2Var) {
        c();
        pr2 pr2Var2 = this.B;
        y45 y45Var = y45.c;
        y45Var.getClass();
        y45Var.a(pr2Var2.getClass()).g(pr2Var2, pr2Var);
    }
}
