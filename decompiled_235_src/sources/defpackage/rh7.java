package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rh7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rh7 implements Runnable {
    public final p87 A;
    public final fz B;
    public final int L;
    public final Runnable R;

    public rh7(p87 p87Var, fz fzVar, int i, Runnable runnable) {
        this.A = p87Var;
        this.B = fzVar;
        this.L = i;
        this.R = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p87 p87Var = this.A;
        i36 i36Var = (i36) p87Var.f;
        fz fzVar = this.B;
        int i = this.L;
        Runnable runnable = this.R;
        try {
            try {
                i36 i36Var2 = (i36) p87Var.c;
                i36Var2.getClass();
                i36Var.n(new j97(i36Var2, 3));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) p87Var.a).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    p87Var.p(fzVar, i);
                } else {
                    i36Var.n(new ei(p87Var, i, 9, fzVar));
                }
                runnable.run();
            } catch (cx6 unused) {
                ((bt) p87Var.d).U(fzVar, i + 1, false);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
