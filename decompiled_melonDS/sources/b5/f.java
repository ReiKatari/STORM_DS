package b5;

import q8.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends r {
    @Override // q8.r
    public final void O(g gVar, g gVar2) {
        gVar.f2050b = gVar2;
    }

    @Override // q8.r
    public final void P(g gVar, Thread thread) {
        gVar.f2049a = thread;
    }

    @Override // q8.r
    public final boolean l(h hVar, d dVar, d dVar2) {
        synchronized (hVar) {
            try {
                if (hVar.B == dVar) {
                    hVar.B = dVar2;
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // q8.r
    public final boolean m(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.A == obj) {
                    hVar.A = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // q8.r
    public final boolean n(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.L == gVar) {
                    hVar.L = gVar2;
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
