package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cc5  reason: default package */
/* loaded from: classes.dex */
public final class cc5 {
    public ka a;
    public dw4 b;
    public String d;
    public op2 e;
    public cb6 h;
    public ec5 i;
    public ec5 j;
    public ec5 k;
    public long l;
    public long m;
    public xf1 n;
    public int c = -1;
    public gc5 g = gc5.A;
    public nw6 o = nw6.E;
    public vq2 f = new vq2(0, (byte) 0);

    public static void b(String str, ec5 ec5Var) {
        if (ec5Var != null) {
            if (ec5Var.d0 == null) {
                if (ec5Var.e0 == null) {
                    if (ec5Var.f0 != null) {
                        i.g(str.concat(".priorResponse != null"));
                        return;
                    }
                    return;
                }
                i.g(str.concat(".cacheResponse != null"));
                return;
            }
            i.g(str.concat(".networkResponse != null"));
        }
    }

    public final ec5 a() {
        int i = this.c;
        if (i >= 0) {
            ka kaVar = this.a;
            if (kaVar != null) {
                dw4 dw4Var = this.b;
                if (dw4Var != null) {
                    String str = this.d;
                    if (str != null) {
                        return new ec5(kaVar, dw4Var, str, i, this.e, this.f.f(), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
                    }
                    i.n("message == null");
                    return null;
                }
                i.n("protocol == null");
                return null;
            }
            i.n("request == null");
            return null;
        }
        c44.s(this.c, "code < 0: ");
        return null;
    }
}
