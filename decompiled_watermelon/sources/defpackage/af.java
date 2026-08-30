package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: af  reason: default package */
/* loaded from: classes.dex */
public final class af implements ua1, View.OnAttachStateChangeListener {
    public final ee A;
    public final i4 B;
    public q03 L;
    public final ArrayList R = new ArrayList();
    public final long X = 100;
    public ve Y = ve.SHOW_ORIGINAL;
    public boolean Z = true;
    public final q60 c0 = n40.f(1, null, null, 6);
    public j14 d0;
    public long e0;
    public final j14 f0;
    public jz5 g0;
    public boolean h0;
    public final m0 i0;

    public af(ee eeVar, i4 i4Var) {
        this.A = eeVar;
        this.B = i4Var;
        new Handler(Looper.getMainLooper());
        j14 j14Var = z23.a;
        j14Var.getClass();
        this.d0 = j14Var;
        this.f0 = new j14();
        this.g0 = new jz5(eeVar.getSemanticsOwner().a(), j14Var);
        this.i0 = new m0(3, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (r8 != r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
        if (defpackage.dk7.q(r7.X, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0082 -> B:17:0x0046). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.k11 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.ye
            if (r0 == 0) goto L13
            r0 = r8
            ye r0 = (defpackage.ye) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ye r0 = new ye
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2c
            i60 r2 = r0.R
            defpackage.me2.a0(r8)
            goto L46
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r7)
            r7 = 0
            return r7
        L33:
            i60 r2 = r0.R
            defpackage.me2.a0(r8)
            goto L51
        L39:
            defpackage.me2.a0(r8)
            q60 r8 = r7.c0
            r8.getClass()
            i60 r2 = new i60
            r2.<init>(r8)
        L46:
            r0.R = r2
            r0.Z = r4
            java.lang.Object r8 = r2.a(r0)
            if (r8 != r1) goto L51
            goto L84
        L51:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L85
            r2.c()
            boolean r8 = r7.e()
            if (r8 == 0) goto L65
            r7.f()
        L65:
            ee r8 = r7.A
            android.os.Handler r8 = r8.getHandler()
            boolean r5 = r7.h0
            if (r5 != 0) goto L78
            if (r8 == 0) goto L78
            r7.h0 = r4
            m0 r5 = r7.i0
            r8.post(r5)
        L78:
            r0.R = r2
            r0.Z = r3
            long r5 = r7.X
            java.lang.Object r8 = defpackage.dk7.q(r5, r0)
            if (r8 != r1) goto L46
        L84:
            return r1
        L85:
            o27 r7 = defpackage.o27.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.af.a(k11):java.lang.Object");
    }

    public final void b(y23 y23Var) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        iz5 iz5Var;
        long j3;
        to toVar;
        to toVar2;
        long j4;
        to toVar3;
        y23 y23Var2 = y23Var;
        int[] iArr3 = y23Var2.b;
        long[] jArr = y23Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j5 = jArr[i3];
                char c2 = 7;
                long j6 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j5 & 255) < 128) {
                            int i7 = iArr3[(i3 << 3) + i6];
                            c = c2;
                            jz5 jz5Var = (jz5) this.f0.b(i7);
                            kz5 kz5Var = (kz5) y23Var2.b(i7);
                            if (kz5Var != null) {
                                iz5Var = kz5Var.a;
                            } else {
                                iz5Var = null;
                            }
                            if (iz5Var != null) {
                                j2 = j6;
                                int i8 = iz5Var.f;
                                d24 d24Var = iz5Var.d.A;
                                if (jz5Var == null) {
                                    Object[] objArr = d24Var.b;
                                    long[] jArr2 = d24Var.a;
                                    int length2 = jArr2.length - 2;
                                    iArr2 = iArr3;
                                    if (length2 >= 0) {
                                        int i9 = i4;
                                        int i10 = 0;
                                        while (true) {
                                            long j7 = jArr2[i10];
                                            j = j5;
                                            if ((((~j7) << c) & j7 & j2) != j2) {
                                                int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                for (int i12 = 0; i12 < i11; i12++) {
                                                    if ((j7 & 255) < 128) {
                                                        j4 = j7;
                                                        qz5 qz5Var = mz5.C;
                                                        if (b53.x((qz5) objArr[(i10 << 3) + i12], qz5Var)) {
                                                            Object g = d24Var.g(qz5Var);
                                                            if (g == null) {
                                                                g = null;
                                                            }
                                                            List list = (List) g;
                                                            if (list != null) {
                                                                toVar3 = (to) tq0.M0(list);
                                                            } else {
                                                                toVar3 = null;
                                                            }
                                                            h(i8, String.valueOf(toVar3));
                                                        }
                                                    } else {
                                                        j4 = j7;
                                                    }
                                                    j7 = j4 >> i9;
                                                }
                                                if (i11 != i9) {
                                                    break;
                                                }
                                            }
                                            if (i10 == length2) {
                                                break;
                                            }
                                            i10++;
                                            j5 = j;
                                            i9 = 8;
                                        }
                                    } else {
                                        j = j5;
                                    }
                                } else {
                                    iArr2 = iArr3;
                                    j = j5;
                                    Object[] objArr2 = d24Var.b;
                                    long[] jArr3 = d24Var.a;
                                    int length3 = jArr3.length - 2;
                                    if (length3 >= 0) {
                                        long[] jArr4 = jArr3;
                                        int i13 = 0;
                                        while (true) {
                                            long j8 = jArr4[i13];
                                            long[] jArr5 = jArr4;
                                            i = i6;
                                            if ((((~j8) << c) & j8 & j2) != j2) {
                                                int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                                int i15 = 0;
                                                while (i15 < i14) {
                                                    if ((j8 & 255) < 128) {
                                                        j3 = j8;
                                                        qz5 qz5Var2 = mz5.C;
                                                        if (b53.x((qz5) objArr2[(i13 << 3) + i15], qz5Var2)) {
                                                            Object g2 = jz5Var.a.A.g(qz5Var2);
                                                            if (g2 == null) {
                                                                g2 = null;
                                                            }
                                                            List list2 = (List) g2;
                                                            if (list2 != null) {
                                                                toVar = (to) tq0.M0(list2);
                                                            } else {
                                                                toVar = null;
                                                            }
                                                            Object g3 = d24Var.g(qz5Var2);
                                                            if (g3 == null) {
                                                                g3 = null;
                                                            }
                                                            List list3 = (List) g3;
                                                            if (list3 != null) {
                                                                toVar2 = (to) tq0.M0(list3);
                                                            } else {
                                                                toVar2 = null;
                                                            }
                                                            if (!b53.x(toVar, toVar2)) {
                                                                h(i8, String.valueOf(toVar2));
                                                            }
                                                        }
                                                    } else {
                                                        j3 = j8;
                                                    }
                                                    i15++;
                                                    j8 = j3 >> 8;
                                                }
                                                if (i14 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i13 == length3) {
                                                break;
                                            }
                                            i13++;
                                            i6 = i;
                                            jArr4 = jArr5;
                                        }
                                        i2 = 8;
                                    }
                                }
                                i = i6;
                                i2 = 8;
                            } else {
                                throw b31.e("no value for specified key");
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            c = c2;
                            j2 = j6;
                            i = i6;
                            i2 = i4;
                        }
                        j5 = j >> i2;
                        i6 = i + 1;
                        i4 = i2;
                        c2 = c;
                        j6 = j2;
                        iArr3 = iArr2;
                        y23Var2 = y23Var;
                    }
                    iArr = iArr3;
                    if (i5 != i4) {
                        return;
                    }
                } else {
                    iArr = iArr3;
                }
                if (i3 != length) {
                    i3++;
                    y23Var2 = y23Var;
                    iArr3 = iArr;
                } else {
                    return;
                }
            }
        }
    }

    public final y23 c() {
        if (this.Z) {
            this.Z = false;
            this.d0 = w81.o(this.A.getSemanticsOwner(), yd.Y);
            this.e0 = System.currentTimeMillis();
        }
        return this.d0;
    }

    public final boolean e() {
        if (this.L != null) {
            return true;
        }
        return false;
    }

    public final void f() {
        q03 q03Var = this.L;
        if (q03Var != null) {
            Object obj = q03Var.L;
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.R;
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        c01 c01Var = (c01) arrayList.get(i);
                        int i2 = xe.a[c01Var.c.ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                AutofillId p = q03Var.p(c01Var.a);
                                if (p != null && Build.VERSION.SDK_INT >= 29) {
                                    fp.k(zc.g(obj), p);
                                }
                            } else {
                                i.c();
                                return;
                            }
                        } else {
                            u57 u57Var = c01Var.d;
                            if (u57Var != null) {
                                ViewStructure viewStructure = (ViewStructure) u57Var.B;
                                if (Build.VERSION.SDK_INT >= 29) {
                                    fp.j(zc.g(obj), viewStructure);
                                }
                            }
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        ContentCaptureSession g = zc.g(obj);
                        s2 u = me2.u((View) q03Var.B);
                        Objects.requireNonNull(u);
                        fp.m(g, rx.b(u.b), new long[]{Long.MIN_VALUE});
                    }
                    arrayList.clear();
                }
            }
        }
    }

    public final void g(iz5 iz5Var, jz5 jz5Var) {
        ze zeVar = new ze(0, jz5Var, this);
        iz5Var.getClass();
        List j = iz5.j(4, iz5Var);
        int size = j.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = j.get(i2);
            if (c().a(((iz5) obj).f)) {
                zeVar.j(Integer.valueOf(i), obj);
                i++;
            }
        }
        List j2 = iz5.j(4, iz5Var);
        int size2 = j2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            iz5 iz5Var2 = (iz5) j2.get(i3);
            y23 c = c();
            int i4 = iz5Var2.f;
            if (c.a(i4)) {
                j14 j14Var = this.f0;
                if (j14Var.a(i4)) {
                    Object b = j14Var.b(i4);
                    if (b != null) {
                        g(iz5Var2, (jz5) b);
                    } else {
                        throw b31.e("node not present in pruned tree before this change");
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public final void h(int i, String str) {
        q03 q03Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && (q03Var = this.L) != null) {
            AutofillId p = q03Var.p(i);
            if (p != null) {
                if (i2 >= 29) {
                    fp.l(zc.g(q03Var.L), p, str);
                    return;
                }
                return;
            }
            throw b31.e("Invalid content capture ID");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0097, code lost:
        if (r8 == null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r19, defpackage.iz5 r20) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.af.i(int, iz5):void");
    }

    public final void j(iz5 iz5Var) {
        if (e()) {
            this.R.add(new c01(iz5Var.f, this.e0, d01.VIEW_DISAPPEAR, null));
            List j = iz5.j(4, iz5Var);
            int size = j.size();
            for (int i = 0; i < size; i++) {
                j((iz5) j.get(i));
            }
        }
    }

    public final void k() {
        j14 j14Var = this.f0;
        j14Var.c();
        y23 c = c();
        int[] iArr = c.b;
        Object[] objArr = c.c;
        long[] jArr = c.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            j14Var.i(iArr[i4], new jz5(((kz5) objArr[i4]).a, c()));
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
        this.g0 = new jz5(this.A.getSemanticsOwner().a(), c());
    }

    @Override // defpackage.ua1
    public final void onStart(fn3 fn3Var) {
        this.L = (q03) this.B.c();
        i(-1, this.A.getSemanticsOwner().a());
        f();
    }

    @Override // defpackage.ua1
    public final void onStop(fn3 fn3Var) {
        j(this.A.getSemanticsOwner().a());
        f();
        this.L = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.A.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.i0);
        this.L = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
