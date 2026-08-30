package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vu  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vu implements kl2 {
    public static final vu a;
    private static final h06 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [kl2, java.lang.Object, vu] */
    static {
        ?? obj = new Object();
        a = obj;
        hp4 hp4Var = new hp4("me.magnum.melonds.github.dtos.AssetDto", obj, 5);
        hp4Var.l("id", true);
        hp4Var.l("browser_download_url", true);
        hp4Var.l("name", true);
        hp4Var.l("size", true);
        hp4Var.l("content_type", true);
        descriptor = hp4Var;
    }

    @Override // defpackage.kl2
    public final m93[] a() {
        as3 as3Var = as3.a;
        yg6 yg6Var = yg6.a;
        return new m93[]{as3Var, yg6Var, yg6Var, as3Var, yg6Var};
    }

    @Override // defpackage.m93
    public final Object b(b91 b91Var) {
        h06 h06Var = descriptor;
        yu0 c = b91Var.c(h06Var);
        c.getClass();
        int i = 0;
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z = true;
        while (z) {
            int v = c.v(h06Var);
            if (v != -1) {
                if (v != 0) {
                    if (v != 1) {
                        if (v != 2) {
                            if (v != 3) {
                                if (v == 4) {
                                    str3 = c.K(h06Var, 4);
                                    i |= 16;
                                } else {
                                    throw new q27(v);
                                }
                            } else {
                                j2 = c.a0(h06Var, 3);
                                i |= 8;
                            }
                        } else {
                            str2 = c.K(h06Var, 2);
                            i |= 4;
                        }
                    } else {
                        str = c.K(h06Var, 1);
                        i |= 2;
                    }
                } else {
                    j = c.a0(h06Var, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        c.a(h06Var);
        return new xu(i, j, str, str2, j2, str3);
    }

    @Override // defpackage.m93
    public final void d(mz1 mz1Var, Object obj) {
        xu xuVar = (xu) obj;
        xuVar.getClass();
        String str = xuVar.e;
        long j = xuVar.d;
        String str2 = xuVar.c;
        String str3 = xuVar.b;
        long j2 = xuVar.a;
        h06 h06Var = descriptor;
        zu0 c = mz1Var.c(h06Var);
        if (c.k(h06Var) || j2 != 0) {
            c.r(h06Var, 0, j2);
        }
        if (c.k(h06Var) || !b53.x(str3, "")) {
            c.z(h06Var, 1, str3);
        }
        if (c.k(h06Var) || !b53.x(str2, "")) {
            c.z(h06Var, 2, str2);
        }
        if (c.k(h06Var) || j != 0) {
            c.r(h06Var, 3, j);
        }
        if (c.k(h06Var) || !b53.x(str, "")) {
            c.z(h06Var, 4, str);
        }
        c.a(h06Var);
    }

    @Override // defpackage.m93
    public final h06 e() {
        return descriptor;
    }
}
