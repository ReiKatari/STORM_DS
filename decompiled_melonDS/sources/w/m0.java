package w;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements b5.j {
    public final /* synthetic */ p0 A;

    public /* synthetic */ m0(p0 p0Var) {
        this.A = p0Var;
    }

    public void a() {
        p0 p0Var = this.A;
        synchronized (p0Var.f14010a) {
            try {
                if (p0Var.f14019j == n0.OPENED) {
                    p0Var.k(p0Var.f14015f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // b5.j
    public Object h(b5.i iVar) {
        boolean z10;
        String str;
        p0 p0Var = this.A;
        synchronized (p0Var.f14010a) {
            if (p0Var.f14021l == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            p7.m.o("Release completer expected to be null", z10);
            p0Var.f14021l = iVar;
            str = "Release[session=" + p0Var + "]";
        }
        return str;
    }
}
