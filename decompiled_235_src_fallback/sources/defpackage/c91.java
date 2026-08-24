package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c91  reason: default package */
/* loaded from: classes.dex */
public final class c91 implements defpackage.fx1 {
    public float A;
    public float B;
    public int C;
    public int D;
    public final me.magnum.melonds.ui.emulator.EmulatorActivity a;
    public final java.lang.Object b;
    public defpackage.b36 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public defpackage.wd6 h;
    public defpackage.wd6 i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public final java.lang.Object o;
    public defpackage.t26 p;
    public boolean q;
    public me.magnum.melonds.domain.model.Rect r;
    public me.magnum.melonds.domain.model.Rect s;
    public float t;
    public float u;
    public boolean v;
    public me.magnum.melonds.domain.model.Rect w;
    public me.magnum.melonds.domain.model.Rect x;
    public float y;
    public boolean z;

    public c91(me.magnum.melonds.ui.emulator.EmulatorActivity r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.b = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.o = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.t = r1
            r0.u = r1
            r0.y = r1
            return
    }

    public static final void f(java.util.ArrayList r1, java.util.ArrayList r2, defpackage.b91 r3) {
            boolean r0 = r3.d
            if (r0 == 0) goto L8
            r1.add(r3)
            return
        L8:
            r2.add(r3)
            return
    }

