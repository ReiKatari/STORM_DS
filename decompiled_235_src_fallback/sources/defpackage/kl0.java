package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kl0  reason: default package */
/* loaded from: classes.dex */
public final class kl0 extends defpackage.ct7 {
    public final java.util.ArrayList k;
    public int l;

    public kl0(defpackage.l21 r6, int r7) {
            r5 = this;
            r5.<init>(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.k = r6
            r5.f = r7
            l21 r0 = r5.b
            l21 r7 = r0.n(r7)
        L12:
            r4 = r0
            r0 = r7
            r7 = r4
            if (r0 == 0) goto L1e
            int r7 = r5.f
            l21 r7 = r0.n(r7)
            goto L12
        L1e:
            r5.b = r7
            int r0 = r5.f
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L29
            ly2 r0 = r7.d
            goto L2f
        L29:
            if (r0 != r2) goto L2e
            lm7 r0 = r7.e
            goto L2f
        L2e:
            r0 = r1
        L2f:
            r6.add(r0)
            int r0 = r5.f
            l21 r7 = r7.m(r0)
        L38:
            if (r7 == 0) goto L51
            int r0 = r5.f
            if (r0 != 0) goto L41
            ly2 r0 = r7.d
            goto L47
        L41:
            if (r0 != r2) goto L46
            lm7 r0 = r7.e
            goto L47
        L46:
            r0 = r1
        L47:
            r6.add(r0)
            int r0 = r5.f
            l21 r7 = r7.m(r0)
            goto L38
        L51:
            int r7 = r6.size()
            r0 = 0
        L56:
            if (r0 >= r7) goto L70
            java.lang.Object r1 = r6.get(r0)
            int r0 = r0 + 1
            ct7 r1 = (defpackage.ct7) r1
            int r3 = r5.f
            if (r3 != 0) goto L69
            l21 r1 = r1.b
            r1.b = r5
            goto L56
        L69:
            if (r3 != r2) goto L56
            l21 r1 = r1.b
            r1.c = r5
            goto L56
        L70:
            int r7 = r5.f
            if (r7 != 0) goto L93
            l21 r7 = r5.b
            l21 r7 = r7.U
            m21 r7 = (defpackage.m21) r7
            boolean r7 = r7.y0
            if (r7 == 0) goto L93
            int r7 = r6.size()
            if (r7 <= r2) goto L93
            int r7 = r6.size()
            int r7 = r7 - r2
            java.lang.Object r6 = r6.get(r7)
            ct7 r6 = (defpackage.ct7) r6
            l21 r6 = r6.b
            r5.b = r6
        L93:
            int r6 = r5.f
            l21 r7 = r5.b
            if (r6 != 0) goto L9c
            int r6 = r7.k0
            goto L9e
        L9c:
            int r6 = r7.l0
        L9e:
            r5.l = r6
            return
    }

    @Override // defpackage.xh1
    public final void a(defpackage.xh1 r27) {
            r26 = this;
            r0 = r26
            ci1 r1 = r0.h
            boolean r2 = r1.j
            if (r2 == 0) goto L3b9
            ci1 r2 = r0.i
            boolean r3 = r2.j
            if (r3 != 0) goto L10
            goto L3b9
        L10:
            l21 r3 = r0.b
            l21 r3 = r3.U
            boolean r4 = r3 instanceof defpackage.m21
            if (r4 == 0) goto L1d
            m21 r3 = (defpackage.m21) r3
            boolean r3 = r3.y0
            goto L1e
        L1d:
            r3 = 0
        L1e:
            int r4 = r2.g
            int r6 = r1.g
            int r4 = r4 - r6
            java.util.ArrayList r6 = r0.k
            int r7 = r6.size()
            r8 = 0
        L2a:
            r9 = -1
            r10 = 8
            if (r8 >= r7) goto L3e
            java.lang.Object r11 = r6.get(r8)
            ct7 r11 = (defpackage.ct7) r11
            l21 r11 = r11.b
            int r11 = r11.h0
            if (r11 != r10) goto L3f
            int r8 = r8 + 1
            goto L2a
        L3e:
            r8 = r9
        L3f:
            int r11 = r7 + (-1)
            r12 = r11
        L42:
            if (r12 < 0) goto L54
            java.lang.Object r13 = r6.get(r12)
            ct7 r13 = (defpackage.ct7) r13
            l21 r13 = r13.b
            int r13 = r13.h0
            if (r13 != r10) goto L53
            int r12 = r12 + (-1)
            goto L42
        L53:
            r9 = r12
        L54:
            r12 = 0
        L55:
            r14 = 2
            if (r12 >= r14) goto L107
            r27 = 0
            r5 = 0
            r13 = 0
            r16 = 0
            r17 = 0
            r18 = 0
        L62:
            if (r13 >= r7) goto Lf3
            java.lang.Object r19 = r6.get(r13)
            r14 = r19
            ct7 r14 = (defpackage.ct7) r14
            l21 r15 = r14.b
            r21 = r3
            int r3 = r15.h0
            if (r3 != r10) goto L76
            goto Lea
        L76:
            int r17 = r17 + 1
            if (r13 <= 0) goto L81
            if (r13 < r8) goto L81
            ci1 r3 = r14.h
            int r3 = r3.f
            int r5 = r5 + r3
        L81:
            rj1 r3 = r14.e
            int r10 = r3.g
            r22 = r5
            k21 r5 = r14.d
            r23 = r10
            k21 r10 = defpackage.k21.MATCH_CONSTRAINT
            if (r5 == r10) goto L91
            r5 = 1
            goto L92
        L91:
            r5 = 0
        L92:
            if (r5 == 0) goto Lb2
            int r3 = r0.f
            if (r3 != 0) goto La2
            ly2 r10 = r15.d
            rj1 r10 = r10.e
            boolean r10 = r10.j
            if (r10 != 0) goto La2
            goto L3b9
        La2:
            r10 = 1
            if (r3 != r10) goto Laf
            lm7 r3 = r15.e
            rj1 r3 = r3.e
            boolean r3 = r3.j
            if (r3 != 0) goto Laf
            goto L3b9
        Laf:
            r24 = r5
            goto Lc9
        Lb2:
            r24 = r5
            r10 = 1
            int r5 = r14.a
            if (r5 != r10) goto Lc2
            if (r12 != 0) goto Lc2
            int r10 = r3.m
            int r16 = r16 + 1
        Lbf:
            r24 = 1
            goto Lcb
        Lc2:
            boolean r3 = r3.j
            if (r3 == 0) goto Lc9
            r10 = r23
            goto Lbf
        Lc9:
            r10 = r23
        Lcb:
            if (r24 != 0) goto Lde
            int r16 = r16 + 1
            float[] r3 = r15.m0
            int r5 = r0.f
            r3 = r3[r5]
            int r5 = (r3 > r27 ? 1 : (r3 == r27 ? 0 : -1))
            if (r5 < 0) goto Ldb
            float r18 = r18 + r3
        Ldb:
            r5 = r22
            goto Le0
        Lde:
            int r5 = r22 + r10
        Le0:
            if (r13 >= r11) goto Lea
            if (r13 >= r9) goto Lea
            ci1 r3 = r14.i
            int r3 = r3.f
            int r3 = -r3
            int r5 = r5 + r3
        Lea:
            int r13 = r13 + 1
            r3 = r21
            r10 = 8
            r14 = 2
            goto L62
        Lf3:
            r21 = r3
            if (r5 < r4) goto L102
            if (r16 != 0) goto Lfa
            goto L102
        Lfa:
            int r12 = r12 + 1
            r3 = r21
            r10 = 8
            goto L55
        L102:
            r3 = r16
            r10 = r17
            goto L110
        L107:
            r21 = r3
            r27 = 0
            r18 = r27
            r3 = 0
            r5 = 0
            r10 = 0
        L110:
            int r1 = r1.g
            if (r21 == 0) goto L116
            int r1 = r2.g
        L116:
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r5 <= r4) goto L12d
            r12 = 1073741824(0x40000000, float:2.0)
            if (r21 == 0) goto L126
            int r13 = r5 - r4
            float r13 = (float) r13
            float r13 = r13 / r12
            float r13 = r13 + r2
            int r12 = (int) r13
            int r1 = r1 + r12
            goto L12d
        L126:
            int r13 = r5 - r4
            float r13 = (float) r13
            float r13 = r13 / r12
            float r13 = r13 + r2
            int r12 = (int) r13
            int r1 = r1 - r12
        L12d:
            if (r3 <= 0) goto L1ff
            int r12 = r4 - r5
            float r12 = (float) r12
            float r13 = (float) r3
            float r13 = r12 / r13
            float r13 = r13 + r2
            int r13 = (int) r13
            r14 = 0
            r15 = 0
        L139:
            if (r14 >= r7) goto L1b4
            java.lang.Object r16 = r6.get(r14)
            r17 = r2
            r2 = r16
            ct7 r2 = (defpackage.ct7) r2
            r16 = r1
            l21 r1 = r2.b
            r22 = r3
            rj1 r3 = r2.e
            r23 = r5
            int r5 = r1.h0
            r24 = r12
            r12 = 8
            if (r5 != r12) goto L15a
        L157:
            r25 = r13
            goto L1a5
        L15a:
            k21 r5 = r2.d
            k21 r12 = defpackage.k21.MATCH_CONSTRAINT
            if (r5 != r12) goto L157
            boolean r5 = r3.j
            if (r5 != 0) goto L157
            int r5 = (r18 > r27 ? 1 : (r18 == r27 ? 0 : -1))
            if (r5 <= 0) goto L176
            float[] r5 = r1.m0
            int r12 = r0.f
            r5 = r5[r12]
            float r5 = r5 * r24
            float r5 = r5 / r18
            float r5 = r5 + r17
            int r5 = (int) r5
            goto L177
        L176:
            r5 = r13
        L177:
            int r12 = r0.f
            if (r12 != 0) goto L180
            int r12 = r1.v
            int r1 = r1.u
            goto L184
        L180:
            int r12 = r1.y
            int r1 = r1.x
        L184:
            int r2 = r2.a
            r25 = r13
            r13 = 1
            if (r2 != r13) goto L192
            int r2 = r3.m
            int r2 = java.lang.Math.min(r5, r2)
            goto L193
        L192:
            r2 = r5
        L193:
            int r1 = java.lang.Math.max(r1, r2)
            if (r12 <= 0) goto L19d
            int r1 = java.lang.Math.min(r12, r1)
        L19d:
            if (r1 == r5) goto L1a2
            int r15 = r15 + 1
            r5 = r1
        L1a2:
            r3.d(r5)
        L1a5:
            int r14 = r14 + 1
            r1 = r16
            r2 = r17
            r3 = r22
            r5 = r23
            r12 = r24
            r13 = r25
            goto L139
        L1b4:
            r16 = r1
            r17 = r2
            r22 = r3
            r23 = r5
            if (r15 <= 0) goto L1ee
            int r3 = r22 - r15
            r1 = 0
            r5 = 0
        L1c2:
            if (r1 >= r7) goto L1f2
            java.lang.Object r2 = r6.get(r1)
            ct7 r2 = (defpackage.ct7) r2
            l21 r12 = r2.b
            int r12 = r12.h0
            r13 = 8
            if (r12 != r13) goto L1d3
            goto L1eb
        L1d3:
            if (r1 <= 0) goto L1dc
            if (r1 < r8) goto L1dc
            ci1 r12 = r2.h
            int r12 = r12.f
            int r5 = r5 + r12
        L1dc:
            rj1 r12 = r2.e
            int r12 = r12.g
            int r5 = r5 + r12
            if (r1 >= r11) goto L1eb
            if (r1 >= r9) goto L1eb
            ci1 r2 = r2.i
            int r2 = r2.f
            int r2 = -r2
            int r5 = r5 + r2
        L1eb:
            int r1 = r1 + 1
            goto L1c2
        L1ee:
            r3 = r22
            r5 = r23
        L1f2:
            int r1 = r0.l
            r2 = 2
            if (r1 != r2) goto L1fd
            if (r15 != 0) goto L1fd
            r1 = 0
            r0.l = r1
            goto L209
        L1fd:
            r1 = 0
            goto L209
        L1ff:
            r16 = r1
            r17 = r2
            r22 = r3
            r23 = r5
            r1 = 0
            r2 = 2
        L209:
            if (r5 <= r4) goto L20d
            r0.l = r2
        L20d:
            if (r10 <= 0) goto L215
            if (r3 != 0) goto L215
            if (r8 != r9) goto L215
            r0.l = r2
        L215:
            int r2 = r0.l
            r13 = 1
            if (r2 != r13) goto L2a4
            if (r10 <= r13) goto L220
            int r4 = r4 - r5
            int r10 = r10 - r13
            int r4 = r4 / r10
            goto L229
        L220:
            if (r10 != r13) goto L228
            int r4 = r4 - r5
            r20 = 2
            int r4 = r4 / 2
            goto L229
        L228:
            r4 = r1
        L229:
            if (r3 <= 0) goto L22c
            r4 = r1
        L22c:
            r5 = r1
            r1 = r16
        L22f:
            if (r5 >= r7) goto L3b9
            if (r21 == 0) goto L238
            int r0 = r5 + 1
            int r0 = r7 - r0
            goto L239
        L238:
            r0 = r5
        L239:
            java.lang.Object r0 = r6.get(r0)
            ct7 r0 = (defpackage.ct7) r0
            l21 r2 = r0.b
            ci1 r3 = r0.i
            ci1 r10 = r0.h
            int r2 = r2.h0
            r12 = 8
            if (r2 != r12) goto L252
            r10.d(r1)
            r3.d(r1)
            goto L2a1
        L252:
            if (r5 <= 0) goto L259
            if (r21 == 0) goto L258
            int r1 = r1 - r4
            goto L259
        L258:
            int r1 = r1 + r4
        L259:
            if (r5 <= 0) goto L266
            if (r5 < r8) goto L266
            if (r21 == 0) goto L263
            int r2 = r10.f
            int r1 = r1 - r2
            goto L266
        L263:
            int r2 = r10.f
            int r1 = r1 + r2
        L266:
            if (r21 == 0) goto L26c
            r3.d(r1)
            goto L26f
        L26c:
            r10.d(r1)
        L26f:
            rj1 r2 = r0.e
            int r12 = r2.g
            k21 r13 = r0.d
            k21 r14 = defpackage.k21.MATCH_CONSTRAINT
            if (r13 != r14) goto L280
            int r13 = r0.a
            r14 = 1
            if (r13 != r14) goto L280
            int r12 = r2.m
        L280:
            if (r21 == 0) goto L284
            int r1 = r1 - r12
            goto L285
        L284:
            int r1 = r1 + r12
        L285:
            if (r21 == 0) goto L28c
            r10.d(r1)
        L28a:
            r13 = 1
            goto L290
        L28c:
            r3.d(r1)
            goto L28a
        L290:
            r0.g = r13
            if (r5 >= r11) goto L2a1
            if (r5 >= r9) goto L2a1
            if (r21 == 0) goto L29d
            int r0 = r3.f
            int r0 = -r0
            int r1 = r1 - r0
            goto L2a1
        L29d:
            int r0 = r3.f
            int r0 = -r0
            int r1 = r1 + r0
        L2a1:
            int r5 = r5 + 1
            goto L22f
        L2a4:
            if (r2 != 0) goto L325
            int r4 = r4 - r5
            r19 = 1
            int r10 = r10 + 1
            int r4 = r4 / r10
            if (r3 <= 0) goto L2af
            r4 = r1
        L2af:
            r5 = r1
            r1 = r16
        L2b2:
            if (r5 >= r7) goto L3b9
            if (r21 == 0) goto L2bb
            int r0 = r5 + 1
            int r0 = r7 - r0
            goto L2bc
        L2bb:
            r0 = r5
        L2bc:
            java.lang.Object r0 = r6.get(r0)
            ct7 r0 = (defpackage.ct7) r0
            l21 r2 = r0.b
            ci1 r3 = r0.i
            ci1 r10 = r0.h
            int r2 = r2.h0
            r12 = 8
            if (r2 != r12) goto L2d5
            r10.d(r1)
            r3.d(r1)
            goto L322
        L2d5:
            if (r21 == 0) goto L2d9
            int r1 = r1 - r4
            goto L2da
        L2d9:
            int r1 = r1 + r4
        L2da:
            if (r5 <= 0) goto L2e7
            if (r5 < r8) goto L2e7
            if (r21 == 0) goto L2e4
            int r2 = r10.f
            int r1 = r1 - r2
            goto L2e7
        L2e4:
            int r2 = r10.f
            int r1 = r1 + r2
        L2e7:
            if (r21 == 0) goto L2ed
            r3.d(r1)
            goto L2f0
        L2ed:
            r10.d(r1)
        L2f0:
            rj1 r2 = r0.e
            int r12 = r2.g
            k21 r13 = r0.d
            k21 r14 = defpackage.k21.MATCH_CONSTRAINT
            if (r13 != r14) goto L305
            int r0 = r0.a
            r13 = 1
            if (r0 != r13) goto L305
            int r0 = r2.m
            int r12 = java.lang.Math.min(r12, r0)
        L305:
            if (r21 == 0) goto L309
            int r1 = r1 - r12
            goto L30a
        L309:
            int r1 = r1 + r12
        L30a:
            if (r21 == 0) goto L310
            r10.d(r1)
            goto L313
        L310:
            r3.d(r1)
        L313:
            if (r5 >= r11) goto L322
            if (r5 >= r9) goto L322
            if (r21 == 0) goto L31e
            int r0 = r3.f
            int r0 = -r0
            int r1 = r1 - r0
            goto L322
        L31e:
            int r0 = r3.f
            int r0 = -r0
            int r1 = r1 + r0
        L322:
            int r5 = r5 + 1
            goto L2b2
        L325:
            r10 = 2
            if (r2 != r10) goto L3b9
            int r2 = r0.f
            l21 r0 = r0.b
            if (r2 != 0) goto L331
            float r0 = r0.e0
            goto L333
        L331:
            float r0 = r0.f0
        L333:
            if (r21 == 0) goto L339
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = r2 - r0
        L339:
            int r4 = r4 - r5
            float r2 = (float) r4
            float r2 = r2 * r0
            float r2 = r2 + r17
            int r0 = (int) r2
            if (r0 < 0) goto L343
            if (r3 <= 0) goto L344
        L343:
            r0 = r1
        L344:
            if (r21 == 0) goto L349
            int r0 = r16 - r0
            goto L34b
        L349:
            int r0 = r16 + r0
        L34b:
            r5 = r1
        L34c:
            if (r5 >= r7) goto L3b9
            if (r21 == 0) goto L355
            int r1 = r5 + 1
            int r1 = r7 - r1
            goto L356
        L355:
            r1 = r5
        L356:
            java.lang.Object r1 = r6.get(r1)
            ct7 r1 = (defpackage.ct7) r1
            l21 r2 = r1.b
            ci1 r3 = r1.i
            ci1 r4 = r1.h
            int r2 = r2.h0
            r12 = 8
            if (r2 != r12) goto L370
            r4.d(r0)
            r3.d(r0)
            r13 = 1
            goto L3b6
        L370:
            if (r5 <= 0) goto L37d
            if (r5 < r8) goto L37d
            if (r21 == 0) goto L37a
            int r2 = r4.f
            int r0 = r0 - r2
            goto L37d
        L37a:
            int r2 = r4.f
            int r0 = r0 + r2
        L37d:
            if (r21 == 0) goto L383
            r3.d(r0)
            goto L386
        L383:
            r4.d(r0)
        L386:
            rj1 r2 = r1.e
            int r10 = r2.g
            k21 r13 = r1.d
            k21 r14 = defpackage.k21.MATCH_CONSTRAINT
            if (r13 != r14) goto L398
            int r1 = r1.a
            r13 = 1
            if (r1 != r13) goto L399
            int r10 = r2.m
            goto L399
        L398:
            r13 = 1
        L399:
            if (r21 == 0) goto L39d
            int r0 = r0 - r10
            goto L39e
        L39d:
            int r0 = r0 + r10
        L39e:
            if (r21 == 0) goto L3a4
            r4.d(r0)
            goto L3a7
        L3a4:
            r3.d(r0)
        L3a7:
            if (r5 >= r11) goto L3b6
            if (r5 >= r9) goto L3b6
            if (r21 == 0) goto L3b2
            int r1 = r3.f
            int r1 = -r1
            int r0 = r0 - r1
            goto L3b6
        L3b2:
            int r1 = r3.f
            int r1 = -r1
            int r0 = r0 + r1
        L3b6:
            int r5 = r5 + 1
            goto L34c
        L3b9:
            return
    }

