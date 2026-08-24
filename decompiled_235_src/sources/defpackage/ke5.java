package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ke5  reason: default package */
/* loaded from: classes.dex */
public final class ke5 extends oz2 implements u62 {
    public final qz6 b;
    public final b26 c;
    public final Socket d;
    public final Socket e;
    public final pv2 f;
    public final k55 g;
    public final bt h;
    public qz2 i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final ArrayList p;
    public long q;

    public ke5(qz6 qz6Var, ls1 ls1Var, b26 b26Var, Socket socket, Socket socket2, pv2 pv2Var, k55 k55Var, bt btVar) {
        qz6Var.getClass();
        ls1Var.getClass();
        b26Var.getClass();
        socket.getClass();
        socket2.getClass();
        k55Var.getClass();
        btVar.getClass();
        this.b = qz6Var;
        this.c = b26Var;
        this.d = socket;
        this.e = socket2;
        this.f = pv2Var;
        this.g = k55Var;
        this.h = btVar;
        this.o = 1;
        this.p = new ArrayList();
        this.q = Long.MAX_VALUE;
    }

    public static void c(xk4 xk4Var, b26 b26Var, IOException iOException) {
        xk4Var.getClass();
        b26Var.getClass();
        iOException.getClass();
        if (b26Var.b.type() != Proxy.Type.DIRECT) {
            ea eaVar = b26Var.a;
            eaVar.g.connectFailed(eaVar.h.h(), b26Var.b.address(), iOException);
        }
        il5 il5Var = xk4Var.B;
        synchronized (il5Var) {
            il5Var.b.add(b26Var);
        }
    }

    @Override // defpackage.oz2
    public final void a(qz2 qz2Var, fd6 fd6Var) {
        int i;
        fd6Var.getClass();
        synchronized (this) {
            if ((fd6Var.a & 8) != 0) {
                i = fd6Var.b[3];
            } else {
                i = Integer.MAX_VALUE;
            }
            this.o = i;
        }
    }

    @Override // defpackage.oz2
    public final void b(xz2 xz2Var) {
        xz2Var.c(a62.REFUSED_STREAM, null);
    }

