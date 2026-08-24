package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zf4  reason: default package */
/* loaded from: classes.dex */
public final class zf4 extends jg4 {
    public final z64 c;
    public final zb d;
    public final hz3 e;
    public eg4 f;
    public oy4 g;
    public boolean h;
    public boolean i;
    public boolean j;

    public zf4(z64 z64Var) {
        this.c = z64Var;
        zb zbVar = new zb((char) 0, 10);
        zbVar.L = new long[2];
        this.d = zbVar;
        this.e = new hz3(2);
        this.i = true;
        this.j = true;
    }

    @Override // defpackage.jg4
    public final boolean a(hz3 hz3Var, jk3 jk3Var, yc1 yc1Var, boolean z) {
        zb zbVar;
        hz3 hz3Var2;
        Object obj;
        int i;
        boolean z2;
        boolean z3;
        oy4 oy4Var;
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
        int i7;
        int i8;
        vy4 vy4Var;
        jk3 jk3Var2 = jk3Var;
        boolean a = super.a(hz3Var, jk3Var, yc1Var, z);
        z64 z64Var = this.c;
        if (z64Var.j0) {
            ua4 ua4Var = null;
            while (z64Var != null) {
                if (z64Var instanceof yy4) {
                    this.f = nc1.d0((yy4) z64Var, 16);
                } else if ((z64Var.L & 16) != 0 && (z64Var instanceof zg1)) {
                    int i9 = 0;
                    for (z64 z64Var2 = ((zg1) z64Var).l0; z64Var2 != null; z64Var2 = z64Var2.Y) {
                        if ((z64Var2.L & 16) != 0) {
                            i9++;
                            if (i9 == 1) {
                                z64Var = z64Var2;
                            } else {
                                if (ua4Var == null) {
                                    ua4Var = new ua4(new z64[16]);
                                }
                                if (z64Var != null) {
                                    ua4Var.b(z64Var);
                                    z64Var = null;
                                }
                                ua4Var.b(z64Var2);
                            }
                        }
                    }
                    if (i9 == 1) {
                    }
                }
                z64Var = nc1.A(ua4Var);
            }
            if (this.f != null) {
                int i10 = hz3Var.i();
                int i11 = 0;
                while (true) {
                    zbVar = this.d;
                    hz3Var2 = this.e;
                    if (i11 >= i10) {
                        break;
                    }
                    long e = hz3Var.e(i11);
                    vy4 vy4Var2 = (vy4) hz3Var.j(i11);
                    if (zbVar.k(e)) {
                        long j = vy4Var2.g;
                        long j2 = vy4Var2.c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z10 = a;
                            ArrayList arrayList = new ArrayList(vy4Var2.b().size());
                            List b = vy4Var2.b();
                            i5 = i10;
                            int size = b.size();
                            i6 = i11;
                            int i12 = 0;
                            while (i12 < size) {
                                List list = b;
                                vx2 vx2Var = (vx2) b.get(i12);
                                hz3 hz3Var3 = hz3Var2;
                                long j3 = e;
                                long j4 = vx2Var.b;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    vy4Var = vy4Var2;
                                    long j5 = vx2Var.a;
                                    i7 = size;
                                    eg4 eg4Var = this.f;
                                    eg4Var.getClass();
                                    i8 = i12;
                                    arrayList.add(new vx2(j5, eg4Var.R(jk3Var2, j4, true), vx2Var.c, vx2Var.d, vx2Var.e));
                                } else {
                                    i7 = size;
                                    i8 = i12;
                                    vy4Var = vy4Var2;
                                }
                                i12 = i8 + 1;
                                size = i7;
                                b = list;
                                hz3Var2 = hz3Var3;
                                e = j3;
                                vy4Var2 = vy4Var;
                            }
                            hz3 hz3Var4 = hz3Var2;
                            long j6 = e;
                            eg4 eg4Var2 = this.f;
                            eg4Var2.getClass();
                            long R = eg4Var2.R(jk3Var2, j, true);
                            eg4 eg4Var3 = this.f;
                            eg4Var3.getClass();
                            vy4 vy4Var3 = new vy4(vy4Var2.a, vy4Var2.b, eg4Var3.R(jk3Var2, j2, true), vy4Var2.d, vy4Var2.e, vy4Var2.f, R, vy4Var2.h, vy4Var2.i, arrayList, vy4Var2.j, vy4Var2.k, vy4Var2.l, vy4Var2.n);
                            vy4 vy4Var4 = vy4Var2.q;
                            if (vy4Var4 == null) {
                                vy4Var4 = vy4Var2;
                            }
                            vy4Var3.q = vy4Var4;
                            vy4 vy4Var5 = vy4Var2.q;
                            if (vy4Var5 != null) {
                                vy4Var2 = vy4Var5;
                            }
                            vy4Var3.q = vy4Var2;
                            hz3Var4.f(j6, vy4Var3);
                            i11 = i6 + 1;
                            jk3Var2 = jk3Var;
                            i10 = i5;
                            a = z10;
                        }
                    }
                    z10 = a;
                    i5 = i10;
                    i6 = i11;
                    i11 = i6 + 1;
                    jk3Var2 = jk3Var;
                    i10 = i5;
                    a = z10;
                }
                boolean z11 = a;
                if (hz3Var2.d()) {
                    zbVar.B = 0;
                    this.a.g();
                    return true;
                }
                int i13 = zbVar.B;
                while (true) {
                    i13--;
                    if (-1 >= i13) {
                        break;
                    } else if (hz3Var.c(((long[]) zbVar.L)[i13]) < 0 && i13 < (i4 = zbVar.B)) {
                        int i14 = i4 - 1;
                        int i15 = i13;
                        while (i15 < i14) {
                            long[] jArr = (long[]) zbVar.L;
                            int i16 = i15 + 1;
                            jArr[i15] = jArr[i16];
                            i15 = i16;
                        }
                        zbVar.B--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(hz3Var2.i());
                int i17 = hz3Var2.i();
                for (int i18 = 0; i18 < i17; i18++) {
                    arrayList2.add(hz3Var2.j(i18));
                }
                oy4 oy4Var2 = new oy4(arrayList2, yc1Var);
                int size2 = arrayList2.size();
                int i19 = 0;
                while (true) {
                    if (i19 < size2) {
                        obj = arrayList2.get(i19);
                        if (yc1Var.l(((vy4) obj).a)) {
                            break;
                        }
                        i19++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                vy4 vy4Var6 = (vy4) obj;
                if (vy4Var6 != null) {
                    boolean z12 = vy4Var6.d;
                    if (!z) {
                        i = false;
                        this.i = false;
                    } else {
                        i = false;
                        if (!this.i && (z12 || vy4Var6.h)) {
                            eg4 eg4Var4 = this.f;
                            eg4Var4.getClass();
                            long j7 = eg4Var4.L;
                            long j8 = vy4Var6.c;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
                            int i20 = (int) (j7 >> 32);
                            int i21 = (int) (j7 & 4294967295L);
                            if (intBitsToFloat < RecyclerView.B1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (intBitsToFloat > i20) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            boolean z13 = z4 | z5;
                            if (intBitsToFloat2 < RecyclerView.B1) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            boolean z14 = z13 | z6;
                            if (intBitsToFloat2 > i21) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            z2 = true;
                            this.i = !(z14 | z7);
                            z8 = this.i;
                            z9 = this.h;
                            int i22 = 5;
                            if (z8 == z9 && ((i3 = oy4Var2.f) == 3 || i3 == 4 || i3 == 5)) {
                                if (z8) {
                                    i22 = 4;
                                }
                                oy4Var2.f = i22;
                            } else {
                                i2 = oy4Var2.f;
                                if (i2 != 4 && z9 && !this.j) {
                                    oy4Var2.f = 3;
                                } else if (i2 == 5 && z8 && z12) {
                                    oy4Var2.f = 3;
                                }
                            }
                        }
                    }
                    z2 = true;
                    z8 = this.i;
                    z9 = this.h;
                    int i222 = 5;
                    if (z8 == z9) {
                    }
                    i2 = oy4Var2.f;
                    if (i2 != 4) {
                    }
                    if (i2 == 5) {
                        oy4Var2.f = 3;
                    }
                } else {
                    i = false;
                    z2 = true;
                }
                if (!z11 && oy4Var2.f == 3 && (oy4Var = this.g) != null) {
                    List list2 = oy4Var.a;
                    int size3 = list2.size();
                    List list3 = oy4Var2.a;
                    if (size3 == list3.size()) {
                        int size4 = list3.size();
                        for (int i23 = i; i23 < size4; i23++) {
                            if (jk4.c(((vy4) list2.get(i23)).c, ((vy4) list3.get(i23)).c)) {
                            }
                        }
                        z3 = i;
                        this.g = oy4Var2;
                        return z3;
                    }
                }
                z3 = z2;
                this.g = oy4Var2;
                return z3;
            }
        }
        return true;
    }

    @Override // defpackage.jg4
    public final void b(yc1 yc1Var) {
        super.b(yc1Var);
        oy4 oy4Var = this.g;
        if (oy4Var == null) {
            return;
        }
        this.h = this.i;
        List list = oy4Var.a;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            vy4 vy4Var = (vy4) list.get(i);
            boolean z2 = vy4Var.d;
            long j = vy4Var.a;
            boolean l = yc1Var.l(j);
            boolean z3 = this.i;
            if ((!z2 && !l) || (!z2 && !z3)) {
                this.d.t(j);
            }
        }
        this.i = false;
        if (oy4Var.f == 5) {
            z = true;
        }
        this.j = z;
    }

    public final void c() {
        ua4 ua4Var = this.a;
        Object[] objArr = ua4Var.A;
        int i = ua4Var.L;
        for (int i2 = 0; i2 < i; i2++) {
            ((zf4) objArr[i2]).c();
        }
        z64 z64Var = this.c;
        ua4 ua4Var2 = null;
        while (z64Var != null) {
            if (z64Var instanceof yy4) {
                ((yy4) z64Var).I();
            } else if ((z64Var.L & 16) != 0 && (z64Var instanceof zg1)) {
                int i3 = 0;
                for (z64 z64Var2 = ((zg1) z64Var).l0; z64Var2 != null; z64Var2 = z64Var2.Y) {
                    if ((z64Var2.L & 16) != 0) {
                        i3++;
                        if (i3 == 1) {
                            z64Var = z64Var2;
                        } else {
                            if (ua4Var2 == null) {
                                ua4Var2 = new ua4(new z64[16]);
                            }
                            if (z64Var != null) {
                                ua4Var2.b(z64Var);
                                z64Var = null;
                            }
                            ua4Var2.b(z64Var2);
                        }
                    }
                }
                if (i3 == 1) {
                }
            }
            z64Var = nc1.A(ua4Var2);
        }
    }

    public final boolean d(yc1 yc1Var) {
        boolean z;
        sm3 sm3Var;
        hz3 hz3Var = this.e;
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!hz3Var.d()) {
            z64 z64Var = this.c;
            if (z64Var.j0) {
                eg4 eg4Var = z64Var.d0;
                if (eg4Var != null && (sm3Var = eg4Var.k0) != null) {
                    z = sm3Var.I();
                } else {
                    z = false;
                }
                if (z) {
                    oy4 oy4Var = this.g;
                    oy4Var.getClass();
                    eg4 eg4Var2 = this.f;
                    eg4Var2.getClass();
                    long j = eg4Var2.L;
                    z64 z64Var2 = z64Var;
                    ua4 ua4Var = null;
                    while (z64Var2 != null) {
                        if (z64Var2 instanceof yy4) {
                            ((yy4) z64Var2).w(oy4Var, py4.Final, j);
                        } else if ((z64Var2.L & 16) != 0 && (z64Var2 instanceof zg1)) {
                            int i = 0;
                            for (z64 z64Var3 = ((zg1) z64Var2).l0; z64Var3 != null; z64Var3 = z64Var3.Y) {
                                if ((z64Var3.L & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        z64Var2 = z64Var3;
                                    } else {
                                        if (ua4Var == null) {
                                            ua4Var = new ua4(new z64[16]);
                                        }
                                        if (z64Var2 != null) {
                                            ua4Var.b(z64Var2);
                                            z64Var2 = null;
                                        }
                                        ua4Var.b(z64Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        z64Var2 = nc1.A(ua4Var);
                    }
                    if (z64Var.j0) {
                        ua4 ua4Var2 = this.a;
                        Object[] objArr = ua4Var2.A;
                        int i2 = ua4Var2.L;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((zf4) objArr[i3]).d(yc1Var);
                        }
                    }
                    z2 = true;
                }
            }
        }
        b(yc1Var);
        hz3Var.a();
        this.f = null;
        return z2;
    }

    public final boolean e(yc1 yc1Var, boolean z) {
        boolean z2;
        sm3 sm3Var;
        if (!this.e.d()) {
            z64 z64Var = this.c;
            if (z64Var.j0) {
                eg4 eg4Var = z64Var.d0;
                if (eg4Var != null && (sm3Var = eg4Var.k0) != null) {
                    z2 = sm3Var.I();
                } else {
                    z2 = false;
                }
                if (z2) {
                    oy4 oy4Var = this.g;
                    oy4Var.getClass();
                    eg4 eg4Var2 = this.f;
                    eg4Var2.getClass();
                    long j = eg4Var2.L;
                    z64 z64Var2 = z64Var;
                    ua4 ua4Var = null;
                    while (z64Var2 != null) {
                        if (z64Var2 instanceof yy4) {
                            ((yy4) z64Var2).w(oy4Var, py4.Initial, j);
                        } else if ((z64Var2.L & 16) != 0 && (z64Var2 instanceof zg1)) {
                            int i = 0;
                            for (z64 z64Var3 = ((zg1) z64Var2).l0; z64Var3 != null; z64Var3 = z64Var3.Y) {
                                if ((z64Var3.L & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        z64Var2 = z64Var3;
                                    } else {
                                        if (ua4Var == null) {
                                            ua4Var = new ua4(new z64[16]);
                                        }
                                        if (z64Var2 != null) {
                                            ua4Var.b(z64Var2);
                                            z64Var2 = null;
                                        }
                                        ua4Var.b(z64Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        z64Var2 = nc1.A(ua4Var);
                    }
                    if (z64Var.j0) {
                        ua4 ua4Var2 = this.a;
                        Object[] objArr = ua4Var2.A;
                        int i2 = ua4Var2.L;
                        for (int i3 = 0; i3 < i2; i3++) {
                            this.f.getClass();
                            ((zf4) objArr[i3]).e(yc1Var, z);
                        }
                    }
                    if (z64Var.j0) {
                        ua4 ua4Var3 = null;
                        while (z64Var != null) {
                            if (z64Var instanceof yy4) {
                                ((yy4) z64Var).w(oy4Var, py4.Main, j);
                            } else if ((z64Var.L & 16) != 0 && (z64Var instanceof zg1)) {
                                int i4 = 0;
                                for (z64 z64Var4 = ((zg1) z64Var).l0; z64Var4 != null; z64Var4 = z64Var4.Y) {
                                    if ((z64Var4.L & 16) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            z64Var = z64Var4;
                                        } else {
                                            if (ua4Var3 == null) {
                                                ua4Var3 = new ua4(new z64[16]);
                                            }
                                            if (z64Var != null) {
                                                ua4Var3.b(z64Var);
                                                z64Var = null;
                                            }
                                            ua4Var3.b(z64Var4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            z64Var = nc1.A(ua4Var3);
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(long j, ca4 ca4Var) {
        zb zbVar = this.d;
        if (zbVar.k(j) && ca4Var.g(this) < 0) {
            zbVar.t(j);
            this.e.g(j);
        }
        ua4 ua4Var = this.a;
        Object[] objArr = ua4Var.A;
        int i = ua4Var.L;
        for (int i2 = 0; i2 < i; i2++) {
            ((zf4) objArr[i2]).f(j, ca4Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ')';
    }
}
