package pi;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends g0 {
    public final ri.e L;
    public final String R;
    public final String X;
    public final fj.a0 Y;

    public c(ri.e eVar, String str, String str2) {
        this.L = eVar;
        this.R = str;
        this.X = str2;
        this.Y = new fj.a0(new d9.b((fj.g0) eVar.L.get(1), this));
    }

    @Override // pi.g0
    public final long d() {
        String str = this.X;
        if (str == null) {
            return -1L;
        }
        byte[] bArr = qi.e.f12548a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // pi.g0
    public final t i() {
        String str = this.R;
        if (str == null) {
            return null;
        }
        vc.f fVar = t.f11790d;
        try {
            return p7.n.i(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // pi.g0
    public final fj.g m() {
        return this.Y;
    }
}
