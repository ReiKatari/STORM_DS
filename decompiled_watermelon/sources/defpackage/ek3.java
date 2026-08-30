package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ek3  reason: default package */
/* loaded from: classes.dex */
public final class ek3 extends hi2 {
    public final sh d = new sh();

    public ek3(mi2 mi2Var) {
        mi2Var.n(this);
    }

    public static void a0(ek3 ek3Var, String str, String str2, et0 et0Var, int i) {
        dk3 dk3Var = null;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        sh shVar = ek3Var.d;
        if (str != null) {
            dk3Var = new dk3(0, str);
        }
        shVar.a(1, new ck3(dk3Var, new dk3(1, str2), new et0(-857469575, true, new oh3(et0Var, 1))));
    }

    public final void b0(int i, mi2 mi2Var, mi2 mi2Var2, et0 et0Var) {
        this.d.a(i, new ck3(mi2Var, mi2Var2, et0Var));
    }

    @Override // defpackage.hi2
    public final sh u() {
        return this.d;
    }
}