    @Override // defpackage.ct7
    public final void d() {
            r7 = this;
            java.util.ArrayList r0 = r7.k
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L16
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            ct7 r4 = (defpackage.ct7) r4
            r4.d()
            goto L8
        L16:
            int r1 = r0.size()
            r3 = 1
            if (r1 >= r3) goto L1e
            return
        L1e:
            java.lang.Object r4 = r0.get(r2)
            ct7 r4 = (defpackage.ct7) r4
            l21 r4 = r4.b
            int r1 = r1 - r3
            java.lang.Object r0 = r0.get(r1)
            ct7 r0 = (defpackage.ct7) r0
            l21 r0 = r0.b
            int r1 = r7.f
            ci1 r5 = r7.i
            ci1 r6 = r7.h
            if (r1 != 0) goto L6f
            h11 r1 = r4.I
            h11 r0 = r0.K
            ci1 r3 = defpackage.ct7.i(r1, r2)
            int r1 = r1.e()
            l21 r4 = r7.m()
            if (r4 == 0) goto L4f
            h11 r1 = r4.I
            int r1 = r1.e()
        L4f:
            if (r3 == 0) goto L54
            defpackage.ct7.b(r6, r3, r1)
        L54:
            ci1 r1 = defpackage.ct7.i(r0, r2)
            int r0 = r0.e()
            l21 r2 = r7.n()
            if (r2 == 0) goto L68
            h11 r0 = r2.K
            int r0 = r0.e()
        L68:
            if (r1 == 0) goto La6
            int r0 = -r0
            defpackage.ct7.b(r5, r1, r0)
            goto La6
        L6f:
            h11 r1 = r4.J
            h11 r0 = r0.L
            ci1 r2 = defpackage.ct7.i(r1, r3)
            int r1 = r1.e()
            l21 r4 = r7.m()
            if (r4 == 0) goto L87
            h11 r1 = r4.J
            int r1 = r1.e()
        L87:
            if (r2 == 0) goto L8c
            defpackage.ct7.b(r6, r2, r1)
        L8c:
            ci1 r1 = defpackage.ct7.i(r0, r3)
            int r0 = r0.e()
            l21 r2 = r7.n()
            if (r2 == 0) goto La0
            h11 r0 = r2.L
            int r0 = r0.e()
        La0:
            if (r1 == 0) goto La6
            int r0 = -r0
            defpackage.ct7.b(r5, r1, r0)
        La6:
            r6.a = r7
            r5.a = r7
            return
    }

