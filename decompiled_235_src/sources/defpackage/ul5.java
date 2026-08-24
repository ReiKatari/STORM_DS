package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ul5  reason: default package */
/* loaded from: classes.dex */
public final class ul5 {
    public pa a;
    public k55 b;
    public String d;
    public pv2 e;
    public rm6 h;
    public wl5 i;
    public wl5 j;
    public wl5 k;
    public long l;
    public long m;
    public bk1 n;
    public int c = -1;
    public yl5 g = yl5.A;
    public a97 o = a97.F;
    public ww2 f = new ww2(0, (byte) 0);

    public static void b(String str, wl5 wl5Var) {
        if (wl5Var != null) {
            if (wl5Var.e0 == null) {
                if (wl5Var.f0 == null) {
                    if (wl5Var.g0 != null) {
                        i.f(str.concat(".priorResponse != null"));
                        return;
                    }
                    return;
                }
                i.f(str.concat(".cacheResponse != null"));
                return;
            }
            i.f(str.concat(".networkResponse != null"));
        }
    }

    public final wl5 a() {
        int i = this.c;
        if (i >= 0) {
            pa paVar = this.a;
            if (paVar != null) {
                k55 k55Var = this.b;
                if (k55Var != null) {
                    String str = this.d;
                    if (str != null) {
                        return new wl5(paVar, k55Var, str, i, this.e, this.f.f(), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
                    }
                    i.m("message == null");
                    return null;
                }
                i.m("protocol == null");
                return null;
            }
            i.m("request == null");
            return null;
        }
        u34.u(this.c, "code < 0: ");
        return null;
    }
}
