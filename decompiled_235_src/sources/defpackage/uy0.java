package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uy0  reason: default package */
/* loaded from: classes.dex */
public abstract class uy0 {
    public static final gr1 a = new gr1("CLOSED", 9);

    public static final Object a(p96 p96Var, long j, eo2 eo2Var) {
        while (true) {
            if (p96Var.X >= j && !p96Var.g()) {
                return p96Var;
            }
            Object e = p96Var.e();
            gr1 gr1Var = a;
            if (e == gr1Var) {
                return gr1Var;
            }
            p96 p96Var2 = (p96) ((vy0) e);
            if (p96Var2 == null) {
                p96Var2 = (p96) eo2Var.o(Long.valueOf(p96Var.X + 1), p96Var);
                if (p96Var.j(p96Var2)) {
                    if (p96Var.g()) {
                        p96Var.i();
                    }
                }
            }
            p96Var = p96Var2;
        }
    }
}