    @Override // defpackage.ct7
    public final void e() {
            r3 = this;
            r0 = 0
        L1:
            java.util.ArrayList r1 = r3.k
            int r2 = r1.size()
            if (r0 >= r2) goto L15
            java.lang.Object r1 = r1.get(r0)
            ct7 r1 = (defpackage.ct7) r1
            r1.e()
            int r0 = r0 + 1
            goto L1
        L15:
            return
    }

    @Override // defpackage.ct7
    public final void f() {
            r3 = this;
            r0 = 0
            r3.c = r0
            java.util.ArrayList r3 = r3.k
            int r0 = r3.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L18
            java.lang.Object r2 = r3.get(r1)
            int r1 = r1 + 1
            ct7 r2 = (defpackage.ct7) r2
            r2.f()
            goto La
        L18:
            return
    }

    @Override // defpackage.ct7
    public final long j() {
            r7 = this;
            java.util.ArrayList r7 = r7.k
            int r0 = r7.size()
            r1 = 0
            r3 = 0
        L9:
            if (r3 >= r0) goto L25
            java.lang.Object r4 = r7.get(r3)
            ct7 r4 = (defpackage.ct7) r4
            ci1 r5 = r4.h
            int r5 = r5.f
            long r5 = (long) r5
            long r1 = r1 + r5
            long r5 = r4.j()
            long r5 = r5 + r1
            ci1 r1 = r4.i
            int r1 = r1.f
            long r1 = (long) r1
            long r1 = r1 + r5
            int r3 = r3 + 1
            goto L9
        L25:
            return r1
    }