    @Override // defpackage.u62
    public final void cancel() {
        az7.c(this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
        if (defpackage.sk4.c(r5, (java.security.cert.X509Certificate) r8) != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(ea eaVar, List list) {
        i03 i03Var = eaVar.h;
        TimeZone timeZone = az7.a;
        if (this.p.size() < this.o && !this.j) {
            b26 b26Var = this.c;
            ea eaVar2 = b26Var.a;
            ea eaVar3 = b26Var.a;
            if (eaVar2.a(eaVar)) {
                String str = i03Var.d;
                String str2 = i03Var.d;
                if (!nb3.k(str, eaVar3.h.d)) {
                    if (this.i != null && list != null && !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            b26 b26Var2 = (b26) it.next();
                            Proxy.Type type = b26Var2.b.type();
                            Proxy.Type type2 = Proxy.Type.DIRECT;
                            if (type == type2 && b26Var.b.type() == type2 && nb3.k(b26Var.c, b26Var2.c)) {
                                if (eaVar.d == sk4.a) {
                                    TimeZone timeZone2 = az7.a;
                                    i03 i03Var2 = eaVar3.h;
                                    if (i03Var.e == i03Var2.e) {
                                        boolean k = nb3.k(str2, i03Var2.d);
                                        pv2 pv2Var = this.f;
                                        if (!k) {
                                            if (!this.k && pv2Var != null) {
                                                List a = pv2Var.a();
                                                if (!a.isEmpty()) {
                                                    Object obj = a.get(0);
                                                    obj.getClass();
                                                }
                                            }
                                        }
                                        try {
                                            il0 il0Var = eaVar.e;
                                            il0Var.getClass();
                                            pv2Var.getClass();
                                            List a2 = pv2Var.a();
                                            str2.getClass();
                                            a2.getClass();
                                            Iterator it2 = il0Var.a.iterator();
                                            if (!it2.hasNext()) {
                                                return true;
                                            }
                                            xg6.A(it2.next());
                                            throw null;
                                        } catch (SSLPeerUnverifiedException unused) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.u62
    public final void e() {
        synchronized (this) {
            this.j = true;
        }
    }

    @Override // defpackage.u62
    public final void f(je5 je5Var, IOException iOException) {
        boolean z;
        synchronized (this) {
            try {
                if (iOException instanceof lr6) {
                    if (((lr6) iOException).A == a62.REFUSED_STREAM) {
                        int i = this.n + 1;
                        this.n = i;
                        if (i > 1) {
                            this.j = true;
                            this.l++;
                        }
                    } else if (((lr6) iOException).A != a62.CANCEL || !je5Var.m0) {
                        this.j = true;
                        this.l++;
                    }
                } else {
                    if (this.i != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z || (iOException instanceof vz0)) {
                        this.j = true;
                        if (this.m == 0) {
                            if (iOException != null) {
                                c(je5Var.A, this.c, iOException);
                            }
                            this.l++;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g(boolean z) {
        long j;
        TimeZone timeZone = az7.a;
        long nanoTime = System.nanoTime();
        if (this.d.isClosed() || this.e.isClosed() || this.e.isInputShutdown() || this.e.isOutputShutdown()) {
            return false;
        }
        qz2 qz2Var = this.i;
        if (qz2Var != null) {
            synchronized (qz2Var) {
                if (qz2Var.Y) {
                    return false;
                }
                if (qz2Var.j0 < qz2Var.i0) {
                    if (nanoTime >= qz2Var.k0) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = nanoTime - this.q;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.e;
        fe5 fe5Var = (fe5) this.h.L;
        socket.getClass();
        fe5Var.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            socket.setSoTimeout(1);
            boolean z2 = !fe5Var.e();
            socket.setSoTimeout(soTimeout);
            return z2;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // defpackage.u62
    public final b26 h() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [s9, java.lang.Object] */
    public final void i() {
        int i;
        int a;
        this.q = System.nanoTime();
        k55 k55Var = this.g;
        if (k55Var != k55.HTTP_2 && k55Var != k55.H2_PRIOR_KNOWLEDGE) {
            return;
        }
        this.e.setSoTimeout(0);
        cs1 cs1Var = cs1.Y;
        oe2 oe2Var = oe2.a;
        qz6 qz6Var = this.b;
        qz6Var.getClass();
        ?? obj = new Object();
        obj.a = qz6Var;
        obj.d = oz2.a;
        obj.e = oe2.a;
        bt btVar = this.h;
        String str = this.c.a.h.d;
        btVar.getClass();
        str.getClass();
        obj.b = btVar;
        obj.c = az7.b + ' ' + str;
        obj.d = this;
        obj.e = oe2Var;
        qz2 qz2Var = new qz2(obj);
        this.i = qz2Var;
        fd6 fd6Var = qz2.v0;
        if ((fd6Var.a & 8) != 0) {
            i = fd6Var.b[3];
        } else {
            i = Integer.MAX_VALUE;
        }
        this.o = i;
        yz2 yz2Var = qz2Var.s0;
        synchronized (yz2Var) {
            try {
                if (!yz2Var.R) {
                    Logger logger = yz2.Y;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(az7.d(">> CONNECTION " + iz2.a.e(), new Object[0]));
                    }
                    yz2Var.A.P(iz2.a);
                    yz2Var.A.flush();
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        yz2 yz2Var2 = qz2Var.s0;
        fd6 fd6Var2 = qz2Var.m0;
        yz2Var2.getClass();
        fd6Var2.getClass();
        synchronized (yz2Var2) {
            try {
                if (!yz2Var2.R) {
                    yz2Var2.k(0, Integer.bitCount(fd6Var2.a) * 6, 4, 0);
                    for (int i2 = 0; i2 < 10; i2++) {
                        boolean z = true;
                        if (((1 << i2) & fd6Var2.a) == 0) {
                            z = false;
                        }
                        if (z) {
                            yz2Var2.A.writeShort(i2);
                            yz2Var2.A.writeInt(fd6Var2.b[i2]);
                        }
                    }
                    yz2Var2.A.flush();
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (qz2Var.m0.a() != 65535) {
            qz2Var.s0.x(0, a - 65535);
        }
        pz6.b(qz2Var.Z.d(), qz2Var.L, 0L, qz2Var.t0, 6);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        b26 b26Var = this.c;
        sb.append(b26Var.a.h.d);
        sb.append(':');
        sb.append(b26Var.a.h.e);
        sb.append(", proxy=");
        sb.append(b26Var.b);
        sb.append(" hostAddress=");
        sb.append(b26Var.c);
        sb.append(" cipherSuite=");
        pv2 pv2Var = this.f;
        if (pv2Var != null) {
            obj = pv2Var.b;
        } else {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
}
