package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nw5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nw5 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ rw5 B;

    public /* synthetic */ nw5(rw5 rw5Var, int i) {
        this.A = i;
        this.B = rw5Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        rw5 rw5Var = this.B;
        switch (i) {
            case 0:
                return Boolean.valueOf(rw5Var.i0);
            default:
                ed2 ed2Var = rw5Var.K0;
                if (!ed2Var.A.i0) {
                    return null;
                }
                bd2 W0 = ed2Var.W0();
                if (!W0.getHasFocus()) {
                    return null;
                }
                if (W0.isFocused()) {
                    return ed2Var.U0(null);
                }
                ed2 f = ((nc2) ((ee) l.Q(ed2Var)).getFocusOwner()).f();
                if (f == null) {
                    return null;
                }
                return f.U0(l.O(ed2Var));
        }
    }
}
