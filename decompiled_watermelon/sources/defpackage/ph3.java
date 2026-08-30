package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ph3  reason: default package */
/* loaded from: classes.dex */
public final class ph3 extends hi2 {
    public static final qt0 g = new qt0(14);
    public final fi3 d = new fi3(this);
    public final sh e = new sh();
    public boolean f;

    public ph3(mi2 mi2Var) {
        mi2Var.n(this);
    }

    public static void a0(ph3 ph3Var, String str, mi2 mi2Var, et0 et0Var, int i) {
        aj2 aj2Var;
        if ((i & 2) != 0) {
            mi2Var = null;
        }
        sh shVar = ph3Var.e;
        dk3 dk3Var = new dk3(0, str);
        if (mi2Var != null) {
            aj2Var = new nh3(0, mi2Var);
        } else {
            aj2Var = g;
        }
        shVar.a(1, new mh3(dk3Var, aj2Var, new qu1(29), new et0(-291643851, true, new oh3(et0Var, 0))));
        if (mi2Var != null) {
            ph3Var.f = true;
        }
    }

    public final void b0(int i, mi2 mi2Var, mi2 mi2Var2, et0 et0Var) {
        this.e.a(i, new mh3(mi2Var, g, mi2Var2, et0Var));
    }

    @Override // defpackage.hi2
    public final sh u() {
        return this.e;
    }
}
