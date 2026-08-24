package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zp3  reason: default package */
/* loaded from: classes.dex */
public final class zp3 {
    public final java.lang.Object a;
    public java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.io.Serializable e;
    public final java.io.Serializable f;
    public final java.lang.Object g;
    public final java.lang.Object h;
    public final java.lang.Object i;

    public zp3() {
            r1 = this;
            r1.<init>()
            long[] r0 = defpackage.b66.a
            ja4 r0 = new ja4
            r0.<init>()
            r1.a = r0
            ka4 r0 = defpackage.c66.a
            ka4 r0 = new ka4
            r0.<init>()
            r1.c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.g = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.h = r0
            wp3 r0 = new wp3
            r0.<init>(r1)
            r1.i = r0
            return
    }

    public /* synthetic */ zp3(java.io.Serializable r1, java.io.Serializable r2, java.io.Serializable r3, java.lang.Object r4, java.io.Serializable r5, java.io.Serializable r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            r0.<init>()
            return
    }

    public static int h(int[] r5, defpackage.gq3 r6) {
            int r0 = r6.i()
            int r1 = r6.c()
            int r1 = r1 + r0
            r2 = 0
        La:
            if (r0 >= r1) goto L1c
            r3 = r5[r0]
            int r4 = r6.b()
            int r4 = r4 + r3
            r5[r0] = r4
            int r2 = java.lang.Math.max(r2, r4)
            int r0 = r0 + 1
            goto La
        L1c:
            return r2
    }

