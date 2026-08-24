package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e70  reason: default package */
/* loaded from: classes.dex */
public final class e70 {
    public final defpackage.o41 a;
    public final java.io.File b;
    public final java.io.File c;
    public final defpackage.hb4 d;
    public final java.util.concurrent.ConcurrentHashMap e;
    public java.util.List f;
    public boolean g;
    public boolean h;

    public e70(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            gu6 r0 = defpackage.oi2.c()
            xe1 r1 = defpackage.xk1.a
            de1 r1 = defpackage.de1.L
            l61 r0 = defpackage.jw2.y(r0, r1)
            o41 r0 = defpackage.g04.i(r0)
            r3.a = r0
            java.io.File r1 = new java.io.File
            java.io.File r4 = r4.getFilesDir()
            java.lang.String r2 = "boxart"
            r1.<init>(r4, r2)
            r1.mkdirs()
            java.io.File r4 = new java.io.File
            java.lang.String r2 = "named_boxarts_index_v3.txt"
            r4.<init>(r1, r2)
            r3.b = r4
            java.io.File r4 = new java.io.File
            java.lang.String r2 = "matches_v3.json"
            r4.<init>(r1, r2)
            r3.c = r4
            hb4 r4 = new hb4
            r4.<init>()
            r3.d = r4
            java.util.concurrent.ConcurrentHashMap r4 = new java.util.concurrent.ConcurrentHashMap
            r4.<init>()
            r3.e = r4
            y3 r4 = new y3
            r1 = 4
            r2 = 0
            r4.<init>(r3, r2, r1)
            r3 = 3
            defpackage.hv.L(r0, r2, r2, r4, r3)
            return
    }

