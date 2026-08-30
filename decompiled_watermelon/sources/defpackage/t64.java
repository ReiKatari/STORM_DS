package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t64  reason: default package */
/* loaded from: classes.dex */
public final class t64 extends vy0 {
    public final ConnectivityManager g;
    public final Object h;
    public volatile boolean i;
    public final yy2 j;

    public t64(Context context, nh7 nh7Var) {
        super(context, nh7Var);
        Object systemService = ((Context) this.c).getSystemService("connectivity");
        systemService.getClass();
        this.g = (ConnectivityManager) systemService;
        this.h = new Object();
        this.j = new yy2(2, this);
    }

    @Override // defpackage.vy0
    public final Object d() {
        return s64.a(this.g, this.i);
    }

    @Override // defpackage.vy0
    public final void g() {
        try {
            y70.f().b(s64.a, "Registering network callback");
            ConnectivityManager connectivityManager = this.g;
            yy2 yy2Var = this.j;
            connectivityManager.getClass();
            yy2Var.getClass();
            connectivityManager.registerDefaultNetworkCallback(yy2Var);
        } catch (IllegalArgumentException e) {
            y70.f().e(s64.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            y70.f().e(s64.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // defpackage.vy0
    public final void h() {
        try {
            y70.f().b(s64.a, "Unregistering network callback");
            this.g.unregisterNetworkCallback(this.j);
        } catch (IllegalArgumentException e) {
            y70.f().e(s64.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            y70.f().e(s64.a, "Received exception while unregistering network callback", e2);
        }
    }
}
