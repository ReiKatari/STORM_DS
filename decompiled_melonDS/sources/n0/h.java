package n0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final h f9738a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f9739b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public boolean f9740c;

    public h(h hVar) {
        this.f9738a = hVar;
    }

    public final void a() {
        synchronized (this.f9739b) {
            try {
                if (this.f9740c) {
                    h hVar = this.f9738a;
                    if (hVar != null) {
                        hVar.a();
                    } else {
                        aj.g.s("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    aj.g.y0("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.f9740c = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this.f9739b) {
        }
    }
}
