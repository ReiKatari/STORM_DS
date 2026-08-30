package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: iv0  reason: default package */
/* loaded from: classes.dex */
public final class iv0 implements cv0 {
    public final dv0 A;
    public final h27 B;
    public final AtomicReference L = new AtomicReference(null);
    public final Object R = new Object();
    public final g24 X;
    public final w86 Y;
    public final d24 Z;
    public final e24 c0;
    public final e24 d0;
    public final d24 e0;
    public final ij0 f0;
    public final ij0 g0;
    public final d24 h0;
    public d24 i0;
    public boolean j0;
    public x56 k0;
    public ql4 l0;
    public iv0 m0;
    public int n0;
    public final bq0 o0;
    public final r8 p0;
    public final sk2 q0;
    public int r0;

    public iv0(dv0 dv0Var, h27 h27Var) {
        this.A = dv0Var;
        this.B = h27Var;
        g24 g24Var = new g24(new e24());
        this.X = g24Var;
        w86 w86Var = new w86();
        if (dv0Var.d()) {
            w86Var.f0 = new j14();
        }
        if (dv0Var.f()) {
            w86Var.c();
        }
        this.Y = w86Var;
        this.Z = oo2.y();
        this.c0 = new e24();
        this.d0 = new e24();
        this.e0 = oo2.y();
        ij0 ij0Var = new ij0();
        this.f0 = ij0Var;
        ij0 ij0Var2 = new ij0();
        this.g0 = ij0Var2;
        this.h0 = oo2.y();
        this.i0 = oo2.y();
        bq0 bq0Var = new bq0(23, dv0Var);
        this.o0 = bq0Var;
        this.p0 = new r8();
        sk2 sk2Var = new sk2(h27Var, dv0Var, y86.d(w86Var), g24Var, ij0Var, ij0Var2, bq0Var, this);
        dv0Var.p(sk2Var);
        this.q0 = sk2Var;
    }

    public final void A(aj2 aj2Var) {
        boolean i = i();
        q();
        dv0 dv0Var = this.A;
        if (i) {
            sk2 sk2Var = this.q0;
            sk2Var.z = 0;
            sk2Var.y = true;
            dv0Var.a(this, aj2Var);
            sk2Var.s();
            return;
        }
        dv0Var.a(this, aj2Var);
    }

    public final void a() {
        this.L.set(null);
        this.f0.q0.e0();
        this.g0.q0.e0();
        g24 g24Var = this.X;
        if (!g24Var.A.g()) {
            r8 r8Var = this.p0;
            try {
                r8Var.g(g24Var, this.q0.z());
                r8Var.b();
            } finally {
                r8Var.a();
            }
        }
    }

