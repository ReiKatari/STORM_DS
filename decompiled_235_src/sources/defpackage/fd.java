package defpackage;

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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fd  reason: default package */
/* loaded from: classes.dex */
public final class fd extends kx4 implements g41 {
    public static final boolean e;
    public Context c;
    public final ArrayList d;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 29) {
            z = true;
        } else {
            z = false;
        }
        e = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fd() {
        Object obj;
        if (Build.VERSION.SDK_INT >= 29) {
            obj = new Object();
        } else {
            obj = null;
        }
        int i = 0;
        ArrayList C0 = fv.C0(new sm6[]{obj, new mg1(bm.e), new mg1(i01.a), new mg1(r60.a)});
        ArrayList arrayList = new ArrayList();
        int size = C0.size();
        while (i < size) {
            Object obj2 = C0.get(i);
            i++;
            if (((sm6) obj2).b()) {
                arrayList.add(obj2);
            }
        }
        this.d = arrayList;
    }

    @Override // defpackage.g41
    public final void a(Context context) {
        this.c = context;
    }

    @Override // defpackage.g41
    public final Context b() {
        return this.c;
    }

    @Override // defpackage.kx4
    public final q60 c(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        ae aeVar = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            aeVar = new ae(x509TrustManager, x509TrustManagerExtensions);
        }
        if (aeVar != null) {
            return aeVar;
        }
        StrictMode.noteSlowCall("buildTrustRootIndex");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new d30(new t30((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length)));
    }

    @Override // defpackage.kx4
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
                if (((sm6) obj).a(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        sm6 sm6Var = (sm6) obj;
        if (sm6Var != null) {
            sm6Var.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.kx4
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = arrayList.get(i);
                i++;
                if (((sm6) obj).a(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        sm6 sm6Var = (sm6) obj;
        if (sm6Var == null) {
            return null;
        }
        return sm6Var.c(sSLSocket);
    }

    @Override // defpackage.kx4
    public final Object g() {
        if (Build.VERSION.SDK_INT >= 30) {
            CloseGuard j = m2.j();
            j.open("response.body().close()");
            return j;
        }
        return super.g();
    }

    @Override // defpackage.kx4
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.kx4
    public final void i(String str, int i, Throwable th) {
        if (i == 5) {
            boolean z = nj.e;
            Log.w("OkHttp", str, th);
            return;
        }
        boolean z2 = nj.e;
        Log.i("OkHttp", str, th);
    }

    @Override // defpackage.kx4
    public final void j(Object obj, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            obj.getClass();
            m2.k(obj).warnIfOpen();
            return;
        }
        super.j(obj, str);
    }

    @Override // defpackage.kx4
    public final SSLContext k() {
        StrictMode.noteSlowCall("newSSLContext");
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.getClass();
        return sSLContext;
    }
}
