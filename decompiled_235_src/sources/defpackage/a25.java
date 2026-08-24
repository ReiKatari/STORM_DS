package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a25  reason: default package */
/* loaded from: classes.dex */
public final class a25 implements oq3 {
    public final int a;
    public final m44 b;
    public final qn2 c;
    public q21 d;
    public nt6 e;
    public fn3 f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Object j;
    public boolean k;
    public z15 l;
    public boolean m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public final /* synthetic */ bk1 r;

    public a25(bk1 bk1Var, int i, m44 m44Var, qn2 qn2Var) {
        this.r = bk1Var;
        this.a = i;
        this.b = m44Var;
        this.c = qn2Var;
        int i2 = h74.b;
        this.p = System.nanoTime() - h74.a;
    }

    @Override // defpackage.oq3
    public final void a() {
        this.m = true;
    }

    public final void b() {
        tu4 tu4Var;
        fn3 fn3Var = this.f;
        if (fn3Var != null) {
            switch (fn3Var.a) {
                case 0:
                    break;
                default:
                    ym3 b = fn3Var.b();
                    if (b != null) {
                        tu4Var = b.f;
                    } else {
                        tu4Var = null;
                    }
                    if (tu4Var != null) {
                        gn3.c(fn3Var.b, fn3Var.c);
                        break;
                    }
                    break;
            }
        }
        this.f = null;
        nt6 nt6Var = this.e;
        if (nt6Var != null) {
            nt6Var.dispose();
        }
        this.e = null;
        this.l = null;
    }

