package d3;

import a1.l;
import a1.m0;
import a4.p1;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import b4.o;
import b4.q2;
import b4.x;
import bd.h;
import c8.d0;
import d2.m;
import i4.p;
import i4.q;
import i4.s;
import i4.t;
import i4.w;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import nc.k;
import q8.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements androidx.lifecycle.f, View.OnAttachStateChangeListener {
    public final x A;
    public final o B;
    public m L;
    public final ArrayList R = new ArrayList();
    public final long X = 100;
    public a Y = a.SHOW_ORIGINAL;
    public boolean Z = true;

    /* renamed from: b0  reason: collision with root package name */
    public final h f3797b0 = ij.a.s(1, 6, null);

    /* renamed from: c0  reason: collision with root package name */
    public final Handler f3798c0 = new Handler(Looper.getMainLooper());

    /* renamed from: d0  reason: collision with root package name */
    public a1.x f3799d0;

    /* renamed from: e0  reason: collision with root package name */
    public long f3800e0;

    /* renamed from: f0  reason: collision with root package name */
    public final a1.x f3801f0;

    /* renamed from: g0  reason: collision with root package name */
    public q2 f3802g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f3803h0;

    /* renamed from: i0  reason: collision with root package name */
    public final a8.f f3804i0;

    public e(x xVar, o oVar) {
        this.A = xVar;
        this.B = oVar;
        a1.x xVar2 = a1.m.f66a;
        xVar2.getClass();
        this.f3799d0 = xVar2;
        this.f3801f0 = new a1.x();
        this.f3802g0 = new q2(xVar.getSemanticsOwner().a(), xVar2);
        this.f3804i0 = new a8.f(10, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (r8 != r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
        if (zc.x.h(r7.X, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007c -> B:17:0x0046). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ec.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof d3.c
            if (r0 == 0) goto L13
            r0 = r8
            d3.c r0 = (d3.c) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            d3.c r0 = new d3.c
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2c
            bd.c r2 = r0.R
            p7.j.I(r8)
            goto L46
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r8)
            r8 = 0
            return r8
        L33:
            bd.c r2 = r0.R
            p7.j.I(r8)
            goto L51
        L39:
            p7.j.I(r8)
            bd.h r8 = r7.f3797b0
            r8.getClass()
            bd.c r2 = new bd.c
            r2.<init>(r8)
        L46:
            r0.R = r2
            r0.Z = r4
            java.lang.Object r8 = r2.a(r0)
            if (r8 != r1) goto L51
            goto L7e
        L51:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7f
            r2.c()
            boolean r8 = r7.e()
            if (r8 == 0) goto L65
            r7.f()
        L65:
            boolean r8 = r7.f3803h0
            if (r8 != 0) goto L72
            r7.f3803h0 = r4
            android.os.Handler r8 = r7.f3798c0
            a8.f r5 = r7.f3804i0
            r8.post(r5)
        L72:
            r0.R = r2
            r0.Z = r3
            long r5 = r7.X
            java.lang.Object r8 = zc.x.h(r5, r0)
            if (r8 != r1) goto L46
        L7e:
            return r1
        L7f:
            yb.y r8 = yb.y.f14813a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.e.a(ec.c):java.lang.Object");
    }

    public final void b(l lVar) {
        int[] iArr;
        int[] iArr2;
        long j2;
        char c4;
        long j10;
        int i2;
        int i10;
        p pVar;
        long j11;
        l4.h hVar;
        l4.h hVar2;
        long j12;
        l4.h hVar3;
        l lVar2 = lVar;
        int[] iArr3 = lVar2.f62b;
        long[] jArr = lVar2.f61a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j13 = jArr[i11];
                char c10 = 7;
                long j14 = -9187201950435737472L;
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j13 & 255) < 128) {
                            int i15 = iArr3[(i11 << 3) + i14];
                            c4 = c10;
                            q2 q2Var = (q2) this.f3801f0.b(i15);
                            q qVar = (q) lVar2.b(i15);
                            if (qVar != null) {
                                pVar = qVar.f6774a;
                            } else {
                                pVar = null;
                            }
                            if (pVar != null) {
                                j10 = j14;
                                int i16 = pVar.f6773g;
                                m0 m0Var = pVar.f6770d.A;
                                if (q2Var == null) {
                                    Object[] objArr = m0Var.f68b;
                                    long[] jArr2 = m0Var.f67a;
                                    int length2 = jArr2.length - 2;
                                    iArr2 = iArr3;
                                    if (length2 >= 0) {
                                        int i17 = i12;
                                        int i18 = 0;
                                        while (true) {
                                            long j15 = jArr2[i18];
                                            j2 = j13;
                                            if ((((~j15) << c4) & j15 & j10) != j10) {
                                                int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                                for (int i20 = 0; i20 < i19; i20++) {
                                                    if ((j15 & 255) < 128) {
                                                        j12 = j15;
                                                        w wVar = t.B;
                                                        if (k.a((w) objArr[(i18 << 3) + i20], wVar)) {
                                                            Object g10 = m0Var.g(wVar);
                                                            if (g10 == null) {
                                                                g10 = null;
                                                            }
                                                            List list = (List) g10;
                                                            if (list != null) {
                                                                hVar3 = (l4.h) zb.l.T(list);
                                                            } else {
                                                                hVar3 = null;
                                                            }
                                                            h(i16, String.valueOf(hVar3));
                                                        }
                                                    } else {
                                                        j12 = j15;
                                                    }
                                                    j15 = j12 >> i17;
                                                }
                                                if (i19 != i17) {
                                                    break;
                                                }
                                            }
                                            if (i18 == length2) {
                                                break;
                                            }
                                            i18++;
                                            j13 = j2;
                                            i17 = 8;
                                        }
                                    } else {
                                        j2 = j13;
                                    }
                                } else {
                                    iArr2 = iArr3;
                                    j2 = j13;
                                    Object[] objArr2 = m0Var.f68b;
                                    long[] jArr3 = m0Var.f67a;
                                    int length3 = jArr3.length - 2;
                                    if (length3 >= 0) {
                                        long[] jArr4 = jArr3;
                                        int i21 = 0;
                                        while (true) {
                                            long j16 = jArr4[i21];
                                            long[] jArr5 = jArr4;
                                            i2 = i14;
                                            if ((((~j16) << c4) & j16 & j10) != j10) {
                                                int i22 = 8 - ((~(i21 - length3)) >>> 31);
                                                int i23 = 0;
                                                while (i23 < i22) {
                                                    if ((j16 & 255) < 128) {
                                                        j11 = j16;
                                                        w wVar2 = t.B;
                                                        if (k.a((w) objArr2[(i21 << 3) + i23], wVar2)) {
                                                            Object g11 = q2Var.f1934a.A.g(wVar2);
                                                            if (g11 == null) {
                                                                g11 = null;
                                                            }
                                                            List list2 = (List) g11;
                                                            if (list2 != null) {
                                                                hVar = (l4.h) zb.l.T(list2);
                                                            } else {
                                                                hVar = null;
                                                            }
                                                            Object g12 = m0Var.g(wVar2);
                                                            if (g12 == null) {
                                                                g12 = null;
                                                            }
                                                            List list3 = (List) g12;
                                                            if (list3 != null) {
                                                                hVar2 = (l4.h) zb.l.T(list3);
                                                            } else {
                                                                hVar2 = null;
                                                            }
                                                            if (!k.a(hVar, hVar2)) {
                                                                h(i16, String.valueOf(hVar2));
                                                            }
                                                        }
                                                    } else {
                                                        j11 = j16;
                                                    }
                                                    i23++;
                                                    j16 = j11 >> 8;
                                                }
                                                if (i22 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i21 == length3) {
                                                break;
                                            }
                                            i21++;
                                            i14 = i2;
                                            jArr4 = jArr5;
                                        }
                                        i10 = 8;
                                    }
                                }
                                i2 = i14;
                                i10 = 8;
                            } else {
                                throw w.d.g("no value for specified key");
                            }
                        } else {
                            iArr2 = iArr3;
                            j2 = j13;
                            c4 = c10;
                            j10 = j14;
                            i2 = i14;
                            i10 = i12;
                        }
                        j13 = j2 >> i10;
                        i14 = i2 + 1;
                        i12 = i10;
                        c10 = c4;
                        j14 = j10;
                        iArr3 = iArr2;
                        lVar2 = lVar;
                    }
                    iArr = iArr3;
                    if (i13 != i12) {
                        return;
                    }
                } else {
                    iArr = iArr3;
                }
                if (i11 != length) {
                    i11++;
                    lVar2 = lVar;
                    iArr3 = iArr;
                } else {
                    return;
                }
            }
        }
    }

    public final l c() {
        if (this.Z) {
            this.Z = false;
            this.f3799d0 = s.b(this.A.getSemanticsOwner(), d.B);
            this.f3800e0 = System.currentTimeMillis();
        }
        return this.f3799d0;
    }

    public final boolean e() {
        if (this.L != null) {
            return true;
        }
        return false;
    }

    public final void f() {
        m mVar = this.L;
        if (mVar != null) {
            Object obj = mVar.f3746a;
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.R;
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        f fVar = (f) arrayList.get(i2);
                        int i10 = b.f3796a[fVar.f3807c.ordinal()];
                        if (i10 != 1) {
                            if (i10 == 2) {
                                AutofillId b10 = mVar.b(fVar.f3805a);
                                if (b10 != null && Build.VERSION.SDK_INT >= 29) {
                                    d0.f(e4.a.g(obj), b10);
                                }
                            } else {
                                m9.o.o();
                                return;
                            }
                        } else {
                            d2.t tVar = fVar.f3808d;
                            if (tVar != null) {
                                ViewStructure viewStructure = (ViewStructure) tVar.B;
                                if (Build.VERSION.SDK_INT >= 29) {
                                    d0.e(e4.a.g(obj), viewStructure);
                                }
                            }
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        ContentCaptureSession g10 = e4.a.g(obj);
                        b6.f B = r.B(mVar.f3747b);
                        Objects.requireNonNull(B);
                        d0.h(g10, c3.p.i(B.f2075b), new long[]{Long.MIN_VALUE});
                    }
                    arrayList.clear();
                }
            }
        }
    }

    public final void g(p pVar, q2 q2Var) {
        p1 p1Var = new p1(3, q2Var, this);
        pVar.getClass();
        List j2 = p.j(4, pVar);
        int size = j2.size();
        int i2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = j2.get(i10);
            if (c().a(((p) obj).f6773g)) {
                p1Var.j(Integer.valueOf(i2), obj);
                i2++;
            }
        }
        List j10 = p.j(4, pVar);
        int size2 = j10.size();
        for (int i11 = 0; i11 < size2; i11++) {
            p pVar2 = (p) j10.get(i11);
            l c4 = c();
            int i12 = pVar2.f6773g;
            if (c4.a(i12)) {
                a1.x xVar = this.f3801f0;
                if (xVar.a(i12)) {
                    Object b10 = xVar.b(i12);
                    if (b10 != null) {
                        g(pVar2, (q2) b10);
                    } else {
                        throw w.d.g("node not present in pruned tree before this change");
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public final void h(int i2, String str) {
        m mVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29 && (mVar = this.L) != null) {
            AutofillId b10 = mVar.b(i2);
            if (b10 != null) {
                if (i10 >= 29) {
                    d0.g(e4.a.g(mVar.f3746a), b10, str);
                    return;
                }
                return;
            }
            throw w.d.g("Invalid content capture ID");
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
    public final void i(int r19, i4.p r20) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.e.i(int, i4.p):void");
    }

    public final void j(p pVar) {
        if (e()) {
            this.R.add(new f(pVar.f6773g, this.f3800e0, g.VIEW_DISAPPEAR, null));
            List j2 = p.j(4, pVar);
            int size = j2.size();
            for (int i2 = 0; i2 < size; i2++) {
                j((p) j2.get(i2));
            }
        }
    }

    public final void k() {
        a1.x xVar = this.f3801f0;
        xVar.c();
        l c4 = c();
        int[] iArr = c4.f62b;
        Object[] objArr = c4.f63c;
        long[] jArr = c4.f61a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j2) < 128) {
                            int i12 = (i2 << 3) + i11;
                            xVar.i(iArr[i12], new q2(((q) objArr[i12]).f6774a, c()));
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
        this.f3802g0 = new q2(this.A.getSemanticsOwner().a(), c());
    }

    @Override // androidx.lifecycle.f
    public final void onStart(androidx.lifecycle.x xVar) {
        this.L = (m) this.B.b();
        i(-1, this.A.getSemanticsOwner().a());
        f();
    }

    @Override // androidx.lifecycle.f
    public final void onStop(androidx.lifecycle.x xVar) {
        j(this.A.getSemanticsOwner().a());
        f();
        this.L = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f3798c0.removeCallbacks(this.f3804i0);
        this.L = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
