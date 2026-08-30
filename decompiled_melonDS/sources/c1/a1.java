package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a1 extends nc.l implements mc.l {
    public final /* synthetic */ int B;
    public final /* synthetic */ b1 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(b1 b1Var, int i2) {
        super(1);
        this.B = i2;
        this.L = b1Var;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        switch (this.B) {
            case 0:
                d1.l1 l1Var = (d1.l1) obj;
                m0 m0Var = m0.PreEnter;
                m0 m0Var2 = m0.Visible;
                boolean b10 = l1Var.b(m0Var, m0Var2);
                Object obj2 = null;
                b1 b1Var = this.L;
                if (b10) {
                    k0 k0Var = b1Var.f2387n0.f2397a.f2523c;
                    if (k0Var != null) {
                        obj2 = k0Var.f2454c;
                    }
                } else if (l1Var.b(m0Var2, m0.PostExit)) {
                    k0 k0Var2 = b1Var.f2388o0.f2403a.f2523c;
                    if (k0Var2 != null) {
                        obj2 = k0Var2.f2454c;
                    }
                } else {
                    obj2 = w0.f2542d;
                }
                if (obj2 == null) {
                    return w0.f2542d;
                }
                return obj2;
            default:
                d1.l1 l1Var2 = (d1.l1) obj;
                m0 m0Var3 = m0.PreEnter;
                m0 m0Var4 = m0.Visible;
                boolean b11 = l1Var2.b(m0Var3, m0Var4);
                b1 b1Var2 = this.L;
                if (b11) {
                    p2 p2Var = b1Var2.f2387n0.f2397a.f2522b;
                    if (p2Var != null) {
                        return p2Var.f2504b;
                    }
                    return w0.f2541c;
                } else if (l1Var2.b(m0Var4, m0.PostExit)) {
                    p2 p2Var2 = b1Var2.f2388o0.f2403a.f2522b;
                    if (p2Var2 != null) {
                        return p2Var2.f2504b;
                    }
                    return w0.f2541c;
                } else {
                    return w0.f2541c;
                }
        }
    }
}
