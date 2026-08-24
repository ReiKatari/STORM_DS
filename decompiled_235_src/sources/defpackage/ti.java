package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ti  reason: default package */
/* loaded from: classes.dex */
public abstract class ti {
    public static final g05 a = new g05(true, y86.Inherit, true, 0);

    public static final void a(final boolean z, final on2 on2Var, a74 a74Var, long j, s76 s76Var, g05 g05Var, final zv0 zv0Var, px0 px0Var, final int i) {
        int i2;
        boolean z2;
        final a74 a74Var2;
        final long j2;
        final s76 s76Var2;
        final g05 g05Var2;
        long floatToRawIntBits;
        s76 U;
        x64 x64Var;
        g05 g05Var3;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1275450738);
        if (xq2Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2 | 208256;
        if ((599187 & i3) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i3 & 1, z2)) {
            xq2Var.X();
            if ((i & 1) != 0 && !xq2Var.B()) {
                xq2Var.V();
                x64Var = a74Var;
                floatToRawIntBits = j;
                U = s76Var;
                g05Var3 = g05Var;
            } else {
                floatToRawIntBits = (Float.floatToRawIntBits(RecyclerView.B1) << 32) | (Float.floatToRawIntBits(RecyclerView.B1) & 4294967295L);
                U = nb3.U(xq2Var);
                x64Var = x64.a;
                g05Var3 = a;
            }
            xq2Var.q();
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = new ta4(Boolean.FALSE);
                xq2Var.l0(P);
            }
            ta4 ta4Var = (ta4) P;
            ta4Var.c.setValue(Boolean.valueOf(z));
            if (!((Boolean) ta4Var.b.getValue()).booleanValue() && !((Boolean) ta4Var.c.getValue()).booleanValue()) {
                xq2Var.b0(-621500880);
                xq2Var.p(false);
                j2 = floatToRawIntBits;
            } else {
                xq2Var.b0(-622294666);
                Object P2 = xq2Var.P();
                if (P2 == vs0Var) {
                    P2 = np2.Y(new i97(i97.b));
                    xq2Var.l0(P2);
                }
                qa4 qa4Var = (qa4) P2;
                qh1 qh1Var = (qh1) xq2Var.j(ky0.h);
                Object P3 = xq2Var.P();
                if (P3 == vs0Var) {
                    P3 = new e4(qa4Var, 1);
                    xq2Var.l0(P3);
                }
                j2 = floatToRawIntBits;
                ak.a(new wp1(floatToRawIntBits, qh1Var, (eo2) P3), on2Var, g05Var3, n16.I(1788768427, new qi(ta4Var, qa4Var, U, x64Var, zv0Var), xq2Var), xq2Var, 3504, 0);
                xq2Var.p(false);
            }
            s76Var2 = U;
            a74Var2 = x64Var;
            g05Var2 = g05Var3;
        } else {
            xq2Var.V();
            a74Var2 = a74Var;
            j2 = j;
            s76Var2 = s76Var;
            g05Var2 = g05Var;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2(z, on2Var, a74Var2, j2, s76Var2, g05Var2, zv0Var, i) { // from class: ri
                public final /* synthetic */ boolean A;
                public final /* synthetic */ on2 B;
                public final /* synthetic */ a74 L;
                public final /* synthetic */ long R;
                public final /* synthetic */ s76 X;
                public final /* synthetic */ g05 Y;
                public final /* synthetic */ zv0 Z;

                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int a0 = ii2.a0(1572913);
                    ti.a(this.A, this.B, this.L, this.R, this.X, this.Y, this.Z, (px0) obj, a0);
                    return jg7.a;
                }
            };
        }
    }

    public static final void b(on2 on2Var, a74 a74Var, boolean z, lq4 lq4Var, fo2 fo2Var, px0 px0Var, int i) {
        int i2;
        boolean z2;
        x64 x64Var;
        boolean z3;
        pq4 pq4Var;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(670540513);
        if (xq2Var.h(on2Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2 | 28080;
        if ((74899 & i3) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i3 & 1, z2)) {
            pq4 pq4Var2 = j44.a;
            int i4 = i3 & 524286;
            x64 x64Var2 = x64.a;
            ln2.b(on2Var, x64Var2, pq4Var2, fo2Var, xq2Var, i4);
            x64Var = x64Var2;
            pq4Var = pq4Var2;
            z3 = true;
        } else {
            xq2Var.V();
            x64Var = a74Var;
            z3 = z;
            pq4Var = lq4Var;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new si(on2Var, x64Var, z3, pq4Var, fo2Var, i);
        }
    }
}
