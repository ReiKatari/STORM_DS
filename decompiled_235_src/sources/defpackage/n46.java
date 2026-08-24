package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n46  reason: default package */
/* loaded from: classes.dex */
public final class n46 implements bj5 {
    public j56 A;
    public q46 B;
    public String L;
    public Object R;
    public Object[] X;
    public m44 Y;
    public final er2 Z = new er2(this, 29);

    public n46(j56 j56Var, q46 q46Var, String str, Object obj, Object[] objArr) {
        this.A = j56Var;
        this.B = q46Var;
        this.L = str;
        this.R = obj;
        this.X = objArr;
    }

    @Override // defpackage.bj5
    public final void a() {
        m44 m44Var = this.Y;
        if (m44Var != null) {
            m44Var.I();
        }
    }

    @Override // defpackage.bj5
    public final void b() {
        m44 m44Var = this.Y;
        if (m44Var != null) {
            m44Var.I();
        }
    }

    @Override // defpackage.bj5
    public final void c() {
        d();
    }

    public final void d() {
        String z;
        q46 q46Var = this.B;
        if (this.Y == null) {
            if (q46Var != null) {
                er2 er2Var = this.Z;
                Object c = er2Var.c();
                if (c != null && !q46Var.c(c)) {
                    if (c instanceof gm6) {
                        gm6 gm6Var = (gm6) c;
                        if (gm6Var.d() != vs0.j0 && gm6Var.d() != xd5.s0 && gm6Var.d() != vs0.s0) {
                            z = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                        } else {
                            z = "MutableState containing " + gm6Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                        }
                    } else {
                        z = qo2.z(c);
                    }
                    throw new IllegalArgumentException(z);
                }
                this.Y = q46Var.a(this.L, er2Var);
                return;
            }
            return;
        }
        u34.A(this.Y, ") is not null", "entry(");
    }
}
