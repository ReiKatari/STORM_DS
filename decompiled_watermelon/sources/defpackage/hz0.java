package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hz0  reason: default package */
/* loaded from: classes.dex */
public final class hz0 extends gz0 {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public aj0[] E0;
    public aj0[] F0;
    public int G0;
    public boolean H0;
    public boolean I0;
    public WeakReference J0;
    public WeakReference K0;
    public WeakReference L0;
    public WeakReference M0;
    public final HashSet N0;
    public final k10 O0;
    public ArrayList t0 = new ArrayList();
    public final os u0 = new os(this);
    public final wd1 v0;
    public int w0;
    public ky0 x0;
    public boolean y0;
    public final ho3 z0;

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, k10] */
    public hz0() {
        wd1 wd1Var = new wd1();
        wd1Var.b = true;
        wd1Var.c = true;
        wd1Var.f = new ArrayList();
        new ArrayList();
        wd1Var.h = null;
        wd1Var.i = new Object();
        wd1Var.g = new ArrayList();
        wd1Var.d = this;
        wd1Var.e = this;
        this.v0 = wd1Var;
        this.x0 = null;
        this.y0 = false;
        this.z0 = new ho3();
        this.C0 = 0;
        this.D0 = 0;
        this.E0 = new aj0[4];
        this.F0 = new aj0[4];
        this.G0 = 257;
        this.H0 = false;
        this.I0 = false;
        this.J0 = null;
        this.K0 = null;
        this.L0 = null;
        this.M0 = null;
        this.N0 = new HashSet();
        this.O0 = new Object();
    }

    public static void W(gz0 gz0Var, ky0 ky0Var, k10 k10Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        if (ky0Var == null) {
            return;
        }
        int i3 = gz0Var.h0;
        int[] iArr = gz0Var.t;
        if (i3 != 8 && !(gz0Var instanceof yo2) && !(gz0Var instanceof j00)) {
            fz0[] fz0VarArr = gz0Var.T;
            k10Var.a = fz0VarArr[0];
            k10Var.b = fz0VarArr[1];
            k10Var.c = gz0Var.r();
            k10Var.d = gz0Var.l();
            k10Var.i = false;
            k10Var.j = 0;
            fz0 fz0Var = k10Var.a;
            fz0 fz0Var2 = fz0.MATCH_CONSTRAINT;
            if (fz0Var == fz0Var2) {
                z = true;
            } else {
                z = false;
            }
            if (k10Var.b == fz0Var2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && gz0Var.X > RecyclerView.A1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 && gz0Var.X > RecyclerView.A1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z && gz0Var.u(0) && gz0Var.r == 0 && !z3) {
                k10Var.a = fz0.WRAP_CONTENT;
                if (z2 && gz0Var.s == 0) {
                    k10Var.a = fz0.FIXED;
                }
                z = false;
            }
            if (z2 && gz0Var.u(1) && gz0Var.s == 0 && !z4) {
                k10Var.b = fz0.WRAP_CONTENT;
                if (z && gz0Var.r == 0) {
                    k10Var.b = fz0.FIXED;
                }
                z2 = false;
            }
            if (gz0Var.B()) {
                k10Var.a = fz0.FIXED;
                z = false;
            }
            if (gz0Var.C()) {
                k10Var.b = fz0.FIXED;
                z2 = false;
            }
            if (z3) {
                if (iArr[0] == 4) {
                    k10Var.a = fz0.FIXED;
                } else if (!z2) {
                    fz0 fz0Var3 = k10Var.b;
                    fz0 fz0Var4 = fz0.FIXED;
                    if (fz0Var3 == fz0Var4) {
                        i2 = k10Var.d;
                    } else {
                        k10Var.a = fz0.WRAP_CONTENT;
                        ky0Var.b(gz0Var, k10Var);
                        i2 = k10Var.f;
                    }
                    k10Var.a = fz0Var4;
                    k10Var.c = (int) (gz0Var.X * i2);
                }
            }
            if (z4) {
                if (iArr[1] == 4) {
                    k10Var.b = fz0.FIXED;
                } else if (!z) {
                    fz0 fz0Var5 = k10Var.a;
                    fz0 fz0Var6 = fz0.FIXED;
                    if (fz0Var5 == fz0Var6) {
                        i = k10Var.c;
                    } else {
                        k10Var.b = fz0.WRAP_CONTENT;
                        ky0Var.b(gz0Var, k10Var);
                        i = k10Var.e;
                    }
                    k10Var.b = fz0Var6;
                    int i4 = gz0Var.Y;
                    float f = gz0Var.X;
                    if (i4 == -1) {
                        k10Var.d = (int) (i / f);
                    } else {
                        k10Var.d = (int) (f * i);
                    }
                }
            }
            ky0Var.b(gz0Var, k10Var);
            gz0Var.P(k10Var.e);
            gz0Var.M(k10Var.f);
            gz0Var.E = k10Var.h;
            gz0Var.J(k10Var.g);
            k10Var.j = 0;
            return;
        }
        k10Var.e = 0;
        k10Var.f = 0;
    }

    @Override // defpackage.gz0
    public final void D() {
        this.z0.t();
        this.A0 = 0;
        this.B0 = 0;
        this.t0.clear();
        super.D();
    }

    @Override // defpackage.gz0
    public final void G(os osVar) {
        super.G(osVar);
        int size = this.t0.size();
        for (int i = 0; i < size; i++) {
            ((gz0) this.t0.get(i)).G(osVar);
        }
    }

    @Override // defpackage.gz0
    public final void Q(boolean z, boolean z2) {
        super.Q(z, z2);
        int size = this.t0.size();
        for (int i = 0; i < size; i++) {
            ((gz0) this.t0.get(i)).Q(z, z2);
        }
    }

    public final void S(gz0 gz0Var, int i) {
        if (i == 0) {
            int i2 = this.C0 + 1;
            aj0[] aj0VarArr = this.F0;
            if (i2 >= aj0VarArr.length) {
                this.F0 = (aj0[]) Arrays.copyOf(aj0VarArr, aj0VarArr.length * 2);
            }
            aj0[] aj0VarArr2 = this.F0;
            int i3 = this.C0;
            aj0VarArr2[i3] = new aj0(gz0Var, 0, this.y0);
            this.C0 = i3 + 1;
        } else if (i == 1) {
            int i4 = this.D0 + 1;
            aj0[] aj0VarArr3 = this.E0;
            if (i4 >= aj0VarArr3.length) {
                this.E0 = (aj0[]) Arrays.copyOf(aj0VarArr3, aj0VarArr3.length * 2);
            }
            aj0[] aj0VarArr4 = this.E0;
            int i5 = this.D0;
            aj0VarArr4[i5] = new aj0(gz0Var, 1, this.y0);
            this.D0 = i5 + 1;
        }
    }

    public final void T(ho3 ho3Var) {
        hz0 hz0Var;
        ho3 ho3Var2;
        int i;
        boolean X = X(64);
        b(ho3Var, X);
        int size = this.t0.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            gz0 gz0Var = (gz0) this.t0.get(i2);
            boolean[] zArr = gz0Var.S;
            zArr[0] = false;
            zArr[1] = false;
            if (gz0Var instanceof j00) {
                z = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                gz0 gz0Var2 = (gz0) this.t0.get(i3);
                if (gz0Var2 instanceof j00) {
                    j00 j00Var = (j00) gz0Var2;
                    for (int i4 = 0; i4 < j00Var.u0; i4++) {
                        gz0 gz0Var3 = j00Var.t0[i4];
                        if (j00Var.w0 || gz0Var3.c()) {
                            int i5 = j00Var.v0;
                            if (i5 != 0 && i5 != 1) {
                                if (i5 == 2 || i5 == 3) {
                                    gz0Var3.S[1] = true;
                                }
                            } else {
                                gz0Var3.S[0] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.N0;
        hashSet.clear();
        for (int i6 = 0; i6 < size; i6++) {
            gz0 gz0Var4 = (gz0) this.t0.get(i6);
            gz0Var4.getClass();
            boolean z2 = gz0Var4 instanceof pc7;
            if (z2 || (gz0Var4 instanceof yo2)) {
                if (z2) {
                    hashSet.add(gz0Var4);
                } else {
                    gz0Var4.b(ho3Var, X);
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
                pc7 pc7Var = (pc7) ((gz0) it.next());
                for (int i7 = 0; i7 < pc7Var.u0; i7++) {
                    if (hashSet.contains(pc7Var.t0[i7])) {
                        pc7Var.b(ho3Var, X);
                        hashSet.remove(pc7Var);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((gz0) it2.next()).b(ho3Var, X);
                }
                hashSet.clear();
            }
        }
        if (ho3.q) {
            HashSet hashSet2 = new HashSet();
            for (int i8 = 0; i8 < size; i8++) {
                gz0 gz0Var5 = (gz0) this.t0.get(i8);
                gz0Var5.getClass();
                if (!(gz0Var5 instanceof pc7) && !(gz0Var5 instanceof yo2)) {
                    hashSet2.add(gz0Var5);
                }
            }
            if (this.T[0] == fz0.WRAP_CONTENT) {
                i = 0;
            } else {
                i = 1;
            }
            hz0Var = this;
            ho3Var2 = ho3Var;
            hz0Var.a(this, ho3Var2, hashSet2, i, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                gz0 gz0Var6 = (gz0) it3.next();
                a53.p(hz0Var, ho3Var2, gz0Var6);
                gz0Var6.b(ho3Var2, X);
            }
        } else {
            hz0Var = this;
            ho3Var2 = ho3Var;
            for (int i9 = 0; i9 < size; i9++) {
                gz0 gz0Var7 = (gz0) hz0Var.t0.get(i9);
                if (gz0Var7 instanceof hz0) {
                    fz0[] fz0VarArr = gz0Var7.T;
                    fz0 fz0Var = fz0VarArr[0];
                    fz0 fz0Var2 = fz0VarArr[1];
                    fz0 fz0Var3 = fz0.WRAP_CONTENT;
                    if (fz0Var == fz0Var3) {
                        gz0Var7.N(fz0.FIXED);
                    }
                    if (fz0Var2 == fz0Var3) {
                        gz0Var7.O(fz0.FIXED);
                    }
                    gz0Var7.b(ho3Var2, X);
                    if (fz0Var == fz0Var3) {
                        gz0Var7.N(fz0Var);
                    }
                    if (fz0Var2 == fz0Var3) {
                        gz0Var7.O(fz0Var2);
                    }
                } else {
                    a53.p(hz0Var, ho3Var2, gz0Var7);
                    if (!(gz0Var7 instanceof pc7) && !(gz0Var7 instanceof yo2)) {
                        gz0Var7.b(ho3Var2, X);
                    }
                }
            }
        }
        if (hz0Var.C0 > 0) {
            l.s(hz0Var, ho3Var2, null, 0);
        }
        if (hz0Var.D0 > 0) {
            l.s(hz0Var, ho3Var2, null, 1);
        }
    }

    public final boolean U(int i, boolean z) {
        boolean z2;
        fz0 fz0Var;
        wd1 wd1Var = this.v0;
        ArrayList arrayList = (ArrayList) wd1Var.f;
        hz0 hz0Var = (hz0) wd1Var.d;
        boolean z3 = false;
        fz0 k = hz0Var.k(0);
        fz0 k2 = hz0Var.k(1);
        int s = hz0Var.s();
        int t = hz0Var.t();
        if (z && (k == (fz0Var = fz0.WRAP_CONTENT) || k2 == fz0Var)) {
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                be7 be7Var = (be7) obj;
                if (be7Var.f == i && !be7Var.k()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && k == fz0.WRAP_CONTENT) {
                    hz0Var.N(fz0.FIXED);
                    hz0Var.P(wd1Var.e(hz0Var, 0));
                    hz0Var.d.e.d(hz0Var.r());
                }
            } else if (z && k2 == fz0.WRAP_CONTENT) {
                hz0Var.O(fz0.FIXED);
                hz0Var.M(wd1Var.e(hz0Var, 1));
                hz0Var.e.e.d(hz0Var.l());
            }
        }
        fz0[] fz0VarArr = hz0Var.T;
        if (i == 0) {
            fz0 fz0Var2 = fz0VarArr[0];
            if (fz0Var2 == fz0.FIXED || fz0Var2 == fz0.MATCH_PARENT) {
                int r = hz0Var.r() + s;
                hz0Var.d.i.d(r);
                hz0Var.d.e.d(r - s);
                z2 = true;
            }
            z2 = false;
        } else {
            fz0 fz0Var3 = fz0VarArr[1];
            if (fz0Var3 == fz0.FIXED || fz0Var3 == fz0.MATCH_PARENT) {
                int l = hz0Var.l() + t;
                hz0Var.e.i.d(l);
                hz0Var.e.e.d(l - t);
                z2 = true;
            }
            z2 = false;
        }
        wd1Var.i();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            be7 be7Var2 = (be7) obj2;
            if (be7Var2.f == i && (be7Var2.b != hz0Var || be7Var2.g)) {
                be7Var2.e();
            }
        }
        int size3 = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 < size3) {
                Object obj3 = arrayList.get(i4);
                i4++;
                be7 be7Var3 = (be7) obj3;
                if (be7Var3.f == i && (z2 || be7Var3.b != hz0Var)) {
                    if (!be7Var3.h.j) {
                        break;
                    } else if (!be7Var3.i.j) {
                        break;
                    } else if (!(be7Var3 instanceof bj0) && !be7Var3.e.j) {
                        break;
                    }
                }
            } else {
                z3 = true;
                break;
            }
        }
        hz0Var.N(k);
        hz0Var.O(k2);
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
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, k10] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V() {
        /*
            Method dump skipped, instructions count: 2376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hz0.V():void");
    }

    public final boolean X(int i) {
        if ((this.G0 & i) == i) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gz0
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
            ((gz0) obj).o(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
