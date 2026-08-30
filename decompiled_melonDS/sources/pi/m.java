package pi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: e  reason: collision with root package name */
    public static final m f11755e;

    /* renamed from: f  reason: collision with root package name */
    public static final m f11756f;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11757a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11758b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f11759c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f11760d;

    static {
        k kVar = k.f11746r;
        k kVar2 = k.f11747s;
        k kVar3 = k.f11748t;
        k kVar4 = k.f11741l;
        k kVar5 = k.f11742n;
        k kVar6 = k.m;
        k kVar7 = k.f11743o;
        k kVar8 = k.f11745q;
        k kVar9 = k.f11744p;
        List y10 = p7.t.y(kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9);
        List y11 = p7.t.y(kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, k.f11739j, k.f11740k, k.f11737h, k.f11738i, k.f11735f, k.f11736g, k.f11734e);
        l lVar = new l();
        k[] kVarArr = (k[]) y10.toArray(new k[0]);
        lVar.b((k[]) Arrays.copyOf(kVarArr, kVarArr.length));
        j0 j0Var = j0.TLS_1_3;
        j0 j0Var2 = j0.TLS_1_2;
        lVar.c(j0Var, j0Var2);
        lVar.f11752b = true;
        lVar.a();
        l lVar2 = new l();
        k[] kVarArr2 = (k[]) y11.toArray(new k[0]);
        lVar2.b((k[]) Arrays.copyOf(kVarArr2, kVarArr2.length));
        lVar2.c(j0Var, j0Var2);
        lVar2.f11752b = true;
        f11755e = lVar2.a();
        l lVar3 = new l();
        k[] kVarArr3 = (k[]) y11.toArray(new k[0]);
        lVar3.b((k[]) Arrays.copyOf(kVarArr3, kVarArr3.length));
        lVar3.c(j0Var, j0Var2, j0.TLS_1_1, j0.TLS_1_0);
        lVar3.f11752b = true;
        lVar3.a();
        f11756f = new m(false, false, null, null);
    }

    public m(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f11757a = z10;
        this.f11758b = z11;
        this.f11759c = strArr;
        this.f11760d = strArr2;
    }

    public final void a(SSLSocket sSLSocket, boolean z10) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        enabledCipherSuites.getClass();
        String[] strArr = this.f11759c;
        if (strArr != null) {
            enabledCipherSuites = qi.e.k(strArr, enabledCipherSuites, k.f11732c);
        }
        String[] strArr2 = this.f11760d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            enabledProtocols2.getClass();
            enabledProtocols = qi.e.k(enabledProtocols2, strArr2, bc.b.f2160b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        j jVar = k.f11732c;
        byte[] bArr = qi.e.f12548a;
        int length = supportedCipherSuites.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                if (jVar.compare(supportedCipherSuites[i2], "TLS_FALLBACK_SCSV") == 0) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (z10 && i2 != -1) {
            String str = supportedCipherSuites[i2];
            str.getClass();
            enabledCipherSuites.getClass();
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length);
        boolean z11 = this.f11757a;
        if (z11) {
            if (strArr3.length != 0) {
                String[] strArr4 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
                String[] strArr5 = (String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length);
                if (z11) {
                    if (strArr5.length != 0) {
                        m mVar = new m(z11, this.f11758b, strArr4, (String[]) Arrays.copyOf(strArr5, strArr5.length));
                        if (mVar.c() != null) {
                            sSLSocket.setEnabledProtocols(mVar.f11760d);
                        }
                        if (mVar.b() != null) {
                            sSLSocket.setEnabledCipherSuites(mVar.f11759c);
                            return;
                        }
                        return;
                    }
                    a0.j.h("At least one TLS version is required");
                    return;
                }
                a0.j.h("no TLS versions for cleartext connections");
                return;
            }
            a0.j.h("At least one cipher suite is required");
            return;
        }
        a0.j.h("no cipher suites for cleartext connections");
    }

    public final ArrayList b() {
        String[] strArr = this.f11759c;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(k.f11731b.c(str));
            }
            return arrayList;
        }
        return null;
    }

    public final ArrayList c() {
        String[] strArr = this.f11760d;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                j0.Companion.getClass();
                arrayList.add(i0.a(str));
            }
            return arrayList;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            if (obj != this) {
                m mVar = (m) obj;
                boolean z10 = mVar.f11757a;
                boolean z11 = this.f11757a;
                if (z11 == z10) {
                    if (z11) {
                        if (!Arrays.equals(this.f11759c, mVar.f11759c) || !Arrays.equals(this.f11760d, mVar.f11760d) || this.f11758b != mVar.f11758b) {
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
        int i2;
        if (this.f11757a) {
            int i10 = 0;
            String[] strArr = this.f11759c;
            if (strArr != null) {
                i2 = Arrays.hashCode(strArr);
            } else {
                i2 = 0;
            }
            int i11 = (527 + i2) * 31;
            String[] strArr2 = this.f11760d;
            if (strArr2 != null) {
                i10 = Arrays.hashCode(strArr2);
            }
            return ((i11 + i10) * 31) + (!this.f11758b ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        if (!this.f11757a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f11758b + ')';
    }
}
