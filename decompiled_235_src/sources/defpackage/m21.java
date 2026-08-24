package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m21  reason: default package */
/* loaded from: classes.dex */
public final class m21 extends l21 {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public jl0[] E0;
    public jl0[] F0;
    public int G0;
    public boolean H0;
    public boolean I0;
    public WeakReference J0;
    public WeakReference K0;
    public WeakReference L0;
    public WeakReference M0;
    public final HashSet N0;
    public final e30 O0;
    public ArrayList t0 = new ArrayList();
    public final bt u0 = new bt(this);
    public final ai1 v0;
    public int w0;
    public p11 x0;
    public boolean y0;
    public final jv3 z0;

    /* JADX WARN: Type inference failed for: r0v5, types: [e30, java.lang.Object] */
    public m21() {
        ai1 ai1Var = new ai1();
        ai1Var.b = true;
        ai1Var.c = true;
        ai1Var.f = new ArrayList();
        new ArrayList();
        ai1Var.h = null;
        ai1Var.i = new Object();
        ai1Var.g = new ArrayList();
        ai1Var.d = this;
        ai1Var.e = this;
        this.v0 = ai1Var;
        this.x0 = null;
        this.y0 = false;
        this.z0 = new jv3();
        this.C0 = 0;
        this.D0 = 0;
        this.E0 = new jl0[4];
        this.F0 = new jl0[4];
        this.G0 = Compress.MC20;
        this.H0 = false;
        this.I0 = false;
        this.J0 = null;
        this.K0 = null;
        this.L0 = null;
        this.M0 = null;
        this.N0 = new HashSet();
        this.O0 = new Object();
    }

    public static void W(l21 l21Var, p11 p11Var, e30 e30Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        if (p11Var == null) {
            return;
        }
        int i3 = l21Var.h0;
        int[] iArr = l21Var.t;
        if (i3 != 8 && !(l21Var instanceof av2) && !(l21Var instanceof a20)) {
            k21[] k21VarArr = l21Var.T;
            e30Var.a = k21VarArr[0];
            e30Var.b = k21VarArr[1];
            e30Var.c = l21Var.r();
            e30Var.d = l21Var.l();
            e30Var.i = false;
            e30Var.j = 0;
            k21 k21Var = e30Var.a;
            k21 k21Var2 = k21.MATCH_CONSTRAINT;
            if (k21Var == k21Var2) {
                z = true;
            } else {
                z = false;
            }
            if (e30Var.b == k21Var2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && l21Var.X > RecyclerView.B1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 && l21Var.X > RecyclerView.B1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z && l21Var.u(0) && l21Var.r == 0 && !z3) {
                e30Var.a = k21.WRAP_CONTENT;
                if (z2 && l21Var.s == 0) {
                    e30Var.a = k21.FIXED;
                }
                z = false;
            }
            if (z2 && l21Var.u(1) && l21Var.s == 0 && !z4) {
                e30Var.b = k21.WRAP_CONTENT;
                if (z && l21Var.r == 0) {
                    e30Var.b = k21.FIXED;
                }
                z2 = false;
            }
            if (l21Var.B()) {
                e30Var.a = k21.FIXED;
                z = false;
            }
            if (l21Var.C()) {
                e30Var.b = k21.FIXED;
                z2 = false;
            }
            if (z3) {
                if (iArr[0] == 4) {
                    e30Var.a = k21.FIXED;
                } else if (!z2) {
                    k21 k21Var3 = e30Var.b;
                    k21 k21Var4 = k21.FIXED;
                    if (k21Var3 == k21Var4) {
                        i2 = e30Var.d;
                    } else {
                        e30Var.a = k21.WRAP_CONTENT;
                        p11Var.b(l21Var, e30Var);
                        i2 = e30Var.f;
                    }
                    e30Var.a = k21Var4;
                    e30Var.c = (int) (l21Var.X * i2);
                }
            }
            if (z4) {
                if (iArr[1] == 4) {
                    e30Var.b = k21.FIXED;
                } else if (!z) {
                    k21 k21Var5 = e30Var.a;
                    k21 k21Var6 = k21.FIXED;
                    if (k21Var5 == k21Var6) {
                        i = e30Var.c;
                    } else {
                        e30Var.b = k21.WRAP_CONTENT;
                        p11Var.b(l21Var, e30Var);
                        i = e30Var.e;
                    }
                    e30Var.b = k21Var6;
                    int i4 = l21Var.Y;
                    float f = l21Var.X;
                    if (i4 == -1) {
                        e30Var.d = (int) (i / f);
                    } else {
                        e30Var.d = (int) (f * i);
                    }
                }
            }
            p11Var.b(l21Var, e30Var);
            l21Var.P(e30Var.e);
            l21Var.M(e30Var.f);
            l21Var.E = e30Var.h;
            l21Var.J(e30Var.g);
            e30Var.j = 0;
            return;
        }
        e30Var.e = 0;
        e30Var.f = 0;
    }

    @Override // defpackage.l21
    public final void D() {
        this.z0.t();
        this.A0 = 0;
        this.B0 = 0;
        this.t0.clear();
        super.D();
    }

    @Override // defpackage.l21
    public final void G(bt btVar) {
        super.G(btVar);
        int size = this.t0.size();
        for (int i = 0; i < size; i++) {
            ((l21) this.t0.get(i)).G(btVar);
        }
    }

    @Override // defpackage.l21
    public final void Q(boolean z, boolean z2) {
        super.Q(z, z2);
        int size = this.t0.size();
        for (int i = 0; i < size; i++) {
            ((l21) this.t0.get(i)).Q(z, z2);
        }
    }

    public final void S(l21 l21Var, int i) {
        if (i == 0) {
            int i2 = this.C0 + 1;
            jl0[] jl0VarArr = this.F0;
            if (i2 >= jl0VarArr.length) {
                this.F0 = (jl0[]) Arrays.copyOf(jl0VarArr, jl0VarArr.length * 2);
            }
            jl0[] jl0VarArr2 = this.F0;
            int i3 = this.C0;
            jl0VarArr2[i3] = new jl0(l21Var, 0, this.y0);
            this.C0 = i3 + 1;
        } else if (i == 1) {
            int i4 = this.D0 + 1;
            jl0[] jl0VarArr3 = this.E0;
            if (i4 >= jl0VarArr3.length) {
                this.E0 = (jl0[]) Arrays.copyOf(jl0VarArr3, jl0VarArr3.length * 2);
            }
            jl0[] jl0VarArr4 = this.E0;
            int i5 = this.D0;
            jl0VarArr4[i5] = new jl0(l21Var, 1, this.y0);
            this.D0 = i5 + 1;
        }
    }

