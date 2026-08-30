package defpackage;

import android.view.View;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gz0  reason: default package */
/* loaded from: classes.dex */
public class gz0 {
    public int A;
    public float B;
    public int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final cy0 I;
    public final cy0 J;
    public final cy0 K;
    public final cy0 L;
    public final cy0 M;
    public final cy0 N;
    public final cy0 O;
    public final cy0 P;
    public final cy0[] Q;
    public final ArrayList R;
    public final boolean[] S;
    public fz0[] T;
    public gz0 U;
    public int V;
    public int W;
    public float X;
    public int Y;
    public int Z;
    public int a0;
    public bj0 b;
    public int b0;
    public bj0 c;
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
    public final gz0[] n0;
    public int o;
    public final gz0[] o0;
    public int p;
    public gz0 p0;
    public int q;
    public gz0 q0;
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
    public ks2 d = null;
    public m87 e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    public gz0() {
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
        this.C = new int[]{Preference.DEFAULT_ORDER, Preference.DEFAULT_ORDER};
        this.D = Float.NaN;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        cy0 cy0Var = new cy0(this, by0.LEFT);
        this.I = cy0Var;
        cy0 cy0Var2 = new cy0(this, by0.TOP);
        this.J = cy0Var2;
        cy0 cy0Var3 = new cy0(this, by0.RIGHT);
        this.K = cy0Var3;
        cy0 cy0Var4 = new cy0(this, by0.BOTTOM);
        this.L = cy0Var4;
        cy0 cy0Var5 = new cy0(this, by0.BASELINE);
        this.M = cy0Var5;
        cy0 cy0Var6 = new cy0(this, by0.CENTER_X);
        this.N = cy0Var6;
        cy0 cy0Var7 = new cy0(this, by0.CENTER_Y);
        this.O = cy0Var7;
        cy0 cy0Var8 = new cy0(this, by0.CENTER);
        this.P = cy0Var8;
        this.Q = new cy0[]{cy0Var, cy0Var3, cy0Var2, cy0Var4, cy0Var5, cy0Var8};
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.S = new boolean[2];
        fz0 fz0Var = fz0.FIXED;
        this.T = new fz0[]{fz0Var, fz0Var};
        this.U = null;
        this.V = 0;
        this.W = 0;
        this.X = RecyclerView.A1;
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
        this.n0 = new gz0[]{null, null};
        this.o0 = new gz0[]{null, null};
        this.p0 = null;
        this.q0 = null;
        this.r0 = -1;
        this.s0 = -1;
        arrayList.add(cy0Var);
        arrayList.add(cy0Var2);
        arrayList.add(cy0Var3);
        arrayList.add(cy0Var4);
        arrayList.add(cy0Var6);
        arrayList.add(cy0Var7);
        arrayList.add(cy0Var8);
        arrayList.add(cy0Var5);
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

    public static void p(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, fz0 fz0Var) {
        sb.append(str);
        sb.append(" :  {\n");
        String obj = fz0Var.toString();
        if (!fz0.FIXED.toString().equals(obj)) {
            b31.B(sb, "      behavior", " :   ", obj, ",\n");
        }
        H(i, 0, "      size", sb);
        H(i2, 0, "      min", sb);
        H(i3, Preference.DEFAULT_ORDER, "      max", sb);
        H(i4, 0, "      matchMin", sb);
        H(i5, 0, "      matchDef", sb);
        I(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void q(StringBuilder sb, String str, cy0 cy0Var) {
        if (cy0Var.f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(cy0Var.f);
        sb.append("'");
        if (cy0Var.h != Integer.MIN_VALUE || cy0Var.g != 0) {
            sb.append(",");
            sb.append(cy0Var.g);
            if (cy0Var.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(cy0Var.h);
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
        this.X = RecyclerView.A1;
        this.Y = -1;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0.5f;
        this.f0 = 0.5f;
        fz0[] fz0VarArr = this.T;
        fz0 fz0Var = fz0.FIXED;
        fz0VarArr[0] = fz0Var;
        fz0VarArr[1] = fz0Var;
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
        this.v = Preference.DEFAULT_ORDER;
        this.y = Preference.DEFAULT_ORDER;
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
        gz0 gz0Var = this.U;
        if (gz0Var != null && (gz0Var instanceof hz0)) {
            ((hz0) gz0Var).getClass();
        }
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cy0) arrayList.get(i)).j();
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
            cy0 cy0Var = (cy0) arrayList.get(i);
            cy0Var.c = false;
            cy0Var.b = 0;
        }
    }

    public void G(os osVar) {
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

    public final void N(fz0 fz0Var) {
        this.T[0] = fz0Var;
    }

    public final void O(fz0 fz0Var) {
        this.T[1] = fz0Var;
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
        ks2 ks2Var = this.d;
        boolean z3 = z & ks2Var.g;
        m87 m87Var = this.e;
        boolean z4 = z2 & m87Var.g;
        int i3 = ks2Var.h.g;
        int i4 = m87Var.h.g;
        int i5 = ks2Var.i.g;
        int i6 = m87Var.i.g;
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
            if (this.T[0] == fz0.FIXED && i8 < (i2 = this.V)) {
                i8 = i2;
            }
            this.V = i8;
            int i10 = this.c0;
            if (i8 < i10) {
                this.V = i10;
            }
        }
        if (z4) {
            if (this.T[1] == fz0.FIXED && i9 < (i = this.W)) {
                i9 = i;
            }
            this.W = i9;
            int i11 = this.d0;
            if (i9 < i11) {
                this.W = i11;
            }
        }
    }

    public void R(ho3 ho3Var, boolean z) {
        int i;
        int i2;
        m87 m87Var;
        ks2 ks2Var;
        ho3Var.getClass();
        int n = ho3.n(this.I);
        int n2 = ho3.n(this.J);
        int n3 = ho3.n(this.K);
        int n4 = ho3.n(this.L);
        if (z && (ks2Var = this.d) != null) {
            yd1 yd1Var = ks2Var.h;
            if (yd1Var.j) {
                yd1 yd1Var2 = ks2Var.i;
                if (yd1Var2.j) {
                    n = yd1Var.g;
                    n3 = yd1Var2.g;
                }
            }
        }
        if (z && (m87Var = this.e) != null) {
            yd1 yd1Var3 = m87Var.h;
            if (yd1Var3.j) {
                yd1 yd1Var4 = m87Var.i;
                if (yd1Var4.j) {
                    n2 = yd1Var3.g;
                    n4 = yd1Var4.g;
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
        fz0[] fz0VarArr = this.T;
        fz0 fz0Var = fz0VarArr[0];
        fz0 fz0Var2 = fz0.FIXED;
        if (fz0Var == fz0Var2 && i4 < (i2 = this.V)) {
            i4 = i2;
        }
        if (fz0VarArr[1] == fz0Var2 && i5 < (i = this.W)) {
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
        if (i8 > 0 && fz0Var == fz0.MATCH_CONSTRAINT) {
            this.V = Math.min(this.V, i8);
        }
        int i9 = this.y;
        if (i9 > 0 && this.T[1] == fz0.MATCH_CONSTRAINT) {
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

    public final void a(hz0 hz0Var, ho3 ho3Var, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (hashSet.contains(this)) {
                a53.p(hz0Var, ho3Var, this);
                hashSet.remove(this);
                b(ho3Var, hz0Var.X(64));
            } else {
                return;
            }
        }
        if (i == 0) {
            HashSet hashSet2 = this.I.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((cy0) it.next()).d.a(hz0Var, ho3Var, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.K.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((cy0) it2.next()).d.a(hz0Var, ho3Var, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((cy0) it3.next()).d.a(hz0Var, ho3Var, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.L.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((cy0) it4.next()).d.a(hz0Var, ho3Var, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.M.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((cy0) it5.next()).d.a(hz0Var, ho3Var, hashSet, i, true);
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
    /* JADX WARN: Type inference failed for: r13v46, types: [hz0] */
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
    public void b(defpackage.ho3 r60, boolean r61) {
        /*
            Method dump skipped, instructions count: 1936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gz0.b(ho3, boolean):void");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.ho3 r30, boolean r31, boolean r32, boolean r33, boolean r34, defpackage.ob6 r35, defpackage.ob6 r36, defpackage.fz0 r37, boolean r38, defpackage.cy0 r39, defpackage.cy0 r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, int r51, int r52, int r53, int r54, float r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 1322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gz0.d(ho3, boolean, boolean, boolean, boolean, ob6, ob6, fz0, boolean, cy0, cy0, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void e(by0 by0Var, gz0 gz0Var, by0 by0Var2, int i) {
        by0 by0Var3;
        by0 by0Var4;
        boolean z;
        by0 by0Var5 = by0.CENTER;
        if (by0Var == by0Var5) {
            if (by0Var2 == by0Var5) {
                by0 by0Var6 = by0.LEFT;
                cy0 j = j(by0Var6);
                by0 by0Var7 = by0.RIGHT;
                cy0 j2 = j(by0Var7);
                by0 by0Var8 = by0.TOP;
                cy0 j3 = j(by0Var8);
                by0 by0Var9 = by0.BOTTOM;
                cy0 j4 = j(by0Var9);
                boolean z2 = true;
                if ((j != null && j.h()) || (j2 != null && j2.h())) {
                    z = false;
                } else {
                    e(by0Var6, gz0Var, by0Var6, 0);
                    e(by0Var7, gz0Var, by0Var7, 0);
                    z = true;
                }
                if ((j3 != null && j3.h()) || (j4 != null && j4.h())) {
                    z2 = false;
                } else {
                    e(by0Var8, gz0Var, by0Var8, 0);
                    e(by0Var9, gz0Var, by0Var9, 0);
                }
                if (z && z2) {
                    j(by0Var5).a(gz0Var.j(by0Var5), 0);
                    return;
                } else if (z) {
                    by0 by0Var10 = by0.CENTER_X;
                    j(by0Var10).a(gz0Var.j(by0Var10), 0);
                    return;
                } else if (z2) {
                    by0 by0Var11 = by0.CENTER_Y;
                    j(by0Var11).a(gz0Var.j(by0Var11), 0);
                    return;
                } else {
                    return;
                }
            }
            by0 by0Var12 = by0.LEFT;
            if (by0Var2 != by0Var12 && by0Var2 != by0.RIGHT) {
                by0 by0Var13 = by0.TOP;
                if (by0Var2 == by0Var13 || by0Var2 == by0.BOTTOM) {
                    e(by0Var13, gz0Var, by0Var2, 0);
                    e(by0.BOTTOM, gz0Var, by0Var2, 0);
                    j(by0Var5).a(gz0Var.j(by0Var2), 0);
                    return;
                }
                return;
            }
            e(by0Var12, gz0Var, by0Var2, 0);
            e(by0.RIGHT, gz0Var, by0Var2, 0);
            j(by0Var5).a(gz0Var.j(by0Var2), 0);
            return;
        }
        by0 by0Var14 = by0.CENTER_X;
        if (by0Var == by0Var14 && (by0Var2 == (by0Var4 = by0.LEFT) || by0Var2 == by0.RIGHT)) {
            cy0 j5 = j(by0Var4);
            cy0 j6 = gz0Var.j(by0Var2);
            cy0 j7 = j(by0.RIGHT);
            j5.a(j6, 0);
            j7.a(j6, 0);
            j(by0Var14).a(j6, 0);
            return;
        }
        by0 by0Var15 = by0.CENTER_Y;
        if (by0Var == by0Var15 && (by0Var2 == (by0Var3 = by0.TOP) || by0Var2 == by0.BOTTOM)) {
            cy0 j8 = gz0Var.j(by0Var2);
            j(by0Var3).a(j8, 0);
            j(by0.BOTTOM).a(j8, 0);
            j(by0Var15).a(j8, 0);
        } else if (by0Var == by0Var14 && by0Var2 == by0Var14) {
            by0 by0Var16 = by0.LEFT;
            j(by0Var16).a(gz0Var.j(by0Var16), 0);
            by0 by0Var17 = by0.RIGHT;
            j(by0Var17).a(gz0Var.j(by0Var17), 0);
            j(by0Var14).a(gz0Var.j(by0Var2), 0);
        } else if (by0Var == by0Var15 && by0Var2 == by0Var15) {
            by0 by0Var18 = by0.TOP;
            j(by0Var18).a(gz0Var.j(by0Var18), 0);
            by0 by0Var19 = by0.BOTTOM;
            j(by0Var19).a(gz0Var.j(by0Var19), 0);
            j(by0Var15).a(gz0Var.j(by0Var2), 0);
        } else {
            cy0 j9 = j(by0Var);
            cy0 j10 = gz0Var.j(by0Var2);
            if (j9.i(j10)) {
                by0 by0Var20 = by0.BASELINE;
                if (by0Var == by0Var20) {
                    cy0 j11 = j(by0.TOP);
                    cy0 j12 = j(by0.BOTTOM);
                    if (j11 != null) {
                        j11.j();
                    }
                    if (j12 != null) {
                        j12.j();
                    }
                } else if (by0Var != by0.TOP && by0Var != by0.BOTTOM) {
                    if (by0Var == by0.LEFT || by0Var == by0.RIGHT) {
                        cy0 j13 = j(by0Var5);
                        if (j13.f != j10) {
                            j13.j();
                        }
                        cy0 f = j(by0Var).f();
                        cy0 j14 = j(by0Var14);
                        if (j14.h()) {
                            f.j();
                            j14.j();
                        }
                    }
                } else {
                    cy0 j15 = j(by0Var20);
                    if (j15 != null) {
                        j15.j();
                    }
                    cy0 j16 = j(by0Var5);
                    if (j16.f != j10) {
                        j16.j();
                    }
                    cy0 f2 = j(by0Var).f();
                    cy0 j17 = j(by0Var15);
                    if (j17.h()) {
                        f2.j();
                        j17.j();
                    }
                }
                j9.a(j10, i);
            }
        }
    }

    public final void f(cy0 cy0Var, cy0 cy0Var2, int i) {
        if (cy0Var.d == this) {
            e(cy0Var.e, cy0Var2.d, cy0Var2.e, i);
        }
    }

    public void g(gz0 gz0Var, HashMap hashMap) {
        gz0 gz0Var2;
        gz0 gz0Var3;
        this.o = gz0Var.o;
        this.p = gz0Var.p;
        this.r = gz0Var.r;
        this.s = gz0Var.s;
        int[] iArr = gz0Var.t;
        int i = iArr[0];
        int[] iArr2 = this.t;
        iArr2[0] = i;
        iArr2[1] = iArr[1];
        this.u = gz0Var.u;
        this.v = gz0Var.v;
        this.x = gz0Var.x;
        this.y = gz0Var.y;
        this.z = gz0Var.z;
        this.A = gz0Var.A;
        this.B = gz0Var.B;
        int[] iArr3 = gz0Var.C;
        this.C = Arrays.copyOf(iArr3, iArr3.length);
        this.D = gz0Var.D;
        this.E = gz0Var.E;
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.T = (fz0[]) Arrays.copyOf(this.T, 2);
        gz0 gz0Var4 = null;
        if (this.U == null) {
            gz0Var2 = null;
        } else {
            gz0Var2 = (gz0) hashMap.get(gz0Var.U);
        }
        this.U = gz0Var2;
        this.V = gz0Var.V;
        this.W = gz0Var.W;
        this.X = gz0Var.X;
        this.Y = gz0Var.Y;
        this.Z = gz0Var.Z;
        this.a0 = gz0Var.a0;
        this.b0 = gz0Var.b0;
        this.c0 = gz0Var.c0;
        this.d0 = gz0Var.d0;
        this.e0 = gz0Var.e0;
        this.f0 = gz0Var.f0;
        this.g0 = gz0Var.g0;
        this.h0 = gz0Var.h0;
        this.i0 = gz0Var.i0;
        this.j0 = gz0Var.j0;
        this.k0 = gz0Var.k0;
        this.l0 = gz0Var.l0;
        float[] fArr = gz0Var.m0;
        float f = fArr[0];
        float[] fArr2 = this.m0;
        fArr2[0] = f;
        fArr2[1] = fArr[1];
        gz0[] gz0VarArr = gz0Var.n0;
        gz0 gz0Var5 = gz0VarArr[0];
        gz0[] gz0VarArr2 = this.n0;
        gz0VarArr2[0] = gz0Var5;
        gz0VarArr2[1] = gz0VarArr[1];
        gz0[] gz0VarArr3 = gz0Var.o0;
        gz0 gz0Var6 = gz0VarArr3[0];
        gz0[] gz0VarArr4 = this.o0;
        gz0VarArr4[0] = gz0Var6;
        gz0VarArr4[1] = gz0VarArr3[1];
        gz0 gz0Var7 = gz0Var.p0;
        if (gz0Var7 == null) {
            gz0Var3 = null;
        } else {
            gz0Var3 = (gz0) hashMap.get(gz0Var7);
        }
        this.p0 = gz0Var3;
        gz0 gz0Var8 = gz0Var.q0;
        if (gz0Var8 != null) {
            gz0Var4 = (gz0) hashMap.get(gz0Var8);
        }
        this.q0 = gz0Var4;
    }

    public final void h(ho3 ho3Var) {
        ho3Var.k(this.I);
        ho3Var.k(this.J);
        ho3Var.k(this.K);
        ho3Var.k(this.L);
        if (this.b0 > 0) {
            ho3Var.k(this.M);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [be7, m87] */
    /* JADX WARN: Type inference failed for: r0v3, types: [be7, ks2] */
    public final void i() {
        if (this.d == null) {
            ?? be7Var = new be7(this);
            be7Var.h.e = xd1.LEFT;
            be7Var.i.e = xd1.RIGHT;
            be7Var.f = 0;
            this.d = be7Var;
        }
        if (this.e == null) {
            ?? be7Var2 = new be7(this);
            yd1 yd1Var = new yd1(be7Var2);
            be7Var2.k = yd1Var;
            be7Var2.l = null;
            be7Var2.h.e = xd1.TOP;
            be7Var2.i.e = xd1.BOTTOM;
            yd1Var.e = xd1.BASELINE;
            be7Var2.f = 1;
            this.e = be7Var2;
        }
    }

    public cy0 j(by0 by0Var) {
        switch (ez0.a[by0Var.ordinal()]) {
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
            case ig7.b /* 6 */:
                return this.P;
            case 7:
                return this.N;
            case 8:
                return this.O;
            case 9:
                return null;
            default:
                throw new AssertionError(by0Var.name());
        }
    }

    public final fz0 k(int i) {
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

    public final gz0 m(int i) {
        cy0 cy0Var;
        cy0 cy0Var2;
        if (i == 0) {
            cy0 cy0Var3 = this.K;
            cy0 cy0Var4 = cy0Var3.f;
            if (cy0Var4 != null && cy0Var4.f == cy0Var3) {
                return cy0Var4.d;
            }
            return null;
        } else if (i == 1 && (cy0Var2 = (cy0Var = this.L).f) != null && cy0Var2.f == cy0Var) {
            return cy0Var2.d;
        } else {
            return null;
        }
    }

    public final gz0 n(int i) {
        cy0 cy0Var;
        cy0 cy0Var2;
        if (i == 0) {
            cy0 cy0Var3 = this.I;
            cy0 cy0Var4 = cy0Var3.f;
            if (cy0Var4 != null && cy0Var4.f == cy0Var3) {
                return cy0Var4.d;
            }
            return null;
        } else if (i == 1 && (cy0Var2 = (cy0Var = this.J).f) != null && cy0Var2.f == cy0Var) {
            return cy0Var2.d;
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
        fz0 fz0Var = this.T[0];
        float[] fArr = this.m0;
        float f2 = fArr[0];
        p(sb, "    width", i, i2, i3, i4, i5, f, fz0Var);
        int i6 = this.W;
        int i7 = this.d0;
        int i8 = this.C[1];
        int i9 = this.x;
        int i10 = this.s;
        float f3 = this.z;
        fz0 fz0Var2 = this.T[1];
        float f4 = fArr[1];
        p(sb, "    height", i6, i7, i8, i9, i10, f3, fz0Var2);
        float f5 = this.X;
        int i11 = this.Y;
        if (f5 != RecyclerView.A1) {
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
        gz0 gz0Var = this.U;
        if (gz0Var != null && (gz0Var instanceof hz0)) {
            return ((hz0) gz0Var).A0 + this.Z;
        }
        return this.Z;
    }

    public final int t() {
        gz0 gz0Var = this.U;
        if (gz0Var != null && (gz0Var instanceof hz0)) {
            return ((hz0) gz0Var).B0 + this.a0;
        }
        return this.a0;
    }

    public String toString() {
        String str = "";
        StringBuilder r = wh1.r("");
        if (this.j0 != null) {
            str = b31.q(new StringBuilder("id: "), this.j0, " ");
        }
        r.append(str);
        r.append("(");
        r.append(this.Z);
        r.append(", ");
        r.append(this.a0);
        r.append(") - (");
        r.append(this.V);
        r.append(" x ");
        return wh1.m(r, this.W, ")");
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
            cy0 r5 = r4.I
            cy0 r5 = r5.f
            if (r5 == 0) goto Ld
            r5 = r2
            goto Le
        Ld:
            r5 = r1
        Le:
            cy0 r4 = r4.K
            cy0 r4 = r4.f
            if (r4 == 0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = r1
        L17:
            int r5 = r5 + r4
            if (r5 >= r0) goto L3b
            goto L3a
        L1b:
            cy0 r5 = r4.J
            cy0 r5 = r5.f
            if (r5 == 0) goto L23
            r5 = r2
            goto L24
        L23:
            r5 = r1
        L24:
            cy0 r3 = r4.L
            cy0 r3 = r3.f
            if (r3 == 0) goto L2c
            r3 = r2
            goto L2d
        L2c:
            r3 = r1
        L2d:
            int r5 = r5 + r3
            cy0 r4 = r4.M
            cy0 r4 = r4.f
            if (r4 == 0) goto L36
            r4 = r2
            goto L37
        L36:
            r4 = r1
        L37:
            int r5 = r5 + r4
            if (r5 >= r0) goto L3b
        L3a:
            return r2
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gz0.u(int):boolean");
    }

    public final boolean v(int i, int i2) {
        cy0 cy0Var;
        cy0 cy0Var2;
        cy0 cy0Var3;
        cy0 cy0Var4;
        if (i == 0) {
            cy0 cy0Var5 = this.I;
            cy0 cy0Var6 = cy0Var5.f;
            if (cy0Var6 != null && cy0Var6.c && (cy0Var4 = (cy0Var3 = this.K).f) != null && cy0Var4.c) {
                if ((cy0Var4.d() - cy0Var3.e()) - (cy0Var5.e() + cy0Var5.f.d()) >= i2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        cy0 cy0Var7 = this.J;
        cy0 cy0Var8 = cy0Var7.f;
        if (cy0Var8 != null && cy0Var8.c && (cy0Var2 = (cy0Var = this.L).f) != null && cy0Var2.c) {
            if ((cy0Var2.d() - cy0Var.e()) - (cy0Var7.e() + cy0Var7.f.d()) >= i2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void w(by0 by0Var, gz0 gz0Var, by0 by0Var2, int i, int i2) {
        j(by0Var).b(gz0Var.j(by0Var2), i, i2, true);
    }

    public final boolean x(int i) {
        cy0 cy0Var;
        cy0 cy0Var2;
        int i2 = i * 2;
        cy0[] cy0VarArr = this.Q;
        cy0 cy0Var3 = cy0VarArr[i2];
        cy0 cy0Var4 = cy0Var3.f;
        if (cy0Var4 != null && cy0Var4.f != cy0Var3 && (cy0Var2 = (cy0Var = cy0VarArr[i2 + 1]).f) != null && cy0Var2.f == cy0Var) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        cy0 cy0Var = this.I;
        cy0 cy0Var2 = cy0Var.f;
        if (cy0Var2 == null || cy0Var2.f != cy0Var) {
            cy0 cy0Var3 = this.K;
            cy0 cy0Var4 = cy0Var3.f;
            if (cy0Var4 != null && cy0Var4.f == cy0Var3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean z() {
        cy0 cy0Var = this.J;
        cy0 cy0Var2 = cy0Var.f;
        if (cy0Var2 == null || cy0Var2.f != cy0Var) {
            cy0 cy0Var3 = this.L;
            cy0 cy0Var4 = cy0Var3.f;
            if (cy0Var4 != null && cy0Var4.f == cy0Var3) {
                return true;
            }
            return false;
        }
        return true;
    }
}
