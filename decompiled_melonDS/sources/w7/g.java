package w7;

import zb.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class g implements t7.c {
    public final v7.b A;
    public final String B;
    public boolean L;

    public g(v7.b bVar, String str) {
        this.A = bVar;
        this.B = str;
    }

    public final void d() {
        if (!this.L) {
            return;
        }
        k.L(21, "statement is closed");
        throw null;
    }

    @Override // t7.c
    public void h() {
        d();
    }

    @Override // t7.c
    public void reset() {
        d();
    }
}
