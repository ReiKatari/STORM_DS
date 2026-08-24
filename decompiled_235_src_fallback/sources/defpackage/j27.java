package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j27  reason: default package */
/* loaded from: classes.dex */
public final class j27 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.p27 Z;

    public /* synthetic */ j27(defpackage.p27 r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.Z = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            int r0 = r4.X
            jg7 r1 = defpackage.jg7.a
            switch(r0) {
                case 0: goto L25;
                case 1: goto L16;
                default: goto L7;
            }
        L7:
            w61 r5 = (defpackage.w61) r5
            r41 r6 = (defpackage.r41) r6
            r41 r4 = r4.q(r6, r5)
            j27 r4 = (defpackage.j27) r4
            java.lang.Object r4 = r4.s(r1)
            return r4
        L16:
            w61 r5 = (defpackage.w61) r5
            r41 r6 = (defpackage.r41) r6
            r41 r4 = r4.q(r6, r5)
            j27 r4 = (defpackage.j27) r4
            java.lang.Object r4 = r4.s(r1)
            return r4
        L25:
            jk4 r5 = (defpackage.jk4) r5
            long r2 = r5.a
            r41 r6 = (defpackage.r41) r6
            j27 r5 = new j27
            p27 r4 = r4.Z
            r0 = 0
            r5.<init>(r4, r6, r0)
            java.lang.Object r4 = r5.s(r1)
            return r4
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            p27 r2 = r2.Z
            switch(r0) {
                case 0: goto L15;
                case 1: goto Le;
                default: goto L7;
            }
        L7:
            j27 r4 = new j27
            r0 = 2
            r4.<init>(r2, r3, r0)
            return r4
        Le:
            j27 r4 = new j27
            r0 = 1
            r4.<init>(r2, r3, r0)
            return r4
        L15:
            j27 r0 = new j27
            r1 = 0
            r0.<init>(r2, r3, r1)
            jk4 r4 = (defpackage.jk4) r4
            long r2 = r4.a
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r46) {
            r45 = this;
            r0 = r45
            int r1 = r0.X
            r2 = 2
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            p27 r5 = r0.Z
            jg7 r6 = defpackage.jg7.a
            switch(r1) {
                case 0: goto L3ec;
                case 1: goto L347;
                default: goto Lf;
            }
        Lf:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r8 = r0.Y
            if (r8 == 0) goto L2c
            if (r8 == r4) goto L26
            if (r8 != r2) goto L20
            defpackage.oi2.Y(r46)
            r0 = r46
            goto L2d2
        L20:
            defpackage.i.m(r3)
            r6 = 0
            goto L346
        L26:
            defpackage.oi2.Y(r46)
            r8 = r46
            goto L4e
        L2c:
            defpackage.oi2.Y(r46)
            tr0 r3 = r5.h
            if (r3 == 0) goto L346
            r0.Y = r4
            ce r3 = (defpackage.ce) r3
            de r3 = r3.a
            android.content.ClipboardManager r3 = r3.a()
            android.content.ClipData r3 = r3.getPrimaryClip()
            if (r3 == 0) goto L49
            sr0 r8 = new sr0
            r8.<init>(r3)
            goto L4a
        L49:
            r8 = 0
        L4a:
            if (r8 != r1) goto L4e
            goto L2d0
        L4e:
            sr0 r8 = (defpackage.sr0) r8
            if (r8 == 0) goto L346
            r0.Y = r2
            android.content.ClipData r0 = r8.a
            r3 = 0
            android.content.ClipData$Item r0 = r0.getItemAt(r3)
            if (r0 == 0) goto L2cd
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L2cd
            boolean r8 = r0 instanceof android.text.Spanned
            if (r8 != 0) goto L73
            fp r2 = new fp
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r0 = r2
            goto L2ce
        L73:
            r8 = r0
            android.text.Spanned r8 = (android.text.Spanned) r8
            int r9 = r8.length()
            java.lang.Class<android.text.Annotation> r10 = android.text.Annotation.class
            java.lang.Object[] r9 = r8.getSpans(r3, r9, r10)
            android.text.Annotation[] r9 = (android.text.Annotation[]) r9
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r9.getClass()
            int r11 = r9.length
            int r11 = r11 - r4
            if (r11 < 0) goto L2b6
            r12 = r3
        L8f:
            r13 = r9[r12]
            java.lang.String r14 = r13.getKey()
            java.lang.String r15 = "androidx.compose.text.SpanStyle"
            boolean r14 = defpackage.nb3.k(r14, r15)
            if (r14 != 0) goto La3
            r46 = r0
            r45 = r3
            goto L2aa
        La3:
            int r14 = r8.getSpanStart(r13)
            int r15 = r8.getSpanEnd(r13)
            pc1 r7 = new pc1
            java.lang.String r13 = r13.getValue()
            r7.<init>()
            android.os.Parcel r2 = android.os.Parcel.obtain()
            r7.a = r2
            byte[] r13 = android.util.Base64.decode(r13, r3)
            int r4 = r13.length
            r2.unmarshall(r13, r3, r4)
            r2.setDataPosition(r3)
            android.os.Parcel r2 = r7.a
            long r16 = defpackage.kt0.h
            long r18 = defpackage.x47.c
            r21 = r16
            r35 = r21
            r23 = r18
            r30 = r23
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r32 = 0
            r33 = 0
            r37 = 0
            r38 = 0
        Le3:
            int r4 = r2.dataAvail()
            r13 = 1
            if (r4 <= r13) goto L290
            byte r4 = r2.readByte()
            r45 = r3
            r3 = 8
            if (r4 != r13) goto L105
            int r4 = r2.dataAvail()
            if (r4 < r3) goto L101
            long r21 = r7.a()
        Lfe:
            r3 = r45
            goto Le3
        L101:
            r46 = r0
            goto L294
        L105:
            r13 = 5
            r3 = 2
            if (r4 != r3) goto L114
            int r3 = r2.dataAvail()
            if (r3 < r13) goto L101
            long r23 = r7.b()
            goto Lfe
        L114:
            r3 = 3
            r13 = 4
            if (r4 != r3) goto L12a
            int r3 = r2.dataAvail()
            if (r3 < r13) goto L101
            oj2 r3 = new oj2
            int r4 = r2.readInt()
            r3.<init>(r4)
            r25 = r3
            goto Lfe
        L12a:
            if (r4 != r13) goto L149
            int r3 = r2.dataAvail()
            r4 = 1
            if (r3 < r4) goto L101
            byte r3 = r2.readByte()
            if (r3 != 0) goto L13c
        L139:
            r3 = r45
            goto L13f
        L13c:
            if (r3 != r4) goto L139
            r3 = r4
        L13f:
            ij2 r13 = new ij2
            r13.<init>(r3)
            r3 = r45
            r26 = r13
            goto Le3
        L149:
            r3 = 5
            r13 = 1
            if (r4 != r3) goto L176
            int r3 = r2.dataAvail()
            if (r3 < r13) goto L101
            byte r3 = r2.readByte()
            if (r3 != 0) goto L15c
        L159:
            r3 = r45
            goto L16b
        L15c:
            if (r3 != r13) goto L162
            r3 = 65535(0xffff, float:9.1834E-41)
            goto L16b
        L162:
            r4 = 3
            if (r3 != r4) goto L167
            r3 = 2
            goto L16b
        L167:
            r4 = 2
            if (r3 != r4) goto L159
            r3 = 1
        L16b:
            jj2 r4 = new jj2
            r4.<init>(r3)
            r3 = r45
            r27 = r4
            goto Le3
        L176:
            r3 = 6
            if (r4 != r3) goto L17e
            java.lang.String r29 = r2.readString()
            goto Lfe
        L17e:
            r3 = 7
            if (r4 != r3) goto L18e
            int r3 = r2.dataAvail()
            r4 = 5
            if (r3 < r4) goto L101
            long r30 = r7.b()
            goto Lfe
        L18e:
            r3 = 8
            if (r4 != r3) goto L1a8
            int r3 = r2.dataAvail()
            r4 = 4
            if (r3 < r4) goto L101
            float r3 = r2.readFloat()
            x20 r4 = new x20
            r4.<init>(r3)
            r3 = r45
            r32 = r4
            goto Le3
        L1a8:
            r13 = 9
            if (r4 != r13) goto L1c3
            int r4 = r2.dataAvail()
            if (r4 < r3) goto L101
            f37 r3 = new f37
            float r4 = r2.readFloat()
            float r13 = r2.readFloat()
            r3.<init>(r4, r13)
            r33 = r3
            goto Lfe
        L1c3:
            r13 = 10
            if (r4 != r13) goto L1d3
            int r4 = r2.dataAvail()
            if (r4 < r3) goto L101
            long r35 = r7.a()
            goto Lfe
        L1d3:
            r3 = 11
            if (r4 != r3) goto L249
            int r3 = r2.dataAvail()
            r4 = 4
            if (r3 < r4) goto L101
            int r3 = r2.readInt()
            r4 = r3 & 2
            if (r4 == 0) goto L1e8
            r4 = 1
            goto L1ea
        L1e8:
            r4 = r45
        L1ea:
            r3 = r3 & 1
            if (r3 == 0) goto L1f0
            r3 = 1
            goto L1f2
        L1f0:
            r3 = r45
        L1f2:
            b17 r13 = defpackage.b17.d
            r46 = r0
            b17 r0 = defpackage.b17.c
            if (r4 == 0) goto L236
            if (r3 == 0) goto L236
            b17[] r0 = new defpackage.b17[]{r13, r0}
            java.util.List r0 = defpackage.hf.c0(r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r45)
            int r4 = r0.size()
            r13 = r45
        L20e:
            if (r13 >= r4) goto L22a
            java.lang.Object r16 = r0.get(r13)
            r17 = r0
            r0 = r16
            b17 r0 = (defpackage.b17) r0
            int r3 = r3.intValue()
            int r0 = r0.a
            r0 = r0 | r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            int r13 = r13 + 1
            r0 = r17
            goto L20e
        L22a:
            int r0 = r3.intValue()
            b17 r3 = new b17
            r3.<init>(r0)
            r37 = r3
            goto L243
        L236:
            if (r4 == 0) goto L23b
            r37 = r13
            goto L243
        L23b:
            if (r3 == 0) goto L240
        L23d:
            r37 = r0
            goto L243
        L240:
            b17 r0 = defpackage.b17.b
            goto L23d
        L243:
            r3 = r45
            r0 = r46
            goto Le3
        L249:
            r46 = r0
            r0 = 12
            if (r4 != r0) goto L243
            int r0 = r2.dataAvail()
            r3 = 20
            if (r0 < r3) goto L294
            ge6 r39 = new ge6
            long r41 = r7.a()
            float r0 = r2.readFloat()
            float r3 = r2.readFloat()
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r4 = r2
            r13 = r3
            long r2 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r13)
            r16 = r2
            long r2 = (long) r0
            r0 = 32
            long r16 = r16 << r0
            r18 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r18
            long r43 = r16 | r2
            float r40 = r4.readFloat()
            r39.<init>(r40, r41, r43)
            r3 = r45
            r0 = r46
            r2 = r4
            r38 = r39
            goto Le3
        L290:
            r46 = r0
            r45 = r3
        L294:
            nn6 r20 = new nn6
            r39 = 49152(0xc000, float:6.8877E-41)
            r28 = 0
            r34 = 0
            r20.<init>(r21, r23, r25, r26, r27, r28, r29, r30, r32, r33, r34, r35, r37, r38, r39)
            r0 = r20
            ep r2 = new ep
            r2.<init>(r0, r14, r15)
            r10.add(r2)
        L2aa:
            if (r12 == r11) goto L2b8
            int r12 = r12 + 1
            r3 = r45
            r0 = r46
            r2 = 2
            r4 = 1
            goto L8f
        L2b6:
            r46 = r0
        L2b8:
            fp r0 = new fp
            java.lang.String r2 = r46.toString()
            fp r3 = defpackage.gp.a
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L2c8
            r7 = 0
            goto L2c9
        L2c8:
            r7 = r10
        L2c9:
            r0.<init>(r7, r2)
            goto L2ce
        L2cd:
            r0 = 0
        L2ce:
            if (r0 != r1) goto L2d2
        L2d0:
            r6 = r1
            goto L346
        L2d2:
            fp r0 = (defpackage.fp) r0
            if (r0 != 0) goto L2d7
            goto L346
        L2d7:
            boolean r1 = r5.j()
            if (r1 != 0) goto L2de
            goto L346
        L2de:
            c37 r1 = r5.n()
            c37 r2 = r5.n()
            fp r2 = r2.a
            java.lang.String r2 = r2.B
            int r2 = r2.length()
            fp r1 = defpackage.ln2.D(r1, r2)
            dp r2 = new dp
            r2.<init>(r1)
            r2.a(r0)
            fp r1 = r2.f()
            c37 r2 = r5.n()
            c37 r3 = r5.n()
            fp r3 = r3.a
            java.lang.String r3 = r3.B
            int r3 = r3.length()
            fp r2 = defpackage.ln2.C(r2, r3)
            dp r3 = new dp
            r3.<init>(r1)
            r3.a(r2)
            fp r1 = r3.f()
            c37 r2 = r5.n()
            long r2 = r2.b
            int r2 = defpackage.k47.f(r2)
            java.lang.String r0 = r0.B
            int r0 = r0.length()
            int r0 = r0 + r2
            long r2 = defpackage.jx2.f(r0, r0)
            c37 r0 = defpackage.p27.e(r1, r2)
            qn2 r1 = r5.c
            r1.g(r0)
            hv2 r0 = defpackage.hv2.None
            r5.q(r0)
            fg7 r0 = r5.a
            r13 = 1
            r0.e = r13
        L346:
            return r6
        L347:
            r13 = r4
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            if (r2 == 0) goto L35b
            if (r2 != r13) goto L355
            defpackage.oi2.Y(r46)
            goto L3eb
        L355:
            defpackage.i.m(r3)
            r6 = 0
            goto L3eb
        L35b:
            defpackage.oi2.Y(r46)
            c37 r2 = r5.n()
            long r2 = r2.b
            boolean r2 = defpackage.k47.c(r2)
            if (r2 != 0) goto L3d4
            boolean r2 = r5.j()
            if (r2 == 0) goto L3d4
            wq7 r2 = r5.f
            boolean r2 = r2 instanceof defpackage.jt4
            if (r2 != 0) goto L3d4
            c37 r2 = r5.n()
            fp r7 = defpackage.ln2.A(r2)
            c37 r2 = r5.n()
            c37 r3 = r5.n()
            fp r3 = r3.a
            java.lang.String r3 = r3.B
            int r3 = r3.length()
            fp r2 = defpackage.ln2.D(r2, r3)
            c37 r3 = r5.n()
            c37 r4 = r5.n()
            fp r4 = r4.a
            java.lang.String r4 = r4.B
            int r4 = r4.length()
            fp r3 = defpackage.ln2.C(r3, r4)
            dp r4 = new dp
            r4.<init>(r2)
            r4.a(r3)
            fp r2 = r4.f()
            c37 r3 = r5.n()
            long r3 = r3.b
            int r3 = defpackage.k47.f(r3)
            long r3 = defpackage.jx2.f(r3, r3)
            c37 r2 = defpackage.p27.e(r2, r3)
            qn2 r3 = r5.c
            r3.g(r2)
            hv2 r2 = defpackage.hv2.None
            r5.q(r2)
            fg7 r2 = r5.a
            r13 = 1
            r2.e = r13
            goto L3d6
        L3d4:
            r13 = 1
            r7 = 0
        L3d6:
            if (r7 != 0) goto L3d9
            goto L3eb
        L3d9:
            tr0 r2 = r5.h
            if (r2 == 0) goto L3eb
            sr0 r3 = defpackage.lb4.I(r7)
            r0.Y = r13
            ce r2 = (defpackage.ce) r2
            r2.a(r3)
            if (r6 != r1) goto L3eb
            r6 = r1
        L3eb:
            return r6
        L3ec:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r13 = 1
            if (r2 == 0) goto L405
            if (r2 == r13) goto L401
            r4 = 2
            if (r2 != r4) goto L3fc
            defpackage.oi2.Y(r46)
            goto L453
        L3fc:
            defpackage.i.m(r3)
            r6 = 0
            goto L453
        L401:
            defpackage.oi2.Y(r46)
            goto L411
        L405:
            defpackage.oi2.Y(r46)
            r0.Y = r13
            java.lang.Object r2 = r5.s(r0)
            if (r2 != r1) goto L411
            goto L452
        L411:
            vr4 r2 = defpackage.p27.a(r5)
            if (r2 == 0) goto L453
            java.lang.Object r3 = r2.A
            r12 = r3
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r2 = r2.B
            k47 r2 = (defpackage.k47) r2
            long r8 = r2.a
            zx4 r11 = r5.j
            if (r11 == 0) goto L453
            r4 = 2
            r0.Y = r4
            int r2 = r12.length()
            if (r2 != 0) goto L430
            goto L436
        L430:
            boolean r2 = defpackage.k47.c(r8)
            if (r2 == 0) goto L438
        L436:
            r0 = r6
            goto L44c
        L438:
            c0 r7 = new c0
            r10 = 0
            r7.<init>(r8, r10, r11, r12)
            l61 r2 = r11.a
            l5 r3 = new l5
            r4 = 24
            r5 = 0
            r3.<init>(r11, r7, r5, r4)
            java.lang.Object r0 = defpackage.hv.d0(r2, r3, r0)
        L44c:
            if (r0 != r1) goto L44f
            goto L450
        L44f:
            r0 = r6
        L450:
            if (r0 != r1) goto L453
        L452:
            r6 = r1
        L453:
            return r6
    }
}
