package zi;

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
import pi.x;
import q8.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static volatile f f15151a;

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f15152b;

    static {
        f fVar;
        try {
            for (Map.Entry entry : aj.c.f856b.entrySet()) {
                aj.c.b((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e6) {
            System.err.println("Possibly running android unit test without robolectric");
            e6.printStackTrace();
        } catch (UnsatisfiedLinkError e10) {
            System.err.println("Possibly running android unit test without robolectric");
            e10.printStackTrace();
        }
        f fVar2 = null;
        if (b.f15143e) {
            fVar = new b();
        } else {
            fVar = null;
        }
        if (fVar == null) {
            if (d.f15148e) {
                fVar2 = new d();
            }
            fVar = fVar2;
        }
        if (fVar != null) {
            f15151a = fVar;
            f15152b = Logger.getLogger(x.class.getName());
            return;
        }
        throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
    }

    public abstract r c(X509TrustManager x509TrustManager);

    public abstract void d(SSLSocket sSLSocket, String str, List list);

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        inetSocketAddress.getClass();
        socket.connect(inetSocketAddress, i2);
    }

    public abstract String f(SSLSocket sSLSocket);

    public Object g() {
        if (f15152b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public abstract boolean h(String str);

    public abstract void i(String str, int i2, Throwable th2);

    public void j(Object obj, String str) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(str, 5, (Throwable) obj);
    }

    public abstract SSLContext k();

    public final String toString() {
        return getClass().getSimpleName();
    }
}
