package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oa4  reason: default package */
/* loaded from: classes.dex */
public class oa4 extends vl6 {
    public static final int[] n = new int[0];
    public final qn2 e;
    public final qn2 f;
    public int g;
    public ka4 h;
    public ArrayList i;
    public zl6 j;
    public int[] k;
    public int l;
    public boolean m;

    public oa4(long j, zl6 zl6Var, qn2 qn2Var, qn2 qn2Var2) {
        super(j, zl6Var);
        this.e = qn2Var;
        this.f = qn2Var2;
        this.j = zl6.X;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (bm6.c) {
            this.j = this.j.f(j);
        }
    }

    public void B(ka4 ka4Var) {
        this.h = ka4Var;
    }

    public oa4 C(qn2 qn2Var, qn2 qn2Var2) {
        xd4 xd4Var;
        if (this.c) {
            r05.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            r05.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = bm6.c;
        synchronized (obj) {
            long j = bm6.e;
            bm6.e = j + 1;
            bm6.d = bm6.d.f(j);
            zl6 d = d();
            r(d.f(j));
            xd4Var = new xd4(j, bm6.d(d, g() + 1, j), bm6.k(qn2Var, e(), true), bm6.l(qn2Var2, i()), this);
        }
        if (!this.m && !this.c) {
            long g = g();
            synchronized (obj) {
                long j2 = bm6.e;
                bm6.e = j2 + 1;
                s(j2);
                bm6.d = bm6.d.f(g());
            }
            r(bm6.d(d(), g + 1, g()));
            return xd4Var;
        }
        return xd4Var;
    }

    @Override // defpackage.vl6
    public final void b() {
        bm6.d = bm6.d.b(g()).a(this.j);
    }

    @Override // defpackage.vl6
    public void c() {
        if (!this.c) {
            this.c = true;
            synchronized (bm6.c) {
                o();
            }
            l();
        }
    }

    @Override // defpackage.vl6
    public boolean f() {
        return false;
    }

    @Override // defpackage.vl6
    public int h() {
        return this.g;
    }

    @Override // defpackage.vl6
    public qn2 i() {
        return this.f;
    }

    @Override // defpackage.vl6
    public void k() {
        this.l++;
    }

    @Override // defpackage.vl6
    public void l() {
        if (this.l <= 0) {
            r05.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i == 0 && !this.m) {
            ka4 x = x();
            if (x != null) {
                if (this.m) {
                    r05.b("Unsupported operation on a snapshot that has been applied");
                }
                B(null);
                long g = g();
                Object[] objArr = x.b;
                long[] jArr = x.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    for (hq6 a = ((eq6) objArr[(i2 << 3) + i4]).a(); a != null; a = a.b) {
                                        long j2 = a.a;
                                        if (j2 == g || gt0.C0(this.j, Long.valueOf(j2))) {
                                            r76 r76Var = bm6.a;
                                            a.a = 0L;
                                        }
                                    }
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            a();
        }
    }

    @Override // defpackage.vl6
    public void m() {
        if (!this.m && !this.c) {
            v();
        }
    }

    @Override // defpackage.vl6
    public void n(eq6 eq6Var) {
        ka4 x = x();
        if (x == null) {
            ka4 ka4Var = c66.a;
            x = new ka4();
            B(x);
        }
        x.a(eq6Var);
    }

    @Override // defpackage.vl6
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            bm6.u(this.k[i]);
        }
        o();
    }

    @Override // defpackage.vl6
    public void t(int i) {
        this.g = i;
    }

    @Override // defpackage.vl6
    public vl6 u(qn2 qn2Var) {
        yd4 yd4Var;
        if (this.c) {
            r05.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            r05.b("Unsupported operation on a disposed or applied snapshot");
        }
        long g = g();
        A(g());
        Object obj = bm6.c;
        synchronized (obj) {
            long j = bm6.e;
            bm6.e = j + 1;
            bm6.d = bm6.d.f(j);
            yd4Var = new yd4(j, bm6.d(d(), g + 1, j), bm6.k(qn2Var, e(), true), this);
        }
        if (!this.m && !this.c) {
            long g2 = g();
            synchronized (obj) {
                long j2 = bm6.e;
                bm6.e = j2 + 1;
                s(j2);
                bm6.d = bm6.d.f(g());
            }
            r(bm6.d(d(), g2 + 1, g()));
            return yd4Var;
        }
        return yd4Var;
    }

