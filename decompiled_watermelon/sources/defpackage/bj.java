package defpackage;

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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bj  reason: default package */
/* loaded from: classes.dex */
public final class bj extends fo4 implements y01 {
    public static final boolean e;
    public Context c;
    public final ArrayList d;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT < 29) {
            z = true;
        } else {
            z = false;
        }
        e = z;
    }

    public bj() {
        pl plVar;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            plVar = new pl(cls);
        } catch (Exception e2) {
            CopyOnWriteArraySet copyOnWriteArraySet = zh.a;
            zh.a(zb4.class.getName(), 5, "unable to load android socket classes", e2);
            plVar = null;
        }
        int i = 0;
        ArrayList o0 = nu.o0(new db6[]{plVar, new lc1(pl.e), new lc1(kx0.a), new lc1(o40.a)});
        ArrayList arrayList = new ArrayList();
        int size = o0.size();
        while (i < size) {
            Object obj = o0.get(i);
            i++;
            if (((db6) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.d = arrayList;
    }

    @Override // defpackage.y01
    public final void a(Context context) {
        this.c = context;
    }

    @Override // defpackage.y01
    public final Context b() {
        return this.c;
    }

    @Override // defpackage.fo4
    public final dk7 c(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        vy6 z10Var;
        md mdVar = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            mdVar = new md(x509TrustManager, x509TrustManagerExtensions);
        }
        if (mdVar != null) {
            return mdVar;
        }
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            z10Var = new aj(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused2) {
            X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
            z10Var = new z10((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
        }
        return new j10(z10Var);
    }

    @Override // defpackage.fo4
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        list.getClass();
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = arrayList.get(i);
                i++;
                if (((db6) obj).a(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        db6 db6Var = (db6) obj;
        if (db6Var != null) {
            db6Var.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.fo4
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        inetSocketAddress.getClass();
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e2);
            }
            throw e2;
        }
    }

    @Override // defpackage.fo4
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = arrayList.get(i);
                i++;
                if (((db6) obj).a(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        db6 db6Var = (db6) obj;
        if (db6Var == null) {
            return null;
        }
        return db6Var.b(sSLSocket);
    }

    @Override // defpackage.fo4
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.fo4
    public final void i(int i, String str, Throwable th) {
        if (i == 5) {
            Log.w("OkHttp", str, th);
        } else {
            Log.i("OkHttp", str, th);
        }
    }

    @Override // defpackage.fo4
    public final SSLContext k() {
        StrictMode.noteSlowCall("newSSLContext");
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.getClass();
        return sSLContext;
    }
}
