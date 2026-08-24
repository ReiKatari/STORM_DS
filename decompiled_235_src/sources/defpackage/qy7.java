package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qy7  reason: default package */
/* loaded from: classes.dex */
public final class qy7 implements gi7 {
    public final oy7 a;
    public final float b;
    public final float c;
    public final ex6 d = new ex6(new on2(this) { // from class: py7
        public final /* synthetic */ qy7 B;

        {
            this.B = this;
        }

        @Override // defpackage.on2
        public final Object c() {
            int i = r2;
            qy7 qy7Var = this.B;
            switch (i) {
                case 0:
                    return new ry7(qy7Var.b, qy7Var.c);
                default:
                    return new qx3((ry7) qy7Var.d.getValue());
            }
        }
    });
    public final ex6 e = new ex6(new on2(this) { // from class: py7
        public final /* synthetic */ qy7 B;

        {
            this.B = this;
        }

        @Override // defpackage.on2
        public final Object c() {
            int i = r2;
            qy7 qy7Var = this.B;
            switch (i) {
                case 0:
                    return new ry7(qy7Var.b, qy7Var.c);
                default:
                    return new qx3((ry7) qy7Var.d.getValue());
            }
        }
    });
    public boolean f;
    public li7 g;
    public tu0 h;

    public qy7(oy7 oy7Var) {
        this.a = oy7Var;
        this.b = oy7Var.c();
        this.c = oy7Var.a();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, qb0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [hl5, java.lang.Object] */
    public final gx3 a(ry7 ry7Var, boolean z, boolean z2) {
        jg1 d;
        ry7Var.getClass();
        tu0 tu0Var = new tu0();
        tu0 tu0Var2 = this.h;
        if (tu0Var2 != null) {
            if (z) {
                i61.A("Cancelled due to another zoom value being set.", tu0Var2);
            } else {
                nc1.a0(tu0Var, tu0Var2);
            }
        }
        this.h = tu0Var;
        boolean x = nj2.x();
        ex6 ex6Var = this.e;
        if (x) {
            ((s94) ex6Var.getValue()).f(ry7Var);
        } else {
            ((s94) ex6Var.getValue()).g(ry7Var);
        }
        li7 li7Var = this.g;
        if (li7Var != null) {
            oy7 oy7Var = this.a;
            if (z2) {
                d = oy7Var.e(li7Var);
            } else {
                d = oy7Var.d(li7Var);
            }
            nc1.a0(d, tu0Var);
        } else {
            i61.A("Camera is not active.", tu0Var);
        }
        ?? obj = new Object();
        obj.c = new Object();
        tb0 tb0Var = new tb0(obj);
        obj.b = tb0Var;
        obj.a = h61.class;
        try {
            tu0Var.a0(new k0((Object) obj, 17));
            obj.a = "Job.asListenableFuture";
        } catch (Exception e) {
            tb0Var.b(e);
        }
        return l.F(tb0Var);
    }

    @Override // defpackage.gi7
    public final void b(li7 li7Var) {
        boolean z;
        this.g = li7Var;
        ry7 ry7Var = (ry7) ((s94) this.e.getValue()).c();
        if (ry7Var == null) {
            ry7Var = (ry7) this.d.getValue();
        }
        if (!this.f) {
            ry7Var.getClass();
            z = false;
        } else {
            z = true;
        }
        a(ry7Var, false, z);
        this.f = true;
    }

    @Override // defpackage.gi7
    public final void reset() {
        a((ry7) this.d.getValue(), true, true);
    }
}
