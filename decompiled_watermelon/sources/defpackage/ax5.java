package defpackage;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ax5  reason: default package */
/* loaded from: classes.dex */
public final class ax5 {
    public sw5 a;
    public eg b;
    public a92 c;
    public jf4 d;
    public boolean e;
    public q9 f;
    public final rw5 g;
    public final nw5 h;
    public boolean i;
    public int j = 1;
    public dw5 k = lw5.b;
    public final xw5 l = new xw5(this);
    public final n95 m = new n95(10, this);

    public ax5(sw5 sw5Var, eg egVar, a92 a92Var, jf4 jf4Var, boolean z, q9 q9Var, rw5 rw5Var, nw5 nw5Var) {
        this.a = sw5Var;
        this.b = egVar;
        this.c = a92Var;
        this.d = jf4Var;
        this.e = z;
        this.f = q9Var;
        this.g = rw5Var;
        this.h = nw5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, m75] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r12, defpackage.k11 r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.uw5
            if (r0 == 0) goto L13
            r0 = r14
            uw5 r0 = (defpackage.uw5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            uw5 r0 = new uw5
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2f
            m75 r12 = r0.R
            defpackage.me2.a0(r14)     // Catch: java.lang.Throwable -> L2b
            r6 = r11
            goto L58
        L2b:
            r0 = move-exception
            r12 = r0
            r6 = r11
            goto L68
        L2f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r11)
            r11 = 0
            return r11
        L36:
            defpackage.me2.a0(r14)
            m75 r7 = new m75
            r7.<init>()
            r7.A = r12
            r11.i = r4
            r24 r14 = defpackage.r24.Default     // Catch: java.lang.Throwable -> L65
            ww5 r5 = new ww5     // Catch: java.lang.Throwable -> L65
            r10 = 0
            r6 = r11
            r8 = r12
            r5.<init>(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L62
            r0.R = r7     // Catch: java.lang.Throwable -> L62
            r0.Z = r4     // Catch: java.lang.Throwable -> L62
            java.lang.Object r11 = r6.f(r14, r5, r0)     // Catch: java.lang.Throwable -> L62
            if (r11 != r1) goto L57
            return r1
        L57:
            r12 = r7
        L58:
            r6.i = r3
            long r11 = r12.A
            p77 r13 = new p77
            r13.<init>(r11)
            return r13
        L62:
            r0 = move-exception
        L63:
            r12 = r0
            goto L68
        L65:
            r0 = move-exception
            r6 = r11
            goto L63
        L68:
            r6.i = r3
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ax5.a(long, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
        if ((r6 instanceof defpackage.aa1) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r4, boolean r6, defpackage.nk6 r7) {
        /*
            r3 = this;
            o27 r0 = defpackage.o27.a
            if (r6 == 0) goto Ld
            a92 r6 = r3.c
            fu5 r1 = defpackage.lw5.a
            boolean r6 = r6 instanceof defpackage.aa1
            if (r6 == 0) goto Ld
            goto L4f
        Ld:
            jf4 r6 = r3.d
            jf4 r1 = defpackage.jf4.Horizontal
            r2 = 0
            if (r6 != r1) goto L1a
            r6 = 1
        L15:
            long r4 = defpackage.p77.a(r4, r2, r2, r6)
            goto L1c
        L1a:
            r6 = 2
            goto L15
        L1c:
            yw5 r6 = new yw5
            r1 = 0
            r6.<init>(r3, r1)
            eg r1 = r3.b
            if (r1 == 0) goto L3f
            sw5 r2 = r3.a
            boolean r2 = r2.c()
            if (r2 != 0) goto L36
            sw5 r2 = r3.a
            boolean r2 = r2.a()
            if (r2 == 0) goto L3f
        L36:
            java.lang.Object r3 = r1.b(r4, r6, r7)
            p31 r4 = defpackage.p31.COROUTINE_SUSPENDED
            if (r3 != r4) goto L4f
            return r3
        L3f:
            yw5 r6 = new yw5
            r6.<init>(r3, r7)
            r6.Z = r4
            java.lang.Object r3 = r6.v(r0)
            p31 r4 = defpackage.p31.COROUTINE_SUSPENDED
            if (r3 != r4) goto L4f
            return r3
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ax5.b(long, boolean, nk6):java.lang.Object");
    }

    public final long c(dw5 dw5Var, long j, int i) {
        a64 a64Var;
        long j2;
        long a;
        a64 a64Var2 = (a64) this.f.B;
        a64 a64Var3 = null;
        if (a64Var2 != null) {
            a64Var = a64Var2.S0();
        } else {
            a64Var = null;
        }
        long j3 = 0;
        if (a64Var != null) {
            j2 = a64Var.w0(i, j);
        } else {
            j2 = 0;
        }
        long d = mb4.d(j, j2);
        if (this.d == jf4.Horizontal) {
            a = mb4.a(d, RecyclerView.A1, 1);
        } else {
            a = mb4.a(d, RecyclerView.A1, 2);
        }
        long e = e(h(dw5Var.a(g(e(a)))));
        rw5 rw5Var = this.g;
        if (rw5Var.i0) {
            ViewTreeObserver viewTreeObserver = ((ee) l.Q(rw5Var)).getViewTreeObserver();
            try {
                if (ee.M1 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    ee.M1 = declaredMethod;
                }
                Method method = ee.M1;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long d2 = mb4.d(d, e);
        a64 a64Var4 = (a64) this.f.B;
        if (a64Var4 != null) {
            a64Var3 = a64Var4.S0();
        }
        a64 a64Var5 = a64Var3;
        if (a64Var5 != null) {
            j3 = a64Var5.j0(e, d2, i);
        }
        return mb4.e(mb4.e(j2, e), j3);
    }

    public final float d(float f) {
        if (this.e) {
            return f * (-1.0f);
        }
        return f;
    }

    public final long e(long j) {
        if (this.e) {
            return mb4.f(-1.0f, j);
        }
        return j;
    }

    public final Object f(r24 r24Var, aj2 aj2Var, k11 k11Var) {
        Object e = this.a.e(r24Var, new zw5(this, aj2Var, null, 0), k11Var);
        if (e == p31.COROUTINE_SUSPENDED) {
            return e;
        }
        return o27.a;
    }

    public final float g(long j) {
        long j2;
        if (this.d == jf4.Horizontal) {
            j2 = j >> 32;
        } else {
            j2 = j & 4294967295L;
        }
        return Float.intBitsToFloat((int) j2);
    }

    public final long h(float f) {
        if (f == RecyclerView.A1) {
            return 0L;
        }
        if (this.d == jf4.Horizontal) {
            return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(RecyclerView.A1) & 4294967295L);
        }
        return (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(RecyclerView.A1) << 32);
    }

    public final float i(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        int i3 = (((float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)))) > 0.7853981633974483d ? 1 : (((float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)))) == 0.7853981633974483d ? 0 : -1));
        jf4 jf4Var = this.d;
        if (i3 >= 0) {
            if (jf4Var != jf4.Vertical) {
                return RecyclerView.A1;
            }
            return Float.intBitsToFloat(i);
        } else if (jf4Var != jf4.Horizontal) {
            return RecyclerView.A1;
        } else {
            return Float.intBitsToFloat(i2);
        }
    }
}
