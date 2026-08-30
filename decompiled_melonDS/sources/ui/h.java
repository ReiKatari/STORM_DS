package ui;

import fj.a0;
import p7.n;
import pi.g0;
import pi.t;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends g0 {
    public final String L;
    public final long R;
    public final a0 X;

    public h(String str, long j2, a0 a0Var) {
        this.L = str;
        this.R = j2;
        this.X = a0Var;
    }

    @Override // pi.g0
    public final long d() {
        return this.R;
    }

    @Override // pi.g0
    public final t i() {
        String str = this.L;
        if (str == null) {
            return null;
        }
        vc.f fVar = t.f11790d;
        try {
            return n.i(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // pi.g0
    public final fj.g m() {
        return this.X;
    }
}
