package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zl  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zl implements fo2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Object L;

    public /* synthetic */ zl(on2 on2Var, boolean z) {
        this.L = on2Var;
        this.B = z;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        int i2 = this.A;
        Object obj4 = this.L;
        final boolean z2 = this.B;
        switch (i2) {
            case 0:
                final on2 on2Var = (on2) obj4;
                a74 a74Var = (a74) obj;
                ((Integer) obj3).getClass();
                xq2 xq2Var = (xq2) ((px0) obj2);
                xq2Var.b0(-196777734);
                final long j = ((m47) xq2Var.j(n47.a)).a;
                boolean e = xq2Var.e(j) | xq2Var.f(on2Var) | xq2Var.g(z2);
                Object P = xq2Var.P();
                if (e || P == ox0.a) {
                    P = new qn2() { // from class: am
                        @Override // defpackage.qn2
                        public final Object g(Object obj5) {
                            oa0 oa0Var = (oa0) obj5;
                            return oa0Var.b(new sl(0, on2Var, mb3.x(oa0Var, Float.intBitsToFloat((int) (oa0Var.A.e() >> 32)) / 2.0f), new z40(5, j), z2));
                        }
                    };
                    xq2Var.l0(P);
                }
                a74 x = q60.x(a74Var, (qn2) P);
                xq2Var.p(false);
                return x;
            default:
                m3 m3Var = (m3) obj4;
                px0 px0Var = (px0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var2 = (xq2) px0Var;
                if (xq2Var2.S(intValue & 1, z)) {
                    a74 S = ge7.S(x64.a, 4.0f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 14);
                    yt0 a = wt0.a(ju.c, d90.k0, xq2Var2, 0);
                    int hashCode = Long.hashCode(xq2Var2.T);
                    xv4 l = xq2Var2.l();
                    a74 E = l.E(xq2Var2, S);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, ix0.f, a);
                    yh2.K(xq2Var2, ix0.e, l);
                    yh2.K(xq2Var2, ix0.g, Integer.valueOf(hashCode));
                    yh2.F(xq2Var2, ix0.h);
                    yh2.K(xq2Var2, ix0.d, E);
                    if (z2) {
                        i = R.string.challenge_completed;
                    } else {
                        i = R.string.challenge_failed;
                    }
                    String O = yh2.O(xq2Var2, i);
                    nq6 nq6Var = ye7.b;
                    x37.b(O, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, s47.a(((xe7) xq2Var2.j(nq6Var)).l, 0L, 0L, oj2.e0, null, 0L, 0L, null, 16777211), xq2Var2, 0, 3072, 57342);
                    x37.b(m3Var.a.a(), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, ((xe7) xq2Var2.j(nq6Var)).l, xq2Var2, 0, 3072, 57342);
                    xq2Var2.p(true);
                } else {
                    xq2Var2.V();
                }
                return jg7.a;
        }
    }

    public /* synthetic */ zl(boolean z, m3 m3Var) {
        this.B = z;
        this.L = m3Var;
    }
}
