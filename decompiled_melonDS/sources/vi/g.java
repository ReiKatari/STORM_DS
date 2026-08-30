package vi;

import a0.j;
import fj.a0;
import fj.e0;
import fj.f0;
import fj.g0;
import fj.z;
import h1.c3;
import j0.o1;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import m9.o;
import p1.c1;
import p7.m;
import p7.t;
import pi.c0;
import pi.d0;
import pi.q;
import pi.r;
import pi.x;
import w.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g implements ui.e {

    /* renamed from: f  reason: collision with root package name */
    public static final q f13837f;

    /* renamed from: a  reason: collision with root package name */
    public final x f13838a;

    /* renamed from: b  reason: collision with root package name */
    public final ui.d f13839b;

    /* renamed from: c  reason: collision with root package name */
    public final c1 f13840c;

    /* renamed from: d  reason: collision with root package name */
    public int f13841d;

    /* renamed from: e  reason: collision with root package name */
    public final c3 f13842e;

    static {
        q qVar = q.B;
        f13837f = m.B("OkHttp-Response-Body", "Truncated");
    }

    public g(x xVar, ui.d dVar, c1 c1Var) {
        c1Var.getClass();
        this.f13838a = xVar;
        this.f13839b = dVar;
        this.f13840c = c1Var;
        this.f13842e = new c3((a0) c1Var.B);
    }

    @Override // ui.e
    public final long a(d0 d0Var) {
        if (!ui.f.a(d0Var)) {
            return 0L;
        }
        String a10 = d0Var.Y.a("Transfer-Encoding");
        if (a10 == null) {
            a10 = null;
        }
        if ("chunked".equalsIgnoreCase(a10)) {
            return -1L;
        }
        return qi.g.d(d0Var);
    }

    @Override // ui.e
    public final e0 b(x0 x0Var, long j2) {
        x0Var.getClass();
        if ("chunked".equalsIgnoreCase(((q) x0Var.f14091d).a("Transfer-Encoding"))) {
            if (this.f13841d == 1) {
                this.f13841d = 2;
                return new b(this);
            }
            o.f(this.f13841d, "state: ");
            return null;
        } else if (j2 != -1) {
            if (this.f13841d == 1) {
                this.f13841d = 2;
                return new e(this);
            }
            o.f(this.f13841d, "state: ");
            return null;
        } else {
            j.p("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
    }

    @Override // ui.e
    public final g0 c(d0 d0Var) {
        x0 x0Var = d0Var.A;
        if (!ui.f.a(d0Var)) {
            return k((r) x0Var.f14089b, 0L);
        }
        String a10 = d0Var.Y.a("Transfer-Encoding");
        if (a10 == null) {
            a10 = null;
        }
        if ("chunked".equalsIgnoreCase(a10)) {
            r rVar = (r) x0Var.f14089b;
            if (this.f13841d == 4) {
                this.f13841d = 5;
                return new c(this, rVar);
            }
            o.f(this.f13841d, "state: ");
            return null;
        }
        long d4 = qi.g.d(d0Var);
        if (d4 != -1) {
            return k((r) x0Var.f14089b, d4);
        }
        r rVar2 = (r) x0Var.f14089b;
        if (this.f13841d == 4) {
            this.f13841d = 5;
            this.f13839b.h();
            rVar2.getClass();
            return new a(this, rVar2);
        }
        o.f(this.f13841d, "state: ");
        return null;
    }

    @Override // ui.e
    public final void cancel() {
        this.f13839b.cancel();
    }

    @Override // ui.e
    public final void d() {
        ((z) this.f13840c.L).flush();
    }

    @Override // ui.e
    public final boolean e() {
        if (this.f13841d == 6) {
            return true;
        }
        return false;
    }

    @Override // ui.e
    public final void f() {
        ((z) this.f13840c.L).flush();
    }

    @Override // ui.e
    public final f0 g() {
        return this.f13840c;
    }

    @Override // ui.e
    public final ui.d h() {
        return this.f13839b;
    }

    @Override // ui.e
    public final void i(x0 x0Var) {
        x0Var.getClass();
        Proxy.Type type = this.f13839b.e().f11726b.type();
        type.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((String) x0Var.f14090c);
        sb2.append(' ');
        r rVar = (r) x0Var.f14089b;
        if (!rVar.f() && type == Proxy.Type.HTTP) {
            sb2.append(rVar);
        } else {
            String b10 = rVar.b();
            String d4 = rVar.d();
            if (d4 != null) {
                b10 = b10 + '?' + d4;
            }
            sb2.append(b10);
        }
        sb2.append(" HTTP/1.1");
        l((q) x0Var.f14091d, sb2.toString());
    }

    @Override // ui.e
    public final c0 j(boolean z10) {
        c3 c3Var = this.f13842e;
        int i2 = this.f13841d;
        if (i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3) {
            o.f(this.f13841d, "state: ");
            return null;
        }
        try {
            String D = ((fj.g) c3Var.f5883c).D(c3Var.f5882b);
            c3Var.f5882b -= D.length();
            c8.c0 D2 = t.D(D);
            int i10 = D2.f2624b;
            c0 c0Var = new c0();
            pi.z zVar = (pi.z) D2.f2625c;
            zVar.getClass();
            c0Var.f11676b = zVar;
            c0Var.f11677c = i10;
            c0Var.f11678d = (String) D2.f2626d;
            o1 o1Var = new o1(3, false);
            while (true) {
                String D3 = ((fj.g) c3Var.f5883c).D(c3Var.f5882b);
                c3Var.f5882b -= D3.length();
                if (D3.length() == 0) {
                    break;
                }
                o1Var.c(D3);
            }
            c0Var.f11680f = o1Var.f().c();
            if (z10 && i10 == 100) {
                return null;
            }
            if (i10 == 100) {
                this.f13841d = 3;
                return c0Var;
            } else if (102 <= i10 && i10 < 200) {
                this.f13841d = 3;
                return c0Var;
            } else {
                this.f13841d = 4;
                return c0Var;
            }
        } catch (EOFException e6) {
            throw new IOException("unexpected end of stream on ".concat(this.f13839b.e().f11725a.f11665h.g()), e6);
        }
    }

    public final d k(r rVar, long j2) {
        if (this.f13841d == 4) {
            this.f13841d = 5;
            return new d(this, rVar, j2);
        }
        o.f(this.f13841d, "state: ");
        return null;
    }

    public final void l(q qVar, String str) {
        qVar.getClass();
        if (this.f13841d == 0) {
            c1 c1Var = this.f13840c;
            z zVar = (z) c1Var.L;
            zVar.P(str);
            zVar.P("\r\n");
            int size = qVar.size();
            int i2 = 0;
            while (true) {
                z zVar2 = (z) c1Var.L;
                if (i2 < size) {
                    zVar2.P(qVar.b(i2));
                    zVar2.P(": ");
                    zVar2.P(qVar.d(i2));
                    zVar2.P("\r\n");
                    i2++;
                } else {
                    zVar2.P("\r\n");
                    this.f13841d = 1;
                    return;
                }
            }
        } else {
            o.f(this.f13841d, "state: ");
        }
    }
}
