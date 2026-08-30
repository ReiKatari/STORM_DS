package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ra7  reason: default package */
/* loaded from: classes.dex */
public abstract class ra7 {
    public final sa7 a = new sa7();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        sa7 sa7Var = this.a;
        if (sa7Var != null) {
            if (sa7Var.d) {
                sa7.a(autoCloseable);
                return;
            }
            synchronized (sa7Var.a) {
                autoCloseable2 = (AutoCloseable) sa7Var.b.put(str, autoCloseable);
            }
            sa7.a(autoCloseable2);
        }
    }

    public final void b() {
        sa7 sa7Var = this.a;
        if (sa7Var != null && !sa7Var.d) {
            sa7Var.d = true;
            synchronized (sa7Var.a) {
                try {
                    for (AutoCloseable autoCloseable : sa7Var.b.values()) {
                        sa7.a(autoCloseable);
                    }
                    for (AutoCloseable autoCloseable2 : sa7Var.c) {
                        sa7.a(autoCloseable2);
                    }
                    sa7Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        sa7 sa7Var = this.a;
        if (sa7Var != null) {
            synchronized (sa7Var.a) {
                autoCloseable = (AutoCloseable) sa7Var.b.get(str);
            }
            return autoCloseable;
        }
        return null;
    }

    public void d() {
    }
}
