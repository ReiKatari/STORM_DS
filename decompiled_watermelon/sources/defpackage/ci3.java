package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import me.magnum.melonds.ui.emulator.render.FrameRenderCallback;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ci3  reason: default package */
/* loaded from: classes.dex */
public final class ci3 implements bi6, f90, kh0, FrameRenderCallback, af4, vr4, u54, jh6, du5, oj2 {
    public final /* synthetic */ int A;
    public Object B;
    public Object L;

    public ci3(int i) {
        this.A = i;
        switch (i) {
            case 5:
                this.B = new d24();
                this.L = new d24();
                return;
            case 7:
                this.B = new o24(new vf3[16]);
                return;
            case 20:
                this.B = new LinkedHashMap();
                this.L = new LinkedHashMap();
                return;
            case 24:
                this.B = (ImageCaptureFailedForSpecificCombinationQuirk) ne1.a.b(ImageCaptureFailedForSpecificCombinationQuirk.class);
                this.L = (PreviewGreenTintQuirk) ne1.a.b(PreviewGreenTintQuirk.class);
                return;
            default:
                bz6 bz6Var = dt3.g0;
                Float valueOf = Float.valueOf((float) RecyclerView.A1);
                this.L = new io(bz6Var, valueOf, (oo) bz6Var.a.n(valueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
                return;
        }
    }

    public static void s(vf3 vf3Var) {
        if (vf3Var.I0 > 0) {
            if (vf3Var.B0.d == rf3.Idle && !vf3Var.p() && !vf3Var.q() && !vf3Var.J0 && vf3Var.I()) {
                yy3 yy3Var = (yy3) vf3Var.A0.g;
                if ((yy3Var.R & 256) != 0) {
                    while (yy3Var != null) {
                        if ((yy3Var.L & 256) != 0) {
                            yy3 yy3Var2 = yy3Var;
                            o24 o24Var = null;
                            while (yy3Var2 != null) {
                                if (yy3Var2 instanceof fm2) {
                                    fm2 fm2Var = (fm2) yy3Var2;
                                    fm2Var.y(l.N(fm2Var, 256));
                                } else if ((yy3Var2.L & 256) != 0 && (yy3Var2 instanceof xc1)) {
                                    int i = 0;
                                    for (yy3 yy3Var3 = ((xc1) yy3Var2).k0; yy3Var3 != null; yy3Var3 = yy3Var3.Y) {
                                        if ((yy3Var3.L & 256) != 0) {
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
                        }
                        if ((yy3Var.R & 256) == 0) {
                            break;
                        }
                        yy3Var = yy3Var.Y;
                    }
                }
            }
            vf3Var.H0 = false;
            o24 y = vf3Var.y();
            Object[] objArr = y.A;
            int i2 = y.L;
            for (int i3 = 0; i3 < i2; i3++) {
                s((vf3) objArr[i3]);
            }
        }
    }

    public static m12 u(vw2 vw2Var, Throwable th) {
        Drawable drawable;
        if (th instanceof m84) {
            vw2Var.getClass();
            ab1 ab1Var = vw2Var.B;
            drawable = ab1Var.l;
            ab1 ab1Var2 = h.a;
            if (drawable == null) {
                drawable = ab1Var.k;
            }
        } else {
            drawable = vw2Var.B.k;
            ab1 ab1Var3 = h.a;
        }
        return new m12(drawable, vw2Var, th);
    }

    public td6 A(gh7 gh7Var) {
        td6 m;
        synchronized (this.L) {
            m = ((e81) this.B).m(gh7Var);
        }
        return m;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.df4 B(defpackage.df4 r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            android.graphics.Bitmap$Config r2 = r1.b
            j80 r3 = r1.o
            boolean r4 = defpackage.l.H(r2)
            r5 = 1
            if (r4 == 0) goto L1f
            java.lang.Object r4 = r0.L
            jq2 r4 = (defpackage.jq2) r4
            boolean r4 = r4.d()
            if (r4 == 0) goto L1a
            goto L1f
        L1a:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            r4 = r5
        L1d:
            r8 = r2
            goto L21
        L1f:
            r4 = 0
            goto L1d
        L21:
            j80 r2 = r1.o
            boolean r2 = r2.getReadEnabled()
            if (r2 == 0) goto L3f
            java.lang.Object r0 = r0.B
            r2 = r0
            nl6 r2 = (defpackage.nl6) r2
            monitor-enter(r2)
            r2.a()     // Catch: java.lang.Throwable -> L3c
            boolean r0 = r2.X     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)
            if (r0 != 0) goto L3f
            j80 r3 = defpackage.j80.DISABLED
        L39:
            r21 = r3
            goto L41
        L3c:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r0
        L3f:
            r5 = r4
            goto L39
        L41:
            if (r5 == 0) goto L6d
            android.content.Context r7 = r1.a
            android.graphics.ColorSpace r9 = r1.c
            h76 r10 = r1.d
            uu5 r11 = r1.e
            boolean r12 = r1.f
            boolean r13 = r1.g
            boolean r14 = r1.h
            java.lang.String r15 = r1.i
            xq2 r0 = r1.j
            jm6 r2 = r1.k
            nj4 r3 = r1.l
            j80 r4 = r1.m
            j80 r1 = r1.n
            df4 r6 = new df4
            r16 = r0
            r20 = r1
            r17 = r2
            r18 = r3
            r19 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r6
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci3.B(df4):df4");
    }

    public void C(float f, od1 od1Var, o31 o31Var) {
        mi2 mi2Var;
        if (f <= od1Var.C(1.0f)) {
            return;
        }
        ga6 z = io2.z();
        if (z != null) {
            mi2Var = z.e();
        } else {
            mi2Var = null;
        }
        ga6 Y = io2.Y(z);
        try {
            float floatValue = ((Number) ((io) this.L).B.getValue()).floatValue();
            kd6 kd6Var = (kd6) this.B;
            if (kd6Var != null) {
                kd6Var.i(null);
            }
            io ioVar = (io) this.L;
            if (ioVar.Y) {
                this.L = dt3.Z(ioVar, floatValue - f, RecyclerView.A1, 30);
            } else {
                this.L = new io(dt3.g0, Float.valueOf(-f), null, 60);
            }
            this.B = tq5.w(o31Var, null, null, new a6(this, null, 26), 3);
            io2.l0(z, Y, mi2Var);
        } catch (Throwable th) {
            io2.l0(z, Y, mi2Var);
            throw th;
        }
    }

    @Override // defpackage.jh6
    public pw3 a(ow3 ow3Var) {
        j55 j55Var = (j55) ((cx0) this.L).h(ow3Var);
        if (j55Var != null) {
            return new pw3(j55Var.a, j55Var.b);
        }
        return null;
    }

    @Override // defpackage.jh6
    public void b(int i) {
        int i2;
        cx0 cx0Var = (cx0) this.L;
        if (i >= 40) {
            cx0Var.p(-1);
        } else if (10 <= i && i < 20) {
            synchronized (((so1) cx0Var.g)) {
                i2 = cx0Var.c;
            }
            cx0Var.p(i2 / 2);
        }
    }

    @Override // defpackage.vr4
    public void c(Preference preference) {
        ((PreferenceGroup) this.B).Y = Preference.DEFAULT_ORDER;
        rs4 rs4Var = (rs4) this.L;
        Handler handler = rs4Var.h;
        es4 es4Var = rs4Var.i;
        handler.removeCallbacks(es4Var);
        handler.post(es4Var);
    }

    @Override // defpackage.kh0
    public void cancel() {
        if (!((dw) this.L).compareAndSet(1, 1)) {
            ((t6) this.B).c();
        }
    }

    @Override // defpackage.f90
    public void d(w45 w45Var, ec5 ec5Var) {
        e90 e90Var = (e90) this.B;
        xb4 xb4Var = (xb4) this.L;
        try {
            try {
                e90Var.f(xb4Var, xb4Var.c(ec5Var));
            } catch (Throwable th) {
                ct3.U0(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            ct3.U0(th2);
            try {
                e90Var.b(xb4Var, th2);
            } catch (Throwable th3) {
                ct3.U0(th3);
                th3.printStackTrace();
            }
        }
    }

    @Override // defpackage.jh6
    public void e(ow3 ow3Var, Bitmap bitmap, Map map) {
        int i;
        int D = l.D(bitmap);
        cx0 cx0Var = (cx0) this.L;
        synchronized (((so1) cx0Var.g)) {
            i = cx0Var.b;
        }
        cx0 cx0Var2 = (cx0) this.L;
        if (D <= i) {
            cx0Var2.l(ow3Var, new j55(bitmap, map, D));
            return;
        }
        cx0Var2.m(ow3Var);
        ((ud7) this.B).h(ow3Var, bitmap, map, D);
    }

    @Override // defpackage.bi6
    public void f(ai6 ai6Var) {
        int i;
        s14 s14Var = (s14) this.L;
        s14Var.a();
        y14 y14Var = (y14) ai6Var.B;
        Object[] objArr = y14Var.b;
        long[] jArr = y14Var.c;
        int i2 = y14Var.e;
        while (i2 != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i2] >> 31) & 2147483647L);
            Object obj = objArr[i2];
            Object b = ((dj3) this.B).b(obj);
            int d = s14Var.d(b);
            if (d >= 0) {
                i = s14Var.c[d];
            } else {
                i = 0;
            }
            if (i == 7) {
                ai6Var.remove(obj);
            } else {
                s14Var.g(i + 1, b);
            }
            i2 = i3;
        }
    }

    @Override // defpackage.af4
    public List g(Integer num) {
        List g = ((af4) this.B).g(null);
        z86 z86Var = (z86) this.L;
        int i = z86Var.v;
        if (i < 0) {
            return g;
        }
        return tq0.X0(jv3.l(z86Var, num, i, Integer.valueOf(z86Var.E(z86Var.b, i))), g);
    }

    @Override // defpackage.oj2
    public void h(Throwable th) {
        switch (this.A) {
            case 26:
                int i = ((wj6) this.B).f;
                if (i == 2 && (th instanceof CancellationException)) {
                    ve2.v("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                    return;
                } else {
                    ve2.d0("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: ".concat(oo2.I(i)), th);
                    return;
                }
            case 27:
                if (th instanceof gk6) {
                    nl2.D(null, ((l90) this.L).cancel(false));
                    return;
                } else {
                    nl2.D(null, ((i90) this.B).a(null));
                    return;
                }
            default:
                nl2.D("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof gk6);
                ((wz0) this.B).accept(new mx(1, (Surface) this.L));
                return;
        }
    }

    @Override // defpackage.du5
    public Object i(Object obj) {
        return ((mi2) this.L).n(obj);
    }

    @Override // defpackage.af4
    public boolean j() {
        return ((af4) this.B).j();
    }

    @Override // defpackage.u54
    public long j0(long j, long j2, int i) {
        if (i == 1) {
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) > RecyclerView.A1) {
                return (Float.floatToRawIntBits(((Number) ((z) this.B).n(Float.valueOf(Float.intBitsToFloat(i2)))).floatValue()) & 4294967295L) | (Float.floatToRawIntBits(RecyclerView.A1) << 32);
            }
            return 0L;
        }
        return 0L;
    }

    @Override // defpackage.f90
    public void k(w45 w45Var, IOException iOException) {
        try {
            ((e90) this.B).b((xb4) this.L, iOException);
        } catch (Throwable th) {
            ct3.U0(th);
            th.printStackTrace();
        }
    }

    @Override // defpackage.oj2
    public void l(Object obj) {
        switch (this.A) {
            case 26:
                ck6 ck6Var = (ck6) obj;
                ck6Var.getClass();
                ((sb1) ((n85) this.L).B).b(ck6Var);
                return;
            case 27:
                Void r3 = (Void) obj;
                nl2.D(null, ((i90) this.B).a(null));
                return;
            default:
                Void r32 = (Void) obj;
                ((wz0) this.B).accept(new mx(0, (Surface) this.L));
                return;
        }
    }

    @Override // defpackage.bi6
    public boolean m(Object obj, Object obj2) {
        dj3 dj3Var = (dj3) this.B;
        return b53.x(dj3Var.b(obj), dj3Var.b(obj2));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    @Override // defpackage.u54
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m0(long r5, defpackage.j11 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.cx4
            if (r0 == 0) goto L13
            r0 = r7
            cx4 r0 = (defpackage.cx4) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L1a
        L13:
            cx4 r0 = new cx4
            k11 r7 = (defpackage.k11) r7
            r0.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            defpackage.me2.a0(r7)
            goto L49
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            r4 = 0
            return r4
        L30:
            defpackage.me2.a0(r7)
            java.lang.Object r4 = r4.L
            dt0 r4 = (defpackage.dt0) r4
            float r5 = defpackage.p77.c(r5)
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            r0.Y = r3
            java.lang.Object r7 = r4.j(r6, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            java.lang.Number r7 = (java.lang.Number) r7
            float r4 = r7.floatValue()
            r5 = 0
            long r4 = defpackage.nl2.n(r5, r4)
            p77 r6 = new p77
            r6.<init>(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci3.m0(long, j11):java.lang.Object");
    }

    @Override // defpackage.du5
    public Object n(it5 it5Var, Object obj) {
        return ((aj2) this.B).j(it5Var, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0495, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0603, code lost:
        if (r1 == defpackage.i97.PREVIEW) goto L301;
     */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0720  */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.bg6 o(int r31, defpackage.td0 r32, java.util.ArrayList r33, java.util.ArrayList r34, defpackage.fc0 r35, android.util.Range r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 1914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci3.o(int, td0, java.util.ArrayList, java.util.ArrayList, fc0, android.util.Range, boolean):bg6");
    }

    public void p() {
        int[] iArr = (int[]) this.B;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.L = null;
    }

    public boolean q(gh7 gh7Var) {
        boolean containsKey;
        synchronized (this.L) {
            containsKey = ((e81) this.B).b.containsKey(gh7Var);
        }
        return containsKey;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r3 < r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.B
            o24 r0 = (defpackage.o24) r0
            hd2 r1 = defpackage.hd2.d
            java.lang.Object[] r2 = r0.A
            int r3 = r0.L
            r4 = 0
            java.util.Arrays.sort(r2, r4, r3, r1)
            int r1 = r0.L
            java.lang.Object r2 = r6.L
            vf3[] r2 = (defpackage.vf3[]) r2
            if (r2 == 0) goto L19
            int r3 = r2.length
            if (r3 >= r1) goto L21
        L19:
            r2 = 16
            int r2 = java.lang.Math.max(r2, r1)
            vf3[] r2 = new defpackage.vf3[r2]
        L21:
            r3 = 0
            r6.L = r3
        L24:
            if (r4 >= r1) goto L2f
            java.lang.Object[] r5 = r0.A
            r5 = r5[r4]
            r2[r4] = r5
            int r4 = r4 + 1
            goto L24
        L2f:
            r0.h()
            int r1 = r1 + (-1)
        L34:
            r0 = -1
            if (r0 >= r1) goto L48
            r0 = r2[r1]
            r0.getClass()
            boolean r4 = r0.H0
            if (r4 == 0) goto L43
            s(r0)
        L43:
            r2[r1] = r3
            int r1 = r1 + (-1)
            goto L34
        L48:
            r6.L = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci3.r():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (r9.a(r10) == false) goto L11;
     */
    @Override // me.magnum.melonds.ui.emulator.render.FrameRenderCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void renderFrame(boolean r17, int r18) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci3.renderFrame(boolean, int):void");
    }

    public void t(int i) {
        int[] iArr = (int[]) this.B;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.B = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.B = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.B;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public String toString() {
        switch (this.A) {
            case 14:
                String str = "[ ";
                if (((ob6) this.B) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder r = wh1.r(str);
                        r.append(((ob6) this.B).c0[i]);
                        r.append(" ");
                        str = r.toString();
                    }
                }
                StringBuilder t = b31.t(str, "] ");
                t.append((ob6) this.B);
                return t.toString();
            default:
                return super.toString();
        }
    }

    public void v(int i, int i2) {
        int[] iArr = (int[]) this.B;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            t(i3);
            int[] iArr2 = (int[]) this.B;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill((int[]) this.B, i, i3, -1);
            ArrayList arrayList = (ArrayList) this.L;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    hd6 hd6Var = (hd6) ((ArrayList) this.L).get(size);
                    int i4 = hd6Var.A;
                    if (i4 >= i) {
                        hd6Var.A = i4 + i2;
                    }
                }
            }
        }
    }

    public void w(int i, int i2) {
        int[] iArr = (int[]) this.B;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            t(i3);
            int[] iArr2 = (int[]) this.B;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = (int[]) this.B;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            ArrayList arrayList = (ArrayList) this.L;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    hd6 hd6Var = (hd6) ((ArrayList) this.L).get(size);
                    int i4 = hd6Var.A;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            ((ArrayList) this.L).remove(size);
                        } else {
                            hd6Var.A = i4 - i2;
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.u54
    public long w0(int i, long j) {
        if (i == 1) {
            int i2 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i2) < RecyclerView.A1) {
                return (Float.floatToRawIntBits(RecyclerView.A1) << 32) | (Float.floatToRawIntBits(((Number) ((z) this.B).n(Float.valueOf(Float.intBitsToFloat(i2)))).floatValue()) & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    public df4 x(vw2 vw2Var, h76 h76Var) {
        uu5 uu5Var;
        boolean z;
        List list = vw2Var.h;
        Bitmap.Config config = vw2Var.f;
        if ((!list.isEmpty() && !nu.a0(k.a, config)) || (l.H(config) && ((l.H(config) && !vw2Var.m) || !((jq2) this.L).e(h76Var)))) {
            config = Bitmap.Config.ARGB_8888;
        }
        ct3 ct3Var = h76Var.a;
        mf1 mf1Var = mf1.o0;
        if (!ct3Var.equals(mf1Var) && !h76Var.b.equals(mf1Var)) {
            uu5Var = vw2Var.y;
        } else {
            uu5Var = uu5.FIT;
        }
        uu5 uu5Var2 = uu5Var;
        if (vw2Var.n && vw2Var.h.isEmpty() && config != Bitmap.Config.ALPHA_8) {
            z = true;
        } else {
            z = false;
        }
        return new df4(vw2Var.a, config, null, h76Var, uu5Var2, h.a(vw2Var), z, vw2Var.o, null, vw2Var.j, vw2Var.k, vw2Var.z, vw2Var.p, vw2Var.q, vw2Var.r);
    }

    public td6 y(gh7 gh7Var) {
        td6 k;
        gh7Var.getClass();
        synchronized (this.L) {
            k = ((e81) this.B).k(gh7Var);
        }
        return k;
    }

    public void z() {
        kd6 kd6Var = (kd6) this.B;
        if (kd6Var != null) {
            kd6Var.i(null);
        }
        this.L = new io(dt3.g0, Float.valueOf((float) RecyclerView.A1), null, 60);
    }

    public /* synthetic */ ci3(int i, Object obj, Object obj2, boolean z) {
        this.A = i;
        this.L = obj;
        this.B = obj2;
    }

    public /* synthetic */ ci3(int i, boolean z) {
        this.A = i;
    }

    public ci3(c55 c55Var, nl6 nl6Var) {
        Object mx2Var;
        this.A = 19;
        this.B = nl6Var;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            boolean z = c.a;
        } else if (!c.a) {
            if (i != 26 && i != 27) {
                mx2Var = new mx2(true);
            } else {
                mx2Var = new Object();
            }
            this.L = mx2Var;
        }
        mx2Var = new mx2(false);
        this.L = mx2Var;
    }

    public ci3(ya1 ya1Var, l4 l4Var, ci4 ci4Var) {
        this.A = 11;
        this.B = ya1Var;
        this.L = l4Var;
    }

    public ci3(t6 t6Var) {
        this.A = 8;
        this.B = t6Var;
        this.L = new AtomicInteger(0);
    }

    public ci3(zt4 zt4Var) {
        this.A = 14;
        this.L = zt4Var;
    }

    public /* synthetic */ ci3(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }

    public ci3(int i, ud7 ud7Var) {
        this.A = 17;
        this.B = ud7Var;
        this.L = new cx0(i, this);
    }

    public ci3(e81 e81Var) {
        this.A = 29;
        this.B = e81Var;
        this.L = new Object();
    }

    public ci3(rg0 rg0Var) {
        this.A = 25;
        this.B = rg0Var;
        this.L = null;
    }

    public ci3(dj3 dj3Var) {
        this.A = 1;
        this.B = dj3Var;
        s14 s14Var = a94.a;
        this.L = new s14();
    }
}
