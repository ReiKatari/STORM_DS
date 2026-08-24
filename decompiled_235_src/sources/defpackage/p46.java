package defpackage;

import java.util.Map;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p46  reason: default package */
/* loaded from: classes.dex */
public final class p46 implements o46 {
    public static final ap3 X = new ap3(28, new ep3(14, (byte) 0), new gn5(22));
    public final Map A;
    public final ja4 B;
    public q46 L;
    public final ro5 R;

    public p46(Map map) {
        this.A = map;
        long[] jArr = b66.a;
        this.B = new ja4();
        this.R = new ro5(this, 6);
    }

    @Override // defpackage.o46
    public final void b(Object obj, zv0 zv0Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(533563200);
        if ((i & 6) == 0) {
            if (xq2Var.h(obj)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.h(zv0Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.h(this)) {
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
        if (xq2Var.S(i2 & 1, z)) {
            xq2Var.e0(obj);
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                ro5 ro5Var = this.R;
                if (((Boolean) ro5Var.g(obj)).booleanValue()) {
                    nq6 nq6Var = s46.a;
                    u46 u46Var = new u46(new r46((Map) this.A.get(obj), ro5Var));
                    xq2Var.l0(u46Var);
                    P = u46Var;
                } else {
                    u34.A(obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.", "Type of the key ");
                    return;
                }
            }
            u46 u46Var2 = (u46) P;
            hv.e(new pq[]{s46.a.a(u46Var2), dy3.a.a(u46Var2)}, zv0Var, xq2Var, (i2 & 112) | 8);
            boolean h = xq2Var.h(this) | xq2Var.h(obj) | xq2Var.h(u46Var2);
            Object P2 = xq2Var.P();
            if (h || P2 == vs0Var) {
                P2 = new t00(this, obj, u46Var2, 23);
                xq2Var.l0(P2);
            }
            mb3.d(jg7.a, (qn2) P2, xq2Var);
            if (xq2Var.y && xq2Var.G.i == xq2Var.z) {
                xq2Var.z = -1;
                xq2Var.y = false;
            }
            xq2Var.p(false);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new rl(this, obj, zv0Var, i, 25);
        }
    }

    @Override // defpackage.o46
    public final void f(Object obj) {
        if (this.B.k(obj) == null) {
            this.A.remove(obj);
        }
    }
}