    public final void v() {
        A(g());
        if (!this.m && !this.c) {
            long g = g();
            synchronized (bm6.c) {
                long j = bm6.e;
                bm6.e = j + 1;
                s(j);
                bm6.d = bm6.d.f(g());
            }
            r(bm6.d(d(), g + 1, g()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab A[LOOP:1: B:39:0x00a9->B:40:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0111 A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014e A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qo2 w() {
        HashMap hashMap;
        List list;
        ka4 ka4Var;
        long j;
        long j2;
        ArrayList arrayList;
        int size;
        int i;
        ka4 x = x();
        if (x != null) {
            long j3 = bm6.j.b;
            hashMap = bm6.b(j3, this, bm6.d.b(j3));
        } else {
            hashMap = null;
        }
        yt1 yt1Var = yt1.A;
        synchronized (bm6.c) {
            try {
                bm6.c(this);
                if (x != null && x.d != 0) {
                    os2 os2Var = bm6.j;
                    qo2 z = z(bm6.e, x, hashMap, bm6.d.b(os2Var.b));
                    if (!z.equals(xl6.b)) {
                        return z;
                    }
                    b();
                    ka4Var = os2Var.h;
                    bm6.v(os2Var, bm6.a);
                    B(null);
                    os2Var.h = null;
                    list = bm6.h;
                    this.m = true;
                    if (ka4Var != null) {
                        d66 d66Var = new d66(ka4Var);
                        if (!ka4Var.g()) {
                            int size2 = list.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                ((eo2) list.get(i2)).o(d66Var, this);
                            }
                        }
                    }
                    if (x != null && x.h()) {
                        d66 d66Var2 = new d66(x);
                        size = list.size();
                        for (i = 0; i < size; i++) {
                            ((eo2) list.get(i)).o(d66Var2, this);
                        }
                    }
                    synchronized (bm6.c) {
                        try {
                            p();
                            bm6.f();
                            if (ka4Var != null) {
                                Object[] objArr = ka4Var.b;
                                long[] jArr = ka4Var.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i3 = 0;
                                    j = 128;
                                    while (true) {
                                        long j4 = jArr[i3];
                                        j2 = 255;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                                            for (int i5 = 0; i5 < i4; i5++) {
                                                if ((j4 & 255) < 128) {
                                                    bm6.q((eq6) objArr[(i3 << 3) + i5]);
                                                }
                                                j4 >>= 8;
                                            }
                                            if (i4 != 8) {
                                                break;
                                            }
                                        }
                                        if (i3 == length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                    if (x != null) {
                                        Object[] objArr2 = x.b;
                                        long[] jArr2 = x.a;
                                        int length2 = jArr2.length - 2;
                                        if (length2 >= 0) {
                                            int i6 = 0;
                                            while (true) {
                                                long j5 = jArr2[i6];
                                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                                    for (int i8 = 0; i8 < i7; i8++) {
                                                        if ((j5 & j2) < j) {
                                                            bm6.q((eq6) objArr2[(i6 << 3) + i8]);
                                                        }
                                                        j5 >>= 8;
                                                    }
                                                    if (i7 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i6 == length2) {
                                                    break;
                                                }
                                                i6++;
                                            }
                                        }
                                    }
                                    arrayList = this.i;
                                    if (arrayList != null) {
                                        int size3 = arrayList.size();
                                        for (int i9 = 0; i9 < size3; i9++) {
                                            bm6.q((eq6) arrayList.get(i9));
                                        }
                                    }
                                    this.i = null;
                                }
                            }
                            j = 128;
                            j2 = 255;
                            if (x != null) {
                            }
                            arrayList = this.i;
                            if (arrayList != null) {
                            }
                            this.i = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return xl6.b;
                }
                b();
                os2 os2Var2 = bm6.j;
                ka4 ka4Var2 = os2Var2.h;
                bm6.v(os2Var2, bm6.a);
                if (ka4Var2 != null && ka4Var2.h()) {
                    list = bm6.h;
                    ka4Var = ka4Var2;
                } else {
                    list = yt1Var;
                    ka4Var = null;
                }
                this.m = true;
                if (ka4Var != null) {
                }
                if (x != null) {
                    d66 d66Var22 = new d66(x);
                    size = list.size();
                    while (i < size) {
                    }
                }
                synchronized (bm6.c) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ka4 x() {
        return this.h;
    }

    @Override // defpackage.vl6
    /* renamed from: y */
    public qn2 e() {
        return this.e;
    }

    public final qo2 z(long j, ka4 ka4Var, HashMap hashMap, zl6 zl6Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        zl6 zl6Var2;
        Object[] objArr;
        long[] jArr;
        zl6 zl6Var3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList4;
        hq6 b;
        vr4 vr4Var;
        ArrayList arrayList5;
        zl6 d = d().f(g()).d(this.j);
        Object[] objArr3 = ka4Var.b;
        long[] jArr3 = ka4Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            eq6 eq6Var = (eq6) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            hq6 a = eq6Var.a();
                            i = i4;
                            ArrayList arrayList6 = arrayList3;
                            hq6 s = bm6.s(a, j, zl6Var);
                            if (s == null) {
                                arrayList4 = arrayList2;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayList2;
                                j2 = j3;
                                hq6 s2 = bm6.s(a, g(), d);
                                if (s2 != null && s2.a != 1 && !s.equals(s2)) {
                                    zl6Var3 = d;
                                    hq6 s3 = bm6.s(a, g(), d());
                                    if (s3 != null) {
                                        if (hashMap == null || (b = (hq6) hashMap.get(s)) == null) {
                                            b = eq6Var.b(s2, s, s3);
                                        }
                                        if (b == null) {
                                            return new wl6(this);
                                        }
                                        if (!b.equals(s3)) {
                                            if (b.equals(s)) {
                                                if (arrayList6 == null) {
                                                    arrayList5 = new ArrayList();
                                                } else {
                                                    arrayList5 = arrayList6;
                                                }
                                                arrayList5.add(new vr4(eq6Var, s.b(g())));
                                                if (arrayList4 == null) {
                                                    arrayList2 = new ArrayList();
                                                } else {
                                                    arrayList2 = arrayList4;
                                                }
                                                arrayList2.add(eq6Var);
                                                arrayList3 = arrayList5;
                                            } else {
                                                if (arrayList6 == null) {
                                                    arrayList3 = new ArrayList();
                                                } else {
                                                    arrayList3 = arrayList6;
                                                }
                                                if (!b.equals(s2)) {
                                                    vr4Var = new vr4(eq6Var, b);
                                                } else {
                                                    vr4Var = new vr4(eq6Var, s2.b(g()));
                                                }
                                                arrayList3.add(vr4Var);
                                                arrayList2 = arrayList4;
                                            }
                                        }
                                        arrayList3 = arrayList6;
                                        arrayList2 = arrayList4;
                                    } else {
                                        bm6.r();
                                        throw null;
                                    }
                                }
                            }
                            zl6Var3 = d;
                            arrayList3 = arrayList6;
                            arrayList2 = arrayList4;
                        } else {
                            zl6Var3 = d;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        d = zl6Var3;
                    }
                    zl6Var2 = d;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    zl6Var2 = d;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 != length) {
                    i2++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    d = zl6Var2;
                } else {
                    arrayList = arrayList3;
                    break;
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            v();
            int size = arrayList3.size();
            for (int i5 = 0; i5 < size; i5++) {
                vr4 vr4Var2 = (vr4) arrayList3.get(i5);
                eq6 eq6Var2 = (eq6) vr4Var2.A;
                hq6 hq6Var = (hq6) vr4Var2.B;
                hq6Var.a = j;
                synchronized (bm6.c) {
                    hq6Var.b = eq6Var2.a();
                    eq6Var2.f(hq6Var);
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                ka4Var.l((eq6) arrayList2.get(i6));
            }
            ArrayList arrayList7 = this.i;
            if (arrayList7 != null) {
                arrayList2 = gt0.V0(arrayList7, arrayList2);
            }
            this.i = arrayList2;
        }
        return xl6.b;
    }
}
