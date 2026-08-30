package n2;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y implements u {
    public final v A;
    public final a4.r2 B;
    public final AtomicReference L = new AtomicReference(null);
    public final Object R = new Object();
    public final a1.p0 X;
    public final e2 Y;
    public final a1.m0 Z;

    /* renamed from: b0  reason: collision with root package name */
    public final a1.n0 f10067b0;

    /* renamed from: c0  reason: collision with root package name */
    public final a1.n0 f10068c0;

    /* renamed from: d0  reason: collision with root package name */
    public final a1.m0 f10069d0;

    /* renamed from: e0  reason: collision with root package name */
    public final o2.a f10070e0;

    /* renamed from: f0  reason: collision with root package name */
    public final o2.a f10071f0;

    /* renamed from: g0  reason: collision with root package name */
    public final a1.m0 f10072g0;

    /* renamed from: h0  reason: collision with root package name */
    public a1.m0 f10073h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f10074i0;

    /* renamed from: j0  reason: collision with root package name */
    public c2 f10075j0;

    /* renamed from: k0  reason: collision with root package name */
    public i1 f10076k0;

    /* renamed from: l0  reason: collision with root package name */
    public y f10077l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f10078m0;

    /* renamed from: n0  reason: collision with root package name */
    public final l.i0 f10079n0;

    /* renamed from: o0  reason: collision with root package name */
    public final v2.i f10080o0;
    public final r p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f10081q0;

    public y(v vVar, a4.r2 r2Var) {
        this.A = vVar;
        this.B = r2Var;
        a1.p0 p0Var = new a1.p0(new a1.n0());
        this.X = p0Var;
        e2 e2Var = new e2();
        if (vVar.d()) {
            e2Var.f9902e0 = new a1.x();
        }
        if (vVar.f()) {
            e2Var.b();
        }
        this.Y = e2Var;
        this.Z = k0.d.q();
        this.f10067b0 = new a1.n0();
        this.f10068c0 = new a1.n0();
        this.f10069d0 = k0.d.q();
        o2.a aVar = new o2.a();
        this.f10070e0 = aVar;
        o2.a aVar2 = new o2.a();
        this.f10071f0 = aVar2;
        this.f10072g0 = k0.d.q();
        this.f10073h0 = k0.d.q();
        l.i0 i0Var = new l.i0(8, vVar);
        this.f10079n0 = i0Var;
        this.f10080o0 = new v2.i();
        r rVar = new r(r2Var, vVar, e2Var, p0Var, aVar, aVar2, i0Var, this);
        vVar.p(rVar);
        this.p0 = rVar;
    }

    public final void A(Object obj) {
        synchronized (this.R) {
            try {
                v(obj);
                Object g10 = this.f10069d0.g(obj);
                if (g10 != null) {
                    if (g10 instanceof a1.n0) {
                        a1.n0 n0Var = (a1.n0) g10;
                        Object[] objArr = n0Var.f75b;
                        long[] jArr = n0Var.f74a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                long j2 = jArr[i2];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i10 = 8 - ((~(i2 - length)) >>> 31);
                                    for (int i11 = 0; i11 < i10; i11++) {
                                        if ((255 & j2) < 128) {
                                            v((e0) objArr[(i2 << 3) + i11]);
                                        }
                                        j2 >>= 8;
                                    }
                                    if (i10 != 8) {
                                        break;
                                    }
                                }
                                if (i2 == length) {
                                    break;
                                }
                                i2++;
                            }
                        }
                    } else {
                        v((e0) g10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void B(mc.p pVar) {
        boolean i2 = i();
        q();
        v vVar = this.A;
        if (i2) {
            r rVar = this.p0;
            rVar.f10018z = 100;
            rVar.f10017y = true;
            vVar.a(this, pVar);
            rVar.s();
            return;
        }
        vVar.a(this, pVar);
    }

    public final void a() {
        this.L.set(null);
        this.f10070e0.f10612d.R();
        this.f10071f0.f10612d.R();
        a1.p0 p0Var = this.X;
        if (!p0Var.A.g()) {
            v2.i iVar = this.f10080o0;
            try {
                iVar.g(p0Var, this.p0.z());
                iVar.b();
            } finally {
                iVar.a();
            }
        }
    }

    public final void b(Set set, boolean z10) {
        long j2;
        long j10;
        long j11;
        char c4;
        long[] jArr;
        boolean z11;
        long[] jArr2;
        long j12;
        boolean c10;
        boolean z12;
        long[] jArr3;
        long j13;
        long[] jArr4;
        long[] jArr5;
        int i2;
        long j14;
        boolean z13;
        int i10;
        long j15;
        long[] jArr6;
        long[] jArr7;
        char c11;
        long j16;
        int i11;
        int i12;
        long[] jArr8;
        boolean z14 = set instanceof p2.d;
        a1.m0 m0Var = this.f10069d0;
        Object obj = null;
        int i13 = 8;
        if (z14) {
            a1.n0 n0Var = ((p2.d) set).A;
            Object[] objArr = n0Var.f75b;
            long[] jArr9 = n0Var.f74a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i14 = 0;
                j2 = 128;
                j10 = 255;
                while (true) {
                    long j17 = jArr9[i14];
                    char c12 = 7;
                    j11 = -9187201950435737472L;
                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j17 & 255) < 128) {
                                Object obj2 = objArr[(i14 << 3) + i16];
                                c11 = c12;
                                if (obj2 instanceof p1) {
                                    ((p1) obj2).b(obj);
                                } else {
                                    c(z10, obj2);
                                    Object g10 = m0Var.g(obj2);
                                    if (g10 != null) {
                                        if (g10 instanceof a1.n0) {
                                            a1.n0 n0Var2 = (a1.n0) g10;
                                            Object[] objArr2 = n0Var2.f75b;
                                            long[] jArr10 = n0Var2.f74a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i17 = i13;
                                                i11 = length;
                                                int i18 = 0;
                                                while (true) {
                                                    long j18 = jArr10[i18];
                                                    j16 = j17;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j18) << c11) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                                        int i20 = 0;
                                                        while (i20 < i19) {
                                                            if ((j18 & 255) < 128) {
                                                                jArr8 = jArr9;
                                                                c(z10, (e0) objArr2[(i18 << 3) + i20]);
                                                            } else {
                                                                jArr8 = jArr9;
                                                            }
                                                            j18 >>= i17;
                                                            i20++;
                                                            jArr9 = jArr8;
                                                        }
                                                        jArr7 = jArr9;
                                                        if (i19 != i17) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr7 = jArr9;
                                                    }
                                                    if (i18 == length2) {
                                                        break;
                                                    }
                                                    i18++;
                                                    jArr10 = jArr11;
                                                    j17 = j16;
                                                    jArr9 = jArr7;
                                                    i17 = 8;
                                                }
                                            }
                                        } else {
                                            jArr7 = jArr9;
                                            j16 = j17;
                                            i11 = length;
                                            c(z10, (e0) g10);
                                        }
                                        i12 = 8;
                                    }
                                }
                                jArr7 = jArr9;
                                j16 = j17;
                                i11 = length;
                                i12 = 8;
                            } else {
                                jArr7 = jArr9;
                                c11 = c12;
                                j16 = j17;
                                i11 = length;
                                i12 = i13;
                            }
                            j17 = j16 >> i12;
                            i16++;
                            length = i11;
                            i13 = i12;
                            c12 = c11;
                            jArr9 = jArr7;
                            obj = null;
                        }
                        jArr6 = jArr9;
                        c4 = c12;
                        int i21 = length;
                        if (i15 != i13) {
                            break;
                        }
                        length = i21;
                    } else {
                        jArr6 = jArr9;
                        c4 = 7;
                    }
                    if (i14 == length) {
                        break;
                    }
                    i14++;
                    jArr9 = jArr6;
                    obj = null;
                    i13 = 8;
                }
            } else {
                j2 = 128;
                j10 = 255;
                j11 = -9187201950435737472L;
                c4 = 7;
            }
        } else {
            j2 = 128;
            j10 = 255;
            j11 = -9187201950435737472L;
            c4 = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof p1) {
                    ((p1) obj3).b(null);
                } else {
                    c(z10, obj3);
                    Object g11 = m0Var.g(obj3);
                    if (g11 != null) {
                        if (g11 instanceof a1.n0) {
                            a1.n0 n0Var3 = (a1.n0) g11;
                            Object[] objArr3 = n0Var3.f75b;
                            long[] jArr12 = n0Var3.f74a;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                int i22 = 0;
                                while (true) {
                                    long j19 = jArr12[i22];
                                    if ((((~j19) << 7) & j19 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i23 = 8 - ((~(i22 - length3)) >>> 31);
                                        for (int i24 = 0; i24 < i23; i24++) {
                                            if ((j19 & 255) < 128) {
                                                c(z10, (e0) objArr3[(i22 << 3) + i24]);
                                            }
                                            j19 >>= 8;
                                        }
                                        if (i23 != 8) {
                                            break;
                                        }
                                    }
                                    if (i22 != length3) {
                                        i22++;
                                    }
                                }
                            }
                        } else {
                            c(z10, (e0) g11);
                        }
                    }
                }
            }
        }
        a1.m0 m0Var2 = this.Z;
        a1.n0 n0Var4 = this.f10067b0;
        if (z10) {
            a1.n0 n0Var5 = this.f10068c0;
            if (n0Var5.h()) {
                long[] jArr13 = m0Var2.f67a;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i25 = 0;
                    while (true) {
                        long j20 = jArr13[i25];
                        if ((((~j20) << c4) & j20 & j11) != j11) {
                            int i26 = 8 - ((~(i25 - length4)) >>> 31);
                            int i27 = 0;
                            while (i27 < i26) {
                                if ((j20 & j10) < j2) {
                                    int i28 = (i25 << 3) + i27;
                                    Object obj4 = m0Var2.f68b[i28];
                                    Object obj5 = m0Var2.f69c[i28];
                                    if (obj5 instanceof a1.n0) {
                                        a1.n0 n0Var6 = (a1.n0) obj5;
                                        Object[] objArr4 = n0Var6.f75b;
                                        long[] jArr14 = n0Var6.f74a;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j14 = j20;
                                            int i29 = 0;
                                            while (true) {
                                                long j21 = jArr14[i29];
                                                jArr5 = jArr13;
                                                i2 = length4;
                                                if ((((~j21) << c4) & j21 & j11) != j11) {
                                                    int i30 = 8 - ((~(i29 - length5)) >>> 31);
                                                    for (int i31 = 0; i31 < i30; i31 = i10 + 1) {
                                                        if ((j21 & j10) < j2) {
                                                            i10 = i31;
                                                            int i32 = (i29 << 3) + i10;
                                                            j15 = j21;
                                                            p1 p1Var = (p1) objArr4[i32];
                                                            if (n0Var5.c(p1Var) || n0Var4.c(p1Var)) {
                                                                n0Var6.m(i32);
                                                            }
                                                        } else {
                                                            i10 = i31;
                                                            j15 = j21;
                                                        }
                                                        j21 = j15 >> 8;
                                                    }
                                                    if (i30 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i29 == length5) {
                                                    break;
                                                }
                                                i29++;
                                                length4 = i2;
                                                jArr13 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            i2 = length4;
                                            j14 = j20;
                                        }
                                        z13 = n0Var6.g();
                                    } else {
                                        jArr5 = jArr13;
                                        i2 = length4;
                                        j14 = j20;
                                        obj5.getClass();
                                        p1 p1Var2 = (p1) obj5;
                                        if (!n0Var5.c(p1Var2) && !n0Var4.c(p1Var2)) {
                                            z13 = false;
                                        } else {
                                            z13 = true;
                                        }
                                    }
                                    if (z13) {
                                        m0Var2.l(i28);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    i2 = length4;
                                    j14 = j20;
                                }
                                j20 = j14 >> 8;
                                i27++;
                                length4 = i2;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            int i33 = length4;
                            if (i26 != 8) {
                                break;
                            }
                            length4 = i33;
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i25 == length4) {
                            break;
                        }
                        i25++;
                        jArr13 = jArr4;
                    }
                }
                n0Var5.b();
                h();
                return;
            }
        }
        if (n0Var4.h()) {
            long[] jArr15 = m0Var2.f67a;
            int length6 = jArr15.length - 2;
            if (length6 >= 0) {
                int i34 = 0;
                while (true) {
                    long j22 = jArr15[i34];
                    if ((((~j22) << c4) & j22 & j11) != j11) {
                        int i35 = 8 - ((~(i34 - length6)) >>> 31);
                        int i36 = 0;
                        while (i36 < i35) {
                            if ((j22 & j10) < j2) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                int i37 = (i34 << 3) + i36;
                                Object obj6 = m0Var2.f68b[i37];
                                Object obj7 = m0Var2.f69c[i37];
                                if (obj7 instanceof a1.n0) {
                                    a1.n0 n0Var7 = (a1.n0) obj7;
                                    Object[] objArr5 = n0Var7.f75b;
                                    long[] jArr16 = n0Var7.f74a;
                                    int length7 = jArr16.length - 2;
                                    if (length7 >= 0) {
                                        j12 = j22;
                                        int i38 = 0;
                                        while (true) {
                                            long j23 = jArr16[i38];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr17 = jArr16;
                                            if ((((~j23) << c4) & j23 & j11) != j11) {
                                                int i39 = 8 - ((~(i38 - length7)) >>> 31);
                                                int i40 = 0;
                                                while (i40 < i39) {
                                                    if ((j23 & j10) < j2) {
                                                        z12 = true;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                    if (z12) {
                                                        jArr3 = jArr15;
                                                        int i41 = (i38 << 3) + i40;
                                                        j13 = j23;
                                                        if (n0Var4.c((p1) objArr6[i41])) {
                                                            n0Var7.m(i41);
                                                        }
                                                    } else {
                                                        jArr3 = jArr15;
                                                        j13 = j23;
                                                    }
                                                    i40++;
                                                    jArr15 = jArr3;
                                                    j23 = j13 >> 8;
                                                }
                                                jArr2 = jArr15;
                                                if (i39 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr15;
                                            }
                                            if (i38 == length7) {
                                                break;
                                            }
                                            i38++;
                                            objArr5 = objArr6;
                                            jArr16 = jArr17;
                                            jArr15 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr15;
                                        j12 = j22;
                                    }
                                    c10 = n0Var7.g();
                                } else {
                                    jArr2 = jArr15;
                                    j12 = j22;
                                    obj7.getClass();
                                    c10 = n0Var4.c((p1) obj7);
                                }
                                if (c10) {
                                    m0Var2.l(i37);
                                }
                            } else {
                                jArr2 = jArr15;
                                j12 = j22;
                            }
                            i36++;
                            j22 = j12 >> 8;
                            jArr15 = jArr2;
                        }
                        jArr = jArr15;
                        if (i35 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr15;
                    }
                    if (i34 == length6) {
                        break;
                    }
                    i34++;
                    jArr15 = jArr;
                }
            }
            h();
            n0Var4.b();
        }
    }

    public final void c(boolean z10, Object obj) {
        int i2;
        Object g10 = this.Z.g(obj);
        if (g10 != null) {
            boolean z11 = g10 instanceof a1.n0;
            a1.n0 n0Var = this.f10067b0;
            a1.n0 n0Var2 = this.f10068c0;
            a1.m0 m0Var = this.f10072g0;
            if (z11) {
                a1.n0 n0Var3 = (a1.n0) g10;
                Object[] objArr = n0Var3.f75b;
                long[] jArr = n0Var3.f74a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j2 = jArr[i10];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8;
                            int i12 = 8 - ((~(i10 - length)) >>> 31);
                            int i13 = 0;
                            while (i13 < i12) {
                                if ((255 & j2) < 128) {
                                    p1 p1Var = (p1) objArr[(i10 << 3) + i13];
                                    if (!k0.d.E(m0Var, obj, p1Var)) {
                                        i2 = i11;
                                        if (p1Var.b(obj) != o0.IGNORED) {
                                            if (p1Var.f9986g != null && !z10) {
                                                n0Var2.a(p1Var);
                                            } else {
                                                n0Var.a(p1Var);
                                            }
                                        }
                                        j2 >>= i2;
                                        i13++;
                                        i11 = i2;
                                    }
                                }
                                i2 = i11;
                                j2 >>= i2;
                                i13++;
                                i11 = i2;
                            }
                            if (i12 != i11) {
                                return;
                            }
                        }
                        if (i10 != length) {
                            i10++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                p1 p1Var2 = (p1) g10;
                if (!k0.d.E(m0Var, obj, p1Var2) && p1Var2.b(obj) != o0.IGNORED) {
                    if (p1Var2.f9986g != null && !z10) {
                        n0Var2.a(p1Var2);
                    } else {
                        n0Var.a(p1Var2);
                    }
                }
            }
        }
    }

    public final void d() {
        synchronized (this.R) {
            try {
                e(this.f10070e0);
                o();
            } catch (Throwable th2) {
                try {
                    if (!this.X.A.g()) {
                        v2.i iVar = this.f10080o0;
                        iVar.g(this.X, this.p0.z());
                        iVar.b();
                        iVar.a();
                    }
                    throw th2;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #9 {all -> 0x003e, blocks: (B:3:0x0013, B:17:0x0035, B:19:0x0039, B:26:0x0047, B:28:0x004b, B:32:0x0056, B:46:0x007d, B:48:0x008a, B:24:0x0043), top: B:156:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(o2.a r34) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.y.e(o2.a):void");
    }

    public final void f() {
        synchronized (this.R) {
            try {
                if (this.f10071f0.f10612d.U()) {
                    e(this.f10071f0);
                }
            } catch (Throwable th2) {
                try {
                    if (!this.X.A.g()) {
                        v2.i iVar = this.f10080o0;
                        iVar.g(this.X, this.p0.z());
                        iVar.b();
                        iVar.a();
                    }
                    throw th2;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    public final void g() {
        synchronized (this.R) {
            try {
                this.p0.f10014v = null;
                if (!this.X.A.g()) {
                    v2.i iVar = this.f10080o0;
                    iVar.g(this.X, this.p0.z());
                    iVar.b();
                    iVar.a();
                }
            } catch (Throwable th2) {
                try {
                    if (!this.X.A.g()) {
                        v2.i iVar2 = this.f10080o0;
                        iVar2.g(this.X, this.p0.z());
                        iVar2.b();
                        iVar2.a();
                    }
                    throw th2;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    public final void h() {
        char c4;
        long j2;
        long j10;
        long j11;
        boolean z10;
        boolean z11;
        long[] jArr;
        long[] jArr2;
        int i2;
        long j12;
        char c10;
        long j13;
        long j14;
        int i10;
        boolean z12;
        int i11;
        long j15;
        a1.m0 m0Var = this.f10069d0;
        long[] jArr3 = m0Var.f67a;
        int length = jArr3.length - 2;
        char c11 = 7;
        long j16 = -9187201950435737472L;
        int i12 = 8;
        if (length >= 0) {
            int i13 = 0;
            long j17 = 128;
            while (true) {
                long j18 = jArr3[i13];
                j10 = 255;
                if ((((~j18) << c11) & j18 & j16) != j16) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j18 & 255) < j17) {
                            c10 = c11;
                            int i16 = (i13 << 3) + i15;
                            j13 = j16;
                            Object obj = m0Var.f68b[i16];
                            Object obj2 = m0Var.f69c[i16];
                            boolean z13 = obj2 instanceof a1.n0;
                            a1.m0 m0Var2 = this.Z;
                            if (z13) {
                                a1.n0 n0Var = (a1.n0) obj2;
                                Object[] objArr = n0Var.f75b;
                                long[] jArr4 = n0Var.f74a;
                                j14 = j17;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j12 = j18;
                                    int i17 = i12;
                                    int i18 = 0;
                                    while (true) {
                                        long j19 = jArr4[i18];
                                        jArr2 = jArr3;
                                        i2 = length;
                                        if ((((~j19) << c10) & j19 & j13) != j13) {
                                            int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                            int i20 = 0;
                                            while (i20 < i19) {
                                                if ((j19 & 255) < j14) {
                                                    i11 = i20;
                                                    int i21 = (i18 << 3) + i11;
                                                    j15 = j19;
                                                    if (!m0Var2.c((e0) objArr[i21])) {
                                                        n0Var.m(i21);
                                                    }
                                                } else {
                                                    i11 = i20;
                                                    j15 = j19;
                                                }
                                                j19 = j15 >> i17;
                                                i20 = i11 + 1;
                                            }
                                            if (i19 != i17) {
                                                break;
                                            }
                                        }
                                        if (i18 == length2) {
                                            break;
                                        }
                                        i18++;
                                        jArr3 = jArr2;
                                        length = i2;
                                        i17 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i2 = length;
                                    j12 = j18;
                                }
                                z12 = n0Var.g();
                            } else {
                                jArr2 = jArr3;
                                i2 = length;
                                j12 = j18;
                                j14 = j17;
                                obj2.getClass();
                                if (!m0Var2.c((e0) obj2)) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                            }
                            if (z12) {
                                m0Var.l(i16);
                            }
                            i10 = 8;
                        } else {
                            jArr2 = jArr3;
                            i2 = length;
                            j12 = j18;
                            c10 = c11;
                            j13 = j16;
                            j14 = j17;
                            i10 = i12;
                        }
                        j18 = j12 >> i10;
                        i15++;
                        i12 = i10;
                        c11 = c10;
                        j16 = j13;
                        j17 = j14;
                        jArr3 = jArr2;
                        length = i2;
                    }
                    jArr = jArr3;
                    int i22 = length;
                    c4 = c11;
                    j2 = j16;
                    j11 = j17;
                    if (i14 != i12) {
                        break;
                    }
                    length = i22;
                } else {
                    jArr = jArr3;
                    c4 = c11;
                    j2 = j16;
                    j11 = j17;
                }
                if (i13 == length) {
                    break;
                }
                i13++;
                c11 = c4;
                j16 = j2;
                j17 = j11;
                jArr3 = jArr;
                i12 = 8;
            }
        } else {
            c4 = 7;
            j2 = -9187201950435737472L;
            j10 = 255;
            j11 = 128;
        }
        a1.n0 n0Var2 = this.f10068c0;
        if (n0Var2.h()) {
            Object[] objArr2 = n0Var2.f75b;
            long[] jArr5 = n0Var2.f74a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i23 = 0;
                while (true) {
                    long j20 = jArr5[i23];
                    if ((((~j20) << c4) & j20 & j2) != j2) {
                        int i24 = 8 - ((~(i23 - length3)) >>> 31);
                        for (int i25 = 0; i25 < i24; i25++) {
                            if ((j20 & j10) < j11) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                int i26 = (i23 << 3) + i25;
                                if (((p1) objArr2[i26]).f9986g != null) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (!z11) {
                                    n0Var2.m(i26);
                                }
                            }
                            j20 >>= 8;
                        }
                        if (i24 != 8) {
                            return;
                        }
                    }
                    if (i23 != length3) {
                        i23++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final boolean i() {
        boolean z10;
        synchronized (this.R) {
            z10 = true;
            if (this.f10081q0 != 1) {
                z10 = false;
            }
            if (z10) {
                this.f10081q0 = 0;
            }
        }
        return z10;
    }

    public final void j(mc.p pVar) {
        try {
            synchronized (this.R) {
                n();
                a1.m0 m0Var = this.f10073h0;
                this.f10073h0 = k0.d.q();
                r rVar = this.p0;
                c2 c2Var = this.f10075j0;
                if (!rVar.f9998e.f10612d.T()) {
                    t.a("Expected applyChanges() to have been called");
                }
                rVar.P = c2Var;
                rVar.n(m0Var, pVar);
                rVar.P = null;
            }
        } catch (Throwable th2) {
            try {
                if (!this.X.A.g()) {
                    v2.i iVar = this.f10080o0;
                    iVar.g(this.X, this.p0.z());
                    iVar.b();
                    iVar.a();
                }
                throw th2;
            } catch (Throwable th3) {
                a();
                throw th3;
            }
        }
    }

    public final i1 k(boolean z10, mc.p pVar) {
        if (this.f10076k0 != null) {
            l1.b("A pausable composition is in progress");
        }
        i1 i1Var = new i1(this, this.A, this.p0, this.X, pVar, z10, this.B, this.R);
        this.f10076k0 = i1Var;
        return i1Var;
    }

    public final void l() {
        boolean z10;
        synchronized (this.R) {
            try {
                if (this.f10076k0 != null) {
                    l1.b("Deactivate is not supported while pausable composition is in progress");
                }
                if (this.Y.B > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (!this.X.A.g()) {
                    }
                    this.Z.a();
                    this.f10069d0.a();
                    this.f10073h0.a();
                    this.f10070e0.f10612d.R();
                    this.f10071f0.f10612d.R();
                    r rVar = this.p0;
                    rVar.E.clear();
                    rVar.f10011s.clear();
                    rVar.f9998e.f10612d.R();
                    rVar.f10014v = null;
                    this.f10081q0 = 1;
                }
                Trace.beginSection("Compose:deactivate");
                v2.i iVar = this.f10080o0;
                iVar.g(this.X, this.p0.z());
                if (z10) {
                    h2 d4 = this.Y.d();
                    try {
                        d4.n(d4.f9922t, new ai.r0(18, this.f10080o0, d4));
                        d4.e(true);
                        this.B.h();
                        iVar.c();
                    } catch (Throwable th2) {
                        d4.e(false);
                        throw th2;
                    }
                }
                iVar.b();
                iVar.a();
                Trace.endSection();
                this.Z.a();
                this.f10069d0.a();
                this.f10073h0.a();
                this.f10070e0.f10612d.R();
                this.f10071f0.f10612d.R();
                r rVar2 = this.p0;
                rVar2.E.clear();
                rVar2.f10011s.clear();
                rVar2.f9998e.f10612d.R();
                rVar2.f10014v = null;
                this.f10081q0 = 1;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void m() {
        boolean z10;
        synchronized (this.R) {
            try {
                if (this.p0.F) {
                    l1.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.f10081q0 != 3) {
                    this.f10081q0 = 3;
                    o2.a aVar = this.p0.L;
                    if (aVar != null) {
                        e(aVar);
                    }
                    if (this.Y.B > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 || !this.X.A.g()) {
                        v2.i iVar = this.f10080o0;
                        iVar.g(this.X, this.p0.z());
                        if (z10) {
                            h2 d4 = this.Y.d();
                            d4.n(d4.f9922t, new ai.s0(13, this.f10080o0));
                            d4.H();
                            d4.e(true);
                            this.B.a();
                            this.B.h();
                            iVar.c();
                        }
                        iVar.b();
                        iVar.a();
                    }
                    r rVar = this.p0;
                    rVar.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    rVar.f9995b.u(rVar);
                    rVar.E.clear();
                    rVar.f10011s.clear();
                    rVar.f9998e.f10612d.R();
                    rVar.f10014v = null;
                    rVar.f9994a.a();
                    Trace.endSection();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.A.v(this);
    }

    public final void n() {
        Object obj = s.f10020b;
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
                    t.b("corrupt pendingModifications drain: " + atomicReference);
                    wa.b.a();
                    return;
                }
            }
            t.b("pending composition has not been applied");
            wa.b.a();
        }
    }

    public final void o() {
        AtomicReference atomicReference = this.L;
        Object andSet = atomicReference.getAndSet(null);
        if (!nc.k.a(andSet, s.f10020b)) {
            if (andSet instanceof Set) {
                b((Set) andSet, false);
            } else if (andSet instanceof Object[]) {
                for (Set set : (Set[]) andSet) {
                    b(set, false);
                }
            } else if (andSet == null) {
                if (this.f10076k0 == null) {
                    t.a("calling recordModificationsOf and applyChanges concurrently is not supported");
                }
            } else {
                t.b("corrupt pendingModifications drain: " + atomicReference);
                wa.b.a();
            }
        }
    }

    public final void p() {
        zb.s sVar = zb.s.A;
        AtomicReference atomicReference = this.L;
        Object andSet = atomicReference.getAndSet(sVar);
        if (!nc.k.a(andSet, s.f10020b) && andSet != null) {
            if (andSet instanceof Set) {
                b((Set) andSet, false);
            } else if (andSet instanceof Object[]) {
                for (Set set : (Set[]) andSet) {
                    b(set, false);
                }
            } else {
                t.b("corrupt pendingModifications drain: " + atomicReference);
                wa.b.a();
            }
        }
    }

    public final void q() {
        String str;
        int i2 = this.f10081q0;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
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
            l1.b(str);
        }
        if (this.f10076k0 == null) {
            return;
        }
        l1.b("A pausable composition is in progress");
    }

    public final void r(ArrayList arrayList) {
        a1.p0 p0Var = this.X;
        r rVar = this.p0;
        if (arrayList.size() <= 0) {
            try {
                rVar.getClass();
                rVar.B(arrayList);
                rVar.i();
                return;
            } catch (Throwable th2) {
                try {
                    if (!p0Var.A.g()) {
                        v2.i iVar = this.f10080o0;
                        iVar.g(p0Var, rVar.z());
                        iVar.b();
                        iVar.a();
                    }
                    throw th2;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
        ((v0) ((yb.j) arrayList.get(0)).A).getClass();
        throw null;
    }

    public final o0 s(p1 p1Var, Object obj) {
        y yVar;
        int i2 = p1Var.f9981b;
        if ((i2 & 2) != 0) {
            p1Var.f9981b = i2 | 4;
        }
        a aVar = p1Var.f9982c;
        if (aVar != null && aVar.a()) {
            if (!this.Y.e(aVar)) {
                synchronized (this.R) {
                    yVar = this.f10077l0;
                }
                if (yVar != null) {
                    r rVar = yVar.p0;
                    if (rVar.F && rVar.d0(p1Var, obj)) {
                        return o0.IMMINENT;
                    }
                }
                return o0.IGNORED;
            } else if (p1Var.f9983d != null) {
                o0 u4 = u(p1Var, aVar, obj);
                if (u4 != o0.IGNORED) {
                    this.f10079n0.i();
                }
                return u4;
            } else {
                return o0.IGNORED;
            }
        }
        return o0.IGNORED;
    }

    public final void t() {
        Object[] objArr;
        p1 p1Var;
        y yVar;
        synchronized (this.R) {
            try {
                for (Object obj : this.Y.L) {
                    if (obj instanceof p1) {
                        p1Var = (p1) obj;
                    } else {
                        p1Var = null;
                    }
                    if (p1Var != null && (yVar = p1Var.f9980a) != null) {
                        yVar.s(p1Var, null);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final o0 u(p1 p1Var, a aVar, Object obj) {
        boolean z10;
        int i2;
        synchronized (this.R) {
            try {
                y yVar = this.f10077l0;
                y yVar2 = null;
                if (yVar != null) {
                    e2 e2Var = this.Y;
                    int i10 = this.f10078m0;
                    if (e2Var.Z) {
                        t.a("Writer is active");
                    }
                    if (i10 < 0 || i10 >= e2Var.B) {
                        t.a("Invalid group index");
                    }
                    if (e2Var.e(aVar)) {
                        int i11 = e2Var.A[(i10 * 5) + 3] + i10;
                        int i12 = aVar.f9871a;
                        if (i10 <= i12 && i12 < i11) {
                            yVar2 = yVar;
                        }
                    }
                    yVar = null;
                    yVar2 = yVar;
                }
                if (yVar2 == null) {
                    r rVar = this.p0;
                    if (rVar.F && rVar.d0(p1Var, obj)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        return o0.IMMINENT;
                    } else if (obj == null) {
                        this.f10073h0.m(p1Var, e.Y);
                    } else {
                        boolean z11 = obj instanceof e0;
                        a1.m0 m0Var = this.f10073h0;
                        if (!z11) {
                            m0Var.m(p1Var, e.Y);
                        } else {
                            Object g10 = m0Var.g(p1Var);
                            if (g10 != null) {
                                if (g10 instanceof a1.n0) {
                                    a1.n0 n0Var = (a1.n0) g10;
                                    Object[] objArr = n0Var.f75b;
                                    long[] jArr = n0Var.f74a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i13 = 0;
                                        loop0: while (true) {
                                            long j2 = jArr[i13];
                                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i14 = 8;
                                                int i15 = 8 - ((~(i13 - length)) >>> 31);
                                                int i16 = 0;
                                                while (i16 < i15) {
                                                    if ((j2 & 255) < 128) {
                                                        i2 = i14;
                                                        if (objArr[(i13 << 3) + i16] == e.Y) {
                                                            break loop0;
                                                        }
                                                    } else {
                                                        i2 = i14;
                                                    }
                                                    j2 >>= i2;
                                                    i16++;
                                                    i14 = i2;
                                                }
                                                if (i15 != i14) {
                                                    break;
                                                }
                                            }
                                            if (i13 == length) {
                                                break;
                                            }
                                            i13++;
                                        }
                                    }
                                } else if (g10 == e.Y) {
                                }
                            }
                            k0.d.j(this.f10073h0, p1Var, obj);
                        }
                    }
                }
                if (yVar2 != null) {
                    return yVar2.u(p1Var, aVar, obj);
                }
                this.A.l(this);
                if (this.p0.F) {
                    return o0.DEFERRED;
                }
                return o0.SCHEDULED;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void v(Object obj) {
        Object g10 = this.Z.g(obj);
        if (g10 != null) {
            boolean z10 = g10 instanceof a1.n0;
            a1.m0 m0Var = this.f10072g0;
            if (z10) {
                a1.n0 n0Var = (a1.n0) g10;
                Object[] objArr = n0Var.f75b;
                long[] jArr = n0Var.f74a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j2 = jArr[i2];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((255 & j2) < 128) {
                                    p1 p1Var = (p1) objArr[(i2 << 3) + i11];
                                    if (p1Var.b(obj) == o0.IMMINENT) {
                                        k0.d.j(m0Var, obj, p1Var);
                                    }
                                }
                                j2 >>= 8;
                            }
                            if (i10 != 8) {
                                return;
                            }
                        }
                        if (i2 != length) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                p1 p1Var2 = (p1) g10;
                if (p1Var2.b(obj) == o0.IMMINENT) {
                    k0.d.j(m0Var, obj, p1Var2);
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
    public final boolean w(java.util.Set r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof p2.d
            a1.m0 r3 = r0.f10069d0
            a1.m0 r4 = r0.Z
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L5e
            p2.d r1 = (p2.d) r1
            a1.n0 r1 = r1.A
            java.lang.Object[] r2 = r1.f75b
            long[] r1 = r1.f74a
            int r7 = r1.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7b
            r8 = r5
        L1c:
            r9 = r1[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L59
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r5
        L36:
            if (r13 >= r11) goto L57
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L53
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r2[r14]
            boolean r15 = r4.c(r14)
            if (r15 != 0) goto L52
            boolean r14 = r3.c(r14)
            if (r14 == 0) goto L53
        L52:
            return r6
        L53:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L36
        L57:
            if (r11 != r12) goto L7b
        L59:
            if (r8 == r7) goto L7b
            int r8 = r8 + 1
            goto L1c
        L5e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            boolean r7 = r4.c(r2)
            if (r7 != 0) goto L7a
            boolean r2 = r3.c(r2)
            if (r2 == 0) goto L64
        L7a:
            return r6
        L7b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.y.w(java.util.Set):boolean");
    }

    public final boolean x() {
        synchronized (this.R) {
            i1 i1Var = this.f10076k0;
            boolean z10 = false;
            if (i1Var != null && (i1Var.f9936h.get() != j1.Recomposing || i1Var.f9937i != v2.h.b())) {
                AtomicReference atomicReference = i1Var.f9936h;
                j1 j1Var = j1.ApplyPending;
                j1 j1Var2 = j1.RecomposePending;
                while (!atomicReference.compareAndSet(j1Var, j1Var2) && atomicReference.get() == j1Var) {
                }
                i1Var.f9940l.A.a(9);
                return false;
            }
            n();
            a1.m0 m0Var = this.f10073h0;
            this.f10073h0 = k0.d.q();
            r rVar = this.p0;
            c2 c2Var = this.f10075j0;
            o2.k0 k0Var = rVar.f9998e.f10612d;
            if (!k0Var.T()) {
                t.a("Expected applyChanges() to have been called");
            }
            if (m0Var.f71e > 0 || !rVar.f10011s.isEmpty()) {
                rVar.P = c2Var;
                try {
                    rVar.n(m0Var, null);
                    rVar.P = null;
                    z10 = k0Var.U();
                } catch (Throwable th2) {
                    rVar.P = null;
                    throw th2;
                }
            }
            if (!z10) {
                o();
            }
            return z10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object[]] */
    public final void y(p2.d dVar) {
        p2.d dVar2;
        while (true) {
            Object obj = this.L.get();
            if (obj != null && !obj.equals(s.f10020b)) {
                if (obj instanceof Set) {
                    dVar2 = new Set[]{obj, dVar};
                } else if (obj instanceof Object[]) {
                    Set[] setArr = (Set[]) obj;
                    int length = setArr.length;
                    ?? copyOf = Arrays.copyOf(setArr, length + 1);
                    copyOf[length] = dVar;
                    dVar2 = copyOf;
                } else {
                    fj.j.u(this.L, "corrupt pendingModifications: ");
                    return;
                }
            } else {
                dVar2 = dVar;
            }
            AtomicReference atomicReference = this.L;
            while (!atomicReference.compareAndSet(obj, dVar2)) {
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
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.y.z(java.lang.Object):void");
    }
}
