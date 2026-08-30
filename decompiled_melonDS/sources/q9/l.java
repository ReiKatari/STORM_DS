package q9;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l implements ComponentCallbacks2 {
    public final WeakReference A;
    public Context B;
    public l9.e L;
    public boolean R;
    public boolean X = true;

    public l(b9.h hVar) {
        this.A = new WeakReference(hVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v5, types: [l9.e] */
    public final synchronized void a() {
        a4.n nVar;
        try {
            b9.h hVar = (b9.h) this.A.get();
            if (hVar != null) {
                if (this.L == null) {
                    if (hVar.f2126d.f12402b) {
                        Context context = hVar.f2123a;
                        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
                        if (connectivityManager != null && aj.g.k(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                            try {
                                nVar = new a4.n(connectivityManager, this);
                            } catch (Exception unused) {
                                nVar = new Object();
                            }
                        } else {
                            nVar = new Object();
                        }
                    } else {
                        nVar = new Object();
                    }
                    this.L = nVar;
                    this.X = nVar.c();
                }
            } else {
                b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b() {
        try {
            if (this.R) {
                return;
            }
            this.R = true;
            Context context = this.B;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            l9.e eVar = this.L;
            if (eVar != null) {
                eVar.shutdown();
            }
            this.A.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (((b9.h) this.A.get()) == null) {
            b();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i2) {
        b9.h hVar = (b9.h) this.A.get();
        if (hVar != null) {
            k9.c cVar = (k9.c) hVar.f2125c.getValue();
            if (cVar != null) {
                cVar.f8096a.l(i2);
                bk.a aVar = cVar.f8097b;
                synchronized (aVar) {
                    if (i2 >= 10 && i2 != 20) {
                        aVar.g();
                    }
                }
            }
        } else {
            b();
        }
    }
}
