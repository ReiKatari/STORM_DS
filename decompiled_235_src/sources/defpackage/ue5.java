package defpackage;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ue5  reason: default package */
/* loaded from: classes.dex */
public final class ue5 {
    public final qz6 a;
    public final ls1 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final ea i;
    public final il5 j;
    public final je5 k;
    public final boolean l;
    public zb m;
    public re5 n;
    public b26 o;
    public final pu p;

    public ue5(qz6 qz6Var, ls1 ls1Var, int i, int i2, int i3, int i4, boolean z, boolean z2, ea eaVar, il5 il5Var, je5 je5Var, pa paVar) {
        qz6Var.getClass();
        ls1Var.getClass();
        il5Var.getClass();
        this.a = qz6Var;
        this.b = ls1Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = z2;
        this.i = eaVar;
        this.j = il5Var;
        this.k = je5Var;
        this.l = !nb3.k((String) paVar.L, "GET");
        this.p = new pu();
    }

    public final boolean a(ke5 ke5Var) {
        re5 re5Var;
        b26 b26Var;
        if (this.p.isEmpty() && this.o == null) {
            if (ke5Var != null) {
                synchronized (ke5Var) {
                    b26Var = null;
                    if (ke5Var.l == 0 && ke5Var.j && az7.a(ke5Var.c.a.h, this.i.h)) {
                        b26Var = ke5Var.c;
                    }
                }
                if (b26Var != null) {
                    this.o = b26Var;
                    return true;
                }
            }
            zb zbVar = this.m;
            if ((zbVar == null || zbVar.B >= ((ArrayList) zbVar.L).size()) && (re5Var = this.n) != null) {
                return re5Var.g();
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h26 b() {
        Socket k;
        boolean z;
        pp5 pp5Var;
        jz0 c;
        String str;
        int i;
        List<InetAddress> list;
        boolean contains;
        ke5 ke5Var = this.k.e0;
        if (ke5Var != null) {
            boolean g = ke5Var.g(this.l);
            synchronized (ke5Var) {
                boolean z2 = ke5Var.j;
                try {
                    if (!g) {
                        ke5Var.j = true;
                        k = this.k.k();
                    } else {
                        if (!z2) {
                            i03 i03Var = ke5Var.c.a.h;
                            i03Var.getClass();
                            i03 i03Var2 = this.i.h;
                            if (i03Var.e == i03Var2.e && nb3.k(i03Var.d, i03Var2.d)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                k = null;
                            }
                        }
                        k = this.k.k();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.k.e0 != null) {
                if (k == null) {
                    pp5Var = new pp5(ke5Var);
                    if (pp5Var == null) {
                        return pp5Var;
                    }
                    pp5 d = d(null, null);
                    if (d != null) {
                        return d;
                    }
                    if (!this.p.isEmpty()) {
                        return (h26) this.p.removeFirst();
                    }
                    b26 b26Var = this.o;
                    if (b26Var != null) {
                        this.o = null;
                        c = c(b26Var, null);
                    } else {
                        zb zbVar = this.m;
                        if (zbVar != null && zbVar.B < ((ArrayList) zbVar.L).size()) {
                            int i2 = zbVar.B;
                            ArrayList arrayList = (ArrayList) zbVar.L;
                            if (i2 < arrayList.size()) {
                                int i3 = zbVar.B;
                                zbVar.B = i3 + 1;
                                c = c((b26) arrayList.get(i3), null);
                            } else {
                                fa6.c();
                                return null;
                            }
                        } else {
                            re5 re5Var = this.n;
                            if (re5Var == null) {
                                re5Var = new re5(this.i, this.j, this.k, this.h);
                                this.n = re5Var;
                            }
                            if (re5Var.g()) {
                                if (re5Var.g()) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (re5Var.L < ((List) re5Var.B).size()) {
                                        ea eaVar = (ea) re5Var.R;
                                        if (re5Var.L < ((List) re5Var.B).size()) {
                                            int i4 = re5Var.L;
                                            re5Var.L = i4 + 1;
                                            Proxy proxy = (Proxy) ((List) re5Var.B).get(i4);
                                            ArrayList arrayList3 = new ArrayList();
                                            re5Var.Y = arrayList3;
                                            if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
                                                SocketAddress address = proxy.address();
                                                if (address instanceof InetSocketAddress) {
                                                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                                    InetAddress address2 = inetSocketAddress.getAddress();
                                                    if (address2 == null) {
                                                        str = inetSocketAddress.getHostName();
                                                        str.getClass();
                                                    } else {
                                                        str = address2.getHostAddress();
                                                        str.getClass();
                                                    }
                                                    i = inetSocketAddress.getPort();
                                                } else {
                                                    u34.w(address.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                                                    return null;
                                                }
                                            } else {
                                                i03 i03Var3 = eaVar.h;
                                                str = i03Var3.d;
                                                i = i03Var3.e;
                                            }
                                            if (1 <= i && i < 65536) {
                                                if (proxy.type() == Proxy.Type.SOCKS) {
                                                    arrayList3.add(InetSocketAddress.createUnresolved(str, i));
                                                } else {
                                                    xh5 xh5Var = wy7.a;
                                                    str.getClass();
                                                    if (wy7.a.d(str)) {
                                                        list = hf.b0(InetAddress.getByName(str));
                                                    } else {
                                                        eaVar.a.getClass();
                                                        try {
                                                            InetAddress[] allByName = InetAddress.getAllByName(str);
                                                            allByName.getClass();
                                                            List T0 = fv.T0(allByName);
                                                            if (!T0.isEmpty()) {
                                                                list = T0;
                                                            } else {
                                                                throw new UnknownHostException(eaVar.a + " returned no addresses for " + str);
                                                            }
                                                        } catch (NullPointerException e) {
                                                            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                                                            unknownHostException.initCause(e);
                                                            throw unknownHostException;
                                                        }
                                                    }
                                                    if (re5Var.A && list.size() >= 2) {
                                                        ArrayList arrayList4 = new ArrayList();
                                                        ArrayList arrayList5 = new ArrayList();
                                                        for (Object obj : list) {
                                                            if (((InetAddress) obj) instanceof Inet6Address) {
                                                                arrayList4.add(obj);
                                                            } else {
                                                                arrayList5.add(obj);
                                                            }
                                                        }
                                                        if (!arrayList4.isEmpty() && !arrayList5.isEmpty()) {
                                                            byte[] bArr = yy7.a;
                                                            Iterator it = arrayList4.iterator();
                                                            Iterator it2 = arrayList5.iterator();
                                                            kw3 I = hf.I();
                                                            while (true) {
                                                                if (!it.hasNext() && !it2.hasNext()) {
                                                                    break;
                                                                }
                                                                if (it.hasNext()) {
                                                                    I.add(it.next());
                                                                }
                                                                if (it2.hasNext()) {
                                                                    I.add(it2.next());
                                                                }
                                                            }
                                                            list = hf.A(I);
                                                        }
                                                    }
                                                    for (InetAddress inetAddress : list) {
                                                        arrayList3.add(new InetSocketAddress(inetAddress, i));
                                                    }
                                                }
                                                for (InetSocketAddress inetSocketAddress2 : (List) re5Var.Y) {
                                                    b26 b26Var2 = new b26((ea) re5Var.R, proxy, inetSocketAddress2);
                                                    il5 il5Var = (il5) re5Var.X;
                                                    synchronized (il5Var) {
                                                        contains = il5Var.b.contains(b26Var2);
                                                    }
                                                    if (contains) {
                                                        ((ArrayList) re5Var.Z).add(b26Var2);
                                                    } else {
                                                        arrayList2.add(b26Var2);
                                                    }
                                                }
                                                if (!arrayList2.isEmpty()) {
                                                    break;
                                                }
                                            } else {
                                                throw new SocketException("No route to " + str + ':' + i + "; port is out of range");
                                            }
                                        } else {
                                            throw new SocketException("No route to " + eaVar.h.d + "; exhausted proxy configurations: " + ((List) re5Var.B));
                                        }
                                    }
                                    if (arrayList2.isEmpty()) {
                                        gt0.A0(arrayList2, (ArrayList) re5Var.Z);
                                        ((ArrayList) re5Var.Z).clear();
                                    }
                                    zb zbVar2 = new zb(arrayList2);
                                    this.m = zbVar2;
                                    if (!this.k.m0) {
                                        if (zbVar2.B < arrayList2.size()) {
                                            int i5 = zbVar2.B;
                                            zbVar2.B = i5 + 1;
                                            c = c((b26) arrayList2.get(i5), arrayList2);
                                        } else {
                                            fa6.c();
                                            return null;
                                        }
                                    } else {
                                        e41.i("Canceled");
                                        return null;
                                    }
                                } else {
                                    fa6.c();
                                    return null;
                                }
                            } else {
                                e41.i("exhausted all routes");
                                return null;
                            }
                        }
                    }
                    pp5 d2 = d(c, c.k);
                    if (d2 != null) {
                        return d2;
                    }
                    return c;
                }
                i.m("Check failed.");
                return null;
            } else if (k != null) {
                az7.c(k);
            }
        }
        pp5Var = null;
        if (pp5Var == null) {
        }
    }

    public final jz0 c(b26 b26Var, ArrayList arrayList) {
        b26Var.getClass();
        ea eaVar = b26Var.a;
        if (eaVar.c == null) {
            if (eaVar.j.contains(xz0.h)) {
                String str = b26Var.a.h.d;
                kx4 kx4Var = kx4.a;
                if (!kx4.a.h(str)) {
                    throw new UnknownServiceException(lb1.A("CLEARTEXT communication to ", str, " not permitted by network security policy"));
                }
            } else {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
        } else if (eaVar.i.contains(k55.H2_PRIOR_KNOWLEDGE)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        pa paVar = null;
        if (b26Var.b.type() == Proxy.Type.HTTP) {
            ea eaVar2 = b26Var.a;
            if (eaVar2.c != null || eaVar2.i.contains(k55.H2_PRIOR_KNOWLEDGE)) {
                s9 s9Var = new s9(13);
                i03 i03Var = b26Var.a.h;
                i03Var.getClass();
                s9Var.a = i03Var;
                s9Var.D("CONNECT", null);
                ea eaVar3 = b26Var.a;
                s9Var.B("Host", az7.i(eaVar3.h, true));
                s9Var.B("Proxy-Connection", "Keep-Alive");
                s9Var.B("User-Agent", "okhttp/5.3.2");
                paVar = new pa(s9Var);
                xl5 xl5Var = yl5.A;
                ww2 ww2Var = new ww2(0, (byte) 0);
                k55.HTTP_1_1.getClass();
                ft7.c("Proxy-Authenticate");
                ft7.d("OkHttp-Preemptive", "Proxy-Authenticate");
                ww2Var.r("Proxy-Authenticate");
                ft7.a(ww2Var, "Proxy-Authenticate", "OkHttp-Preemptive");
                ww2Var.f();
                xl5Var.getClass();
                eaVar3.f.getClass();
            }
        }
        return new jz0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.k, this, b26Var, arrayList, paVar, -1, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        if (r9 == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pp5 d(jz0 jz0Var, List list) {
        boolean z;
        ke5 ke5Var;
        boolean z2;
        boolean z3;
        Socket k;
        ls1 ls1Var = this.b;
        boolean z4 = this.l;
        ea eaVar = this.i;
        je5 je5Var = this.k;
        if (jz0Var != null && jz0Var.c()) {
            z = true;
        } else {
            z = false;
        }
        ls1Var.getClass();
        Iterator it = ((ConcurrentLinkedQueue) ls1Var.d).iterator();
        it.getClass();
        while (true) {
            if (it.hasNext()) {
                ke5Var = (ke5) it.next();
                ke5Var.getClass();
                synchronized (ke5Var) {
                    if (z) {
                        try {
                            if (ke5Var.i != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (!ke5Var.d(eaVar, list)) {
                        z3 = false;
                    } else {
                        je5Var.b(ke5Var);
                        z3 = true;
                    }
                }
                if (z3) {
                    if (ke5Var.g(z4)) {
                        break;
                    }
                    synchronized (ke5Var) {
                        ke5Var.j = true;
                        k = je5Var.k();
                    }
                    if (k != null) {
                        az7.c(k);
                    }
                }
            } else {
                ke5Var = null;
                break;
            }
        }
        if (ke5Var == null) {
            return null;
        }
        if (jz0Var != null) {
            this.o = jz0Var.j;
            Socket socket = jz0Var.q;
            if (socket != null) {
                az7.c(socket);
            }
        }
        return new pp5(ke5Var);
    }
}
