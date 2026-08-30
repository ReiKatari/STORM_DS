package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ax0  reason: default package */
/* loaded from: classes.dex */
public final class ax0 {
    public static final ax0 e;
    public static final ax0 f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        ho0 ho0Var = ho0.r;
        ho0 ho0Var2 = ho0.s;
        ho0 ho0Var3 = ho0.t;
        ho0 ho0Var4 = ho0.l;
        ho0 ho0Var5 = ho0.n;
        ho0 ho0Var6 = ho0.m;
        ho0 ho0Var7 = ho0.o;
        ho0 ho0Var8 = ho0.q;
        ho0 ho0Var9 = ho0.p;
        List c0 = l07.c0(ho0Var, ho0Var2, ho0Var3, ho0Var4, ho0Var5, ho0Var6, ho0Var7, ho0Var8, ho0Var9);
        List c02 = l07.c0(ho0Var, ho0Var2, ho0Var3, ho0Var4, ho0Var5, ho0Var6, ho0Var7, ho0Var8, ho0Var9, ho0.j, ho0.k, ho0.h, ho0.i, ho0.f, ho0.g, ho0.e);
        zw0 zw0Var = new zw0();
        ho0[] ho0VarArr = (ho0[]) c0.toArray(new ho0[0]);
        zw0Var.b((ho0[]) Arrays.copyOf(ho0VarArr, ho0VarArr.length));
        ut6 ut6Var = ut6.TLS_1_3;
        ut6 ut6Var2 = ut6.TLS_1_2;
        zw0Var.c(ut6Var, ut6Var2);
        zw0Var.b = true;
        zw0Var.a();
        zw0 zw0Var2 = new zw0();
        ho0[] ho0VarArr2 = (ho0[]) c02.toArray(new ho0[0]);
        zw0Var2.b((ho0[]) Arrays.copyOf(ho0VarArr2, ho0VarArr2.length));
        zw0Var2.c(ut6Var, ut6Var2);
        zw0Var2.b = true;
        e = zw0Var2.a();
        zw0 zw0Var3 = new zw0();
        ho0[] ho0VarArr3 = (ho0[]) c02.toArray(new ho0[0]);
        zw0Var3.b((ho0[]) Arrays.copyOf(ho0VarArr3, ho0VarArr3.length));
        zw0Var3.c(ut6Var, ut6Var2, ut6.TLS_1_1, ut6.TLS_1_0);
        zw0Var3.b = true;
        zw0Var3.a();
        f = new ax0(false, false, null, null);
    }

    public ax0(boolean z, boolean z2, String[] strArr, String[] strArr2) {
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
            enabledCipherSuites = gk7.k(strArr, enabledCipherSuites, ho0.c);
        }
        String[] strArr2 = this.d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            enabledProtocols2.getClass();
            enabledProtocols = gk7.k(enabledProtocols2, strArr2, j34.b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        hd2 hd2Var = ho0.c;
        byte[] bArr = gk7.a;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (hd2Var.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
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
                        ax0 ax0Var = new ax0(z2, this.b, strArr4, (String[]) Arrays.copyOf(strArr5, strArr5.length));
                        if (ax0Var.c() != null) {
                            sSLSocket.setEnabledProtocols(ax0Var.d);
                        }
                        if (ax0Var.b() != null) {
                            sSLSocket.setEnabledCipherSuites(ax0Var.c);
                            return;
                        }
                        return;
                    }
                    i.i("At least one TLS version is required");
                    return;
                }
                i.i("no TLS versions for cleartext connections");
                return;
            }
            i.i("At least one cipher suite is required");
            return;
        }
        i.i("no cipher suites for cleartext connections");
    }

    public final ArrayList b() {
        String[] strArr = this.c;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(ho0.b.o(str));
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
                ut6.Companion.getClass();
                arrayList.add(tt6.a(str));
            }
            return arrayList;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ax0) {
            if (obj != this) {
                ax0 ax0Var = (ax0) obj;
                boolean z = ax0Var.a;
                boolean z2 = this.a;
                if (z2 == z) {
                    if (z2) {
                        if (!Arrays.equals(this.c, ax0Var.c) || !Arrays.equals(this.d, ax0Var.d) || this.b != ax0Var.b) {
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
        return ej6.h(sb, this.b, ')');
    }
}
