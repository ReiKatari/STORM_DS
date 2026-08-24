package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cp5  reason: default package */
/* loaded from: classes.dex */
public final class cp5 {
    public final android.content.Context a;
    public final android.content.SharedPreferences b;
    public final java.io.File c;
    public final java.io.File d;
    public final java.io.File e;
    public final java.io.File f;

    public cp5(android.content.Context r4, android.content.SharedPreferences r5) {
            r3 = this;
            r5.getClass()
            r3.<init>()
            r3.a = r4
            r3.b = r5
            java.io.File r5 = new java.io.File
            java.io.File r0 = r4.getFilesDir()
            java.lang.String r1 = "retroarch-shaders"
            r5.<init>(r0, r1)
            r3.c = r5
            java.io.File r0 = new java.io.File
            java.lang.String r2 = "installed"
            r0.<init>(r5, r2)
            r3.d = r0
            java.io.File r0 = new java.io.File
            java.lang.String r2 = "installed.json"
            r0.<init>(r5, r2)
            r3.e = r0
            java.io.File r5 = new java.io.File
            java.io.File r0 = new java.io.File
            java.io.File r4 = r4.getCacheDir()
            r0.<init>(r4, r1)
            java.lang.String r4 = "shaders_slang.zip.part"
            r5.<init>(r0, r4)
            r3.f = r5
            return
    }

    public static defpackage.wo5 c() {
            java.lang.String r0 = "HEAD"
            java.net.HttpURLConnection r0 = g(r0)
            int r1 = r0.getResponseCode()     // Catch: java.lang.Throwable -> L25 defpackage.yo5 -> L27 java.lang.Exception -> L31
            r2 = 200(0xc8, float:2.8E-43)
            if (r2 > r1) goto L29
            r2 = 300(0x12c, float:4.2E-43)
            if (r1 >= r2) goto L29
            wo5 r1 = new wo5     // Catch: java.lang.Throwable -> L25 defpackage.yo5 -> L27 java.lang.Exception -> L31
            long r2 = r0.getContentLengthLong()     // Catch: java.lang.Throwable -> L25 defpackage.yo5 -> L27 java.lang.Exception -> L31
            java.lang.String r4 = "Last-Modified"
            java.lang.String r4 = r0.getHeaderField(r4)     // Catch: java.lang.Throwable -> L25 defpackage.yo5 -> L27 java.lang.Exception -> L31
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L25 defpackage.yo5 -> L27 java.lang.Exception -> L31
            r0.disconnect()
            return r1
        L25:
            r1 = move-exception
            goto L3a
        L27:
            r1 = move-exception
            goto L39
        L29:
            yo5 r1 = new yo5     // Catch: java.lang.Throwable -> L25 defpackage.yo5 -> L27 java.lang.Exception -> L31
            xo5 r2 = defpackage.xo5.HttpError     // Catch: java.lang.Throwable -> L25 defpackage.yo5 -> L27 java.lang.Exception -> L31
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L25 defpackage.yo5 -> L27 java.lang.Exception -> L31
            throw r1     // Catch: java.lang.Throwable -> L25 defpackage.yo5 -> L27 java.lang.Exception -> L31
        L31:
            yo5 r1 = new yo5     // Catch: java.lang.Throwable -> L25
            xo5 r2 = defpackage.xo5.NoNetwork     // Catch: java.lang.Throwable -> L25
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L25
            throw r1     // Catch: java.lang.Throwable -> L25
        L39:
            throw r1     // Catch: java.lang.Throwable -> L25
        L3a:
            r0.disconnect()
            throw r1
    }

    public static java.net.HttpURLConnection g(java.lang.String r2) {
            java.net.URL r0 = new java.net.URL
            java.lang.String r1 = "https://buildbot.libretro.com/assets/frontend/shaders_slang.zip"
            r0.<init>(r1)
            java.net.URLConnection r0 = r0.openConnection()
            r0.getClass()
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            r0.setRequestMethod(r2)
            r2 = 10000(0x2710, float:1.4013E-41)
            r0.setConnectTimeout(r2)
            r2 = 30000(0x7530, float:4.2039E-41)
            r0.setReadTimeout(r2)
            java.lang.String r2 = "User-Agent"
            java.lang.String r1 = "melonDS-android-shaders"
            r0.setRequestProperty(r2, r1)
            return r0
    }