    public final void T(jv3 jv3Var) {
        m21 m21Var;
        jv3 jv3Var2;
        int i;
        boolean X = X(64);
        b(jv3Var, X);
        int size = this.t0.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            l21 l21Var = (l21) this.t0.get(i2);
            boolean[] zArr = l21Var.S;
            zArr[0] = false;
            zArr[1] = false;
            if (l21Var instanceof a20) {
                z = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                l21 l21Var2 = (l21) this.t0.get(i3);
                if (l21Var2 instanceof a20) {
                    a20 a20Var = (a20) l21Var2;
                    for (int i4 = 0; i4 < a20Var.u0; i4++) {
                        l21 l21Var3 = a20Var.t0[i4];
                        if (a20Var.w0 || l21Var3.c()) {
                            int i5 = a20Var.v0;
                            if (i5 != 0 && i5 != 1) {
                                if (i5 == 2 || i5 == 3) {
                                    l21Var3.S[1] = true;
                                }
                            } else {
                                l21Var3.S[0] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.N0;
        hashSet.clear();
        for (int i6 = 0; i6 < size; i6++) {
            l21 l21Var4 = (l21) this.t0.get(i6);
            l21Var4.getClass();
            boolean z2 = l21Var4 instanceof rq7;
            if (z2 || (l21Var4 instanceof av2)) {
                if (z2) {
                    hashSet.add(l21Var4);
                } else {
                    l21Var4.b(jv3Var, X);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                rq7 rq7Var = (rq7) ((l21) it.next());
                for (int i7 = 0; i7 < rq7Var.u0; i7++) {
                    if (hashSet.contains(rq7Var.t0[i7])) {
                        rq7Var.b(jv3Var, X);
                        hashSet.remove(rq7Var);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((l21) it2.next()).b(jv3Var, X);
                }
                hashSet.clear();
            }
        }
        if (jv3.q) {
            HashSet hashSet2 = new HashSet();
            for (int i8 = 0; i8 < size; i8++) {
                l21 l21Var5 = (l21) this.t0.get(i8);
                l21Var5.getClass();
                if (!(l21Var5 instanceof rq7) && !(l21Var5 instanceof av2)) {
                    hashSet2.add(l21Var5);
                }
            }
            if (this.T[0] == k21.WRAP_CONTENT) {
                i = 0;
            } else {
                i = 1;
            }
            m21Var = this;
            jv3Var2 = jv3Var;
            m21Var.a(this, jv3Var2, hashSet2, i, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                l21 l21Var6 = (l21) it3.next();
                n16.q(m21Var, jv3Var2, l21Var6);
                l21Var6.b(jv3Var2, X);
            }
        } else {
            m21Var = this;
            jv3Var2 = jv3Var;
            for (int i9 = 0; i9 < size; i9++) {
                l21 l21Var7 = (l21) m21Var.t0.get(i9);
                if (l21Var7 instanceof m21) {
                    k21[] k21VarArr = l21Var7.T;
                    k21 k21Var = k21VarArr[0];
                    k21 k21Var2 = k21VarArr[1];
                    k21 k21Var3 = k21.WRAP_CONTENT;
                    if (k21Var == k21Var3) {
                        l21Var7.N(k21.FIXED);
                    }
                    if (k21Var2 == k21Var3) {
                        l21Var7.O(k21.FIXED);
                    }
                    l21Var7.b(jv3Var2, X);
                    if (k21Var == k21Var3) {
                        l21Var7.N(k21Var);
                    }
                    if (k21Var2 == k21Var3) {
                        l21Var7.O(k21Var2);
                    }
                } else {
                    n16.q(m21Var, jv3Var2, l21Var7);
                    if (!(l21Var7 instanceof rq7) && !(l21Var7 instanceof av2)) {
                        l21Var7.b(jv3Var2, X);
                    }
                }
            }
        }
        if (m21Var.C0 > 0) {
            nc1.C(m21Var, jv3Var2, null, 0);
        }
        if (m21Var.D0 > 0) {
            nc1.C(m21Var, jv3Var2, null, 1);
        }
    }

    public final boolean U(int i, boolean z) {
        boolean z2;
        k21 k21Var;
        ai1 ai1Var = this.v0;
        ArrayList arrayList = (ArrayList) ai1Var.f;
        m21 m21Var = (m21) ai1Var.d;
        boolean z3 = false;
        k21 k = m21Var.k(0);
        k21 k2 = m21Var.k(1);
        int s = m21Var.s();
        int t = m21Var.t();
        if (z && (k == (k21Var = k21.WRAP_CONTENT) || k2 == k21Var)) {
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                ct7 ct7Var = (ct7) obj;
                if (ct7Var.f == i && !ct7Var.k()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && k == k21.WRAP_CONTENT) {
                    m21Var.N(k21.FIXED);
                    m21Var.P(ai1Var.e(m21Var, 0));
                    m21Var.d.e.d(m21Var.r());
                }
            } else if (z && k2 == k21.WRAP_CONTENT) {
                m21Var.O(k21.FIXED);
                m21Var.M(ai1Var.e(m21Var, 1));
                m21Var.e.e.d(m21Var.l());
            }
        }
        k21[] k21VarArr = m21Var.T;
        if (i == 0) {
            k21 k21Var2 = k21VarArr[0];
            if (k21Var2 == k21.FIXED || k21Var2 == k21.MATCH_PARENT) {
                int r = m21Var.r() + s;
                m21Var.d.i.d(r);
                m21Var.d.e.d(r - s);
                z2 = true;
            }
            z2 = false;
        } else {
            k21 k21Var3 = k21VarArr[1];
            if (k21Var3 == k21.FIXED || k21Var3 == k21.MATCH_PARENT) {
                int l = m21Var.l() + t;
                m21Var.e.i.d(l);
                m21Var.e.e.d(l - t);
                z2 = true;
            }
            z2 = false;
        }
        ai1Var.i();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            ct7 ct7Var2 = (ct7) obj2;
            if (ct7Var2.f == i && (ct7Var2.b != m21Var || ct7Var2.g)) {
                ct7Var2.e();
            }
        }
        int size3 = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 < size3) {
                Object obj3 = arrayList.get(i4);
                i4++;
                ct7 ct7Var3 = (ct7) obj3;
                if (ct7Var3.f == i && (z2 || ct7Var3.b != m21Var)) {
                    if (!ct7Var3.h.j) {
                        break;
                    } else if (!ct7Var3.i.j) {
                        break;
                    } else if (!(ct7Var3 instanceof kl0) && !ct7Var3.e.j) {
                        break;
                    }
                }
            } else {
                z3 = true;
                break;
            }
        }
        m21Var.N(k);
        m21Var.O(k2);
        return z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:337:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0626 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0692 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0826 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:490:0x08b3  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x08df  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0938  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0927 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v11, types: [e30, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V() {
        boolean[] zArr;
        int i;
        k21 k21Var;
        h11 h11Var;
        h11 h11Var2;
        int i2;
        int i3;
        k21 k21Var2;
        int i4;
        boolean z;
        boolean z2;
        char c;
        k21 k21Var3;
        k21 k21Var4;
        boolean z3;
        int i5;
        int i6;
        boolean z4;
        boolean z5;
        boolean z6;
        h11 h11Var3;
        boolean z7;
        boolean z8;
        int i7;
        int max;
        int max2;
        ?? r9;
        int i8;
        k21 k21Var5;
        int i9;
        int i10;
        k21 k21Var6;
        k21 k21Var7;
        zs7 zs7Var;
        zs7 zs7Var2;
        k21 k21Var8;
        int i11;
        int i12;
        int i13;
        int b;
        int b2;
        zs7 zs7Var3;
        zs7 zs7Var4;
        int i14;
        int i15;
        boolean[] zArr2 = n16.n;
        this.Z = 0;
        this.a0 = 0;
        this.H0 = false;
        this.I0 = false;
        int size = this.t0.size();
        int max3 = Math.max(0, r());
        int max4 = Math.max(0, l());
        k21[] k21VarArr = this.T;
        k21 k21Var9 = k21VarArr[1];
        k21 k21Var10 = k21VarArr[0];
        int i16 = this.w0;
        h11 h11Var4 = this.J;
        h11 h11Var5 = this.I;
        if (i16 == 0 && n16.v(this.G0, 1)) {
            p11 p11Var = this.x0;
            k21[] k21VarArr2 = this.T;
            k21 k21Var11 = k21VarArr2[0];
            k21 k21Var12 = k21VarArr2[1];
            F();
            ArrayList arrayList = this.t0;
            int size2 = arrayList.size();
            for (int i17 = 0; i17 < size2; i17++) {
                ((l21) arrayList.get(i17)).F();
            }
            boolean z9 = this.y0;
            if (k21Var11 == k21.FIXED) {
                K(0, r());
            } else {
                h11Var5.l(0);
                this.Z = 0;
            }
            boolean z10 = false;
            int i18 = 0;
            boolean z11 = false;
            while (i18 < size2) {
                boolean[] zArr3 = zArr2;
                l21 l21Var = (l21) arrayList.get(i18);
                boolean z12 = z10;
                if (l21Var instanceof av2) {
                    av2 av2Var = (av2) l21Var;
                    i15 = i18;
                    if (av2Var.x0 == 1) {
                        int i19 = av2Var.u0;
                        if (i19 != -1) {
                            av2Var.S(i19);
                        } else if (av2Var.v0 != -1 && B()) {
                            av2Var.S(r() - av2Var.v0);
                        } else if (B()) {
                            av2Var.S((int) ((av2Var.t0 * r()) + 0.5f));
                        }
                        z12 = true;
                    }
                } else {
                    i15 = i18;
                    if ((l21Var instanceof a20) && ((a20) l21Var).W() == 0) {
                        z10 = z12;
                        z11 = true;
                        i18 = i15 + 1;
                        zArr2 = zArr3;
                    }
                }
                z10 = z12;
                i18 = i15 + 1;
                zArr2 = zArr3;
            }
            zArr = zArr2;
            if (z10) {
                for (int i20 = 0; i20 < size2; i20 = i14 + 1) {
                    l21 l21Var2 = (l21) arrayList.get(i20);
                    if (l21Var2 instanceof av2) {
                        av2 av2Var2 = (av2) l21Var2;
                        i14 = i20;
                        if (av2Var2.x0 == 1) {
                            l.y(0, p11Var, av2Var2, z9);
                        }
                    } else {
                        i14 = i20;
                    }
                }
            }
            l.y(0, p11Var, this, z9);
            if (z11) {
                for (int i21 = 0; i21 < size2; i21++) {
                    l21 l21Var3 = (l21) arrayList.get(i21);
                    if (l21Var3 instanceof a20) {
                        a20 a20Var = (a20) l21Var3;
                        if (a20Var.W() == 0 && a20Var.V()) {
                            l.y(1, p11Var, a20Var, z9);
                        }
                    }
                }
            }
            if (k21Var12 == k21.FIXED) {
                L(0, l());
            } else {
                h11Var4.l(0);
                this.a0 = 0;
            }
            int i22 = 0;
            boolean z13 = false;
            boolean z14 = false;
            while (i22 < size2) {
                l21 l21Var4 = (l21) arrayList.get(i22);
                int i23 = i22;
                if (l21Var4 instanceof av2) {
                    av2 av2Var3 = (av2) l21Var4;
                    if (av2Var3.x0 == 0) {
                        int i24 = av2Var3.u0;
                        if (i24 != -1) {
                            av2Var3.S(i24);
                        } else if (av2Var3.v0 != -1 && C()) {
                            av2Var3.S(l() - av2Var3.v0);
                        } else if (C()) {
                            av2Var3.S((int) ((av2Var3.t0 * l()) + 0.5f));
                        }
                        z13 = true;
                    }
                } else if ((l21Var4 instanceof a20) && ((a20) l21Var4).W() == 1) {
                    z14 = true;
                }
                i22 = i23 + 1;
            }
            if (z13) {
                for (int i25 = 0; i25 < size2; i25++) {
                    l21 l21Var5 = (l21) arrayList.get(i25);
                    if (l21Var5 instanceof av2) {
                        av2 av2Var4 = (av2) l21Var5;
                        if (av2Var4.x0 == 0) {
                            l.U(1, p11Var, av2Var4);
                        }
                    }
                }
            }
            l.U(0, p11Var, this);
            if (z14) {
                for (int i26 = 0; i26 < size2; i26++) {
                    l21 l21Var6 = (l21) arrayList.get(i26);
                    if (l21Var6 instanceof a20) {
                        a20 a20Var2 = (a20) l21Var6;
                        if (a20Var2.W() == 1 && a20Var2.V()) {
                            l.U(1, p11Var, a20Var2);
                        }
                    }
                }
            }
            for (int i27 = 0; i27 < size2; i27++) {
                l21 l21Var7 = (l21) arrayList.get(i27);
                if (l21Var7.A() && l.m(l21Var7)) {
                    W(l21Var7, p11Var, l.f);
                    if (l21Var7 instanceof av2) {
                        if (((av2) l21Var7).x0 == 0) {
                            l.U(0, p11Var, l21Var7);
                        } else {
                            l.y(0, p11Var, l21Var7, z9);
                        }
                    } else {
                        l.y(0, p11Var, l21Var7, z9);
                        l.U(0, p11Var, l21Var7);
                    }
                }
            }
            for (int i28 = 0; i28 < size; i28++) {
                l21 l21Var8 = (l21) this.t0.get(i28);
                if (l21Var8.A() && !(l21Var8 instanceof av2) && !(l21Var8 instanceof a20) && !(l21Var8 instanceof rq7) && !l21Var8.F) {
                    k21 k = l21Var8.k(0);
                    k21 k2 = l21Var8.k(1);
                    k21 k21Var13 = k21.MATCH_CONSTRAINT;
                    if (k != k21Var13 || l21Var8.r == 1 || k2 != k21Var13 || l21Var8.s == 1) {
                        W(l21Var8, this.x0, new Object());
                    }
                }
            }
        } else {
            zArr = zArr2;
        }
        jv3 jv3Var = this.z0;
        if (size <= 2 || ((k21Var10 != (k21Var5 = k21.WRAP_CONTENT) && k21Var9 != k21Var5) || !n16.v(this.G0, 1024))) {
            i = size;
            k21Var = k21Var10;
            h11Var = h11Var4;
            h11Var2 = h11Var5;
            i2 = max3;
            i3 = max4;
            k21Var2 = k21Var9;
        } else {
            p11 p11Var2 = this.x0;
            ArrayList arrayList2 = this.t0;
            int size3 = arrayList2.size();
            int i29 = 0;
            while (i29 < size3) {
                l21 l21Var9 = (l21) arrayList2.get(i29);
                k21[] k21VarArr3 = this.T;
                k21 k21Var14 = k21VarArr3[0];
                k21 k21Var15 = k21VarArr3[1];
                int i30 = i29;
                k21[] k21VarArr4 = l21Var9.T;
                h11Var2 = h11Var5;
                if (!kj2.e0(k21Var14, k21Var15, k21VarArr4[0], k21VarArr4[1]) || (l21Var9 instanceof me2)) {
                    i9 = max3;
                    i = size;
                    i10 = max4;
                    k21Var6 = k21Var10;
                    k21Var7 = k21Var9;
                    h11Var = h11Var4;
                    break;
                }
                i29 = i30 + 1;
                h11Var5 = h11Var2;
            }
            h11Var2 = h11Var5;
            i = size;
            h11Var = h11Var4;
            int i31 = 0;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            ArrayList arrayList6 = null;
            ArrayList arrayList7 = null;
            ArrayList arrayList8 = null;
            while (i31 < size3) {
                int i32 = i31;
                l21 l21Var10 = (l21) arrayList2.get(i31);
                int i33 = max4;
                k21[] k21VarArr5 = this.T;
                k21 k21Var16 = k21VarArr5[0];
                k21 k21Var17 = k21Var9;
                k21 k21Var18 = k21VarArr5[1];
                int i34 = max3;
                k21[] k21VarArr6 = l21Var10.T;
                k21 k21Var19 = k21Var10;
                if (!kj2.e0(k21Var16, k21Var18, k21VarArr6[0], k21VarArr6[1])) {
                    W(l21Var10, p11Var2, this.O0);
                }
                boolean z15 = l21Var10 instanceof av2;
                if (z15) {
                    av2 av2Var5 = (av2) l21Var10;
                    if (av2Var5.x0 == 0) {
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                        }
                        arrayList7.add(av2Var5);
                    }
                    if (av2Var5.x0 == 1) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(av2Var5);
                    }
                }
                if (l21Var10 instanceof gx2) {
                    if (l21Var10 instanceof a20) {
                        a20 a20Var3 = (a20) l21Var10;
                        if (a20Var3.W() == 0) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(a20Var3);
                        }
                        if (a20Var3.W() == 1) {
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                            }
                            arrayList8.add(a20Var3);
                        }
                    } else {
                        gx2 gx2Var = (gx2) l21Var10;
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                        }
                        arrayList6.add(gx2Var);
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                        }
                        arrayList8.add(gx2Var);
                    }
                }
                if (l21Var10.I.f == null && l21Var10.K.f == null && !z15 && !(l21Var10 instanceof a20)) {
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                    }
                    arrayList5.add(l21Var10);
                }
                if (l21Var10.J.f == null && l21Var10.L.f == null && l21Var10.M.f == null && !z15 && !(l21Var10 instanceof a20)) {
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(l21Var10);
                }
                i31 = i32 + 1;
                max4 = i33;
                max3 = i34;
                k21Var9 = k21Var17;
                k21Var10 = k21Var19;
            }
            i9 = max3;
            i10 = max4;
            k21Var6 = k21Var10;
            k21Var7 = k21Var9;
            ArrayList arrayList9 = new ArrayList();
            if (arrayList3 != null) {
                int size4 = arrayList3.size();
                int i35 = 0;
                while (i35 < size4) {
                    Object obj = arrayList3.get(i35);
                    i35++;
                    kj2.x((av2) obj, 0, arrayList9, null);
                }
            }
            if (arrayList6 != null) {
                int size5 = arrayList6.size();
                int i36 = 0;
                while (i36 < size5) {
                    Object obj2 = arrayList6.get(i36);
                    i36++;
                    gx2 gx2Var2 = (gx2) obj2;
                    zs7 x = kj2.x(gx2Var2, 0, arrayList9, null);
                    gx2Var2.T(0, x, arrayList9);
                    x.a(arrayList9);
                }
            }
            HashSet hashSet = j(g11.LEFT).a;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    kj2.x(((h11) it.next()).d, 0, arrayList9, null);
                }
            }
            HashSet hashSet2 = j(g11.RIGHT).a;
            if (hashSet2 != null) {
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    kj2.x(((h11) it2.next()).d, 0, arrayList9, null);
                }
            }
            HashSet hashSet3 = j(g11.CENTER).a;
            if (hashSet3 != null) {
                Iterator it3 = hashSet3.iterator();
                while (it3.hasNext()) {
                    kj2.x(((h11) it3.next()).d, 0, arrayList9, null);
                }
            }
            if (arrayList5 != null) {
                int size6 = arrayList5.size();
                int i37 = 0;
                while (i37 < size6) {
                    Object obj3 = arrayList5.get(i37);
                    i37++;
                    kj2.x((l21) obj3, 0, arrayList9, null);
                }
            }
            if (arrayList7 != null) {
                int size7 = arrayList7.size();
                int i38 = 0;
                while (i38 < size7) {
                    Object obj4 = arrayList7.get(i38);
                    i38++;
                    kj2.x((av2) obj4, 1, arrayList9, null);
                }
            }
            if (arrayList8 != null) {
                int size8 = arrayList8.size();
                int i39 = 0;
                while (i39 < size8) {
                    Object obj5 = arrayList8.get(i39);
                    i39++;
                    gx2 gx2Var3 = (gx2) obj5;
                    zs7 x2 = kj2.x(gx2Var3, 1, arrayList9, null);
                    gx2Var3.T(1, x2, arrayList9);
                    x2.a(arrayList9);
                }
            }
            HashSet hashSet4 = j(g11.TOP).a;
            if (hashSet4 != null) {
                Iterator it4 = hashSet4.iterator();
                while (it4.hasNext()) {
                    kj2.x(((h11) it4.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet5 = j(g11.BASELINE).a;
            if (hashSet5 != null) {
                Iterator it5 = hashSet5.iterator();
                while (it5.hasNext()) {
                    kj2.x(((h11) it5.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet6 = j(g11.BOTTOM).a;
            if (hashSet6 != null) {
                Iterator it6 = hashSet6.iterator();
                while (it6.hasNext()) {
                    kj2.x(((h11) it6.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet7 = j(g11.CENTER).a;
            if (hashSet7 != null) {
                Iterator it7 = hashSet7.iterator();
                while (it7.hasNext()) {
                    kj2.x(((h11) it7.next()).d, 1, arrayList9, null);
                }
            }
            if (arrayList4 != null) {
                int size9 = arrayList4.size();
                int i40 = 0;
                while (i40 < size9) {
                    Object obj6 = arrayList4.get(i40);
                    i40++;
                    kj2.x((l21) obj6, 1, arrayList9, null);
                }
            }
            for (int i41 = 0; i41 < size3; i41++) {
                l21 l21Var11 = (l21) arrayList2.get(i41);
                k21[] k21VarArr7 = l21Var11.T;
                k21 k21Var20 = k21VarArr7[0];
                k21 k21Var21 = k21.MATCH_CONSTRAINT;
                if (k21Var20 == k21Var21 && k21VarArr7[1] == k21Var21) {
                    int i42 = l21Var11.r0;
                    int size10 = arrayList9.size();
                    int i43 = 0;
                    while (true) {
                        if (i43 < size10) {
                            zs7Var3 = (zs7) arrayList9.get(i43);
                            if (i42 == zs7Var3.b) {
                                break;
                            }
                            i43++;
                        } else {
                            zs7Var3 = null;
                            break;
                        }
                    }
                    int i44 = l21Var11.s0;
                    int size11 = arrayList9.size();
                    int i45 = 0;
                    while (true) {
                        if (i45 < size11) {
                            zs7Var4 = (zs7) arrayList9.get(i45);
                            if (i44 == zs7Var4.b) {
                                break;
                            }
                            i45++;
                        } else {
                            zs7Var4 = null;
                            break;
                        }
                    }
                    if (zs7Var3 != null && zs7Var4 != null) {
                        zs7Var3.c(0, zs7Var4);
                        zs7Var4.c = 2;
                        arrayList9.remove(zs7Var3);
                    }
                }
            }
            if (arrayList9.size() > 1) {
                if (this.T[0] == k21.WRAP_CONTENT) {
                    int size12 = arrayList9.size();
                    int i46 = 0;
                    int i47 = 0;
                    zs7Var = null;
                    while (i47 < size12) {
                        Object obj7 = arrayList9.get(i47);
                        i47++;
                        zs7 zs7Var5 = (zs7) obj7;
                        if (zs7Var5.c != 1 && (b2 = zs7Var5.b(jv3Var, 0)) > i46) {
                            zs7Var = zs7Var5;
                            i46 = b2;
                        }
                    }
                    if (zs7Var != null) {
                        N(k21.FIXED);
                        P(i46);
                        if (this.T[1] == k21.WRAP_CONTENT) {
                            int size13 = arrayList9.size();
                            int i48 = 0;
                            int i49 = 0;
                            zs7Var2 = null;
                            while (i49 < size13) {
                                Object obj8 = arrayList9.get(i49);
                                i49++;
                                zs7 zs7Var6 = (zs7) obj8;
                                if (zs7Var6.c != 0 && (b = zs7Var6.b(jv3Var, 1)) > i48) {
                                    zs7Var2 = zs7Var6;
                                    i48 = b;
                                }
                            }
                            if (zs7Var2 != null) {
                                O(k21.FIXED);
                                M(i48);
                                if (zs7Var == null || zs7Var2 != null) {
                                    k21Var8 = k21.WRAP_CONTENT;
                                    k21Var = k21Var6;
                                    if (k21Var == k21Var8) {
                                        i11 = i9;
                                        if (i11 < r() && i11 > 0) {
                                            P(i11);
                                            this.H0 = true;
                                        } else {
                                            i4 = r();
                                            k21Var2 = k21Var7;
                                            if (k21Var2 != k21Var8) {
                                                i12 = i10;
                                                if (i12 < l() && i12 > 0) {
                                                    M(i12);
                                                    this.I0 = true;
                                                } else {
                                                    i13 = l();
                                                    i3 = i13;
                                                    z = true;
                                                    if (X(64) && !X(128)) {
                                                        z2 = false;
                                                    } else {
                                                        z2 = true;
                                                    }
                                                    jv3Var.getClass();
                                                    jv3Var.h = false;
                                                    if (this.G0 == 0 && z2) {
                                                        c = 1;
                                                        jv3Var.h = true;
                                                    } else {
                                                        c = 1;
                                                    }
                                                    ArrayList arrayList10 = this.t0;
                                                    k21[] k21VarArr8 = this.T;
                                                    k21Var3 = k21VarArr8[0];
                                                    k21Var4 = k21.WRAP_CONTENT;
                                                    if (k21Var3 == k21Var4 && k21VarArr8[c] != k21Var4) {
                                                        z3 = false;
                                                    } else {
                                                        z3 = true;
                                                    }
                                                    this.C0 = 0;
                                                    this.D0 = 0;
                                                    i5 = i;
                                                    for (i6 = 0; i6 < i5; i6++) {
                                                        l21 l21Var12 = (l21) this.t0.get(i6);
                                                        if (l21Var12 instanceof m21) {
                                                            ((m21) l21Var12).V();
                                                        }
                                                    }
                                                    boolean X = X(64);
                                                    boolean z16 = z;
                                                    int i50 = 0;
                                                    z4 = true;
                                                    while (z4) {
                                                        int i51 = i50 + 1;
                                                        try {
                                                            jv3Var.t();
                                                            this.C0 = 0;
                                                            this.D0 = 0;
                                                            h(jv3Var);
                                                            for (int i52 = 0; i52 < i5; i52++) {
                                                                ((l21) this.t0.get(i52)).h(jv3Var);
                                                            }
                                                            T(jv3Var);
                                                            try {
                                                                WeakReference weakReference = this.J0;
                                                                if (weakReference != null && weakReference.get() != null) {
                                                                    h11Var3 = h11Var;
                                                                    try {
                                                                        z6 = z16;
                                                                    } catch (Exception e) {
                                                                        e = e;
                                                                        z6 = z16;
                                                                        z4 = true;
                                                                        e.printStackTrace();
                                                                        z7 = z4;
                                                                        System.out.println("EXCEPTION : " + e);
                                                                        if (!z7) {
                                                                        }
                                                                        if (!z3) {
                                                                        }
                                                                        z8 = X;
                                                                        i7 = i5;
                                                                        max = Math.max(this.c0, r());
                                                                        if (max > r()) {
                                                                        }
                                                                        max2 = Math.max(this.d0, l());
                                                                        if (max2 <= l()) {
                                                                        }
                                                                        if (!z6) {
                                                                        }
                                                                        z16 = z6;
                                                                        i8 = 8;
                                                                        if (i51 > i8) {
                                                                        }
                                                                        i50 = i51;
                                                                        h11Var = h11Var3;
                                                                        X = z8;
                                                                        i5 = i7;
                                                                    }
                                                                    try {
                                                                        jv3Var.f(jv3Var.k((h11) this.J0.get()), jv3Var.k(h11Var3), 0, 5);
                                                                        this.J0 = null;
                                                                    } catch (Exception e2) {
                                                                        e = e2;
                                                                        z4 = true;
                                                                        e.printStackTrace();
                                                                        z7 = z4;
                                                                        System.out.println("EXCEPTION : " + e);
                                                                        if (!z7) {
                                                                        }
                                                                        if (!z3) {
                                                                        }
                                                                        z8 = X;
                                                                        i7 = i5;
                                                                        max = Math.max(this.c0, r());
                                                                        if (max > r()) {
                                                                        }
                                                                        max2 = Math.max(this.d0, l());
                                                                        if (max2 <= l()) {
                                                                        }
                                                                        if (!z6) {
                                                                        }
                                                                        z16 = z6;
                                                                        i8 = 8;
                                                                        if (i51 > i8) {
                                                                        }
                                                                        i50 = i51;
                                                                        h11Var = h11Var3;
                                                                        X = z8;
                                                                        i5 = i7;
                                                                    }
                                                                } else {
                                                                    z6 = z16;
                                                                    h11Var3 = h11Var;
                                                                }
                                                                WeakReference weakReference2 = this.L0;
                                                                if (weakReference2 != null && weakReference2.get() != null) {
                                                                    jv3Var.f(jv3Var.k(this.L), jv3Var.k((h11) this.L0.get()), 0, 5);
                                                                    this.L0 = null;
                                                                }
                                                                WeakReference weakReference3 = this.K0;
                                                                if (weakReference3 != null && weakReference3.get() != null) {
                                                                    h11 h11Var6 = h11Var2;
                                                                    try {
                                                                        h11Var2 = h11Var6;
                                                                        jv3Var.f(jv3Var.k((h11) this.K0.get()), jv3Var.k(h11Var6), 0, 5);
                                                                        this.K0 = null;
                                                                    } catch (Exception e3) {
                                                                        e = e3;
                                                                        h11Var2 = h11Var6;
                                                                        z4 = true;
                                                                        e.printStackTrace();
                                                                        z7 = z4;
                                                                        System.out.println("EXCEPTION : " + e);
                                                                        if (!z7) {
                                                                        }
                                                                        if (!z3) {
                                                                        }
                                                                        z8 = X;
                                                                        i7 = i5;
                                                                        max = Math.max(this.c0, r());
                                                                        if (max > r()) {
                                                                        }
                                                                        max2 = Math.max(this.d0, l());
                                                                        if (max2 <= l()) {
                                                                        }
                                                                        if (!z6) {
                                                                        }
                                                                        z16 = z6;
                                                                        i8 = 8;
                                                                        if (i51 > i8) {
                                                                        }
                                                                        i50 = i51;
                                                                        h11Var = h11Var3;
                                                                        X = z8;
                                                                        i5 = i7;
                                                                    }
                                                                }
                                                                WeakReference weakReference4 = this.M0;
                                                                if (weakReference4 != null && weakReference4.get() != null) {
                                                                    try {
                                                                        jv3Var.f(jv3Var.k(this.K), jv3Var.k((h11) this.M0.get()), 0, 5);
                                                                    } catch (Exception e4) {
                                                                        e = e4;
                                                                        z4 = true;
                                                                        e.printStackTrace();
                                                                        z7 = z4;
                                                                        System.out.println("EXCEPTION : " + e);
                                                                        if (!z7) {
                                                                        }
                                                                        if (!z3) {
                                                                        }
                                                                        z8 = X;
                                                                        i7 = i5;
                                                                        max = Math.max(this.c0, r());
                                                                        if (max > r()) {
                                                                        }
                                                                        max2 = Math.max(this.d0, l());
                                                                        if (max2 <= l()) {
                                                                        }
                                                                        if (!z6) {
                                                                        }
                                                                        z16 = z6;
                                                                        i8 = 8;
                                                                        if (i51 > i8) {
                                                                        }
                                                                        i50 = i51;
                                                                        h11Var = h11Var3;
                                                                        X = z8;
                                                                        i5 = i7;
                                                                    }
                                                                    try {
                                                                        this.M0 = null;
                                                                    } catch (Exception e5) {
                                                                        e = e5;
                                                                        z4 = true;
                                                                        e.printStackTrace();
                                                                        z7 = z4;
                                                                        System.out.println("EXCEPTION : " + e);
                                                                        if (!z7) {
                                                                        }
                                                                        if (!z3) {
                                                                        }
                                                                        z8 = X;
                                                                        i7 = i5;
                                                                        max = Math.max(this.c0, r());
                                                                        if (max > r()) {
                                                                        }
                                                                        max2 = Math.max(this.d0, l());
                                                                        if (max2 <= l()) {
                                                                        }
                                                                        if (!z6) {
                                                                        }
                                                                        z16 = z6;
                                                                        i8 = 8;
                                                                        if (i51 > i8) {
                                                                        }
                                                                        i50 = i51;
                                                                        h11Var = h11Var3;
                                                                        X = z8;
                                                                        i5 = i7;
                                                                    }
                                                                }
                                                                jv3Var.p();
                                                                z7 = true;
                                                            } catch (Exception e6) {
                                                                e = e6;
                                                                z6 = z16;
                                                                h11Var3 = h11Var;
                                                            }
                                                        } catch (Exception e7) {
                                                            e = e7;
                                                            z6 = z16;
                                                            h11Var3 = h11Var;
                                                        }
                                                        if (!z7) {
                                                            zArr[2] = false;
                                                            boolean X2 = X(64);
                                                            R(jv3Var, X2);
                                                            int size14 = this.t0.size();
                                                            int i53 = 0;
                                                            z4 = false;
                                                            while (i53 < size14) {
                                                                int i54 = size14;
                                                                l21 l21Var13 = (l21) this.t0.get(i53);
                                                                l21Var13.R(jv3Var, X2);
                                                                boolean z17 = X2;
                                                                int i55 = i53;
                                                                if (l21Var13.h != -1 || l21Var13.i != -1) {
                                                                    z4 = true;
                                                                }
                                                                i53 = i55 + 1;
                                                                size14 = i54;
                                                                X2 = z17;
                                                            }
                                                        } else {
                                                            R(jv3Var, X);
                                                            for (int i56 = 0; i56 < i5; i56++) {
                                                                ((l21) this.t0.get(i56)).R(jv3Var, X);
                                                            }
                                                            z4 = false;
                                                        }
                                                        if (!z3 && i51 < 8) {
                                                            if (zArr[2]) {
                                                                int i57 = 0;
                                                                int i58 = 0;
                                                                int i59 = 0;
                                                                while (i59 < i5) {
                                                                    boolean z18 = X;
                                                                    l21 l21Var14 = (l21) this.t0.get(i59);
                                                                    i58 = Math.max(i58, l21Var14.r() + l21Var14.Z);
                                                                    i57 = Math.max(i57, l21Var14.l() + l21Var14.a0);
                                                                    i59++;
                                                                    X = z18;
                                                                    i5 = i5;
                                                                }
                                                                z8 = X;
                                                                i7 = i5;
                                                                int max5 = Math.max(this.c0, i58);
                                                                int max6 = Math.max(this.d0, i57);
                                                                k21 k21Var22 = k21.WRAP_CONTENT;
                                                                if (k21Var == k21Var22 && r() < max5) {
                                                                    P(max5);
                                                                    this.T[0] = k21Var22;
                                                                    z4 = true;
                                                                    z6 = true;
                                                                }
                                                                if (k21Var2 == k21Var22 && l() < max6) {
                                                                    M(max6);
                                                                    this.T[1] = k21Var22;
                                                                    z4 = true;
                                                                    z6 = true;
                                                                }
                                                            } else {
                                                                z8 = X;
                                                                i7 = i5;
                                                            }
                                                        } else {
                                                            z8 = X;
                                                            i7 = i5;
                                                        }
                                                        max = Math.max(this.c0, r());
                                                        if (max > r()) {
                                                            P(max);
                                                            this.T[0] = k21.FIXED;
                                                            z4 = true;
                                                            z6 = true;
                                                        }
                                                        max2 = Math.max(this.d0, l());
                                                        if (max2 <= l()) {
                                                            M(max2);
                                                            r9 = 1;
                                                            this.T[1] = k21.FIXED;
                                                            z4 = true;
                                                            z6 = true;
                                                        } else {
                                                            r9 = 1;
                                                        }
                                                        if (!z6) {
                                                            k21 k21Var23 = this.T[0];
                                                            k21 k21Var24 = k21.WRAP_CONTENT;
                                                            if (k21Var23 == k21Var24 && i4 > 0 && r() > i4) {
                                                                this.H0 = r9;
                                                                this.T[0] = k21.FIXED;
                                                                P(i4);
                                                                z4 = r9;
                                                                z6 = z4;
                                                            }
                                                            if (this.T[r9] == k21Var24 && i3 > 0 && l() > i3) {
                                                                this.I0 = r9;
                                                                this.T[r9] = k21.FIXED;
                                                                M(i3);
                                                                i8 = 8;
                                                                z16 = true;
                                                                z4 = true;
                                                                if (i51 > i8) {
                                                                    z4 = false;
                                                                }
                                                                i50 = i51;
                                                                h11Var = h11Var3;
                                                                X = z8;
                                                                i5 = i7;
                                                            }
                                                        }
                                                        z16 = z6;
                                                        i8 = 8;
                                                        if (i51 > i8) {
                                                        }
                                                        i50 = i51;
                                                        h11Var = h11Var3;
                                                        X = z8;
                                                        i5 = i7;
                                                    }
                                                    z5 = z16;
                                                    this.t0 = arrayList10;
                                                    if (z5) {
                                                        k21[] k21VarArr9 = this.T;
                                                        k21VarArr9[0] = k21Var;
                                                        k21VarArr9[1] = k21Var2;
                                                    }
                                                    G(jv3Var.m);
                                                }
                                            } else {
                                                i12 = i10;
                                            }
                                            i13 = i12;
                                            i3 = i13;
                                            z = true;
                                            if (X(64)) {
                                            }
                                            z2 = true;
                                            jv3Var.getClass();
                                            jv3Var.h = false;
                                            if (this.G0 == 0) {
                                            }
                                            c = 1;
                                            ArrayList arrayList102 = this.t0;
                                            k21[] k21VarArr82 = this.T;
                                            k21Var3 = k21VarArr82[0];
                                            k21Var4 = k21.WRAP_CONTENT;
                                            if (k21Var3 == k21Var4) {
                                            }
                                            z3 = true;
                                            this.C0 = 0;
                                            this.D0 = 0;
                                            i5 = i;
                                            while (i6 < i5) {
                                            }
                                            boolean X3 = X(64);
                                            boolean z162 = z;
                                            int i502 = 0;
                                            z4 = true;
                                            while (z4) {
                                            }
                                            z5 = z162;
                                            this.t0 = arrayList102;
                                            if (z5) {
                                            }
                                            G(jv3Var.m);
                                        }
                                    } else {
                                        i11 = i9;
                                    }
                                    i4 = i11;
                                    k21Var2 = k21Var7;
                                    if (k21Var2 != k21Var8) {
                                    }
                                    i13 = i12;
                                    i3 = i13;
                                    z = true;
                                    if (X(64)) {
                                    }
                                    z2 = true;
                                    jv3Var.getClass();
                                    jv3Var.h = false;
                                    if (this.G0 == 0) {
                                    }
                                    c = 1;
                                    ArrayList arrayList1022 = this.t0;
                                    k21[] k21VarArr822 = this.T;
                                    k21Var3 = k21VarArr822[0];
                                    k21Var4 = k21.WRAP_CONTENT;
                                    if (k21Var3 == k21Var4) {
                                    }
                                    z3 = true;
                                    this.C0 = 0;
                                    this.D0 = 0;
                                    i5 = i;
                                    while (i6 < i5) {
                                    }
                                    boolean X32 = X(64);
                                    boolean z1622 = z;
                                    int i5022 = 0;
                                    z4 = true;
                                    while (z4) {
                                    }
                                    z5 = z1622;
                                    this.t0 = arrayList1022;
                                    if (z5) {
                                    }
                                    G(jv3Var.m);
                                }
                            }
                        }
                        zs7Var2 = null;
                        if (zs7Var == null) {
                        }
                        k21Var8 = k21.WRAP_CONTENT;
                        k21Var = k21Var6;
                        if (k21Var == k21Var8) {
                        }
                        i4 = i11;
                        k21Var2 = k21Var7;
                        if (k21Var2 != k21Var8) {
                        }
                        i13 = i12;
                        i3 = i13;
                        z = true;
                        if (X(64)) {
                        }
                        z2 = true;
                        jv3Var.getClass();
                        jv3Var.h = false;
                        if (this.G0 == 0) {
                        }
                        c = 1;
                        ArrayList arrayList10222 = this.t0;
                        k21[] k21VarArr8222 = this.T;
                        k21Var3 = k21VarArr8222[0];
                        k21Var4 = k21.WRAP_CONTENT;
                        if (k21Var3 == k21Var4) {
                        }
                        z3 = true;
                        this.C0 = 0;
                        this.D0 = 0;
                        i5 = i;
                        while (i6 < i5) {
                        }
                        boolean X322 = X(64);
                        boolean z16222 = z;
                        int i50222 = 0;
                        z4 = true;
                        while (z4) {
                        }
                        z5 = z16222;
                        this.t0 = arrayList10222;
                        if (z5) {
                        }
                        G(jv3Var.m);
                    }
                }
                zs7Var = null;
                if (this.T[1] == k21.WRAP_CONTENT) {
                }
                zs7Var2 = null;
                if (zs7Var == null) {
                }
                k21Var8 = k21.WRAP_CONTENT;
                k21Var = k21Var6;
                if (k21Var == k21Var8) {
                }
                i4 = i11;
                k21Var2 = k21Var7;
                if (k21Var2 != k21Var8) {
                }
                i13 = i12;
                i3 = i13;
                z = true;
                if (X(64)) {
                }
                z2 = true;
                jv3Var.getClass();
                jv3Var.h = false;
                if (this.G0 == 0) {
                }
                c = 1;
                ArrayList arrayList102222 = this.t0;
                k21[] k21VarArr82222 = this.T;
                k21Var3 = k21VarArr82222[0];
                k21Var4 = k21.WRAP_CONTENT;
                if (k21Var3 == k21Var4) {
                }
                z3 = true;
                this.C0 = 0;
                this.D0 = 0;
                i5 = i;
                while (i6 < i5) {
                }
                boolean X3222 = X(64);
                boolean z162222 = z;
                int i502222 = 0;
                z4 = true;
                while (z4) {
                }
                z5 = z162222;
                this.t0 = arrayList102222;
                if (z5) {
                }
                G(jv3Var.m);
            }
            i3 = i10;
            i2 = i9;
            k21Var2 = k21Var7;
            k21Var = k21Var6;
        }
        i4 = i2;
        z = false;
        if (X(64)) {
        }
        z2 = true;
        jv3Var.getClass();
        jv3Var.h = false;
        if (this.G0 == 0) {
        }
        c = 1;
        ArrayList arrayList1022222 = this.t0;
        k21[] k21VarArr822222 = this.T;
        k21Var3 = k21VarArr822222[0];
        k21Var4 = k21.WRAP_CONTENT;
        if (k21Var3 == k21Var4) {
        }
        z3 = true;
        this.C0 = 0;
        this.D0 = 0;
        i5 = i;
        while (i6 < i5) {
        }
        boolean X32222 = X(64);
        boolean z1622222 = z;
        int i5022222 = 0;
        z4 = true;
        while (z4) {
        }
        z5 = z1622222;
        this.t0 = arrayList1022222;
        if (z5) {
        }
        G(jv3Var.m);
    }

    public final boolean X(int i) {
        if ((this.G0 & i) == i) {
            return true;
        }
        return false;
    }

    @Override // defpackage.l21
    public final void o(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.V);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.W);
        sb.append("\n");
        ArrayList arrayList = this.t0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((l21) obj).o(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
