package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qo7  reason: default package */
/* loaded from: classes.dex */
public abstract class qo7 {
    public final ro7 a = new ro7();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        ro7 ro7Var = this.a;
        if (ro7Var != null) {
            if (ro7Var.d) {
                ro7.a(autoCloseable);
                return;
            }
            synchronized (ro7Var.a) {
                autoCloseable2 = (AutoCloseable) ro7Var.b.put(str, autoCloseable);
            }
            ro7.a(autoCloseable2);
        }
    }

    public final void b() {
        ro7 ro7Var = this.a;
        if (ro7Var != null && !ro7Var.d) {
            ro7Var.d = true;
            synchronized (ro7Var.a) {
                try {
                    for (AutoCloseable autoCloseable : ro7Var.b.values()) {
                        ro7.a(autoCloseable);
                    }
                    for (AutoCloseable autoCloseable2 : ro7Var.c) {
                        ro7.a(autoCloseable2);
                    }
                    ro7Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        ro7 ro7Var = this.a;
        if (ro7Var != null) {
            synchronized (ro7Var.a) {
                autoCloseable = (AutoCloseable) ro7Var.b.get(str);
            }
            return autoCloseable;
        }
        return null;
    }

    public void d() {
    }
}
