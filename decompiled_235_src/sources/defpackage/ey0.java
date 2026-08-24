package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ey0  reason: default package */
/* loaded from: classes.dex */
public final class ey0 implements yx0 {
    public final zx0 A;
    public final cg7 B;
    public final AtomicReference L = new AtomicReference(null);
    public final Object R = new Object();
    public final ma4 X;
    public final mk6 Y;
    public final ja4 Z;
    public final ka4 d0;
    public final ka4 e0;
    public final ja4 f0;
    public final rl0 g0;
    public final rl0 h0;
    public final ja4 i0;
    public ja4 j0;
    public boolean k0;
    public kh6 l0;
    public tu4 m0;
    public ey0 n0;
    public int o0;
    public final os0 p0;
    public final jb1 q0;
    public final xq2 r0;
    public int s0;

    public ey0(zx0 zx0Var, cg7 cg7Var) {
        this.A = zx0Var;
        this.B = cg7Var;
        ma4 ma4Var = new ma4(new ka4());
        this.X = ma4Var;
        mk6 mk6Var = new mk6();
        if (zx0Var.d()) {
            mk6Var.g0 = new p94();
        }
        if (zx0Var.f()) {
            mk6Var.b();
        }
        this.Y = mk6Var;
        this.Z = mp2.q();
        this.d0 = new ka4();
        this.e0 = new ka4();
        this.f0 = mp2.q();
        rl0 rl0Var = new rl0();
        this.g0 = rl0Var;
        rl0 rl0Var2 = new rl0();
        this.h0 = rl0Var2;
        this.i0 = mp2.q();
        this.j0 = mp2.q();
        os0 os0Var = new os0(zx0Var, 25);
        this.p0 = os0Var;
        this.q0 = new jb1();
        xq2 xq2Var = new xq2(cg7Var, zx0Var, ok6.d(mk6Var), ma4Var, rl0Var, rl0Var2, os0Var, this);
        zx0Var.p(xq2Var);
        this.r0 = xq2Var;
    }

    public final void A(eo2 eo2Var) {
        boolean i = i();
        q();
        zx0 zx0Var = this.A;
        if (i) {
            xq2 xq2Var = this.r0;
            xq2Var.z = 0;
            xq2Var.y = true;
            zx0Var.a(this, eo2Var);
            xq2Var.u();
            return;
        }
        zx0Var.a(this, eo2Var);
    }

