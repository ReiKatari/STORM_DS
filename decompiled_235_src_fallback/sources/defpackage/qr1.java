package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qr1  reason: default package */
/* loaded from: classes.dex */
public final class qr1 {
    public static final defpackage.qr1 a = null;
    public static final defpackage.nr1 b = null;
    public static final defpackage.xk4 c = null;

    static {
            qr1 r0 = new qr1
            r0.<init>()
            defpackage.qr1.a = r0
            nr1 r0 = new nr1
            r1 = 8388608(0x800000, float:1.1754944E-38)
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.qr1.b = r0
            wk4 r0 = new wk4
            r0.<init>()
            r1 = 5
            r0.a(r1)
            r1 = 8
            r0.b(r1)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            r3.getClass()
            int r1 = defpackage.az7.b(r1)
            r0.z = r1
            r1 = 1
            r0.f = r1
            xk4 r1 = new xk4
            r1.<init>(r0)
            defpackage.qr1.c = r1
            return
    }

    public final java.io.Serializable a(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, defpackage.s41 r22) {
            r16 = this;
            r2 = r18
            r3 = r19
            r4 = r20
            r0 = r22
            boolean r1 = r0 instanceof defpackage.or1
            if (r1 == 0) goto L1e
            r1 = r0
            or1 r1 = (defpackage.or1) r1
            int r5 = r1.g0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1e
            int r5 = r5 - r6
            r1.g0 = r5
            r5 = r16
        L1c:
            r6 = r1
            goto L26
        L1e:
            or1 r1 = new or1
            r5 = r16
            r1.<init>(r5, r0)
            goto L1c
        L26:
            java.lang.Object r0 = r6.e0
            x61 r7 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r6.g0
            r8 = 0
            r9 = 1
            if (r1 == 0) goto L47
            if (r1 != r9) goto L41
            java.lang.String r1 = r6.d0
            java.lang.String r2 = r6.Z
            java.lang.String r3 = r6.Y
            java.lang.String r4 = r6.X
            java.lang.String r5 = r6.R
            defpackage.oi2.Y(r0)
            goto Lb5
        L41:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r8
        L47:
            defpackage.oi2.Y(r0)
            java.lang.CharSequence r0 = defpackage.qs6.T0(r17)
            java.lang.String r1 = r0.toString()
            boolean r0 = defpackage.qs6.v0(r1)
            if (r0 == 0) goto L5c
            r22 = r8
            goto L344
        L5c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r10 = "|"
            r0.append(r10)
            r0.append(r3)
            java.lang.String r10 = "|"
            r0.append(r10)
            r0.append(r4)
            java.lang.String r10 = "|"
            r0.append(r10)
            r10 = r21
            r0.append(r10)
            java.lang.String r11 = "|"
            r0.append(r11)
            r0.append(r1)
            java.lang.String r11 = r0.toString()
            nr1 r12 = defpackage.qr1.b
            monitor-enter(r12)
            java.lang.Object r0 = r12.get(r11)     // Catch: java.lang.Throwable -> L345
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L345
            if (r0 == 0) goto L97
            monitor-exit(r12)
            return r0
        L97:
            monitor-exit(r12)
            r6.R = r2
            r6.X = r3
            r6.Y = r4
            r6.Z = r1
            r6.d0 = r11
            r6.g0 = r9
            r0 = r5
            r5 = r10
            java.io.Serializable r0 = r0.b(r1, r2, r3, r4, r5, r6)
            if (r0 != r7) goto Lad
            return r7
        Lad:
            r5 = r18
            r4 = r19
            r3 = r20
            r2 = r1
            r1 = r11
        Lb5:
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto Lcb
            int r6 = r0.length
            if (r6 != 0) goto Lbd
            goto Lcb
        Lbd:
            nr1 r2 = defpackage.qr1.b
            monitor-enter(r2)
            java.lang.Object r1 = r2.put(r1, r0)     // Catch: java.lang.Throwable -> Lc8
            byte[] r1 = (byte[]) r1     // Catch: java.lang.Throwable -> Lc8
            monitor-exit(r2)
            return r0
        Lc8:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        Lcb:
            java.lang.String r0 = "<speak version='1.0' xmlns='http://www.w3.org/2001/10/synthesis' xml:lang='"
            r6 = 13
            r7 = 0
            java.lang.String r10 = "&"
            java.lang.String r11 = "&amp;"
            java.lang.String r10 = defpackage.xs6.e0(r2, r10, r11)     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r11 = "<"
            java.lang.String r12 = "&lt;"
            java.lang.String r10 = defpackage.xs6.e0(r10, r11, r12)     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r11 = ">"
            java.lang.String r12 = "&gt;"
            java.lang.String r10 = defpackage.xs6.e0(r10, r11, r12)     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r11 = "\""
            java.lang.String r12 = "&quot;"
            java.lang.String r10 = defpackage.xs6.e0(r10, r11, r12)     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r11 = "'"
            java.lang.String r12 = "&apos;"
            java.lang.String r10 = defpackage.xs6.e0(r10, r11, r12)     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r11 = "ru-"
            boolean r11 = defpackage.xs6.g0(r5, r11, r7)     // Catch: java.lang.Throwable -> L1cc
            if (r11 == 0) goto L103
            java.lang.String r11 = "ru-RU"
            goto L147
        L103:
            java.lang.String r11 = "ja-"
            boolean r11 = defpackage.xs6.g0(r5, r11, r7)     // Catch: java.lang.Throwable -> L1cc
            if (r11 == 0) goto L10e
            java.lang.String r11 = "ja-JP"
            goto L147
        L10e:
            java.lang.String r11 = "zh-"
            boolean r11 = defpackage.xs6.g0(r5, r11, r7)     // Catch: java.lang.Throwable -> L1cc
            if (r11 == 0) goto L119
            java.lang.String r11 = "zh-CN"
            goto L147
        L119:
            java.lang.String r11 = "de-"
            boolean r11 = defpackage.xs6.g0(r5, r11, r7)     // Catch: java.lang.Throwable -> L1cc
            if (r11 == 0) goto L124
            java.lang.String r11 = "de-DE"
            goto L147
        L124:
            java.lang.String r11 = "fr-"
            boolean r11 = defpackage.xs6.g0(r5, r11, r7)     // Catch: java.lang.Throwable -> L1cc
            if (r11 == 0) goto L12f
            java.lang.String r11 = "fr-FR"
            goto L147
        L12f:
            java.lang.String r11 = "es-"
            boolean r11 = defpackage.xs6.g0(r5, r11, r7)     // Catch: java.lang.Throwable -> L1cc
            if (r11 == 0) goto L13a
            java.lang.String r11 = "es-ES"
            goto L147
        L13a:
            java.lang.String r11 = "it-"
            boolean r11 = defpackage.xs6.g0(r5, r11, r7)     // Catch: java.lang.Throwable -> L1cc
            if (r11 == 0) goto L145
            java.lang.String r11 = "it-IT"
            goto L147
        L145:
            java.lang.String r11 = "en-US"
        L147:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1cc
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L1cc
            r12.append(r11)     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r0 = "'><voice name='"
            r12.append(r0)     // Catch: java.lang.Throwable -> L1cc
            r12.append(r5)     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r0 = "'><prosody pitch='"
            r12.append(r0)     // Catch: java.lang.Throwable -> L1cc
            r12.append(r4)     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r0 = "' rate='"
            r12.append(r0)     // Catch: java.lang.Throwable -> L1cc
            r12.append(r3)     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r0 = "'>"
            r12.append(r0)     // Catch: java.lang.Throwable -> L1cc
            r12.append(r10)     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r0 = "</prosody></voice></speak>"
            r12.append(r0)     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r0 = r12.toString()     // Catch: java.lang.Throwable -> L1cc
            xh5 r3 = defpackage.n34.d     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r3 = "application/ssml+xml; charset=utf-8"
            n34 r3 = defpackage.xk2.k(r3)     // Catch: java.lang.IllegalArgumentException -> L181 java.lang.Throwable -> L1cc
            goto L182
        L181:
            r3 = r8
        L182:
            int r4 = defpackage.mk5.a     // Catch: java.lang.Throwable -> L1cc
            lk5 r0 = defpackage.jx2.q(r0, r3)     // Catch: java.lang.Throwable -> L1cc
            s9 r3 = new s9     // Catch: java.lang.Throwable -> L1cc
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r4 = "https://eastus.tts.speech.microsoft.com/cognitiveservices/v1"
            r3.I(r4)     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r4 = "X-Microsoft-OutputFormat"
            java.lang.String r10 = "audio-24khz-48kbitrate-mono-mp3"
            r3.B(r4, r10)     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r4 = "Content-Type"
            java.lang.String r10 = "application/ssml+xml"
            r3.B(r4, r10)     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r4 = "User-Agent"
            java.lang.String r10 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64)"
            r3.B(r4, r10)     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r4 = "POST"
            r3.D(r4, r0)     // Catch: java.lang.Throwable -> L1cc
            pa r0 = new pa     // Catch: java.lang.Throwable -> L1cc
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1cc
            xk4 r3 = defpackage.qr1.c     // Catch: java.lang.Throwable -> L1cc
            r3.getClass()     // Catch: java.lang.Throwable -> L1cc
            je5 r4 = new je5     // Catch: java.lang.Throwable -> L1cc
            r4.<init>(r3, r0, r7)     // Catch: java.lang.Throwable -> L1cc
            wl5 r0 = r4.e()     // Catch: java.lang.Throwable -> L1cc
            boolean r3 = r0.m0     // Catch: java.lang.Throwable -> L1cc
            if (r3 == 0) goto L1cc
            yl5 r0 = r0.Z     // Catch: java.lang.Throwable -> L1cc
            if (r0 == 0) goto L1cc
            byte[] r0 = r0.e()     // Catch: java.lang.Throwable -> L1cc
            goto L1cd
        L1cc:
            r0 = r8
        L1cd:
            if (r0 == 0) goto L1e1
            int r3 = r0.length
            if (r3 != 0) goto L1d3
            goto L1e1
        L1d3:
            nr1 r2 = defpackage.qr1.b
            monitor-enter(r2)
            java.lang.Object r1 = r2.put(r1, r0)     // Catch: java.lang.Throwable -> L1de
            byte[] r1 = (byte[]) r1     // Catch: java.lang.Throwable -> L1de
            monitor-exit(r2)
            return r0
        L1de:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L1e1:
            xk4 r0 = defpackage.qr1.c
            java.lang.String r3 = "Mozilla/5.0 (Linux; Android 14; Mobile)"
            java.lang.String r4 = "User-Agent"
            java.lang.String r10 = "&q="
            java.lang.String r11 = "UTF-8"
            java.lang.String r12 = "https://translate.google.com/translate_tts?ie=UTF-8&client=tw-ob&tl="
            java.lang.String r13 = "ru-"
            boolean r13 = defpackage.xs6.g0(r5, r13, r7)     // Catch: java.lang.Throwable -> L28e
            if (r13 == 0) goto L1f8
            java.lang.String r5 = "ru"
            goto L23c
        L1f8:
            java.lang.String r13 = "ja-"
            boolean r13 = defpackage.xs6.g0(r5, r13, r7)     // Catch: java.lang.Throwable -> L28e
            if (r13 == 0) goto L203
            java.lang.String r5 = "ja"
            goto L23c
        L203:
            java.lang.String r13 = "zh-"
            boolean r13 = defpackage.xs6.g0(r5, r13, r7)     // Catch: java.lang.Throwable -> L28e
            if (r13 == 0) goto L20e
            java.lang.String r5 = "zh"
            goto L23c
        L20e:
            java.lang.String r13 = "de-"
            boolean r13 = defpackage.xs6.g0(r5, r13, r7)     // Catch: java.lang.Throwable -> L28e
            if (r13 == 0) goto L219
            java.lang.String r5 = "de"
            goto L23c
        L219:
            java.lang.String r13 = "fr-"
            boolean r13 = defpackage.xs6.g0(r5, r13, r7)     // Catch: java.lang.Throwable -> L28e
            if (r13 == 0) goto L224
            java.lang.String r5 = "fr"
            goto L23c
        L224:
            java.lang.String r13 = "es-"
            boolean r13 = defpackage.xs6.g0(r5, r13, r7)     // Catch: java.lang.Throwable -> L28e
            if (r13 == 0) goto L22f
            java.lang.String r5 = "es"
            goto L23c
        L22f:
            java.lang.String r13 = "it-"
            boolean r5 = defpackage.xs6.g0(r5, r13, r7)     // Catch: java.lang.Throwable -> L28e
            if (r5 == 0) goto L23a
            java.lang.String r5 = "it"
            goto L23c
        L23a:
            java.lang.String r5 = "en"
        L23c:
            java.lang.CharSequence r2 = defpackage.qs6.T0(r2)     // Catch: java.lang.Throwable -> L28e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L28e
            int r13 = r2.length()     // Catch: java.lang.Throwable -> L28e
            r14 = 180(0xb4, float:2.52E-43)
            if (r13 > r14) goto L292
            java.lang.String r2 = java.net.URLEncoder.encode(r2, r11)     // Catch: java.lang.Throwable -> L28e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28e
            r9.<init>(r12)     // Catch: java.lang.Throwable -> L28e
            r9.append(r5)     // Catch: java.lang.Throwable -> L28e
            r9.append(r10)     // Catch: java.lang.Throwable -> L28e
            r9.append(r2)     // Catch: java.lang.Throwable -> L28e
            java.lang.String r2 = r9.toString()     // Catch: java.lang.Throwable -> L28e
            s9 r5 = new s9     // Catch: java.lang.Throwable -> L28e
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L28e
            r5.I(r2)     // Catch: java.lang.Throwable -> L28e
            r5.B(r4, r3)     // Catch: java.lang.Throwable -> L28e
            pa r2 = new pa     // Catch: java.lang.Throwable -> L28e
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L28e
            r0.getClass()     // Catch: java.lang.Throwable -> L28e
            je5 r3 = new je5     // Catch: java.lang.Throwable -> L28e
            r3.<init>(r0, r2, r7)     // Catch: java.lang.Throwable -> L28e
            wl5 r0 = r3.e()     // Catch: java.lang.Throwable -> L28e
            boolean r2 = r0.m0     // Catch: java.lang.Throwable -> L28e
            if (r2 == 0) goto L28e
            yl5 r0 = r0.Z     // Catch: java.lang.Throwable -> L28e
            if (r0 == 0) goto L28e
            byte[] r0 = r0.e()     // Catch: java.lang.Throwable -> L28e
            r22 = r8
            goto L330
        L28e:
            r22 = r8
            goto L32e
        L292:
            int r13 = r2.length()     // Catch: java.lang.Throwable -> L28e
            int r14 = r13 / 150
            int r15 = r13 % 150
            if (r15 != 0) goto L29d
            r9 = r7
        L29d:
            int r14 = r14 + r9
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L28e
            r9.<init>(r14)     // Catch: java.lang.Throwable -> L28e
            r14 = r7
        L2a4:
            if (r14 < 0) goto L2c8
            if (r14 >= r13) goto L2c8
            int r15 = r14 + 150
            if (r15 < 0) goto L2b3
            if (r15 <= r13) goto L2af
            goto L2b3
        L2af:
            r22 = r8
            r8 = r15
            goto L2b6
        L2b3:
            r22 = r8
            r8 = r13
        L2b6:
            java.lang.CharSequence r8 = r2.subSequence(r14, r8)     // Catch: java.lang.Throwable -> L32e
            r8.getClass()     // Catch: java.lang.Throwable -> L32e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L32e
            r9.add(r8)     // Catch: java.lang.Throwable -> L32e
            r8 = r22
            r14 = r15
            goto L2a4
        L2c8:
            r22 = r8
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L32e
            r2.<init>()     // Catch: java.lang.Throwable -> L32e
            int r8 = r9.size()     // Catch: java.lang.Throwable -> L32e
            r13 = r7
        L2d4:
            if (r13 >= r8) goto L323
            java.lang.Object r14 = r9.get(r13)     // Catch: java.lang.Throwable -> L32e
            int r13 = r13 + 1
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> L32e
            java.lang.String r14 = java.net.URLEncoder.encode(r14, r11)     // Catch: java.lang.Throwable -> L32e
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32e
            r15.<init>()     // Catch: java.lang.Throwable -> L32e
            r15.append(r12)     // Catch: java.lang.Throwable -> L32e
            r15.append(r5)     // Catch: java.lang.Throwable -> L32e
            r15.append(r10)     // Catch: java.lang.Throwable -> L32e
            r15.append(r14)     // Catch: java.lang.Throwable -> L32e
            java.lang.String r14 = r15.toString()     // Catch: java.lang.Throwable -> L32e
            s9 r15 = new s9     // Catch: java.lang.Throwable -> L32e
            r15.<init>(r6)     // Catch: java.lang.Throwable -> L32e
            r15.I(r14)     // Catch: java.lang.Throwable -> L32e
            r15.B(r4, r3)     // Catch: java.lang.Throwable -> L32e
            pa r14 = new pa     // Catch: java.lang.Throwable -> L32e
            r14.<init>(r15)     // Catch: java.lang.Throwable -> L32e
            r0.getClass()     // Catch: java.lang.Throwable -> L32e
            je5 r15 = new je5     // Catch: java.lang.Throwable -> L32e
            r15.<init>(r0, r14, r7)     // Catch: java.lang.Throwable -> L32e
            wl5 r14 = r15.e()     // Catch: java.lang.Throwable -> L32e
            boolean r15 = r14.m0     // Catch: java.lang.Throwable -> L32e
            if (r15 == 0) goto L2d4
            yl5 r14 = r14.Z     // Catch: java.lang.Throwable -> L32e
            if (r14 == 0) goto L2d4
            byte[] r14 = r14.e()     // Catch: java.lang.Throwable -> L32e
            r2.write(r14)     // Catch: java.lang.Throwable -> L32e
            goto L2d4
        L323:
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L32e
            if (r0 <= 0) goto L32e
            byte[] r0 = r2.toByteArray()     // Catch: java.lang.Throwable -> L32e
            goto L330
        L32e:
            r0 = r22
        L330:
            if (r0 == 0) goto L344
            int r2 = r0.length
            if (r2 != 0) goto L336
            goto L344
        L336:
            nr1 r2 = defpackage.qr1.b
            monitor-enter(r2)
            java.lang.Object r1 = r2.put(r1, r0)     // Catch: java.lang.Throwable -> L341
            byte[] r1 = (byte[]) r1     // Catch: java.lang.Throwable -> L341
            monitor-exit(r2)
            return r0
        L341:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L344:
            return r22
        L345:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
    }

    public final java.io.Serializable b(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, defpackage.s41 r20) {
            r14 = this;
            r0 = r20
            java.lang.String r1 = "Edge WebSocket synthesis exception: "
            boolean r2 = r0 instanceof defpackage.pr1
            if (r2 == 0) goto L17
            r2 = r0
            pr1 r2 = (defpackage.pr1) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Z = r3
            goto L1c
        L17:
            pr1 r2 = new pr1
            r2.<init>(r14, r0)
        L1c:
            java.lang.Object r14 = r2.X
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r2.Z
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L37
            if (r3 != r4) goto L31
            dh5 r2 = r2.R
            defpackage.oi2.Y(r14)     // Catch: java.lang.Throwable -> L2e
            goto L5c
        L2e:
            r0 = move-exception
            r14 = r0
            goto L71
        L31:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r14)
            return r5
        L37:
            defpackage.oi2.Y(r14)
            dh5 r7 = new dh5
            r7.<init>()
            hn r6 = new hn     // Catch: java.lang.Throwable -> L6e
            r13 = 0
            r8 = r15
            r9 = r16
            r10 = r17
            r11 = r18
            r12 = r19
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L6e
            r2.R = r7     // Catch: java.lang.Throwable -> L6e
            r2.Z = r4     // Catch: java.lang.Throwable -> L6e
            r3 = 6500(0x1964, double:3.2114E-320)
            java.lang.Object r14 = defpackage.xk2.N(r3, r6, r2)     // Catch: java.lang.Throwable -> L6e
            if (r14 != r0) goto L5b
            return r0
        L5b:
            r2 = r7
        L5c:
            byte[] r14 = (byte[]) r14     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = r2.A     // Catch: java.lang.Throwable -> L6c
            af5 r0 = (defpackage.af5) r0     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L6c
            je5 r0 = r0.h     // Catch: java.lang.Throwable -> L6c
            r0.getClass()     // Catch: java.lang.Throwable -> L6c
            r0.cancel()     // Catch: java.lang.Throwable -> L6c
        L6c:
            r5 = r14
            goto L94
        L6e:
            r0 = move-exception
            r14 = r0
            r2 = r7
        L71:
            java.lang.String r0 = "EdgeNeuralTtsClient"
            java.lang.String r14 = r14.getMessage()     // Catch: java.lang.Throwable -> L95
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L95
            r3.append(r14)     // Catch: java.lang.Throwable -> L95
            java.lang.String r14 = r3.toString()     // Catch: java.lang.Throwable -> L95
            android.util.Log.w(r0, r14)     // Catch: java.lang.Throwable -> L95
            java.lang.Object r14 = r2.A     // Catch: java.lang.Throwable -> L94
            af5 r14 = (defpackage.af5) r14     // Catch: java.lang.Throwable -> L94
            if (r14 == 0) goto L94
            je5 r14 = r14.h     // Catch: java.lang.Throwable -> L94
            r14.getClass()     // Catch: java.lang.Throwable -> L94
            r14.cancel()     // Catch: java.lang.Throwable -> L94
        L94:
            return r5
        L95:
            r0 = move-exception
            r14 = r0
            java.lang.Object r0 = r2.A     // Catch: java.lang.Throwable -> La5
            af5 r0 = (defpackage.af5) r0     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto La5
            je5 r0 = r0.h     // Catch: java.lang.Throwable -> La5
            r0.getClass()     // Catch: java.lang.Throwable -> La5
            r0.cancel()     // Catch: java.lang.Throwable -> La5
        La5:
            throw r14
    }
}
