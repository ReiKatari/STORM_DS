package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gp2  reason: default package */
/* loaded from: classes.dex */
public final class gp2 {
    public static final defpackage.da5 a(defpackage.fp2 r32) {
            r0 = r32
            r0.getClass()
            long r1 = r0.a
            java.lang.String r3 = r0.b
            java.net.URI r4 = new java.net.URI
            java.lang.String r5 = r0.c
            r4.<init>(r5)
            java.net.URL r4 = r4.toURL()
            r4.getClass()
            java.lang.String r5 = r0.e
            java.util.List r0 = r0.f
            if (r0 == 0) goto L1ad
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r8 = defpackage.ht0.v0(r0, r7)
            r6.<init>(r8)
            java.util.Iterator r0 = r0.iterator()
        L2c:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L1aa
            java.lang.Object r8 = r0.next()
            b6 r8 = (defpackage.b6) r8
            long r12 = r8.d
            long r14 = r8.c
            java.lang.String r9 = r8.a
            java.lang.String r10 = r8.b
            int r11 = r10.hashCode()
            switch(r11) {
                case -1694759682: goto L7a;
                case 3059615: goto L6e;
                case 93921311: goto L62;
                case 1402633315: goto L56;
                case 1686617758: goto L48;
                default: goto L47;
            }
        L47:
            goto L82
        L48:
            java.lang.String r11 = "exclusive"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L51
            goto L82
        L51:
            r75 r10 = defpackage.r75.Exclusive
        L53:
            r26 = r10
            goto L88
        L56:
            java.lang.String r11 = "challenge"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L5f
            goto L82
        L5f:
            r75 r10 = defpackage.r75.Challenge
            goto L53
        L62:
            java.lang.String r11 = "bonus"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L6b
            goto L82
        L6b:
            r75 r10 = defpackage.r75.Bonus
            goto L53
        L6e:
            java.lang.String r11 = "core"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L77
            goto L82
        L77:
            r75 r10 = defpackage.r75.Core
            goto L53
        L7a:
            java.lang.String r11 = "specialty"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L85
        L82:
            r75 r10 = defpackage.r75.Bonus
            goto L53
        L85:
            r75 r10 = defpackage.r75.Specialty
            goto L53
        L88:
            java.net.URI r10 = new java.net.URI
            java.lang.String r11 = r8.e
            r10.<init>(r11)
            java.net.URL r27 = r10.toURL()
            r27.getClass()
            java.util.List r10 = r8.f
            java.util.ArrayList r11 = new java.util.ArrayList
            r32 = r0
            int r0 = defpackage.ht0.v0(r10, r7)
            r11.<init>(r0)
            java.util.Iterator r0 = r10.iterator()
        La7:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L13c
            java.lang.Object r10 = r0.next()
            i3 r10 = (defpackage.i3) r10
            r10.getClass()
            r16 = r9
            o75 r9 = new o75
            r28 = r8
            long r7 = r10.a
            r29 = r0
            java.lang.Integer r0 = r10.b
            r17 = r0
            java.lang.Integer r0 = r10.c
            r18 = r0
            java.lang.String r0 = r10.d
            r19 = r0
            java.lang.String r0 = r10.e
            r20 = r0
            int r0 = r10.f
            r21 = r0
            java.lang.String r0 = r10.j
            if (r0 == 0) goto Le5
            java.lang.Integer r0 = defpackage.xs6.h0(r0)
            if (r0 == 0) goto Le5
            int r0 = r0.intValue()
        Le2:
            r22 = r0
            goto Le7
        Le5:
            r0 = 0
            goto Le2
        Le7:
            java.net.URI r0 = new java.net.URI
            r30 = r1
            java.lang.String r1 = r10.h
            r0.<init>(r1)
            java.net.URL r0 = r0.toURL()
            r0.getClass()
            java.net.URI r1 = new java.net.URI
            java.lang.String r2 = r10.i
            r1.<init>(r2)
            java.net.URL r23 = r1.toURL()
            r23.getClass()
            java.lang.String r1 = r10.k
            int r2 = r10.g
            r10 = 3
            if (r2 != r10) goto L127
            n75 r2 = defpackage.n75.CORE
        L10e:
            r10 = r22
            r22 = r0
            r0 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r10
            r24 = r1
            r25 = r2
            r1 = r11
            r10 = r7
            goto L12a
        L127:
            n75 r2 = defpackage.n75.UNOFFICIAL
            goto L10e
        L12a:
            r9.<init>(r10, r12, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1.add(r9)
            r9 = r0
            r11 = r1
            r8 = r28
            r0 = r29
            r1 = r30
            r7 = 10
            goto La7
        L13c:
            r30 = r1
            r0 = r9
            r1 = r11
            java.util.List r2 = r8.g
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r9 = defpackage.ht0.v0(r2, r8)
            r7.<init>(r9)
            java.util.Iterator r2 = r2.iterator()
        L151:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L18d
            java.lang.Object r9 = r2.next()
            os3 r9 = (defpackage.os3) r9
            r9.getClass()
            ta5 r10 = new ta5
            r16 = r10
            long r10 = r9.a
            java.lang.String r8 = r9.b
            r22 = r0
            java.lang.String r0 = r9.c
            r17 = r0
            boolean r0 = r9.d
            r18 = r0
            java.lang.String r0 = r9.e
            r19 = r0
            java.lang.String r0 = r9.f
            boolean r9 = r9.g
            r20 = r0
            r21 = r9
            r9 = r16
            r16 = r8
            r9.<init>(r10, r12, r14, r16, r17, r18, r19, r20, r21)
            r7.add(r9)
            r0 = r22
            r8 = 10
            goto L151
        L18d:
            r22 = r0
            s75 r9 = new s75
            r17 = r1
            r18 = r7
            r10 = r14
            r15 = r22
            r14 = r26
            r16 = r27
            r9.<init>(r10, r12, r14, r15, r16, r17, r18)
            r6.add(r9)
            r0 = r32
            r1 = r30
            r7 = 10
            goto L2c
        L1aa:
            r30 = r1
            goto L1b0
        L1ad:
            r30 = r1
            r6 = 0
        L1b0:
            if (r6 != 0) goto L1b4
            yt1 r6 = defpackage.yt1.A
        L1b4:
            da5 r0 = new da5
            r1 = r30
            r0.<init>(r1, r3, r4, r5, r6)
            return r0
    }
}
