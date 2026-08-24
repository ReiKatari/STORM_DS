package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k64  reason: default package */
/* loaded from: classes.dex */
public final class k64 {
    public static defpackage.k64 h;
    public final defpackage.kk3 a;
    public final defpackage.s47 b;
    public final defpackage.th1 c;
    public final defpackage.ki2 d;
    public final defpackage.s47 e;
    public float f;
    public float g;

    public k64(defpackage.kk3 r1, defpackage.s47 r2, defpackage.th1 r3, defpackage.ki2 r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            s47 r1 = defpackage.gi2.N(r2, r1)
            r0.e = r1
            r1 = 2143289344(0x7fc00000, float:NaN)
            r0.f = r1
            r0.g = r1
            return
    }

    public final long a(int r24, long r25) {
            r23 = this;
            r0 = r23
            r1 = r24
            float r2 = r0.g
            float r3 = r0.f
            boolean r4 = java.lang.Float.isNaN(r2)
            r5 = 0
            if (r4 != 0) goto L15
            boolean r4 = java.lang.Float.isNaN(r3)
            if (r4 == 0) goto L52
        L15:
            java.lang.String r6 = defpackage.l64.a
            r2 = 15
            long r8 = defpackage.s21.b(r5, r5, r5, r5, r2)
            r12 = 1
            r13 = 96
            s47 r7 = r0.e
            th1 r10 = r0.c
            ki2 r11 = r0.d
            cj r3 = defpackage.nj2.c(r6, r7, r8, r10, r11, r12, r13)
            r18 = r10
            float r3 = r3.b()
            java.lang.String r14 = defpackage.l64.b
            long r16 = defpackage.s21.b(r5, r5, r5, r5, r2)
            r20 = 2
            r21 = 96
            s47 r15 = r0.e
            ki2 r2 = r0.d
            r19 = r2
            cj r2 = defpackage.nj2.c(r14, r15, r16, r18, r19, r20, r21)
            float r2 = r2.b()
            float r2 = r2 - r3
            r0.g = r3
            r0.f = r2
            r22 = r3
            r3 = r2
            r2 = r22
        L52:
            r0 = 1
            if (r1 == r0) goto L6a
            int r0 = r1 + (-1)
            float r0 = (float) r0
            float r3 = r3 * r0
            float r3 = r3 + r2
            int r0 = java.lang.Math.round(r3)
            if (r0 >= 0) goto L61
            goto L62
        L61:
            r5 = r0
        L62:
            int r0 = defpackage.q21.g(r25)
            if (r5 <= r0) goto L6e
            r5 = r0
            goto L6e
        L6a:
            int r5 = defpackage.q21.i(r25)
        L6e:
            int r0 = defpackage.q21.g(r25)
            int r1 = defpackage.q21.j(r25)
            int r2 = defpackage.q21.h(r25)
            long r0 = defpackage.s21.a(r1, r2, r5, r0)
            return r0
    }
}
