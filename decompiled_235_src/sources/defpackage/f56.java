package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f56  reason: default package */
/* loaded from: classes.dex */
public final class f56 {
    public final g56 a;
    public final t46 b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final jd1 c = new jd1(26);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public f56(g56 g56Var, t46 t46Var) {
        this.a = g56Var;
        this.b = t46Var;
    }

    public final void a() {
        g56 g56Var = this.a;
        if (g56Var.getLifecycle().b() == tt3.INITIALIZED) {
            if (!this.e) {
                this.b.c();
                g56Var.getLifecycle().a(new wb4(this, 1));
                this.e = true;
                return;
            }
            i.m("SavedStateRegistry was already attached.");
            return;
        }
        i.m("Restarter must be created only during owner's initialization stage");
    }
}
