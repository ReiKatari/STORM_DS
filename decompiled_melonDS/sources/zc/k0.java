package zc;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k0 implements v0 {
    public final boolean A;

    public k0(boolean z10) {
        this.A = z10;
    }

    @Override // zc.v0
    public final boolean d() {
        return this.A;
    }

    @Override // zc.v0
    public final h1 e() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Empty{");
        if (this.A) {
            str = "Active";
        } else {
            str = "New";
        }
        return w.d.r(sb2, str, '}');
    }
}