    public java.lang.Object a(defpackage.s41 r9) {
            r8 = this;
            boolean r0 = r9 instanceof defpackage.wb5
            if (r0 == 0) goto L13
            r0 = r9
            wb5 r0 = (defpackage.wb5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            wb5 r0 = new wb5
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 4
            r4 = 3
            r5 = 1
            r6 = 2
            r7 = 0
            if (r2 == 0) goto L45
            if (r2 == r5) goto L41
            if (r2 == r6) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L31
            defpackage.oi2.Y(r9)
            return r9
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            return r7
        L37:
            boolean r2 = r0.R
            defpackage.oi2.Y(r9)     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> La4
            goto L81
        L3d:
            defpackage.oi2.Y(r9)     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Lb9
            goto L62
        L41:
            defpackage.oi2.Y(r9)     // Catch: java.lang.Throwable -> Lcc java.util.concurrent.CancellationException -> Lce
            goto L55
        L45:
            defpackage.oi2.Y(r9)
            java.lang.Object r9 = r8.a     // Catch: java.lang.Throwable -> Lcc java.util.concurrent.CancellationException -> Lce
            yc r9 = (defpackage.yc) r9     // Catch: java.lang.Throwable -> Lcc java.util.concurrent.CancellationException -> Lce
            r0.Z = r5     // Catch: java.lang.Throwable -> Lcc java.util.concurrent.CancellationException -> Lce
            java.lang.Object r9 = r9.g(r0)     // Catch: java.lang.Throwable -> Lcc java.util.concurrent.CancellationException -> Lce
            if (r9 != r1) goto L55
            goto La0
        L55:
            java.lang.Object r9 = r8.b     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Lb9
            m22 r9 = (defpackage.m22) r9     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Lb9
            r0.Z = r6     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Lb9
            java.lang.Object r9 = r9.g(r0)     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Lb9
            if (r9 != r1) goto L62
            goto La0
        L62:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Lb9
            boolean r2 = r9.booleanValue()     // Catch: java.lang.Throwable -> Lb7 java.util.concurrent.CancellationException -> Lb9
            if (r2 != 0) goto L72
            ac5 r8 = new ac5
            yb5 r9 = defpackage.yb5.IDENTITY_VERIFICATION
            r8.<init>(r9, r7)
            return r8
        L72:
            java.lang.Object r9 = r8.c     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> La4
            ad r9 = (defpackage.ad) r9     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> La4
            r0.R = r2     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> La4
            r0.Z = r4     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> La4
            java.lang.Object r9 = r9.g(r0)     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> La4
            if (r9 != r1) goto L81
            goto La0
        L81:
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Throwable -> La2 java.util.concurrent.CancellationException -> La4
            if (r9 != 0) goto L8d
            ac5 r8 = new ac5
            yb5 r9 = defpackage.yb5.PENDING_VERIFICATION
            r8.<init>(r9, r7)
            return r8
        L8d:
            kg4 r4 = defpackage.kg4.B
            ji r5 = new ji
            r6 = 10
            r5.<init>(r8, r9, r7, r6)
            r0.R = r2
            r0.Z = r3
            java.lang.Object r8 = defpackage.hv.d0(r4, r5, r0)
            if (r8 != r1) goto La1
        La0:
            return r1
        La1:
            return r8
        La2:
            r8 = move-exception
            goto La6
        La4:
            r8 = move-exception
            goto Lb6
        La6:
            ac5 r9 = new ac5
            yb5 r0 = defpackage.yb5.PENDING_VERIFICATION
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getSimpleName()
            r9.<init>(r0, r8)
            return r9
        Lb6:
            throw r8
        Lb7:
            r8 = move-exception
            goto Lbb
        Lb9:
            r8 = move-exception
            goto Lcb
        Lbb:
            ac5 r9 = new ac5
            yb5 r0 = defpackage.yb5.IDENTITY_VERIFICATION
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getSimpleName()
            r9.<init>(r0, r8)
            return r9
        Lcb:
            throw r8
        Lcc:
            r8 = move-exception
            goto Ld0
        Lce:
            r8 = move-exception
            goto Le0
        Ld0:
            ac5 r9 = new ac5
            yb5 r0 = defpackage.yb5.TRANSPORT_SUSPENSION
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getSimpleName()
            r9.<init>(r0, r8)
            return r9
        Le0:
            throw r8
    }

    public void b(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Object r0 = r0.a
            ja4 r0 = (defpackage.ja4) r0
            java.lang.Object r0 = r0.g(r2)
            defpackage.xg6.A(r0)
            return
    }

    public long c() {
            r2 = this;
            java.lang.Object r2 = r2.h
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r0 = r2.size()
            if (r0 > 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            defpackage.xg6.A(r2)
            r2 = 0
            throw r2
    }

    public void d(defpackage.af5 r1, java.lang.String r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            java.lang.Object r1 = r0.h
            java.io.ByteArrayOutputStream r1 = (java.io.ByteArrayOutputStream) r1
            byte[] r1 = r1.toByteArray()
            java.lang.Object r0 = r0.i
            tu0 r0 = (defpackage.tu0) r0
            r1.getClass()
            int r2 = r1.length
            if (r2 != 0) goto L19
            r1 = 0
        L19:
            r0.b0(r1)
            return
    }

    public void e(int r27, int r28, java.util.ArrayList r29, defpackage.ei r30, defpackage.gx0 r31, boolean r32, int r33, boolean r34, int r35, int r36) {
            r26 = this;
            r0 = r26
            r1 = r29
            r2 = r30
            r3 = r33
            java.io.Serializable r4 = r0.e
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r5 = r0.d
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r6 = r0.c
            ka4 r6 = (defpackage.ka4) r6
            java.lang.Object r7 = r0.a
            r8 = r7
            ja4 r8 = (defpackage.ja4) r8
            java.lang.Object r9 = r0.g
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.io.Serializable r10 = r0.f
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.lang.Object r11 = r0.b
            ei r11 = (defpackage.ei) r11
            r0.b = r2
            int r12 = r1.size()
            r14 = 0
        L2c:
            if (r14 >= r12) goto L46
            java.lang.Object r15 = r1.get(r14)
            gq3 r15 = (defpackage.gq3) r15
            int r13 = r15.a()
            r0 = 0
        L39:
            if (r0 >= r13) goto L41
            r15.d(r0)
            int r0 = r0 + 1
            goto L39
        L41:
            int r14 = r14 + 1
            r0 = r26
            goto L2c
        L46:
            boolean r0 = r8.i()
            if (r0 == 0) goto L50
            r26.g()
            return
        L50:
            java.lang.Object r0 = defpackage.gt0.J0(r1)
            gq3 r0 = (defpackage.gq3) r0
            if (r32 != 0) goto L5d
            if (r34 != 0) goto L5b
            goto L5d
        L5b:
            r12 = 0
            goto L5e
        L5d:
            r12 = 1
        L5e:
            java.lang.Object[] r13 = r8.b
            long[] r14 = r8.a
            int r15 = r14.length
            r0 = 2
            int r15 = r15 - r0
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
            r20 = 7
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            if (r15 < 0) goto Lc2
            r34 = r12
            r35 = r13
            r0 = 0
        L77:
            r31 = 8
            r12 = r14[r0]
            r36 = r9
            r23 = r10
            long r9 = ~r12
            long r9 = r9 << r20
            long r9 = r9 & r12
            long r9 = r9 & r21
            int r9 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
            if (r9 == 0) goto Lb5
            int r9 = r0 - r15
            int r9 = ~r9
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r10 = 0
        L91:
            if (r10 >= r9) goto Lae
            long r24 = r12 & r18
            int r24 = (r24 > r16 ? 1 : (r24 == r16 ? 0 : -1))
            if (r24 >= 0) goto La5
            int r24 = r0 << 3
            int r24 = r24 + r10
            r25 = r7
            r7 = r35[r24]
            r6.a(r7)
            goto La7
        La5:
            r25 = r7
        La7:
            long r12 = r12 >> r31
            int r10 = r10 + 1
            r7 = r25
            goto L91
        Lae:
            r25 = r7
            r7 = r31
            if (r9 != r7) goto Lca
            goto Lb7
        Lb5:
            r25 = r7
        Lb7:
            if (r0 == r15) goto Lca
            int r0 = r0 + 1
            r9 = r36
            r10 = r23
            r7 = r25
            goto L77
        Lc2:
            r25 = r7
            r36 = r9
            r23 = r10
            r34 = r12
        Lca:
            int r0 = r1.size()
            r7 = 0
        Lcf:
            if (r7 >= r0) goto Lfd
            java.lang.Object r9 = r1.get(r7)
            gq3 r9 = (defpackage.gq3) r9
            java.lang.Object r10 = r9.getKey()
            r6.l(r10)
            int r10 = r9.a()
            r12 = 0
        Le3:
            if (r12 >= r10) goto Leb
            r9.d(r12)
            int r12 = r12 + 1
            goto Le3
        Leb:
            java.lang.Object r9 = r9.getKey()
            r10 = r25
            ja4 r10 = (defpackage.ja4) r10
            java.lang.Object r9 = r10.k(r9)
            defpackage.xg6.A(r9)
            int r7 = r7 + 1
            goto Lcf
        Lfd:
            int[] r0 = new int[r3]
            r7 = 0
            if (r34 == 0) goto L17c
            if (r11 == 0) goto L17c
            boolean r9 = r5.isEmpty()
            if (r9 != 0) goto L141
            int r9 = r5.size()
            r10 = 1
            if (r9 <= r10) goto L11a
            yp3 r9 = new yp3
            r10 = 2
            r9.<init>(r11, r10)
            defpackage.jt0.x0(r5, r9)
        L11a:
            int r9 = r5.size()
            if (r9 > 0) goto L125
            r9 = 0
            java.util.Arrays.fill(r0, r9, r3, r9)
            goto L142
        L125:
            r9 = 0
            java.lang.Object r1 = r5.get(r9)
            gq3 r1 = (defpackage.gq3) r1
            h(r0, r1)
            java.lang.Object r0 = r1.getKey()
            java.lang.Object r0 = r8.g(r0)
            r0.getClass()
            defpackage.xg6.A(r0)
            r1.h(r9)
            throw r7
        L141:
            r9 = 0
        L142:
            boolean r10 = r4.isEmpty()
            if (r10 != 0) goto L17c
            int r10 = r4.size()
            r12 = 1
            if (r10 <= r12) goto L157
            yp3 r10 = new yp3
            r10.<init>(r11, r9)
            defpackage.jt0.x0(r4, r10)
        L157:
            int r10 = r4.size()
            if (r10 > 0) goto L161
            java.util.Arrays.fill(r0, r9, r3, r9)
            goto L17c
        L161:
            java.lang.Object r1 = r4.get(r9)
            gq3 r1 = (defpackage.gq3) r1
            h(r0, r1)
            java.lang.Object r0 = r1.getKey()
            java.lang.Object r0 = r8.g(r0)
            r0.getClass()
            defpackage.xg6.A(r0)
            r1.h(r9)
            throw r7
        L17c:
            java.lang.Object[] r9 = r6.b
            long[] r10 = r6.a
            int r11 = r10.length
            r12 = 2
            int r11 = r11 - r12
            if (r11 < 0) goto L1e1
            r12 = 0
        L186:
            r13 = r10[r12]
            r28 = r7
            r35 = r8
            long r7 = ~r13
            long r7 = r7 << r20
            long r7 = r7 & r13
            long r7 = r7 & r21
            int r7 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r7 == 0) goto L1d1
            int r7 = r12 - r11
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r8 = 0
        L1a0:
            if (r8 >= r7) goto L1c8
            long r24 = r13 & r18
            int r15 = (r24 > r16 ? 1 : (r24 == r16 ? 0 : -1))
            if (r15 >= 0) goto L1bb
            int r15 = r12 << 3
            int r15 = r15 + r8
            r15 = r9[r15]
            r24 = r4
            r4 = r35
            java.lang.Object r15 = r4.g(r15)
            defpackage.xg6.A(r15)
        L1b8:
            r15 = 8
            goto L1c0
        L1bb:
            r24 = r4
            r4 = r35
            goto L1b8
        L1c0:
            long r13 = r13 >> r15
            int r8 = r8 + 1
            r35 = r4
            r4 = r24
            goto L1a0
        L1c8:
            r24 = r4
            r15 = 8
            r4 = r35
            if (r7 != r15) goto L1e6
            goto L1d7
        L1d1:
            r24 = r4
            r15 = 8
            r4 = r35
        L1d7:
            if (r12 == r11) goto L1e6
            int r12 = r12 + 1
            r7 = r28
            r8 = r4
            r4 = r24
            goto L186
        L1e1:
            r24 = r4
            r28 = r7
            r4 = r8
        L1e6:
            boolean r7 = r23.isEmpty()
            if (r7 != 0) goto L230
            int r7 = r23.size()
            r10 = 1
            if (r7 <= r10) goto L1ff
            yp3 r7 = new yp3
            r8 = 3
            r7.<init>(r2, r8)
            r10 = r23
            defpackage.jt0.x0(r10, r7)
            goto L201
        L1ff:
            r10 = r23
        L201:
            int r7 = r10.size()
            if (r7 <= 0) goto L22b
            r9 = 0
            java.lang.Object r2 = r10.get(r9)
            gq3 r2 = (defpackage.gq3) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r3 = r4.g(r3)
            r3.getClass()
            defpackage.xg6.A(r3)
            h(r0, r2)
            if (r32 == 0) goto L22a
            java.lang.Object r0 = defpackage.gt0.H0(r1)
            gq3 r0 = (defpackage.gq3) r0
            r0.h(r9)
        L22a:
            throw r28
        L22b:
            r9 = 0
            java.util.Arrays.fill(r0, r9, r3, r9)
            goto L232
        L230:
            r10 = r23
        L232:
            boolean r3 = r36.isEmpty()
            if (r3 != 0) goto L26d
            int r3 = r36.size()
            r12 = 1
            if (r3 <= r12) goto L24a
            yp3 r3 = new yp3
            r3.<init>(r2, r12)
            r9 = r36
            defpackage.jt0.x0(r9, r3)
            goto L24c
        L24a:
            r9 = r36
        L24c:
            int r2 = r9.size()
            if (r2 > 0) goto L254
        L252:
            r2 = 0
            goto L270
        L254:
            r2 = 0
            java.lang.Object r1 = r9.get(r2)
            gq3 r1 = (defpackage.gq3) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r2 = r4.g(r2)
            r2.getClass()
            defpackage.xg6.A(r2)
            h(r0, r1)
            throw r28
        L26d:
            r9 = r36
            goto L252
        L270:
            java.util.Collections.reverse(r10)
            r1.addAll(r2, r10)
            r1.addAll(r9)
            r5.clear()
            r24.clear()
            r10.clear()
            r9.clear()
            r6.b()
            return
    }

    public void f(defpackage.af5 r10, defpackage.wl5 r11) {
            r9 = this;
            java.lang.Object r11 = r9.a
            dh5 r11 = (defpackage.dh5) r11
            r11.A = r10
            java.text.SimpleDateFormat r11 = new java.text.SimpleDateFormat
            java.lang.String r0 = "EEE MMM dd yyyy HH:mm:ss 'GMT'Z (zzzz)"
            java.util.Locale r1 = java.util.Locale.US
            r11.<init>(r0, r1)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.lang.String r11 = r11.format(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "X-Timestamp:"
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r1 = "\r\nContent-Type:application/json;charset=utf-8\r\nPath:speech.config\r\n\r\n{\"context\":{\"synthesis\":{\"audio\":{\"metadataoptions\":{\"sentenceBoundaryEnabled\":\"false\",\"wordBoundaryEnabled\":\"false\"},\"outputFormat\":\"audio-24khz-48kbitrate-mono-mp3\"}}}}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.f(r0)
            java.lang.Object r0 = r9.b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "&"
            java.lang.String r2 = "&amp;"
            java.lang.String r0 = defpackage.xs6.e0(r0, r1, r2)
            java.lang.String r1 = "<"
            java.lang.String r2 = "&lt;"
            java.lang.String r0 = defpackage.xs6.e0(r0, r1, r2)
            java.lang.String r1 = ">"
            java.lang.String r2 = "&gt;"
            java.lang.String r0 = defpackage.xs6.e0(r0, r1, r2)
            java.lang.String r1 = "\""
            java.lang.String r2 = "&quot;"
            java.lang.String r0 = defpackage.xs6.e0(r0, r1, r2)
            java.lang.String r1 = "'"
            java.lang.String r2 = "&apos;"
            java.lang.String r0 = defpackage.xs6.e0(r0, r1, r2)
            java.lang.Object r1 = r9.c
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "ru-"
            r3 = 0
            boolean r2 = defpackage.xs6.g0(r1, r2, r3)
            if (r2 == 0) goto L6a
            java.lang.String r2 = "ru-RU"
            goto Lae
        L6a:
            java.lang.String r2 = "ja-"
            boolean r2 = defpackage.xs6.g0(r1, r2, r3)
            if (r2 == 0) goto L75
            java.lang.String r2 = "ja-JP"
            goto Lae
        L75:
            java.lang.String r2 = "zh-"
            boolean r2 = defpackage.xs6.g0(r1, r2, r3)
            if (r2 == 0) goto L80
            java.lang.String r2 = "zh-CN"
            goto Lae
        L80:
            java.lang.String r2 = "de-"
            boolean r2 = defpackage.xs6.g0(r1, r2, r3)
            if (r2 == 0) goto L8b
            java.lang.String r2 = "de-DE"
            goto Lae
        L8b:
            java.lang.String r2 = "fr-"
            boolean r2 = defpackage.xs6.g0(r1, r2, r3)
            if (r2 == 0) goto L96
            java.lang.String r2 = "fr-FR"
            goto Lae
        L96:
            java.lang.String r2 = "es-"
            boolean r2 = defpackage.xs6.g0(r1, r2, r3)
            if (r2 == 0) goto La1
            java.lang.String r2 = "es-ES"
            goto Lae
        La1:
            java.lang.String r2 = "it-"
            boolean r2 = defpackage.xs6.g0(r1, r2, r3)
            if (r2 == 0) goto Lac
            java.lang.String r2 = "it-IT"
            goto Lae
        Lac:
            java.lang.String r2 = "en-US"
        Lae:
            java.lang.Object r3 = r9.d
            java.lang.String r3 = (java.lang.String) r3
            java.io.Serializable r4 = r9.e
            java.lang.String r4 = (java.lang.String) r4
            java.io.Serializable r5 = r9.f
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r9 = r9.g
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r6 = "\r\nX-Timestamp:"
            java.lang.String r7 = "\r\nContent-Type:application/ssml+xml\r\nPath:ssml\r\n\r\n<speak version='1.0' xmlns='http://www.w3.org/2001/10/synthesis' xmlns:mstts='https://www.w3.org/2001/mstts' xml:lang='"
            java.lang.String r8 = "X-RequestId:"
            java.lang.StringBuilder r11 = defpackage.i61.u(r8, r3, r6, r11, r7)
            java.lang.String r3 = "'><voice name='"
            java.lang.String r6 = "'><prosody pitch='"
            defpackage.i61.B(r11, r2, r3, r1, r6)
            java.lang.String r1 = "' rate='"
            java.lang.String r2 = "' volume='"
            defpackage.i61.B(r11, r4, r1, r5, r2)
            r11.append(r9)
            java.lang.String r9 = "'>"
            r11.append(r9)
            r11.append(r0)
            java.lang.String r9 = "</prosody></voice></speak>"
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.f(r9)
            return
    }

    public void g() {
            r14 = this;
            java.lang.Object r14 = r14.a
            ja4 r14 = (defpackage.ja4) r14
            boolean r0 = r14.j()
            if (r0 == 0) goto L52
            java.lang.Object[] r0 = r14.c
            long[] r1 = r14.a
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L4f
            r3 = 0
            r4 = r3
        L15:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L4a
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2f:
            if (r9 >= r7) goto L48
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 < 0) goto L3e
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2f
        L3e:
            int r14 = r4 << 3
            int r14 = r14 + r9
            r14 = r0[r14]
            defpackage.xg6.A(r14)
            r14 = 0
            throw r14
        L48:
            if (r7 != r8) goto L4f
        L4a:
            if (r4 == r2) goto L4f
            int r4 = r4 + 1
            goto L15
        L4f:
            r14.a()
        L52:
            return
    }
}
