package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l21  reason: default package */
/* loaded from: classes.dex */
public class l21 {
    public int A;
    public float B;
    public int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final h11 I;
    public final h11 J;
    public final h11 K;
    public final h11 L;
    public final h11 M;
    public final h11 N;
    public final h11 O;
    public final h11 P;
    public final h11[] Q;
    public final ArrayList R;
    public final boolean[] S;
    public k21[] T;
    public l21 U;
    public int V;
    public int W;
    public float X;
    public int Y;
    public int Z;
    public int a0;
    public kl0 b;
    public int b0;
    public kl0 c;
    public int c0;
    public int d0;
    public float e0;
    public float f0;
    public View g0;
    public int h0;
    public boolean i0;
    public String j;
    public String j0;
    public boolean k;
    public int k0;
    public boolean l;
    public int l0;
    public boolean m;
    public final float[] m0;
    public boolean n;
    public final l21[] n0;
    public int o;
    public final l21[] o0;
    public int p;
    public l21 p0;
    public int q;
    public l21 q0;
    public int r;
    public int r0;
    public int s;
    public int s0;
    public final int[] t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;
    public boolean a = false;
    public ly2 d = null;
    public lm7 e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    public l21() {
        new HashMap();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new int[2];
        this.u = 0;
        this.v = 0;
        this.w = 1.0f;
        this.x = 0;
        this.y = 0;
        this.z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = Float.NaN;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        h11 h11Var = new h11(this, g11.LEFT);
        this.I = h11Var;
        h11 h11Var2 = new h11(this, g11.TOP);
        this.J = h11Var2;
        h11 h11Var3 = new h11(this, g11.RIGHT);
        this.K = h11Var3;
        h11 h11Var4 = new h11(this, g11.BOTTOM);
        this.L = h11Var4;
        h11 h11Var5 = new h11(this, g11.BASELINE);
        this.M = h11Var5;
        h11 h11Var6 = new h11(this, g11.CENTER_X);
        this.N = h11Var6;
        h11 h11Var7 = new h11(this, g11.CENTER_Y);
        this.O = h11Var7;
        h11 h11Var8 = new h11(this, g11.CENTER);
        this.P = h11Var8;
        this.Q = new h11[]{h11Var, h11Var3, h11Var2, h11Var4, h11Var5, h11Var8};
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.S = new boolean[2];
        k21 k21Var = k21.FIXED;
        this.T = new k21[]{k21Var, k21Var};
        this.U = null;
        this.V = 0;
        this.W = 0;
        this.X = RecyclerView.B1;
        this.Y = -1;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.e0 = 0.5f;
        this.f0 = 0.5f;
        this.h0 = 0;
        this.i0 = false;
        this.j0 = null;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = new float[]{-1.0f, -1.0f};
        this.n0 = new l21[]{null, null};
        this.o0 = new l21[]{null, null};
        this.p0 = null;
        this.q0 = null;
        this.r0 = -1;
        this.s0 = -1;
        arrayList.add(h11Var);
        arrayList.add(h11Var2);
        arrayList.add(h11Var3);
        arrayList.add(h11Var4);
        arrayList.add(h11Var6);
        arrayList.add(h11Var7);
        arrayList.add(h11Var8);
        arrayList.add(h11Var5);
    }

