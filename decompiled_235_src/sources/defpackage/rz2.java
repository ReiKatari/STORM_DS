package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rz2  reason: default package */
/* loaded from: classes.dex */
public final class rz2 implements v62 {
    public static final List g = az7.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    public static final List h = az7.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    public final ke5 a;
    public final dp3 b;
    public final qz2 c;
    public volatile xz2 d;
    public final k55 e;
    public volatile boolean f;

    public rz2(xk4 xk4Var, ke5 ke5Var, dp3 dp3Var, qz2 qz2Var) {
        xk4Var.getClass();
        qz2Var.getClass();
        this.a = ke5Var;
        this.b = dp3Var;
        this.c = qz2Var;
        List list = xk4Var.s;
        k55 k55Var = k55.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(k55Var) ? k55Var : k55.HTTP_2;
    }

    @Override // defpackage.v62
    public final in6 a(wl5 wl5Var) {
        xz2 xz2Var = this.d;
        xz2Var.getClass();
        return xz2Var.d0;
    }

    @Override // defpackage.v62
    public final void b() {
        xz2 xz2Var = this.d;
        xz2Var.getClass();
        xz2Var.e0.close();
    }

    @Override // defpackage.v62
    public final boolean c() {
        boolean z;
        xz2 xz2Var = this.d;
        if (xz2Var != null) {
            synchronized (xz2Var) {
                vz2 vz2Var = xz2Var.d0;
                if (vz2Var.B) {
                    if (vz2Var.R.u()) {
                        z = true;
                    }
                }
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.v62
    public final void cancel() {
        this.f = true;
        xz2 xz2Var = this.d;
        if (xz2Var != null) {
            xz2Var.e(a62.CANCEL);
        }
    }

    @Override // defpackage.v62
    public final long d(wl5 wl5Var) {
        if (!zz2.a(wl5Var)) {
            return 0L;
        }
        return az7.e(wl5Var);
    }

    @Override // defpackage.v62
    public final ui6 e(pa paVar, long j) {
        paVar.getClass();
        xz2 xz2Var = this.d;
        xz2Var.getClass();
        return xz2Var.e0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
        if (r4 == false) goto L18;
     */
    @Override // defpackage.v62
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ul5 f(boolean z) {
        yw2 yw2Var;
        boolean z2;
        xz2 xz2Var = this.d;
        if (xz2Var != null) {
            synchronized (xz2Var) {
                while (true) {
                    boolean z3 = false;
                    if (!xz2Var.Y.isEmpty() || xz2Var.f() != null) {
                        break;
                    }
                    if (!z) {
                        xz2Var.B.getClass();
                        uz2 uz2Var = xz2Var.e0;
                        if (!uz2Var.L && !uz2Var.A) {
                            z2 = false;
                        }
                        z2 = true;
                    }
                    z3 = true;
                    if (z3) {
                        xz2Var.f0.i();
                    }
                    try {
                        xz2Var.wait();
                        if (z3) {
                            xz2Var.f0.m();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                if (!xz2Var.Y.isEmpty()) {
                    Object removeFirst = xz2Var.Y.removeFirst();
                    removeFirst.getClass();
                    yw2Var = (yw2) removeFirst;
                } else {
                    IOException iOException = xz2Var.i0;
                    if (iOException == null) {
                        a62 f = xz2Var.f();
                        f.getClass();
                        throw new lr6(f);
                    }
                    throw iOException;
                }
            }
            k55 k55Var = this.e;
            k55Var.getClass();
            ArrayList arrayList = new ArrayList(20);
            int size = yw2Var.size();
            ei eiVar = null;
            for (int i = 0; i < size; i++) {
                String b = yw2Var.b(i);
                String d = yw2Var.d(i);
                if (b.equals(":status")) {
                    eiVar = xk2.E("HTTP/1.1 ".concat(d));
                } else if (!h.contains(b)) {
                    arrayList.add(b);
                    arrayList.add(qs6.T0(d).toString());
                }
            }
            if (eiVar != null) {
                ul5 ul5Var = new ul5();
                ul5Var.b = k55Var;
                ul5Var.c = eiVar.B;
                ul5Var.d = (String) eiVar.R;
                ul5Var.f = new yw2((String[]) arrayList.toArray(new String[0])).c();
                if (z && ul5Var.c == 100) {
                    return null;
                }
                return ul5Var;
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
        e41.i("stream wasn't created");
        return null;
    }

    @Override // defpackage.v62
    public final void g() {
        this.c.flush();
    }

    @Override // defpackage.v62
    public final rm6 h() {
        xz2 xz2Var = this.d;
        xz2Var.getClass();
        return xz2Var;
    }

    @Override // defpackage.v62
    public final u62 i() {
        return this.a;
    }

    @Override // defpackage.v62
    public final void j(pa paVar) {
        boolean z;
        int i;
        xz2 xz2Var;
        paVar.getClass();
        if (this.d != null) {
            return;
        }
        boolean z2 = false;
        if (((mk5) paVar.X) != null) {
            z = true;
        } else {
            z = false;
        }
        yw2 yw2Var = (yw2) paVar.R;
        ArrayList arrayList = new ArrayList(yw2Var.size() + 4);
        arrayList.add(new uw2(uw2.f, (String) paVar.L));
        da0 da0Var = uw2.g;
        i03 i03Var = (i03) paVar.B;
        i03Var.getClass();
        String b = i03Var.b();
        String d = i03Var.d();
        if (d != null) {
            b = b + '?' + d;
        }
        arrayList.add(new uw2(da0Var, b));
        String a = yw2Var.a("Host");
        if (a != null) {
            arrayList.add(new uw2(uw2.i, a));
        }
        arrayList.add(new uw2(uw2.h, i03Var.a));
        int size = yw2Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            String b2 = yw2Var.b(i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = b2.toLowerCase(locale);
            lowerCase.getClass();
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && yw2Var.d(i2).equals("trailers"))) {
                arrayList.add(new uw2(lowerCase, yw2Var.d(i2)));
            }
        }
        qz2 qz2Var = this.c;
        qz2Var.getClass();
        boolean z3 = !z;
        synchronized (qz2Var.s0) {
            synchronized (qz2Var) {
                if (qz2Var.X > 1073741823) {
                    qz2Var.n(a62.REFUSED_STREAM);
                }
                if (!qz2Var.Y) {
                    i = qz2Var.X;
                    qz2Var.X = i + 2;
                    xz2Var = new xz2(i, qz2Var, z3, false, null);
                    z2 = (!z || qz2Var.p0 >= qz2Var.q0 || xz2Var.R >= xz2Var.X) ? true : true;
                    if (xz2Var.h()) {
                        qz2Var.B.put(Integer.valueOf(i), xz2Var);
                    }
                } else {
                    throw new IOException();
                }
            }
            qz2Var.s0.r(z3, i, arrayList);
        }
        if (z2) {
            qz2Var.s0.flush();
        }
        this.d = xz2Var;
        boolean z4 = this.f;
        xz2 xz2Var2 = this.d;
        if (!z4) {
            xz2Var2.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            xz2Var2.f0.g(this.b.d, timeUnit);
            xz2 xz2Var3 = this.d;
            xz2Var3.getClass();
            xz2Var3.g0.g(this.b.e, timeUnit);
            return;
        }
        xz2Var2.getClass();
        xz2Var2.e(a62.CANCEL);
        e41.i("Canceled");
    }
}
