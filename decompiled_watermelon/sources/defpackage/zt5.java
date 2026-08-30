package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zt5  reason: default package */
/* loaded from: classes.dex */
public final class zt5 {
    public final au5 a;
    public final bz2 b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final vn1 c = new vn1(24);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public zt5(au5 au5Var, bz2 bz2Var) {
        this.a = au5Var;
        this.b = bz2Var;
    }

    public final void a() {
        au5 au5Var = this.a;
        if (au5Var.getLifecycle().b() == qm3.INITIALIZED) {
            if (!this.e) {
                this.b.c();
                au5Var.getLifecycle().a(new p34(1, this));
                this.e = true;
                return;
            }
            i.n("SavedStateRegistry was already attached.");
            return;
        }
        i.n("Restarter must be created only during owner's initialization stage");
    }
}