    public final void a() {
            r36 = this;
            r0 = r36
            r1 = 12
            float[] r2 = new float[r1]
            r2 = {x0200: FILL_ARRAY_DATA  , data: [0, 1056877679, 0, 0, 1065353216, 0, 0, 1056877679, 1065353216, 0, 1065353216, 1056877679} // fill-array
            float[] r3 = new float[r1]
            r3 = {x021c: FILL_ARRAY_DATA  , data: [0, 1065353216, 0, 1057008072, 1065353216, 1057008072, 0, 1065353216, 1065353216, 1057008072, 1065353216, 1065353216} // fill-array
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            boolean r6 = r0.v
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L3b
            me.magnum.melonds.domain.model.Rect r6 = r0.r
            if (r6 == 0) goto L2c
            b91 r9 = new b91
            float r10 = r0.t
            r9.<init>(r6, r2, r10, r8)
            f(r5, r4, r9)
        L2c:
            me.magnum.melonds.domain.model.Rect r6 = r0.s
            if (r6 == 0) goto L57
            b91 r9 = new b91
            float r10 = r0.u
            r9.<init>(r6, r3, r10, r7)
            f(r5, r4, r9)
            goto L57
        L3b:
            me.magnum.melonds.domain.model.Rect r6 = r0.s
            if (r6 == 0) goto L49
            b91 r9 = new b91
            float r10 = r0.u
            r9.<init>(r6, r3, r10, r8)
            f(r5, r4, r9)
        L49:
            me.magnum.melonds.domain.model.Rect r6 = r0.r
            if (r6 == 0) goto L57
            b91 r9 = new b91
            float r10 = r0.t
            r9.<init>(r6, r2, r10, r7)
            f(r5, r4, r9)
        L57:
            me.magnum.melonds.domain.model.Rect r6 = r0.w
            if (r6 == 0) goto L67
            b91 r9 = new b91
            float r10 = r0.y
            boolean r11 = r0.z
            r9.<init>(r6, r2, r10, r11)
            f(r5, r4, r9)
        L67:
            me.magnum.melonds.domain.model.Rect r2 = r0.x
            if (r2 == 0) goto L77
            b91 r6 = new b91
            float r9 = r0.y
            boolean r10 = r0.z
            r6.<init>(r2, r3, r9, r10)
            f(r5, r4, r6)
        L77:
            java.util.ArrayList r2 = defpackage.gt0.V0(r4, r5)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r2.size()
            r5 = r8
        L85:
            r9 = 4
            if (r5 >= r4) goto L189
            java.lang.Object r10 = r2.get(r5)
            int r5 = r5 + 1
            b91 r10 = (defpackage.b91) r10
            me.magnum.melonds.domain.model.Rect r11 = r10.a
            float[] r12 = r10.b
            float r10 = r10.c
            int r13 = r11.getX()
            float r14 = r0.A
            r15 = 0
            int r16 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            r17 = 1065353216(0x3f800000, float:1.0)
            r18 = 1073741824(0x40000000, float:2.0)
            if (r16 > 0) goto La7
            r13 = r15
            goto Lad
        La7:
            float r13 = (float) r13
            float r13 = r13 / r14
            float r13 = r13 * r18
            float r13 = r13 - r17
        Lad:
            int r14 = r11.getX()
            int r16 = r11.getWidth()
            int r14 = r16 + r14
            r16 = r1
            float r1 = r0.A
            int r19 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r19 > 0) goto Lc1
            r14 = r15
            goto Lc7
        Lc1:
            float r14 = (float) r14
            float r14 = r14 / r1
            float r14 = r14 * r18
            float r14 = r14 - r17
        Lc7:
            int r1 = r11.getY()
            r19 = 5
            float r6 = r0.B
            int r20 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r20 > 0) goto Ld5
            r1 = r15
            goto Ldb
        Ld5:
            float r1 = (float) r1
            float r1 = r1 / r6
            float r1 = r1 * r18
            float r1 = r17 - r1
        Ldb:
            int r6 = r11.getY()
            int r11 = r11.getHeight()
            int r11 = r11 + r6
            float r6 = r0.B
            int r20 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r20 > 0) goto Leb
            goto Lf1
        Leb:
            float r11 = (float) r11
            float r11 = r11 / r6
            float r11 = r11 * r18
            float r15 = r17 - r11
        Lf1:
            r6 = r12[r8]
            r11 = r12[r7]
            r17 = 2
            r18 = r12[r17]
            r20 = 3
            r21 = r12[r20]
            r22 = r12[r9]
            r23 = r12[r19]
            r24 = 6
            r25 = r12[r24]
            r26 = 7
            r27 = r12[r26]
            r28 = 8
            r29 = r12[r28]
            r30 = 9
            r31 = r12[r30]
            r32 = 10
            r33 = r12[r32]
            r34 = 11
            r12 = r12[r34]
            r35 = r9
            r9 = 30
            float[] r9 = new float[r9]
            r9[r8] = r13
            r9[r7] = r15
            r9[r17] = r6
            r9[r20] = r11
            r9[r35] = r10
            r9[r19] = r13
            r9[r24] = r1
            r9[r26] = r18
            r9[r28] = r21
            r9[r30] = r10
            r9[r32] = r14
            r9[r34] = r1
            r9[r16] = r22
            r6 = 13
            r9[r6] = r23
            r6 = 14
            r9[r6] = r10
            r6 = 15
            r9[r6] = r13
            r6 = 16
            r9[r6] = r15
            r6 = 17
            r9[r6] = r25
            r6 = 18
            r9[r6] = r27
            r6 = 19
            r9[r6] = r10
            r6 = 20
            r9[r6] = r14
            r6 = 21
            r9[r6] = r1
            r1 = 22
            r9[r1] = r29
            r1 = 23
            r9[r1] = r31
            r1 = 24
            r9[r1] = r10
            r1 = 25
            r9[r1] = r14
            r1 = 26
            r9[r1] = r15
            r1 = 27
            r9[r1] = r33
            r1 = 28
            r9[r1] = r12
            r1 = 29
            r9[r1] = r10
            dv r1 = new dv
            r1.<init>(r9, r7)
            defpackage.gt0.A0(r3, r1)
            r1 = r16
            goto L85
        L189:
            r35 = r9
            r19 = 5
            float[] r1 = defpackage.gt0.i1(r3)
            int r2 = r1.length
            if (r2 != 0) goto L197
            r0.l = r8
            goto L1cb
        L197:
            int r2 = r1.length
            int r2 = r2 * 4
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r4 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r3 = r3.order(r4)
            java.nio.FloatBuffer r3 = r3.asFloatBuffer()
            r3.put(r1)
            r3.position(r8)
            int r1 = r0.k
            android.opengl.GLES30.glBindVertexArray(r1)
            int r1 = r0.j
            r4 = 34962(0x8892, float:4.8992E-41)
            android.opengl.GLES20.glBindBuffer(r4, r1)
            r1 = 35044(0x88e4, float:4.9107E-41)
            android.opengl.GLES20.glBufferData(r4, r2, r3, r1)
            int r1 = r3.capacity()
            int r1 = r1 / 5
            r0.l = r1
        L1cb:
            wd6 r1 = r0.h
            if (r1 == 0) goto L1de
            int r2 = r1.a
            android.opengl.GLES20.glDeleteShader(r2)
            int r2 = r1.b
            android.opengl.GLES20.glDeleteShader(r2)
            int r1 = r1.c
            android.opengl.GLES20.glDeleteProgram(r1)
        L1de:
            b36 r1 = r0.c
            if (r1 == 0) goto L1e6
            me.magnum.melonds.domain.model.VideoFiltering r1 = r1.b
            if (r1 != 0) goto L1e8
        L1e6:
            me.magnum.melonds.domain.model.VideoFiltering r1 = me.magnum.melonds.domain.model.VideoFiltering.NONE
        L1e8:
            java.util.Map r2 = defpackage.mm7.a
            r1.getClass()
            java.util.Map r2 = defpackage.mm7.a
            java.lang.Object r1 = r2.get(r1)
            fe6 r1 = (defpackage.fe6) r1
            if (r1 != 0) goto L1f9
            fe6 r1 = defpackage.fe6.e
        L1f9:
            wd6 r1 = defpackage.ej2.v(r1)
            r0.h = r1
            return
    }

    public final void b(defpackage.e25 r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            r1.getClass()
            java.lang.Object r2 = r0.b
            monitor-enter(r2)
            boolean r3 = r0.d     // Catch: java.lang.Throwable -> L15
            r4 = 0
            if (r3 == 0) goto L18
            r0.a()     // Catch: java.lang.Throwable -> L15
            r0.d = r4     // Catch: java.lang.Throwable -> L15
            goto L18
        L15:
            r0 = move-exception
            goto Lcd
        L18:
            monitor-exit(r2)
            float r2 = r0.A
            r3 = 0
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 <= 0) goto L2b
            float r5 = r0.B
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2b
            int r2 = (int) r2
            int r3 = (int) r5
            android.opengl.GLES20.glViewport(r4, r4, r2, r3)
        L2b:
            r2 = 16640(0x4100, float:2.3318E-41)
            android.opengl.GLES20.glClear(r2)
            boolean r2 = r1.a
            if (r2 != 0) goto L36
            goto Lc9
        L36:
            java.lang.Object r2 = r0.o
            monitor-enter(r2)
            r0.d()     // Catch: java.lang.Throwable -> Lca
            monitor-exit(r2)
            wd6 r2 = r0.h
            if (r2 == 0) goto Lc9
            r3 = 2929(0xb71, float:4.104E-42)
            android.opengl.GLES20.glDisable(r3)
            r3 = 3042(0xbe2, float:4.263E-42)
            android.opengl.GLES20.glEnable(r3)
            r3 = 770(0x302, float:1.079E-42)
            r5 = 771(0x303, float:1.08E-42)
            android.opengl.GLES20.glBlendFunc(r3, r5)
            int r3 = r0.k
            android.opengl.GLES30.glBindVertexArray(r3)
            int r3 = r0.j
            r5 = 34962(0x8892, float:4.8992E-41)
            android.opengl.GLES20.glBindBuffer(r5, r3)
            int r3 = r2.c
            android.opengl.GLES20.glUseProgram(r3)
            int r3 = r2.e
            android.opengl.GLES20.glEnableVertexAttribArray(r3)
            int r3 = r2.f
            android.opengl.GLES20.glEnableVertexAttribArray(r3)
            int r3 = r2.g
            r6 = -1
            if (r3 == r6) goto L76
            android.opengl.GLES20.glEnableVertexAttribArray(r3)
        L76:
            r3 = 33984(0x84c0, float:4.7622E-41)
            android.opengl.GLES20.glActiveTexture(r3)
            int r1 = r1.b
            r3 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r3, r1)
            r1 = 10241(0x2801, float:1.435E-41)
            int r6 = r2.d
            android.opengl.GLES20.glTexParameteri(r3, r1, r6)
            r1 = 10240(0x2800, float:1.4349E-41)
            int r6 = r2.d
            android.opengl.GLES20.glTexParameteri(r3, r1, r6)
            int r7 = r2.f
            r11 = 20
            r12 = 0
            r8 = 2
            r9 = 5126(0x1406, float:7.183E-42)
            r10 = 0
            android.opengl.GLES20.glVertexAttribPointer(r7, r8, r9, r10, r11, r12)
            int r13 = r2.e
            r17 = 20
            r18 = 8
            r14 = 2
            r15 = 5126(0x1406, float:7.183E-42)
            r16 = 0
            android.opengl.GLES20.glVertexAttribPointer(r13, r14, r15, r16, r17, r18)
            int r6 = r2.g
            r10 = 20
            r11 = 16
            r7 = 1
            r8 = 5126(0x1406, float:7.183E-42)
            r9 = 0
            android.opengl.GLES20.glVertexAttribPointer(r6, r7, r8, r9, r10, r11)
            int r1 = r2.h
            android.opengl.GLES20.glUniform1i(r1, r4)
            r1 = 4
            int r0 = r0.l
            android.opengl.GLES20.glDrawArrays(r1, r4, r0)
            android.opengl.GLES30.glBindVertexArray(r4)
            android.opengl.GLES20.glBindBuffer(r5, r4)
        Lc9:
            return
        Lca:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        Lcd:
            monitor-exit(r2)
            throw r0
    }

    public final void c() {
            r5 = this;
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            android.opengl.GLES20.glClearColor(r0, r0, r0, r1)
            r0 = 16640(0x4100, float:2.3318E-41)
            android.opengl.GLES20.glClear(r0)
            r0 = 2884(0xb44, float:4.041E-42)
            android.opengl.GLES20.glDisable(r0)
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            android.opengl.GLES20.glGenTextures(r0, r1, r2)
            r1 = r1[r2]
            r5.g = r1
            r3 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r3, r1)
            r1 = 10242(0x2802, float:1.4352E-41)
            r4 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r3, r1, r4)
            r1 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r3, r1, r4)
            r1 = 10241(0x2801, float:1.435E-41)
            r4 = 9729(0x2601, float:1.3633E-41)
            android.opengl.GLES20.glTexParameteri(r3, r1, r4)
            r1 = 10240(0x2800, float:1.4349E-41)
            android.opengl.GLES20.glTexParameteri(r3, r1, r4)
            r1 = 2
            int[] r3 = new int[r1]
            int[] r4 = new int[r1]
            android.opengl.GLES20.glGenBuffers(r1, r3, r2)
            android.opengl.GLES30.glGenVertexArrays(r1, r4, r2)
            r1 = r3[r2]
            r5.j = r1
            r1 = r4[r2]
            r5.k = r1
            r1 = r3[r0]
            r5.m = r1
            r1 = r4[r0]
            r5.n = r1
            fe6 r1 = defpackage.fe6.d
            wd6 r1 = defpackage.ej2.v(r1)
            r5.i = r1
            java.lang.Object r1 = r5.b
            monitor-enter(r1)
            r5.d = r0     // Catch: java.lang.Throwable -> L63
            monitor-exit(r1)
            return
        L63:
            r5 = move-exception
            monitor-exit(r1)
            throw r5
    }

    public final void d() {
            r32 = this;
            r1 = r32
            boolean r0 = r1.q
            r2 = -1
            r3 = 2
            r4 = 1
            r5 = 3553(0xde1, float:4.979E-42)
            r6 = 0
            r7 = 0
            if (r0 == 0) goto Lb4
            me.magnum.melonds.ui.emulator.EmulatorActivity r8 = r1.a
            t26 r0 = r1.p
            if (r0 != 0) goto L15
            goto Lb2
        L15:
            n00 r0 = r0.a
            if (r0 == 0) goto Lb2
            android.net.Uri r9 = r0.c
            if (r9 == 0) goto Lb2
            float r0 = r1.A
            int r0 = defpackage.u24.E(r0)
            float r10 = r1.B
            int r10 = defpackage.u24.E(r10)
            android.graphics.BitmapFactory$Options r11 = new android.graphics.BitmapFactory$Options
            r11.<init>()
            r11.inJustDecodeBounds = r4
            android.content.ContentResolver r12 = r8.getContentResolver()     // Catch: java.lang.Exception -> L41
            java.io.InputStream r12 = r12.openInputStream(r9)     // Catch: java.lang.Exception -> L41
            if (r12 == 0) goto L4b
            android.graphics.BitmapFactory.decodeStream(r12, r6, r11)     // Catch: java.lang.Throwable -> L43
            r12.close()     // Catch: java.lang.Exception -> L41
            goto L4b
        L41:
            r0 = move-exception
            goto L68
        L43:
            r0 = move-exception
            r10 = r0
            throw r10     // Catch: java.lang.Throwable -> L46
        L46:
            r0 = move-exception
            defpackage.ge7.t(r12, r10)     // Catch: java.lang.Exception -> L41
            throw r0     // Catch: java.lang.Exception -> L41
        L4b:
            int r12 = r11.outWidth
            if (r12 == r2) goto L66
            int r11 = r11.outHeight
            if (r11 != r2) goto L54
            goto L66
        L54:
            if (r11 > r10) goto L58
            if (r12 <= r0) goto L66
        L58:
            int r11 = r11 / r3
            int r12 = r12 / r3
            r13 = r4
        L5b:
            int r14 = r11 / r13
            if (r14 < r10) goto L6c
            int r14 = r12 / r13
            if (r14 < r0) goto L6c
            int r13 = r13 * 2
            goto L5b
        L66:
            r13 = r4
            goto L6c
        L68:
            r0.printStackTrace()
            goto L66
        L6c:
            android.content.ContentResolver r0 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L82
            java.io.InputStream r0 = r0.openInputStream(r9)     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L84
            android.graphics.BitmapFactory$Options r8 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L82
            r8.<init>()     // Catch: java.lang.Throwable -> L82
            r8.inSampleSize = r13     // Catch: java.lang.Throwable -> L82
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r0, r6, r8)     // Catch: java.lang.Throwable -> L82
            goto L8c
        L82:
            r0 = move-exception
            goto L86
        L84:
            r0 = r6
            goto L8c
        L86:
            em5 r8 = new em5
            r8.<init>(r0)
            r0 = r8
        L8c:
            boolean r8 = r0 instanceof defpackage.em5
            if (r8 == 0) goto L92
            r0 = r6
        L92:
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 != 0) goto L97
            goto Lb2
        L97:
            int r8 = r1.g
            android.opengl.GLES20.glBindTexture(r5, r8)
            android.opengl.GLUtils.texImage2D(r5, r7, r0, r7)
            r0.recycle()
            int r8 = r0.getWidth()
            r1.C = r8
            int r0 = r0.getHeight()
            r1.D = r0
            r1.f = r4
            r1.e = r4
        Lb2:
            r1.q = r7
        Lb4:
            boolean r0 = r1.f
            if (r0 != 0) goto Lb9
            return
        Lb9:
            boolean r0 = r1.e
            r8 = 6
            r9 = 4
            r10 = 34962(0x8892, float:4.8992E-41)
            if (r0 == 0) goto L43f
            t26 r0 = r1.p
            if (r0 != 0) goto Lc8
            goto L43f
        Lc8:
            me.magnum.melonds.domain.model.layout.BackgroundMode r0 = r0.b
            int r11 = r1.C
            int r12 = r1.D
            r13 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r14 = java.lang.Float.valueOf(r13)
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.Float r16 = java.lang.Float.valueOf(r15)
            float r11 = (float) r11
            float r12 = (float) r12
            float r17 = r11 / r12
            r18 = r3
            float r3 = r1.A
            r19 = r4
            float r4 = r1.B
            float r3 = r3 / r4
            int[] r4 = defpackage.a91.a
            int r0 = r0.ordinal()
            r0 = r4[r0]
            r4 = 12
            r20 = 11
            r21 = 10
            r22 = 9
            r23 = 8
            r24 = 7
            r25 = 5
            r26 = 3
            r27 = 1073741824(0x40000000, float:2.0)
            switch(r0) {
                case 1: goto L364;
                case 2: goto L2e2;
                case 3: goto L26c;
                case 4: goto L1f5;
                case 5: goto L17e;
                case 6: goto L108;
                default: goto L104;
            }
        L104:
            defpackage.i.d()
            return
        L108:
            int r0 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r0 <= 0) goto L14c
            float r0 = r1.A
            float r0 = r0 / r11
            float r3 = r1.B
            float r12 = r12 * r0
            float r3 = r3 / r12
            float r3 = r3 * r27
            java.lang.Float[] r0 = new java.lang.Float[r4]
            float r3 = r3 / r27
            float r11 = -r3
            java.lang.Float r12 = java.lang.Float.valueOf(r11)
            r0[r7] = r12
            r0[r19] = r16
            java.lang.Float r12 = java.lang.Float.valueOf(r11)
            r0[r18] = r12
            r0[r26] = r14
            java.lang.Float r12 = java.lang.Float.valueOf(r3)
            r0[r9] = r12
            r0[r25] = r14
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            r0[r8] = r11
            r0[r24] = r16
            java.lang.Float r11 = java.lang.Float.valueOf(r3)
            r0[r23] = r11
            r0[r22] = r14
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0[r21] = r3
            r0[r20] = r16
            goto L37e
        L14c:
            float r0 = r1.B
            float r0 = r0 / r12
            float r3 = r1.A
            float r11 = r11 * r0
            float r3 = r3 / r11
            float r3 = r3 * r27
            java.lang.Float[] r0 = new java.lang.Float[r4]
            r0[r7] = r16
            r0[r19] = r16
            r0[r18] = r16
            float r3 = r3 + r15
            java.lang.Float r11 = java.lang.Float.valueOf(r3)
            r0[r26] = r11
            r0[r9] = r14
            java.lang.Float r11 = java.lang.Float.valueOf(r3)
            r0[r25] = r11
            r0[r8] = r16
            r0[r24] = r16
            r0[r23] = r14
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0[r22] = r3
            r0[r21] = r14
            r0[r20] = r16
            goto L37e
        L17e:
            int r0 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r0 <= 0) goto L1c2
            float r0 = r1.A
            float r0 = r0 / r11
            float r3 = r1.B
            float r12 = r12 * r0
            float r3 = r3 / r12
            float r3 = r3 * r27
            java.lang.Float[] r0 = new java.lang.Float[r4]
            float r3 = r3 / r27
            float r11 = -r3
            java.lang.Float r12 = java.lang.Float.valueOf(r11)
            r0[r7] = r12
            r0[r19] = r16
            java.lang.Float r12 = java.lang.Float.valueOf(r11)
            r0[r18] = r12
            r0[r26] = r14
            java.lang.Float r12 = java.lang.Float.valueOf(r3)
            r0[r9] = r12
            r0[r25] = r14
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            r0[r8] = r11
            r0[r24] = r16
            java.lang.Float r11 = java.lang.Float.valueOf(r3)
            r0[r23] = r11
            r0[r22] = r14
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0[r21] = r3
            r0[r20] = r16
            goto L37e
        L1c2:
            float r0 = r1.B
            float r0 = r0 / r12
            float r3 = r1.A
            float r11 = r11 * r0
            float r3 = r3 / r11
            float r3 = r3 * r27
            java.lang.Float[] r0 = new java.lang.Float[r4]
            r0[r7] = r16
            float r3 = r13 - r3
            java.lang.Float r11 = java.lang.Float.valueOf(r3)
            r0[r19] = r11
            r0[r18] = r16
            r0[r26] = r14
            r0[r9] = r14
            r0[r25] = r14
            r0[r8] = r16
            java.lang.Float r11 = java.lang.Float.valueOf(r3)
            r0[r24] = r11
            r0[r23] = r14
            r0[r22] = r14
            r0[r21] = r14
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0[r20] = r3
            goto L37e
        L1f5:
            int r0 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r0 <= 0) goto L22c
            float r0 = r1.A
            float r0 = r0 / r11
            float r3 = r1.B
            float r12 = r12 * r0
            float r3 = r3 / r12
            float r3 = r3 * r27
            java.lang.Float[] r0 = new java.lang.Float[r4]
            float r3 = r13 - r3
            java.lang.Float r11 = java.lang.Float.valueOf(r3)
            r0[r7] = r11
            r0[r19] = r16
            java.lang.Float r11 = java.lang.Float.valueOf(r3)
            r0[r18] = r11
            r0[r26] = r14
            r0[r9] = r14
            r0[r25] = r14
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0[r8] = r3
            r0[r24] = r16
            r0[r23] = r14
            r0[r22] = r14
            r0[r21] = r14
            r0[r20] = r16
            goto L37e
        L22c:
            float r0 = r1.B
            float r0 = r0 / r12
            float r3 = r1.A
            float r11 = r11 * r0
            float r3 = r3 / r11
            float r3 = r3 * r27
            java.lang.Float[] r0 = new java.lang.Float[r4]
            r0[r7] = r16
            float r3 = r3 / r27
            float r11 = -r3
            java.lang.Float r12 = java.lang.Float.valueOf(r11)
            r0[r19] = r12
            r0[r18] = r16
            java.lang.Float r12 = java.lang.Float.valueOf(r3)
            r0[r26] = r12
            r0[r9] = r14
            java.lang.Float r12 = java.lang.Float.valueOf(r3)
            r0[r25] = r12
            r0[r8] = r16
            java.lang.Float r12 = java.lang.Float.valueOf(r11)
            r0[r24] = r12
            r0[r23] = r14
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0[r22] = r3
            r0[r21] = r14
            java.lang.Float r3 = java.lang.Float.valueOf(r11)
            r0[r20] = r3
            goto L37e
        L26c:
            int r0 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r0 <= 0) goto L2a2
            float r0 = r1.A
            float r0 = r0 / r11
            float r3 = r1.B
            float r12 = r12 * r0
            float r3 = r3 / r12
            float r3 = r3 * r27
            java.lang.Float[] r0 = new java.lang.Float[r4]
            r0[r7] = r16
            r0[r19] = r16
            r0[r18] = r16
            r0[r26] = r14
            float r15 = r15 + r3
            java.lang.Float r3 = java.lang.Float.valueOf(r15)
            r0[r9] = r3
            r0[r25] = r14
            r0[r8] = r16
            r0[r24] = r16
            java.lang.Float r3 = java.lang.Float.valueOf(r15)
            r0[r23] = r3
            r0[r22] = r14
            java.lang.Float r3 = java.lang.Float.valueOf(r15)
            r0[r21] = r3
            r0[r20] = r16
            goto L37e
        L2a2:
            float r0 = r1.B
            float r0 = r0 / r12
            float r3 = r1.A
            float r11 = r11 * r0
            float r3 = r3 / r11
            float r3 = r3 * r27
            java.lang.Float[] r0 = new java.lang.Float[r4]
            r0[r7] = r16
            float r3 = r3 / r27
            float r11 = -r3
            java.lang.Float r12 = java.lang.Float.valueOf(r11)
            r0[r19] = r12
            r0[r18] = r16
            java.lang.Float r12 = java.lang.Float.valueOf(r3)
            r0[r26] = r12
            r0[r9] = r14
            java.lang.Float r12 = java.lang.Float.valueOf(r3)
            r0[r25] = r12
            r0[r8] = r16
            java.lang.Float r12 = java.lang.Float.valueOf(r11)
            r0[r24] = r12
            r0[r23] = r14
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0[r22] = r3
            r0[r21] = r14
            java.lang.Float r3 = java.lang.Float.valueOf(r11)
            r0[r20] = r3
            goto L37e
        L2e2:
            int r0 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r0 <= 0) goto L325
            float r0 = r1.A
            float r0 = r0 / r11
            float r3 = r1.B
            float r12 = r12 * r0
            float r3 = r3 / r12
            float r3 = r3 * r27
            java.lang.Float[] r0 = new java.lang.Float[r4]
            float r3 = r3 / r27
            float r11 = -r3
            java.lang.Float r12 = java.lang.Float.valueOf(r11)
            r0[r7] = r12
            r0[r19] = r16
            java.lang.Float r12 = java.lang.Float.valueOf(r11)
            r0[r18] = r12
            r0[r26] = r14
            java.lang.Float r12 = java.lang.Float.valueOf(r3)
            r0[r9] = r12
            r0[r25] = r14
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            r0[r8] = r11
            r0[r24] = r16
            java.lang.Float r11 = java.lang.Float.valueOf(r3)
            r0[r23] = r11
            r0[r22] = r14
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0[r21] = r3
            r0[r20] = r16
            goto L37e
        L325:
            float r0 = r1.B
            float r0 = r0 / r12
            float r3 = r1.A
            float r11 = r11 * r0
            float r3 = r3 / r11
            float r3 = r3 * r27
            java.lang.Float[] r0 = new java.lang.Float[r4]
            r0[r7] = r16
            float r3 = r3 / r27
            float r11 = -r3
            java.lang.Float r12 = java.lang.Float.valueOf(r11)
            r0[r19] = r12
            r0[r18] = r16
            java.lang.Float r12 = java.lang.Float.valueOf(r3)
            r0[r26] = r12
            r0[r9] = r14
            java.lang.Float r12 = java.lang.Float.valueOf(r3)
            r0[r25] = r12
            r0[r8] = r16
            java.lang.Float r12 = java.lang.Float.valueOf(r11)
            r0[r24] = r12
            r0[r23] = r14
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0[r22] = r3
            r0[r21] = r14
            java.lang.Float r3 = java.lang.Float.valueOf(r11)
            r0[r20] = r3
            goto L37e
        L364:
            java.lang.Float[] r0 = new java.lang.Float[r4]
            r0[r7] = r16
            r0[r19] = r16
            r0[r18] = r16
            r0[r26] = r14
            r0[r9] = r14
            r0[r25] = r14
            r0[r8] = r16
            r0[r24] = r16
            r0[r23] = r14
            r0[r22] = r14
            r0[r21] = r14
            r0[r20] = r16
        L37e:
            r3 = r0[r7]
            float r3 = r3.floatValue()
            r11 = r0[r19]
            float r11 = r11.floatValue()
            r12 = r0[r18]
            float r12 = r12.floatValue()
            r14 = r0[r26]
            float r14 = r14.floatValue()
            r15 = r0[r9]
            float r15 = r15.floatValue()
            r16 = r0[r25]
            float r16 = r16.floatValue()
            r17 = r0[r8]
            float r17 = r17.floatValue()
            r27 = r0[r24]
            float r27 = r27.floatValue()
            r28 = r0[r23]
            float r28 = r28.floatValue()
            r29 = r0[r22]
            float r29 = r29.floatValue()
            r30 = r0[r21]
            float r30 = r30.floatValue()
            r0 = r0[r20]
            float r0 = r0.floatValue()
            r31 = r4
            r4 = 24
            float[] r4 = new float[r4]
            r4[r7] = r3
            r4[r19] = r11
            r3 = 0
            r4[r18] = r3
            r4[r26] = r13
            r4[r9] = r12
            r4[r25] = r14
            r4[r8] = r3
            r4[r24] = r3
            r4[r23] = r15
            r4[r22] = r16
            r4[r21] = r13
            r4[r20] = r3
            r4[r31] = r17
            r11 = 13
            r4[r11] = r27
            r11 = 14
            r4[r11] = r3
            r11 = 15
            r4[r11] = r13
            r11 = 16
            r4[r11] = r28
            r11 = 17
            r4[r11] = r29
            r11 = 18
            r4[r11] = r13
            r11 = 19
            r4[r11] = r3
            r3 = 20
            r4[r3] = r30
            r3 = 21
            r4[r3] = r0
            r0 = 22
            r4[r0] = r13
            r0 = 23
            r4[r0] = r13
            r0 = 96
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocateDirect(r0)
            java.nio.ByteOrder r11 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r3 = r3.order(r11)
            java.nio.FloatBuffer r3 = r3.asFloatBuffer()
            java.nio.FloatBuffer r3 = r3.put(r4)
            java.nio.Buffer r3 = r3.position(r7)
            int r4 = r1.n
            android.opengl.GLES30.glBindVertexArray(r4)
            int r4 = r1.m
            android.opengl.GLES20.glBindBuffer(r10, r4)
            r4 = 35044(0x88e4, float:4.9107E-41)
            android.opengl.GLES20.glBufferData(r10, r0, r3, r4)
            r1.e = r7
        L43f:
            int r0 = r1.n
            android.opengl.GLES30.glBindVertexArray(r0)
            int r0 = r1.m
            android.opengl.GLES20.glBindBuffer(r10, r0)
            wd6 r0 = r1.i
            java.lang.String r3 = "backgroundShader"
            if (r0 == 0) goto L4aa
            int r4 = r0.c
            android.opengl.GLES20.glUseProgram(r4)
            int r4 = r0.e
            android.opengl.GLES20.glEnableVertexAttribArray(r4)
            int r4 = r0.f
            android.opengl.GLES20.glEnableVertexAttribArray(r4)
            int r0 = r0.g
            if (r0 == r2) goto L465
            android.opengl.GLES20.glEnableVertexAttribArray(r0)
        L465:
            r0 = 33984(0x84c0, float:4.7622E-41)
            android.opengl.GLES20.glActiveTexture(r0)
            int r0 = r1.g
            android.opengl.GLES20.glBindTexture(r5, r0)
            wd6 r0 = r1.i
            if (r0 == 0) goto L4a6
            int r10 = r0.f
            r14 = 16
            r15 = 0
            r11 = 2
            r12 = 5126(0x1406, float:7.183E-42)
            r13 = 0
            android.opengl.GLES20.glVertexAttribPointer(r10, r11, r12, r13, r14, r15)
            wd6 r0 = r1.i
            if (r0 == 0) goto L4a2
            int r10 = r0.e
            r14 = 16
            r15 = 8
            r11 = 2
            r12 = 5126(0x1406, float:7.183E-42)
            r13 = 0
            android.opengl.GLES20.glVertexAttribPointer(r10, r11, r12, r13, r14, r15)
            wd6 r0 = r1.i
            if (r0 == 0) goto L49e
            int r0 = r0.h
            android.opengl.GLES20.glUniform1i(r0, r7)
            android.opengl.GLES20.glDrawArrays(r9, r7, r8)
            return
        L49e:
            defpackage.nb3.a0(r3)
            throw r6
        L4a2:
            defpackage.nb3.a0(r3)
            throw r6
        L4a6:
            defpackage.nb3.a0(r3)
            throw r6
        L4aa:
            defpackage.nb3.a0(r3)
            throw r6
    }

    public final void e(me.magnum.melonds.domain.model.Rect r2, me.magnum.melonds.domain.model.Rect r3, float r4, float r5, boolean r6, me.magnum.melonds.domain.model.Rect r7, me.magnum.melonds.domain.model.Rect r8, float r9, boolean r10) {
            r1 = this;
            java.lang.Object r0 = r1.b
            monitor-enter(r0)
            r1.r = r2     // Catch: java.lang.Throwable -> L1a
            r1.s = r3     // Catch: java.lang.Throwable -> L1a
            r1.t = r4     // Catch: java.lang.Throwable -> L1a
            r1.u = r5     // Catch: java.lang.Throwable -> L1a
            r1.v = r6     // Catch: java.lang.Throwable -> L1a
            r1.w = r7     // Catch: java.lang.Throwable -> L1a
            r1.x = r8     // Catch: java.lang.Throwable -> L1a
            r1.y = r9     // Catch: java.lang.Throwable -> L1a
            r1.z = r10     // Catch: java.lang.Throwable -> L1a
            r2 = 1
            r1.d = r2     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            return
        L1a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}