    public final void b(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean c2;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean z2;
        long[] jArr6;
        long j7;
        long[] jArr7;
        long[] jArr8;
        char c3;
        long j8;
        int i;
        int i2;
        long[] jArr9;
        boolean z3 = set instanceof yu5;
        d24 d24Var = this.e0;
        Object obj = null;
        int i3 = 8;
        if (z3) {
            e24 e24Var = ((yu5) set).A;
            Object[] objArr = e24Var.b;
            long[] jArr10 = e24Var.a;
            int length = jArr10.length - 2;
            if (length >= 0) {
                int i4 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr10[i4];
                    char c4 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i4 << 3) + i6];
                                c3 = c4;
                                if (obj2 instanceof m55) {
                                    ((m55) obj2).b(obj);
                                } else {
                                    c(z, obj2);
                                    Object g = d24Var.g(obj2);
                                    if (g != null) {
                                        if (g instanceof e24) {
                                            e24 e24Var2 = (e24) g;
                                            Object[] objArr2 = e24Var2.b;
                                            long[] jArr11 = e24Var2.a;
                                            int length2 = jArr11.length - 2;
                                            if (length2 >= 0) {
                                                int i7 = i3;
                                                i = length;
                                                int i8 = 0;
                                                while (true) {
                                                    long j10 = jArr11[i8];
                                                    j8 = j9;
                                                    long[] jArr12 = jArr11;
                                                    if ((((~j10) << c3) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                                        int i10 = 0;
                                                        while (i10 < i9) {
                                                            if ((j10 & 255) < 128) {
                                                                jArr9 = jArr10;
                                                                c(z, (ee1) objArr2[(i8 << 3) + i10]);
                                                            } else {
                                                                jArr9 = jArr10;
                                                            }
                                                            j10 >>= i7;
                                                            i10++;
                                                            jArr10 = jArr9;
                                                        }
                                                        jArr8 = jArr10;
                                                        if (i9 != i7) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr8 = jArr10;
                                                    }
                                                    if (i8 == length2) {
                                                        break;
                                                    }
                                                    i8++;
                                                    jArr11 = jArr12;
                                                    j9 = j8;
                                                    jArr10 = jArr8;
                                                    i7 = 8;
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr10;
                                            j8 = j9;
                                            i = length;
                                            c(z, (ee1) g);
                                        }
                                        i2 = 8;
                                    }
                                }
                                jArr8 = jArr10;
                                j8 = j9;
                                i = length;
                                i2 = 8;
                            } else {
                                jArr8 = jArr10;
                                c3 = c4;
                                j8 = j9;
                                i = length;
                                i2 = i3;
                            }
                            j9 = j8 >> i2;
                            i6++;
                            length = i;
                            i3 = i2;
                            c4 = c3;
                            jArr10 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr10;
                        c = c4;
                        int i11 = length;
                        if (i5 != i3) {
                            break;
                        }
                        length = i11;
                    } else {
                        jArr7 = jArr10;
                        c = 7;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr10 = jArr7;
                    obj = null;
                    i3 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof m55) {
                    ((m55) obj3).b(null);
                } else {
                    c(z, obj3);
                    Object g2 = d24Var.g(obj3);
                    if (g2 != null) {
                        if (g2 instanceof e24) {
                            e24 e24Var3 = (e24) g2;
                            Object[] objArr3 = e24Var3.b;
                            long[] jArr13 = e24Var3.a;
                            int length3 = jArr13.length - 2;
                            if (length3 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j11 = jArr13[i12];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                c(z, (ee1) objArr3[(i12 << 3) + i14]);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        }
                                    }
                                    if (i12 != length3) {
                                        i12++;
                                    }
                                }
                            }
                        } else {
                            c(z, (ee1) g2);
                        }
                    }
                }
            }
        }
        d24 d24Var2 = this.Z;
        e24 e24Var4 = this.c0;
        if (z) {
            e24 e24Var5 = this.d0;
            if (e24Var5.h()) {
                long[] jArr14 = d24Var2.a;
                int length4 = jArr14.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr14[i15];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = d24Var2.b[i18];
                                    Object obj5 = d24Var2.c[i18];
                                    if (obj5 instanceof e24) {
                                        e24 e24Var6 = (e24) obj5;
                                        Object[] objArr4 = e24Var6.b;
                                        long[] jArr15 = e24Var6.a;
                                        int length5 = jArr15.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr15[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr16 = jArr15;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j) {
                                                            jArr6 = jArr14;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            m55 m55Var = (m55) objArr5[i22];
                                                            if (e24Var5.c(m55Var) || e24Var4.c(m55Var)) {
                                                                e24Var6.m(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr14;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr14 = jArr6;
                                                    }
                                                    jArr5 = jArr14;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr14;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr15 = jArr16;
                                                jArr14 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr14;
                                            j6 = j12;
                                        }
                                        z2 = e24Var6.g();
                                    } else {
                                        jArr5 = jArr14;
                                        j6 = j12;
                                        obj5.getClass();
                                        m55 m55Var2 = (m55) obj5;
                                        if (!e24Var5.c(m55Var2) && !e24Var4.c(m55Var2)) {
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                    }
                                    if (z2) {
                                        d24Var2.l(i18);
                                    }
                                } else {
                                    jArr5 = jArr14;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr14 = jArr5;
                            }
                            jArr4 = jArr14;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr14;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr14 = jArr4;
                    }
                }
                e24Var5.b();
                h();
                return;
            }
        }
        if (e24Var4.h()) {
            long[] jArr17 = d24Var2.a;
            int length6 = jArr17.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr17[i23];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = d24Var2.b[i26];
                                Object obj7 = d24Var2.c[i26];
                                if (obj7 instanceof e24) {
                                    e24 e24Var7 = (e24) obj7;
                                    Object[] objArr6 = e24Var7.b;
                                    long[] jArr18 = e24Var7.a;
                                    int length7 = jArr18.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr18[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr19 = jArr18;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr17;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (e24Var4.c((m55) objArr7[i30])) {
                                                            e24Var7.m(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr17;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr17 = jArr3;
                                                }
                                                jArr2 = jArr17;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr17;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr18 = jArr19;
                                            jArr17 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr17;
                                        j4 = j14;
                                    }
                                    c2 = e24Var7.g();
                                } else {
                                    jArr2 = jArr17;
                                    j4 = j14;
                                    obj7.getClass();
                                    c2 = e24Var4.c((m55) obj7);
                                }
                                if (c2) {
                                    d24Var2.l(i26);
                                }
                            } else {
                                jArr2 = jArr17;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr17 = jArr2;
                        }
                        jArr = jArr17;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr17;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr17 = jArr;
                }
            }
            h();
            e24Var4.b();
        }
    }

    public final void c(boolean z, Object obj) {
        Object g = this.Z.g(obj);
        if (g != null) {
            boolean z2 = g instanceof e24;
            e24 e24Var = this.c0;
            e24 e24Var2 = this.d0;
            d24 d24Var = this.h0;
            if (z2) {
                e24 e24Var3 = (e24) g;
                Object[] objArr = e24Var3.b;
                long[] jArr = e24Var3.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    m55 m55Var = (m55) objArr[(i << 3) + i3];
                                    if (!oo2.Q(d24Var, obj, m55Var) && m55Var.b(obj) != l53.IGNORED) {
                                        if (m55Var.g != null && !z) {
                                            e24Var2.a(m55Var);
                                        } else {
                                            e24Var.a(m55Var);
                                        }
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                return;
                            }
                        }
                        if (i != length) {
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                m55 m55Var2 = (m55) g;
                if (!oo2.Q(d24Var, obj, m55Var2) && m55Var2.b(obj) != l53.IGNORED) {
                    if (m55Var2.g != null && !z) {
                        e24Var2.a(m55Var2);
                    } else {
                        e24Var.a(m55Var2);
                    }
                }
            }
        }
    }

    public final void d() {
        synchronized (this.R) {
            try {
                e(this.f0);
                o();
            } catch (Throwable th) {
                try {
                    if (!this.X.A.g()) {
                        r8 r8Var = this.p0;
                        r8Var.g(this.X, this.q0.z());
                        r8Var.b();
                        r8Var.a();
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #7 {all -> 0x003e, blocks: (B:3:0x0013, B:17:0x0035, B:19:0x0039, B:26:0x0047, B:28:0x004b, B:32:0x0056, B:46:0x0081, B:48:0x008e, B:24:0x0043), top: B:152:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.ij0 r34) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv0.e(ij0):void");
    }

    public final void f() {
        synchronized (this.R) {
            try {
                ij0 ij0Var = this.g0;
                ij0Var.getClass();
                if (!ij0Var.q0.g0()) {
                    e(this.g0);
                }
            } catch (Throwable th) {
                try {
                    if (!this.X.A.g()) {
                        r8 r8Var = this.p0;
                        r8Var.g(this.X, this.q0.z());
                        r8Var.b();
                        r8Var.a();
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    public final void g() {
        synchronized (this.R) {
            try {
                this.q0.v = null;
                if (!this.X.A.g()) {
                    r8 r8Var = this.p0;
                    r8Var.g(this.X, this.q0.z());
                    r8Var.b();
                    r8Var.a();
                }
            } catch (Throwable th) {
                try {
                    if (!this.X.A.g()) {
                        r8 r8Var2 = this.p0;
                        r8Var2.g(this.X, this.q0.z());
                        r8Var2.b();
                        r8Var2.a();
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    public final void h() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean z;
        int i4;
        int i5;
        d24 d24Var = this.e0;
        long[] jArr3 = d24Var.a;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = d24Var.b[i10];
                            Object obj2 = d24Var.c[i10];
                            c2 = c3;
                            boolean z2 = obj2 instanceof e24;
                            j5 = j8;
                            d24 d24Var2 = this.Z;
                            if (z2) {
                                e24 e24Var = (e24) obj2;
                                Object[] objArr = e24Var.b;
                                long[] jArr4 = e24Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!d24Var2.c((ee1) objArr[i15])) {
                                                        e24Var.m(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                z = e24Var.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                if (!d24Var2.c((ee1) obj2)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                            if (z) {
                                d24Var.l(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    }
                    length = i16;
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        e24 e24Var2 = this.d0;
        if (e24Var2.h()) {
            Object[] objArr2 = e24Var2.b;
            long[] jArr5 = e24Var2.a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i17 = 0;
                while (true) {
                    long j11 = jArr5[i17];
                    if ((((~j11) << c) & j11 & j2) != j2) {
                        int i18 = 8 - ((~(i17 - length3)) >>> 31);
                        for (int i19 = 0; i19 < i18; i19++) {
                            if ((j11 & j) < j3) {
                                int i20 = (i17 << 3) + i19;
                                if (((m55) objArr2[i20]).g == null) {
                                    e24Var2.m(i20);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i18 != 8) {
                            return;
                        }
                    }
                    if (i17 != length3) {
                        i17++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final boolean i() {
        boolean z;
        synchronized (this.R) {
            z = true;
            if (this.r0 != 1) {
                z = false;
            }
            if (z) {
                this.r0 = 0;
            }
        }
        return z;
    }

    public final void j(aj2 aj2Var) {
        try {
            synchronized (this.R) {
                n();
                d24 d24Var = this.i0;
                this.i0 = oo2.y();
                sk2 sk2Var = this.q0;
                x56 x56Var = this.k0;
                if (!sk2Var.e.q0.g0()) {
                    xu0.a("Expected applyChanges() to have been called");
                }
                sk2Var.P = x56Var;
                sk2Var.n(d24Var, aj2Var);
                sk2Var.P = null;
            }
        } catch (Throwable th) {
            try {
                if (!this.X.A.g()) {
                    r8 r8Var = this.p0;
                    r8Var.g(this.X, this.q0.z());
                    r8Var.b();
                    r8Var.a();
                }
                throw th;
            } catch (Throwable th2) {
                a();
                throw th2;
            }
        }
    }

    public final ql4 k(boolean z, aj2 aj2Var) {
        if (this.l0 != null) {
            or4.b("A pausable composition is in progress");
        }
        ql4 ql4Var = new ql4(this, this.A, this.q0, this.X, aj2Var, z, this.B, this.R);
        this.l0 = ql4Var;
        return ql4Var;
    }

    public final void l() {
        boolean z;
        synchronized (this.R) {
            try {
                if (this.l0 != null) {
                    or4.b("Deactivate is not supported while pausable composition is in progress");
                }
                if (this.Y.B == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (!this.X.A.g()) {
                    }
                    this.Z.a();
                    this.e0.a();
                    this.i0.a();
                    this.f0.q0.e0();
                    this.g0.q0.e0();
                    sk2 sk2Var = this.q0;
                    sk2Var.E.clear();
                    sk2Var.s.clear();
                    sk2Var.e.q0.e0();
                    sk2Var.v = null;
                    this.r0 = 1;
                }
                Trace.beginSection("Compose:deactivate");
                r8 r8Var = this.p0;
                r8Var.g(this.X, this.q0.z());
                if (!z) {
                    w86 w86Var = this.Y;
                    r8 r8Var2 = this.p0;
                    z86 i = w86Var.i();
                    try {
                        i.n(i.t, new s4(15, r8Var2, i));
                        i.e(true);
                        this.B.g();
                        r8Var.c();
                    } catch (Throwable th) {
                        i.e(false);
                        throw th;
                    }
                }
                r8Var.b();
                r8Var.a();
                Trace.endSection();
                this.Z.a();
                this.e0.a();
                this.i0.a();
                this.f0.q0.e0();
                this.g0.q0.e0();
                sk2 sk2Var2 = this.q0;
                sk2Var2.E.clear();
                sk2Var2.s.clear();
                sk2Var2.e.q0.e0();
                sk2Var2.v = null;
                this.r0 = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m() {
        boolean z;
        synchronized (this.R) {
            try {
                if (this.q0.F) {
                    or4.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.r0 != 3) {
                    this.r0 = 3;
                    ij0 ij0Var = this.q0.L;
                    if (ij0Var != null) {
                        e(ij0Var);
                    }
                    if (this.Y.B == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z || !this.X.A.g()) {
                        r8 r8Var = this.p0;
                        r8Var.g(this.X, this.q0.z());
                        if (!z) {
                            w86 w86Var = this.Y;
                            r8 r8Var2 = this.p0;
                            z86 i = w86Var.i();
                            i.n(i.t, new z5(5, r8Var2));
                            i.H();
                            i.e(true);
                            this.B.a();
                            this.B.g();
                            r8Var.c();
                        }
                        r8Var.b();
                        r8Var.a();
                    }
                    sk2 sk2Var = this.q0;
                    sk2Var.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    sk2Var.b.u(sk2Var);
                    sk2Var.E.clear();
                    sk2Var.s.clear();
                    sk2Var.e.q0.e0();
                    sk2Var.v = null;
                    sk2Var.a.a();
                    Trace.endSection();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.A.v(this);
    }

    public final void n() {
        Object obj = se.e;
        AtomicReference atomicReference = this.L;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (!andSet.equals(obj)) {
                if (andSet instanceof Set) {
                    b((Set) andSet, true);
                    return;
                } else if (andSet instanceof Object[]) {
                    for (Set set : (Set[]) andSet) {
                        b(set, true);
                    }
                    return;
                } else {
                    xu0.b("corrupt pendingModifications drain: " + atomicReference);
                    f81.c();
                    return;
                }
            }
            xu0.b("pending composition has not been applied");
            f81.c();
        }
    }

    public final void o() {
        AtomicReference atomicReference = this.L;
        Object andSet = atomicReference.getAndSet(null);
        if (!b53.x(andSet, se.e)) {
            if (andSet instanceof Set) {
                b((Set) andSet, false);
            } else if (andSet instanceof Object[]) {
                for (Set set : (Set[]) andSet) {
                    b(set, false);
                }
            } else if (andSet == null) {
                if (this.l0 == null) {
                    xu0.a("calling recordModificationsOf and applyChanges concurrently is not supported");
                }
            } else {
                xu0.b("corrupt pendingModifications drain: " + atomicReference);
                f81.c();
            }
        }
    }

    public final void p() {
        up1 up1Var = up1.A;
        AtomicReference atomicReference = this.L;
        Object andSet = atomicReference.getAndSet(up1Var);
        if (!b53.x(andSet, se.e) && andSet != null) {
            if (andSet instanceof Set) {
                b((Set) andSet, false);
            } else if (andSet instanceof Object[]) {
                for (Set set : (Set[]) andSet) {
                    b(set, false);
                }
            } else {
                xu0.b("corrupt pendingModifications drain: " + atomicReference);
                f81.c();
            }
        }
    }

    public final void q() {
        String str;
        int i = this.r0;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        str = "";
                    } else {
                        str = "The composition is disposed";
                    }
                } else {
                    str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
                }
            } else {
                str = "The composition should be activated before setting content.";
            }
            or4.b(str);
        }
        if (this.l0 == null) {
            return;
        }
        or4.b("A pausable composition is in progress");
    }

    public final void r(ArrayList arrayList) {
        g24 g24Var = this.X;
        sk2 sk2Var = this.q0;
        if (arrayList.size() > 0) {
            ((j04) ((ti4) arrayList.get(0)).A).getClass();
            xu0.a("Check failed");
        }
        try {
            sk2Var.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                sk2Var.B(arrayList);
                sk2Var.i();
                Trace.endSection();
            } catch (Throwable th) {
                sk2Var.a();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                if (!g24Var.A.g()) {
                    r8 r8Var = this.p0;
                    r8Var.g(g24Var, sk2Var.z());
                    r8Var.b();
                    r8Var.a();
                }
                throw th2;
            } catch (Throwable th3) {
                a();
                throw th3;
            }
        }
    }

    public final l53 s(m55 m55Var, Object obj) {
        iv0 iv0Var;
        int i = m55Var.b;
        if ((i & 2) != 0) {
            m55Var.b = i | 4;
        }
        mk2 mk2Var = m55Var.c;
        if (mk2Var != null && mk2Var.a()) {
            w86 w86Var = this.Y;
            w86Var.getClass();
            mk2 mk2Var2 = m55Var.c;
            if (mk2Var2 != null && w86Var.j(nk2.p(mk2Var2))) {
                if (m55Var.d != null) {
                    l53 t = t(m55Var, mk2Var, obj);
                    if (t != l53.IGNORED) {
                        this.o0.R();
                    }
                    return t;
                }
                return l53.IGNORED;
            }
            synchronized (this.R) {
                iv0Var = this.m0;
            }
            if (iv0Var != null) {
                sk2 sk2Var = iv0Var.q0;
                if (sk2Var.F && sk2Var.d0(m55Var, obj)) {
                    return l53.IMMINENT;
                }
            }
            return l53.IGNORED;
        }
        return l53.IGNORED;
    }

    public final l53 t(m55 m55Var, mk2 mk2Var, Object obj) {
        boolean z;
        synchronized (this.R) {
            try {
                iv0 iv0Var = this.m0;
                iv0 iv0Var2 = null;
                if (iv0Var != null) {
                    w86 w86Var = this.Y;
                    int i = this.n0;
                    if (w86Var.Z) {
                        xu0.a("Writer is active");
                    }
                    if (i < 0 || i >= w86Var.B) {
                        xu0.a("Invalid group index");
                    }
                    mk2 p = nk2.p(mk2Var);
                    if (w86Var.j(p)) {
                        int i2 = w86Var.A[(i * 5) + 3] + i;
                        int i3 = p.a;
                        if (i <= i3 && i3 < i2) {
                            iv0Var2 = iv0Var;
                        }
                    }
                    iv0Var = null;
                    iv0Var2 = iv0Var;
                }
                if (iv0Var2 == null) {
                    sk2 sk2Var = this.q0;
                    if (sk2Var.F && sk2Var.d0(m55Var, obj)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return l53.IMMINENT;
                    } else if (obj == null) {
                        this.i0.m(m55Var, y60.z0);
                    } else {
                        boolean z2 = obj instanceof ee1;
                        d24 d24Var = this.i0;
                        if (!z2) {
                            d24Var.m(m55Var, y60.z0);
                        } else {
                            Object g = d24Var.g(m55Var);
                            if (g != null) {
                                if (g instanceof e24) {
                                    e24 e24Var = (e24) g;
                                    Object[] objArr = e24Var.b;
                                    long[] jArr = e24Var.a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i4 = 0;
                                        loop0: while (true) {
                                            long j = jArr[i4];
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                                for (int i6 = 0; i6 < i5; i6++) {
                                                    if ((255 & j) < 128 && objArr[(i4 << 3) + i6] == y60.z0) {
                                                        break loop0;
                                                    }
                                                    j >>= 8;
                                                }
                                                if (i5 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i4 == length) {
                                                break;
                                            }
                                            i4++;
                                        }
                                    }
                                } else if (g == y60.z0) {
                                }
                            }
                            oo2.q(this.i0, m55Var, obj);
                        }
                    }
                }
                if (iv0Var2 != null) {
                    return iv0Var2.t(m55Var, mk2Var, obj);
                }
                this.A.l(this);
                if (this.q0.F) {
                    return l53.DEFERRED;
                }
                return l53.SCHEDULED;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u(Object obj) {
        Object g = this.Z.g(obj);
        if (g != null) {
            boolean z = g instanceof e24;
            d24 d24Var = this.h0;
            if (z) {
                e24 e24Var = (e24) g;
                Object[] objArr = e24Var.b;
                long[] jArr = e24Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    m55 m55Var = (m55) objArr[(i << 3) + i3];
                                    if (m55Var.b(obj) == l53.IMMINENT) {
                                        oo2.q(d24Var, obj, m55Var);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                return;
                            }
                        }
                        if (i != length) {
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                m55 m55Var2 = (m55) g;
                if (m55Var2.b(obj) == l53.IMMINENT) {
                    oo2.q(d24Var, obj, m55Var2);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(java.util.Set r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof defpackage.yu5
            d24 r3 = r0.e0
            d24 r0 = r0.Z
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L5e
            yu5 r1 = (defpackage.yu5) r1
            e24 r1 = r1.A
            java.lang.Object[] r2 = r1.b
            long[] r1 = r1.a
            int r6 = r1.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L7b
            r7 = r4
        L1c:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L36:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r2[r13]
            boolean r14 = r0.c(r13)
            if (r14 != 0) goto L52
            boolean r13 = r3.c(r13)
            if (r13 == 0) goto L53
        L52:
            return r5
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L36
        L57:
            if (r10 != r11) goto L7b
        L59:
            if (r7 == r6) goto L7b
            int r7 = r7 + 1
            goto L1c
        L5e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            boolean r6 = r0.c(r2)
            if (r6 != 0) goto L7a
            boolean r2 = r3.c(r2)
            if (r2 == 0) goto L64
        L7a:
            return r5
        L7b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv0.v(java.util.Set):boolean");
    }

    public final boolean w() {
        synchronized (this.R) {
            ql4 ql4Var = this.l0;
            boolean z = false;
            if (ql4Var != null && (ql4Var.h.get() != sl4.Recomposing || ql4Var.i != jk2.s())) {
                AtomicReference atomicReference = ql4Var.h;
                sl4 sl4Var = sl4.ApplyPending;
                sl4 sl4Var2 = sl4.RecomposePending;
                while (!atomicReference.compareAndSet(sl4Var, sl4Var2) && atomicReference.get() == sl4Var) {
                }
                ql4Var.l.A.a(9);
                return false;
            }
            n();
            d24 d24Var = this.i0;
            this.i0 = oo2.y();
            sk2 sk2Var = this.q0;
            x56 x56Var = this.k0;
            bf4 bf4Var = sk2Var.e.q0;
            if (!bf4Var.g0()) {
                xu0.a("Expected applyChanges() to have been called");
            }
            if (d24Var.e > 0 || !sk2Var.s.isEmpty()) {
                sk2Var.P = x56Var;
                try {
                    sk2Var.n(d24Var, null);
                    sk2Var.P = null;
                    z = !bf4Var.g0();
                } catch (Throwable th) {
                    sk2Var.P = null;
                    throw th;
                }
            }
            if (!z) {
                o();
            }
            return z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object[]] */
    public final void x(yu5 yu5Var) {
        yu5 yu5Var2;
        while (true) {
            Object obj = this.L.get();
            if (obj != null && !obj.equals(se.e)) {
                if (obj instanceof Set) {
                    yu5Var2 = new Set[]{obj, yu5Var};
                } else if (obj instanceof Object[]) {
                    Set[] setArr = (Set[]) obj;
                    int length = setArr.length;
                    ?? copyOf = Arrays.copyOf(setArr, length + 1);
                    copyOf[length] = yu5Var;
                    yu5Var2 = copyOf;
                } else {
                    c44.y(this.L, "corrupt pendingModifications: ");
                    return;
                }
            } else {
                yu5Var2 = yu5Var;
            }
            AtomicReference atomicReference = this.L;
            while (!atomicReference.compareAndSet(obj, yu5Var2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.R) {
                    o();
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv0.y(java.lang.Object):void");
    }

    public final void z(Object obj) {
        synchronized (this.R) {
            try {
                u(obj);
                Object g = this.e0.g(obj);
                if (g != null) {
                    if (g instanceof e24) {
                        e24 e24Var = (e24) g;
                        Object[] objArr = e24Var.b;
                        long[] jArr = e24Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            u((ee1) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    }
                                }
                                if (i == length) {
                                    break;
                                }
                                i++;
                            }
                        }
                    } else {
                        u((ee1) g);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