    public final void a() {
        this.L.set(null);
        this.g0.m.e0();
        this.h0.m.e0();
        ma4 ma4Var = this.X;
        if (!ma4Var.A.g()) {
            jb1 jb1Var = this.q0;
            try {
                jb1Var.g(ma4Var, this.r0.C());
                jb1Var.b();
            } finally {
                jb1Var.a();
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
        boolean z3 = set instanceof d66;
        ja4 ja4Var = this.f0;
        Object obj = null;
        int i3 = 8;
        if (z3) {
            ka4 ka4Var = ((d66) set).A;
            Object[] objArr = ka4Var.b;
            long[] jArr10 = ka4Var.a;
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
                                if (obj2 instanceof cf5) {
                                    ((cf5) obj2).b(obj);
                                } else {
                                    c(z, obj2);
                                    Object g = ja4Var.g(obj2);
                                    if (g != null) {
                                        if (g instanceof ka4) {
                                            ka4 ka4Var2 = (ka4) g;
                                            Object[] objArr2 = ka4Var2.b;
                                            long[] jArr11 = ka4Var2.a;
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
                                                                c(z, (ii1) objArr2[(i8 << 3) + i10]);
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
                                            c(z, (ii1) g);
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
                if (obj3 instanceof cf5) {
                    ((cf5) obj3).b(null);
                } else {
                    c(z, obj3);
                    Object g2 = ja4Var.g(obj3);
                    if (g2 != null) {
                        if (g2 instanceof ka4) {
                            ka4 ka4Var3 = (ka4) g2;
                            Object[] objArr3 = ka4Var3.b;
                            long[] jArr13 = ka4Var3.a;
                            int length3 = jArr13.length - 2;
                            if (length3 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j11 = jArr13[i12];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                c(z, (ii1) objArr3[(i12 << 3) + i14]);
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
                            c(z, (ii1) g2);
                        }
                    }
                }
            }
        }
        ja4 ja4Var2 = this.Z;
        ka4 ka4Var4 = this.d0;
        if (z) {
            ka4 ka4Var5 = this.e0;
            if (ka4Var5.h()) {
                long[] jArr14 = ja4Var2.a;
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
                                    Object obj4 = ja4Var2.b[i18];
                                    Object obj5 = ja4Var2.c[i18];
                                    if (obj5 instanceof ka4) {
                                        ka4 ka4Var6 = (ka4) obj5;
                                        Object[] objArr4 = ka4Var6.b;
                                        long[] jArr15 = ka4Var6.a;
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
                                                            cf5 cf5Var = (cf5) objArr5[i22];
                                                            if (ka4Var5.c(cf5Var) || ka4Var4.c(cf5Var)) {
                                                                ka4Var6.m(i22);
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
                                        z2 = ka4Var6.g();
                                    } else {
                                        jArr5 = jArr14;
                                        j6 = j12;
                                        obj5.getClass();
                                        cf5 cf5Var2 = (cf5) obj5;
                                        if (!ka4Var5.c(cf5Var2) && !ka4Var4.c(cf5Var2)) {
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                    }
                                    if (z2) {
                                        ja4Var2.l(i18);
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
                ka4Var5.b();
                h();
                return;
            }
        }
        if (ka4Var4.h()) {
            long[] jArr17 = ja4Var2.a;
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
                                Object obj6 = ja4Var2.b[i26];
                                Object obj7 = ja4Var2.c[i26];
                                if (obj7 instanceof ka4) {
                                    ka4 ka4Var7 = (ka4) obj7;
                                    Object[] objArr6 = ka4Var7.b;
                                    long[] jArr18 = ka4Var7.a;
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
                                                        if (ka4Var4.c((cf5) objArr7[i30])) {
                                                            ka4Var7.m(i30);
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
                                    c2 = ka4Var7.g();
                                } else {
                                    jArr2 = jArr17;
                                    j4 = j14;
                                    obj7.getClass();
                                    c2 = ka4Var4.c((cf5) obj7);
                                }
                                if (c2) {
                                    ja4Var2.l(i26);
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
            ka4Var4.b();
        }
    }

    public final void c(boolean z, Object obj) {
        Object g = this.Z.g(obj);
        if (g != null) {
            boolean z2 = g instanceof ka4;
            ka4 ka4Var = this.d0;
            ka4 ka4Var2 = this.e0;
            ja4 ja4Var = this.i0;
            if (z2) {
                ka4 ka4Var3 = (ka4) g;
                Object[] objArr = ka4Var3.b;
                long[] jArr = ka4Var3.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    cf5 cf5Var = (cf5) objArr[(i << 3) + i3];
                                    if (!mp2.U(ja4Var, obj, cf5Var) && cf5Var.b(obj) != yb3.IGNORED) {
                                        if (cf5Var.g != null && !z) {
                                            ka4Var2.a(cf5Var);
                                        } else {
                                            ka4Var.a(cf5Var);
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
                cf5 cf5Var2 = (cf5) g;
                if (!mp2.U(ja4Var, obj, cf5Var2) && cf5Var2.b(obj) != yb3.IGNORED) {
                    if (cf5Var2.g != null && !z) {
                        ka4Var2.a(cf5Var2);
                    } else {
                        ka4Var.a(cf5Var2);
                    }
                }
            }
        }
    }

    public final void d() {
        synchronized (this.R) {
            try {
                e(this.g0);
                o();
            } catch (Throwable th) {
                try {
                    if (!this.X.A.g()) {
                        jb1 jb1Var = this.q0;
                        jb1Var.g(this.X, this.r0.C());
                        jb1Var.b();
                        jb1Var.a();
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
    */
    public final void e(rl0 rl0Var) {
        nt ntVar;
        jf5 jf5Var;
        String str;
        jb1 jb1Var;
        pk6 d;
        jb1 jb1Var2;
        long[] jArr;
        int i;
        long[] jArr2;
        jb1 jb1Var3;
        long j;
        char c;
        long j2;
        int i2;
        boolean z;
        long j3;
        rl0 rl0Var2 = this.h0;
        xq2 xq2Var = this.r0;
        cy0 C = xq2Var.C();
        jb1 jb1Var4 = this.q0;
        jb1Var4.g(this.X, C);
        try {
            if (rl0Var.m.g0()) {
                try {
                    if (rl0Var2.m.g0() && this.m0 == null) {
                        jb1Var4.b();
                    }
                    return;
                } finally {
                }
            }
            tu4 tu4Var = this.m0;
            if (tu4Var == null || (ntVar = tu4Var.l) == null) {
                ntVar = this.B;
            }
            if (tu4Var != null) {
                jf5Var = tu4Var.l;
            } else {
                jf5Var = null;
            }
            if (ntVar.equals(jf5Var)) {
                str = "Compose:recordChanges";
            } else {
                str = "Compose:applyChanges";
            }
            try {
                Trace.beginSection(str);
                try {
                    tu4 tu4Var2 = this.m0;
                    try {
                        try {
                            if (tu4Var2 != null) {
                                jb1Var = tu4Var2.k;
                                if (jb1Var == null) {
                                }
                                mk6 mk6Var = this.Y;
                                cy0 C2 = xq2Var.C();
                                d = ok6.d(mk6Var).d();
                                int i3 = 0;
                                rl0Var.Z(ntVar, d, jb1Var, C2);
                                d.e(true);
                                ntVar.l();
                                Trace.endSection();
                                jb1Var4.c();
                                jb1Var4.d();
                                if (!this.k0) {
                                    Trace.beginSection("Compose:unobserve");
                                    try {
                                        this.k0 = false;
                                        ja4 ja4Var = this.Z;
                                        long[] jArr3 = ja4Var.a;
                                        int length = jArr3.length - 2;
                                        if (length >= 0) {
                                            int i4 = 0;
                                            while (true) {
                                                long j4 = jArr3[i4];
                                                char c2 = 7;
                                                long j5 = -9187201950435737472L;
                                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i5 = 8;
                                                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                                                    int i7 = i3;
                                                    while (i7 < i6) {
                                                        if ((j4 & 255) < 128) {
                                                            c = c2;
                                                            int i8 = (i4 << 3) + i7;
                                                            j2 = j5;
                                                            Object obj = ja4Var.b[i8];
                                                            Object obj2 = ja4Var.c[i8];
                                                            if (obj2 instanceof ka4) {
                                                                ka4 ka4Var = (ka4) obj2;
                                                                Object[] objArr = ka4Var.b;
                                                                long[] jArr4 = ka4Var.a;
                                                                int i9 = i5;
                                                                int length2 = jArr4.length - 2;
                                                                i = i7;
                                                                jArr2 = jArr3;
                                                                jb1Var3 = jb1Var4;
                                                                if (length2 >= 0) {
                                                                    int i10 = 0;
                                                                    while (true) {
                                                                        try {
                                                                            long j6 = jArr4[i10];
                                                                            j = j4;
                                                                            long[] jArr5 = jArr4;
                                                                            if ((((~j6) << c) & j6 & j2) != j2) {
                                                                                int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                                for (int i12 = 0; i12 < i11; i12++) {
                                                                                    if ((j6 & 255) < 128) {
                                                                                        j3 = j6;
                                                                                        int i13 = (i10 << 3) + i12;
                                                                                        if (!((cf5) objArr[i13]).a()) {
                                                                                            ka4Var.m(i13);
                                                                                        }
                                                                                    } else {
                                                                                        j3 = j6;
                                                                                    }
                                                                                    j6 = j3 >> i9;
                                                                                }
                                                                                if (i11 != i9) {
                                                                                    break;
                                                                                }
                                                                            }
                                                                            if (i10 == length2) {
                                                                                break;
                                                                            }
                                                                            i10++;
                                                                            jArr4 = jArr5;
                                                                            j4 = j;
                                                                            i9 = 8;
                                                                        } catch (Throwable th) {
                                                                            th = th;
                                                                            Trace.endSection();
                                                                            throw th;
                                                                        }
                                                                    }
                                                                } else {
                                                                    j = j4;
                                                                }
                                                                z = ka4Var.g();
                                                            } else {
                                                                i = i7;
                                                                jArr2 = jArr3;
                                                                jb1Var3 = jb1Var4;
                                                                j = j4;
                                                                obj2.getClass();
                                                                if (!((cf5) obj2).a()) {
                                                                    z = true;
                                                                } else {
                                                                    z = false;
                                                                }
                                                            }
                                                            if (z) {
                                                                ja4Var.l(i8);
                                                            }
                                                            i2 = 8;
                                                        } else {
                                                            i = i7;
                                                            jArr2 = jArr3;
                                                            jb1Var3 = jb1Var4;
                                                            j = j4;
                                                            c = c2;
                                                            j2 = j5;
                                                            i2 = i5;
                                                        }
                                                        j4 = j >> i2;
                                                        i7 = i + 1;
                                                        i5 = i2;
                                                        c2 = c;
                                                        j5 = j2;
                                                        jb1Var4 = jb1Var3;
                                                        jArr3 = jArr2;
                                                    }
                                                    jArr = jArr3;
                                                    jb1Var2 = jb1Var4;
                                                    if (i6 != i5) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr = jArr3;
                                                    jb1Var2 = jb1Var4;
                                                }
                                                if (i4 == length) {
                                                    break;
                                                }
                                                i4++;
                                                jb1Var4 = jb1Var2;
                                                jArr3 = jArr;
                                                i3 = 0;
                                            }
                                        } else {
                                            jb1Var2 = jb1Var4;
                                        }
                                        h();
                                        Trace.endSection();
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } else {
                                    jb1Var2 = jb1Var4;
                                }
                                if (rl0Var2.m.g0() && this.m0 == null) {
                                    jb1Var2.b();
                                }
                                return;
                            }
                            if (rl0Var2.m.g0()) {
                                jb1Var2.b();
                            }
                            return;
                        } finally {
                            jb1Var2.a();
                        }
                        rl0Var.Z(ntVar, d, jb1Var, C2);
                        d.e(true);
                        ntVar.l();
                        Trace.endSection();
                        jb1Var4.c();
                        jb1Var4.d();
                        if (!this.k0) {
                        }
                    } catch (Throwable th3) {
                        try {
                            d.e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                    jb1Var = jb1Var4;
                    mk6 mk6Var2 = this.Y;
                    cy0 C22 = xq2Var.C();
                    d = ok6.d(mk6Var2).d();
                    int i32 = 0;
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                try {
                    if (rl0Var2.m.g0() && this.m0 == null) {
                        jb1Var4.b();
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public final void f() {
        synchronized (this.R) {
            try {
                rl0 rl0Var = this.h0;
                rl0Var.getClass();
                if (!rl0Var.m.g0()) {
                    e(this.h0);
                }
            } catch (Throwable th) {
                try {
                    if (!this.X.A.g()) {
                        jb1 jb1Var = this.q0;
                        jb1Var.g(this.X, this.r0.C());
                        jb1Var.b();
                        jb1Var.a();
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
                this.r0.v = null;
                if (!this.X.A.g()) {
                    jb1 jb1Var = this.q0;
                    jb1Var.g(this.X, this.r0.C());
                    jb1Var.b();
                    jb1Var.a();
                }
            } catch (Throwable th) {
                try {
                    if (!this.X.A.g()) {
                        jb1 jb1Var2 = this.q0;
                        jb1Var2.g(this.X, this.r0.C());
                        jb1Var2.b();
                        jb1Var2.a();
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
        ja4 ja4Var = this.f0;
        long[] jArr3 = ja4Var.a;
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
                            Object obj = ja4Var.b[i10];
                            Object obj2 = ja4Var.c[i10];
                            c2 = c3;
                            boolean z2 = obj2 instanceof ka4;
                            j5 = j8;
                            ja4 ja4Var2 = this.Z;
                            if (z2) {
                                ka4 ka4Var = (ka4) obj2;
                                Object[] objArr = ka4Var.b;
                                long[] jArr4 = ka4Var.a;
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
                                                    if (!ja4Var2.c((ii1) objArr[i15])) {
                                                        ka4Var.m(i15);
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
                                z = ka4Var.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                if (!ja4Var2.c((ii1) obj2)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                            if (z) {
                                ja4Var.l(i10);
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
        ka4 ka4Var2 = this.e0;
        if (ka4Var2.h()) {
            Object[] objArr2 = ka4Var2.b;
            long[] jArr5 = ka4Var2.a;
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
                                if (((cf5) objArr2[i20]).g == null) {
                                    ka4Var2.m(i20);
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
            if (this.s0 != 1) {
                z = false;
            }
            if (z) {
                this.s0 = 0;
            }
        }
        return z;
    }

    public final void j(eo2 eo2Var) {
        try {
            synchronized (this.R) {
                n();
                ja4 ja4Var = this.j0;
                this.j0 = mp2.q();
                xq2 xq2Var = this.r0;
                kh6 kh6Var = this.l0;
                if (!xq2Var.e.m.g0()) {
                    tx0.a("Expected applyChanges() to have been called");
                }
                xq2Var.P = kh6Var;
                xq2Var.n(ja4Var, eo2Var);
                xq2Var.P = null;
            }
        } catch (Throwable th) {
            try {
                if (!this.X.A.g()) {
                    jb1 jb1Var = this.q0;
                    jb1Var.g(this.X, this.r0.C());
                    jb1Var.b();
                    jb1Var.a();
                }
                throw th;
            } catch (Throwable th2) {
                a();
                throw th2;
            }
        }
    }

    public final tu4 k(boolean z, eo2 eo2Var) {
        if (this.m0 != null) {
            r05.b("A pausable composition is in progress");
        }
        tu4 tu4Var = new tu4(this, this.A, this.r0, this.X, eo2Var, z, this.B, this.R);
        this.m0 = tu4Var;
        return tu4Var;
    }

    public final void l() {
        boolean z;
        synchronized (this.R) {
            try {
                if (this.m0 != null) {
                    r05.b("Deactivate is not supported while pausable composition is in progress");
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
                    this.f0.a();
                    this.j0.a();
                    this.g0.m.e0();
                    this.h0.m.e0();
                    xq2 xq2Var = this.r0;
                    xq2Var.E.clear();
                    xq2Var.s.clear();
                    xq2Var.e.m.e0();
                    xq2Var.v = null;
                    this.s0 = 1;
                }
                Trace.beginSection("Compose:deactivate");
                jb1 jb1Var = this.q0;
                jb1Var.g(this.X, this.r0.C());
                if (!z) {
                    mk6 mk6Var = this.Y;
                    jb1 jb1Var2 = this.q0;
                    pk6 d = mk6Var.d();
                    try {
                        d.n(d.t, new ql1(16, jb1Var2, d));
                        d.e(true);
                        this.B.l();
                        jb1Var.c();
                    } catch (Throwable th) {
                        d.e(false);
                        throw th;
                    }
                }
                jb1Var.b();
                jb1Var.a();
                Trace.endSection();
                this.Z.a();
                this.f0.a();
                this.j0.a();
                this.g0.m.e0();
                this.h0.m.e0();
                xq2 xq2Var2 = this.r0;
                xq2Var2.E.clear();
                xq2Var2.s.clear();
                xq2Var2.e.m.e0();
                xq2Var2.v = null;
                this.s0 = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m() {
        boolean z;
        synchronized (this.R) {
            try {
                if (this.r0.F) {
                    r05.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.s0 != 3) {
                    this.s0 = 3;
                    rl0 rl0Var = this.r0.L;
                    if (rl0Var != null) {
                        e(rl0Var);
                    }
                    if (this.Y.B == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z || !this.X.A.g()) {
                        jb1 jb1Var = this.q0;
                        jb1Var.g(this.X, this.r0.C());
                        if (!z) {
                            mk6 mk6Var = this.Y;
                            jb1 jb1Var2 = this.q0;
                            pk6 d = mk6Var.d();
                            d.n(d.t, new z5(jb1Var2, 5));
                            d.H();
                            d.e(true);
                            this.B.a();
                            this.B.l();
                            jb1Var.c();
                        }
                        jb1Var.b();
                        jb1Var.a();
                    }
                    xq2 xq2Var = this.r0;
                    xq2Var.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    xq2Var.b.u(xq2Var);
                    xq2Var.E.clear();
                    xq2Var.s.clear();
                    xq2Var.e.m.e0();
                    xq2Var.v = null;
                    xq2Var.a.a();
                    Trace.endSection();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.A.v(this);
    }

    public final void n() {
        Object obj = nb3.k;
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
                    tx0.b("corrupt pendingModifications drain: " + atomicReference);
                    e41.c();
                    return;
                }
            }
            tx0.b("pending composition has not been applied");
            e41.c();
        }
    }

    public final void o() {
        AtomicReference atomicReference = this.L;
        Object andSet = atomicReference.getAndSet(null);
        if (!nb3.k(andSet, nb3.k)) {
            if (andSet instanceof Set) {
                b((Set) andSet, false);
            } else if (andSet instanceof Object[]) {
                for (Set set : (Set[]) andSet) {
                    b(set, false);
                }
            } else if (andSet == null) {
                if (this.m0 == null) {
                    tx0.a("calling recordModificationsOf and applyChanges concurrently is not supported");
                }
            } else {
                tx0.b("corrupt pendingModifications drain: " + atomicReference);
                e41.c();
            }
        }
    }

    public final void p() {
        du1 du1Var = du1.A;
        AtomicReference atomicReference = this.L;
        Object andSet = atomicReference.getAndSet(du1Var);
        if (!nb3.k(andSet, nb3.k) && andSet != null) {
            if (andSet instanceof Set) {
                b((Set) andSet, false);
            } else if (andSet instanceof Object[]) {
                for (Set set : (Set[]) andSet) {
                    b(set, false);
                }
            } else {
                tx0.b("corrupt pendingModifications drain: " + atomicReference);
                e41.c();
            }
        }
    }

    public final void q() {
        String str;
        int i = this.s0;
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
            r05.b(str);
        }
        if (this.m0 == null) {
            return;
        }
        r05.b("A pausable composition is in progress");
    }

    public final void r(ArrayList arrayList) {
        ma4 ma4Var = this.X;
        xq2 xq2Var = this.r0;
        if (arrayList.size() > 0) {
            ((o84) ((vr4) arrayList.get(0)).A).getClass();
            tx0.a("Check failed");
        }
        try {
            xq2Var.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                xq2Var.F(arrayList);
                xq2Var.i();
                Trace.endSection();
            } catch (Throwable th) {
                xq2Var.a();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                if (!ma4Var.A.g()) {
                    jb1 jb1Var = this.q0;
                    jb1Var.g(ma4Var, xq2Var.C());
                    jb1Var.b();
                    jb1Var.a();
                }
                throw th2;
            } catch (Throwable th3) {
                a();
                throw th3;
            }
        }
    }

    public final yb3 s(cf5 cf5Var, Object obj) {
        ey0 ey0Var;
        int i = cf5Var.b;
        if ((i & 2) != 0) {
            cf5Var.b = i | 4;
        }
        sq2 sq2Var = cf5Var.c;
        if (sq2Var != null && sq2Var.a()) {
            mk6 mk6Var = this.Y;
            mk6Var.getClass();
            sq2 sq2Var2 = cf5Var.c;
            if (sq2Var2 != null && mk6Var.f(yh2.k(sq2Var2))) {
                if (cf5Var.d != null) {
                    yb3 t = t(cf5Var, sq2Var, obj);
                    if (t != yb3.IGNORED) {
                        this.p0.S();
                    }
                    return t;
                }
                return yb3.IGNORED;
            }
            synchronized (this.R) {
                ey0Var = this.n0;
            }
            if (ey0Var != null) {
                xq2 xq2Var = ey0Var.r0;
                if (xq2Var.F && xq2Var.h0(cf5Var, obj)) {
                    return yb3.IMMINENT;
                }
            }
            return yb3.IGNORED;
        }
        return yb3.IGNORED;
    }

    public final yb3 t(cf5 cf5Var, sq2 sq2Var, Object obj) {
        boolean z;
        synchronized (this.R) {
            try {
                ey0 ey0Var = this.n0;
                ey0 ey0Var2 = null;
                if (ey0Var != null) {
                    mk6 mk6Var = this.Y;
                    int i = this.o0;
                    if (mk6Var.Z) {
                        tx0.a("Writer is active");
                    }
                    if (i < 0 || i >= mk6Var.B) {
                        tx0.a("Invalid group index");
                    }
                    sq2 k = yh2.k(sq2Var);
                    if (mk6Var.f(k)) {
                        int i2 = mk6Var.A[(i * 5) + 3] + i;
                        int i3 = k.a;
                        if (i <= i3 && i3 < i2) {
                            ey0Var2 = ey0Var;
                        }
                    }
                    ey0Var = null;
                    ey0Var2 = ey0Var;
                }
                if (ey0Var2 == null) {
                    xq2 xq2Var = this.r0;
                    if (xq2Var.F && xq2Var.h0(cf5Var, obj)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return yb3.IMMINENT;
                    } else if (obj == null) {
                        this.j0.m(cf5Var, d90.C0);
                    } else {
                        boolean z2 = obj instanceof ii1;
                        ja4 ja4Var = this.j0;
                        if (!z2) {
                            ja4Var.m(cf5Var, d90.C0);
                        } else {
                            Object g = ja4Var.g(cf5Var);
                            if (g != null) {
                                if (g instanceof ka4) {
                                    ka4 ka4Var = (ka4) g;
                                    Object[] objArr = ka4Var.b;
                                    long[] jArr = ka4Var.a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i4 = 0;
                                        loop0: while (true) {
                                            long j = jArr[i4];
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                                for (int i6 = 0; i6 < i5; i6++) {
                                                    if ((255 & j) < 128 && objArr[(i4 << 3) + i6] == d90.C0) {
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
                                } else if (g == d90.C0) {
                                }
                            }
                            mp2.g(this.j0, cf5Var, obj);
                        }
                    }
                }
                if (ey0Var2 != null) {
                    return ey0Var2.t(cf5Var, sq2Var, obj);
                }
                this.A.l(this);
                if (this.r0.F) {
                    return yb3.DEFERRED;
                }
                return yb3.SCHEDULED;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u(Object obj) {
        Object g = this.Z.g(obj);
        if (g != null) {
            boolean z = g instanceof ka4;
            ja4 ja4Var = this.i0;
            if (z) {
                ka4 ka4Var = (ka4) g;
                Object[] objArr = ka4Var.b;
                long[] jArr = ka4Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    cf5 cf5Var = (cf5) objArr[(i << 3) + i3];
                                    if (cf5Var.b(obj) == yb3.IMMINENT) {
                                        mp2.g(ja4Var, obj, cf5Var);
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
                cf5 cf5Var2 = (cf5) g;
                if (cf5Var2.b(obj) == yb3.IMMINENT) {
                    mp2.g(ja4Var, obj, cf5Var2);
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
    */
    public final boolean v(Set set) {
        boolean z = set instanceof d66;
        ja4 ja4Var = this.f0;
        ja4 ja4Var2 = this.Z;
        if (z) {
            ka4 ka4Var = ((d66) set).A;
            Object[] objArr = ka4Var.b;
            long[] jArr = ka4Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (ja4Var2.c(obj) || ja4Var.c(obj)) {
                                    break loop0;
                                }
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
            for (Object obj2 : set) {
                if (ja4Var2.c(obj2) || ja4Var.c(obj2)) {
                    return true;
                }
                while (r1.hasNext()) {
                }
            }
        }
        return false;
    }

    public final boolean w() {
        synchronized (this.R) {
            tu4 tu4Var = this.m0;
            boolean z = false;
            if (tu4Var != null && (tu4Var.h.get() != vu4.Recomposing || tu4Var.i != kj2.s())) {
                AtomicReference atomicReference = tu4Var.h;
                vu4 vu4Var = vu4.ApplyPending;
                vu4 vu4Var2 = vu4.RecomposePending;
                while (!atomicReference.compareAndSet(vu4Var, vu4Var2) && atomicReference.get() == vu4Var) {
                }
                tu4Var.l.A.a(9);
                return false;
            }
            n();
            ja4 ja4Var = this.j0;
            this.j0 = mp2.q();
            xq2 xq2Var = this.r0;
            kh6 kh6Var = this.l0;
            co4 co4Var = xq2Var.e.m;
            if (!co4Var.g0()) {
                tx0.a("Expected applyChanges() to have been called");
            }
            if (ja4Var.e > 0 || !xq2Var.s.isEmpty()) {
                xq2Var.P = kh6Var;
                try {
                    xq2Var.n(ja4Var, null);
                    xq2Var.P = null;
                    z = !co4Var.g0();
                } catch (Throwable th) {
                    xq2Var.P = null;
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
    public final void x(d66 d66Var) {
        d66 d66Var2;
        while (true) {
            Object obj = this.L.get();
            if (obj != null && !obj.equals(nb3.k)) {
                if (obj instanceof Set) {
                    d66Var2 = new Set[]{obj, d66Var};
                } else if (obj instanceof Object[]) {
                    Set[] setArr = (Set[]) obj;
                    int length = setArr.length;
                    ?? copyOf = Arrays.copyOf(setArr, length + 1);
                    copyOf[length] = d66Var;
                    d66Var2 = copyOf;
                } else {
                    u34.B(this.L, "corrupt pendingModifications: ");
                    return;
                }
            } else {
                d66Var2 = d66Var;
            }
            AtomicReference atomicReference = this.L;
            while (!atomicReference.compareAndSet(obj, d66Var2)) {
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
    */
    public final void y(Object obj) {
        cf5 A;
        int i;
        boolean z;
        int i2;
        xq2 xq2Var = this.r0;
        if (xq2Var.A <= 0 && (A = xq2Var.A()) != null) {
            int i3 = A.b | 1;
            A.b = i3;
            if ((i3 & 32) == 0) {
                y94 y94Var = A.f;
                if (y94Var == null) {
                    y94Var = new y94();
                    A.f = y94Var;
                }
                int i4 = A.e;
                int c = y94Var.c(obj);
                if (c < 0) {
                    c = ~c;
                    i = -1;
                } else {
                    i = y94Var.c[c];
                }
                y94Var.b[c] = obj;
                y94Var.c[c] = i4;
                if (i == A.e) {
                    z = true;
                    this.p0.S();
                    if (z) {
                        if (obj instanceof fq6) {
                            ((fq6) obj).g(1);
                        }
                        mp2.g(this.Z, obj, A);
                        if (obj instanceof ii1) {
                            ii1 ii1Var = (ii1) obj;
                            hi1 i5 = ii1Var.i();
                            ja4 ja4Var = this.f0;
                            mp2.W(ja4Var, obj);
                            y94 y94Var2 = i5.e;
                            Object[] objArr = y94Var2.b;
                            long[] jArr = y94Var2.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j = jArr[i6];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i7 = 8;
                                        int i8 = 8 - ((~(i6 - length)) >>> 31);
                                        int i9 = 0;
                                        while (i9 < i8) {
                                            if ((j & 255) < 128) {
                                                eq6 eq6Var = (eq6) objArr[(i6 << 3) + i9];
                                                i2 = i7;
                                                if (eq6Var instanceof fq6) {
                                                    ((fq6) eq6Var).g(1);
                                                }
                                                mp2.g(ja4Var, eq6Var, obj);
                                            } else {
                                                i2 = i7;
                                            }
                                            j >>= i2;
                                            i9++;
                                            i7 = i2;
                                        }
                                        if (i8 != i7) {
                                            break;
                                        }
                                    }
                                    if (i6 == length) {
                                        break;
                                    }
                                    i6++;
                                }
                            }
                            Object obj2 = i5.f;
                            ja4 ja4Var2 = A.g;
                            if (ja4Var2 == null) {
                                ja4Var2 = new ja4();
                                A.g = ja4Var2;
                            }
                            ja4Var2.m(ii1Var, obj2);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            z = false;
            this.p0.S();
            if (z) {
            }
        }
    }

    public final void z(Object obj) {
        synchronized (this.R) {
            try {
                u(obj);
                Object g = this.f0.g(obj);
                if (g != null) {
                    if (g instanceof ka4) {
                        ka4 ka4Var = (ka4) g;
                        Object[] objArr = ka4Var.b;
                        long[] jArr = ka4Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            u((ii1) objArr[(i << 3) + i3]);
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
                        u((ii1) g);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
