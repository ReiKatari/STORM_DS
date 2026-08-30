package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: it5  reason: default package */
/* loaded from: classes.dex */
public final class it5 implements l95 {
    public du5 A;
    public lt5 B;
    public String L;
    public Object R;
    public Object[] X;
    public n85 Y;
    public final bz2 Z = new bz2(22, this);

    public it5(du5 du5Var, lt5 lt5Var, String str, Object obj, Object[] objArr) {
        this.A = du5Var;
        this.B = lt5Var;
        this.L = str;
        this.R = obj;
        this.X = objArr;
    }

    @Override // defpackage.l95
    public final void a() {
        d();
    }

    @Override // defpackage.l95
    public final void b() {
        n85 n85Var = this.Y;
        if (n85Var != null) {
            n85Var.x();
        }
    }

    @Override // defpackage.l95
    public final void c() {
        n85 n85Var = this.Y;
        if (n85Var != null) {
            n85Var.x();
        }
    }

    public final void d() {
        String t;
        lt5 lt5Var = this.B;
        if (this.Y == null) {
            if (lt5Var != null) {
                bz2 bz2Var = this.Z;
                Object c = bz2Var.c();
                if (c != null && !lt5Var.c(c)) {
                    if (c instanceof ra6) {
                        ra6 ra6Var = (ra6) c;
                        if (ra6Var.e() != k45.f0 && ra6Var.e() != k45.n0 && ra6Var.e() != sn1.q0) {
                            t = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                        } else {
                            t = "MutableState containing " + ra6Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                        }
                    } else {
                        t = jk2.t(c);
                    }
                    throw new IllegalArgumentException(t);
                }
                this.Y = lt5Var.a(this.L, bz2Var);
                return;
            }
            return;
        }
        c44.t(this.Y, ") is not null", "entry(");
    }
}
