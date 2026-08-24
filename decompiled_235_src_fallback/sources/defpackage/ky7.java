package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ky7  reason: default package */
/* loaded from: classes.dex */
public final class ky7 extends defpackage.db2 {
    public static final defpackage.lt4 X = null;
    public final defpackage.lt4 B;
    public final defpackage.db2 L;
    public final java.util.LinkedHashMap R;

    static {
            java.lang.String r0 = defpackage.lt4.B
            java.lang.String r0 = "/"
            lt4 r0 = defpackage.w31.p(r0)
            defpackage.ky7.X = r0
            return
    }

    public ky7(defpackage.lt4 r1, defpackage.db2 r2, java.util.LinkedHashMap r3) {
            r0 = this;
            r0.<init>()
            r0.B = r1
            r0.L = r2
            r0.R = r3
            return
    }

    @Override // defpackage.db2
    public final defpackage.ai1 D(defpackage.lt4 r24) {
            r23 = this;
            r0 = r23
            r24.getClass()
            lt4 r1 = defpackage.ky7.X
            r1.getClass()
            r2 = 1
            r3 = r24
            lt4 r1 = defpackage.f.b(r1, r3, r2)
            java.util.LinkedHashMap r3 = r0.R
            java.lang.Object r1 = r3.get(r1)
            jy7 r1 = (defpackage.jy7) r1
            r3 = 0
            if (r1 != 0) goto L1d
            return r3
        L1d:
            long r4 = r1.h
            r6 = -1
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L6c
            db2 r6 = r0.L
            lt4 r0 = r0.B
            wf3 r6 = r6.F(r0)
            va2 r0 = r6.e(r4)     // Catch: java.lang.Throwable -> L5a
            fe5 r4 = new fe5     // Catch: java.lang.Throwable -> L5a
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L5a
            jy7 r1 = defpackage.vs7.e(r4, r1)     // Catch: java.lang.Throwable -> L44
            r1.getClass()     // Catch: java.lang.Throwable -> L44
            r4.close()     // Catch: java.lang.Throwable -> L42
            r0 = r3
            goto L50
        L42:
            r0 = move-exception
            goto L50
        L44:
            r0 = move-exception
            r1 = r0
            r4.close()     // Catch: java.lang.Throwable -> L4a
            goto L4e
        L4a:
            r0 = move-exception
            defpackage.mb3.q(r1, r0)     // Catch: java.lang.Throwable -> L5a
        L4e:
            r0 = r1
            r1 = r3
        L50:
            if (r0 != 0) goto L59
            r6.close()     // Catch: java.lang.Throwable -> L57
            r0 = r3
            goto L68
        L57:
            r0 = move-exception
            goto L68
        L59:
            throw r0     // Catch: java.lang.Throwable -> L5a
        L5a:
            r0 = move-exception
            r1 = r0
            if (r6 == 0) goto L66
            r6.close()     // Catch: java.lang.Throwable -> L62
            goto L66
        L62:
            r0 = move-exception
            defpackage.mb3.q(r1, r0)
        L66:
            r0 = r1
            r1 = r3
        L68:
            if (r0 != 0) goto L6b
            goto L6c
        L6b:
            throw r0
        L6c:
            ai1 r4 = new ai1
            boolean r6 = r1.b
            r5 = r6 ^ 1
            if (r6 == 0) goto L76
            r8 = r3
            goto L7d
        L76:
            long r7 = r1.f
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r8 = r0
        L7d:
            java.lang.Long r0 = r1.m
            r9 = 11644473600000(0xa9730b66800, double:5.7531343696653E-311)
            r11 = 10000(0x2710, double:4.9407E-320)
            r13 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L96
            long r15 = r0.longValue()
            long r15 = r15 / r11
            long r15 = r15 - r9
            java.lang.Long r0 = java.lang.Long.valueOf(r15)
            r7 = r2
            goto La8
        L96:
            java.lang.Integer r0 = r1.p
            if (r0 == 0) goto La6
            int r0 = r0.intValue()
            r7 = r2
            long r2 = (long) r0
            long r2 = r2 * r13
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto La8
        La6:
            r7 = r2
            r0 = 0
        La8:
            java.lang.Long r2 = r1.k
            if (r2 == 0) goto Lb7
            long r2 = r2.longValue()
            long r2 = r2 / r11
            long r2 = r2 - r9
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L10b
        Lb7:
            java.lang.Integer r2 = r1.n
            if (r2 == 0) goto Lc6
            int r2 = r2.intValue()
            long r2 = (long) r2
            long r2 = r2 * r13
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L10b
        Lc6:
            int r2 = r1.j
            r3 = -1
            if (r2 == r3) goto Lcf
            int r15 = r1.i
            if (r2 != r3) goto Ld1
        Lcf:
            r2 = 0
            goto L10b
        Ld1:
            int r3 = r15 >> 9
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r3 = r3 + 1980
            int r16 = r15 >> 5
            r16 = r16 & 15
            r19 = r15 & 31
            int r15 = r2 >> 11
            r20 = r15 & 31
            int r15 = r2 >> 5
            r21 = r15 & 63
            r2 = r2 & 31
            int r22 = r2 << 1
            java.util.GregorianCalendar r2 = new java.util.GregorianCalendar
            r2.<init>()
            r15 = 14
            r23 = r7
            r7 = 0
            r2.set(r15, r7)
            int r18 = r16 + (-1)
            r16 = r2
            r17 = r3
            r16.set(r17, r18, r19, r20, r21, r22)
            java.util.Date r2 = r16.getTime()
            long r2 = r2.getTime()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
        L10b:
            java.lang.Long r3 = r1.l
            if (r3 == 0) goto L11b
            long r13 = r3.longValue()
            long r13 = r13 / r11
            long r13 = r13 - r9
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
        L119:
            r11 = r3
            goto L12b
        L11b:
            java.lang.Integer r1 = r1.o
            if (r1 == 0) goto L12a
            int r1 = r1.intValue()
            long r9 = (long) r1
            long r9 = r9 * r13
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            goto L119
        L12a:
            r11 = 0
        L12b:
            r7 = 0
            r9 = r0
            r10 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r4
    }

