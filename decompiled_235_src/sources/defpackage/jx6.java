package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jx6  reason: default package */
/* loaded from: classes.dex */
public final class jx6 implements ComponentCallbacks2 {
    public final WeakReference A;
    public Context B;
    public ye4 L;
    public boolean R;
    public boolean X = true;

    public jx6(pe5 pe5Var) {
        this.A = new WeakReference(pe5Var);
    }

    public final synchronized void a() {
        ye4 w31Var;
        try {
            pe5 pe5Var = (pe5) this.A.get();
            if (pe5Var != null) {
                if (this.L == null) {
                    if (pe5Var.d.b) {
                        Context context = pe5Var.a;
                        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
                        if (connectivityManager != null && ge7.s(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                            try {
                                w31Var = new m44(connectivityManager, this);
                            } catch (Exception unused) {
                                w31Var = new w31(3);
                            }
                        } else {
                            w31Var = new w31(3);
                        }
                    } else {
                        w31Var = new w31(3);
                    }
                    this.L = w31Var;
                    this.X = w31Var.a();
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
            ye4 ye4Var = this.L;
            if (ye4Var != null) {
                ye4Var.shutdown();
            }
            this.A.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (((pe5) this.A.get()) == null) {
            b();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i) {
        pe5 pe5Var = (pe5) this.A.get();
        if (pe5Var != null) {
            se5 se5Var = (se5) pe5Var.c.getValue();
            if (se5Var != null) {
                se5Var.a.b(i);
                se5Var.b.b(i);
            }
        } else {
            b();
        }
    }
}
