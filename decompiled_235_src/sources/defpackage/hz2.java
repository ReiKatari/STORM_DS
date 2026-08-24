package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hz2  reason: default package */
/* loaded from: classes.dex */
public final class hz2 implements v62 {
    public static final yw2 f;
    public final xk4 a;
    public final u62 b;
    public final bt c;
    public int d;
    public final kk e;

    static {
        yw2 yw2Var = yw2.B;
        f = ln2.R("OkHttp-Response-Body", "Truncated");
    }

    public hz2(xk4 xk4Var, u62 u62Var, bt btVar) {
        btVar.getClass();
        this.a = xk4Var;
        this.b = u62Var;
        this.c = btVar;
        this.e = new kk((fe5) btVar.L);
    }

    @Override // defpackage.v62
    public final in6 a(wl5 wl5Var) {
        pa paVar = wl5Var.A;
        if (!zz2.a(wl5Var)) {
            return k((i03) paVar.B, 0L);
        }
        String a = wl5Var.Y.a("Transfer-Encoding");
        if (a == null) {
            a = null;
        }
        if ("chunked".equalsIgnoreCase(a)) {
            i03 i03Var = (i03) paVar.B;
            if (this.d == 4) {
                this.d = 5;
                return new ez2(this, i03Var);
            }
            u34.u(this.d, "state: ");
            return null;
        }
        long e = az7.e(wl5Var);
        if (e != -1) {
            return k((i03) paVar.B, e);
        }
        i03 i03Var2 = (i03) paVar.B;
        if (this.d == 4) {
            this.d = 5;
            this.b.e();
            i03Var2.getClass();
            return new cz2(this, i03Var2);
        }
        u34.u(this.d, "state: ");
        return null;
    }

    @Override // defpackage.v62
    public final void b() {
        ((ee5) this.c.R).flush();
    }

    @Override // defpackage.v62
    public final boolean c() {
        if (this.d == 6) {
            return true;
        }
        return false;
    }

    @Override // defpackage.v62
    public final void cancel() {
        this.b.cancel();
    }

    @Override // defpackage.v62
    public final long d(wl5 wl5Var) {
        if (!zz2.a(wl5Var)) {
            return 0L;
        }
        String a = wl5Var.Y.a("Transfer-Encoding");
        if (a == null) {
            a = null;
        }
        if ("chunked".equalsIgnoreCase(a)) {
            return -1L;
        }
        return az7.e(wl5Var);
    }

    @Override // defpackage.v62
    public final ui6 e(pa paVar, long j) {
        paVar.getClass();
        if ("chunked".equalsIgnoreCase(((yw2) paVar.R).a("Transfer-Encoding"))) {
            if (this.d == 1) {
                this.d = 2;
                return new dz2(this);
            }
            u34.u(this.d, "state: ");
            return null;
        } else if (j != -1) {
            if (this.d == 1) {
                this.d = 2;
                return new tg1(this);
            }
            u34.u(this.d, "state: ");
            return null;
        } else {
            i.m("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
    }

    @Override // defpackage.v62
    public final ul5 f(boolean z) {
        kk kkVar = this.e;
        int i = this.d;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            u34.u(this.d, "state: ");
            return null;
        }
        try {
            String y = ((z80) kkVar.L).y(kkVar.B);
            kkVar.B -= y.length();
            ei E = xk2.E(y);
            int i2 = E.B;
            ul5 ul5Var = new ul5();
            k55 k55Var = (k55) E.L;
            k55Var.getClass();
            ul5Var.b = k55Var;
            ul5Var.c = i2;
            ul5Var.d = (String) E.R;
            ww2 ww2Var = new ww2(0, (byte) 0);
            while (true) {
                String y2 = ((z80) kkVar.L).y(kkVar.B);
                kkVar.B -= y2.length();
                if (y2.length() == 0) {
                    break;
                }
                ww2Var.c(y2);
            }
            ul5Var.f = ww2Var.f().c();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.d = 3;
                return ul5Var;
            } else if (102 <= i2 && i2 < 200) {
                this.d = 3;
                return ul5Var;
            } else {
                this.d = 4;
                return ul5Var;
            }
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.b.h().a.h.g()), e);
        }
    }

    @Override // defpackage.v62
    public final void g() {
        ((ee5) this.c.R).flush();
    }

    @Override // defpackage.v62
    public final rm6 h() {
        return this.c;
    }

    @Override // defpackage.v62
    public final u62 i() {
        return this.b;
    }

    @Override // defpackage.v62
    public final void j(pa paVar) {
        paVar.getClass();
        Proxy.Type type = this.b.h().b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((String) paVar.L);
        sb.append(' ');
        i03 i03Var = (i03) paVar.B;
        if (!i03Var.f() && type == Proxy.Type.HTTP) {
            sb.append(i03Var);
        } else {
            String b = i03Var.b();
            String d = i03Var.d();
            if (d != null) {
                b = b + '?' + d;
            }
            sb.append(b);
        }
        sb.append(" HTTP/1.1");
        l((yw2) paVar.R, sb.toString());
    }

    public final fz2 k(i03 i03Var, long j) {
        if (this.d == 4) {
            this.d = 5;
            return new fz2(this, i03Var, j);
        }
        u34.u(this.d, "state: ");
        return null;
    }

    public final void l(yw2 yw2Var, String str) {
        yw2Var.getClass();
        if (this.d == 0) {
            bt btVar = this.c;
            ee5 ee5Var = (ee5) btVar.R;
            ee5Var.H(str);
            ee5Var.H("\r\n");
            int size = yw2Var.size();
            int i = 0;
            while (true) {
                ee5 ee5Var2 = (ee5) btVar.R;
                if (i < size) {
                    ee5Var2.H(yw2Var.b(i));
                    ee5Var2.H(": ");
                    ee5Var2.H(yw2Var.d(i));
                    ee5Var2.H("\r\n");
                    i++;
                } else {
                    ee5Var2.H("\r\n");
                    this.d = 1;
                    return;
                }
            }
        } else {
            u34.u(this.d, "state: ");
        }
    }
}
