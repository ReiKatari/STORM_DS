package zi;

import aj.h;
import aj.m;
import aj.n;
import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import pi.x;
import q8.r;
import zb.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends f implements e {

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f15148e;

    /* renamed from: c  reason: collision with root package name */
    public Context f15149c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f15150d;

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT < 29) {
            z10 = true;
        } else {
            z10 = false;
        }
        f15148e = z10;
    }

    public d() {
        aj.e eVar;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            eVar = new aj.e(cls);
        } catch (Exception e6) {
            CopyOnWriteArraySet copyOnWriteArraySet = aj.c.f855a;
            aj.c.a(x.class.getName(), 5, "unable to load android socket classes", e6);
            eVar = null;
        }
        int i2 = 0;
        ArrayList v10 = k.v(new n[]{eVar, new m(aj.e.f858e), new m(aj.k.f876a), new m(h.f874a)});
        ArrayList arrayList = new ArrayList();
        int size = v10.size();
        while (i2 < size) {
            Object obj = v10.get(i2);
            i2++;
            if (((n) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.f15150d = arrayList;
    }

    @Override // zi.e
    public final void a(Context context) {
        this.f15149c = context;
    }

    @Override // zi.e
    public final Context b() {
        return this.f15149c;
    }

    @Override // zi.f
    public final r c(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        dj.d bVar;
        aj.b bVar2 = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            bVar2 = new aj.b(x509TrustManager, x509TrustManagerExtensions);
        }
        if (bVar2 != null) {
            return bVar2;
        }
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            bVar = new c(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused2) {
            X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
            bVar = new dj.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
        }
        return new dj.a(bVar);
    }

    @Override // zi.f
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        list.getClass();
        ArrayList arrayList = this.f15150d;
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
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        inetSocketAddress.getClass();
        try {
            socket.connect(inetSocketAddress, i2);
        } catch (ClassCastException e6) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e6);
            }
            throw e6;
        }
    }

    @Override // zi.f
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f15150d;
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
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // zi.f
    public final void i(String str, int i2, Throwable th2) {
        if (i2 == 5) {
            Log.w("OkHttp", str, th2);
        } else {
            Log.i("OkHttp", str, th2);
        }
    }

    @Override // zi.f
    public final SSLContext k() {
        StrictMode.noteSlowCall("newSSLContext");
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.getClass();
        return sSLContext;
    }
}
