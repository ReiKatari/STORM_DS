package defpackage;

import android.os.Build;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fo4  reason: default package */
/* loaded from: classes.dex */
public abstract class fo4 {
    public static volatile fo4 a;
    public static final Logger b;

    static {
        fo4 fo4Var;
        try {
            for (Map.Entry entry : zh.b.entrySet()) {
                zh.b((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e) {
            System.err.println("Possibly running android unit test without robolectric");
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            System.err.println("Possibly running android unit test without robolectric");
            e2.printStackTrace();
        }
        fo4 fo4Var2 = null;
        if (rc.e) {
            fo4Var = new rc();
        } else {
            fo4Var = null;
        }
        if (fo4Var == null) {
            if (bj.e) {
                fo4Var2 = new bj();
            }
            fo4Var = fo4Var2;
        }
        if (fo4Var != null) {
            a = fo4Var;
            b = Logger.getLogger(zb4.class.getName());
            return;
        }
        throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
    }

    public abstract dk7 c(X509TrustManager x509TrustManager);

    public abstract void d(SSLSocket sSLSocket, String str, List list);

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        inetSocketAddress.getClass();
        socket.connect(inetSocketAddress, i);
    }

    public abstract String f(SSLSocket sSLSocket);

    public Object g() {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public abstract boolean h(String str);

    public abstract void i(int i, String str, Throwable th);

    public void j(Object obj, String str) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(5, str, (Throwable) obj);
    }

    public abstract SSLContext k();

    public final String toString() {
        return getClass().getSimpleName();
    }
}
