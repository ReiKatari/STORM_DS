package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hi  reason: default package */
/* loaded from: classes.dex */
public abstract class hi {
    public static final dr4 a = new dr4(true, mx5.Inherit, true, 0);

    public static final void a(final boolean z, final ki2 ki2Var, zy3 zy3Var, long j, fw5 fw5Var, dr4 dr4Var, final et0 et0Var, tu0 tu0Var, final int i) {
        int i2;
        boolean z2;
        final zy3 zy3Var2;
        final long j2;
        final fw5 fw5Var2;
        final dr4 dr4Var2;
        long floatToRawIntBits;
        fw5 R;
        wy3 wy3Var;
        dr4 dr4Var3;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1275450738);
        if (sk2Var.g(z)) {
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
        if (sk2Var.O(i3 & 1, z2)) {
            sk2Var.T();
            if ((i & 1) != 0 && !sk2Var.y()) {
                sk2Var.R();
                wy3Var = zy3Var;
                floatToRawIntBits = j;
                R = fw5Var;
                dr4Var3 = dr4Var;
            } else {
                floatToRawIntBits = (Float.floatToRawIntBits(RecyclerView.A1) << 32) | (Float.floatToRawIntBits(RecyclerView.A1) & 4294967295L);
                R = se.R(sk2Var);
                wy3Var = wy3.a;
                dr4Var3 = a;
            }
            sk2Var.q();
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                L = new n24(Boolean.FALSE);
                sk2Var.h0(L);
            }
            n24 n24Var = (n24) L;
            n24Var.c.setValue(Boolean.valueOf(z));
            if (!((Boolean) n24Var.b.getValue()).booleanValue() && !((Boolean) n24Var.c.getValue()).booleanValue()) {
                sk2Var.X(-621500880);
                sk2Var.p(false);
                j2 = floatToRawIntBits;
            } else {
                sk2Var.X(-622294666);
                Object L2 = sk2Var.L();
                if (L2 == sn1Var) {
                    L2 = me2.G(new sw6(sw6.b));
                    sk2Var.h0(L2);
                }
                k24 k24Var = (k24) L2;
                od1 od1Var = (od1) sk2Var.j(ov0.h);
                Object L3 = sk2Var.L();
                if (L3 == sn1Var) {
                    L3 = new e4(k24Var, 1);
                    sk2Var.h0(L3);
                }
                j2 = floatToRawIntBits;
                oj.a(new pl1(floatToRawIntBits, od1Var, (aj2) L3), ki2Var, dr4Var3, ct3.H0(1788768427, new ei(n24Var, k24Var, R, wy3Var, et0Var), sk2Var), sk2Var, 3504, 0);
                sk2Var.p(false);
            }
            fw5Var2 = R;
            zy3Var2 = wy3Var;
            dr4Var2 = dr4Var3;
        } else {
            sk2Var.R();
            zy3Var2 = zy3Var;
            j2 = j;
            fw5Var2 = fw5Var;
            dr4Var2 = dr4Var;
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new aj2(z, ki2Var, zy3Var2, j2, fw5Var2, dr4Var2, et0Var, i) { // from class: fi
                public final /* synthetic */ boolean A;
                public final /* synthetic */ ki2 B;
                public final /* synthetic */ zy3 L;
                public final /* synthetic */ long R;
                public final /* synthetic */ fw5 X;
                public final /* synthetic */ dr4 Y;
                public final /* synthetic */ et0 Z;

                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ep2.I(1572913);
                    hi.a(this.A, this.B, this.L, this.R, this.X, this.Y, this.Z, (tu0) obj, I);
                    return o27.a;
                }
            };
        }
    }

    public static final void b(ki2 ki2Var, zy3 zy3Var, boolean z, ih4 ih4Var, bj2 bj2Var, tu0 tu0Var, int i) {
        int i2;
        boolean z2;
        wy3 wy3Var;
        boolean z3;
        mh4 mh4Var;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(670540513);
        if (sk2Var.h(ki2Var)) {
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
        if (sk2Var.O(i3 & 1, z2)) {
            mh4 mh4Var2 = vw3.a;
            int i4 = i3 & 524286;
            wy3 wy3Var2 = wy3.a;
            gk2.e(ki2Var, wy3Var2, mh4Var2, bj2Var, sk2Var, i4);
            wy3Var = wy3Var2;
            mh4Var = mh4Var2;
            z3 = true;
        } else {
            sk2Var.R();
            wy3Var = zy3Var;
            z3 = z;
            mh4Var = ih4Var;
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new gi(ki2Var, wy3Var, z3, mh4Var, bj2Var, i);
        }
    }
}
