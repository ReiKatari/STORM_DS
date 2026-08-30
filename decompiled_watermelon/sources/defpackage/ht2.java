package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ht2  reason: default package */
/* loaded from: classes.dex */
public final class ht2 implements e22 {
    public static final xq2 f;
    public final zb4 a;
    public final d22 b;
    public final os c;
    public int d;
    public final yj e;

    static {
        xq2 xq2Var = xq2.B;
        f = hi2.K("OkHttp-Response-Body", "Truncated");
    }

    public ht2(zb4 zb4Var, d22 d22Var, os osVar) {
        osVar.getClass();
        this.a = zb4Var;
        this.b = d22Var;
        this.c = osVar;
        this.e = new yj((s45) osVar.L);
    }

    @Override // defpackage.e22
    public final sb6 a(ec5 ec5Var) {
        ka kaVar = ec5Var.A;
        if (!yt2.a(ec5Var)) {
            return k((hu2) kaVar.B, 0L);
        }
        String b = ec5Var.Y.b("Transfer-Encoding");
        if (b == null) {
            b = null;
        }
        if ("chunked".equalsIgnoreCase(b)) {
            hu2 hu2Var = (hu2) kaVar.B;
            if (this.d == 4) {
                this.d = 5;
                return new dt2(this, hu2Var);
            }
            c44.s(this.d, "state: ");
            return null;
        }
        long d = ik7.d(ec5Var);
        if (d != -1) {
            return k((hu2) kaVar.B, d);
        }
        hu2 hu2Var2 = (hu2) kaVar.B;
        if (this.d == 4) {
            this.d = 5;
            this.b.h();
            hu2Var2.getClass();
            return new bt2(this, hu2Var2);
        }
        c44.s(this.d, "state: ");
        return null;
    }

    @Override // defpackage.e22
    public final void b() {
        ((r45) this.c.R).flush();
    }

    @Override // defpackage.e22
    public final boolean c() {
        if (this.d == 6) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e22
    public final void cancel() {
        this.b.cancel();
    }

    @Override // defpackage.e22
    public final void d() {
        ((r45) this.c.R).flush();
    }

    @Override // defpackage.e22
    public final cb6 e() {
        return this.c;
    }

    @Override // defpackage.e22
    public final d22 f() {
        return this.b;
    }

    @Override // defpackage.e22
    public final long g(ec5 ec5Var) {
        if (!yt2.a(ec5Var)) {
            return 0L;
        }
        String b = ec5Var.Y.b("Transfer-Encoding");
        if (b == null) {
            b = null;
        }
        if ("chunked".equalsIgnoreCase(b)) {
            return -1L;
        }
        return ik7.d(ec5Var);
    }

    @Override // defpackage.e22
    public final void h(ka kaVar) {
        kaVar.getClass();
        Proxy.Type type = this.b.f().b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((String) kaVar.L);
        sb.append(' ');
        hu2 hu2Var = (hu2) kaVar.B;
        if (!hu2Var.f() && type == Proxy.Type.HTTP) {
            sb.append(hu2Var);
        } else {
            String b = hu2Var.b();
            String d = hu2Var.d();
            if (d != null) {
                b = b + '?' + d;
            }
            sb.append(b);
        }
        sb.append(" HTTP/1.1");
        l((xq2) kaVar.R, sb.toString());
    }

    @Override // defpackage.e22
    public final g76 i(ka kaVar, long j) {
        kaVar.getClass();
        if ("chunked".equalsIgnoreCase(((xq2) kaVar.R).b("Transfer-Encoding"))) {
            if (this.d == 1) {
                this.d = 2;
                return new ct2(this);
            }
            c44.s(this.d, "state: ");
            return null;
        } else if (j != -1) {
            if (this.d == 1) {
                this.d = 2;
                return new ft2(this);
            }
            c44.s(this.d, "state: ");
            return null;
        } else {
            i.n("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
    }

    @Override // defpackage.e22
    public final cc5 j(boolean z) {
        yj yjVar = this.e;
        int i = this.d;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            c44.s(this.d, "state: ");
            return null;
        }
        try {
            String O = ((u60) yjVar.c).O(yjVar.b);
            yjVar.b -= O.length();
            sh L = ln2.L(O);
            int i2 = L.b;
            cc5 cc5Var = new cc5();
            dw4 dw4Var = (dw4) L.c;
            dw4Var.getClass();
            cc5Var.b = dw4Var;
            cc5Var.c = i2;
            cc5Var.d = (String) L.d;
            vq2 vq2Var = new vq2(0, (byte) 0);
            while (true) {
                String O2 = ((u60) yjVar.c).O(yjVar.b);
                yjVar.b -= O2.length();
                if (O2.length() == 0) {
                    break;
                }
                vq2Var.c(O2);
            }
            cc5Var.f = vq2Var.f().d();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.d = 3;
                return cc5Var;
            } else if (102 <= i2 && i2 < 200) {
                this.d = 3;
                return cc5Var;
            } else {
                this.d = 4;
                return cc5Var;
            }
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.b.f().a.h.g()), e);
        }
    }

    public final et2 k(hu2 hu2Var, long j) {
        if (this.d == 4) {
            this.d = 5;
            return new et2(this, hu2Var, j);
        }
        c44.s(this.d, "state: ");
        return null;
    }

    public final void l(xq2 xq2Var, String str) {
        xq2Var.getClass();
        if (this.d == 0) {
            os osVar = this.c;
            r45 r45Var = (r45) osVar.R;
            r45Var.c0(str);
            r45Var.c0("\r\n");
            int size = xq2Var.size();
            int i = 0;
            while (true) {
                r45 r45Var2 = (r45) osVar.R;
                if (i < size) {
                    r45Var2.c0(xq2Var.c(i));
                    r45Var2.c0(": ");
                    r45Var2.c0(xq2Var.i(i));
                    r45Var2.c0("\r\n");
                    i++;
                } else {
                    r45Var2.c0("\r\n");
                    this.d = 1;
                    return;
                }
            }
        } else {
            c44.s(this.d, "state: ");
        }
    }
}
