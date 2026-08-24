package defpackage;

import java.nio.charset.Charset;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bk7  reason: default package */
/* loaded from: classes.dex */
public abstract class bk7 {
    public static final /* synthetic */ int a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static ni3 a(ii3 ii3Var) {
        ki3 p = ni3.p();
        int r = ii3Var.r();
        p.c();
        ni3.m((ni3) p.B, r);
        for (hi3 hi3Var : ii3Var.q()) {
            li3 r2 = mi3.r();
            String r3 = hi3Var.q().r();
            r2.c();
            mi3.m((mi3) r2.B, r3);
            hh3 t = hi3Var.t();
            r2.c();
            mi3.o((mi3) r2.B, t);
            jp4 s = hi3Var.s();
            r2.c();
            mi3.n((mi3) r2.B, s);
            int r4 = hi3Var.r();
            r2.c();
            mi3.p((mi3) r2.B, r4);
            p.c();
            ni3.n((ni3) p.B, (mi3) r2.a());
        }
        return (ni3) p.a();
    }
}
