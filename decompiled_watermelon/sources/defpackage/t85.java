package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t85  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class t85 implements kl2 {
    public static final t85 a;
    private static final h06 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [t85, kl2, java.lang.Object] */
    static {
        ?? obj = new Object();
        a = obj;
        hp4 hp4Var = new hp4("me.magnum.melonds.github.dtos.ReleaseDto", obj, 9);
        hp4Var.l("tag_name", true);
        hp4Var.l("name", true);
        hp4Var.l("body", true);
        hp4Var.l("created_at", true);
        hp4Var.l("published_at", true);
        hp4Var.l("html_url", true);
        hp4Var.l("draft", true);
        hp4Var.l("prerelease", true);
        hp4Var.l("assets", true);
        descriptor = hp4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kl2
    public final m93[] a() {
        gh3[] gh3VarArr = v85.j;
        yg6 yg6Var = yg6.a;
        w30 w30Var = w30.a;
        return new m93[]{yg6Var, yg6Var, yg6Var, l07.R(yg6Var), l07.R(yg6Var), yg6Var, w30Var, w30Var, gh3VarArr[8].getValue()};
    }

    @Override // defpackage.m93
    public final Object b(b91 b91Var) {
        h06 h06Var = descriptor;
        yu0 c = b91Var.c(h06Var);
        gh3[] gh3VarArr = v85.j;
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
            int v = c.v(h06Var);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = c.K(h06Var, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = c.K(h06Var, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = c.K(h06Var, 2);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) c.u(h06Var, 3, yg6.a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) c.u(h06Var, 4, yg6.a, str5);
                    i |= 16;
                    break;
                case 5:
                    str6 = c.K(h06Var, 5);
                    i |= 32;
                    break;
                case ig7.b /* 6 */:
                    z2 = c.O(h06Var, 6);
                    i |= 64;
                    break;
                case 7:
                    z3 = c.O(h06Var, 7);
                    i |= 128;
                    break;
                case 8:
                    list = (List) c.U(h06Var, 8, (m93) gh3VarArr[8].getValue(), list);
                    i |= 256;
                    break;
                default:
                    throw new q27(v);
            }
        }
        c.a(h06Var);
        return new v85(i, str, str2, str3, str4, str5, str6, z2, z3, list);
    }

    @Override // defpackage.m93
    public final void d(mz1 mz1Var, Object obj) {
        v85 v85Var = (v85) obj;
        v85Var.getClass();
        List list = v85Var.i;
        boolean z = v85Var.h;
        boolean z2 = v85Var.g;
        String str = v85Var.f;
        String str2 = v85Var.e;
        String str3 = v85Var.d;
        String str4 = v85Var.c;
        String str5 = v85Var.b;
        String str6 = v85Var.a;
        h06 h06Var = descriptor;
        zu0 c = mz1Var.c(h06Var);
        gh3[] gh3VarArr = v85.j;
        if (c.k(h06Var) || !b53.x(str6, "")) {
            c.z(h06Var, 0, str6);
        }
        if (c.k(h06Var) || !b53.x(str5, "")) {
            c.z(h06Var, 1, str5);
        }
        if (c.k(h06Var) || !b53.x(str4, "")) {
            c.z(h06Var, 2, str4);
        }
        if (c.k(h06Var) || str3 != null) {
            c.N(h06Var, 3, yg6.a, str3);
        }
        if (c.k(h06Var) || str2 != null) {
            c.N(h06Var, 4, yg6.a, str2);
        }
        if (c.k(h06Var) || !b53.x(str, "")) {
            c.z(h06Var, 5, str);
        }
        if (c.k(h06Var) || z2) {
            c.A(h06Var, 6, z2);
        }
        if (c.k(h06Var) || z) {
            c.A(h06Var, 7, z);
        }
        if (c.k(h06Var) || !b53.x(list, pp1.A)) {
            c.F(h06Var, 8, (m93) gh3VarArr[8].getValue(), list);
        }
        c.a(h06Var);
    }

    @Override // defpackage.m93
    public final h06 e() {
        return descriptor;
    }
}
