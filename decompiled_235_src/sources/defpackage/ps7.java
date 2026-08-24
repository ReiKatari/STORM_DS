package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.util.List;
import java.util.WeakHashMap;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ps7  reason: default package */
/* loaded from: classes.dex */
public abstract class ps7 {
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String str, final on2 on2Var, a74 a74Var, List list, eo2 eo2Var, x56 x56Var, final zv0 zv0Var, px0 px0Var, final int i, final int i2) {
        String str2;
        int i3;
        final eo2 eo2Var2;
        int i4;
        final x56 x56Var2;
        boolean z;
        xq2 xq2Var;
        final x64 x64Var;
        final List list2;
        cf5 t;
        x56 x56Var3;
        x64 x64Var2;
        eo2 eo2Var3;
        int i5;
        List list3;
        int i6;
        int i7;
        int i8;
        int i9;
        str.getClass();
        on2Var.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-724428556);
        if ((i & 6) == 0) {
            str2 = str;
            if (xq2Var2.f(str2)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var2.h(on2Var)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        int i10 = i3 | RendererDebugBridge.CAPTURE_HEIGHT;
        if ((i & 3072) == 0) {
            i10 = i3 | 1408;
        }
        int i11 = i2 & 16;
        if (i11 != 0) {
            i10 |= 24576;
        } else if ((i & 24576) == 0) {
            eo2Var2 = eo2Var;
            if (xq2Var2.h(eo2Var2)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i10 |= i4;
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    x56Var2 = x56Var;
                    if (xq2Var2.f(x56Var2)) {
                        i7 = 131072;
                        i10 |= i7;
                    }
                } else {
                    x56Var2 = x56Var;
                }
                i7 = 65536;
                i10 |= i7;
            } else {
                x56Var2 = x56Var;
            }
            if ((1572864 & i) == 0) {
                if (xq2Var2.h(zv0Var)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i10 |= i6;
            }
            if ((599187 & i10) == 599186) {
                z = true;
            } else {
                z = false;
            }
            if (!xq2Var2.S(i10 & 1, z)) {
                xq2Var2.X();
                if ((i & 1) != 0 && !xq2Var2.B()) {
                    xq2Var2.V();
                    int i12 = i10 & (-7169);
                    if ((i2 & 32) != 0) {
                        i12 = i10 & (-465921);
                    }
                    x64Var2 = a74Var;
                    list3 = list;
                    i5 = i12;
                    x56Var3 = x56Var2;
                    eo2Var3 = eo2Var2;
                } else {
                    List c0 = hf.c0(new rq2(null, yh2.O(xq2Var2, R.string.pause_hint_navigate)), new rq2("A", yh2.O(xq2Var2, R.string.pause_hint_accept)), new rq2("B", yh2.O(xq2Var2, R.string.pause_hint_back)));
                    int i13 = i10 & (-7169);
                    if (i11 != 0) {
                        eo2Var2 = null;
                    }
                    int i14 = i2 & 32;
                    x64 x64Var3 = x64.a;
                    if (i14 != 0) {
                        x56Var3 = v56.d(null, xq2Var2, 3);
                        eo2Var3 = eo2Var2;
                        list3 = c0;
                        x64Var2 = x64Var3;
                        i5 = i10 & (-465921);
                    } else {
                        x56Var3 = x56Var2;
                        x64Var2 = x64Var3;
                        eo2Var3 = eo2Var2;
                        i5 = i13;
                        list3 = c0;
                    }
                }
                xq2Var2.q();
                es7 F = bl2.F(xq2Var2);
                long j = F.b;
                WeakHashMap weakHashMap = dv7.w;
                xq2Var = xq2Var2;
                List list4 = list3;
                x56 x56Var4 = x56Var3;
                v56.b(th7.d(xq2Var2).l, x64Var2, x56Var4, n16.I(-235669190, new p4(F, on2Var, str2, eo2Var3, 13), xq2Var2), n16.I(2053807227, new sa5(15, F, list3), xq2Var2), null, null, 0, false, null, RecyclerView.B1, 0L, 0L, 0L, j, 0L, zv0Var, xq2Var, ((i5 >> 3) & 112) | 27648 | ((i5 >> 9) & 896), (i5 << 6) & 234881024, 196576);
                eo2Var2 = eo2Var3;
                list2 = list4;
                x64Var = x64Var2;
                x56Var2 = x56Var4;
            } else {
                xq2Var = xq2Var2;
                xq2Var.V();
                x64Var = a74Var;
                list2 = list;
            }
            t = xq2Var.t();
            if (t == null) {
                t.d = new eo2() { // from class: os7
                    @Override // defpackage.eo2
                    public final Object o(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ps7.a(str, on2Var, x64Var, list2, eo2Var2, x56Var2, zv0Var, (px0) obj, ii2.a0(i | 1), i2);
                        return jg7.a;
                    }
                };
                return;
            }
            return;
        }
        eo2Var2 = eo2Var;
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if ((599187 & i10) == 599186) {
        }
        if (!xq2Var2.S(i10 & 1, z)) {
        }
        t = xq2Var.t();
        if (t == null) {
        }
    }

    public static final Object b(s41 s41Var) {
        nk1 nk1Var;
        x61 x61Var;
        l61 b = s41Var.b();
        yh2.o(b);
        r41 V = np2.V(s41Var);
        if (V instanceof nk1) {
            nk1Var = (nk1) V;
        } else {
            nk1Var = null;
        }
        jg7 jg7Var = jg7.a;
        if (nk1Var == null) {
            x61Var = jg7Var;
        } else {
            n61 n61Var = nk1Var.R;
            if (ok1.c(n61Var, b)) {
                nk1Var.Y = jg7Var;
                nk1Var.L = 1;
                n61Var.k0(b, nk1Var);
            } else {
                l61 N = b.N(new r0(iy7.B));
                nk1Var.Y = jg7Var;
                nk1Var.L = 1;
                n61Var.k0(N, nk1Var);
            }
            x61Var = x61.COROUTINE_SUSPENDED;
        }
        if (x61Var == x61.COROUTINE_SUSPENDED) {
            return x61Var;
        }
        return jg7Var;
    }
}
