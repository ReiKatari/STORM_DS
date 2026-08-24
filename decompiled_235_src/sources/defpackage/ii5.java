package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ii5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ii5 implements qr2 {
    public static final ii5 a;
    private static final wb6 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [qr2, ii5, java.lang.Object] */
    static {
        ?? obj = new Object();
        a = obj;
        ly4 ly4Var = new ly4("me.magnum.melonds.github.dtos.ReleaseDto", obj, 9);
        ly4Var.l("tag_name", true);
        ly4Var.l("name", true);
        ly4Var.l("body", true);
        ly4Var.l("created_at", true);
        ly4Var.l("published_at", true);
        ly4Var.l("html_url", true);
        ly4Var.l("draft", true);
        ly4Var.l("prerelease", true);
        ly4Var.l("assets", true);
        descriptor = ly4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qr2
    public final gg3[] b() {
        go3[] go3VarArr = ki5.j;
        ps6 ps6Var = ps6.a;
        u50 u50Var = u50.a;
        return new gg3[]{ps6Var, ps6Var, ps6Var, q60.I(ps6Var), q60.I(ps6Var), ps6Var, u50Var, u50Var, go3VarArr[8].getValue()};
    }

    @Override // defpackage.gg3
    public final Object c(sc1 sc1Var) {
        wb6 wb6Var = descriptor;
        ux0 c = sc1Var.c(wb6Var);
        go3[] go3VarArr = ki5.j;
        c.getClass();
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (z) {
            int q = c.q(wb6Var);
            switch (q) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = c.A(wb6Var, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = c.A(wb6Var, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = c.A(wb6Var, 2);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) c.P(wb6Var, 3, ps6.a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) c.P(wb6Var, 4, ps6.a, str5);
                    i |= 16;
                    break;
                case 5:
                    str6 = c.A(wb6Var, 5);
                    i |= 32;
                    break;
                case 6:
                    z2 = c.W(wb6Var, 6);
                    i |= 64;
                    break;
                case 7:
                    z3 = c.W(wb6Var, 7);
                    i |= 128;
                    break;
                case 8:
                    list = (List) c.G(wb6Var, 8, (gg3) go3VarArr[8].getValue(), list);
                    i |= 256;
                    break;
                default:
                    throw new lg7(q);
            }
        }
        c.a(wb6Var);
        return new ki5(i, str, str2, str3, str4, str5, str6, z2, z3, list);
    }

    @Override // defpackage.gg3
    public final void d(x32 x32Var, Object obj) {
        ki5 ki5Var = (ki5) obj;
        ki5Var.getClass();
        List list = ki5Var.i;
        boolean z = ki5Var.h;
        boolean z2 = ki5Var.g;
        String str = ki5Var.f;
        String str2 = ki5Var.e;
        String str3 = ki5Var.d;
        String str4 = ki5Var.c;
        String str5 = ki5Var.b;
        String str6 = ki5Var.a;
        wb6 wb6Var = descriptor;
        vx0 c = x32Var.c(wb6Var);
        go3[] go3VarArr = ki5.j;
        if (c.i(wb6Var) || !nb3.k(str6, "")) {
            c.Q(wb6Var, 0, str6);
        }
        if (c.i(wb6Var) || !nb3.k(str5, "")) {
            c.Q(wb6Var, 1, str5);
        }
        if (c.i(wb6Var) || !nb3.k(str4, "")) {
            c.Q(wb6Var, 2, str4);
        }
        if (c.i(wb6Var) || str3 != null) {
            c.V(wb6Var, 3, ps6.a, str3);
        }
        if (c.i(wb6Var) || str2 != null) {
            c.V(wb6Var, 4, ps6.a, str2);
        }
        if (c.i(wb6Var) || !nb3.k(str, "")) {
            c.Q(wb6Var, 5, str);
        }
        if (c.i(wb6Var) || z2) {
            c.u(wb6Var, 6, z2);
        }
        if (c.i(wb6Var) || z) {
            c.u(wb6Var, 7, z);
        }
        if (c.i(wb6Var) || !nb3.k(list, yt1.A)) {
            c.w(wb6Var, 8, (gg3) go3VarArr[8].getValue(), list);
        }
        c.a(wb6Var);
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        return descriptor;
    }
}
