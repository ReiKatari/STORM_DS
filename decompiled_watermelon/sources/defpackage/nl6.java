package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nl6  reason: default package */
/* loaded from: classes.dex */
public final class nl6 implements ComponentCallbacks2 {
    public final WeakReference A;
    public Context B;
    public k64 L;
    public boolean R;
    public boolean X = true;

    public nl6(c55 c55Var) {
        this.A = new WeakReference(c55Var);
    }

    public final synchronized void a() {
        k64 vn1Var;
        try {
            c55 c55Var = (c55) this.A.get();
            if (c55Var != null) {
                if (this.L == null) {
                    if (c55Var.d.b) {
                        Context context = c55Var.a;
                        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
                        if (connectivityManager != null && jv3.o(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                            try {
                                vn1Var = new os(connectivityManager, this);
                            } catch (Exception unused) {
                                vn1Var = new vn1(1);
                            }
                        } else {
                            vn1Var = new vn1(1);
                        }
                    } else {
                        vn1Var = new vn1(1);
                    }
                    this.L = vn1Var;
                    this.X = vn1Var.d();
                }
            } else {
                b();
            }
        } catch (Throwable th) {
            throw th;
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
            k64 k64Var = this.L;
            if (k64Var != null) {
                k64Var.shutdown();
            }
            this.A.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (((c55) this.A.get()) == null) {
            b();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i) {
        c55 c55Var = (c55) this.A.get();
        if (c55Var != null) {
            f55 f55Var = (f55) c55Var.c.getValue();
            if (f55Var != null) {
                f55Var.a.b(i);
                f55Var.b.b(i);
            }
        } else {
            b();
        }
    }
}
