package f1;

import android.view.KeyEvent;
import b4.z2;
import h1.a3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class y extends g {
    public v3.t G0;

    @Override // f1.g
    public final v3.h0 S0() {
        return null;
    }

    @Override // f1.g
    public final boolean a1(KeyEvent keyEvent) {
        return false;
    }

    @Override // f1.g
    public final void b1(KeyEvent keyEvent) {
        this.f4552q0.b();
    }

    @Override // f1.g, a4.h2
    public final void g0() {
        super.g0();
        if (this.G0 != null) {
            this.G0 = null;
            V0(false);
        }
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.List, java.lang.Object] */
    @Override // f1.g, a4.h2
    public final void s0(v3.k kVar, v3.l lVar, long j2) {
        super.s0(kVar, lVar, j2);
        if (lVar == v3.l.Main) {
            v3.t tVar = this.G0;
            if (tVar == null) {
                if (a3.e(kVar, true)) {
                    v3.t tVar2 = (v3.t) kVar.f13678a.get(0);
                    tVar2.a();
                    this.G0 = tVar2;
                    if (this.p0) {
                        X0(tVar2.f13693c, false);
                        return;
                    }
                    return;
                }
                return;
            }
            ?? r12 = kVar.f13678a;
            int size = r12.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (!v3.s.c((v3.t) r12.get(i2))) {
                    long W = a4.l.t(this).f295t0.W(((z2) a4.l.h(this, b4.q1.f1929s)).g());
                    long floatToRawIntBits = (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (W >> 32)) - ((int) (j2 >> 32))) / 2.0f) << 32) | (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (W & 4294967295L)) - ((int) (j2 & 4294967295L))) / 2.0f) & 4294967295L);
                    int size2 = r12.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        v3.t tVar3 = (v3.t) r12.get(i10);
                        if (tVar3.b() || v3.s.f(tVar3, j2, floatToRawIntBits)) {
                            this.G0 = null;
                            V0(false);
                            return;
                        }
                    }
                    return;
                }
            }
            ((v3.t) r12.get(0)).a();
            if (this.p0) {
                W0(tVar.f13693c, false);
                this.f4552q0.b();
            }
            this.G0 = null;
        } else if (lVar == v3.l.Final && this.G0 != null) {
            ?? r122 = kVar.f13678a;
            int size3 = r122.size();
            for (int i11 = 0; i11 < size3; i11++) {
                v3.t tVar4 = (v3.t) r122.get(i11);
                if (tVar4.b() && !tVar4.equals(this.G0)) {
                    this.G0 = null;
                    V0(false);
                    return;
                }
            }
        }
    }
}
