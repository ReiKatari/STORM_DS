package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k86  reason: default package */
/* loaded from: classes.dex */
public final class k86 {
    public final /* synthetic */ defpackage.m86 a;

    public k86(defpackage.m86 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final long a(int r20, long r21) {
            r19 = this;
            r0 = r20
            r1 = r19
            r2 = r21
            m86 r1 = r1.a
            r1.j = r0
            sg r4 = r1.b
            if (r4 == 0) goto L376
            f86 r5 = r1.a
            boolean r5 = r5.c()
            if (r5 != 0) goto L1e
            f86 r5 = r1.a
            boolean r5 = r5.b()
            if (r5 == 0) goto L376
        L1e:
            int r0 = r1.j
            ro5 r1 = r1.m
            mr1 r5 = r4.c
            long r6 = r4.g
            boolean r6 = defpackage.xi6.f(r6)
            if (r6 == 0) goto L40
            java.lang.Object r0 = r1.B
            m86 r0 = (defpackage.m86) r0
            p76 r1 = r0.k
            int r4 = r0.j
            long r0 = r0.c(r1, r2, r4)
            jk4 r2 = new jk4
            r2.<init>(r0)
            long r0 = r2.a
            return r0
        L40:
            boolean r6 = r4.f
            r7 = 0
            r9 = 1
            if (r6 != 0) goto L75
            android.widget.EdgeEffect r6 = r5.f
            boolean r6 = defpackage.mr1.g(r6)
            if (r6 == 0) goto L52
            r4.f(r7)
        L52:
            android.widget.EdgeEffect r6 = r5.g
            boolean r6 = defpackage.mr1.g(r6)
            if (r6 == 0) goto L5d
            r4.g(r7)
        L5d:
            android.widget.EdgeEffect r6 = r5.d
            boolean r6 = defpackage.mr1.g(r6)
            if (r6 == 0) goto L68
            r4.h(r7)
        L68:
            android.widget.EdgeEffect r6 = r5.e
            boolean r6 = defpackage.mr1.g(r6)
            if (r6 == 0) goto L73
            r4.e(r7)
        L73:
            r4.f = r9
        L75:
            int r6 = defpackage.yi.a
            r6 = 2
            if (r0 != r6) goto L7d
            r6 = 1082130432(0x40800000, float:4.0)
            goto L7f
        L7d:
            r6 = 1065353216(0x3f800000, float:1.0)
        L7f:
            long r10 = defpackage.jk4.g(r6, r2)
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r14 = r2 & r12
            int r14 = (int) r14
            float r15 = java.lang.Float.intBitsToFloat(r14)
            r16 = 0
            int r15 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r15 != 0) goto L9b
            r19 = r12
        L97:
            r12 = r16
            goto L109
        L9b:
            android.widget.EdgeEffect r15 = r5.d
            boolean r15 = defpackage.mr1.g(r15)
            if (r15 == 0) goto Ld3
            float r15 = java.lang.Float.intBitsToFloat(r14)
            int r15 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r15 >= 0) goto Ld3
            float r15 = r4.h(r10)
            r19 = r12
            android.widget.EdgeEffect r12 = r5.d
            boolean r12 = defpackage.mr1.g(r12)
            if (r12 != 0) goto Lc0
            android.widget.EdgeEffect r12 = r5.e()
            r12.finish()
        Lc0:
            long r12 = r10 & r19
            int r12 = (int) r12
            float r12 = java.lang.Float.intBitsToFloat(r12)
            int r12 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r12 != 0) goto Ld0
            float r12 = java.lang.Float.intBitsToFloat(r14)
            goto L109
        Ld0:
            float r12 = r15 / r6
            goto L109
        Ld3:
            r19 = r12
            android.widget.EdgeEffect r12 = r5.e
            boolean r12 = defpackage.mr1.g(r12)
            if (r12 == 0) goto L97
            float r12 = java.lang.Float.intBitsToFloat(r14)
            int r12 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r12 <= 0) goto L97
            float r12 = r4.e(r10)
            android.widget.EdgeEffect r13 = r5.e
            boolean r13 = defpackage.mr1.g(r13)
            if (r13 != 0) goto Lf8
            android.widget.EdgeEffect r13 = r5.b()
            r13.finish()
        Lf8:
            long r7 = r10 & r19
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            int r7 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r7 != 0) goto L108
            float r12 = java.lang.Float.intBitsToFloat(r14)
            goto L109
        L108:
            float r12 = r12 / r6
        L109:
            r13 = 32
            long r7 = r2 >> r13
            int r7 = (int) r7
            float r8 = java.lang.Float.intBitsToFloat(r7)
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 != 0) goto L119
        L116:
            r6 = r16
            goto L17f
        L119:
            android.widget.EdgeEffect r8 = r5.f
            boolean r8 = defpackage.mr1.g(r8)
            if (r8 == 0) goto L14e
            float r8 = java.lang.Float.intBitsToFloat(r7)
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 >= 0) goto L14e
            float r8 = r4.f(r10)
            android.widget.EdgeEffect r15 = r5.f
            boolean r15 = defpackage.mr1.g(r15)
            if (r15 != 0) goto L13c
            android.widget.EdgeEffect r15 = r5.c()
            r15.finish()
        L13c:
            long r10 = r10 >> r13
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 != 0) goto L14b
            float r6 = java.lang.Float.intBitsToFloat(r7)
            goto L17f
        L14b:
            float r6 = r8 / r6
            goto L17f
        L14e:
            android.widget.EdgeEffect r8 = r5.g
            boolean r8 = defpackage.mr1.g(r8)
            if (r8 == 0) goto L116
            float r8 = java.lang.Float.intBitsToFloat(r7)
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 <= 0) goto L116
            float r8 = r4.g(r10)
            android.widget.EdgeEffect r15 = r5.g
            boolean r15 = defpackage.mr1.g(r15)
            if (r15 != 0) goto L171
            android.widget.EdgeEffect r15 = r5.d()
            r15.finish()
        L171:
            long r10 = r10 >> r13
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 != 0) goto L14b
            float r6 = java.lang.Float.intBitsToFloat(r7)
        L17f:
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r10 = (long) r6
            int r6 = java.lang.Float.floatToRawIntBits(r12)
            r12 = r13
            r8 = r14
            long r13 = (long) r6
            long r10 = r10 << r12
            long r13 = r13 & r19
            long r10 = r10 | r13
            r13 = 0
            boolean r6 = defpackage.jk4.c(r10, r13)
            if (r6 != 0) goto L19a
            r4.d()
        L19a:
            long r2 = defpackage.jk4.e(r2, r10)
            java.lang.Object r1 = r1.B
            m86 r1 = (defpackage.m86) r1
            p76 r6 = r1.k
            int r13 = r1.j
            long r13 = r1.c(r6, r2, r13)
            jk4 r1 = new jk4
            r1.<init>(r13)
            long r13 = r1.a
            r17 = r10
            long r9 = defpackage.jk4.e(r2, r13)
            r6 = r12
            r21 = r13
            long r12 = r2 >> r6
            int r11 = (int) r12
            float r11 = java.lang.Float.intBitsToFloat(r11)
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 != 0) goto L1d1
            long r11 = r2 & r19
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 != 0) goto L1d1
            goto L20b
        L1d1:
            long r11 = r21 >> r6
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 != 0) goto L1e8
            long r11 = r21 & r19
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 != 0) goto L1e8
            goto L20b
        L1e8:
            android.widget.EdgeEffect r11 = r5.f
            boolean r11 = defpackage.mr1.g(r11)
            if (r11 != 0) goto L208
            android.widget.EdgeEffect r11 = r5.d
            boolean r11 = defpackage.mr1.g(r11)
            if (r11 != 0) goto L208
            android.widget.EdgeEffect r11 = r5.g
            boolean r11 = defpackage.mr1.g(r11)
            if (r11 != 0) goto L208
            android.widget.EdgeEffect r11 = r5.e
            boolean r11 = defpackage.mr1.g(r11)
            if (r11 == 0) goto L20b
        L208:
            r4.a()
        L20b:
            r11 = 0
            r1 = 1
            if (r0 != r1) goto L255
            long r12 = r9 >> r6
            int r0 = (int) r12
            float r6 = java.lang.Float.intBitsToFloat(r0)
            r12 = 1056964608(0x3f000000, float:0.5)
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            r13 = -1090519040(0xffffffffbf000000, float:-0.5)
            if (r6 <= 0) goto L223
            r4.f(r9)
        L221:
            r0 = r1
            goto L230
        L223:
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 >= 0) goto L22f
            r4.g(r9)
            goto L221
        L22f:
            r0 = r11
        L230:
            long r14 = r9 & r19
            int r6 = (int) r14
            float r14 = java.lang.Float.intBitsToFloat(r6)
            int r12 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r12 <= 0) goto L240
            r4.h(r9)
        L23e:
            r6 = r1
            goto L24d
        L240:
            float r6 = java.lang.Float.intBitsToFloat(r6)
            int r6 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r6 >= 0) goto L24c
            r4.e(r9)
            goto L23e
        L24c:
            r6 = r11
        L24d:
            if (r0 != 0) goto L251
            if (r6 == 0) goto L255
        L251:
            r0 = r1
        L252:
            r13 = 0
            goto L257
        L255:
            r0 = r11
            goto L252
        L257:
            boolean r2 = defpackage.jk4.c(r2, r13)
            if (r2 != 0) goto L368
            android.widget.EdgeEffect r2 = r5.f
            boolean r2 = defpackage.mr1.f(r2)
            if (r2 == 0) goto L298
            float r2 = java.lang.Float.intBitsToFloat(r7)
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 >= 0) goto L298
            android.widget.EdgeEffect r2 = r5.c()
            float r3 = java.lang.Float.intBitsToFloat(r7)
            boolean r6 = r2 instanceof defpackage.qs2
            if (r6 == 0) goto L28e
            qs2 r2 = (defpackage.qs2) r2
            float r6 = r2.b
            float r6 = r6 + r3
            r2.b = r6
            float r3 = java.lang.Math.abs(r6)
            float r6 = r2.a
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 <= 0) goto L291
            r2.onRelease()
            goto L291
        L28e:
            r2.onRelease()
        L291:
            android.widget.EdgeEffect r2 = r5.f
            boolean r2 = defpackage.mr1.f(r2)
            goto L299
        L298:
            r2 = r11
        L299:
            android.widget.EdgeEffect r3 = r5.g
            boolean r3 = defpackage.mr1.f(r3)
            if (r3 == 0) goto L2db
            float r3 = java.lang.Float.intBitsToFloat(r7)
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 <= 0) goto L2db
            android.widget.EdgeEffect r3 = r5.d()
            float r6 = java.lang.Float.intBitsToFloat(r7)
            boolean r7 = r3 instanceof defpackage.qs2
            if (r7 == 0) goto L2ca
            qs2 r3 = (defpackage.qs2) r3
            float r7 = r3.b
            float r7 = r7 + r6
            r3.b = r7
            float r6 = java.lang.Math.abs(r7)
            float r7 = r3.a
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L2cd
            r3.onRelease()
            goto L2cd
        L2ca:
            r3.onRelease()
        L2cd:
            if (r2 != 0) goto L2da
            android.widget.EdgeEffect r2 = r5.g
            boolean r2 = defpackage.mr1.f(r2)
            if (r2 == 0) goto L2d8
            goto L2da
        L2d8:
            r2 = r11
            goto L2db
        L2da:
            r2 = r1
        L2db:
            android.widget.EdgeEffect r3 = r5.d
            boolean r3 = defpackage.mr1.f(r3)
            if (r3 == 0) goto L31d
            float r3 = java.lang.Float.intBitsToFloat(r8)
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 >= 0) goto L31d
            android.widget.EdgeEffect r3 = r5.e()
            float r6 = java.lang.Float.intBitsToFloat(r8)
            boolean r7 = r3 instanceof defpackage.qs2
            if (r7 == 0) goto L30c
            qs2 r3 = (defpackage.qs2) r3
            float r7 = r3.b
            float r7 = r7 + r6
            r3.b = r7
            float r6 = java.lang.Math.abs(r7)
            float r7 = r3.a
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L30f
            r3.onRelease()
            goto L30f
        L30c:
            r3.onRelease()
        L30f:
            if (r2 != 0) goto L31c
            android.widget.EdgeEffect r2 = r5.d
            boolean r2 = defpackage.mr1.f(r2)
            if (r2 == 0) goto L31a
            goto L31c
        L31a:
            r2 = r11
            goto L31d
        L31c:
            r2 = r1
        L31d:
            android.widget.EdgeEffect r3 = r5.e
            boolean r3 = defpackage.mr1.f(r3)
            if (r3 == 0) goto L35f
            float r3 = java.lang.Float.intBitsToFloat(r8)
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 <= 0) goto L35f
            android.widget.EdgeEffect r3 = r5.b()
            float r6 = java.lang.Float.intBitsToFloat(r8)
            boolean r7 = r3 instanceof defpackage.qs2
            if (r7 == 0) goto L34e
            qs2 r3 = (defpackage.qs2) r3
            float r7 = r3.b
            float r7 = r7 + r6
            r3.b = r7
            float r6 = java.lang.Math.abs(r7)
            float r7 = r3.a
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L351
            r3.onRelease()
            goto L351
        L34e:
            r3.onRelease()
        L351:
            if (r2 != 0) goto L35e
            android.widget.EdgeEffect r2 = r5.e
            boolean r2 = defpackage.mr1.f(r2)
            if (r2 == 0) goto L35c
            goto L35e
        L35c:
            r2 = r11
            goto L35f
        L35e:
            r2 = r1
        L35f:
            if (r2 != 0) goto L366
            if (r0 == 0) goto L364
            goto L366
        L364:
            r9 = r11
            goto L367
        L366:
            r9 = r1
        L367:
            r0 = r9
        L368:
            if (r0 == 0) goto L36d
            r4.d()
        L36d:
            r2 = r21
            r0 = r17
            long r0 = defpackage.jk4.f(r0, r2)
            return r0
        L376:
            p76 r4 = r1.k
            long r0 = r1.c(r4, r2, r0)
            return r0
    }
}