    public final boolean c(ck ckVar) {
        boolean d;
        if (!this.r.A) {
            return false;
        }
        if (this.m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                d = d(ckVar);
            } finally {
                Trace.endSection();
            }
        } else {
            d = d(ckVar);
        }
        lb4.J(-1L, "compose:lazy:prefetch:execute:item");
        return d;
    }

    @Override // defpackage.oq3
    public final void cancel() {
        if (!this.h) {
            this.h = true;
            b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0206 A[Catch: all -> 0x021f, LOOP:2: B:104:0x01da->B:118:0x0206, LOOP_END, TRY_ENTER, TryCatch #5 {all -> 0x021f, blocks: (B:89:0x0193, B:91:0x019b, B:93:0x01a1, B:98:0x01af, B:100:0x01bb, B:102:0x01d1, B:101:0x01be, B:103:0x01d3, B:104:0x01da, B:106:0x01e2, B:112:0x01f3, B:114:0x01f8, B:118:0x0206, B:119:0x020c), top: B:193:0x0193 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r9v18, types: [dh5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, nz] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(ck ckVar) {
        long j;
        int i;
        ?? r12;
        a25 a25Var;
        List list;
        z15 z15Var;
        nt6 f;
        int i2 = this.a;
        long j2 = i2;
        lb4.J(j2, "compose:lazy:prefetch:execute:item");
        cq3 cq3Var = (cq3) ((bq3) this.r.L).b.c();
        if (!this.h) {
            int a = cq3Var.a();
            if (i2 >= 0 && i2 < a) {
                Object c = cq3Var.c(i2);
                Object obj = this.j;
                if (obj != null && !c.equals(obj)) {
                    b();
                    return false;
                }
                Object d = cq3Var.d(i2);
                m44 m44Var = this.b;
                nz nzVar = (nz) m44Var.R;
                if (m44Var.L != d || nzVar == null) {
                    ja4 ja4Var = (ja4) m44Var.B;
                    Object g = ja4Var.g(d);
                    Object obj2 = g;
                    if (g == null) {
                        ?? obj3 = new Object();
                        obj3.e = -1;
                        ja4Var.m(d, obj3);
                        obj2 = obj3;
                    }
                    nzVar = (nz) obj2;
                    m44Var.L = d;
                    m44Var.R = nzVar;
                }
                e();
                long a2 = ckVar.a();
                this.n = a2;
                int i3 = h74.b;
                this.p = System.nanoTime() - h74.a;
                this.o = 0L;
                lb4.J(a2, "compose:lazy:prefetch:available_time_nanos");
                if (!e()) {
                    j = 0;
                    if (g(this.n, nzVar.a + nzVar.b)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            f(c, d, nzVar);
                        } finally {
                        }
                    }
                    if (!e()) {
                        return true;
                    }
                } else {
                    j = 0;
                }
                if (this.f != null) {
                    if (!g(this.n, nzVar.c)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        fn3 fn3Var = this.f;
                        if (fn3Var != null) {
                            switch (fn3Var.a) {
                                case 0:
                                    f = fn3Var.b.f(fn3Var.c);
                                    break;
                                default:
                                    gn3 gn3Var = fn3Var.b;
                                    ym3 b = fn3Var.b();
                                    if (b != null) {
                                        gn3Var.d(b, false);
                                    }
                                    f = gn3Var.f(fn3Var.c);
                                    break;
                            }
                            this.e = f;
                            this.f = null;
                            this.i = true;
                            Trace.endSection();
                            h();
                            nzVar.c = nz.a(this.o, nzVar.c);
                        } else {
                            throw new IllegalArgumentException("Nothing to apply!");
                        }
                    } finally {
                    }
                }
                if (!this.k) {
                    if (this.n <= j) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        nt6 nt6Var = this.e;
                        if (nt6Var != null) {
                            ?? obj4 = new Object();
                            nt6Var.b(new pc4(1, obj4));
                            List list2 = (List) obj4.A;
                            if (list2 != null) {
                                z15Var = new z15(this, list2);
                            } else {
                                z15Var = null;
                            }
                            this.l = z15Var;
                            this.k = true;
                        } else {
                            throw lb1.c("Should precompose before resolving nested prefetch states");
                        }
                    } finally {
                    }
                }
                z15 z15Var2 = this.l;
                if (z15Var2 != null) {
                    int i4 = nzVar.e;
                    boolean z = this.m;
                    List[] listArr = z15Var2.b;
                    int i5 = z15Var2.c;
                    List list3 = z15Var2.a;
                    if (i5 < list3.size()) {
                        if (z15Var2.f.h) {
                            s53.c("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size = list3.size();
                            for (int i6 = 0; i6 < size; i6++) {
                                ((pq3) list3.get(i6)).d = i4;
                            }
                            Trace.endSection();
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (z15Var2.c < list3.size()) {
                                try {
                                    if (listArr[z15Var2.c] == null) {
                                        if (ckVar.a() <= j) {
                                            Trace.endSection();
                                            return true;
                                        }
                                        int i7 = z15Var2.c;
                                        pq3 pq3Var = (pq3) list3.get(i7);
                                        qn2 qn2Var = pq3Var.a;
                                        if (qn2Var == null) {
                                            list = yt1.A;
                                        } else {
                                            nq3 nq3Var = new nq3(pq3Var, pq3Var.d);
                                            qn2Var.g(nq3Var);
                                            ArrayList arrayList = nq3Var.b;
                                            pq3Var.f = arrayList.size();
                                            list = arrayList;
                                        }
                                        listArr[i7] = list;
                                    }
                                    List list4 = listArr[z15Var2.c];
                                    list4.getClass();
                                    while (z15Var2.d < list4.size()) {
                                        a25 a25Var2 = (a25) list4.get(z15Var2.d);
                                        if (z) {
                                            if (a25Var2 != null) {
                                                a25Var = a25Var2;
                                            } else {
                                                a25Var = null;
                                            }
                                            if (a25Var != null) {
                                                r12 = 1;
                                                a25Var.m = true;
                                                z15Var2.e = r12;
                                                if (!a25Var2.c(ckVar)) {
                                                    return r12;
                                                }
                                                z15Var2.d += r12;
                                            }
                                        }
                                        r12 = 1;
                                        z15Var2.e = r12;
                                        if (!a25Var2.c(ckVar)) {
                                        }
                                    }
                                    z15Var2.d = 0;
                                    z15Var2.c++;
                                } finally {
                                }
                            }
                        } finally {
                        }
                    }
                }
                z15 z15Var3 = this.l;
                if (z15Var3 != null && z15Var3.e) {
                    h();
                    lb4.J(j2, "compose:lazy:prefetch:execute:item");
                    z15 z15Var4 = this.l;
                    if (z15Var4 != null) {
                        z15Var4.e = false;
                    }
                }
                q21 q21Var = this.d;
                if (!this.g && q21Var != null) {
                    if (!g(this.n, nzVar.d)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        long j3 = q21Var.a;
                        if (this.h) {
                            s53.a("Callers should check whether the request is still valid before calling performMeasure()");
                        }
                        if (this.g) {
                            s53.a("Request was already measured!");
                        }
                        this.g = true;
                        nt6 nt6Var2 = this.e;
                        if (nt6Var2 != null) {
                            int a3 = nt6Var2.a();
                            for (int i8 = 0; i8 < a3; i8++) {
                                nt6Var2.d(i8, j3);
                            }
                            Trace.endSection();
                            h();
                            nzVar.d = nz.a(this.o, nzVar.d);
                            qn2 qn2Var2 = this.c;
                            if (qn2Var2 != null) {
                                qn2Var2.g(this);
                            }
                        } else {
                            throw lb1.c("performComposition() must be called before performMeasure()");
                        }
                    } finally {
                    }
                }
                z15 z15Var5 = this.l;
                if (this.g && this.k && z15Var5 != null) {
                    List list5 = z15Var5.a;
                    int size2 = list5.size();
                    int i9 = Integer.MAX_VALUE;
                    for (int i10 = 0; i10 < size2; i10++) {
                        i9 = Math.min(i9, ((pq3) list5.get(i10)).e);
                    }
                    if (i9 == Integer.MAX_VALUE) {
                        i9 = 0;
                    }
                    int i11 = nzVar.e;
                    if (i11 == -1) {
                        i = i9;
                    } else {
                        i = ((i11 * 3) + i9) / 4;
                    }
                    nzVar.e = i;
                    int size3 = list5.size();
                    int i12 = Integer.MAX_VALUE;
                    for (int i13 = 0; i13 < size3; i13++) {
                        i12 = Math.min(i12, ((pq3) list5.get(i13)).f);
                    }
                    if (i12 == Integer.MAX_VALUE) {
                        i12 = 0;
                    }
                    if (i12 < i9) {
                        nzVar.d = j;
                    }
                }
                return false;
            }
        }
        b();
        return false;
    }

    public final boolean e() {
        fn3 fn3Var;
        if (this.i || ((fn3Var = this.f) != null && fn3Var.c())) {
            return true;
        }
        return false;
    }

    public final void f(Object obj, Object obj2, nz nzVar) {
        tu4 tu4Var;
        fn3 fn3Var;
        fn3 fn3Var2 = this.f;
        if (fn3Var2 == null) {
            bk1 bk1Var = this.r;
            eo2 a = ((bq3) bk1Var.L).a(this.a, obj, obj2);
            gn3 a2 = ((pt6) bk1Var.B).a();
            if (!a2.A.H()) {
                fn3Var = new fn3(a2, obj, 0);
            } else {
                a2.k(obj, a, true);
                fn3Var = new fn3(a2, obj, 1);
            }
            fn3Var2 = fn3Var;
            this.f = fn3Var2;
            this.j = obj;
        }
        this.q = false;
        while (!fn3Var2.c() && !this.q) {
            pk0 pk0Var = new pk0(4, this, nzVar);
            switch (fn3Var2.a) {
                case 0:
                    break;
                default:
                    ym3 b = fn3Var2.b();
                    qn2 qn2Var = null;
                    if (b != null) {
                        tu4Var = b.f;
                    } else {
                        tu4Var = null;
                    }
                    if (tu4Var != null && !tu4Var.c()) {
                        vl6 t = ln2.t();
                        if (t != null) {
                            qn2Var = t.e();
                        }
                        vl6 N = ln2.N(t);
                        try {
                            tu4Var.e(pk0Var);
                            break;
                        } finally {
                        }
                    }
                    break;
            }
        }
        h();
        boolean z = this.q;
        long j = this.o;
        if (z) {
            nzVar.b = nz.a(j, nzVar.b);
        } else {
            nzVar.a = nz.a(j, nzVar.a);
        }
    }

    public final boolean g(long j, long j2) {
        if (this.m) {
            j2 = 0;
        }
        if (j > j2) {
            return true;
        }
        return false;
    }

    public final void h() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = h74.b;
        long nanoTime = System.nanoTime() - h74.a;
        long j5 = this.p;
        uq1 uq1Var = uq1.NANOSECONDS;
        uq1Var.getClass();
        long j6 = 0;
        if (((j5 - 1) | 1) == Long.MAX_VALUE) {
            if (nanoTime == j5) {
                jd1 jd1Var = oq1.B;
            } else {
                if (j5 < 0) {
                    j4 = oq1.R;
                } else {
                    j4 = oq1.L;
                }
                j6 = oq1.m(j4);
            }
        } else if (((nanoTime - 1) | 1) == Long.MAX_VALUE) {
            if (nanoTime < 0) {
                j2 = oq1.R;
            } else {
                j2 = oq1.L;
            }
            j6 = j2;
        } else {
            long j7 = nanoTime - j5;
            if (((~(j7 ^ j5)) & (j7 ^ nanoTime)) < 0) {
                uq1 uq1Var2 = uq1.MILLISECONDS;
                if (uq1Var.compareTo(uq1Var2) < 0) {
                    uq1Var2.getClass();
                    long convert = uq1Var.getTimeUnit$kotlin_stdlib().convert(1L, uq1Var2.getTimeUnit$kotlin_stdlib());
                    long j8 = (nanoTime / convert) - (j5 / convert);
                    long j9 = (nanoTime % convert) - (j5 % convert);
                    jd1 jd1Var2 = oq1.B;
                    j6 = oq1.j(n16.M(j8, uq1Var2), n16.M(j9, uq1Var));
                } else {
                    if (j7 < 0) {
                        j = oq1.R;
                    } else {
                        j = oq1.L;
                    }
                    j6 = oq1.m(j);
                }
            } else {
                j6 = n16.M(j7, uq1Var);
            }
        }
        long j10 = j6 >> 1;
        jd1 jd1Var3 = oq1.B;
        if ((1 & ((int) j6)) == 0) {
            j3 = j10;
        } else if (j10 > 9223372036854L) {
            j3 = Long.MAX_VALUE;
        } else if (j10 < -9223372036854L) {
            j3 = Long.MIN_VALUE;
        } else {
            j3 = j10 * 1000000;
        }
        this.o = j3;
        long j11 = this.n - j3;
        this.n = j11;
        this.p = nanoTime;
        lb4.J(j11, "compose:lazy:prefetch:available_time_nanos");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.a);
        sb.append(", constraints = ");
        sb.append(this.d);
        sb.append(", isComposed = ");
        sb.append(e());
        sb.append(", isMeasured = ");
        sb.append(this.g);
        sb.append(", isCanceled = ");
        return i61.o(sb, this.h, " }");
    }
}
