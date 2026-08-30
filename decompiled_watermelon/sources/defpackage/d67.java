package defpackage;

import java.nio.charset.Charset;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d67  reason: default package */
/* loaded from: classes.dex */
public abstract class d67 {
    public static final /* synthetic */ int a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static vb3 a(qb3 qb3Var) {
        sb3 p = vb3.p();
        int r = qb3Var.r();
        p.c();
        vb3.m((vb3) p.B, r);
        for (pb3 pb3Var : qb3Var.q()) {
            tb3 r2 = ub3.r();
            String r3 = pb3Var.q().r();
            r2.c();
            ub3.m((ub3) r2.B, r3);
            pa3 t = pb3Var.t();
            r2.c();
            ub3.o((ub3) r2.B, t);
            gg4 s = pb3Var.s();
            r2.c();
            ub3.n((ub3) r2.B, s);
            int r4 = pb3Var.r();
            r2.c();
            ub3.p((ub3) r2.B, r4);
            p.c();
            vb3.n((vb3) p.B, (ub3) r2.a());
        }
        return (vb3) p.a();
    }
}
