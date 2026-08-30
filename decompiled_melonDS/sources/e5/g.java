package e5;

import android.view.View;
import androidx.preference.Preference;
import f5.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class g {
    public int A;
    public float B;
    public int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final d I;
    public final d J;
    public final d K;
    public final d L;
    public final d M;
    public final d N;
    public final d O;
    public final d P;
    public final d[] Q;
    public final ArrayList R;
    public final boolean[] S;
    public f[] T;
    public g U;
    public int V;
    public int W;
    public float X;
    public int Y;
    public int Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f4289a0;

    /* renamed from: b  reason: collision with root package name */
    public f5.c f4290b;

    /* renamed from: b0  reason: collision with root package name */
    public int f4291b0;

    /* renamed from: c  reason: collision with root package name */
    public f5.c f4292c;

    /* renamed from: c0  reason: collision with root package name */
    public int f4293c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f4295d0;

    /* renamed from: e0  reason: collision with root package name */
    public float f4297e0;

    /* renamed from: f0  reason: collision with root package name */
    public float f4299f0;

    /* renamed from: g0  reason: collision with root package name */
    public View f4301g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f4303h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f4305i0;

    /* renamed from: j  reason: collision with root package name */
    public String f4306j;

    /* renamed from: j0  reason: collision with root package name */
    public String f4307j0;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4308k;

    /* renamed from: k0  reason: collision with root package name */
    public int f4309k0;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4310l;

    /* renamed from: l0  reason: collision with root package name */
    public int f4311l0;
    public boolean m;

    /* renamed from: m0  reason: collision with root package name */
    public final float[] f4312m0;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4313n;

    /* renamed from: n0  reason: collision with root package name */
    public final g[] f4314n0;

    /* renamed from: o  reason: collision with root package name */
    public int f4315o;

    /* renamed from: o0  reason: collision with root package name */
    public final g[] f4316o0;

    /* renamed from: p  reason: collision with root package name */
    public int f4317p;
    public g p0;

    /* renamed from: q  reason: collision with root package name */
    public int f4318q;

    /* renamed from: q0  reason: collision with root package name */
    public g f4319q0;

    /* renamed from: r  reason: collision with root package name */
    public int f4320r;

    /* renamed from: r0  reason: collision with root package name */
    public int f4321r0;

    /* renamed from: s  reason: collision with root package name */
    public int f4322s;

    /* renamed from: s0  reason: collision with root package name */
    public int f4323s0;

    /* renamed from: t  reason: collision with root package name */
    public final int[] f4324t;

    /* renamed from: u  reason: collision with root package name */
    public int f4325u;

    /* renamed from: v  reason: collision with root package name */
    public int f4326v;

    /* renamed from: w  reason: collision with root package name */
    public float f4327w;

    /* renamed from: x  reason: collision with root package name */
    public int f4328x;

    /* renamed from: y  reason: collision with root package name */
    public int f4329y;

    /* renamed from: z  reason: collision with root package name */
    public float f4330z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f4288a = false;

    /* renamed from: d  reason: collision with root package name */
    public f5.m f4294d = null;

    /* renamed from: e  reason: collision with root package name */
    public f5.p f4296e = null;

    /* renamed from: f  reason: collision with root package name */
    public final boolean[] f4298f = {true, true};

    /* renamed from: g  reason: collision with root package name */
    public boolean f4300g = true;

    /* renamed from: h  reason: collision with root package name */
    public int f4302h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f4304i = -1;

    public g() {
        new HashMap();
        this.f4308k = false;
        this.f4310l = false;
        this.m = false;
        this.f4313n = false;
        this.f4315o = -1;
        this.f4317p = -1;
        this.f4318q = 0;
        this.f4320r = 0;
        this.f4322s = 0;
        this.f4324t = new int[2];
        this.f4325u = 0;
        this.f4326v = 0;
        this.f4327w = 1.0f;
        this.f4328x = 0;
        this.f4329y = 0;
        this.f4330z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Preference.DEFAULT_ORDER, Preference.DEFAULT_ORDER};
        this.D = Float.NaN;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        d dVar = new d(this, c.LEFT);
        this.I = dVar;
        d dVar2 = new d(this, c.TOP);
        this.J = dVar2;
        d dVar3 = new d(this, c.RIGHT);
        this.K = dVar3;
        d dVar4 = new d(this, c.BOTTOM);
        this.L = dVar4;
        d dVar5 = new d(this, c.BASELINE);
        this.M = dVar5;
        d dVar6 = new d(this, c.CENTER_X);
        this.N = dVar6;
        d dVar7 = new d(this, c.CENTER_Y);
        this.O = dVar7;
        d dVar8 = new d(this, c.CENTER);
        this.P = dVar8;
        this.Q = new d[]{dVar, dVar3, dVar2, dVar4, dVar5, dVar8};
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.S = new boolean[2];
        f fVar = f.FIXED;
        this.T = new f[]{fVar, fVar};
        this.U = null;
        this.V = 0;
        this.W = 0;
        this.X = 0.0f;
        this.Y = -1;
        this.Z = 0;
        this.f4289a0 = 0;
        this.f4291b0 = 0;
        this.f4297e0 = 0.5f;
        this.f4299f0 = 0.5f;
        this.f4303h0 = 0;
        this.f4305i0 = false;
        this.f4307j0 = null;
        this.f4309k0 = 0;
        this.f4311l0 = 0;
        this.f4312m0 = new float[]{-1.0f, -1.0f};
        this.f4314n0 = new g[]{null, null};
        this.f4316o0 = new g[]{null, null};
        this.p0 = null;
        this.f4319q0 = null;
        this.f4321r0 = -1;
        this.f4323s0 = -1;
        arrayList.add(dVar);
        arrayList.add(dVar2);
        arrayList.add(dVar3);
        arrayList.add(dVar4);
        arrayList.add(dVar6);
        arrayList.add(dVar7);
        arrayList.add(dVar8);
        arrayList.add(dVar5);
    }

    public static void H(int i2, int i10, String str, StringBuilder sb2) {
        if (i2 == i10) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i2);
        sb2.append(",\n");
    }

    public static void I(StringBuilder sb2, String str, float f8, float f10) {
        if (f8 == f10) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f8);
        sb2.append(",\n");
    }

    public static void p(StringBuilder sb2, String str, int i2, int i10, int i11, int i12, int i13, float f8, f fVar) {
        sb2.append(str);
        sb2.append(" :  {\n");
        String obj = fVar.toString();
        if (!f.FIXED.toString().equals(obj)) {
            w.d.B(sb2, "      behavior", " :   ", obj, ",\n");
        }
        H(i2, 0, "      size", sb2);
        H(i10, 0, "      min", sb2);
        H(i11, Preference.DEFAULT_ORDER, "      max", sb2);
        H(i12, 0, "      matchMin", sb2);
        H(i13, 0, "      matchDef", sb2);
        I(sb2, "      matchPercent", f8, 1.0f);
        sb2.append("    },\n");
    }

    public static void q(StringBuilder sb2, String str, d dVar) {
        if (dVar.f4283f == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(dVar.f4283f);
        sb2.append("'");
        if (dVar.f4285h != Integer.MIN_VALUE || dVar.f4284g != 0) {
            sb2.append(",");
            sb2.append(dVar.f4284g);
            if (dVar.f4285h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(dVar.f4285h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    public final boolean A() {
        if (this.f4300g && this.f4303h0 != 8) {
            return true;
        }
        return false;
    }

    public boolean B() {
        if (!this.f4308k) {
            if (!this.I.f4280c || !this.K.f4280c) {
                return false;
            }
            return true;
        }
        return true;
    }

    public boolean C() {
        if (!this.f4310l) {
            if (!this.J.f4280c || !this.L.f4280c) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void D() {
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.U = null;
        this.D = Float.NaN;
        this.V = 0;
        this.W = 0;
        this.X = 0.0f;
        this.Y = -1;
        this.Z = 0;
        this.f4289a0 = 0;
        this.f4291b0 = 0;
        this.f4293c0 = 0;
        this.f4295d0 = 0;
        this.f4297e0 = 0.5f;
        this.f4299f0 = 0.5f;
        f[] fVarArr = this.T;
        f fVar = f.FIXED;
        fVarArr[0] = fVar;
        fVarArr[1] = fVar;
        this.f4301g0 = null;
        this.f4303h0 = 0;
        this.f4309k0 = 0;
        this.f4311l0 = 0;
        float[] fArr = this.f4312m0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f4315o = -1;
        this.f4317p = -1;
        int[] iArr = this.C;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f4320r = 0;
        this.f4322s = 0;
        this.f4327w = 1.0f;
        this.f4330z = 1.0f;
        this.f4326v = Preference.DEFAULT_ORDER;
        this.f4329y = Preference.DEFAULT_ORDER;
        this.f4325u = 0;
        this.f4328x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f4298f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f4300g = true;
        int[] iArr2 = this.f4324t;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f4302h = -1;
        this.f4304i = -1;
    }

    public final void E() {
        g gVar = this.U;
        if (gVar != null && (gVar instanceof h)) {
            ((h) gVar).getClass();
        }
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((d) arrayList.get(i2)).j();
        }
    }

    public final void F() {
        this.f4308k = false;
        this.f4310l = false;
        this.m = false;
        this.f4313n = false;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = (d) arrayList.get(i2);
            dVar.f4280c = false;
            dVar.f4279b = 0;
        }
    }

    public void G(a4.n nVar) {
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.P.k();
        this.N.k();
        this.O.k();
    }

    public final void J(int i2) {
        boolean z10;
        this.f4291b0 = i2;
        if (i2 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E = z10;
    }

    public final void K(int i2, int i10) {
        if (this.f4308k) {
            return;
        }
        this.I.l(i2);
        this.K.l(i10);
        this.Z = i2;
        this.V = i10 - i2;
        this.f4308k = true;
    }

    public final void L(int i2, int i10) {
        if (this.f4310l) {
            return;
        }
        this.J.l(i2);
        this.L.l(i10);
        this.f4289a0 = i2;
        this.W = i10 - i2;
        if (this.E) {
            this.M.l(i2 + this.f4291b0);
        }
        this.f4310l = true;
    }

    public final void M(int i2) {
        this.W = i2;
        int i10 = this.f4295d0;
        if (i2 < i10) {
            this.W = i10;
        }
    }

    public final void N(f fVar) {
        this.T[0] = fVar;
    }

    public final void O(f fVar) {
        this.T[1] = fVar;
    }

    public final void P(int i2) {
        this.V = i2;
        int i10 = this.f4293c0;
        if (i2 < i10) {
            this.V = i10;
        }
    }

    public void Q(boolean z10, boolean z11) {
        int i2;
        int i10;
        f5.m mVar = this.f4294d;
        boolean z12 = z10 & mVar.f4896g;
        f5.p pVar = this.f4296e;
        boolean z13 = z11 & pVar.f4896g;
        int i11 = mVar.f4897h.f4869g;
        int i12 = pVar.f4897h.f4869g;
        int i13 = mVar.f4898i.f4869g;
        int i14 = pVar.f4898i.f4869g;
        int i15 = i14 - i12;
        if (i13 - i11 < 0 || i15 < 0 || i11 == Integer.MIN_VALUE || i11 == Integer.MAX_VALUE || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE) {
            i13 = 0;
            i14 = 0;
            i11 = 0;
            i12 = 0;
        }
        int i16 = i13 - i11;
        int i17 = i14 - i12;
        if (z12) {
            this.Z = i11;
        }
        if (z13) {
            this.f4289a0 = i12;
        }
        if (this.f4303h0 == 8) {
            this.V = 0;
            this.W = 0;
            return;
        }
        if (z12) {
            if (this.T[0] == f.FIXED && i16 < (i10 = this.V)) {
                i16 = i10;
            }
            this.V = i16;
            int i18 = this.f4293c0;
            if (i16 < i18) {
                this.V = i18;
            }
        }
        if (z13) {
            if (this.T[1] == f.FIXED && i17 < (i2 = this.W)) {
                i17 = i2;
            }
            this.W = i17;
            int i19 = this.f4295d0;
            if (i17 < i19) {
                this.W = i19;
            }
        }
    }

    public void R(c5.c cVar, boolean z10) {
        int i2;
        int i10;
        f5.p pVar;
        f5.m mVar;
        cVar.getClass();
        int n10 = c5.c.n(this.I);
        int n11 = c5.c.n(this.J);
        int n12 = c5.c.n(this.K);
        int n13 = c5.c.n(this.L);
        if (z10 && (mVar = this.f4294d) != null) {
            f5.g gVar = mVar.f4897h;
            if (gVar.f4872j) {
                f5.g gVar2 = mVar.f4898i;
                if (gVar2.f4872j) {
                    n10 = gVar.f4869g;
                    n12 = gVar2.f4869g;
                }
            }
        }
        if (z10 && (pVar = this.f4296e) != null) {
            f5.g gVar3 = pVar.f4897h;
            if (gVar3.f4872j) {
                f5.g gVar4 = pVar.f4898i;
                if (gVar4.f4872j) {
                    n11 = gVar3.f4869g;
                    n13 = gVar4.f4869g;
                }
            }
        }
        int i11 = n13 - n11;
        if (n12 - n10 < 0 || i11 < 0 || n10 == Integer.MIN_VALUE || n10 == Integer.MAX_VALUE || n11 == Integer.MIN_VALUE || n11 == Integer.MAX_VALUE || n12 == Integer.MIN_VALUE || n12 == Integer.MAX_VALUE || n13 == Integer.MIN_VALUE || n13 == Integer.MAX_VALUE) {
            n10 = 0;
            n11 = 0;
            n12 = 0;
            n13 = 0;
        }
        int i12 = n12 - n10;
        int i13 = n13 - n11;
        this.Z = n10;
        this.f4289a0 = n11;
        if (this.f4303h0 == 8) {
            this.V = 0;
            this.W = 0;
            return;
        }
        f[] fVarArr = this.T;
        f fVar = fVarArr[0];
        f fVar2 = f.FIXED;
        if (fVar == fVar2 && i12 < (i10 = this.V)) {
            i12 = i10;
        }
        if (fVarArr[1] == fVar2 && i13 < (i2 = this.W)) {
            i13 = i2;
        }
        this.V = i12;
        this.W = i13;
        int i14 = this.f4295d0;
        if (i13 < i14) {
            this.W = i14;
        }
        int i15 = this.f4293c0;
        if (i12 < i15) {
            this.V = i15;
        }
        int i16 = this.f4326v;
        if (i16 > 0 && fVar == f.MATCH_CONSTRAINT) {
            this.V = Math.min(this.V, i16);
        }
        int i17 = this.f4329y;
        if (i17 > 0 && this.T[1] == f.MATCH_CONSTRAINT) {
            this.W = Math.min(this.W, i17);
        }
        int i18 = this.V;
        if (i12 != i18) {
            this.f4302h = i18;
        }
        int i19 = this.W;
        if (i13 != i19) {
            this.f4304i = i19;
        }
    }

    public final void a(h hVar, c5.c cVar, HashSet hashSet, int i2, boolean z10) {
        if (z10) {
            if (hashSet.contains(this)) {
                n.b(hVar, cVar, this);
                hashSet.remove(this);
                b(cVar, hVar.X(64));
            } else {
                return;
            }
        }
        if (i2 == 0) {
            HashSet hashSet2 = this.I.f4278a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f4281d.a(hVar, cVar, hashSet, i2, true);
                }
            }
            HashSet hashSet3 = this.K.f4278a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).f4281d.a(hVar, cVar, hashSet, i2, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.f4278a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((d) it3.next()).f4281d.a(hVar, cVar, hashSet, i2, true);
            }
        }
        HashSet hashSet5 = this.L.f4278a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((d) it4.next()).f4281d.a(hVar, cVar, hashSet, i2, true);
            }
        }
        HashSet hashSet6 = this.M.f4278a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((d) it5.next()).f4281d.a(hVar, cVar, hashSet, i2, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
        if (r13 != 3) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x05e8, code lost:
        if (r59.f4303h0 == r9) goto L276;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0104  */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33, types: [int] */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r13v46, types: [e5.h] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v18 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v16 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(c5.c r60, boolean r61) {
        /*
            Method dump skipped, instructions count: 1936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.g.b(c5.c, boolean):void");
    }

    public boolean c() {
        if (this.f4303h0 != 8) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:218:0x03b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x043d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:346:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(c5.c r30, boolean r31, boolean r32, boolean r33, boolean r34, c5.g r35, c5.g r36, e5.f r37, boolean r38, e5.d r39, e5.d r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, int r51, int r52, int r53, int r54, float r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 1322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.g.d(c5.c, boolean, boolean, boolean, boolean, c5.g, c5.g, e5.f, boolean, e5.d, e5.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void e(c cVar, g gVar, c cVar2, int i2) {
        c cVar3;
        c cVar4;
        boolean z10;
        c cVar5 = c.CENTER;
        if (cVar == cVar5) {
            if (cVar2 == cVar5) {
                c cVar6 = c.LEFT;
                d j2 = j(cVar6);
                c cVar7 = c.RIGHT;
                d j10 = j(cVar7);
                c cVar8 = c.TOP;
                d j11 = j(cVar8);
                c cVar9 = c.BOTTOM;
                d j12 = j(cVar9);
                boolean z11 = true;
                if ((j2 != null && j2.h()) || (j10 != null && j10.h())) {
                    z10 = false;
                } else {
                    e(cVar6, gVar, cVar6, 0);
                    e(cVar7, gVar, cVar7, 0);
                    z10 = true;
                }
                if ((j11 != null && j11.h()) || (j12 != null && j12.h())) {
                    z11 = false;
                } else {
                    e(cVar8, gVar, cVar8, 0);
                    e(cVar9, gVar, cVar9, 0);
                }
                if (z10 && z11) {
                    j(cVar5).a(gVar.j(cVar5), 0);
                    return;
                } else if (z10) {
                    c cVar10 = c.CENTER_X;
                    j(cVar10).a(gVar.j(cVar10), 0);
                    return;
                } else if (z11) {
                    c cVar11 = c.CENTER_Y;
                    j(cVar11).a(gVar.j(cVar11), 0);
                    return;
                } else {
                    return;
                }
            }
            c cVar12 = c.LEFT;
            if (cVar2 != cVar12 && cVar2 != c.RIGHT) {
                c cVar13 = c.TOP;
                if (cVar2 == cVar13 || cVar2 == c.BOTTOM) {
                    e(cVar13, gVar, cVar2, 0);
                    e(c.BOTTOM, gVar, cVar2, 0);
                    j(cVar5).a(gVar.j(cVar2), 0);
                    return;
                }
                return;
            }
            e(cVar12, gVar, cVar2, 0);
            e(c.RIGHT, gVar, cVar2, 0);
            j(cVar5).a(gVar.j(cVar2), 0);
            return;
        }
        c cVar14 = c.CENTER_X;
        if (cVar == cVar14 && (cVar2 == (cVar4 = c.LEFT) || cVar2 == c.RIGHT)) {
            d j13 = j(cVar4);
            d j14 = gVar.j(cVar2);
            d j15 = j(c.RIGHT);
            j13.a(j14, 0);
            j15.a(j14, 0);
            j(cVar14).a(j14, 0);
            return;
        }
        c cVar15 = c.CENTER_Y;
        if (cVar == cVar15 && (cVar2 == (cVar3 = c.TOP) || cVar2 == c.BOTTOM)) {
            d j16 = gVar.j(cVar2);
            j(cVar3).a(j16, 0);
            j(c.BOTTOM).a(j16, 0);
            j(cVar15).a(j16, 0);
        } else if (cVar == cVar14 && cVar2 == cVar14) {
            c cVar16 = c.LEFT;
            j(cVar16).a(gVar.j(cVar16), 0);
            c cVar17 = c.RIGHT;
            j(cVar17).a(gVar.j(cVar17), 0);
            j(cVar14).a(gVar.j(cVar2), 0);
        } else if (cVar == cVar15 && cVar2 == cVar15) {
            c cVar18 = c.TOP;
            j(cVar18).a(gVar.j(cVar18), 0);
            c cVar19 = c.BOTTOM;
            j(cVar19).a(gVar.j(cVar19), 0);
            j(cVar15).a(gVar.j(cVar2), 0);
        } else {
            d j17 = j(cVar);
            d j18 = gVar.j(cVar2);
            if (j17.i(j18)) {
                c cVar20 = c.BASELINE;
                if (cVar == cVar20) {
                    d j19 = j(c.TOP);
                    d j20 = j(c.BOTTOM);
                    if (j19 != null) {
                        j19.j();
                    }
                    if (j20 != null) {
                        j20.j();
                    }
                } else if (cVar != c.TOP && cVar != c.BOTTOM) {
                    if (cVar == c.LEFT || cVar == c.RIGHT) {
                        d j21 = j(cVar5);
                        if (j21.f4283f != j18) {
                            j21.j();
                        }
                        d f8 = j(cVar).f();
                        d j22 = j(cVar14);
                        if (j22.h()) {
                            f8.j();
                            j22.j();
                        }
                    }
                } else {
                    d j23 = j(cVar20);
                    if (j23 != null) {
                        j23.j();
                    }
                    d j24 = j(cVar5);
                    if (j24.f4283f != j18) {
                        j24.j();
                    }
                    d f10 = j(cVar).f();
                    d j25 = j(cVar15);
                    if (j25.h()) {
                        f10.j();
                        j25.j();
                    }
                }
                j17.a(j18, i2);
            }
        }
    }

    public final void f(d dVar, d dVar2, int i2) {
        if (dVar.f4281d == this) {
            e(dVar.f4282e, dVar2.f4281d, dVar2.f4282e, i2);
        }
    }

    public void g(g gVar, HashMap hashMap) {
        g gVar2;
        g gVar3;
        this.f4315o = gVar.f4315o;
        this.f4317p = gVar.f4317p;
        this.f4320r = gVar.f4320r;
        this.f4322s = gVar.f4322s;
        int[] iArr = gVar.f4324t;
        int i2 = iArr[0];
        int[] iArr2 = this.f4324t;
        iArr2[0] = i2;
        iArr2[1] = iArr[1];
        this.f4325u = gVar.f4325u;
        this.f4326v = gVar.f4326v;
        this.f4328x = gVar.f4328x;
        this.f4329y = gVar.f4329y;
        this.f4330z = gVar.f4330z;
        this.A = gVar.A;
        this.B = gVar.B;
        int[] iArr3 = gVar.C;
        this.C = Arrays.copyOf(iArr3, iArr3.length);
        this.D = gVar.D;
        this.E = gVar.E;
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.T = (f[]) Arrays.copyOf(this.T, 2);
        g gVar4 = null;
        if (this.U == null) {
            gVar2 = null;
        } else {
            gVar2 = (g) hashMap.get(gVar.U);
        }
        this.U = gVar2;
        this.V = gVar.V;
        this.W = gVar.W;
        this.X = gVar.X;
        this.Y = gVar.Y;
        this.Z = gVar.Z;
        this.f4289a0 = gVar.f4289a0;
        this.f4291b0 = gVar.f4291b0;
        this.f4293c0 = gVar.f4293c0;
        this.f4295d0 = gVar.f4295d0;
        this.f4297e0 = gVar.f4297e0;
        this.f4299f0 = gVar.f4299f0;
        this.f4301g0 = gVar.f4301g0;
        this.f4303h0 = gVar.f4303h0;
        this.f4305i0 = gVar.f4305i0;
        this.f4307j0 = gVar.f4307j0;
        this.f4309k0 = gVar.f4309k0;
        this.f4311l0 = gVar.f4311l0;
        float[] fArr = gVar.f4312m0;
        float f8 = fArr[0];
        float[] fArr2 = this.f4312m0;
        fArr2[0] = f8;
        fArr2[1] = fArr[1];
        g[] gVarArr = gVar.f4314n0;
        g gVar5 = gVarArr[0];
        g[] gVarArr2 = this.f4314n0;
        gVarArr2[0] = gVar5;
        gVarArr2[1] = gVarArr[1];
        g[] gVarArr3 = gVar.f4316o0;
        g gVar6 = gVarArr3[0];
        g[] gVarArr4 = this.f4316o0;
        gVarArr4[0] = gVar6;
        gVarArr4[1] = gVarArr3[1];
        g gVar7 = gVar.p0;
        if (gVar7 == null) {
            gVar3 = null;
        } else {
            gVar3 = (g) hashMap.get(gVar7);
        }
        this.p0 = gVar3;
        g gVar8 = gVar.f4319q0;
        if (gVar8 != null) {
            gVar4 = (g) hashMap.get(gVar8);
        }
        this.f4319q0 = gVar4;
    }

    public final void h(c5.c cVar) {
        cVar.k(this.I);
        cVar.k(this.J);
        cVar.k(this.K);
        cVar.k(this.L);
        if (this.f4291b0 > 0) {
            cVar.k(this.M);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [f5.t, f5.p] */
    /* JADX WARN: Type inference failed for: r0v3, types: [f5.m, f5.t] */
    public final void i() {
        if (this.f4294d == null) {
            ?? tVar = new t(this);
            tVar.f4897h.f4867e = f5.f.LEFT;
            tVar.f4898i.f4867e = f5.f.RIGHT;
            tVar.f4895f = 0;
            this.f4294d = tVar;
        }
        if (this.f4296e == null) {
            ?? tVar2 = new t(this);
            f5.g gVar = new f5.g(tVar2);
            tVar2.f4881k = gVar;
            tVar2.f4882l = null;
            tVar2.f4897h.f4867e = f5.f.TOP;
            tVar2.f4898i.f4867e = f5.f.BOTTOM;
            gVar.f4867e = f5.f.BASELINE;
            tVar2.f4895f = 1;
            this.f4296e = tVar2;
        }
    }

    public d j(c cVar) {
        switch (e.f4287a[cVar.ordinal()]) {
            case DSiCameraSource.FrontCamera /* 1 */:
                return this.I;
            case 2:
                return this.J;
            case 3:
                return this.K;
            case 4:
                return this.L;
            case l1.c.f8511g /* 5 */:
                return this.M;
            case l1.c.f8509e /* 6 */:
                return this.P;
            case 7:
                return this.N;
            case 8:
                return this.O;
            case l1.c.f8508d /* 9 */:
                return null;
            default:
                throw new AssertionError(cVar.name());
        }
    }

    public final f k(int i2) {
        if (i2 == 0) {
            return this.T[0];
        }
        if (i2 == 1) {
            return this.T[1];
        }
        return null;
    }

    public final int l() {
        if (this.f4303h0 == 8) {
            return 0;
        }
        return this.W;
    }

    public final g m(int i2) {
        d dVar;
        d dVar2;
        if (i2 == 0) {
            d dVar3 = this.K;
            d dVar4 = dVar3.f4283f;
            if (dVar4 != null && dVar4.f4283f == dVar3) {
                return dVar4.f4281d;
            }
            return null;
        } else if (i2 == 1 && (dVar2 = (dVar = this.L).f4283f) != null && dVar2.f4283f == dVar) {
            return dVar2.f4281d;
        } else {
            return null;
        }
    }

    public final g n(int i2) {
        d dVar;
        d dVar2;
        if (i2 == 0) {
            d dVar3 = this.I;
            d dVar4 = dVar3.f4283f;
            if (dVar4 != null && dVar4.f4283f == dVar3) {
                return dVar4.f4281d;
            }
            return null;
        } else if (i2 == 1 && (dVar2 = (dVar = this.J).f4283f) != null && dVar2.f4283f == dVar) {
            return dVar2.f4281d;
        } else {
            return null;
        }
    }

    public void o(StringBuilder sb2) {
        sb2.append("  " + this.f4306j + ":{\n");
        StringBuilder sb3 = new StringBuilder("    actualWidth:");
        sb3.append(this.V);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.W);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.Z);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f4289a0);
        sb2.append("\n");
        q(sb2, "left", this.I);
        q(sb2, "top", this.J);
        q(sb2, "right", this.K);
        q(sb2, "bottom", this.L);
        q(sb2, "baseline", this.M);
        q(sb2, "centerX", this.N);
        q(sb2, "centerY", this.O);
        int i2 = this.V;
        int i10 = this.f4293c0;
        int i11 = this.C[0];
        int i12 = this.f4325u;
        int i13 = this.f4320r;
        float f8 = this.f4327w;
        f fVar = this.T[0];
        float[] fArr = this.f4312m0;
        float f10 = fArr[0];
        p(sb2, "    width", i2, i10, i11, i12, i13, f8, fVar);
        int i14 = this.W;
        int i15 = this.f4295d0;
        int i16 = this.C[1];
        int i17 = this.f4328x;
        int i18 = this.f4322s;
        float f11 = this.f4330z;
        f fVar2 = this.T[1];
        float f12 = fArr[1];
        p(sb2, "    height", i14, i15, i16, i17, i18, f11, fVar2);
        float f13 = this.X;
        int i19 = this.Y;
        if (f13 != 0.0f) {
            sb2.append("    dimensionRatio");
            sb2.append(" :  [");
            sb2.append(f13);
            sb2.append(",");
            sb2.append(i19);
            sb2.append("");
            sb2.append("],\n");
        }
        I(sb2, "    horizontalBias", this.f4297e0, 0.5f);
        I(sb2, "    verticalBias", this.f4299f0, 0.5f);
        H(this.f4309k0, 0, "    horizontalChainStyle", sb2);
        H(this.f4311l0, 0, "    verticalChainStyle", sb2);
        sb2.append("  }");
    }

    public final int r() {
        if (this.f4303h0 == 8) {
            return 0;
        }
        return this.V;
    }

    public final int s() {
        g gVar = this.U;
        if (gVar != null && (gVar instanceof h)) {
            return ((h) gVar).A0 + this.Z;
        }
        return this.Z;
    }

    public final int t() {
        g gVar = this.U;
        if (gVar != null && (gVar instanceof h)) {
            return ((h) gVar).B0 + this.f4289a0;
        }
        return this.f4289a0;
    }

    public String toString() {
        String str = "";
        StringBuilder t5 = w.d.t("");
        if (this.f4307j0 != null) {
            str = w.d.s(new StringBuilder("id: "), this.f4307j0, " ");
        }
        t5.append(str);
        t5.append("(");
        t5.append(this.Z);
        t5.append(", ");
        t5.append(this.f4289a0);
        t5.append(") - (");
        t5.append(this.V);
        t5.append(" x ");
        return w.d.q(t5, this.W, ")");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u(int r5) {
        /*
            r4 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            if (r5 != 0) goto L1b
            e5.d r5 = r4.I
            e5.d r5 = r5.f4283f
            if (r5 == 0) goto Ld
            r5 = r2
            goto Le
        Ld:
            r5 = r1
        Le:
            e5.d r3 = r4.K
            e5.d r3 = r3.f4283f
            if (r3 == 0) goto L16
            r3 = r2
            goto L17
        L16:
            r3 = r1
        L17:
            int r5 = r5 + r3
            if (r5 >= r0) goto L3b
            goto L3a
        L1b:
            e5.d r5 = r4.J
            e5.d r5 = r5.f4283f
            if (r5 == 0) goto L23
            r5 = r2
            goto L24
        L23:
            r5 = r1
        L24:
            e5.d r3 = r4.L
            e5.d r3 = r3.f4283f
            if (r3 == 0) goto L2c
            r3 = r2
            goto L2d
        L2c:
            r3 = r1
        L2d:
            int r5 = r5 + r3
            e5.d r3 = r4.M
            e5.d r3 = r3.f4283f
            if (r3 == 0) goto L36
            r3 = r2
            goto L37
        L36:
            r3 = r1
        L37:
            int r5 = r5 + r3
            if (r5 >= r0) goto L3b
        L3a:
            return r2
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.g.u(int):boolean");
    }

    public final boolean v(int i2, int i10) {
        d dVar;
        d dVar2;
        d dVar3;
        d dVar4;
        if (i2 == 0) {
            d dVar5 = this.I;
            d dVar6 = dVar5.f4283f;
            if (dVar6 != null && dVar6.f4280c && (dVar4 = (dVar3 = this.K).f4283f) != null && dVar4.f4280c) {
                if ((dVar4.d() - dVar3.e()) - (dVar5.e() + dVar5.f4283f.d()) >= i10) {
                    return true;
                }
                return false;
            }
            return false;
        }
        d dVar7 = this.J;
        d dVar8 = dVar7.f4283f;
        if (dVar8 != null && dVar8.f4280c && (dVar2 = (dVar = this.L).f4283f) != null && dVar2.f4280c) {
            if ((dVar2.d() - dVar.e()) - (dVar7.e() + dVar7.f4283f.d()) >= i10) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void w(c cVar, g gVar, c cVar2, int i2, int i10) {
        j(cVar).b(gVar.j(cVar2), i2, i10, true);
    }

    public final boolean x(int i2) {
        d dVar;
        d dVar2;
        int i10 = i2 * 2;
        d[] dVarArr = this.Q;
        d dVar3 = dVarArr[i10];
        d dVar4 = dVar3.f4283f;
        if (dVar4 != null && dVar4.f4283f != dVar3 && (dVar2 = (dVar = dVarArr[i10 + 1]).f4283f) != null && dVar2.f4283f == dVar) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        d dVar = this.I;
        d dVar2 = dVar.f4283f;
        if (dVar2 == null || dVar2.f4283f != dVar) {
            d dVar3 = this.K;
            d dVar4 = dVar3.f4283f;
            if (dVar4 != null && dVar4.f4283f == dVar3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean z() {
        d dVar = this.J;
        d dVar2 = dVar.f4283f;
        if (dVar2 == null || dVar2.f4283f != dVar) {
            d dVar3 = this.L;
            d dVar4 = dVar3.f4283f;
            if (dVar4 != null && dVar4.f4283f == dVar3) {
                return true;
            }
            return false;
        }
        return true;
    }
}
