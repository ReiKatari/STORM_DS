package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qb0  reason: default package */
/* loaded from: classes.dex */
public final class qb0 {
    public Object a;
    public tb0 b;
    public hl5 c;
    public boolean d;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Object obj) {
        boolean z = true;
        this.d = true;
        tb0 tb0Var = this.b;
        if (tb0Var != null) {
            sb0 sb0Var = tb0Var.B;
            sb0Var.getClass();
            if (obj == null) {
                obj = r1.Z;
            }
            if (r1.Y.n(sb0Var, null, obj)) {
                r1.c(sb0Var);
                if (z) {
                    this.a = null;
                    this.b = null;
                    this.c = null;
                }
                return z;
            }
        }
        z = false;
        if (z) {
        }
        return z;
    }

    public final void b() {
        this.d = true;
        tb0 tb0Var = this.b;
        if (tb0Var != null && tb0Var.B.cancel(true)) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    public final boolean c(Throwable th) {
        boolean z = true;
        this.d = true;
        tb0 tb0Var = this.b;
        z = (tb0Var == null || !tb0Var.B.i(th)) ? false : false;
        if (z) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }

    public final void finalize() {
        hl5 hl5Var;
        tb0 tb0Var = this.b;
        if (tb0Var != null && !tb0Var.B.isDone()) {
            tb0Var.b(new l1("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, 1));
        }
        if (!this.d && (hl5Var = this.c) != null) {
            hl5Var.j(null);
        }
    }
}