    public final void a(defpackage.wo5 r12, defpackage.qn2 r13, defpackage.bp5 r14) {
            r11 = this;
            l61 r14 = r14.B
            java.io.File r11 = r11.f
            java.io.File r0 = r11.getParentFile()
            if (r0 == 0) goto Ld
            r0.mkdirs()
        Ld:
            r11.delete()
            java.lang.String r0 = "GET"
            java.net.HttpURLConnection r0 = g(r0)
            int r1 = r0.getResponseCode()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> Laa
            r2 = 200(0xc8, float:2.8E-43)
            if (r2 > r1) goto La2
            r2 = 300(0x12c, float:4.2E-43)
            if (r1 >= r2) goto La2
            long r1 = r0.getContentLengthLong()     // Catch: java.lang.Throwable -> L3e defpackage.yo5 -> L41 java.lang.Exception -> Lb2
            java.lang.Long r3 = new java.lang.Long     // Catch: java.lang.Throwable -> L3e defpackage.yo5 -> L41 java.lang.Exception -> Lb2
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L3e defpackage.yo5 -> L41 java.lang.Exception -> Lb2
            long r1 = r3.longValue()     // Catch: java.lang.Throwable -> L3e defpackage.yo5 -> L41 java.lang.Exception -> Lb2
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L36
            goto L37
        L36:
            r3 = 0
        L37:
            if (r3 == 0) goto L44
            long r1 = r3.longValue()     // Catch: java.lang.Throwable -> L3e defpackage.yo5 -> L41 java.lang.Exception -> Lb2
            goto L46
        L3e:
            r11 = move-exception
            goto Lc1
        L41:
            r11 = move-exception
            goto Lc0
        L44:
            long r1 = r12.a     // Catch: java.lang.Throwable -> L3e defpackage.yo5 -> L41 java.lang.Exception -> Lb2
        L46:
            java.io.InputStream r12 = r0.getInputStream()     // Catch: java.lang.Throwable -> L3e defpackage.yo5 -> L41 java.lang.Exception -> Lb2
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L7f
            r3.<init>(r11)     // Catch: java.lang.Throwable -> L7f
            r6 = 65536(0x10000, float:9.1835E-41)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L95
            r7 = r4
        L54:
            r14.getClass()     // Catch: java.lang.Throwable -> L95
            defpackage.yh2.o(r14)     // Catch: java.lang.Throwable -> L95
            int r9 = r12.read(r6)     // Catch: java.lang.Throwable -> L95
            if (r9 >= 0) goto L81
            r3.close()     // Catch: java.lang.Throwable -> L7f
            r12.close()     // Catch: java.lang.Throwable -> L3e defpackage.yo5 -> L41 java.lang.Exception -> Lb2
            int r12 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r12 <= 0) goto L7b
            long r11 = r11.length()     // Catch: java.lang.Throwable -> L3e defpackage.yo5 -> L41 java.lang.Exception -> Lb2
            int r11 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r11 != 0) goto L73
            goto L7b
        L73:
            yo5 r11 = new yo5     // Catch: java.lang.Throwable -> L3e defpackage.yo5 -> L41 java.lang.Exception -> Lb2
            xo5 r12 = defpackage.xo5.Truncated     // Catch: java.lang.Throwable -> L3e defpackage.yo5 -> L41 java.lang.Exception -> Lb2
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L3e defpackage.yo5 -> L41 java.lang.Exception -> Lb2
            throw r11     // Catch: java.lang.Throwable -> L3e defpackage.yo5 -> L41 java.lang.Exception -> Lb2
        L7b:
            r0.disconnect()
            return
        L7f:
            r11 = move-exception
            goto L9c
        L81:
            r10 = 0
            r3.write(r6, r10, r9)     // Catch: java.lang.Throwable -> L95
            long r9 = (long) r9     // Catch: java.lang.Throwable -> L95
            long r7 = r7 + r9
            so5 r9 = new so5     // Catch: java.lang.Throwable -> L95
            lm1 r10 = new lm1     // Catch: java.lang.Throwable -> L95
            r10.<init>(r1, r7)     // Catch: java.lang.Throwable -> L95
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L95
            r13.g(r9)     // Catch: java.lang.Throwable -> L95
            goto L54
        L95:
            r11 = move-exception
            throw r11     // Catch: java.lang.Throwable -> L97
        L97:
            r13 = move-exception
            defpackage.ge7.t(r3, r11)     // Catch: java.lang.Throwable -> L7f
            throw r13     // Catch: java.lang.Throwable -> L7f
        L9c:
            throw r11     // Catch: java.lang.Throwable -> L9d
        L9d:
            r13 = move-exception
            defpackage.ge7.t(r12, r11)     // Catch: java.lang.Throwable -> L3e defpackage.yo5 -> L41 java.lang.Exception -> Lb2
            throw r13     // Catch: java.lang.Throwable -> L3e defpackage.yo5 -> L41 java.lang.Exception -> Lb2
        La2:
            yo5 r11 = new yo5     // Catch: java.lang.Throwable -> L3e defpackage.yo5 -> L41 java.lang.Exception -> Lb2
            xo5 r12 = defpackage.xo5.HttpError     // Catch: java.lang.Throwable -> L3e defpackage.yo5 -> L41 java.lang.Exception -> Lb2
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L3e defpackage.yo5 -> L41 java.lang.Exception -> Lb2
            throw r11     // Catch: java.lang.Throwable -> L3e defpackage.yo5 -> L41 java.lang.Exception -> Lb2
        Laa:
            yo5 r11 = new yo5     // Catch: java.lang.Throwable -> L3e defpackage.yo5 -> L41 java.lang.Exception -> Lb2
            xo5 r12 = defpackage.xo5.NoNetwork     // Catch: java.lang.Throwable -> L3e defpackage.yo5 -> L41 java.lang.Exception -> Lb2
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L3e defpackage.yo5 -> L41 java.lang.Exception -> Lb2
            throw r11     // Catch: java.lang.Throwable -> L3e defpackage.yo5 -> L41 java.lang.Exception -> Lb2
        Lb2:
            r14.getClass()     // Catch: java.lang.Throwable -> L3e
            defpackage.yh2.o(r14)     // Catch: java.lang.Throwable -> L3e
            yo5 r11 = new yo5     // Catch: java.lang.Throwable -> L3e
            xo5 r12 = defpackage.xo5.NoNetwork     // Catch: java.lang.Throwable -> L3e
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L3e
            throw r11     // Catch: java.lang.Throwable -> L3e
        Lc0:
            throw r11     // Catch: java.lang.Throwable -> L3e
        Lc1:
            r0.disconnect()
            throw r11
    }

    public final java.lang.Object b(java.io.File r6, defpackage.qn2 r7, defpackage.s41 r8) {
            r5 = this;
            boolean r0 = r8 instanceof defpackage.ap5
            if (r0 == 0) goto L13
            r0 = r8
            ap5 r0 = (defpackage.ap5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ap5 r0 = new ap5
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            jg7 r3 = defpackage.jg7.a
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L29
            defpackage.oi2.Y(r8)     // Catch: defpackage.oo5 -> L43
            return r3
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            r5 = 0
            return r5
        L30:
            defpackage.oi2.Y(r8)
            java.io.File r5 = r5.f     // Catch: defpackage.oo5 -> L43
            no3 r8 = new no3     // Catch: defpackage.oo5 -> L43
            r8.<init>(r4, r7)     // Catch: defpackage.oo5 -> L43
            r0.Y = r4     // Catch: defpackage.oo5 -> L43
            defpackage.bl2.v(r5, r6, r8, r0)     // Catch: defpackage.oo5 -> L43
            if (r3 != r1) goto L42
            return r1
        L42:
            return r3
        L43:
            yo5 r5 = new yo5
            xo5 r6 = defpackage.xo5.CorruptArchive
            r5.<init>(r6)
            throw r5
    }

    public final java.io.File d() {
            r3 = this;
            java.io.File r0 = r3.d
            boolean r1 = r0.isDirectory()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            zo5 r3 = r3.h()
            if (r3 == 0) goto L13
            java.lang.String r3 = r3.g
            goto L14
        L13:
            r3 = r2
        L14:
            if (r3 == 0) goto L23
            boolean r1 = defpackage.qs6.v0(r3)
            if (r1 == 0) goto L1d
            goto L23
        L1d:
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r3)
            r0 = r1
        L23:
            boolean r3 = r0.isDirectory()
            if (r3 == 0) goto L2a
            return r0
        L2a:
            return r2
    }

    public final java.lang.Object e(defpackage.ro5 r13, defpackage.s41 r14) {
            r12 = this;
            java.io.File r0 = r12.d
            boolean r1 = r14 instanceof defpackage.bp5
            if (r1 == 0) goto L15
            r1 = r14
            bp5 r1 = (defpackage.bp5) r1
            int r2 = r1.e0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.e0 = r2
            goto L1a
        L15:
            bp5 r1 = new bp5
            r1.<init>(r12, r14)
        L1a:
            java.lang.Object r14 = r1.Z
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.e0
            java.io.File r4 = r12.f
            jg7 r5 = defpackage.jg7.a
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L4c
            if (r3 == r7) goto L41
            if (r3 != r6) goto L3a
            java.io.File r13 = r1.Y
            wo5 r2 = r1.X
            qn2 r1 = r1.R
            defpackage.oi2.Y(r14)     // Catch: java.lang.Throwable -> L37
            goto Lac
        L37:
            r12 = move-exception
            goto Leb
        L3a:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            r12 = 0
            return r12
        L41:
            java.io.File r13 = r1.Y
            wo5 r3 = r1.X
            qn2 r7 = r1.R
            defpackage.oi2.Y(r14)     // Catch: java.lang.Throwable -> L37
            r14 = r3
            goto L9b
        L4c:
            defpackage.oi2.Y(r14)
            wo5 r14 = c()
            long r8 = r14.a
            r10 = 0
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 > 0) goto L5c
            goto L72
        L5c:
            r10 = 4
            long r10 = r10 * r8
            long r10 = r10 + r8
            r8 = 33554432(0x2000000, double:1.6578092E-316)
            long r10 = r10 + r8
            android.content.Context r3 = r12.a
            java.io.File r3 = r3.getFilesDir()
            long r8 = r3.getUsableSpace()
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 < 0) goto Lf4
        L72:
            java.io.File r3 = new java.io.File
            java.util.UUID r8 = java.util.UUID.randomUUID()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "pending-"
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.io.File r9 = r12.c
            r3.<init>(r9, r8)
            r1.R = r13     // Catch: java.lang.Throwable -> Le9
            r1.X = r14     // Catch: java.lang.Throwable -> Le9
            r1.Y = r3     // Catch: java.lang.Throwable -> Le9
            r1.e0 = r7     // Catch: java.lang.Throwable -> Le9
            r12.a(r14, r13, r1)     // Catch: java.lang.Throwable -> Le9
            if (r5 != r2) goto L99
            goto La9
        L99:
            r7 = r13
            r13 = r3
        L9b:
            r1.R = r7     // Catch: java.lang.Throwable -> L37
            r1.X = r14     // Catch: java.lang.Throwable -> L37
            r1.Y = r13     // Catch: java.lang.Throwable -> L37
            r1.e0 = r6     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r12.b(r13, r7, r1)     // Catch: java.lang.Throwable -> L37
            if (r1 != r2) goto Laa
        La9:
            return r2
        Laa:
            r2 = r14
            r1 = r7
        Lac:
            uo5 r14 = defpackage.uo5.a     // Catch: java.lang.Throwable -> L37
            r1.g(r14)     // Catch: java.lang.Throwable -> L37
            java.lang.String r14 = defpackage.bl2.s(r13)     // Catch: java.lang.Throwable -> L37
            defpackage.jc2.x0(r0)     // Catch: java.lang.Throwable -> L37
            java.io.File r1 = r0.getParentFile()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto Lc1
            r1.mkdirs()     // Catch: java.lang.Throwable -> L37
        Lc1:
            boolean r0 = r13.renameTo(r0)     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto Le1
            r12.i(r2, r14)     // Catch: java.lang.Throwable -> L37
            android.content.SharedPreferences r12 = r12.b     // Catch: java.lang.Throwable -> L37
            android.content.SharedPreferences$Editor r12 = r12.edit()     // Catch: java.lang.Throwable -> L37
            java.lang.String r14 = "video_retroarch_shader_library_version"
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L37
            android.content.SharedPreferences$Editor r12 = r12.putLong(r14, r0)     // Catch: java.lang.Throwable -> L37
            r12.apply()     // Catch: java.lang.Throwable -> L37
            r4.delete()
            return r5
        Le1:
            yo5 r12 = new yo5     // Catch: java.lang.Throwable -> L37
            xo5 r14 = defpackage.xo5.CorruptArchive     // Catch: java.lang.Throwable -> L37
            r12.<init>(r14)     // Catch: java.lang.Throwable -> L37
            throw r12     // Catch: java.lang.Throwable -> L37
        Le9:
            r12 = move-exception
            r13 = r3
        Leb:
            defpackage.jc2.x0(r13)     // Catch: java.lang.Throwable -> Lef
            throw r12     // Catch: java.lang.Throwable -> Lef
        Lef:
            r12 = move-exception
            r4.delete()
            throw r12
        Lf4:
            java.lang.String r12 = "Not enough space for shader install: need "
            java.lang.String r13 = ", have "
            java.lang.StringBuilder r12 = defpackage.xg6.s(r10, r12, r13)
            r12.append(r8)
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "RetroArchShaderLibrary"
            android.util.Log.w(r13, r12)
            yo5 r12 = new yo5
            xo5 r13 = defpackage.xo5.NotEnoughSpace
            r12.<init>(r13, r10)
            throw r12
    }

    public final long f() {
            r6 = this;
            java.io.File r0 = r6.d
            boolean r1 = r0.isDirectory()
            r2 = 0
            if (r1 != 0) goto Lb
            return r2
        Lb:
            zo5 r6 = r6.h()
            if (r6 == 0) goto L24
            long r4 = r6.e
            java.lang.Long r6 = java.lang.Long.valueOf(r4)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L1c
            goto L1d
        L1c:
            r6 = 0
        L1d:
            if (r6 == 0) goto L24
            long r0 = r6.longValue()
            return r0
        L24:
            ic2 r6 = defpackage.ic2.TOP_DOWN
            hc2 r6 = defpackage.jc2.E0(r0, r6)
            gn5 r0 = new gn5
            r1 = 2
            r0.<init>(r1)
            pc2 r1 = new pc2
            r4 = 1
            r1.<init>(r6, r4, r0)
            oc2 r6 = new oc2
            r6.<init>(r1)
        L3b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r6.next()
            java.io.File r0 = (java.io.File) r0
            long r0 = r0.length()
            long r2 = r2 + r0
            goto L3b
        L4d:
            return r2
    }

    public final defpackage.zo5 h() {
            r13 = this;
            java.io.File r13 = r13.e
            boolean r0 = r13.isFile()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6e
            java.lang.String r13 = defpackage.jc2.B0(r13)     // Catch: java.lang.Throwable -> L6e
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L6e
            zo5 r2 = new zo5     // Catch: java.lang.Throwable -> L6e
            java.lang.String r13 = "sourceUrl"
            java.lang.String r3 = "https://buildbot.libretro.com/assets/frontend/shaders_slang.zip"
            java.lang.String r3 = r0.optString(r13, r3)     // Catch: java.lang.Throwable -> L6e
            r3.getClass()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r13 = "remoteLastModified"
            boolean r4 = r0.isNull(r13)     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L29
            goto L38
        L29:
            java.lang.String r13 = r0.optString(r13)     // Catch: java.lang.Throwable -> L6e
            r13.getClass()     // Catch: java.lang.Throwable -> L6e
            boolean r4 = defpackage.qs6.v0(r13)     // Catch: java.lang.Throwable -> L6e
            if (r4 != 0) goto L38
            r4 = r13
            goto L39
        L38:
            r4 = r1
        L39:
            java.lang.String r13 = "remoteContentLength"
            long r5 = r0.optLong(r13)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r13 = "installedAtMillis"
            long r7 = r0.optLong(r13)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r13 = "installedBytes"
            long r9 = r0.optLong(r13)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r13 = "fileCount"
            int r11 = r0.optInt(r13)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r13 = "rootSubdirectory"
            boolean r12 = r0.isNull(r13)     // Catch: java.lang.Throwable -> L6e
            if (r12 == 0) goto L5a
            goto L69
        L5a:
            java.lang.String r13 = r0.optString(r13)     // Catch: java.lang.Throwable -> L6e
            r13.getClass()     // Catch: java.lang.Throwable -> L6e
            boolean r0 = defpackage.qs6.v0(r13)     // Catch: java.lang.Throwable -> L6e
            if (r0 != 0) goto L69
            r12 = r13
            goto L6a
        L69:
            r12 = r1
        L6a:
            r2.<init>(r3, r4, r5, r7, r9, r11, r12)     // Catch: java.lang.Throwable -> L6e
            goto L75
        L6e:
            r0 = move-exception
            r13 = r0
            em5 r2 = new em5
            r2.<init>(r13)
        L75:
            boolean r13 = r2 instanceof defpackage.em5
            if (r13 == 0) goto L7a
            goto L7b
        L7a:
            r1 = r2
        L7b:
            zo5 r1 = (defpackage.zo5) r1
            return r1
    }

    public final void i(defpackage.wo5 r8, java.lang.String r9) {
            r7 = this;
            java.io.File r0 = r7.d
            r0.getClass()
            ic2 r1 = defpackage.ic2.TOP_DOWN
            hc2 r0 = defpackage.jc2.E0(r0, r1)
            fc2 r1 = new fc2
            r1.<init>(r0)
            r2 = 0
            r0 = 0
        L13:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L2e
            java.lang.Object r4 = r1.next()
            java.io.File r4 = (java.io.File) r4
            boolean r5 = r4.isFile()
            if (r5 == 0) goto L13
            long r4 = r4.length()
            long r4 = r4 + r2
            int r0 = r0 + 1
            r2 = r4
            goto L13
        L2e:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r4 = "sourceUrl"
            java.lang.String r5 = "https://buildbot.libretro.com/assets/frontend/shaders_slang.zip"
            r1.put(r4, r5)
            java.lang.String r4 = "remoteContentLength"
            long r5 = r8.a
            r1.put(r4, r5)
            java.lang.String r4 = "installedAtMillis"
            long r5 = java.lang.System.currentTimeMillis()
            r1.put(r4, r5)
            java.lang.String r4 = "installedBytes"
            r1.put(r4, r2)
            java.lang.String r2 = "fileCount"
            r1.put(r2, r0)
            java.lang.String r8 = r8.b
            if (r8 == 0) goto L5d
            java.lang.String r0 = "remoteLastModified"
            r1.put(r0, r8)
        L5d:
            if (r9 == 0) goto L64
            java.lang.String r8 = "rootSubdirectory"
            r1.put(r8, r9)
        L64:
            java.io.File r7 = r7.e
            java.io.File r8 = r7.getParentFile()
            if (r8 == 0) goto L6f
            r8.mkdirs()
        L6f:
            java.lang.String r8 = r1.toString()
            r8.getClass()
            defpackage.jc2.F0(r7, r8)
            return
    }
}
