package defpackage;

import java.util.Map;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rk3  reason: default package */
/* loaded from: classes.dex */
public final class rk3 implements lt5, jt5 {
    public final mt5 A;
    public final jt5 B;
    public final e24 L;

    public rk3(lt5 lt5Var, Map map, jt5 jt5Var) {
        kb2 kb2Var = new kb2(9, lt5Var);
        ye6 ye6Var = nt5.a;
        this.A = new mt5(map, kb2Var);
        this.B = jt5Var;
        e24 e24Var = xu5.a;
        this.L = new e24();
    }

    @Override // defpackage.lt5
    public final n85 a(String str, ki2 ki2Var) {
        return this.A.a(str, ki2Var);
    }

    @Override // defpackage.jt5
    public final void b(Object obj, et0 et0Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-858296452);
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
            this.B.b(obj, et0Var, sk2Var, i2 & 126);
            boolean h = sk2Var.h(this) | sk2Var.h(obj);
            Object L = sk2Var.L();
            if (h || L == su0.a) {
                L = new gi2(12, this, obj);
                sk2Var.h0(L);
            }
            l.d(obj, (mi2) L, sk2Var);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new fl(this, obj, et0Var, i, 12);
        }
    }

    @Override // defpackage.lt5
    public final boolean c(Object obj) {
        return this.A.c(obj);
    }

    @Override // defpackage.lt5
    public final Map d() {
        e24 e24Var = this.L;
        Object[] objArr = e24Var.b;
        long[] jArr = e24Var.a;
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

    @Override // defpackage.lt5
    public final Object e(String str) {
        return this.A.e(str);
    }

    @Override // defpackage.jt5
    public final void f(Object obj) {
        this.B.f(obj);
    }
}