    public static final defpackage.d70 a(defpackage.e70 r17, java.util.ArrayList r18, java.util.List r19) {
            r0 = r18
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L8:
            r4 = 0
            if (r3 >= r1) goto L4a
            java.lang.Object r5 = r0.get(r3)
            int r3 = r3 + 1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = " ("
            java.lang.String r6 = defpackage.qs6.Q0(r5, r6)
            boolean r7 = defpackage.qs6.v0(r6)
            if (r7 == 0) goto L20
            goto L21
        L20:
            r5 = r6
        L21:
            java.lang.String r5 = f(r5)
            boolean r6 = defpackage.qs6.v0(r5)
            if (r6 != 0) goto L8
            java.util.Iterator r6 = r19.iterator()
        L2f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L45
            java.lang.Object r7 = r6.next()
            r8 = r7
            d70 r8 = (defpackage.d70) r8
            java.lang.String r8 = r8.b
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L2f
            r4 = r7
        L45:
            d70 r4 = (defpackage.d70) r4
            if (r4 == 0) goto L8
            return r4
        L4a:
            int r1 = r0.size()
            r5 = 0
            r9 = r2
            r3 = r4
            r7 = r5
        L53:
            if (r9 >= r1) goto Le2
            java.lang.Object r10 = r0.get(r9)
            int r9 = r9 + 1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r10 = f(r10)
            r11 = 1
            char[] r11 = new char[r11]
            r12 = 32
            r11[r2] = r12
            r12 = 6
            java.util.List r10 = defpackage.qs6.J0(r10, r11, r12)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L76:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L8d
            java.lang.Object r12 = r10.next()
            r13 = r12
            java.lang.String r13 = (java.lang.String) r13
            int r13 = r13.length()
            if (r13 <= 0) goto L76
            r11.add(r12)
            goto L76
        L8d:
            java.util.Set r10 = defpackage.gt0.p1(r11)
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L53
            java.util.Iterator r11 = r19.iterator()
        L9b:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Lde
            java.lang.Object r12 = r11.next()
            d70 r12 = (defpackage.d70) r12
            java.util.Set r13 = r12.c
            boolean r14 = r13.isEmpty()
            if (r14 != 0) goto Ld9
            r14 = r10
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.LinkedHashSet r15 = defpackage.gt0.M0(r14, r13)
            int r15 = r15.size()
            r16 = r3
            double r2 = (double) r15
            int r15 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r15 != 0) goto Lc4
            goto Ldb
        Lc4:
            java.util.Set r14 = defpackage.gt0.o1(r14)
            defpackage.gt0.A0(r14, r13)
            int r13 = r14.size()
            double r13 = (double) r13
            double r2 = r2 / r13
            int r13 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r13 <= 0) goto Ldb
            r7 = r2
            r3 = r12
        Ld7:
            r2 = 0
            goto L9b
        Ld9:
            r16 = r3
        Ldb:
            r3 = r16
            goto Ld7
        Lde:
            r16 = r3
            goto L53
        Le2:
            r0 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto Lec
            return r3
        Lec:
            return r4
    }

    public static final java.util.List b(defpackage.e70 r10) {
            java.io.File r1 = r10.b
            java.util.List r0 = r10.f
            if (r0 == 0) goto L7
            return r0
        L7:
            boolean r0 = r1.isFile()
            r2 = 0
            if (r0 == 0) goto L36
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r1.lastModified()
            long r3 = r3 - r5
            r5 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L36
            java.lang.String r0 = defpackage.jc2.B0(r1)     // Catch: java.lang.Throwable -> L25
            goto L2c
        L25:
            r0 = move-exception
            em5 r1 = new em5
            r1.<init>(r0)
            r0 = r1
        L2c:
            boolean r1 = r0 instanceof defpackage.em5
            if (r1 == 0) goto L32
            r0 = r2
        L32:
            java.lang.String r0 = (java.lang.String) r0
            goto L94
        L36:
            java.lang.String r0 = "https://thumbnails.libretro.com/Nintendo%20-%20Nintendo%20DS/Named_Boxarts/"
            java.lang.String r3 = "DS"
            java.util.List r0 = d(r0, r3)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = "https://thumbnails.libretro.com/Nintendo%20-%20Nintendo%20DSi/Named_Boxarts/"
            java.lang.String r4 = "DSI"
            java.util.List r3 = d(r3, r4)     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayList r4 = defpackage.gt0.V0(r0, r3)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r5 = "\n"
            r8 = 0
            r9 = 62
            r6 = 0
            r7 = 0
            java.lang.String r0 = defpackage.gt0.P0(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L5e
            boolean r3 = defpackage.qs6.v0(r0)     // Catch: java.lang.Throwable -> L5e
            if (r3 != 0) goto L5c
            goto L65
        L5c:
            r0 = r2
            goto L65
        L5e:
            r0 = move-exception
            em5 r3 = new em5
            r3.<init>(r0)
            r0 = r3
        L65:
            boolean r3 = r0 instanceof defpackage.em5
            if (r3 == 0) goto L6b
            r0 = r2
        L6b:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L73
            defpackage.jc2.F0(r1, r0)     // Catch: java.lang.Throwable -> L94
            goto L94
        L73:
            boolean r0 = r1.isFile()     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L7a
            goto L7b
        L7a:
            r1 = r2
        L7b:
            if (r1 == 0) goto L84
            java.lang.String r0 = defpackage.jc2.B0(r1)     // Catch: java.lang.Throwable -> L82
            goto L8c
        L82:
            r0 = move-exception
            goto L86
        L84:
            r0 = r2
            goto L8c
        L86:
            em5 r1 = new em5
            r1.<init>(r0)
            r0 = r1
        L8c:
            boolean r1 = r0 instanceof defpackage.em5
            if (r1 == 0) goto L92
            r0 = r2
        L92:
            java.lang.String r0 = (java.lang.String) r0
        L94:
            if (r0 != 0) goto L97
            goto Lb9
        L97:
            ev r1 = new ev
            r2 = 4
            r1.<init>(r0, r2)
            k4 r0 = new k4
            r2 = 21
            r0.<init>(r2)
            pc2 r2 = new pc2
            r3 = 1
            r2.<init>(r1, r3, r0)
            k4 r0 = new k4
            r0.<init>(r10)
            pc2 r0 = defpackage.sb6.b0(r2, r0)
            java.util.List r2 = defpackage.sb6.c0(r0)
            r10.f = r2
        Lb9:
            return r2
    }

    public static final void c(defpackage.e70 r5) {
            java.io.File r0 = r5.c
            boolean r1 = r5.g
            if (r1 == 0) goto L7
            return
        L7:
            boolean r1 = r0.isFile()     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L32
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = defpackage.jc2.B0(r0)     // Catch: java.lang.Throwable -> L32
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r0 = r1.keys()     // Catch: java.lang.Throwable -> L32
        L1a:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L32
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.ConcurrentHashMap r3 = r5.e     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = "-"
            java.lang.String r4 = r1.optString(r2, r4)     // Catch: java.lang.Throwable -> L32
            r3.put(r2, r4)     // Catch: java.lang.Throwable -> L32
            goto L1a
        L32:
            r0 = 1
            r5.g = r0
            return
    }

    public static java.util.List d(java.lang.String r3, java.lang.String r4) {
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> L69
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L69
            java.net.URLConnection r3 = r0.openConnection()     // Catch: java.lang.Throwable -> L69
            r3.getClass()     // Catch: java.lang.Throwable -> L69
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> L69
            r0 = 10000(0x2710, float:1.4013E-41)
            r3.setConnectTimeout(r0)     // Catch: java.lang.Throwable -> L69
            r0 = 30000(0x7530, float:4.2039E-41)
            r3.setReadTimeout(r0)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = "User-Agent"
            java.lang.String r1 = "melonDS-android-boxart"
            r3.setRequestProperty(r0, r1)     // Catch: java.lang.Throwable -> L69
            java.io.InputStream r0 = r3.getInputStream()     // Catch: java.lang.Throwable -> L64
            r0.getClass()     // Catch: java.lang.Throwable -> L64
            java.nio.charset.Charset r1 = defpackage.qm0.a     // Catch: java.lang.Throwable -> L64
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L64
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L64
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L64
            r1 = 8192(0x2000, float:1.148E-41)
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L64
            java.lang.String r0 = defpackage.yh2.E(r0)     // Catch: java.lang.Throwable -> L64
            xh5 r1 = new xh5     // Catch: java.lang.Throwable -> L64
            java.lang.String r2 = "href=\"([^\"]+\\.png)\""
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L64
            qd2 r0 = defpackage.xh5.a(r1, r0)     // Catch: java.lang.Throwable -> L64
            c70 r1 = new c70     // Catch: java.lang.Throwable -> L64
            r2 = 0
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L64
            qd2 r4 = new qd2     // Catch: java.lang.Throwable -> L64
            r2 = 2
            r4.<init>(r0, r1, r2)     // Catch: java.lang.Throwable -> L64
            k4 r0 = new k4     // Catch: java.lang.Throwable -> L64
            r1 = 23
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L64
            pc2 r1 = new pc2     // Catch: java.lang.Throwable -> L64
            r2 = 1
            r1.<init>(r4, r2, r0)     // Catch: java.lang.Throwable -> L64
            java.util.List r4 = defpackage.sb6.c0(r1)     // Catch: java.lang.Throwable -> L64
            r3.disconnect()     // Catch: java.lang.Throwable -> L69
            goto L6f
        L64:
            r4 = move-exception
            r3.disconnect()     // Catch: java.lang.Throwable -> L69
            throw r4     // Catch: java.lang.Throwable -> L69
        L69:
            r3 = move-exception
            em5 r4 = new em5
            r4.<init>(r3)
        L6f:
            java.lang.Throwable r3 = defpackage.hm5.a(r4)
            if (r3 != 0) goto L76
            goto L78
        L76:
            yt1 r4 = defpackage.yt1.A
        L78:
            java.util.List r4 = (java.util.List) r4
            return r4
    }

    public static java.lang.String f(java.lang.String r2) {
            java.text.Normalizer$Form r0 = java.text.Normalizer.Form.NFD
            java.lang.String r2 = java.text.Normalizer.normalize(r2, r0)
            r2.getClass()
            java.lang.String r0 = "\\p{M}+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            java.lang.String r1 = ""
            java.util.regex.Matcher r2 = r0.matcher(r2)
            java.lang.String r2 = r2.replaceAll(r1)
            r2.getClass()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r0)
            r2.getClass()
            java.lang.String r0 = "\\(.*?\\)|\\[.*?]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            java.util.regex.Matcher r2 = r0.matcher(r2)
            java.lang.String r0 = " "
            java.lang.String r2 = r2.replaceAll(r0)
            r2.getClass()
            java.lang.String r1 = "[^a-z0-9]+"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r1.getClass()
            java.util.regex.Matcher r2 = r1.matcher(r2)
            java.lang.String r2 = r2.replaceAll(r0)
            r2.getClass()
            java.lang.CharSequence r2 = defpackage.qs6.T0(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = "\\s+"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r1.getClass()
            r2.getClass()
            java.util.regex.Matcher r2 = r1.matcher(r2)
            java.lang.String r2 = r2.replaceAll(r0)
            r2.getClass()
            return r2
    }

    public final java.lang.Object e(defpackage.pq5 r5, defpackage.hw6 r6) {
            r4 = this;
            xe1 r0 = defpackage.xk1.a
            de1 r0 = defpackage.de1.L
            hn r1 = new hn
            r2 = 0
            r3 = 2
            r1.<init>(r5, r4, r2, r3)
            java.lang.Object r4 = defpackage.hv.d0(r0, r1, r6)
            return r4
    }
}
