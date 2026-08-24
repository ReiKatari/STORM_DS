package defpackage;

import java.io.ByteArrayOutputStream;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: af5  reason: default package */
/* loaded from: classes.dex */
public final class af5 {
    public static final List x = hf.b0(k55.HTTP_1_1);
    public final zp3 a;
    public final Random b;
    public final long c;
    public us7 d;
    public final long e;
    public final long f;
    public final String g;
    public je5 h;
    public hk1 i;
    public ws7 j;
    public xs7 k;
    public final pz6 l;
    public String m;
    public bt n;
    public final ArrayDeque o;
    public final ArrayDeque p;
    public long q;
    public boolean r;
    public int s;
    public String t;
    public boolean u;
    public int v;
    public boolean w;

    public af5(qz6 qz6Var, pa paVar, zp3 zp3Var, Random random, long j, long j2, long j3) {
        qz6Var.getClass();
        this.a = zp3Var;
        this.b = random;
        this.c = j;
        this.d = null;
        this.e = j2;
        this.f = j3;
        this.l = qz6Var.d();
        this.o = new ArrayDeque();
        this.p = new ArrayDeque();
        this.s = -1;
        String str = (String) paVar.L;
        if ("GET".equals(str)) {
            da0 da0Var = da0.R;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.g = xd5.t(bArr).a();
            return;
        }
        i.f(i61.m("Request must be GET: ", str));
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [dh5, java.lang.Object] */
    public static void c(af5 af5Var, Exception exc, int i) {
        boolean z;
        xs7 xs7Var;
        xs7 xs7Var2;
        if ((i & 4) != 0) {
            z = false;
        } else {
            z = true;
        }
        af5Var.getClass();
        ?? obj = new Object();
        synchronized (af5Var) {
            try {
                if (af5Var.u) {
                    return;
                }
                af5Var.u = true;
                bt btVar = af5Var.n;
                xs7 xs7Var3 = af5Var.k;
                obj.A = xs7Var3;
                byte[] bArr = null;
                af5Var.k = null;
                if (!z && xs7Var3 != null) {
                    pz6.b(af5Var.l, af5Var.m + " writer close", 0L, new er2(obj, 16), 2);
                }
                af5Var.l.f();
                try {
                    zp3 zp3Var = af5Var.a;
                    byte[] byteArray = ((ByteArrayOutputStream) zp3Var.h).toByteArray();
                    tu0 tu0Var = (tu0) zp3Var.i;
                    byteArray.getClass();
                    if (byteArray.length != 0) {
                        bArr = byteArray;
                    }
                    tu0Var.b0(bArr);
                    if (btVar != null) {
                        btVar.cancel();
                    }
                    if (z && (xs7Var2 = (xs7) obj.A) != null) {
                        yy7.b(xs7Var2);
                    }
                } catch (Throwable th) {
                    if (btVar != null) {
                        btVar.cancel();
                    }
                    if (z && (xs7Var = (xs7) obj.A) != null) {
                        yy7.b(xs7Var);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final rm6 a(wl5 wl5Var) {
        yw2 yw2Var = wl5Var.Y;
        int i = wl5Var.R;
        if (i == 101) {
            String a = yw2Var.a("Connection");
            String str = null;
            if (a == null) {
                a = null;
            }
            if ("Upgrade".equalsIgnoreCase(a)) {
                String a2 = yw2Var.a("Upgrade");
                if (a2 == null) {
                    a2 = null;
                }
                if ("websocket".equalsIgnoreCase(a2)) {
                    String a3 = yw2Var.a("Sec-WebSocket-Accept");
                    if (a3 != null) {
                        str = a3;
                    }
                    da0 da0Var = da0.R;
                    String a4 = xd5.o(this.g + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").c("SHA-1").a();
                    if (nb3.k(a4, str)) {
                        rm6 rm6Var = wl5Var.d0;
                        if (rm6Var != null) {
                            return rm6Var;
                        }
                        throw new ProtocolException("Web Socket socket missing: bad interceptor?");
                    }
                    throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + a4 + "' but was '" + str + '\'');
                }
                throw new ProtocolException(i61.k('\'', "Expected 'Upgrade' header value 'websocket' but was '", a2));
            }
            throw new ProtocolException(i61.k('\'', "Expected 'Connection' header value 'Upgrade' but was '", a));
        }
        StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
        sb.append(i);
        sb.append(' ');
        throw new ProtocolException(lb1.q(sb, wl5Var.L, '\''));
    }

    public final void b(int i, String str) {
        String str2;
        long j = this.f;
        synchronized (this) {
            da0 da0Var = null;
            try {
                if (i >= 1000 && i < 5000) {
                    if ((1004 <= i && i < 1007) || (1015 <= i && i < 3000)) {
                        str2 = "Code " + i + " is reserved and may not be used.";
                    } else {
                        str2 = null;
                    }
                } else {
                    str2 = "Code must be in range [1000,5000): " + i;
                }
                if (str2 == null) {
                    if (str != null) {
                        da0 da0Var2 = da0.R;
                        da0Var = xd5.o(str);
                        if (da0Var.A.length > 123) {
                            throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                        }
                    }
                    if (!this.u && !this.r) {
                        this.r = true;
                        this.p.add(new ye5(i, j, da0Var));
                        e();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(str2.toString());
            } finally {
            }
        }
    }

    public final void d() {
        String str;
        ws7 ws7Var;
        boolean z;
        synchronized (this) {
            try {
                str = this.t;
                ws7Var = this.j;
                this.j = null;
                if (this.r && this.p.isEmpty()) {
                    xs7 xs7Var = this.k;
                    if (xs7Var != null) {
                        this.k = null;
                        pz6 pz6Var = this.l;
                        pz6.b(pz6Var, this.m + " writer close", 0L, new er2(xs7Var, 15), 2);
                    }
                    this.l.f();
                }
                if (!this.u && this.k == null) {
                    if (this.s != -1) {
                        z = true;
                    }
                }
                z = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            zp3 zp3Var = this.a;
            str.getClass();
            zp3Var.d(this, str);
        }
        if (ws7Var != null) {
            yy7.b(ws7Var);
        }
    }

    public final void e() {
        TimeZone timeZone = az7.a;
        hk1 hk1Var = this.i;
        if (hk1Var != null) {
            this.l.c(hk1Var, 0L);
        }
    }

    public final void f(String str) {
        da0 da0Var = da0.R;
        da0 o = xd5.o(str);
        synchronized (this) {
            if (!this.u && !this.r) {
                long j = this.q;
                byte[] bArr = o.A;
                if (bArr.length + j > 16777216) {
                    b(1001, null);
                    return;
                }
                this.q = j + bArr.length;
                this.p.add(new ze5(o));
                e();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d3, code lost:
        if (r0 < 3000) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077 A[Catch: all -> 0x0083, TRY_ENTER, TryCatch #3 {all -> 0x0083, blocks: (B:33:0x0077, B:36:0x0086, B:38:0x008a, B:39:0x0095, B:41:0x00a3, B:46:0x00a9, B:48:0x00ad, B:62:0x00d5, B:65:0x00f9, B:67:0x0103, B:68:0x0106, B:71:0x0111, B:73:0x0115, B:80:0x0127, B:81:0x0130, B:63:0x00e9, B:82:0x0131, B:83:0x0136, B:70:0x010e, B:40:0x0096), top: B:90:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086 A[Catch: all -> 0x0083, TryCatch #3 {all -> 0x0083, blocks: (B:33:0x0077, B:36:0x0086, B:38:0x008a, B:39:0x0095, B:41:0x00a3, B:46:0x00a9, B:48:0x00ad, B:62:0x00d5, B:65:0x00f9, B:67:0x0103, B:68:0x0106, B:71:0x0111, B:73:0x0115, B:80:0x0127, B:81:0x0130, B:63:0x00e9, B:82:0x0131, B:83:0x0136, B:70:0x010e, B:40:0x0096), top: B:90:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f9 A[Catch: all -> 0x0083, TryCatch #3 {all -> 0x0083, blocks: (B:33:0x0077, B:36:0x0086, B:38:0x008a, B:39:0x0095, B:41:0x00a3, B:46:0x00a9, B:48:0x00ad, B:62:0x00d5, B:65:0x00f9, B:67:0x0103, B:68:0x0106, B:71:0x0111, B:73:0x0115, B:80:0x0127, B:81:0x0130, B:63:0x00e9, B:82:0x0131, B:83:0x0136, B:70:0x010e, B:40:0x0096), top: B:90:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011f A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0127 A[Catch: all -> 0x0083, TryCatch #3 {all -> 0x0083, blocks: (B:33:0x0077, B:36:0x0086, B:38:0x008a, B:39:0x0095, B:41:0x00a3, B:46:0x00a9, B:48:0x00ad, B:62:0x00d5, B:65:0x00f9, B:67:0x0103, B:68:0x0106, B:71:0x0111, B:73:0x0115, B:80:0x0127, B:81:0x0130, B:63:0x00e9, B:82:0x0131, B:83:0x0136, B:70:0x010e, B:40:0x0096), top: B:90:0x0075 }] */
    /* JADX WARN: Type inference failed for: r5v4, types: [k80, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g() {
        Object obj;
        xs7 xs7Var;
        String str;
        synchronized (this) {
            try {
                boolean z = false;
                if (this.u) {
                    return false;
                }
                xs7 xs7Var2 = this.k;
                Object poll = this.o.poll();
                String str2 = null;
                try {
                    if (poll == null) {
                        obj = this.p.poll();
                        if (obj instanceof ye5) {
                            int i = this.s;
                            String str3 = this.t;
                            if (i != -1) {
                                xs7Var = this.k;
                                this.k = null;
                                if (xs7Var != null && this.j == null) {
                                    z = true;
                                }
                                this.l.f();
                                str = str3;
                            } else {
                                long j = ((ye5) obj).c;
                                pz6.b(this.l, this.m + " cancel", TimeUnit.MILLISECONDS.toNanos(j), new er2(this, 17), 4);
                                xs7Var = null;
                                str = str3;
                            }
                            if (poll == null) {
                                xs7Var2.getClass();
                                xs7Var2.e(10, (da0) poll);
                            } else if (obj instanceof ze5) {
                                xs7Var2.getClass();
                                xs7Var2.h(((ze5) obj).a);
                                synchronized (this) {
                                    this.q -= ((ze5) obj).a.A.length;
                                }
                            } else if (obj instanceof ye5) {
                                xs7Var2.getClass();
                                int i2 = ((ye5) obj).a;
                                da0 da0Var = ((ye5) obj).b;
                                da0 da0Var2 = da0.R;
                                if (i2 >= 1000 && i2 < 5000) {
                                    if (1004 <= i2) {
                                        if (i2 < 1007) {
                                            str2 = "Code " + i2 + " is reserved and may not be used.";
                                            if (str2 == null) {
                                                ?? obj2 = new Object();
                                                obj2.r0(i2);
                                                if (da0Var != null) {
                                                    obj2.k0(da0Var);
                                                }
                                                xs7Var2.e(8, obj2.l(obj2.B));
                                                xs7Var2.d0 = true;
                                                if (z) {
                                                    zp3 zp3Var = this.a;
                                                    str.getClass();
                                                    zp3Var.d(this, str);
                                                }
                                            } else {
                                                throw new IllegalArgumentException(str2.toString());
                                            }
                                        }
                                    }
                                    if (1015 <= i2) {
                                    }
                                    if (str2 == null) {
                                    }
                                }
                                str2 = "Code must be in range [1000,5000): " + i2;
                                if (str2 == null) {
                                }
                            } else {
                                throw new AssertionError();
                            }
                            return true;
                        } else if (obj == null) {
                            return false;
                        } else {
                            xs7Var = null;
                        }
                    } else {
                        obj = null;
                        xs7Var = null;
                    }
                    if (poll == null) {
                    }
                    return true;
                } finally {
                    if (xs7Var != null) {
                        yy7.b(xs7Var);
                    }
                }
                str = xs7Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
