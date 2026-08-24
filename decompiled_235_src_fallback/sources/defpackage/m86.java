package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m86  reason: default package */
/* loaded from: classes.dex */
public final class m86 {
    public defpackage.f86 a;
    public defpackage.sg b;
    public defpackage.sd2 c;
    public defpackage.lo4 d;
    public boolean e;
    public defpackage.eb f;
    public final defpackage.e86 g;
    public final defpackage.a86 h;
    public boolean i;
    public int j;
    public defpackage.p76 k;
    public final defpackage.k86 l;
    public final defpackage.ro5 m;

    public m86(defpackage.f86 r1, defpackage.sg r2, defpackage.sd2 r3, defpackage.lo4 r4, boolean r5, defpackage.eb r6, defpackage.e86 r7, defpackage.a86 r8) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r1 = 1
            r0.j = r1
            w76 r1 = defpackage.y76.b
            r0.k = r1
            k86 r1 = new k86
            r1.<init>(r0)
            r0.l = r1
            ro5 r1 = new ro5
            r2 = 8
            r1.<init>(r0, r2)
            r0.m = r1
            return
    }

    public final java.lang.Object a(long r12, defpackage.s41 r14) {
            r11 = this;
            boolean r0 = r14 instanceof defpackage.h86
            if (r0 == 0) goto L13
            r0 = r14
            h86 r0 = (defpackage.h86) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            h86 r0 = new h86
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2f
            ch5 r12 = r0.R
            defpackage.oi2.Y(r14)     // Catch: java.lang.Throwable -> L2b
            r6 = r11
            goto L58
        L2b:
            r0 = move-exception
            r12 = r0
            r6 = r11
            goto L68
        L2f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r11)
            r11 = 0
            return r11
        L36:
            defpackage.oi2.Y(r14)
            ch5 r7 = new ch5
            r7.<init>()
            r7.A = r12
            r11.i = r4
            xa4 r14 = defpackage.xa4.Default     // Catch: java.lang.Throwable -> L65
            j86 r5 = new j86     // Catch: java.lang.Throwable -> L65
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
            ol7 r13 = new ol7
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
    }

    public final java.lang.Object b(long r4, boolean r6, defpackage.hw6 r7) {
            r3 = this;
            jg7 r0 = defpackage.jg7.a
            if (r6 == 0) goto Ld
            sd2 r6 = r3.c
            r76 r1 = defpackage.y76.a
            boolean r6 = r6 instanceof defpackage.wd1
            if (r6 == 0) goto Ld
            goto L4f
        Ld:
            lo4 r6 = r3.d
            lo4 r1 = defpackage.lo4.Horizontal
            r2 = 0
            if (r6 != r1) goto L1a
            r6 = 1
        L15:
            long r4 = defpackage.ol7.a(r4, r2, r2, r6)
            goto L1c
        L1a:
            r6 = 2
            goto L15
        L1c:
            l86 r6 = new l86
            r1 = 0
            r6.<init>(r3, r1)
            sg r1 = r3.b
            if (r1 == 0) goto L3f
            f86 r2 = r3.a
            boolean r2 = r2.c()
            if (r2 != 0) goto L36
            f86 r2 = r3.a
            boolean r2 = r2.b()
            if (r2 == 0) goto L3f
        L36:
            java.lang.Object r3 = r1.b(r4, r6, r7)
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            if (r3 != r4) goto L4f
            return r3
        L3f:
            l86 r6 = new l86
            r6.<init>(r3, r7)
            r6.Z = r4
            java.lang.Object r3 = r6.s(r0)
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            if (r3 != r4) goto L4f
            return r3
        L4f:
            return r0
    }

    public final long c(defpackage.p76 r15, long r16, int r18) {
            r14 = this;
            r0 = r16
            eb r2 = r14.f
            java.lang.Object r2 = r2.B
            ge4 r2 = (defpackage.ge4) r2
            r3 = 0
            if (r2 == 0) goto L10
            ge4 r2 = r2.S0()
            goto L11
        L10:
            r2 = r3
        L11:
            r4 = 0
            r11 = r18
            if (r2 == 0) goto L1d
            long r6 = r2.N(r11, r0)
            r12 = r6
            goto L1e
        L1d:
            r12 = r4
        L1e:
            long r0 = defpackage.jk4.e(r0, r12)
            lo4 r2 = r14.d
            lo4 r6 = defpackage.lo4.Horizontal
            r7 = 1
            r8 = 0
            if (r2 != r6) goto L2f
            long r8 = defpackage.jk4.a(r0, r8, r7)
            goto L34
        L2f:
            r2 = 2
            long r8 = defpackage.jk4.a(r0, r8, r2)
        L34:
            long r8 = r14.e(r8)
            float r2 = r14.g(r8)
            float r2 = r15.a(r2)
            long r8 = r14.h(r2)
            long r8 = r14.e(r8)
            e86 r2 = r14.g
            boolean r6 = r2.j0
            if (r6 != 0) goto L4f
            goto L73
        L4f:
            zp4 r2 = defpackage.nc1.g0(r2)
            te r2 = (defpackage.te) r2
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
            java.lang.reflect.Method r6 = defpackage.te.N1     // Catch: java.lang.Exception -> L73
            if (r6 != 0) goto L6c
            java.lang.Class r6 = r2.getClass()     // Catch: java.lang.Exception -> L73
            java.lang.String r10 = "dispatchOnScrollChanged"
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r10, r3)     // Catch: java.lang.Exception -> L73
            r6.setAccessible(r7)     // Catch: java.lang.Exception -> L73
            defpackage.te.N1 = r6     // Catch: java.lang.Exception -> L73
        L6c:
            java.lang.reflect.Method r6 = defpackage.te.N1     // Catch: java.lang.Exception -> L73
            if (r6 == 0) goto L73
            r6.invoke(r2, r3)     // Catch: java.lang.Exception -> L73
        L73:
            long r0 = defpackage.jk4.e(r0, r8)
            eb r14 = r14.f
            java.lang.Object r14 = r14.B
            ge4 r14 = (defpackage.ge4) r14
            if (r14 == 0) goto L83
            ge4 r3 = r14.S0()
        L83:
            r6 = r3
            r7 = r8
            if (r6 == 0) goto L8c
            r9 = r0
            long r4 = r6.w0(r7, r9, r11)
        L8c:
            long r0 = defpackage.jk4.f(r12, r7)
            long r0 = defpackage.jk4.f(r0, r4)
            return r0
    }

    public final float d(float r1) {
            r0 = this;
            boolean r0 = r0.e
            if (r0 == 0) goto L7
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r1 = r1 * r0
        L7:
            return r1
    }

    public final long e(long r1) {
            r0 = this;
            boolean r0 = r0.e
            if (r0 == 0) goto Lb
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            long r0 = defpackage.jk4.g(r0, r1)
            return r0
        Lb:
            return r1
    }

    public final java.lang.Object f(defpackage.xa4 r5, defpackage.eo2 r6, defpackage.s41 r7) {
            r4 = this;
            f86 r0 = r4.a
            vy5 r1 = new vy5
            r2 = 0
            r3 = 4
            r1.<init>(r4, r6, r2, r3)
            java.lang.Object r4 = r0.d(r5, r1, r7)
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            if (r4 != r5) goto L12
            return r4
        L12:
            jg7 r4 = defpackage.jg7.a
            return r4
    }

    public final float g(long r3) {
            r2 = this;
            lo4 r2 = r2.d
            lo4 r0 = defpackage.lo4.Horizontal
            if (r2 != r0) goto L10
            r2 = 32
            long r2 = r3 >> r2
        La:
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            return r2
        L10:
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r3 & r0
            goto La
    }

    public final long h(float r6) {
            r5 = this;
            r0 = 0
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 != 0) goto L8
            r5 = 0
            return r5
        L8:
            lo4 r5 = r5.d
            lo4 r1 = defpackage.lo4.Horizontal
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r4 = 32
            if (r5 != r1) goto L23
            int r5 = java.lang.Float.floatToRawIntBits(r6)
            long r5 = (long) r5
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r0
            long r5 = r5 << r4
            long r0 = r0 & r2
            long r5 = r5 | r0
            return r5
        L23:
            int r5 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r5
            int r5 = java.lang.Float.floatToRawIntBits(r6)
            long r5 = (long) r5
            long r0 = r0 << r4
            long r5 = r5 & r2
            long r5 = r5 | r0
            return r5
    }

    public final float i(long r6) {
            r5 = this;
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r6
            int r0 = (int) r0
            float r1 = java.lang.Float.intBitsToFloat(r0)
            float r1 = java.lang.Math.abs(r1)
            r2 = 32
            long r6 = r6 >> r2
            int r6 = (int) r6
            float r7 = java.lang.Float.intBitsToFloat(r6)
            float r7 = java.lang.Math.abs(r7)
            double r1 = (double) r1
            double r3 = (double) r7
            double r1 = java.lang.Math.atan2(r1, r3)
            float r7 = (float) r1
            double r1 = (double) r7
            r3 = 4605249457297304856(0x3fe921fb54442d18, double:0.7853981633974483)
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            lo4 r5 = r5.d
            r1 = 0
            if (r7 < 0) goto L39
            lo4 r6 = defpackage.lo4.Vertical
            if (r5 != r6) goto L38
            float r5 = java.lang.Float.intBitsToFloat(r0)
            return r5
        L38:
            return r1
        L39:
            lo4 r7 = defpackage.lo4.Horizontal
            if (r5 != r7) goto L42
            float r5 = java.lang.Float.intBitsToFloat(r6)
            return r5
        L42:
            return r1
    }
}
