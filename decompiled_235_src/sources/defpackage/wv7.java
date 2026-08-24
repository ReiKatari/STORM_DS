package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wv7  reason: default package */
/* loaded from: classes.dex */
public abstract class wv7 {
    public static final void a(a74 a74Var, fu fuVar, iu iuVar, d40 d40Var, int i, int i2, zv0 zv0Var, px0 px0Var, int i3) {
        boolean z;
        d40 d40Var2;
        int i4;
        int i5;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1303174015);
        int i6 = i3 | 224256;
        if ((599187 & i6) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i6 & 1, z)) {
            d40 d40Var3 = d90.h0;
            b(a74Var, fuVar, iuVar, jg2.b, zv0Var, xq2Var, 14380470);
            i4 = Integer.MAX_VALUE;
            i5 = Integer.MAX_VALUE;
            d40Var2 = d40Var3;
        } else {
            xq2Var.V();
            d40Var2 = d40Var;
            i4 = i;
            i5 = i2;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new w3(a74Var, fuVar, iuVar, d40Var2, i4, i5, zv0Var, i3);
        }
    }

    public static final void b(a74 a74Var, fu fuVar, iu iuVar, jg2 jg2Var, zv0 zv0Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i3;
        boolean z8;
        boolean z9;
        boolean z10;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        d40 d40Var = d90.h0;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1956591841);
        if ((i & 6) == 0) {
            if (xq2Var.f(a74Var)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.f(fuVar)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.f(iuVar)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i2 |= i9;
        }
        if ((i & 3072) == 0) {
            if (xq2Var.f(d40Var)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        if ((i & 24576) == 0) {
            if (xq2Var.d(Integer.MAX_VALUE)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i2 |= i7;
        }
        if ((196608 & i) == 0) {
            if (xq2Var.d(Integer.MAX_VALUE)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i2 |= i6;
        }
        if ((1572864 & i) == 0) {
            if (xq2Var.f(jg2Var)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        }
        if ((12582912 & i) == 0) {
            if (xq2Var.h(zv0Var)) {
                i4 = 8388608;
            } else {
                i4 = Compress.MAXWINSIZE;
            }
            i2 |= i4;
        }
        int i12 = i2;
        if ((i12 & 4793491) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i12 & 1, z)) {
            int i13 = i12 & 3670016;
            if (i13 == 1048576) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (z2 || P == vs0Var) {
                P = new gg2(jg2Var.a);
                xq2Var.l0(P);
            }
            gg2 gg2Var = (gg2) P;
            int i14 = i12 >> 3;
            if ((((i14 & 14) ^ 6) > 4 && xq2Var.f(fuVar)) || (i14 & 6) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((((i14 & 112) ^ 48) > 32 && xq2Var.f(iuVar)) || (i14 & 48) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z11 = z3 | z4;
            if ((((i14 & 896) ^ RendererDebugBridge.CAPTURE_HEIGHT) > 256 && xq2Var.f(d40Var)) || (i14 & RendererDebugBridge.CAPTURE_HEIGHT) == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z12 = z11 | z5;
            if ((((i14 & 7168) ^ 3072) > 2048 && xq2Var.d(Integer.MAX_VALUE)) || (i14 & 3072) == 2048) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z13 = z12 | z6;
            if ((((57344 & i14) ^ 24576) > 16384 && xq2Var.d(Integer.MAX_VALUE)) || (i14 & 24576) == 16384) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean f = z13 | z7 | xq2Var.f(gg2Var);
            Object P2 = xq2Var.P();
            if (!f && P2 != vs0Var) {
                i3 = i13;
            } else {
                i3 = i13;
                ig2 ig2Var = new ig2(fuVar, iuVar, fuVar.a(), new l71(d40Var), iuVar.a(), gg2Var);
                xq2Var.l0(ig2Var);
                P2 = ig2Var;
            }
            ig2 ig2Var2 = (ig2) P2;
            if (i3 == 1048576) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((i12 & 29360128) == 8388608) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z14 = z8 | z9;
            if ((i12 & 458752) == 131072) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z15 = z14 | z10;
            Object P3 = xq2Var.P();
            ArrayList arrayList = P3;
            if (z15 || P3 == vs0Var) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new zv0(-1192950673, true, new eq(zv0Var, 3)));
                jg2Var.getClass();
                int i15 = dg2.a[jg2Var.a.ordinal()];
                xq2Var.l0(arrayList2);
                arrayList = arrayList2;
            }
            zv0 zv0Var2 = new zv0(1271844412, true, new o0((List) arrayList, 6));
            boolean f2 = xq2Var.f(ig2Var2);
            Object P4 = xq2Var.P();
            if (f2 || P4 == vs0Var) {
                P4 = new r84(ig2Var2);
                xq2Var.l0(P4);
            }
            e34 e34Var = (e34) P4;
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, a74Var);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, e34Var);
            yh2.K(xq2Var, ix0.e, l);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            zv0Var2.o(xq2Var, 0);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new r4(a74Var, (Object) fuVar, (Object) iuVar, (Object) jg2Var, (ao2) zv0Var, i, 3);
        }
    }

    public static final vv7 c(long j, Set set, Set set2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (om1.a(sm1.b(j), ((om1) obj).A) >= 0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            float f = ((om1) it.next()).A;
            while (it.hasNext()) {
                f = Math.max(f, ((om1) it.next()).A);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : set2) {
                if (om1.a(sm1.a(j), ((om1) obj2).A) >= 0) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                float f2 = ((om1) it2.next()).A;
                while (it2.hasNext()) {
                    f2 = Math.max(f2, ((om1) it2.next()).A);
                }
                return new vv7((int) f, (int) f2);
            }
            fa6.c();
            return null;
        }
        fa6.c();
        return null;
    }

    public static final void d(x24 x24Var, ig2 ig2Var, long j, qn2 qn2Var) {
        if (jx2.v(jx2.t(x24Var)) == RecyclerView.B1) {
            jx2.t(x24Var);
            dx4 y = x24Var.y(j);
            qn2Var.g(y);
            ig2Var.getClass();
            y.d0();
            y.Z();
            return;
        }
        ig2Var.getClass();
        x24Var.V(x24Var.n(Integer.MAX_VALUE));
    }
}
