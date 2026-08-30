package pi;

import j0.o1;
import w.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public x0 f11675a;

    /* renamed from: b  reason: collision with root package name */
    public z f11676b;

    /* renamed from: d  reason: collision with root package name */
    public String f11678d;

    /* renamed from: e  reason: collision with root package name */
    public p f11679e;

    /* renamed from: h  reason: collision with root package name */
    public fj.f0 f11682h;

    /* renamed from: i  reason: collision with root package name */
    public d0 f11683i;

    /* renamed from: j  reason: collision with root package name */
    public d0 f11684j;

    /* renamed from: k  reason: collision with root package name */
    public d0 f11685k;

    /* renamed from: l  reason: collision with root package name */
    public long f11686l;
    public long m;

    /* renamed from: n  reason: collision with root package name */
    public e9.a f11687n;

    /* renamed from: c  reason: collision with root package name */
    public int f11677c = -1;

    /* renamed from: g  reason: collision with root package name */
    public g0 f11681g = g0.B;

    /* renamed from: o  reason: collision with root package name */
    public k0 f11688o = k0.f11750a;

    /* renamed from: f  reason: collision with root package name */
    public o1 f11680f = new o1(3, false);

    public static void b(String str, d0 d0Var) {
        if (d0Var != null) {
            if (d0Var.f11702c0 == null) {
                if (d0Var.f11703d0 == null) {
                    if (d0Var.f11704e0 != null) {
                        a0.j.e(str.concat(".priorResponse != null"));
                        return;
                    }
                    return;
                }
                a0.j.e(str.concat(".cacheResponse != null"));
                return;
            }
            a0.j.e(str.concat(".networkResponse != null"));
        }
    }

    public final d0 a() {
        int i2 = this.f11677c;
        if (i2 >= 0) {
            x0 x0Var = this.f11675a;
            if (x0Var != null) {
                z zVar = this.f11676b;
                if (zVar != null) {
                    String str = this.f11678d;
                    if (str != null) {
                        return new d0(x0Var, zVar, str, i2, this.f11679e, this.f11680f.f(), this.f11681g, this.f11682h, this.f11683i, this.f11684j, this.f11685k, this.f11686l, this.m, this.f11687n, this.f11688o);
                    }
                    a0.j.p("message == null");
                    return null;
                }
                a0.j.p("protocol == null");
                return null;
            }
            a0.j.p("request == null");
            return null;
        }
        m9.o.f(this.f11677c, "code < 0: ");
        return null;
    }
}
