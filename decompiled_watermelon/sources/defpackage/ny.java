package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ny  reason: default package */
/* loaded from: classes.dex */
public final class ny {
    public final q9 a;
    public final kc4 b;

    /* JADX WARN: Multi-variable type inference failed */
    public ny(q9 q9Var, kc4 kc4Var) {
        this.a = q9Var;
        this.b = kc4Var;
        if ((q9Var == null ? kc4Var : q9Var) != null) {
            return;
        }
        i.i("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }

    public final void a(b2 b2Var) {
        q9 q9Var = this.a;
        if (q9Var != null) {
            q9.e(q9Var, (ly) b2Var.b);
            return;
        }
        kc4 kc4Var = this.b;
        if (kc4Var != null) {
            kc4Var.b((my) b2Var.a);
        } else {
            i.n("Unreachable");
        }
    }

    public final void b(b2 b2Var) {
        if (this.a != null) {
            ((ly) b2Var.b).e();
        } else if (this.b != null) {
            ((my) b2Var.a).e();
        } else {
            i.n("Unreachable");
        }
    }
}
