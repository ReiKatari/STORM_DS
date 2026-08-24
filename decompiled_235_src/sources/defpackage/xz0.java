package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xz0  reason: default package */
/* loaded from: classes.dex */
public final class xz0 {
    public static final List e;
    public static final List f;
    public static final xz0 g;
    public static final xz0 h;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        rq0 rq0Var = rq0.r;
        rq0 rq0Var2 = rq0.s;
        rq0 rq0Var3 = rq0.t;
        rq0 rq0Var4 = rq0.l;
        rq0 rq0Var5 = rq0.n;
        rq0 rq0Var6 = rq0.m;
        rq0 rq0Var7 = rq0.o;
        rq0 rq0Var8 = rq0.q;
        rq0 rq0Var9 = rq0.p;
        List c0 = hf.c0(rq0Var, rq0Var2, rq0Var3, rq0Var4, rq0Var5, rq0Var6, rq0Var7, rq0Var8, rq0Var9);
        e = c0;
        List c02 = hf.c0(rq0Var, rq0Var2, rq0Var3, rq0Var4, rq0Var5, rq0Var6, rq0Var7, rq0Var8, rq0Var9, rq0.j, rq0.k, rq0.h, rq0.i, rq0.f, rq0.g, rq0.e);
        f = c02;
        wz0 wz0Var = new wz0();
        rq0[] rq0VarArr = (rq0[]) c0.toArray(new rq0[0]);
        wz0Var.b((rq0[]) Arrays.copyOf(rq0VarArr, rq0VarArr.length));
        l67 l67Var = l67.TLS_1_3;
        l67 l67Var2 = l67.TLS_1_2;
        wz0Var.c(l67Var, l67Var2);
        wz0Var.b = true;
        wz0Var.a();
        wz0 wz0Var2 = new wz0();
        rq0[] rq0VarArr2 = (rq0[]) c02.toArray(new rq0[0]);
        wz0Var2.b((rq0[]) Arrays.copyOf(rq0VarArr2, rq0VarArr2.length));
        wz0Var2.c(l67Var, l67Var2);
        wz0Var2.b = true;
        g = wz0Var2.a();
        wz0 wz0Var3 = new wz0();
        rq0[] rq0VarArr3 = (rq0[]) c02.toArray(new rq0[0]);
        wz0Var3.b((rq0[]) Arrays.copyOf(rq0VarArr3, rq0VarArr3.length));
        wz0Var3.c(l67Var, l67Var2, l67.TLS_1_1, l67.TLS_1_0);
        wz0Var3.b = true;
        wz0Var3.a();
        h = new xz0(false, false, null, null);
    }

    public xz0(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final void a(SSLSocket sSLSocket, boolean z) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        enabledCipherSuites.getClass();
        String[] strArr = this.c;
        if (strArr != null) {
            enabledCipherSuites = yy7.l(strArr, enabledCipherSuites, rq0.c);
        }
        String[] strArr2 = this.d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            enabledProtocols2.getClass();
            enabledProtocols = yy7.l(enabledProtocols2, strArr2, qb4.b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        zh2 zh2Var = rq0.c;
        byte[] bArr = yy7.a;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (zh2Var.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (z && i != -1) {
            String str = supportedCipherSuites[i];
            str.getClass();
            enabledCipherSuites.getClass();
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length);
        boolean z2 = this.a;
        if (z2) {
            if (strArr3.length != 0) {
                String[] strArr4 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
                String[] strArr5 = (String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length);
                if (z2) {
                    if (strArr5.length != 0) {
                        xz0 xz0Var = new xz0(z2, this.b, strArr4, (String[]) Arrays.copyOf(strArr5, strArr5.length));
                        if (xz0Var.c() != null) {
                            sSLSocket.setEnabledProtocols(xz0Var.d);
                        }
                        if (xz0Var.b() != null) {
                            sSLSocket.setEnabledCipherSuites(xz0Var.c);
                            return;
                        }
                        return;
                    }
                    i.h("At least one TLS version is required");
                    return;
                }
                i.h("no TLS versions for cleartext connections");
                return;
            }
            i.h("At least one cipher suite is required");
            return;
        }
        i.h("no cipher suites for cleartext connections");
    }

    public final ArrayList b() {
        String[] strArr = this.c;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(rq0.b.r(str));
            }
            return arrayList;
        }
        return null;
    }

    public final ArrayList c() {
        String[] strArr = this.d;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                l67.Companion.getClass();
                arrayList.add(k67.a(str));
            }
            return arrayList;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xz0) {
            if (obj != this) {
                xz0 xz0Var = (xz0) obj;
                boolean z = xz0Var.a;
                boolean z2 = this.a;
                if (z2 == z) {
                    if (z2) {
                        if (!Arrays.equals(this.c, xz0Var.c) || !Arrays.equals(this.d, xz0Var.d) || this.b != xz0Var.b) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (this.a) {
            int i2 = 0;
            String[] strArr = this.c;
            if (strArr != null) {
                i = Arrays.hashCode(strArr);
            } else {
                i = 0;
            }
            int i3 = (527 + i) * 31;
            String[] strArr2 = this.d;
            if (strArr2 != null) {
                i2 = Arrays.hashCode(strArr2);
            }
            return ((i3 + i2) * 31) + (!this.b ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(b(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(c(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return xg6.r(sb, this.b, ')');
    }
}
