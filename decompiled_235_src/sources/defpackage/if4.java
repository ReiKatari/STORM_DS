package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: if4  reason: default package */
/* loaded from: classes.dex */
public final class if4 extends a21 {
    public final ConnectivityManager g;
    public final Object h;
    public volatile boolean i;
    public final c53 j;

    public if4(Context context, ow7 ow7Var) {
        super(context, ow7Var);
        Object systemService = ((Context) this.c).getSystemService("connectivity");
        systemService.getClass();
        this.g = (ConnectivityManager) systemService;
        this.h = new Object();
        this.j = new c53(this, 2);
    }

    @Override // defpackage.a21
    public final Object d() {
        return hf4.a(this.g, this.i);
    }

    @Override // defpackage.a21
    public final void g() {
        try {
            ga0.f().b(hf4.a, "Registering network callback");
            ConnectivityManager connectivityManager = this.g;
            c53 c53Var = this.j;
            connectivityManager.getClass();
            c53Var.getClass();
            connectivityManager.registerDefaultNetworkCallback(c53Var);
        } catch (IllegalArgumentException e) {
            ga0.f().e(hf4.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            ga0.f().e(hf4.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // defpackage.a21
    public final void h() {
        try {
            ga0.f().b(hf4.a, "Unregistering network callback");
            this.g.unregisterNetworkCallback(this.j);
        } catch (IllegalArgumentException e) {
            ga0.f().e(hf4.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            ga0.f().e(hf4.a, "Received exception while unregistering network callback", e2);
        }
    }
}