    public static void H(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void I(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void p(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, k21 k21Var) {
        sb.append(str);
        sb.append(" :  {\n");
        String obj = k21Var.toString();
        if (!k21.FIXED.toString().equals(obj)) {
            i61.B(sb, "      behavior", " :   ", obj, ",\n");
        }
        H(i, 0, "      size", sb);
        H(i2, 0, "      min", sb);
        H(i3, Integer.MAX_VALUE, "      max", sb);
        H(i4, 0, "      matchMin", sb);
        H(i5, 0, "      matchDef", sb);
        I(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void q(StringBuilder sb, String str, h11 h11Var) {
        if (h11Var.f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(h11Var.f);
        sb.append("'");
        if (h11Var.h != Integer.MIN_VALUE || h11Var.g != 0) {
            sb.append(",");
            sb.append(h11Var.g);
            if (h11Var.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(h11Var.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public final boolean A() {
        if (this.g && this.h0 != 8) {
            return true;
        }
        return false;
    }

    public boolean B() {
        if (!this.k) {
            if (!this.I.c || !this.K.c) {
                return false;
            }
            return true;
        }
        return true;
    }

    public boolean C() {
        if (!this.l) {
            if (!this.J.c || !this.L.c) {
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
        this.X = RecyclerView.B1;
        this.Y = -1;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0.5f;
        this.f0 = 0.5f;
        k21[] k21VarArr = this.T;
        k21 k21Var = k21.FIXED;
        k21VarArr[0] = k21Var;
        k21VarArr[1] = k21Var;
        this.g0 = null;
        this.h0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        float[] fArr = this.m0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.o = -1;
        this.p = -1;
        int[] iArr = this.C;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.r = 0;
        this.s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.v = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr2 = this.t;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void E() {
        l21 l21Var = this.U;
        if (l21Var != null && (l21Var instanceof m21)) {
            ((m21) l21Var).getClass();
        }
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((h11) arrayList.get(i)).j();
        }
    }

    public final void F() {
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            h11 h11Var = (h11) arrayList.get(i);
            h11Var.c = false;
            h11Var.b = 0;
        }
    }

    public void G(bt btVar) {
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.P.k();
        this.N.k();
        this.O.k();
    }

    public final void J(int i) {
        boolean z;
        this.b0 = i;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.E = z;
    }

    public final void K(int i, int i2) {
        if (this.k) {
            return;
        }
        this.I.l(i);
        this.K.l(i2);
        this.Z = i;
        this.V = i2 - i;
        this.k = true;
    }

    public final void L(int i, int i2) {
        if (this.l) {
            return;
        }
        this.J.l(i);
        this.L.l(i2);
        this.a0 = i;
        this.W = i2 - i;
        if (this.E) {
            this.M.l(i + this.b0);
        }
        this.l = true;
    }

    public final void M(int i) {
        this.W = i;
        int i2 = this.d0;
        if (i < i2) {
            this.W = i2;
        }
    }

    public final void N(k21 k21Var) {
        this.T[0] = k21Var;
    }

    public final void O(k21 k21Var) {
        this.T[1] = k21Var;
    }

    public final void P(int i) {
        this.V = i;
        int i2 = this.c0;
        if (i < i2) {
            this.V = i2;
        }
    }

    public void Q(boolean z, boolean z2) {
        int i;
        int i2;
        ly2 ly2Var = this.d;
        boolean z3 = z & ly2Var.g;
        lm7 lm7Var = this.e;
        boolean z4 = z2 & lm7Var.g;
        int i3 = ly2Var.h.g;
        int i4 = lm7Var.h.g;
        int i5 = ly2Var.i.g;
        int i6 = lm7Var.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.Z = i3;
        }
        if (z4) {
            this.a0 = i4;
        }
        if (this.h0 == 8) {
            this.V = 0;
            this.W = 0;
            return;
        }
        if (z3) {
            if (this.T[0] == k21.FIXED && i8 < (i2 = this.V)) {
                i8 = i2;
            }
            this.V = i8;
            int i10 = this.c0;
            if (i8 < i10) {
                this.V = i10;
            }
        }
        if (z4) {
            if (this.T[1] == k21.FIXED && i9 < (i = this.W)) {
                i9 = i;
            }
            this.W = i9;
            int i11 = this.d0;
            if (i9 < i11) {
                this.W = i11;
            }
        }
    }

    public void R(jv3 jv3Var, boolean z) {
        int i;
        int i2;
        lm7 lm7Var;
        ly2 ly2Var;
        jv3Var.getClass();
        int n = jv3.n(this.I);
        int n2 = jv3.n(this.J);
        int n3 = jv3.n(this.K);
        int n4 = jv3.n(this.L);
        if (z && (ly2Var = this.d) != null) {
            ci1 ci1Var = ly2Var.h;
            if (ci1Var.j) {
                ci1 ci1Var2 = ly2Var.i;
                if (ci1Var2.j) {
                    n = ci1Var.g;
                    n3 = ci1Var2.g;
                }
            }
        }
        if (z && (lm7Var = this.e) != null) {
            ci1 ci1Var3 = lm7Var.h;
            if (ci1Var3.j) {
                ci1 ci1Var4 = lm7Var.i;
                if (ci1Var4.j) {
                    n2 = ci1Var3.g;
                    n4 = ci1Var4.g;
                }
            }
        }
        int i3 = n4 - n2;
        if (n3 - n < 0 || i3 < 0 || n == Integer.MIN_VALUE || n == Integer.MAX_VALUE || n2 == Integer.MIN_VALUE || n2 == Integer.MAX_VALUE || n3 == Integer.MIN_VALUE || n3 == Integer.MAX_VALUE || n4 == Integer.MIN_VALUE || n4 == Integer.MAX_VALUE) {
            n = 0;
            n2 = 0;
            n3 = 0;
            n4 = 0;
        }
        int i4 = n3 - n;
        int i5 = n4 - n2;
        this.Z = n;
        this.a0 = n2;
        if (this.h0 == 8) {
            this.V = 0;
            this.W = 0;
            return;
        }
        k21[] k21VarArr = this.T;
        k21 k21Var = k21VarArr[0];
        k21 k21Var2 = k21.FIXED;
        if (k21Var == k21Var2 && i4 < (i2 = this.V)) {
            i4 = i2;
        }
        if (k21VarArr[1] == k21Var2 && i5 < (i = this.W)) {
            i5 = i;
        }
        this.V = i4;
        this.W = i5;
        int i6 = this.d0;
        if (i5 < i6) {
            this.W = i6;
        }
        int i7 = this.c0;
        if (i4 < i7) {
            this.V = i7;
        }
        int i8 = this.v;
        if (i8 > 0 && k21Var == k21.MATCH_CONSTRAINT) {
            this.V = Math.min(this.V, i8);
        }
        int i9 = this.y;
        if (i9 > 0 && this.T[1] == k21.MATCH_CONSTRAINT) {
            this.W = Math.min(this.W, i9);
        }
        int i10 = this.V;
        if (i4 != i10) {
            this.h = i10;
        }
        int i11 = this.W;
        if (i5 != i11) {
            this.i = i11;
        }
    }

    public final void a(m21 m21Var, jv3 jv3Var, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (hashSet.contains(this)) {
                n16.q(m21Var, jv3Var, this);
                hashSet.remove(this);
                b(jv3Var, m21Var.X(64));
            } else {
                return;
            }
        }
        if (i == 0) {
            HashSet hashSet2 = this.I.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((h11) it.next()).d.a(m21Var, jv3Var, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.K.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((h11) it2.next()).d.a(m21Var, jv3Var, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((h11) it3.next()).d.a(m21Var, jv3Var, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.L.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((h11) it4.next()).d.a(m21Var, jv3Var, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.M.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((h11) it5.next()).d.a(m21Var, jv3Var, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
        if (r13 != 3) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x05e8, code lost:
        if (r59.h0 == r9) goto L276;
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
    /* JADX WARN: Type inference failed for: r13v46, types: [m21] */
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
    */
    public void b(jv3 jv3Var, boolean z) {
        boolean z2;
        int i;
        ?? r19;
        int i2;
        boolean z3;
        boolean z4;
        int i3;
        boolean z5;
        boolean z6;
        l21 l21Var;
        l21 l21Var2;
        boolean[] zArr;
        h11 h11Var;
        boolean[] zArr2;
        h11 h11Var2;
        h11 h11Var3;
        boolean z7;
        boolean z8;
        boolean z9;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        k21 k21Var;
        k21 k21Var2;
        boolean z10;
        k21 k21Var3;
        boolean z11;
        float f;
        en6 en6Var;
        en6 en6Var2;
        h11 h11Var4;
        int i9;
        int i10;
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        boolean z14;
        k21 k21Var4;
        k21 k21Var5;
        k21 k21Var6;
        boolean z15;
        h11 h11Var5;
        boolean z16;
        boolean z17;
        h11 h11Var6;
        en6 en6Var3;
        k21 k21Var7;
        en6 en6Var4;
        k21 k21Var8;
        h11 h11Var7;
        boolean z18;
        boolean z19;
        boolean z20;
        en6 en6Var5;
        h11 h11Var8;
        en6 en6Var6;
        en6 en6Var7;
        int i13;
        boolean[] zArr3;
        en6 en6Var8;
        en6 en6Var9;
        en6 en6Var10;
        int i14;
        int i15;
        int i16;
        int i17;
        en6 en6Var11;
        en6 en6Var12;
        int i18;
        int i19;
        en6 en6Var13;
        boolean z21;
        ?? r18;
        lm7 lm7Var;
        ci1 ci1Var;
        l21 l21Var3;
        l21 l21Var4;
        en6 en6Var14;
        l21 l21Var5;
        en6 en6Var15;
        k21[] k21VarArr;
        boolean z22;
        ly2 ly2Var;
        ci1 ci1Var2;
        int i20;
        int i21;
        boolean y;
        ?? r12;
        boolean z23;
        ly2 ly2Var2;
        lm7 lm7Var2;
        boolean z24;
        jv3 jv3Var2 = jv3Var;
        h11 h11Var9 = this.I;
        en6 k = jv3Var2.k(h11Var9);
        h11 h11Var10 = this.K;
        en6 k2 = jv3Var2.k(h11Var10);
        h11 h11Var11 = this.J;
        en6 k3 = jv3Var2.k(h11Var11);
        h11 h11Var12 = this.L;
        en6 k4 = jv3Var2.k(h11Var12);
        h11 h11Var13 = this.M;
        en6 k5 = jv3Var2.k(h11Var13);
        l21 l21Var6 = this.U;
        if (l21Var6 != null) {
            k21[] k21VarArr2 = l21Var6.T;
            i2 = 0;
            i2 = 0;
            i = 0;
            i2 = 0;
            k21 k21Var9 = k21VarArr2[0];
            k21 k21Var10 = k21.WRAP_CONTENT;
            if (k21Var9 == k21Var10) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (k21VarArr2[1] == k21Var10) {
                z4 = true;
            } else {
                z4 = false;
            }
            int i22 = this.q;
            if (i22 != 1) {
                boolean z25 = true;
                if (i22 != 2) {
                    z2 = z25;
                    r19 = z25;
                } else {
                    z3 = false;
                    r19 = z25;
                }
            } else {
                r19 = 1;
                z4 = false;
            }
            i3 = this.h0;
            boolean[] zArr4 = this.S;
            boolean z26 = z4;
            if (i3 != 8 && !this.i0) {
                ArrayList arrayList = this.R;
                int size = arrayList.size();
                z5 = z3;
                int i23 = i2;
                while (true) {
                    if (i23 < size) {
                        int i24 = size;
                        HashSet hashSet = ((h11) arrayList.get(i23)).a;
                        if (hashSet != null && hashSet.size() > 0) {
                            break;
                        }
                        i23++;
                        size = i24;
                    } else if (!zArr4[i2] && !zArr4[r19]) {
                        return;
                    }
                }
            } else {
                z5 = z3;
            }
            z6 = this.k;
            if (!z6 || this.l) {
                if (z6) {
                    jv3Var2.d(k, this.Z);
                    jv3Var2.d(k2, this.Z + this.V);
                    if (z5 && (l21Var2 = this.U) != null) {
                        m21 m21Var = (m21) l21Var2;
                        WeakReference weakReference = m21Var.K0;
                        if (weakReference == null || weakReference.get() == null || h11Var9.d() > ((h11) m21Var.K0.get()).d()) {
                            m21Var.K0 = new WeakReference(h11Var9);
                        }
                        WeakReference weakReference2 = m21Var.M0;
                        if (weakReference2 == null || weakReference2.get() == null || h11Var10.d() > ((h11) m21Var.M0.get()).d()) {
                            m21Var.M0 = new WeakReference(h11Var10);
                        }
                    }
                }
                if (this.l) {
                    jv3Var2.d(k3, this.a0);
                    jv3Var2.d(k4, this.a0 + this.W);
                    HashSet hashSet2 = h11Var13.a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        jv3Var2.d(k5, this.a0 + this.b0);
                    }
                    if (z26 && (l21Var = this.U) != null) {
                        m21 m21Var2 = (m21) l21Var;
                        WeakReference weakReference3 = m21Var2.J0;
                        if (weakReference3 == null || weakReference3.get() == null || h11Var11.d() > ((h11) m21Var2.J0.get()).d()) {
                            m21Var2.J0 = new WeakReference(h11Var11);
                        }
                        WeakReference weakReference4 = m21Var2.L0;
                        if (weakReference4 == null || weakReference4.get() == null || h11Var12.d() > ((h11) m21Var2.L0.get()).d()) {
                            m21Var2.L0 = new WeakReference(h11Var12);
                        }
                    }
                }
                if (this.k && this.l) {
                    boolean z27 = i2;
                    this.k = z27;
                    this.l = z27;
                    return;
                }
            }
            zArr = this.f;
            if (!z && (ly2Var2 = this.d) != null && (lm7Var2 = this.e) != null) {
                h11Var = h11Var13;
                ci1 ci1Var3 = ly2Var2.h;
                zArr2 = zArr;
                if (ci1Var3.j && ly2Var2.i.j && lm7Var2.h.j && lm7Var2.i.j) {
                    jv3Var2.d(k, ci1Var3.g);
                    jv3Var2.d(k2, this.d.i.g);
                    jv3Var2.d(k3, this.e.h.g);
                    jv3Var2.d(k4, this.e.i.g);
                    jv3Var2.d(k5, this.e.k.g);
                    if (this.U != null) {
                        if (z5 && zArr2[0] && !y()) {
                            jv3Var2.f(jv3Var2.k(this.U.K), k2, 0, 8);
                        }
                        if (z26 && zArr2[r19] && !z()) {
                            z24 = false;
                            jv3Var2.f(jv3Var2.k(this.U.L), k4, 0, 8);
                            this.k = z24;
                            this.l = z24;
                            return;
                        }
                    }
                    z24 = false;
                    this.k = z24;
                    this.l = z24;
                    return;
                }
            } else {
                h11Var = h11Var13;
                zArr2 = zArr;
            }
            if (this.U == null) {
                if (x(0)) {
                    ((m21) this.U).S(this, 0);
                    y = r19;
                    r12 = y;
                } else {
                    y = y();
                    r12 = r19;
                }
                if (x(r12)) {
                    ((m21) this.U).S(this, r12);
                    z23 = true;
                } else {
                    z23 = z();
                }
                if (!y && z5 && this.h0 != 8 && h11Var9.f == null && h11Var10.f == null) {
                    h11Var2 = h11Var9;
                    jv3Var2.f(jv3Var2.k(this.U.K), k2, 0, 1);
                } else {
                    h11Var2 = h11Var9;
                }
                if (!z23 && z26 && this.h0 != 8 && h11Var11.f == null && h11Var12.f == null && h11Var == null) {
                    jv3Var2.f(jv3Var2.k(this.U.L), k4, 0, 1);
                }
                h11Var3 = h11Var10;
                z7 = z26;
                z9 = z23;
                z8 = y;
            } else {
                h11Var2 = h11Var9;
                h11Var3 = h11Var10;
                z7 = z26;
                z8 = false;
                z9 = false;
            }
            i4 = this.V;
            i5 = this.c0;
            if (i4 >= i5) {
                i5 = i4;
            }
            i6 = this.W;
            h11 h11Var14 = h11Var3;
            i7 = this.d0;
            if (i6 >= i7) {
                i8 = i7;
            } else {
                i8 = i6;
            }
            k21[] k21VarArr3 = this.T;
            k21Var = k21VarArr3[0];
            boolean z28 = z7;
            k21Var2 = k21.MATCH_CONSTRAINT;
            if (k21Var == k21Var2) {
                z10 = true;
            } else {
                z10 = false;
            }
            k21Var3 = k21VarArr3[1];
            if (k21Var3 == k21Var2) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i25 = this.Y;
            this.A = i25;
            f = this.X;
            this.B = f;
            int i26 = this.r;
            int i27 = this.s;
            if (f <= RecyclerView.B1) {
                en6Var = k4;
                if (this.h0 != 8) {
                    if (k21Var == k21Var2 && i26 == 0) {
                        i10 = 3;
                    } else {
                        i10 = i26;
                    }
                    if (k21Var3 == k21Var2 && i27 == 0) {
                        i21 = 3;
                    } else {
                        i21 = i27;
                    }
                    if (k21Var == k21Var2 && k21Var3 == k21Var2) {
                        en6Var2 = k5;
                        if (i10 == 3 && i21 == 3) {
                            if (i25 == -1) {
                                if (z10 && !z11) {
                                    this.A = 0;
                                } else if (!z10 && z11) {
                                    this.A = 1;
                                    if (i25 == -1) {
                                        this.B = 1.0f / f;
                                    }
                                }
                            }
                            if (this.A == 0 && (!h11Var11.h() || !h11Var12.h())) {
                                this.A = 1;
                            } else if (this.A == 1 && (!h11Var2.h() || !h11Var14.h())) {
                                this.A = 0;
                            }
                            if (this.A == -1 && (!h11Var11.h() || !h11Var12.h() || !h11Var2.h() || !h11Var14.h())) {
                                if (h11Var11.h() && h11Var12.h()) {
                                    this.A = 0;
                                } else if (h11Var2.h() && h11Var14.h()) {
                                    this.B = 1.0f / this.B;
                                    this.A = 1;
                                }
                            }
                            if (this.A == -1) {
                                int i28 = this.u;
                                if (i28 > 0 && this.x == 0) {
                                    this.A = 0;
                                } else if (i28 == 0 && this.x > 0) {
                                    this.B = 1.0f / this.B;
                                    this.A = 1;
                                }
                            }
                            h11Var4 = h11Var;
                            i9 = i8;
                            z12 = true;
                            i11 = i21;
                            int[] iArr = this.t;
                            iArr[0] = i10;
                            iArr[1] = i11;
                            if (!z12) {
                                int i29 = this.A;
                                i12 = -1;
                                if (i29 == 0 || i29 == -1) {
                                    z13 = true;
                                    if (!z12 && ((i20 = this.A) == 1 || i20 == i12)) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    k21Var4 = this.T[0];
                                    k21Var5 = k21.WRAP_CONTENT;
                                    if (k21Var4 != k21Var5 && (this instanceof m21)) {
                                        k21Var6 = k21Var5;
                                        z15 = true;
                                    } else {
                                        k21Var6 = k21Var5;
                                        z15 = false;
                                    }
                                    if (z15) {
                                        i5 = 0;
                                    }
                                    h11Var5 = this.P;
                                    z16 = !h11Var5.h();
                                    z17 = zArr4[0];
                                    boolean z29 = zArr4[1];
                                    en6 en6Var16 = null;
                                    if (this.o != 2 && !this.k) {
                                        if (z && (ly2Var = this.d) != null) {
                                            ci1Var2 = ly2Var.h;
                                            if (!ci1Var2.j && ly2Var.i.j) {
                                                if (z) {
                                                    jv3Var2.d(k, ci1Var2.g);
                                                    jv3Var2.d(k2, this.d.i.g);
                                                    if (this.U != null && z5 && zArr2[0] && !y()) {
                                                        jv3Var2.f(jv3Var2.k(this.U.K), k2, 0, 8);
                                                    }
                                                }
                                            }
                                        }
                                        l21Var4 = this.U;
                                        if (l21Var4 == null) {
                                            en6Var14 = jv3Var2.k(l21Var4.K);
                                        } else {
                                            en6Var14 = null;
                                        }
                                        l21Var5 = this.U;
                                        if (l21Var5 == null) {
                                            en6Var15 = jv3Var2.k(l21Var5.I);
                                        } else {
                                            en6Var15 = null;
                                        }
                                        boolean z30 = zArr2[0];
                                        k21VarArr = this.T;
                                        z19 = z5;
                                        i13 = i10;
                                        k21 k21Var11 = k21VarArr[0];
                                        z18 = z8;
                                        int i30 = this.Z;
                                        int i31 = this.c0;
                                        int i32 = this.C[0];
                                        float f2 = this.e0;
                                        if (k21VarArr[1] != k21Var2) {
                                            z22 = true;
                                        } else {
                                            z22 = false;
                                        }
                                        h11Var7 = h11Var5;
                                        k21Var7 = k21Var2;
                                        boolean z31 = z13;
                                        en6Var4 = k2;
                                        en6Var3 = k;
                                        z20 = z28;
                                        en6Var5 = k3;
                                        h11Var8 = h11Var12;
                                        en6Var6 = en6Var;
                                        en6Var7 = en6Var2;
                                        h11Var6 = h11Var4;
                                        k21Var8 = k21Var6;
                                        zArr3 = zArr2;
                                        jv3Var2 = jv3Var;
                                        d(jv3Var2, true, z19, z20, z30, en6Var15, en6Var14, k21Var11, z15, this.I, this.K, i30, i5, i31, i32, f2, z31, z22, z18, z9, z17, i13, i11, this.u, this.v, this.w, z16);
                                        if (z && (lm7Var = this.e) != null) {
                                            ci1Var = lm7Var.h;
                                            if (ci1Var.j && lm7Var.i.j) {
                                                int i33 = ci1Var.g;
                                                en6Var8 = en6Var5;
                                                jv3Var2.d(en6Var8, i33);
                                                en6Var9 = en6Var6;
                                                jv3Var2.d(en6Var9, this.e.i.g);
                                                en6Var10 = en6Var7;
                                                jv3Var2.d(en6Var10, this.e.k.g);
                                                l21Var3 = this.U;
                                                if (l21Var3 == null && !z9 && z20) {
                                                    i16 = 1;
                                                    i16 = 1;
                                                    if (zArr3[1]) {
                                                        i14 = 0;
                                                        i15 = 8;
                                                        jv3Var2.f(jv3Var2.k(l21Var3.L), en6Var9, 0, 8);
                                                    } else {
                                                        i14 = 0;
                                                        i15 = 8;
                                                    }
                                                } else {
                                                    i14 = 0;
                                                    i15 = 8;
                                                    i16 = 1;
                                                }
                                                i17 = i14;
                                                if (this.p == 2) {
                                                    i17 = i14;
                                                }
                                                if (i17 == 0 && !this.l) {
                                                    if (this.T[i16] == k21Var8 && (this instanceof m21)) {
                                                        i18 = i16;
                                                    } else {
                                                        i18 = i14;
                                                    }
                                                    if (i18 != 0) {
                                                        i19 = i14;
                                                    } else {
                                                        i19 = i9;
                                                    }
                                                    l21 l21Var7 = this.U;
                                                    if (l21Var7 != null) {
                                                        en6Var13 = jv3Var2.k(l21Var7.L);
                                                    } else {
                                                        en6Var13 = null;
                                                    }
                                                    l21 l21Var8 = this.U;
                                                    if (l21Var8 != null) {
                                                        en6Var16 = jv3Var2.k(l21Var8.J);
                                                    }
                                                    int i34 = this.b0;
                                                    if (i34 <= 0) {
                                                        z21 = z16;
                                                    }
                                                    h11 h11Var15 = h11Var6;
                                                    if (h11Var15.f != null) {
                                                        jv3Var2.e(en6Var10, en6Var8, i34, i15);
                                                        jv3Var2.e(en6Var10, jv3Var2.k(h11Var15.f), h11Var15.e(), i15);
                                                        if (z20) {
                                                            jv3Var2.f(en6Var13, jv3Var2.k(h11Var8), i14, 5);
                                                        }
                                                        z21 = i14;
                                                    } else if (this.h0 == i15) {
                                                        jv3Var2.e(en6Var10, en6Var8, h11Var15.e(), i15);
                                                        z21 = z16;
                                                    } else {
                                                        jv3Var2.e(en6Var10, en6Var8, i34, i15);
                                                        z21 = z16;
                                                    }
                                                    boolean z32 = zArr3[i16];
                                                    k21[] k21VarArr4 = this.T;
                                                    int i35 = i14;
                                                    k21 k21Var12 = k21VarArr4[i16];
                                                    int i36 = this.a0;
                                                    int i37 = i16;
                                                    int i38 = this.d0;
                                                    int i39 = this.C[i37];
                                                    float f3 = this.f0;
                                                    if (k21VarArr4[i35] == k21Var7) {
                                                        r18 = i37;
                                                    } else {
                                                        r18 = i35;
                                                    }
                                                    en6Var12 = en6Var9;
                                                    en6Var11 = en6Var8;
                                                    jv3Var2 = jv3Var;
                                                    d(jv3Var2, false, z20, z19, z32, en6Var16, en6Var13, k21Var12, i18, this.J, this.L, i36, i19, i38, i39, f3, z14, r18, z9, z18, z29, i11, i13, this.x, this.y, this.z, z21);
                                                } else {
                                                    en6Var11 = en6Var8;
                                                    en6Var12 = en6Var9;
                                                }
                                                if (z12) {
                                                    int i40 = this.A;
                                                    float f4 = this.B;
                                                    if (i40 == 1) {
                                                        yu l = jv3Var2.l();
                                                        l.d.g(en6Var12, -1.0f);
                                                        l.d.g(en6Var11, 1.0f);
                                                        l.d.g(en6Var4, f4);
                                                        l.d.g(en6Var3, -f4);
                                                        jv3Var2.c(l);
                                                    } else {
                                                        yu l2 = jv3Var2.l();
                                                        l2.d.g(en6Var4, -1.0f);
                                                        l2.d.g(en6Var3, 1.0f);
                                                        l2.d.g(en6Var12, f4);
                                                        l2.d.g(en6Var11, -f4);
                                                        jv3Var2.c(l2);
                                                    }
                                                }
                                                if (h11Var7.h()) {
                                                    h11 h11Var16 = h11Var7;
                                                    l21 l21Var9 = h11Var16.f.d;
                                                    int e = h11Var16.e();
                                                    g11 g11Var = g11.LEFT;
                                                    en6 k6 = jv3Var2.k(j(g11Var));
                                                    g11 g11Var2 = g11.TOP;
                                                    en6 k7 = jv3Var2.k(j(g11Var2));
                                                    g11 g11Var3 = g11.RIGHT;
                                                    en6 k8 = jv3Var2.k(j(g11Var3));
                                                    g11 g11Var4 = g11.BOTTOM;
                                                    en6 k9 = jv3Var2.k(j(g11Var4));
                                                    en6 k10 = jv3Var2.k(l21Var9.j(g11Var));
                                                    en6 k11 = jv3Var2.k(l21Var9.j(g11Var2));
                                                    en6 k12 = jv3Var2.k(l21Var9.j(g11Var3));
                                                    en6 k13 = jv3Var2.k(l21Var9.j(g11Var4));
                                                    yu l3 = jv3Var2.l();
                                                    double radians = (float) Math.toRadians(this.D + 90.0f);
                                                    double sin = Math.sin(radians);
                                                    double d = e;
                                                    l3.d.g(k11, 0.5f);
                                                    l3.d.g(k13, 0.5f);
                                                    l3.d.g(k7, -0.5f);
                                                    l3.d.g(k9, -0.5f);
                                                    l3.b = -((float) (sin * d));
                                                    jv3Var2.c(l3);
                                                    yu l4 = jv3Var2.l();
                                                    float cos = (float) (Math.cos(radians) * d);
                                                    l4.d.g(k10, 0.5f);
                                                    l4.d.g(k12, 0.5f);
                                                    l4.d.g(k6, -0.5f);
                                                    l4.d.g(k8, -0.5f);
                                                    l4.b = -cos;
                                                    jv3Var2.c(l4);
                                                }
                                                this.k = false;
                                                this.l = false;
                                            }
                                        }
                                        en6Var8 = en6Var5;
                                        en6Var9 = en6Var6;
                                        en6Var10 = en6Var7;
                                        i14 = 0;
                                        i15 = 8;
                                        i16 = 1;
                                        i17 = 1;
                                        if (this.p == 2) {
                                        }
                                        if (i17 == 0) {
                                        }
                                        en6Var11 = en6Var8;
                                        en6Var12 = en6Var9;
                                        if (z12) {
                                        }
                                        if (h11Var7.h()) {
                                        }
                                        this.k = false;
                                        this.l = false;
                                    }
                                    h11Var6 = h11Var4;
                                    en6Var3 = k;
                                    k21Var7 = k21Var2;
                                    en6Var4 = k2;
                                    k21Var8 = k21Var6;
                                    h11Var7 = h11Var5;
                                    z18 = z8;
                                    z19 = z5;
                                    z20 = z28;
                                    en6Var5 = k3;
                                    h11Var8 = h11Var12;
                                    en6Var6 = en6Var;
                                    en6Var7 = en6Var2;
                                    i13 = i10;
                                    zArr3 = zArr2;
                                    if (z) {
                                        ci1Var = lm7Var.h;
                                        if (ci1Var.j) {
                                            int i332 = ci1Var.g;
                                            en6Var8 = en6Var5;
                                            jv3Var2.d(en6Var8, i332);
                                            en6Var9 = en6Var6;
                                            jv3Var2.d(en6Var9, this.e.i.g);
                                            en6Var10 = en6Var7;
                                            jv3Var2.d(en6Var10, this.e.k.g);
                                            l21Var3 = this.U;
                                            if (l21Var3 == null) {
                                            }
                                            i14 = 0;
                                            i15 = 8;
                                            i16 = 1;
                                            i17 = i14;
                                            if (this.p == 2) {
                                            }
                                            if (i17 == 0) {
                                            }
                                            en6Var11 = en6Var8;
                                            en6Var12 = en6Var9;
                                            if (z12) {
                                            }
                                            if (h11Var7.h()) {
                                            }
                                            this.k = false;
                                            this.l = false;
                                        }
                                    }
                                    en6Var8 = en6Var5;
                                    en6Var9 = en6Var6;
                                    en6Var10 = en6Var7;
                                    i14 = 0;
                                    i15 = 8;
                                    i16 = 1;
                                    i17 = 1;
                                    if (this.p == 2) {
                                    }
                                    if (i17 == 0) {
                                    }
                                    en6Var11 = en6Var8;
                                    en6Var12 = en6Var9;
                                    if (z12) {
                                    }
                                    if (h11Var7.h()) {
                                    }
                                    this.k = false;
                                    this.l = false;
                                }
                            } else {
                                i12 = -1;
                            }
                            z13 = false;
                            if (!z12) {
                            }
                            z14 = false;
                            k21Var4 = this.T[0];
                            k21Var5 = k21.WRAP_CONTENT;
                            if (k21Var4 != k21Var5) {
                            }
                            k21Var6 = k21Var5;
                            z15 = false;
                            if (z15) {
                            }
                            h11Var5 = this.P;
                            z16 = !h11Var5.h();
                            z17 = zArr4[0];
                            boolean z292 = zArr4[1];
                            en6 en6Var162 = null;
                            if (this.o != 2) {
                                if (z) {
                                    ci1Var2 = ly2Var.h;
                                    if (!ci1Var2.j) {
                                    }
                                }
                                l21Var4 = this.U;
                                if (l21Var4 == null) {
                                }
                                l21Var5 = this.U;
                                if (l21Var5 == null) {
                                }
                                boolean z302 = zArr2[0];
                                k21VarArr = this.T;
                                z19 = z5;
                                i13 = i10;
                                k21 k21Var112 = k21VarArr[0];
                                z18 = z8;
                                int i302 = this.Z;
                                int i312 = this.c0;
                                int i322 = this.C[0];
                                float f22 = this.e0;
                                if (k21VarArr[1] != k21Var2) {
                                }
                                h11Var7 = h11Var5;
                                k21Var7 = k21Var2;
                                boolean z312 = z13;
                                en6Var4 = k2;
                                en6Var3 = k;
                                z20 = z28;
                                en6Var5 = k3;
                                h11Var8 = h11Var12;
                                en6Var6 = en6Var;
                                en6Var7 = en6Var2;
                                h11Var6 = h11Var4;
                                k21Var8 = k21Var6;
                                zArr3 = zArr2;
                                jv3Var2 = jv3Var;
                                d(jv3Var2, true, z19, z20, z302, en6Var15, en6Var14, k21Var112, z15, this.I, this.K, i302, i5, i312, i322, f22, z312, z22, z18, z9, z17, i13, i11, this.u, this.v, this.w, z16);
                                if (z) {
                                }
                                en6Var8 = en6Var5;
                                en6Var9 = en6Var6;
                                en6Var10 = en6Var7;
                                i14 = 0;
                                i15 = 8;
                                i16 = 1;
                                i17 = 1;
                                if (this.p == 2) {
                                }
                                if (i17 == 0) {
                                }
                                en6Var11 = en6Var8;
                                en6Var12 = en6Var9;
                                if (z12) {
                                }
                                if (h11Var7.h()) {
                                }
                                this.k = false;
                                this.l = false;
                            }
                            h11Var6 = h11Var4;
                            en6Var3 = k;
                            k21Var7 = k21Var2;
                            en6Var4 = k2;
                            k21Var8 = k21Var6;
                            h11Var7 = h11Var5;
                            z18 = z8;
                            z19 = z5;
                            z20 = z28;
                            en6Var5 = k3;
                            h11Var8 = h11Var12;
                            en6Var6 = en6Var;
                            en6Var7 = en6Var2;
                            i13 = i10;
                            zArr3 = zArr2;
                            if (z) {
                            }
                            en6Var8 = en6Var5;
                            en6Var9 = en6Var6;
                            en6Var10 = en6Var7;
                            i14 = 0;
                            i15 = 8;
                            i16 = 1;
                            i17 = 1;
                            if (this.p == 2) {
                            }
                            if (i17 == 0) {
                            }
                            en6Var11 = en6Var8;
                            en6Var12 = en6Var9;
                            if (z12) {
                            }
                            if (h11Var7.h()) {
                            }
                            this.k = false;
                            this.l = false;
                        }
                    } else {
                        en6Var2 = k5;
                    }
                    if (k21Var == k21Var2 && i10 == 3) {
                        this.A = 0;
                        i5 = (int) (i6 * f);
                        h11Var4 = h11Var;
                        i9 = i8;
                        if (k21Var3 != k21Var2) {
                            i10 = 4;
                            z12 = false;
                            i11 = i21;
                            int[] iArr2 = this.t;
                            iArr2[0] = i10;
                            iArr2[1] = i11;
                            if (!z12) {
                            }
                            z13 = false;
                            if (!z12) {
                            }
                            z14 = false;
                            k21Var4 = this.T[0];
                            k21Var5 = k21.WRAP_CONTENT;
                            if (k21Var4 != k21Var5) {
                            }
                            k21Var6 = k21Var5;
                            z15 = false;
                            if (z15) {
                            }
                            h11Var5 = this.P;
                            z16 = !h11Var5.h();
                            z17 = zArr4[0];
                            boolean z2922 = zArr4[1];
                            en6 en6Var1622 = null;
                            if (this.o != 2) {
                            }
                            h11Var6 = h11Var4;
                            en6Var3 = k;
                            k21Var7 = k21Var2;
                            en6Var4 = k2;
                            k21Var8 = k21Var6;
                            h11Var7 = h11Var5;
                            z18 = z8;
                            z19 = z5;
                            z20 = z28;
                            en6Var5 = k3;
                            h11Var8 = h11Var12;
                            en6Var6 = en6Var;
                            en6Var7 = en6Var2;
                            i13 = i10;
                            zArr3 = zArr2;
                            if (z) {
                            }
                            en6Var8 = en6Var5;
                            en6Var9 = en6Var6;
                            en6Var10 = en6Var7;
                            i14 = 0;
                            i15 = 8;
                            i16 = 1;
                            i17 = 1;
                            if (this.p == 2) {
                            }
                            if (i17 == 0) {
                            }
                            en6Var11 = en6Var8;
                            en6Var12 = en6Var9;
                            if (z12) {
                            }
                            if (h11Var7.h()) {
                            }
                            this.k = false;
                            this.l = false;
                        }
                    } else {
                        if (k21Var3 == k21Var2 && i21 == 3) {
                            this.A = 1;
                            if (i25 == -1) {
                                this.B = 1.0f / f;
                            }
                            i9 = (int) (this.B * i4);
                            if (k21Var != k21Var2) {
                                h11Var4 = h11Var;
                                i11 = 4;
                                z12 = false;
                                int[] iArr22 = this.t;
                                iArr22[0] = i10;
                                iArr22[1] = i11;
                                if (!z12) {
                                }
                                z13 = false;
                                if (!z12) {
                                }
                                z14 = false;
                                k21Var4 = this.T[0];
                                k21Var5 = k21.WRAP_CONTENT;
                                if (k21Var4 != k21Var5) {
                                }
                                k21Var6 = k21Var5;
                                z15 = false;
                                if (z15) {
                                }
                                h11Var5 = this.P;
                                z16 = !h11Var5.h();
                                z17 = zArr4[0];
                                boolean z29222 = zArr4[1];
                                en6 en6Var16222 = null;
                                if (this.o != 2) {
                                }
                                h11Var6 = h11Var4;
                                en6Var3 = k;
                                k21Var7 = k21Var2;
                                en6Var4 = k2;
                                k21Var8 = k21Var6;
                                h11Var7 = h11Var5;
                                z18 = z8;
                                z19 = z5;
                                z20 = z28;
                                en6Var5 = k3;
                                h11Var8 = h11Var12;
                                en6Var6 = en6Var;
                                en6Var7 = en6Var2;
                                i13 = i10;
                                zArr3 = zArr2;
                                if (z) {
                                }
                                en6Var8 = en6Var5;
                                en6Var9 = en6Var6;
                                en6Var10 = en6Var7;
                                i14 = 0;
                                i15 = 8;
                                i16 = 1;
                                i17 = 1;
                                if (this.p == 2) {
                                }
                                if (i17 == 0) {
                                }
                                en6Var11 = en6Var8;
                                en6Var12 = en6Var9;
                                if (z12) {
                                }
                                if (h11Var7.h()) {
                                }
                                this.k = false;
                                this.l = false;
                            }
                            h11Var4 = h11Var;
                        }
                        h11Var4 = h11Var;
                        i9 = i8;
                    }
                    z12 = true;
                    i11 = i21;
                    int[] iArr222 = this.t;
                    iArr222[0] = i10;
                    iArr222[1] = i11;
                    if (!z12) {
                    }
                    z13 = false;
                    if (!z12) {
                    }
                    z14 = false;
                    k21Var4 = this.T[0];
                    k21Var5 = k21.WRAP_CONTENT;
                    if (k21Var4 != k21Var5) {
                    }
                    k21Var6 = k21Var5;
                    z15 = false;
                    if (z15) {
                    }
                    h11Var5 = this.P;
                    z16 = !h11Var5.h();
                    z17 = zArr4[0];
                    boolean z292222 = zArr4[1];
                    en6 en6Var162222 = null;
                    if (this.o != 2) {
                    }
                    h11Var6 = h11Var4;
                    en6Var3 = k;
                    k21Var7 = k21Var2;
                    en6Var4 = k2;
                    k21Var8 = k21Var6;
                    h11Var7 = h11Var5;
                    z18 = z8;
                    z19 = z5;
                    z20 = z28;
                    en6Var5 = k3;
                    h11Var8 = h11Var12;
                    en6Var6 = en6Var;
                    en6Var7 = en6Var2;
                    i13 = i10;
                    zArr3 = zArr2;
                    if (z) {
                    }
                    en6Var8 = en6Var5;
                    en6Var9 = en6Var6;
                    en6Var10 = en6Var7;
                    i14 = 0;
                    i15 = 8;
                    i16 = 1;
                    i17 = 1;
                    if (this.p == 2) {
                    }
                    if (i17 == 0) {
                    }
                    en6Var11 = en6Var8;
                    en6Var12 = en6Var9;
                    if (z12) {
                    }
                    if (h11Var7.h()) {
                    }
                    this.k = false;
                    this.l = false;
                }
            } else {
                en6Var = k4;
            }
            en6Var2 = k5;
            h11Var4 = h11Var;
            i9 = i8;
            i10 = i26;
            i11 = i27;
            z12 = false;
            int[] iArr2222 = this.t;
            iArr2222[0] = i10;
            iArr2222[1] = i11;
            if (!z12) {
            }
            z13 = false;
            if (!z12) {
            }
            z14 = false;
            k21Var4 = this.T[0];
            k21Var5 = k21.WRAP_CONTENT;
            if (k21Var4 != k21Var5) {
            }
            k21Var6 = k21Var5;
            z15 = false;
            if (z15) {
            }
            h11Var5 = this.P;
            z16 = !h11Var5.h();
            z17 = zArr4[0];
            boolean z2922222 = zArr4[1];
            en6 en6Var1622222 = null;
            if (this.o != 2) {
            }
            h11Var6 = h11Var4;
            en6Var3 = k;
            k21Var7 = k21Var2;
            en6Var4 = k2;
            k21Var8 = k21Var6;
            h11Var7 = h11Var5;
            z18 = z8;
            z19 = z5;
            z20 = z28;
            en6Var5 = k3;
            h11Var8 = h11Var12;
            en6Var6 = en6Var;
            en6Var7 = en6Var2;
            i13 = i10;
            zArr3 = zArr2;
            if (z) {
            }
            en6Var8 = en6Var5;
            en6Var9 = en6Var6;
            en6Var10 = en6Var7;
            i14 = 0;
            i15 = 8;
            i16 = 1;
            i17 = 1;
            if (this.p == 2) {
            }
            if (i17 == 0) {
            }
            en6Var11 = en6Var8;
            en6Var12 = en6Var9;
            if (z12) {
            }
            if (h11Var7.h()) {
            }
            this.k = false;
            this.l = false;
        }
        z2 = true;
        i = 0;
        z4 = i == 1 ? 1 : 0;
        z3 = z4;
        i2 = i;
        r19 = z2;
        i3 = this.h0;
        boolean[] zArr42 = this.S;
        boolean z262 = z4;
        if (i3 != 8) {
        }
        z5 = z3;
        z6 = this.k;
        if (!z6) {
        }
        if (z6) {
        }
        if (this.l) {
        }
        if (this.k) {
            boolean z272 = i2;
            this.k = z272;
            this.l = z272;
            return;
        }
        zArr = this.f;
        if (!z) {
        }
        h11Var = h11Var13;
        zArr2 = zArr;
        if (this.U == null) {
        }
        i4 = this.V;
        i5 = this.c0;
        if (i4 >= i5) {
        }
        i6 = this.W;
        h11 h11Var142 = h11Var3;
        i7 = this.d0;
        if (i6 >= i7) {
        }
        k21[] k21VarArr32 = this.T;
        k21Var = k21VarArr32[0];
        boolean z282 = z7;
        k21Var2 = k21.MATCH_CONSTRAINT;
        if (k21Var == k21Var2) {
        }
        k21Var3 = k21VarArr32[1];
        if (k21Var3 == k21Var2) {
        }
        int i252 = this.Y;
        this.A = i252;
        f = this.X;
        this.B = f;
        int i262 = this.r;
        int i272 = this.s;
        if (f <= RecyclerView.B1) {
        }
        en6Var2 = k5;
        h11Var4 = h11Var;
        i9 = i8;
        i10 = i262;
        i11 = i272;
        z12 = false;
        int[] iArr22222 = this.t;
        iArr22222[0] = i10;
        iArr22222[1] = i11;
        if (!z12) {
        }
        z13 = false;
        if (!z12) {
        }
        z14 = false;
        k21Var4 = this.T[0];
        k21Var5 = k21.WRAP_CONTENT;
        if (k21Var4 != k21Var5) {
        }
        k21Var6 = k21Var5;
        z15 = false;
        if (z15) {
        }
        h11Var5 = this.P;
        z16 = !h11Var5.h();
        z17 = zArr42[0];
        boolean z29222222 = zArr42[1];
        en6 en6Var16222222 = null;
        if (this.o != 2) {
        }
        h11Var6 = h11Var4;
        en6Var3 = k;
        k21Var7 = k21Var2;
        en6Var4 = k2;
        k21Var8 = k21Var6;
        h11Var7 = h11Var5;
        z18 = z8;
        z19 = z5;
        z20 = z282;
        en6Var5 = k3;
        h11Var8 = h11Var12;
        en6Var6 = en6Var;
        en6Var7 = en6Var2;
        i13 = i10;
        zArr3 = zArr2;
        if (z) {
        }
        en6Var8 = en6Var5;
        en6Var9 = en6Var6;
        en6Var10 = en6Var7;
        i14 = 0;
        i15 = 8;
        i16 = 1;
        i17 = 1;
        if (this.p == 2) {
        }
        if (i17 == 0) {
        }
        en6Var11 = en6Var8;
        en6Var12 = en6Var9;
        if (z12) {
        }
        if (h11Var7.h()) {
        }
        this.k = false;
        this.l = false;
    }

    public boolean c() {
        if (this.h0 != 8) {
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
    */
    public final void d(jv3 jv3Var, boolean z, boolean z2, boolean z3, boolean z4, en6 en6Var, en6 en6Var2, k21 k21Var, boolean z5, h11 h11Var, h11 h11Var2, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, int i6, int i7, int i8, float f2, boolean z11) {
        int i9;
        boolean z12;
        int i10;
        int i11;
        boolean z13;
        en6 k;
        en6 k2;
        h11 h11Var3;
        en6 en6Var3;
        boolean z14;
        int i12;
        en6 en6Var4;
        en6 en6Var5;
        en6 en6Var6;
        en6 en6Var7;
        int i13;
        int i14;
        int i15;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        l21 l21Var;
        int i16;
        int i17;
        h11 h11Var4;
        boolean z19;
        int i18;
        boolean z20;
        int i19;
        int i20;
        HashSet hashSet;
        boolean z21;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z22;
        boolean z23;
        int i27;
        jv3 jv3Var2 = jv3Var;
        int i28 = i7;
        int i29 = i8;
        en6 k3 = jv3Var2.k(h11Var);
        en6 k4 = jv3Var2.k(h11Var2);
        en6 k5 = jv3Var2.k(h11Var.f);
        en6 k6 = jv3Var2.k(h11Var2.f);
        boolean h = h11Var.h();
        boolean h2 = h11Var2.h();
        boolean h3 = this.P.h();
        int i30 = h2 ? (h ? 1 : 0) + 1 : h ? 1 : 0;
        if (h3) {
            i30++;
        }
        int i31 = i30;
        int i32 = z6 ? 3 : i5;
        int ordinal = k21Var.ordinal();
        boolean z24 = (ordinal == 0 || ordinal == 1 || ordinal != 2 || i32 == 4) ? false : true;
        int i33 = this.h;
        if (i33 != -1 && z) {
            this.h = -1;
            i2 = i33;
            z24 = false;
        }
        int i34 = this.i;
        if (i34 == -1 || z) {
            i34 = i2;
        } else {
            this.i = -1;
            z24 = false;
        }
        int i35 = i34;
        if (this.h0 == 8) {
            z24 = false;
            i9 = 0;
        } else {
            i9 = i35;
        }
        if (z11) {
            if (!h && !h2 && !h3) {
                jv3Var2.d(k3, i);
            } else if (h && !h2) {
                z12 = z24;
                i10 = 8;
                jv3Var2.e(k3, k5, h11Var.e(), 8);
            }
            z12 = z24;
            i10 = 8;
        } else {
            z12 = z24;
            i10 = 8;
        }
        if (z12) {
            if (i31 == 2 || z6 || !(i32 == 1 || i32 == 0)) {
                if (i28 == -2) {
                    i28 = i9;
                }
                if (i29 == -2) {
                    i29 = i9;
                }
                if (i9 > 0 && i32 != 1) {
                    i9 = 0;
                }
                if (i28 > 0) {
                    jv3Var2.f(k4, k3, i28, 8);
                    i9 = Math.max(i9, i28);
                }
                if (i29 > 0) {
                    if (!z2 || i32 != 1) {
                        jv3Var2.g(k4, k3, i29, 8);
                    }
                    i9 = Math.min(i9, i29);
                }
                if (i32 == 1) {
                    if (z2) {
                        jv3Var2.e(k4, k3, i9, 8);
                    } else if (z8) {
                        jv3Var2.e(k4, k3, i9, 5);
                        jv3Var2.g(k4, k3, i9, 8);
                    } else {
                        jv3Var2.e(k4, k3, i9, 5);
                        jv3Var2.g(k4, k3, i9, 8);
                    }
                } else if (i32 == 2) {
                    g11 g11Var = h11Var.e;
                    g11 g11Var2 = g11.TOP;
                    if (g11Var != g11Var2 && g11Var != g11.BOTTOM) {
                        k = jv3Var2.k(this.U.j(g11.LEFT));
                        k2 = jv3Var2.k(this.U.j(g11.RIGHT));
                    } else {
                        k = jv3Var2.k(this.U.j(g11Var2));
                        k2 = jv3Var2.k(this.U.j(g11.BOTTOM));
                    }
                    yu l = jv3Var2.l();
                    int i36 = i28;
                    l.d.g(k4, -1.0f);
                    l.d.g(k3, 1.0f);
                    l.d.g(k2, f2);
                    l.d.g(k, -f2);
                    jv3Var2.c(l);
                    if (z2) {
                        z12 = false;
                    }
                    z13 = z4;
                    i11 = i36;
                } else {
                    i11 = i28;
                    z13 = true;
                }
            } else {
                int max = Math.max(i28, i9);
                if (i29 > 0) {
                    max = Math.min(i29, max);
                }
                jv3Var2.e(k4, k3, max, 8);
                z13 = z4;
                i11 = i28;
                z12 = false;
            }
            if (z11 || z8) {
                boolean z25 = z13;
                if (i31 >= 2 && z2 && z25) {
                    jv3Var2.f(k3, en6Var, 0, 8);
                    h11 h11Var5 = this.M;
                    boolean z26 = z || h11Var5.f == null;
                    if (!z && (h11Var3 = h11Var5.f) != null) {
                        l21 l21Var2 = h11Var3.d;
                        if (l21Var2.X != RecyclerView.B1) {
                            k21[] k21VarArr = l21Var2.T;
                            k21 k21Var2 = k21VarArr[0];
                            k21 k21Var3 = k21.MATCH_CONSTRAINT;
                            if (k21Var2 == k21Var3 && k21VarArr[1] == k21Var3) {
                                z26 = true;
                            }
                        }
                        z26 = false;
                    }
                    if (z26) {
                        jv3Var2.f(en6Var2, k4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!h && !h2 && !h3) {
                h11Var4 = h11Var2;
                en6Var6 = k4;
                z14 = z13;
                en6Var3 = k6;
            } else if (!h || h2) {
                if (h || !h2) {
                    en6Var3 = k6;
                    if (h && h2) {
                        l21 l21Var3 = h11Var.f.d;
                        l21 l21Var4 = h11Var2.f.d;
                        z14 = z13;
                        l21 l21Var5 = this.U;
                        int i37 = 6;
                        if (z12) {
                            if (i32 == 0) {
                                if (i29 != 0 || i11 != 0) {
                                    i25 = 5;
                                    i26 = 5;
                                    z22 = true;
                                    z23 = false;
                                    z16 = true;
                                } else if (k5.Y && en6Var3.Y) {
                                    jv3Var2.e(k3, k5, h11Var.e(), 8);
                                    jv3Var2.e(k4, en6Var3, -h11Var2.e(), 8);
                                    return;
                                } else {
                                    i25 = 8;
                                    i26 = 8;
                                    z22 = false;
                                    z23 = true;
                                    z16 = false;
                                }
                                if ((l21Var3 instanceof a20) || (l21Var4 instanceof a20)) {
                                    i14 = i25;
                                    en6Var7 = k5;
                                    jv3Var2 = jv3Var;
                                    i12 = i32;
                                    en6Var5 = k3;
                                    en6Var6 = k4;
                                    i13 = 6;
                                    z17 = z23;
                                    en6Var4 = en6Var2;
                                    z15 = z22;
                                    i15 = 4;
                                    if (z16 || en6Var7 != en6Var3 || l21Var3 == l21Var5) {
                                        z18 = true;
                                    } else {
                                        z16 = false;
                                        z18 = false;
                                    }
                                    if (z15) {
                                        l21Var = l21Var4;
                                        i16 = i11;
                                        i17 = i12;
                                        h11Var4 = h11Var2;
                                        z19 = z2;
                                    } else {
                                        if (z12 || z7 || z9 || en6Var7 != en6Var || en6Var3 != en6Var4) {
                                            z19 = z2;
                                            z21 = z18;
                                            i21 = i14;
                                            i22 = i13;
                                        } else {
                                            i22 = 8;
                                            z19 = false;
                                            i21 = 8;
                                            z21 = false;
                                        }
                                        en6 en6Var8 = en6Var7;
                                        i16 = i11;
                                        i17 = i12;
                                        l21Var = l21Var4;
                                        h11Var4 = h11Var2;
                                        jv3Var2.b(en6Var5, en6Var8, h11Var.e(), f, en6Var3, en6Var6, h11Var2.e(), i22);
                                        en6Var7 = en6Var8;
                                        i14 = i21;
                                        z18 = z21;
                                    }
                                    if (this.h0 != 8 && ((hashSet = h11Var4.a) == null || hashSet.size() <= 0)) {
                                        return;
                                    }
                                    if (z16) {
                                        if (z19 && en6Var7 != en6Var3 && !z12 && ((l21Var3 instanceof a20) || (l21Var instanceof a20))) {
                                            i14 = 6;
                                        }
                                        jv3Var2.f(en6Var5, en6Var7, h11Var.e(), i14);
                                        jv3Var2.g(en6Var6, en6Var3, -h11Var4.e(), i14);
                                    }
                                    if (z19 || !z10 || (l21Var3 instanceof a20) || (l21Var instanceof a20) || l21Var == l21Var5) {
                                        i18 = i15;
                                        z20 = z18;
                                    } else {
                                        i18 = 6;
                                        i14 = 6;
                                        z20 = true;
                                    }
                                    if (z20) {
                                        if (z17 && (!z9 || z3)) {
                                            if (l21Var3 != l21Var5 && l21Var != l21Var5) {
                                                i37 = i18;
                                            }
                                            i37 = ((l21Var3 instanceof av2) || (l21Var instanceof av2)) ? 5 : 5;
                                            i18 = Math.max(z9 ? 5 : ((l21Var3 instanceof a20) || (l21Var instanceof a20)) ? 5 : 5, i18);
                                        }
                                        if (z19) {
                                            i18 = Math.min(i14, i18);
                                            if (z6 && !z9 && (l21Var3 == l21Var5 || l21Var == l21Var5)) {
                                                i20 = 4;
                                                jv3Var2.e(en6Var5, en6Var7, h11Var.e(), i20);
                                                jv3Var2.e(en6Var6, en6Var3, -h11Var4.e(), i20);
                                            }
                                        }
                                        i20 = i18;
                                        jv3Var2.e(en6Var5, en6Var7, h11Var.e(), i20);
                                        jv3Var2.e(en6Var6, en6Var3, -h11Var4.e(), i20);
                                    }
                                    if (z19) {
                                        int e = en6Var == en6Var7 ? h11Var.e() : 0;
                                        if (en6Var7 != en6Var) {
                                            jv3Var2.f(en6Var5, en6Var, e, 5);
                                        }
                                    }
                                    if (z19 && z12 && i3 == 0 && i16 == 0) {
                                        if (!z12 && i17 == 3) {
                                            jv3Var2.f(en6Var6, en6Var5, 0, 8);
                                        } else {
                                            i19 = 5;
                                            jv3Var2.f(en6Var6, en6Var5, 0, 5);
                                        }
                                    }
                                    i19 = 5;
                                } else {
                                    i14 = i25;
                                    en6Var7 = k5;
                                    jv3Var2 = jv3Var;
                                    en6Var5 = k3;
                                    en6Var6 = k4;
                                    i13 = 6;
                                    z17 = z23;
                                    z15 = z22;
                                    i15 = i26;
                                    i12 = i32;
                                    en6Var4 = en6Var2;
                                    if (z16) {
                                    }
                                    z18 = true;
                                    if (z15) {
                                    }
                                    if (this.h0 != 8) {
                                    }
                                    if (z16) {
                                    }
                                    if (z19) {
                                    }
                                    i18 = i15;
                                    z20 = z18;
                                    if (z20) {
                                    }
                                    if (z19) {
                                    }
                                    if (z19) {
                                        if (!z12) {
                                        }
                                        i19 = 5;
                                        jv3Var2.f(en6Var6, en6Var5, 0, 5);
                                    }
                                    i19 = 5;
                                }
                            } else {
                                if (i32 == 2) {
                                    if ((l21Var3 instanceof a20) || (l21Var4 instanceof a20)) {
                                        jv3Var2 = jv3Var;
                                        i12 = i32;
                                        en6Var5 = k3;
                                        en6Var6 = k4;
                                        en6Var7 = k5;
                                        i13 = 6;
                                        i14 = 5;
                                    } else {
                                        jv3Var2 = jv3Var;
                                        i12 = i32;
                                        en6Var5 = k3;
                                        en6Var6 = k4;
                                        en6Var7 = k5;
                                        i13 = 6;
                                        i14 = 5;
                                        i15 = 5;
                                        z15 = true;
                                        z16 = true;
                                        z17 = false;
                                        en6Var4 = en6Var2;
                                        if (z16) {
                                        }
                                        z18 = true;
                                        if (z15) {
                                        }
                                        if (this.h0 != 8) {
                                        }
                                        if (z16) {
                                        }
                                        if (z19) {
                                        }
                                        i18 = i15;
                                        z20 = z18;
                                        if (z20) {
                                        }
                                        if (z19) {
                                        }
                                        if (z19) {
                                        }
                                        i19 = 5;
                                    }
                                } else if (i32 == 1) {
                                    jv3Var2 = jv3Var;
                                    i12 = i32;
                                    en6Var5 = k3;
                                    en6Var6 = k4;
                                    en6Var7 = k5;
                                    i13 = 6;
                                    i14 = 8;
                                } else if (i32 == 3) {
                                    i12 = i32;
                                    if (this.A == -1) {
                                        if (z9) {
                                            jv3Var2 = jv3Var;
                                            en6Var4 = en6Var2;
                                            en6Var5 = k3;
                                            en6Var6 = k4;
                                            en6Var7 = k5;
                                            i13 = z2 ? 5 : 4;
                                        } else {
                                            jv3Var2 = jv3Var;
                                            en6Var4 = en6Var2;
                                            en6Var5 = k3;
                                            en6Var6 = k4;
                                            en6Var7 = k5;
                                            i13 = 8;
                                        }
                                        i14 = 8;
                                    } else {
                                        if (z6) {
                                            if (i6 == 2 || i6 == 1) {
                                                i23 = 5;
                                                i24 = 4;
                                            } else {
                                                i23 = 8;
                                                i24 = 5;
                                            }
                                            i15 = i24;
                                            en6Var5 = k3;
                                            en6Var6 = k4;
                                            en6Var7 = k5;
                                            i13 = 6;
                                            z15 = true;
                                            z16 = true;
                                            z17 = true;
                                            en6Var4 = en6Var2;
                                        } else if (i29 > 0) {
                                            jv3Var2 = jv3Var;
                                            en6Var4 = en6Var2;
                                            en6Var5 = k3;
                                            en6Var6 = k4;
                                            en6Var7 = k5;
                                            i13 = 6;
                                            i14 = 5;
                                        } else {
                                            if (i29 != 0 || i11 != 0) {
                                                jv3Var2 = jv3Var;
                                                en6Var4 = en6Var2;
                                                en6Var5 = k3;
                                                en6Var6 = k4;
                                                en6Var7 = k5;
                                                i13 = 6;
                                                i14 = 5;
                                                i15 = 4;
                                            } else if (z9) {
                                                i23 = (l21Var3 == l21Var5 || l21Var4 == l21Var5) ? 5 : 4;
                                                en6Var4 = en6Var2;
                                                en6Var5 = k3;
                                                en6Var6 = k4;
                                                en6Var7 = k5;
                                                i13 = 6;
                                                i15 = 4;
                                                z15 = true;
                                                z16 = true;
                                                z17 = true;
                                            } else {
                                                jv3Var2 = jv3Var;
                                                en6Var4 = en6Var2;
                                                en6Var5 = k3;
                                                en6Var6 = k4;
                                                en6Var7 = k5;
                                                i13 = 6;
                                                i14 = 5;
                                                i15 = 8;
                                            }
                                            z15 = true;
                                            z16 = true;
                                            z17 = true;
                                            if (z16) {
                                            }
                                            z18 = true;
                                            if (z15) {
                                            }
                                            if (this.h0 != 8) {
                                            }
                                            if (z16) {
                                            }
                                            if (z19) {
                                            }
                                            i18 = i15;
                                            z20 = z18;
                                            if (z20) {
                                            }
                                            if (z19) {
                                            }
                                            if (z19) {
                                            }
                                            i19 = 5;
                                        }
                                        i14 = i23;
                                        jv3Var2 = jv3Var;
                                        if (z16) {
                                        }
                                        z18 = true;
                                        if (z15) {
                                        }
                                        if (this.h0 != 8) {
                                        }
                                        if (z16) {
                                        }
                                        if (z19) {
                                        }
                                        i18 = i15;
                                        z20 = z18;
                                        if (z20) {
                                        }
                                        if (z19) {
                                        }
                                        if (z19) {
                                        }
                                        i19 = 5;
                                    }
                                    i15 = 5;
                                    z15 = true;
                                    z16 = true;
                                    z17 = true;
                                    if (z16) {
                                    }
                                    z18 = true;
                                    if (z15) {
                                    }
                                    if (this.h0 != 8) {
                                    }
                                    if (z16) {
                                    }
                                    if (z19) {
                                    }
                                    i18 = i15;
                                    z20 = z18;
                                    if (z20) {
                                    }
                                    if (z19) {
                                    }
                                    if (z19) {
                                    }
                                    i19 = 5;
                                } else {
                                    i12 = i32;
                                    jv3Var2 = jv3Var;
                                    en6Var4 = en6Var2;
                                    en6Var5 = k3;
                                    en6Var6 = k4;
                                    en6Var7 = k5;
                                    i13 = 6;
                                    i14 = 5;
                                    i15 = 4;
                                    z15 = false;
                                    z16 = false;
                                }
                                i15 = 4;
                                z15 = true;
                                z16 = true;
                                z17 = false;
                                en6Var4 = en6Var2;
                                if (z16) {
                                }
                                z18 = true;
                                if (z15) {
                                }
                                if (this.h0 != 8) {
                                }
                                if (z16) {
                                }
                                if (z19) {
                                }
                                i18 = i15;
                                z20 = z18;
                                if (z20) {
                                }
                                if (z19) {
                                }
                                if (z19) {
                                }
                                i19 = 5;
                            }
                            i27 = i19;
                            if (z19 && z14) {
                                int e2 = h11Var4.f != null ? h11Var4.e() : 0;
                                if (en6Var3 != en6Var2) {
                                    jv3Var2.f(en6Var2, en6Var6, e2, i27);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        i12 = i32;
                        if (k5.Y && en6Var3.Y) {
                            jv3Var.b(k3, k5, h11Var.e(), f, en6Var3, k4, h11Var2.e(), 8);
                            if (z2 && z14) {
                                int e3 = h11Var2.f != null ? h11Var2.e() : 0;
                                if (en6Var3 != en6Var2) {
                                    jv3Var.f(en6Var2, k4, e3, 5);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        jv3Var2 = jv3Var;
                        en6Var4 = en6Var2;
                        en6Var5 = k3;
                        en6Var6 = k4;
                        en6Var7 = k5;
                        i13 = 6;
                        i14 = 5;
                        i15 = 4;
                        z15 = true;
                        z16 = true;
                        z17 = false;
                        if (z16) {
                        }
                        z18 = true;
                        if (z15) {
                        }
                        if (this.h0 != 8) {
                        }
                        if (z16) {
                        }
                        if (z19) {
                        }
                        i18 = i15;
                        z20 = z18;
                        if (z20) {
                        }
                        if (z19) {
                        }
                        if (z19) {
                        }
                        i19 = 5;
                        i27 = i19;
                        if (z19) {
                            return;
                        }
                        return;
                    }
                } else {
                    en6Var3 = k6;
                    jv3Var2.e(k4, en6Var3, -h11Var2.e(), 8);
                    if (z2) {
                        jv3Var2.f(k3, en6Var, 0, 5);
                        h11Var4 = h11Var2;
                        i19 = 5;
                        en6Var6 = k4;
                        z14 = z13;
                        z19 = z2;
                        i27 = i19;
                        if (z19) {
                        }
                    }
                }
                h11Var4 = h11Var2;
                en6Var6 = k4;
                z14 = z13;
            } else {
                h11Var4 = h11Var2;
                en6Var6 = k4;
                z14 = z13;
                en6Var3 = k6;
                z19 = z2;
                i27 = (z2 && (h11Var.f.d instanceof a20)) ? 8 : 5;
                if (z19) {
                }
            }
            i19 = 5;
            z19 = z2;
            i27 = i19;
            if (z19) {
            }
        } else if (z5) {
            jv3Var2.e(k4, k3, 0, 3);
            if (i3 > 0) {
                jv3Var2.f(k4, k3, i3, i10);
            }
            if (i4 < Integer.MAX_VALUE) {
                jv3Var2.g(k4, k3, i4, i10);
            }
        } else {
            jv3Var2.e(k4, k3, i9, i10);
        }
        z13 = z4;
        i11 = i28;
        if (z11) {
        }
        boolean z252 = z13;
        if (i31 >= 2) {
        }
    }

    public final void e(g11 g11Var, l21 l21Var, g11 g11Var2, int i) {
        g11 g11Var3;
        g11 g11Var4;
        boolean z;
        g11 g11Var5 = g11.CENTER;
        if (g11Var == g11Var5) {
            if (g11Var2 == g11Var5) {
                g11 g11Var6 = g11.LEFT;
                h11 j = j(g11Var6);
                g11 g11Var7 = g11.RIGHT;
                h11 j2 = j(g11Var7);
                g11 g11Var8 = g11.TOP;
                h11 j3 = j(g11Var8);
                g11 g11Var9 = g11.BOTTOM;
                h11 j4 = j(g11Var9);
                boolean z2 = true;
                if ((j != null && j.h()) || (j2 != null && j2.h())) {
                    z = false;
                } else {
                    e(g11Var6, l21Var, g11Var6, 0);
                    e(g11Var7, l21Var, g11Var7, 0);
                    z = true;
                }
                if ((j3 != null && j3.h()) || (j4 != null && j4.h())) {
                    z2 = false;
                } else {
                    e(g11Var8, l21Var, g11Var8, 0);
                    e(g11Var9, l21Var, g11Var9, 0);
                }
                if (z && z2) {
                    j(g11Var5).a(l21Var.j(g11Var5), 0);
                    return;
                } else if (z) {
                    g11 g11Var10 = g11.CENTER_X;
                    j(g11Var10).a(l21Var.j(g11Var10), 0);
                    return;
                } else if (z2) {
                    g11 g11Var11 = g11.CENTER_Y;
                    j(g11Var11).a(l21Var.j(g11Var11), 0);
                    return;
                } else {
                    return;
                }
            }
            g11 g11Var12 = g11.LEFT;
            if (g11Var2 != g11Var12 && g11Var2 != g11.RIGHT) {
                g11 g11Var13 = g11.TOP;
                if (g11Var2 == g11Var13 || g11Var2 == g11.BOTTOM) {
                    e(g11Var13, l21Var, g11Var2, 0);
                    e(g11.BOTTOM, l21Var, g11Var2, 0);
                    j(g11Var5).a(l21Var.j(g11Var2), 0);
                    return;
                }
                return;
            }
            e(g11Var12, l21Var, g11Var2, 0);
            e(g11.RIGHT, l21Var, g11Var2, 0);
            j(g11Var5).a(l21Var.j(g11Var2), 0);
            return;
        }
        g11 g11Var14 = g11.CENTER_X;
        if (g11Var == g11Var14 && (g11Var2 == (g11Var4 = g11.LEFT) || g11Var2 == g11.RIGHT)) {
            h11 j5 = j(g11Var4);
            h11 j6 = l21Var.j(g11Var2);
            h11 j7 = j(g11.RIGHT);
            j5.a(j6, 0);
            j7.a(j6, 0);
            j(g11Var14).a(j6, 0);
            return;
        }
        g11 g11Var15 = g11.CENTER_Y;
        if (g11Var == g11Var15 && (g11Var2 == (g11Var3 = g11.TOP) || g11Var2 == g11.BOTTOM)) {
            h11 j8 = l21Var.j(g11Var2);
            j(g11Var3).a(j8, 0);
            j(g11.BOTTOM).a(j8, 0);
            j(g11Var15).a(j8, 0);
        } else if (g11Var == g11Var14 && g11Var2 == g11Var14) {
            g11 g11Var16 = g11.LEFT;
            j(g11Var16).a(l21Var.j(g11Var16), 0);
            g11 g11Var17 = g11.RIGHT;
            j(g11Var17).a(l21Var.j(g11Var17), 0);
            j(g11Var14).a(l21Var.j(g11Var2), 0);
        } else if (g11Var == g11Var15 && g11Var2 == g11Var15) {
            g11 g11Var18 = g11.TOP;
            j(g11Var18).a(l21Var.j(g11Var18), 0);
            g11 g11Var19 = g11.BOTTOM;
            j(g11Var19).a(l21Var.j(g11Var19), 0);
            j(g11Var15).a(l21Var.j(g11Var2), 0);
        } else {
            h11 j9 = j(g11Var);
            h11 j10 = l21Var.j(g11Var2);
            if (j9.i(j10)) {
                g11 g11Var20 = g11.BASELINE;
                if (g11Var == g11Var20) {
                    h11 j11 = j(g11.TOP);
                    h11 j12 = j(g11.BOTTOM);
                    if (j11 != null) {
                        j11.j();
                    }
                    if (j12 != null) {
                        j12.j();
                    }
                } else if (g11Var != g11.TOP && g11Var != g11.BOTTOM) {
                    if (g11Var == g11.LEFT || g11Var == g11.RIGHT) {
                        h11 j13 = j(g11Var5);
                        if (j13.f != j10) {
                            j13.j();
                        }
                        h11 f = j(g11Var).f();
                        h11 j14 = j(g11Var14);
                        if (j14.h()) {
                            f.j();
                            j14.j();
                        }
                    }
                } else {
                    h11 j15 = j(g11Var20);
                    if (j15 != null) {
                        j15.j();
                    }
                    h11 j16 = j(g11Var5);
                    if (j16.f != j10) {
                        j16.j();
                    }
                    h11 f2 = j(g11Var).f();
                    h11 j17 = j(g11Var15);
                    if (j17.h()) {
                        f2.j();
                        j17.j();
                    }
                }
                j9.a(j10, i);
            }
        }
    }

    public final void f(h11 h11Var, h11 h11Var2, int i) {
        if (h11Var.d == this) {
            e(h11Var.e, h11Var2.d, h11Var2.e, i);
        }
    }

    public void g(l21 l21Var, HashMap hashMap) {
        l21 l21Var2;
        l21 l21Var3;
        this.o = l21Var.o;
        this.p = l21Var.p;
        this.r = l21Var.r;
        this.s = l21Var.s;
        int[] iArr = l21Var.t;
        int i = iArr[0];
        int[] iArr2 = this.t;
        iArr2[0] = i;
        iArr2[1] = iArr[1];
        this.u = l21Var.u;
        this.v = l21Var.v;
        this.x = l21Var.x;
        this.y = l21Var.y;
        this.z = l21Var.z;
        this.A = l21Var.A;
        this.B = l21Var.B;
        int[] iArr3 = l21Var.C;
        this.C = Arrays.copyOf(iArr3, iArr3.length);
        this.D = l21Var.D;
        this.E = l21Var.E;
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.T = (k21[]) Arrays.copyOf(this.T, 2);
        l21 l21Var4 = null;
        if (this.U == null) {
            l21Var2 = null;
        } else {
            l21Var2 = (l21) hashMap.get(l21Var.U);
        }
        this.U = l21Var2;
        this.V = l21Var.V;
        this.W = l21Var.W;
        this.X = l21Var.X;
        this.Y = l21Var.Y;
        this.Z = l21Var.Z;
        this.a0 = l21Var.a0;
        this.b0 = l21Var.b0;
        this.c0 = l21Var.c0;
        this.d0 = l21Var.d0;
        this.e0 = l21Var.e0;
        this.f0 = l21Var.f0;
        this.g0 = l21Var.g0;
        this.h0 = l21Var.h0;
        this.i0 = l21Var.i0;
        this.j0 = l21Var.j0;
        this.k0 = l21Var.k0;
        this.l0 = l21Var.l0;
        float[] fArr = l21Var.m0;
        float f = fArr[0];
        float[] fArr2 = this.m0;
        fArr2[0] = f;
        fArr2[1] = fArr[1];
        l21[] l21VarArr = l21Var.n0;
        l21 l21Var5 = l21VarArr[0];
        l21[] l21VarArr2 = this.n0;
        l21VarArr2[0] = l21Var5;
        l21VarArr2[1] = l21VarArr[1];
        l21[] l21VarArr3 = l21Var.o0;
        l21 l21Var6 = l21VarArr3[0];
        l21[] l21VarArr4 = this.o0;
        l21VarArr4[0] = l21Var6;
        l21VarArr4[1] = l21VarArr3[1];
        l21 l21Var7 = l21Var.p0;
        if (l21Var7 == null) {
            l21Var3 = null;
        } else {
            l21Var3 = (l21) hashMap.get(l21Var7);
        }
        this.p0 = l21Var3;
        l21 l21Var8 = l21Var.q0;
        if (l21Var8 != null) {
            l21Var4 = (l21) hashMap.get(l21Var8);
        }
        this.q0 = l21Var4;
    }

    public final void h(jv3 jv3Var) {
        jv3Var.k(this.I);
        jv3Var.k(this.J);
        jv3Var.k(this.K);
        jv3Var.k(this.L);
        if (this.b0 > 0) {
            jv3Var.k(this.M);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ct7, lm7] */
    /* JADX WARN: Type inference failed for: r0v3, types: [ly2, ct7] */
    public final void i() {
        if (this.d == null) {
            ?? ct7Var = new ct7(this);
            ct7Var.h.e = bi1.LEFT;
            ct7Var.i.e = bi1.RIGHT;
            ct7Var.f = 0;
            this.d = ct7Var;
        }
        if (this.e == null) {
            ?? ct7Var2 = new ct7(this);
            ci1 ci1Var = new ci1(ct7Var2);
            ct7Var2.k = ci1Var;
            ct7Var2.l = null;
            ct7Var2.h.e = bi1.TOP;
            ct7Var2.i.e = bi1.BOTTOM;
            ci1Var.e = bi1.BASELINE;
            ct7Var2.f = 1;
            this.e = ct7Var2;
        }
    }

    public h11 j(g11 g11Var) {
        switch (j21.a[g11Var.ordinal()]) {
            case 1:
                return this.I;
            case 2:
                return this.J;
            case 3:
                return this.K;
            case 4:
                return this.L;
            case 5:
                return this.M;
            case 6:
                return this.P;
            case 7:
                return this.N;
            case 8:
                return this.O;
            case 9:
                return null;
            default:
                throw new AssertionError(g11Var.name());
        }
    }

    public final k21 k(int i) {
        if (i == 0) {
            return this.T[0];
        }
        if (i == 1) {
            return this.T[1];
        }
        return null;
    }

    public final int l() {
        if (this.h0 == 8) {
            return 0;
        }
        return this.W;
    }

    public final l21 m(int i) {
        h11 h11Var;
        h11 h11Var2;
        if (i == 0) {
            h11 h11Var3 = this.K;
            h11 h11Var4 = h11Var3.f;
            if (h11Var4 != null && h11Var4.f == h11Var3) {
                return h11Var4.d;
            }
            return null;
        } else if (i == 1 && (h11Var2 = (h11Var = this.L).f) != null && h11Var2.f == h11Var) {
            return h11Var2.d;
        } else {
            return null;
        }
    }

    public final l21 n(int i) {
        h11 h11Var;
        h11 h11Var2;
        if (i == 0) {
            h11 h11Var3 = this.I;
            h11 h11Var4 = h11Var3.f;
            if (h11Var4 != null && h11Var4.f == h11Var3) {
                return h11Var4.d;
            }
            return null;
        } else if (i == 1 && (h11Var2 = (h11Var = this.J).f) != null && h11Var2.f == h11Var) {
            return h11Var2.d;
        } else {
            return null;
        }
    }

    public void o(StringBuilder sb) {
        sb.append("  " + this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.V);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.W);
        sb.append("\n");
        sb.append("    actualLeft:" + this.Z);
        sb.append("\n");
        sb.append("    actualTop:" + this.a0);
        sb.append("\n");
        q(sb, "left", this.I);
        q(sb, "top", this.J);
        q(sb, "right", this.K);
        q(sb, "bottom", this.L);
        q(sb, "baseline", this.M);
        q(sb, "centerX", this.N);
        q(sb, "centerY", this.O);
        int i = this.V;
        int i2 = this.c0;
        int i3 = this.C[0];
        int i4 = this.u;
        int i5 = this.r;
        float f = this.w;
        k21 k21Var = this.T[0];
        float[] fArr = this.m0;
        float f2 = fArr[0];
        p(sb, "    width", i, i2, i3, i4, i5, f, k21Var);
        int i6 = this.W;
        int i7 = this.d0;
        int i8 = this.C[1];
        int i9 = this.x;
        int i10 = this.s;
        float f3 = this.z;
        k21 k21Var2 = this.T[1];
        float f4 = fArr[1];
        p(sb, "    height", i6, i7, i8, i9, i10, f3, k21Var2);
        float f5 = this.X;
        int i11 = this.Y;
        if (f5 != RecyclerView.B1) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i11);
            sb.append("");
            sb.append("],\n");
        }
        I(sb, "    horizontalBias", this.e0, 0.5f);
        I(sb, "    verticalBias", this.f0, 0.5f);
        H(this.k0, 0, "    horizontalChainStyle", sb);
        H(this.l0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int r() {
        if (this.h0 == 8) {
            return 0;
        }
        return this.V;
    }

    public final int s() {
        l21 l21Var = this.U;
        if (l21Var != null && (l21Var instanceof m21)) {
            return ((m21) l21Var).A0 + this.Z;
        }
        return this.Z;
    }

    public final int t() {
        l21 l21Var = this.U;
        if (l21Var != null && (l21Var instanceof m21)) {
            return ((m21) l21Var).B0 + this.a0;
        }
        return this.a0;
    }

    public String toString() {
        String str = "";
        StringBuilder s = lb1.s("");
        if (this.j0 != null) {
            str = i61.n(new StringBuilder("id: "), this.j0, " ");
        }
        s.append(str);
        s.append("(");
        s.append(this.Z);
        s.append(", ");
        s.append(this.a0);
        s.append(") - (");
        s.append(this.V);
        s.append(" x ");
        return lb1.o(s, this.W, ")");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i == 0) {
            if (this.I.f != null) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (this.K.f != null) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (i5 + i6 >= 2) {
                return false;
            }
            return true;
        }
        if (this.J.f != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.L.f != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i7 = i2 + i3;
        if (this.M.f != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i7 + i4 < 2) {
        }
    }

    public final boolean v(int i, int i2) {
        h11 h11Var;
        h11 h11Var2;
        h11 h11Var3;
        h11 h11Var4;
        if (i == 0) {
            h11 h11Var5 = this.I;
            h11 h11Var6 = h11Var5.f;
            if (h11Var6 != null && h11Var6.c && (h11Var4 = (h11Var3 = this.K).f) != null && h11Var4.c) {
                if ((h11Var4.d() - h11Var3.e()) - (h11Var5.e() + h11Var5.f.d()) >= i2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        h11 h11Var7 = this.J;
        h11 h11Var8 = h11Var7.f;
        if (h11Var8 != null && h11Var8.c && (h11Var2 = (h11Var = this.L).f) != null && h11Var2.c) {
            if ((h11Var2.d() - h11Var.e()) - (h11Var7.e() + h11Var7.f.d()) >= i2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void w(g11 g11Var, l21 l21Var, g11 g11Var2, int i, int i2) {
        j(g11Var).b(l21Var.j(g11Var2), i, i2, true);
    }

    public final boolean x(int i) {
        h11 h11Var;
        h11 h11Var2;
        int i2 = i * 2;
        h11[] h11VarArr = this.Q;
        h11 h11Var3 = h11VarArr[i2];
        h11 h11Var4 = h11Var3.f;
        if (h11Var4 != null && h11Var4.f != h11Var3 && (h11Var2 = (h11Var = h11VarArr[i2 + 1]).f) != null && h11Var2.f == h11Var) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        h11 h11Var = this.I;
        h11 h11Var2 = h11Var.f;
        if (h11Var2 == null || h11Var2.f != h11Var) {
            h11 h11Var3 = this.K;
            h11 h11Var4 = h11Var3.f;
            if (h11Var4 != null && h11Var4.f == h11Var3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean z() {
        h11 h11Var = this.J;
        h11 h11Var2 = h11Var.f;
        if (h11Var2 == null || h11Var2.f != h11Var) {
            h11 h11Var3 = this.L;
            h11 h11Var4 = h11Var3.f;
            if (h11Var4 != null && h11Var4.f == h11Var3) {
                return true;
            }
            return false;
        }
        return true;
    }
}
