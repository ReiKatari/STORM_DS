package androidx.lifecycle;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class y0 {

    /* renamed from: a  reason: collision with root package name */
    public final y6.d f1501a = new y6.d();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        y6.d dVar = this.f1501a;
        if (dVar != null) {
            if (dVar.f14785d) {
                y6.d.a(autoCloseable);
                return;
            }
            synchronized (dVar.f14782a) {
                autoCloseable2 = (AutoCloseable) dVar.f14783b.put(str, autoCloseable);
            }
            y6.d.a(autoCloseable2);
        }
    }

    public final void b() {
        y6.d dVar = this.f1501a;
        if (dVar != null && !dVar.f14785d) {
            dVar.f14785d = true;
            synchronized (dVar.f14782a) {
                try {
                    for (AutoCloseable autoCloseable : dVar.f14783b.values()) {
                        y6.d.a(autoCloseable);
                    }
                    for (AutoCloseable autoCloseable2 : dVar.f14784c) {
                        y6.d.a(autoCloseable2);
                    }
                    dVar.f14784c.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        y6.d dVar = this.f1501a;
        if (dVar != null) {
            synchronized (dVar.f14782a) {
                autoCloseable = (AutoCloseable) dVar.f14783b.get(str);
            }
            return autoCloseable;
        }
        return null;
    }

    public void d() {
    }
}