    @Override // defpackage.ct7
    public final boolean k() {
            r4 = this;
            java.util.ArrayList r4 = r4.k
            int r0 = r4.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L1a
            java.lang.Object r3 = r4.get(r2)
            ct7 r3 = (defpackage.ct7) r3
            boolean r3 = r3.k()
            if (r3 != 0) goto L17
            return r1
        L17:
            int r2 = r2 + 1
            goto L8
        L1a:
            r4 = 1
            return r4
    }

    public final defpackage.l21 m() {
            r4 = this;
            r0 = 0
        L1:
            java.util.ArrayList r1 = r4.k
            int r2 = r1.size()
            if (r0 >= r2) goto L1b
            java.lang.Object r1 = r1.get(r0)
            ct7 r1 = (defpackage.ct7) r1
            l21 r1 = r1.b
            int r2 = r1.h0
            r3 = 8
            if (r2 == r3) goto L18
            return r1
        L18:
            int r0 = r0 + 1
            goto L1
        L1b:
            r4 = 0
            return r4
    }

    public final defpackage.l21 n() {
            r4 = this;
            java.util.ArrayList r4 = r4.k
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L1c
            java.lang.Object r1 = r4.get(r0)
            ct7 r1 = (defpackage.ct7) r1
            l21 r1 = r1.b
            int r2 = r1.h0
            r3 = 8
            if (r2 == r3) goto L19
            return r1
        L19:
            int r0 = r0 + (-1)
            goto L8
        L1c:
            r4 = 0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ChainRun "
            r0.<init>(r1)
            int r1 = r5.f
            if (r1 != 0) goto Le
            java.lang.String r1 = "horizontal : "
            goto L10
        Le:
            java.lang.String r1 = "vertical : "
        L10:
            r0.append(r1)
            java.util.ArrayList r5 = r5.k
            int r1 = r5.size()
            r2 = 0
        L1a:
            if (r2 >= r1) goto L32
            java.lang.Object r3 = r5.get(r2)
            int r2 = r2 + 1
            ct7 r3 = (defpackage.ct7) r3
            java.lang.String r4 = "<"
            r0.append(r4)
            r0.append(r3)
            java.lang.String r3 = "> "
            r0.append(r3)
            goto L1a
        L32:
            java.lang.String r5 = r0.toString()
            return r5
    }
}
