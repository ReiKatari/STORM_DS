package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j37  reason: default package */
/* loaded from: classes.dex */
public final class j37 {
    public final vs4 a = np2.Y(Boolean.FALSE);
    public final vs4 b = np2.Y(new c37((String) null, 7, 0));
    public final vs4 c = np2.Y(new xh3(0, 0, 7, 119));
    public final vs4 d = np2.Y(null);
    public final vs4 e = np2.Y(null);

    public static void c(j37 j37Var, String str, qn2 qn2Var) {
        c5 c5Var = new c5(17);
        xh3 xh3Var = new xh3(0, 0, 7, 119);
        j37Var.getClass();
        str.getClass();
        vs4 vs4Var = j37Var.a;
        if (((Boolean) vs4Var.getValue()).booleanValue()) {
            return;
        }
        int length = str.length();
        j37Var.b.setValue(new c37(str, 4, jx2.f(length, length)));
        j37Var.d.setValue(qn2Var);
        j37Var.e.setValue(c5Var);
        j37Var.c.setValue(xh3Var);
        vs4Var.setValue(Boolean.TRUE);
    }

    public final void a() {
        this.a.setValue(Boolean.FALSE);
        vs4 vs4Var = this.e;
        on2 on2Var = (on2) vs4Var.getValue();
        if (on2Var != null) {
            on2Var.c();
        }
        this.d.setValue(null);
        vs4Var.setValue(null);
    }

    public final void b() {
        vs4 vs4Var = this.d;
        qn2 qn2Var = (qn2) vs4Var.getValue();
        if (qn2Var != null) {
            qn2Var.g(((c37) this.b.getValue()).a.B);
        }
        this.a.setValue(Boolean.FALSE);
        vs4Var.setValue(null);
        this.e.setValue(null);
    }
}
