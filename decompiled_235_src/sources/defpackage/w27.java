package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w27  reason: default package */
/* loaded from: classes.dex */
public final class w27 {
    public kk3 a;
    public qh1 b;
    public ki2 c;
    public s47 d;
    public Object e;
    public final vs4 f = np2.Y(Boolean.TRUE);
    public long g;

    public w27(kk3 kk3Var, qh1 qh1Var, ki2 ki2Var, s47 s47Var, Object obj) {
        long a;
        this.a = kk3Var;
        this.b = qh1Var;
        this.c = ki2Var;
        this.d = s47Var;
        this.e = obj;
        a = l17.a(this.d, this.b, this.c, l17.a, 1);
        this.g = a;
    }

    public static void a(w27 w27Var, kk3 kk3Var, qh1 qh1Var, s47 s47Var, int i) {
        if ((i & 1) != 0) {
            kk3Var = w27Var.a;
        }
        if ((i & 2) != 0) {
            qh1Var = w27Var.b;
        }
        ki2 ki2Var = w27Var.c;
        if ((i & 8) != 0) {
            s47Var = w27Var.d;
        }
        Object obj = w27Var.e;
        kk3 kk3Var2 = w27Var.a;
        vs4 vs4Var = w27Var.f;
        if (kk3Var == kk3Var2 && nb3.k(qh1Var, w27Var.b) && nb3.k(ki2Var, w27Var.c) && nb3.k(s47Var, w27Var.d)) {
            if (!nb3.k(obj, w27Var.e)) {
                w27Var.e = obj;
                vs4Var.setValue(Boolean.TRUE);
                return;
            }
            return;
        }
        w27Var.a = kk3Var;
        w27Var.b = qh1Var;
        w27Var.c = ki2Var;
        w27Var.d = s47Var;
        vs4Var.setValue(Boolean.TRUE);
    }
}
