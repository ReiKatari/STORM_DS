package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qc2  reason: default package */
/* loaded from: classes.dex */
public final class qc2 extends ic3 implements mi2 {
    public static final qc2 L = new qc2(1, 0);
    public static final qc2 R = new qc2(1, 1);
    public static final qc2 X = new qc2(1, 2);
    public static final qc2 Y = new qc2(1, 3);
    public static final qc2 Z = new qc2(1, 4);
    public static final qc2 c0 = new qc2(1, 5);
    public static final qc2 d0 = new qc2(1, 6);
    public static final qc2 e0 = new qc2(1, 7);
    public static final qc2 f0 = new qc2(1, 8);
    public static final qc2 g0 = new qc2(1, 9);
    public static final qc2 h0 = new qc2(1, 10);
    public static final qc2 i0 = new qc2(1, 11);
    public static final qc2 j0 = new qc2(1, 12);
    public static final qc2 k0 = new qc2(1, 13);
    public static final qc2 l0 = new qc2(1, 14);
    public static final qc2 m0 = new qc2(1, 15);
    public static final qc2 n0 = new qc2(1, 16);
    public static final qc2 o0 = new qc2(1, 17);
    public static final qc2 p0 = new qc2(1, 18);
    public static final qc2 q0 = new qc2(1, 19);
    public static final qc2 r0 = new qc2(1, 20);
    public static final qc2 s0 = new qc2(1, 21);
    public static final qc2 t0 = new qc2(1, 22);
    public static final qc2 u0 = new qc2(1, 23);
    public final /* synthetic */ int B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc2(n75 n75Var) {
        super(1);
        this.B = 27;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.B;
        boolean z = true;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                dh0 dh0Var = (dh0) obj;
                return o27Var;
            case 1:
                hk1 hk1Var = (hk1) obj;
                return o27Var;
            case 2:
                hk1.q((hk1) obj, xq0.g, 0L, RecyclerView.A1, null, 126);
                return o27Var;
            case 3:
                ao4 ao4Var = (ao4) obj;
                if (ao4Var.D()) {
                    fs3 fs3Var = ao4Var.B;
                    if (!fs3Var.f0) {
                        mi2 d = ao4Var.A.d();
                        d24 d24Var = fs3Var.i0;
                        if (d == null) {
                            if (d24Var != null) {
                                Object[] objArr = d24Var.c;
                                long[] jArr = d24Var.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i2 = 0;
                                    while (true) {
                                        long j = jArr[i2];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                                            for (int i4 = 0; i4 < i3; i4++) {
                                                if ((255 & j) < 128) {
                                                    fs3Var.L0((e24) objArr[(i2 << 3) + i4]);
                                                }
                                                j >>= 8;
                                            }
                                            if (i3 != 8) {
                                            }
                                        }
                                        if (i2 != length) {
                                            i2++;
                                        }
                                    }
                                }
                                d24Var.a();
                            }
                        } else {
                            fs3Var.w0(ao4Var, 9223372034707292159L, 0L);
                            fs3Var.Z = d;
                        }
                    }
                }
                return o27Var;
            case 4:
                vg4 vg4Var = ((m74) obj).I0;
                if (vg4Var != null) {
                    ((tn2) vg4Var).c();
                }
                return o27Var;
            case 5:
                m74 m74Var = (m74) obj;
                vf3 vf3Var = m74Var.j0;
                try {
                    if (m74Var.D()) {
                        m74Var.y1(true);
                    }
                    return o27Var;
                } catch (Throwable th) {
                    vf3Var.Y(th);
                    throw null;
                }
            case ig7.b /* 6 */:
                n94 n94Var = (n94) obj;
                if (n94Var.D()) {
                    n94Var.A.Q();
                }
                return o27Var;
            case 7:
                vf3 vf3Var2 = (vf3) obj;
                if (vf3Var2.H()) {
                    vf3Var2.U(false);
                }
                return o27Var;
            case 8:
                vf3 vf3Var3 = (vf3) obj;
                if (vf3Var3.H()) {
                    vf3Var3.U(false);
                }
                return o27Var;
            case 9:
                vf3 vf3Var4 = (vf3) obj;
                if (vf3Var4.H()) {
                    vf3Var4.S(false);
                }
                return o27Var;
            case 10:
                vf3 vf3Var5 = (vf3) obj;
                if (vf3Var5.H()) {
                    vf3Var5.S(false);
                }
                return o27Var;
            case 11:
                vf3 vf3Var6 = (vf3) obj;
                if (vf3Var6.H()) {
                    vf3.T(vf3Var6, false, 7);
                }
                return o27Var;
            case mj2.L /* 12 */:
                vf3 vf3Var7 = (vf3) obj;
                if (vf3Var7.H()) {
                    vf3.V(vf3Var7, false, 7);
                }
                return o27Var;
            case 13:
                vf3 vf3Var8 = (vf3) obj;
                if (vf3Var8.H()) {
                    vf3Var8.F();
                }
                return o27Var;
            case 14:
                rf5 rf5Var = (rf5) obj;
                return o27Var;
            case ig7.e /* 15 */:
                yq4 yq4Var = (yq4) obj;
                if (yq4Var.isAttachedToWindow()) {
                    yq4Var.q();
                }
                return o27Var;
            case 16:
                xn4 xn4Var = (xn4) obj;
                return o27Var;
            case 17:
                return Integer.valueOf(((tv5) obj).b);
            case 18:
                return Integer.valueOf(((tv5) obj).c.a());
            case 19:
                if (((k02) obj) != k02.Visible) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 20:
                List list = (List) obj;
                return o27Var;
            case 21:
                int i5 = ((gx2) obj).a;
                return o27Var;
            case 22:
                List list2 = (List) obj;
                return o27Var;
            case 23:
                int i6 = ((gx2) obj).a;
                return o27Var;
            case 24:
                return new i33((0 << 32) | (4294967295L & ((int) (((i33) obj).a & 4294967295L))));
            case 25:
                return new i33((((int) (((i33) obj).a >> 32)) << 32) | (0 & 4294967295L));
            case 26:
                return new i33((((int) (((i33) obj).a >> 32)) << 32) | (0 & 4294967295L));
            default:
                ((ms2) obj).getClass();
                return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qc2(int i, int i2) {
        super(i);
        this.B = i2;
    }
}
