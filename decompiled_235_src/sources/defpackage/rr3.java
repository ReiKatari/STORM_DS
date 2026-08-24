package defpackage;

import java.util.Map;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rr3  reason: default package */
/* loaded from: classes.dex */
public final class rr3 implements q46, o46 {
    public final r46 A;
    public final o46 B;
    public final ka4 L;

    public rr3(q46 q46Var, Map map, o46 o46Var) {
        bg2 bg2Var = new bg2(q46Var, 9);
        nq6 nq6Var = s46.a;
        this.A = new r46(map, bg2Var);
        this.B = o46Var;
        ka4 ka4Var = c66.a;
        this.L = new ka4();
    }

    @Override // defpackage.q46
    public final m44 a(String str, on2 on2Var) {
        return this.A.a(str, on2Var);
    }

    @Override // defpackage.o46
    public final void b(Object obj, zv0 zv0Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-858296452);
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
            this.B.b(obj, zv0Var, xq2Var, i2 & 126);
            boolean h = xq2Var.h(this) | xq2Var.h(obj);
            Object P = xq2Var.P();
            if (h || P == ox0.a) {
                P = new bi2(17, this, obj);
                xq2Var.l0(P);
            }
            mb3.d(obj, (qn2) P, xq2Var);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new rl(this, obj, zv0Var, i, 13);
        }
    }

    @Override // defpackage.q46
    public final boolean c(Object obj) {
        return this.A.c(obj);
    }

    @Override // defpackage.q46
    public final Map d() {
        ka4 ka4Var = this.L;
        Object[] objArr = ka4Var.b;
        long[] jArr = ka4Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.B.f(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return this.A.d();
    }

    @Override // defpackage.q46
    public final Object e(String str) {
        return this.A.e(str);
    }

    @Override // defpackage.o46
    public final void f(Object obj) {
        this.B.f(obj);
    }
}
