package defpackage;

import java.util.Map;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kt5  reason: default package */
/* loaded from: classes.dex */
public final class kt5 implements jt5 {
    public static final ci3 X = new ci3(22, new qt0(29), new nh5(11));
    public final Map A;
    public final d24 B;
    public lt5 L;
    public final n95 R;

    public kt5(Map map) {
        this.A = map;
        long[] jArr = wu5.a;
        this.B = new d24();
        this.R = new n95(8, this);
    }

    @Override // defpackage.jt5
    public final void b(Object obj, et0 et0Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(533563200);
        if ((i & 6) == 0) {
            if (sk2Var.h(obj)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var.h(et0Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.h(this)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i2 & 1, z)) {
            sk2Var.a0(obj);
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                n95 n95Var = this.R;
                if (((Boolean) n95Var.n(obj)).booleanValue()) {
                    ye6 ye6Var = nt5.a;
                    ot5 ot5Var = new ot5(new mt5((Map) this.A.get(obj), n95Var));
                    sk2Var.h0(ot5Var);
                    L = ot5Var;
                } else {
                    c44.t(obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.", "Type of the key ");
                    return;
                }
            }
            ot5 ot5Var2 = (ot5) L;
            dk7.b(new dq[]{nt5.a.a(ot5Var2), cr3.a.a(ot5Var2)}, et0Var, sk2Var, (i2 & 112) | 8);
            boolean h = sk2Var.h(this) | sk2Var.h(obj) | sk2Var.h(ot5Var2);
            Object L2 = sk2Var.L();
            if (h || L2 == sn1Var) {
                L2 = new cz(this, obj, ot5Var2, 21);
                sk2Var.h0(L2);
            }
            l.d(o27.a, (mi2) L2, sk2Var);
            if (sk2Var.y && sk2Var.G.i == sk2Var.z) {
                sk2Var.z = -1;
                sk2Var.y = false;
            }
            sk2Var.p(false);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new fl(this, obj, et0Var, i, 19);
        }
    }

    @Override // defpackage.jt5
    public final void f(Object obj) {
        if (this.B.k(obj) == null) {
            this.A.remove(obj);
        }
    }
}
