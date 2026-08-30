package l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h0 implements b2 {

    /* renamed from: a  reason: collision with root package name */
    public final int f8565a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8566b;

    public h0(int i2, int i10) {
        this.f8565a = i2;
        this.f8566b = i10;
    }

    @Override // l1.b2
    public final int a(x4.c cVar) {
        return this.f8566b;
    }

    @Override // l1.b2
    public final int b(x4.c cVar, x4.m mVar) {
        return 0;
    }

    @Override // l1.b2
    public final int c(x4.c cVar, x4.m mVar) {
        return 0;
    }

    @Override // l1.b2
    public final int d(x4.c cVar) {
        return this.f8565a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h0) {
                h0 h0Var = (h0) obj;
                if (this.f8565a == h0Var.f8565a && this.f8566b == h0Var.f8566b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f8565a * 961) + this.f8566b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets(left=0, top=");
        sb2.append(this.f8565a);
        sb2.append(", right=0, bottom=");
        return w.d.p(sb2, this.f8566b, ')');
    }
}