    @Override // defpackage.db2
    public final defpackage.wf3 F(defpackage.lt4 r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "not implemented yet!"
            r0.<init>(r1)
            throw r0
    }

    @Override // defpackage.db2
    public final defpackage.ui6 J(defpackage.lt4 r1) {
            r0 = this;
            r1.getClass()
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "zip file systems are read-only"
            r0.<init>(r1)
            throw r0
    }

    @Override // defpackage.db2
    public final defpackage.in6 N(defpackage.lt4 r9) {
            r8 = this;
            r9.getClass()
            lt4 r0 = defpackage.ky7.X
            r0.getClass()
            r1 = 1
            lt4 r0 = defpackage.f.b(r0, r9, r1)
            java.util.LinkedHashMap r2 = r8.R
            java.lang.Object r0 = r2.get(r0)
            jy7 r0 = (defpackage.jy7) r0
            r2 = 0
            if (r0 == 0) goto L72
            long r3 = r0.f
            db2 r9 = r8.L
            lt4 r8 = r8.B
            wf3 r8 = r9.F(r8)
            long r5 = r0.h     // Catch: java.lang.Throwable -> L34
            va2 r9 = r8.e(r5)     // Catch: java.lang.Throwable -> L34
            fe5 r5 = new fe5     // Catch: java.lang.Throwable -> L34
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L34
            r8.close()     // Catch: java.lang.Throwable -> L32
            r8 = r2
            goto L41
        L32:
            r8 = move-exception
            goto L41
        L34:
            r9 = move-exception
            if (r8 == 0) goto L3f
            r8.close()     // Catch: java.lang.Throwable -> L3b
            goto L3f
        L3b:
            r8 = move-exception
            defpackage.mb3.q(r9, r8)
        L3f:
            r8 = r9
            r5 = r2
        L41:
            if (r8 != 0) goto L71
            r5.getClass()
            defpackage.vs7.e(r5, r2)
            int r8 = r0.g
            if (r8 != 0) goto L53
            id2 r8 = new id2
            r8.<init>(r5, r3, r1)
            goto L70
        L53:
            h53 r8 = new h53
            id2 r9 = new id2
            long r6 = r0.e
            r9.<init>(r5, r6, r1)
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>(r1)
            fe5 r1 = new fe5
            r1.<init>(r9)
            r8.<init>(r1, r0)
            id2 r9 = new id2
            r0 = 0
            r9.<init>(r8, r3, r0)
            r8 = r9
        L70:
            return r8
        L71:
            throw r8
        L72:
            java.lang.String r8 = "no such file: "
            defpackage.e41.u(r9, r8)
            return r2
    }

    @Override // defpackage.db2
    public final defpackage.ui6 e(defpackage.lt4 r1) {
            r0 = this;
            r1.getClass()
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "zip file systems are read-only"
            r0.<init>(r1)
            throw r0
    }

    @Override // defpackage.db2
    public final void h(defpackage.lt4 r1, defpackage.lt4 r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "zip file systems are read-only"
            r0.<init>(r1)
            throw r0
    }

    @Override // defpackage.db2
    public final void n(defpackage.lt4 r1) {
            r0 = this;
            r1.getClass()
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "zip file systems are read-only"
            r0.<init>(r1)
            throw r0
    }

    @Override // defpackage.db2
    public final void r(defpackage.lt4 r1) {
            r0 = this;
            r1.getClass()
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "zip file systems are read-only"
            r0.<init>(r1)
            throw r0
    }

    @Override // defpackage.db2
    public final java.util.List x(defpackage.lt4 r3) {
            r2 = this;
            r3.getClass()
            lt4 r0 = defpackage.ky7.X
            r0.getClass()
            r1 = 1
            lt4 r0 = defpackage.f.b(r0, r3, r1)
            java.util.LinkedHashMap r2 = r2.R
            java.lang.Object r2 = r2.get(r0)
            jy7 r2 = (defpackage.jy7) r2
            if (r2 == 0) goto L1e
            java.util.ArrayList r2 = r2.q
            java.util.List r2 = defpackage.gt0.k1(r2)
            return r2
        L1e:
            java.lang.String r2 = "not a directory: "
            defpackage.fa6.d(r3, r2)
            r2 = 0
            return r2
    }
}
