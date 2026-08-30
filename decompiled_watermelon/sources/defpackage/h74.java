package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h74  reason: default package */
/* loaded from: classes.dex */
public final class h74 extends r74 {
    public final yy3 c;
    public final sb d;
    public final cs3 e;
    public m74 f;
    public kp4 g;
    public boolean h;
    public boolean i;
    public boolean j;

    public h74(yy3 yy3Var) {
        this.c = yy3Var;
        sb sbVar = new sb((char) 0, 10);
        sbVar.L = new long[2];
        this.d = sbVar;
        this.e = new cs3(2);
        this.i = true;
        this.j = true;
    }

    @Override // defpackage.r74
    public final boolean a(cs3 cs3Var, rd3 rd3Var, k91 k91Var, boolean z) {
        sb sbVar;
        cs3 cs3Var2;
        Object obj;
        int i;
        boolean z2;
        boolean z3;
        kp4 kp4Var;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int i2;
        int i3;
        int i4;
        boolean z10;
        int i5;
        int i6;
        List list;
        cs3 cs3Var3;
        long j;
        rd3 rd3Var2 = rd3Var;
        boolean a = super.a(cs3Var, rd3Var, k91Var, z);
        yy3 yy3Var = this.c;
        if (yy3Var.i0) {
            o24 o24Var = null;
            while (yy3Var != null) {
                if (yy3Var instanceof up4) {
                    this.f = l.N((up4) yy3Var, 16);
                } else if ((yy3Var.L & 16) != 0 && (yy3Var instanceof xc1)) {
                    int i7 = 0;
                    for (yy3 yy3Var2 = ((xc1) yy3Var).k0; yy3Var2 != null; yy3Var2 = yy3Var2.Y) {
                        if ((yy3Var2.L & 16) != 0) {
                            i7++;
                            if (i7 == 1) {
                                yy3Var = yy3Var2;
                            } else {
                                if (o24Var == null) {
                                    o24Var = new o24(new yy3[16]);
                                }
                                if (yy3Var != null) {
                                    o24Var.b(yy3Var);
                                    yy3Var = null;
                                }
                                o24Var.b(yy3Var2);
                            }
                        }
                    }
                    if (i7 == 1) {
                    }
                }
                yy3Var = l.p(o24Var);
            }
            if (this.f != null) {
                int j2 = cs3Var.j();
                int i8 = 0;
                while (true) {
                    sbVar = this.d;
                    cs3Var2 = this.e;
                    if (i8 >= j2) {
                        break;
                    }
                    long f = cs3Var.f(i8);
                    rp4 rp4Var = (rp4) cs3Var.k(i8);
                    if (sbVar.k(f)) {
                        long j3 = rp4Var.g;
                        List list2 = rp4Var.m;
                        i6 = i8;
                        long j4 = rp4Var.c;
                        if ((((j3 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            List list3 = pp1.A;
                            if (list2 == null) {
                                list = list3;
                            } else {
                                list = list2;
                            }
                            z10 = a;
                            ArrayList arrayList = new ArrayList(list.size());
                            if (list2 == null) {
                                list2 = list3;
                            }
                            int size = list2.size();
                            i5 = j2;
                            int i9 = 0;
                            while (i9 < size) {
                                int i10 = size;
                                ur2 ur2Var = (ur2) list2.get(i9);
                                int i11 = i9;
                                List list4 = list2;
                                long j5 = ur2Var.b;
                                if ((((j5 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    cs3Var3 = cs3Var2;
                                    j = f;
                                    long j6 = ur2Var.a;
                                    m74 m74Var = this.f;
                                    m74Var.getClass();
                                    arrayList.add(new ur2(j6, m74Var.R(rd3Var2, j5, true), ur2Var.c, ur2Var.d, ur2Var.e));
                                } else {
                                    cs3Var3 = cs3Var2;
                                    j = f;
                                }
                                i9 = i11 + 1;
                                list2 = list4;
                                size = i10;
                                cs3Var2 = cs3Var3;
                                f = j;
                            }
                            cs3 cs3Var4 = cs3Var2;
                            long j7 = f;
                            m74 m74Var2 = this.f;
                            m74Var2.getClass();
                            long R = m74Var2.R(rd3Var2, j3, true);
                            m74 m74Var3 = this.f;
                            m74Var3.getClass();
                            rp4 rp4Var2 = new rp4(rp4Var.a, rp4Var.b, m74Var3.R(rd3Var2, j4, true), rp4Var.d, rp4Var.e, rp4Var.f, R, rp4Var.h, rp4Var.i, arrayList, rp4Var.j, rp4Var.k, rp4Var.l, rp4Var.n);
                            rp4 rp4Var3 = rp4Var.q;
                            if (rp4Var3 == null) {
                                rp4Var3 = rp4Var;
                            }
                            rp4Var2.q = rp4Var3;
                            rp4 rp4Var4 = rp4Var.q;
                            if (rp4Var4 != null) {
                                rp4Var = rp4Var4;
                            }
                            rp4Var2.q = rp4Var;
                            cs3Var4.g(j7, rp4Var2);
                        } else {
                            z10 = a;
                            i5 = j2;
                        }
                    } else {
                        z10 = a;
                        i5 = j2;
                        i6 = i8;
                    }
                    i8 = i6 + 1;
                    rd3Var2 = rd3Var;
                    j2 = i5;
                    a = z10;
                }
                boolean z11 = a;
                if (cs3Var2.e()) {
                    sbVar.B = 0;
                    this.a.h();
                    return true;
                }
                int i12 = sbVar.B;
                while (true) {
                    i12--;
                    if (-1 >= i12) {
                        break;
                    } else if (cs3Var.c(((long[]) sbVar.L)[i12]) < 0 && i12 < (i4 = sbVar.B)) {
                        int i13 = i4 - 1;
                        int i14 = i12;
                        while (i14 < i13) {
                            long[] jArr = (long[]) sbVar.L;
                            int i15 = i14 + 1;
                            jArr[i14] = jArr[i15];
                            i14 = i15;
                        }
                        sbVar.B--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(cs3Var2.j());
                int j8 = cs3Var2.j();
                for (int i16 = 0; i16 < j8; i16++) {
                    arrayList2.add(cs3Var2.k(i16));
                }
                kp4 kp4Var2 = new kp4(arrayList2, k91Var);
                int size2 = arrayList2.size();
                int i17 = 0;
                while (true) {
                    if (i17 < size2) {
                        obj = arrayList2.get(i17);
                        if (k91Var.o(((rp4) obj).a)) {
                            break;
                        }
                        i17++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                rp4 rp4Var5 = (rp4) obj;
                if (rp4Var5 != null) {
                    boolean z12 = rp4Var5.d;
                    if (!z) {
                        i = false;
                        this.i = false;
                    } else {
                        i = false;
                        if (!this.i && (z12 || rp4Var5.h)) {
                            m74 m74Var4 = this.f;
                            m74Var4.getClass();
                            long j9 = m74Var4.L;
                            long j10 = rp4Var5.c;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
                            int i18 = (int) (j9 >> 32);
                            int i19 = (int) (j9 & 4294967295L);
                            if (intBitsToFloat < RecyclerView.A1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (intBitsToFloat > i18) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            boolean z13 = z4 | z5;
                            if (intBitsToFloat2 < RecyclerView.A1) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            boolean z14 = z13 | z6;
                            if (intBitsToFloat2 > i19) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            z2 = true;
                            this.i = !(z14 | z7);
                            z8 = this.i;
                            z9 = this.h;
                            int i20 = 5;
                            if (z8 == z9 && ((i3 = kp4Var2.f) == 3 || i3 == 4 || i3 == 5)) {
                                if (z8) {
                                    i20 = 4;
                                }
                                kp4Var2.f = i20;
                            } else {
                                i2 = kp4Var2.f;
                                if (i2 != 4 && z9 && !this.j) {
                                    kp4Var2.f = 3;
                                } else if (i2 == 5 && z8 && z12) {
                                    kp4Var2.f = 3;
                                }
                            }
                        }
                    }
                    z2 = true;
                    z8 = this.i;
                    z9 = this.h;
                    int i202 = 5;
                    if (z8 == z9) {
                    }
                    i2 = kp4Var2.f;
                    if (i2 != 4) {
                    }
                    if (i2 == 5) {
                        kp4Var2.f = 3;
                    }
                } else {
                    i = false;
                    z2 = true;
                }
                if (!z11 && kp4Var2.f == 3 && (kp4Var = this.g) != null) {
                    List list5 = kp4Var.a;
                    int size3 = list5.size();
                    List list6 = kp4Var2.a;
                    if (size3 == list6.size()) {
                        int size4 = list6.size();
                        for (int i21 = i; i21 < size4; i21++) {
                            if (mb4.b(((rp4) list5.get(i21)).c, ((rp4) list6.get(i21)).c)) {
                            }
                        }
                        z3 = i;
                        this.g = kp4Var2;
                        return z3;
                    }
                }
                z3 = z2;
                this.g = kp4Var2;
                return z3;
            }
        }
        return true;
    }

    @Override // defpackage.r74
    public final void b(k91 k91Var) {
        super.b(k91Var);
        kp4 kp4Var = this.g;
        if (kp4Var == null) {
            return;
        }
        this.h = this.i;
        List list = kp4Var.a;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            rp4 rp4Var = (rp4) list.get(i);
            boolean z2 = rp4Var.d;
            long j = rp4Var.a;
            boolean o = k91Var.o(j);
            boolean z3 = this.i;
            if ((!z2 && !o) || (!z2 && !z3)) {
                this.d.t(j);
            }
        }
        this.i = false;
        if (kp4Var.f == 5) {
            z = true;
        }
        this.j = z;
    }

    public final void c() {
        o24 o24Var = this.a;
        Object[] objArr = o24Var.A;
        int i = o24Var.L;
        for (int i2 = 0; i2 < i; i2++) {
            ((h74) objArr[i2]).c();
        }
        yy3 yy3Var = this.c;
        o24 o24Var2 = null;
        while (yy3Var != null) {
            if (yy3Var instanceof up4) {
                ((up4) yy3Var).q0();
            } else if ((yy3Var.L & 16) != 0 && (yy3Var instanceof xc1)) {
                int i3 = 0;
                for (yy3 yy3Var2 = ((xc1) yy3Var).k0; yy3Var2 != null; yy3Var2 = yy3Var2.Y) {
                    if ((yy3Var2.L & 16) != 0) {
                        i3++;
                        if (i3 == 1) {
                            yy3Var = yy3Var2;
                        } else {
                            if (o24Var2 == null) {
                                o24Var2 = new o24(new yy3[16]);
                            }
                            if (yy3Var != null) {
                                o24Var2.b(yy3Var);
                                yy3Var = null;
                            }
                            o24Var2.b(yy3Var2);
                        }
                    }
                }
                if (i3 == 1) {
                }
            }
            yy3Var = l.p(o24Var2);
        }
    }

    public final boolean d(k91 k91Var) {
        boolean z;
        vf3 vf3Var;
        cs3 cs3Var = this.e;
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!cs3Var.e()) {
            yy3 yy3Var = this.c;
            if (yy3Var.i0) {
                m74 m74Var = yy3Var.c0;
                if (m74Var != null && (vf3Var = m74Var.j0) != null) {
                    z = vf3Var.I();
                } else {
                    z = false;
                }
                if (z) {
                    kp4 kp4Var = this.g;
                    kp4Var.getClass();
                    m74 m74Var2 = this.f;
                    m74Var2.getClass();
                    long j = m74Var2.L;
                    yy3 yy3Var2 = yy3Var;
                    o24 o24Var = null;
                    while (yy3Var2 != null) {
                        if (yy3Var2 instanceof up4) {
                            ((up4) yy3Var2).O(kp4Var, lp4.Final, j);
                        } else if ((yy3Var2.L & 16) != 0 && (yy3Var2 instanceof xc1)) {
                            int i = 0;
                            for (yy3 yy3Var3 = ((xc1) yy3Var2).k0; yy3Var3 != null; yy3Var3 = yy3Var3.Y) {
                                if ((yy3Var3.L & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        yy3Var2 = yy3Var3;
                                    } else {
                                        if (o24Var == null) {
                                            o24Var = new o24(new yy3[16]);
                                        }
                                        if (yy3Var2 != null) {
                                            o24Var.b(yy3Var2);
                                            yy3Var2 = null;
                                        }
                                        o24Var.b(yy3Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        yy3Var2 = l.p(o24Var);
                    }
                    if (yy3Var.i0) {
                        o24 o24Var2 = this.a;
                        Object[] objArr = o24Var2.A;
                        int i2 = o24Var2.L;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((h74) objArr[i3]).d(k91Var);
                        }
                    }
                    z2 = true;
                }
            }
        }
        b(k91Var);
        cs3Var.a();
        this.f = null;
        return z2;
    }

    public final boolean e(k91 k91Var, boolean z) {
        boolean z2;
        vf3 vf3Var;
        if (!this.e.e()) {
            yy3 yy3Var = this.c;
            if (yy3Var.i0) {
                m74 m74Var = yy3Var.c0;
                if (m74Var != null && (vf3Var = m74Var.j0) != null) {
                    z2 = vf3Var.I();
                } else {
                    z2 = false;
                }
                if (z2) {
                    kp4 kp4Var = this.g;
                    kp4Var.getClass();
                    m74 m74Var2 = this.f;
                    m74Var2.getClass();
                    long j = m74Var2.L;
                    yy3 yy3Var2 = yy3Var;
                    o24 o24Var = null;
                    while (yy3Var2 != null) {
                        if (yy3Var2 instanceof up4) {
                            ((up4) yy3Var2).O(kp4Var, lp4.Initial, j);
                        } else if ((yy3Var2.L & 16) != 0 && (yy3Var2 instanceof xc1)) {
                            int i = 0;
                            for (yy3 yy3Var3 = ((xc1) yy3Var2).k0; yy3Var3 != null; yy3Var3 = yy3Var3.Y) {
                                if ((yy3Var3.L & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        yy3Var2 = yy3Var3;
                                    } else {
                                        if (o24Var == null) {
                                            o24Var = new o24(new yy3[16]);
                                        }
                                        if (yy3Var2 != null) {
                                            o24Var.b(yy3Var2);
                                            yy3Var2 = null;
                                        }
                                        o24Var.b(yy3Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        yy3Var2 = l.p(o24Var);
                    }
                    if (yy3Var.i0) {
                        o24 o24Var2 = this.a;
                        Object[] objArr = o24Var2.A;
                        int i2 = o24Var2.L;
                        for (int i3 = 0; i3 < i2; i3++) {
                            this.f.getClass();
                            ((h74) objArr[i3]).e(k91Var, z);
                        }
                    }
                    if (yy3Var.i0) {
                        o24 o24Var3 = null;
                        while (yy3Var != null) {
                            if (yy3Var instanceof up4) {
                                ((up4) yy3Var).O(kp4Var, lp4.Main, j);
                            } else if ((yy3Var.L & 16) != 0 && (yy3Var instanceof xc1)) {
                                int i4 = 0;
                                for (yy3 yy3Var4 = ((xc1) yy3Var).k0; yy3Var4 != null; yy3Var4 = yy3Var4.Y) {
                                    if ((yy3Var4.L & 16) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            yy3Var = yy3Var4;
                                        } else {
                                            if (o24Var3 == null) {
                                                o24Var3 = new o24(new yy3[16]);
                                            }
                                            if (yy3Var != null) {
                                                o24Var3.b(yy3Var);
                                                yy3Var = null;
                                            }
                                            o24Var3.b(yy3Var4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            yy3Var = l.p(o24Var3);
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(long j, w14 w14Var) {
        sb sbVar = this.d;
        if (sbVar.k(j) && w14Var.g(this) < 0) {
            sbVar.t(j);
            this.e.h(j);
        }
        o24 o24Var = this.a;
        Object[] objArr = o24Var.A;
        int i = o24Var.L;
        for (int i2 = 0; i2 < i; i2++) {
            ((h74) objArr[i2]).f(j, w14Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ')';
    }
}
