package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xj5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xj5 extends defpackage.po2 implements defpackage.qn2 {
    public final /* synthetic */ int d0;

    public /* synthetic */ xj5(int r1, java.lang.Object r2, java.lang.Class r3, java.lang.String r4, java.lang.String r5, int r6, int r7, int r8) {
            r0 = this;
            r0.d0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            int r1 = r0.d0
            r2 = 31
            r3 = 255(0xff, float:3.57E-43)
            jg7 r4 = defpackage.jg7.a
            r5 = 16
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r7 = 0
            r8 = 8
            r9 = 0
            java.lang.Object r0 = r0.B
            switch(r1) {
                case 0: goto L5e4;
                case 1: goto L5af;
                case 2: goto L58e;
                case 3: goto L561;
                case 4: goto L555;
                default: goto L17;
            }
        L17:
            r1 = r18
            wg3 r1 = (defpackage.wg3) r1
            android.view.KeyEvent r1 = r1.a
            v17 r0 = (defpackage.v17) r0
            j47 r2 = r0.f
            boolean r3 = r0.d
            int r4 = r1.getAction()
            r5 = 1
            if (r4 != 0) goto L8b
            int r4 = r1.getUnicodeChar()
            boolean r4 = java.lang.Character.isISOControl(r4)
            if (r4 != 0) goto L8b
            fc1 r4 = r0.i
            r4.getClass()
            int r6 = r1.getUnicodeChar()
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r10 & r6
            if (r10 == 0) goto L4e
            r10 = 2147483647(0x7fffffff, float:NaN)
            r6 = r6 & r10
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.a = r6
            r4 = r9
            goto L72
        L4e:
            java.lang.Integer r10 = r4.a
            if (r10 == 0) goto L6e
            r4.a = r9
            int r4 = r10.intValue()
            int r4 = android.view.KeyCharacterMap.getDeadChar(r4, r6)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            if (r4 != 0) goto L63
            r10 = r9
        L63:
            if (r10 == 0) goto L69
            int r6 = r10.intValue()
        L69:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            goto L72
        L6e:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
        L72:
            if (r4 == 0) goto L8b
            int r4 = r4.intValue()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r4 = r6.appendCodePoint(r4)
            java.lang.String r4 = r4.toString()
            pu0 r6 = new pu0
            r6.<init>(r4, r5)
            goto L8c
        L8b:
            r6 = r9
        L8c:
            if (r6 == 0) goto L9c
            if (r3 == 0) goto L550
            java.util.List r1 = defpackage.hf.b0(r6)
            r0.a(r1)
            r2.a = r9
            r7 = r5
            goto L550
        L9c:
            int r4 = defpackage.xk2.u(r1)
            r6 = 2
            if (r4 != r6) goto L550
            w31 r4 = r0.j
            r4.getClass()
            int r4 = defpackage.kn2.G(r1)
            r10 = 9
            if (r4 != r10) goto Le7
            int r4 = r1.getKeyCode()
            long r10 = defpackage.qo2.e(r4)
            long r12 = defpackage.kg3.f
            boolean r4 = defpackage.kg3.a(r10, r12)
            if (r4 == 0) goto Lc4
            og3 r4 = defpackage.og3.SELECT_LINE_LEFT
            goto L127
        Lc4:
            long r12 = defpackage.kg3.g
            boolean r4 = defpackage.kg3.a(r10, r12)
            if (r4 == 0) goto Lcf
            og3 r4 = defpackage.og3.SELECT_LINE_RIGHT
            goto L127
        Lcf:
            long r12 = defpackage.kg3.d
            boolean r4 = defpackage.kg3.a(r10, r12)
            if (r4 == 0) goto Lda
            og3 r4 = defpackage.og3.SELECT_HOME
            goto L127
        Lda:
            long r12 = defpackage.kg3.e
            boolean r4 = defpackage.kg3.a(r10, r12)
            if (r4 == 0) goto Le5
            og3 r4 = defpackage.og3.SELECT_END
            goto L127
        Le5:
            r4 = r9
            goto L127
        Le7:
            if (r4 != r5) goto Le5
            int r4 = r1.getKeyCode()
            long r10 = defpackage.qo2.e(r4)
            long r12 = defpackage.kg3.f
            boolean r4 = defpackage.kg3.a(r10, r12)
            if (r4 == 0) goto Lfc
            og3 r4 = defpackage.og3.LINE_LEFT
            goto L127
        Lfc:
            long r12 = defpackage.kg3.g
            boolean r4 = defpackage.kg3.a(r10, r12)
            if (r4 == 0) goto L107
            og3 r4 = defpackage.og3.LINE_RIGHT
            goto L127
        L107:
            long r12 = defpackage.kg3.d
            boolean r4 = defpackage.kg3.a(r10, r12)
            if (r4 == 0) goto L112
            og3 r4 = defpackage.og3.HOME
            goto L127
        L112:
            long r12 = defpackage.kg3.e
            boolean r4 = defpackage.kg3.a(r10, r12)
            if (r4 == 0) goto L11d
            og3 r4 = defpackage.og3.END
            goto L127
        L11d:
            long r12 = defpackage.kg3.u
            boolean r4 = defpackage.kg3.a(r10, r12)
            if (r4 == 0) goto Le5
            og3 r4 = defpackage.og3.DELETE_FROM_LINE_START
        L127:
            if (r4 != 0) goto L4fd
            int r4 = defpackage.kn2.G(r1)
            int r10 = r1.getKeyCode()
            long r10 = defpackage.qo2.e(r10)
            long r12 = defpackage.kg3.u
            boolean r12 = defpackage.kg3.a(r10, r12)
            r13 = 10
            if (r12 == 0) goto L156
            if (r4 != 0) goto L142
            goto L149
        L142:
            if (r4 != r8) goto L145
            goto L149
        L145:
            r10 = 12
            if (r4 != r10) goto L14c
        L149:
            og3 r4 = defpackage.og3.DELETE_PREV_CHAR
            goto L173
        L14c:
            if (r4 != r6) goto L14f
            goto L151
        L14f:
            if (r4 != r13) goto L154
        L151:
            og3 r4 = defpackage.og3.DELETE_PREV_WORD
            goto L173
        L154:
            r4 = r9
            goto L173
        L156:
            long r14 = defpackage.kg3.t
            boolean r12 = defpackage.kg3.a(r10, r14)
            if (r12 != 0) goto L166
            long r14 = defpackage.kg3.N
            boolean r10 = defpackage.kg3.a(r10, r14)
            if (r10 == 0) goto L154
        L166:
            if (r4 != 0) goto L169
            goto L171
        L169:
            if (r4 != r8) goto L16c
            goto L171
        L16c:
            if (r4 != r6) goto L16f
            goto L171
        L16f:
            if (r4 != r13) goto L154
        L171:
            og3 r4 = defpackage.og3.NEW_LINE
        L173:
            if (r4 == 0) goto L177
            goto L4fd
        L177:
            int r4 = defpackage.kn2.G(r1)
            if (r4 != r13) goto L1dc
            int r4 = r1.getKeyCode()
            long r10 = defpackage.qo2.e(r4)
            long r14 = defpackage.kg3.f
            boolean r4 = defpackage.kg3.a(r10, r14)
            if (r4 != 0) goto L1d8
            long r14 = defpackage.kg3.Q
            boolean r4 = defpackage.kg3.a(r10, r14)
            if (r4 == 0) goto L196
            goto L1d8
        L196:
            long r14 = defpackage.kg3.g
            boolean r4 = defpackage.kg3.a(r10, r14)
            if (r4 != 0) goto L1d4
            long r14 = defpackage.kg3.R
            boolean r4 = defpackage.kg3.a(r10, r14)
            if (r4 == 0) goto L1a7
            goto L1d4
        L1a7:
            long r14 = defpackage.kg3.d
            boolean r4 = defpackage.kg3.a(r10, r14)
            if (r4 != 0) goto L1d0
            long r14 = defpackage.kg3.O
            boolean r4 = defpackage.kg3.a(r10, r14)
            if (r4 == 0) goto L1b8
            goto L1d0
        L1b8:
            long r14 = defpackage.kg3.e
            boolean r4 = defpackage.kg3.a(r10, r14)
            if (r4 != 0) goto L1cc
            long r14 = defpackage.kg3.P
            boolean r4 = defpackage.kg3.a(r10, r14)
            if (r4 == 0) goto L1c9
            goto L1cc
        L1c9:
            r4 = r9
            goto L29d
        L1cc:
            og3 r4 = defpackage.og3.SELECT_NEXT_PARAGRAPH
            goto L29d
        L1d0:
            og3 r4 = defpackage.og3.SELECT_PREV_PARAGRAPH
            goto L29d
        L1d4:
            og3 r4 = defpackage.og3.SELECT_RIGHT_WORD
            goto L29d
        L1d8:
            og3 r4 = defpackage.og3.SELECT_LEFT_WORD
            goto L29d
        L1dc:
            if (r4 != r6) goto L258
            int r4 = r1.getKeyCode()
            long r10 = defpackage.qo2.e(r4)
            long r14 = defpackage.kg3.f
            boolean r4 = defpackage.kg3.a(r10, r14)
            if (r4 != 0) goto L255
            long r14 = defpackage.kg3.Q
            boolean r4 = defpackage.kg3.a(r10, r14)
            if (r4 == 0) goto L1f7
            goto L255
        L1f7:
            long r14 = defpackage.kg3.g
            boolean r4 = defpackage.kg3.a(r10, r14)
            if (r4 != 0) goto L252
            long r14 = defpackage.kg3.R
            boolean r4 = defpackage.kg3.a(r10, r14)
            if (r4 == 0) goto L208
            goto L252
        L208:
            long r14 = defpackage.kg3.d
            boolean r4 = defpackage.kg3.a(r10, r14)
            if (r4 != 0) goto L24f
            long r14 = defpackage.kg3.O
            boolean r4 = defpackage.kg3.a(r10, r14)
            if (r4 == 0) goto L219
            goto L24f
        L219:
            long r14 = defpackage.kg3.e
            boolean r4 = defpackage.kg3.a(r10, r14)
            if (r4 != 0) goto L24c
            long r14 = defpackage.kg3.P
            boolean r4 = defpackage.kg3.a(r10, r14)
            if (r4 == 0) goto L22a
            goto L24c
        L22a:
            long r14 = defpackage.kg3.m
            boolean r4 = defpackage.kg3.a(r10, r14)
            if (r4 == 0) goto L236
            og3 r4 = defpackage.og3.DELETE_PREV_CHAR
            goto L29d
        L236:
            long r14 = defpackage.kg3.v
            boolean r4 = defpackage.kg3.a(r10, r14)
            if (r4 == 0) goto L241
            og3 r4 = defpackage.og3.DELETE_NEXT_WORD
            goto L29d
        L241:
            long r14 = defpackage.kg3.D
            boolean r4 = defpackage.kg3.a(r10, r14)
            if (r4 == 0) goto L1c9
            og3 r4 = defpackage.og3.DESELECT
            goto L29d
        L24c:
            og3 r4 = defpackage.og3.NEXT_PARAGRAPH
            goto L29d
        L24f:
            og3 r4 = defpackage.og3.PREV_PARAGRAPH
            goto L29d
        L252:
            og3 r4 = defpackage.og3.RIGHT_WORD
            goto L29d
        L255:
            og3 r4 = defpackage.og3.LEFT_WORD
            goto L29d
        L258:
            if (r4 != r8) goto L289
            int r4 = r1.getKeyCode()
            long r10 = defpackage.qo2.e(r4)
            long r14 = defpackage.kg3.x
            boolean r4 = defpackage.kg3.a(r10, r14)
            if (r4 != 0) goto L286
            long r14 = defpackage.kg3.S
            boolean r4 = defpackage.kg3.a(r10, r14)
            if (r4 == 0) goto L273
            goto L286
        L273:
            long r14 = defpackage.kg3.y
            boolean r4 = defpackage.kg3.a(r10, r14)
            if (r4 != 0) goto L283
            long r14 = defpackage.kg3.T
            boolean r4 = defpackage.kg3.a(r10, r14)
            if (r4 == 0) goto L1c9
        L283:
            og3 r4 = defpackage.og3.SELECT_LINE_END
            goto L29d
        L286:
            og3 r4 = defpackage.og3.SELECT_LINE_START
            goto L29d
        L289:
            if (r4 != r5) goto L1c9
            int r4 = r1.getKeyCode()
            long r10 = defpackage.qo2.e(r4)
            long r14 = defpackage.kg3.v
            boolean r4 = defpackage.kg3.a(r10, r14)
            if (r4 == 0) goto L1c9
            og3 r4 = defpackage.og3.DELETE_TO_LINE_END
        L29d:
            if (r4 != 0) goto L4fd
            s63 r4 = defpackage.dh3.a
            java.lang.Object r4 = r4.B
            int r4 = defpackage.kn2.G(r1)
            if (r4 != r13) goto L2bd
            int r1 = r1.getKeyCode()
            long r10 = defpackage.qo2.e(r1)
            long r12 = defpackage.kg3.q
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L4fc
            og3 r9 = defpackage.og3.REDO
            goto L4fc
        L2bd:
            if (r4 != r6) goto L320
            int r1 = r1.getKeyCode()
            long r10 = defpackage.qo2.e(r1)
            long r12 = defpackage.kg3.l
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 != 0) goto L31c
            long r12 = defpackage.kg3.z
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 != 0) goto L31c
            long r12 = defpackage.kg3.W
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L2e0
            goto L31c
        L2e0:
            long r12 = defpackage.kg3.n
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L2ec
            og3 r9 = defpackage.og3.PASTE
            goto L4fc
        L2ec:
            long r12 = defpackage.kg3.o
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L2f8
            og3 r9 = defpackage.og3.CUT
            goto L4fc
        L2f8:
            long r12 = defpackage.kg3.k
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L304
            og3 r9 = defpackage.og3.SELECT_ALL
            goto L4fc
        L304:
            long r12 = defpackage.kg3.p
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L310
            og3 r9 = defpackage.og3.REDO
            goto L4fc
        L310:
            long r12 = defpackage.kg3.q
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L4fc
            og3 r9 = defpackage.og3.UNDO
            goto L4fc
        L31c:
            og3 r9 = defpackage.og3.COPY
            goto L4fc
        L320:
            if (r4 != r8) goto L3ea
            int r1 = r1.getKeyCode()
            long r10 = defpackage.qo2.e(r1)
            long r12 = defpackage.kg3.f
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 != 0) goto L3e6
            long r12 = defpackage.kg3.Q
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L33c
            goto L3e6
        L33c:
            long r12 = defpackage.kg3.g
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 != 0) goto L3e2
            long r12 = defpackage.kg3.R
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L34e
            goto L3e2
        L34e:
            long r12 = defpackage.kg3.d
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 != 0) goto L3de
            long r12 = defpackage.kg3.O
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L360
            goto L3de
        L360:
            long r12 = defpackage.kg3.e
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 != 0) goto L3da
            long r12 = defpackage.kg3.P
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L372
            goto L3da
        L372:
            long r12 = defpackage.kg3.F
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 != 0) goto L3d6
            long r12 = defpackage.kg3.U
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L383
            goto L3d6
        L383:
            long r12 = defpackage.kg3.G
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 != 0) goto L3d2
            long r12 = defpackage.kg3.V
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L394
            goto L3d2
        L394:
            long r12 = defpackage.kg3.x
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 != 0) goto L3ce
            long r12 = defpackage.kg3.S
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L3a5
            goto L3ce
        L3a5:
            long r12 = defpackage.kg3.y
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 != 0) goto L3ca
            long r12 = defpackage.kg3.T
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L3b6
            goto L3ca
        L3b6:
            long r12 = defpackage.kg3.z
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 != 0) goto L3c6
            long r12 = defpackage.kg3.W
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L4fc
        L3c6:
            og3 r9 = defpackage.og3.PASTE
            goto L4fc
        L3ca:
            og3 r9 = defpackage.og3.SELECT_LINE_END
            goto L4fc
        L3ce:
            og3 r9 = defpackage.og3.SELECT_LINE_START
            goto L4fc
        L3d2:
            og3 r9 = defpackage.og3.SELECT_PAGE_DOWN
            goto L4fc
        L3d6:
            og3 r9 = defpackage.og3.SELECT_PAGE_UP
            goto L4fc
        L3da:
            og3 r9 = defpackage.og3.SELECT_DOWN
            goto L4fc
        L3de:
            og3 r9 = defpackage.og3.SELECT_UP
            goto L4fc
        L3e2:
            og3 r9 = defpackage.og3.SELECT_RIGHT_CHAR
            goto L4fc
        L3e6:
            og3 r9 = defpackage.og3.SELECT_LEFT_CHAR
            goto L4fc
        L3ea:
            if (r4 != 0) goto L4fc
            int r1 = r1.getKeyCode()
            long r10 = defpackage.qo2.e(r1)
            long r12 = defpackage.kg3.f
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 != 0) goto L4fa
            long r12 = defpackage.kg3.Q
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L406
            goto L4fa
        L406:
            long r12 = defpackage.kg3.g
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 != 0) goto L4f7
            long r12 = defpackage.kg3.R
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L418
            goto L4f7
        L418:
            long r12 = defpackage.kg3.d
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 != 0) goto L4f4
            long r12 = defpackage.kg3.O
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L42a
            goto L4f4
        L42a:
            long r12 = defpackage.kg3.e
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 != 0) goto L4f1
            long r12 = defpackage.kg3.P
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L43c
            goto L4f1
        L43c:
            long r12 = defpackage.kg3.h
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L448
            og3 r9 = defpackage.og3.CENTER
            goto L4fc
        L448:
            long r12 = defpackage.kg3.F
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 != 0) goto L4ee
            long r12 = defpackage.kg3.U
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L45a
            goto L4ee
        L45a:
            long r12 = defpackage.kg3.G
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 != 0) goto L4eb
            long r12 = defpackage.kg3.V
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L46c
            goto L4eb
        L46c:
            long r12 = defpackage.kg3.x
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 != 0) goto L4e8
            long r12 = defpackage.kg3.S
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L47e
            goto L4e8
        L47e:
            long r12 = defpackage.kg3.y
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 != 0) goto L4e5
            long r12 = defpackage.kg3.T
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L48f
            goto L4e5
        L48f:
            long r12 = defpackage.kg3.t
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 != 0) goto L4e2
            long r12 = defpackage.kg3.N
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L4a0
            goto L4e2
        L4a0:
            long r12 = defpackage.kg3.u
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L4ab
            og3 r9 = defpackage.og3.DELETE_PREV_CHAR
            goto L4fc
        L4ab:
            long r12 = defpackage.kg3.v
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L4b6
            og3 r9 = defpackage.og3.DELETE_NEXT_CHAR
            goto L4fc
        L4b6:
            long r12 = defpackage.kg3.C
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L4c1
            og3 r9 = defpackage.og3.PASTE
            goto L4fc
        L4c1:
            long r12 = defpackage.kg3.A
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L4cc
            og3 r9 = defpackage.og3.CUT
            goto L4fc
        L4cc:
            long r12 = defpackage.kg3.B
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L4d7
            og3 r9 = defpackage.og3.COPY
            goto L4fc
        L4d7:
            long r12 = defpackage.kg3.r
            boolean r1 = defpackage.kg3.a(r10, r12)
            if (r1 == 0) goto L4fc
            og3 r9 = defpackage.og3.TAB
            goto L4fc
        L4e2:
            og3 r9 = defpackage.og3.NEW_LINE
            goto L4fc
        L4e5:
            og3 r9 = defpackage.og3.LINE_END
            goto L4fc
        L4e8:
            og3 r9 = defpackage.og3.LINE_START
            goto L4fc
        L4eb:
            og3 r9 = defpackage.og3.PAGE_DOWN
            goto L4fc
        L4ee:
            og3 r9 = defpackage.og3.PAGE_UP
            goto L4fc
        L4f1:
            og3 r9 = defpackage.og3.DOWN
            goto L4fc
        L4f4:
            og3 r9 = defpackage.og3.UP
            goto L4fc
        L4f7:
            og3 r9 = defpackage.og3.RIGHT_CHAR
            goto L4fc
        L4fa:
            og3 r9 = defpackage.og3.LEFT_CHAR
        L4fc:
            r4 = r9
        L4fd:
            if (r4 == 0) goto L550
            boolean r1 = r4.getEditsText()
            if (r1 == 0) goto L508
            if (r3 != 0) goto L508
            goto L550
        L508:
            zg5 r1 = new zg5
            r1.<init>()
            r1.A = r5
            t00 r3 = new t00
            r6 = 29
            r3.<init>(r4, r0, r1, r6)
            b27 r4 = new b27
            c37 r6 = r0.c
            mk4 r7 = r0.g
            jt3 r8 = r0.a
            b47 r8 = r8.d()
            r4.<init>(r6, r7, r8, r2)
            r3.g(r4)
            long r2 = r4.f
            long r7 = r6.b
            boolean r2 = defpackage.k47.b(r2, r7)
            fp r3 = r4.g
            if (r2 == 0) goto L53c
            fp r2 = r6.a
            boolean r2 = defpackage.nb3.k(r3, r2)
            if (r2 != 0) goto L548
        L53c:
            qn2 r2 = r0.k
            long r7 = r4.f
            r4 = 4
            c37 r3 = defpackage.c37.a(r6, r3, r7, r4)
            r2.g(r3)
        L548:
            fg7 r0 = r0.h
            if (r0 == 0) goto L54e
            r0.e = r5
        L54e:
            boolean r7 = r1.A
        L550:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        L555:
            r1 = r18
            qn2 r1 = (defpackage.qn2) r1
            j07 r0 = (defpackage.j07) r0
            ca4 r0 = r0.b
            r0.a(r1)
            return r4
        L561:
            r1 = r18
            jk4 r1 = (defpackage.jk4) r1
            long r12 = r1.a
            r11 = r0
            q07 r11 = (defpackage.q07) r11
            r11.getClass()
            py0 r0 = defpackage.v07.a
            java.lang.Object r0 = defpackage.hf.K(r11, r0)
            r14 = r0
            u07 r14 = (defpackage.u07) r14
            if (r14 != 0) goto L579
            goto L58d
        L579:
            p07 r15 = new p07
            r15.<init>(r11, r12)
            w61 r0 = r11.F0()
            c0 r10 = new c0
            r16 = 0
            r10.<init>(r11, r12, r14, r15, r16)
            r1 = 3
            defpackage.hv.L(r0, r9, r9, r10, r1)
        L58d:
            return r4
        L58e:
            r1 = r18
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            yj5 r0 = (defpackage.yj5) r0
            r0.getClass()
            r0 = r1 & 255(0xff, float:3.57E-43)
            int r0 = defpackage.gi2.q(r0, r7, r2)
            int r0 = r0 * r3
            int r0 = r0 / r2
            int r1 = r0 << 16
            r1 = r1 | r6
            int r2 = r0 << 8
            r1 = r1 | r2
            r0 = r0 | r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L5af:
            r1 = r18
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            yj5 r0 = (defpackage.yj5) r0
            r0.getClass()
            int r0 = r1 >>> 24
            r0 = r0 & 63
            int r0 = r0 * r3
            int r0 = r0 / 63
            r4 = 4194304(0x400000, float:5.877472E-39)
            r4 = r4 & r1
            if (r4 == 0) goto L5ca
            r4 = r3
            goto L5cb
        L5ca:
            r4 = r7
        L5cb:
            r9 = 32768(0x8000, float:4.5918E-41)
            r9 = r9 & r1
            if (r9 == 0) goto L5d2
            r7 = r3
        L5d2:
            r1 = r1 & r2
            int r1 = r1 * r3
            int r1 = r1 / r2
            int r0 = r0 << r5
            r0 = r0 | r6
            int r2 = r7 << 8
            r0 = r0 | r2
            int r1 = java.lang.Math.max(r1, r4)
            r0 = r0 | r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L5e4:
            r1 = r18
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            yj5 r0 = (defpackage.yj5) r0
            r0.getClass()
            long r0 = (long) r1
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            long r9 = r2 >>> r5
            r11 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r11
            int r4 = (int) r9
            long r2 = r2 >>> r8
            long r2 = r2 & r11
            int r2 = (int) r2
            long r0 = r0 & r11
            int r0 = (int) r0
            int r1 = r4 << 16
            r1 = r1 | r6
            int r2 = r2 << r8
            r1 = r1 | r2
            r0 = r0 | r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }
}
