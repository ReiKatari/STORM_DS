package zi;

import a6.e2;
import aj.h;
import aj.m;
import aj.n;
import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import android.util.Log;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import q8.r;
import zb.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends f implements e {

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f15143e;

    /* renamed from: c  reason: collision with root package name */
    public Context f15144c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f15145d;

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 29) {
            z10 = true;
        } else {
            z10 = false;
        }
        f15143e = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        Object obj;
        if (Build.VERSION.SDK_INT >= 29) {
            obj = new Object();
        } else {
            obj = null;
        }
        int i2 = 0;
        ArrayList v10 = k.v(new n[]{obj, new m(aj.e.f858e), new m(aj.k.f876a), new m(h.f874a)});
        ArrayList arrayList = new ArrayList();
        int size = v10.size();
        while (i2 < size) {
            Object obj2 = v10.get(i2);
            i2++;
            if (((n) obj2).c()) {
                arrayList.add(obj2);
            }
        }
        this.f15145d = arrayList;
    }

    @Override // zi.e
    public final void a(Context context) {
        this.f15144c = context;
    }

    @Override // zi.e
    public final Context b() {
        return this.f15144c;
    }

    @Override // zi.f
    public final r c(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        aj.b bVar = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            bVar = new aj.b(x509TrustManager, x509TrustManagerExtensions);
        }
        if (bVar != null) {
            return bVar;
        }
        StrictMode.noteSlowCall("buildTrustRootIndex");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new dj.a(new dj.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length)));
    }

    @Override // zi.f
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        list.getClass();
        ArrayList arrayList = this.f15145d;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                obj = arrayList.get(i2);
                i2++;
                if (((n) obj).a(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        n nVar = (n) obj;
        if (nVar != null) {
            nVar.d(sSLSocket, str, list);
        }
    }

    @Override // zi.f
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f15145d;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                obj = arrayList.get(i2);
                i2++;
                if (((n) obj).a(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        n nVar = (n) obj;
        if (nVar == null) {
            return null;
        }
        return nVar.b(sSLSocket);
    }

    @Override // zi.f
    public final Object g() {
        if (Build.VERSION.SDK_INT >= 30) {
            CloseGuard b10 = a.b();
            b10.open("response.body().close()");
            return b10;
        }
        return super.g();
    }

    @Override // zi.f
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // zi.f
    public final void i(String str, int i2, Throwable th2) {
        if (i2 == 5) {
            boolean z10 = d.f15148e;
            Log.w("OkHttp", str, th2);
            return;
        }
        boolean z11 = d.f15148e;
        Log.i("OkHttp", str, th2);
    }

    @Override // zi.f
    public final void j(Object obj, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            obj.getClass();
            e2.j(obj).warnIfOpen();
            return;
        }
        super.j(obj, str);
    }

    @Override // zi.f
    public final SSLContext k() {
        StrictMode.noteSlowCall("newSSLContext");
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.getClass();
        return sSLContext;
    }
}
