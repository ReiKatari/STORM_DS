package gd;

import zc.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l extends q {
    public static final l L = new q();

    @Override // zc.q
    public final void X(cc.g gVar, Runnable runnable) {
        f.R.L.i(runnable, true, false);
    }

    @Override // zc.q
    public final void Y(cc.g gVar, Runnable runnable) {
        f.R.L.i(runnable, true, true);
    }

    @Override // zc.q
    public final q a0(int i2) {
        ed.b.a(i2);
        if (i2 >= k.f5649d) {
            return this;
        }
        return super.a0(i2);
    }

    @Override // zc.q
    public final String toString() {
        return "Dispatchers.IO";
    }
}
