package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u63  reason: default package */
/* loaded from: classes.dex */
public class u63 implements defpackage.go1, defpackage.oy7, defpackage.f36 {
    public static final int[] R = null;
    public static final defpackage.u63 X = null;
    public final /* synthetic */ int A;
    public java.lang.Object B;
    public java.lang.Object L;

    static {
            r0 = 16843067(0x101013b, float:2.369444E-38)
            r1 = 16843068(0x101013c, float:2.3694444E-38)
            int[] r0 = new int[]{r0, r1}
            defpackage.u63.R = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1 = 0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            wr4 r2 = new wr4
            r2.<init>(r1, r1)
            wr4 r1 = new wr4
            r1.<init>(r0, r0)
            u63 r0 = new u63
            r3 = 2
            r0.<init>(r3, r2, r1)
            defpackage.u63.X = r0
            return
    }

    public u63(int r2) {
            r1 = this;
            r1.A = r2
            yt1 r0 = defpackage.yt1.A
            switch(r2) {
                case 10: goto L4e;
                case 17: goto L3d;
                case 18: goto L23;
                case 19: goto L17;
                default: goto L7;
            }
        L7:
            r1.<init>()
            android.view.Choreographer r2 = android.view.Choreographer.getInstance()
            r1.B = r2
            android.os.Looper r2 = android.os.Looper.myLooper()
            r1.L = r2
            return
        L17:
            r1.<init>()
            du1 r2 = defpackage.du1.A
            r1.B = r2
            zt1 r2 = defpackage.zt1.A
            r1.L = r2
            return
        L23:
            r1.<init>()
            jg0 r2 = new jg0
            r2.<init>()
            xw r0 = defpackage.g04.u(r0)
            r2.a = r0
            r1.B = r2
            u63 r2 = new u63
            r0 = 17
            r2.<init>(r0)
            r1.L = r2
            return
        L3d:
            r1.<init>()
            di5 r2 = new di5
            r2.<init>()
            r1.B = r2
            xw r2 = defpackage.g04.u(r0)
            r1.L = r2
            return
        L4e:
            r1.<init>()
            return
    }

    public u63(int r1, defpackage.eo2 r2) {
            r0 = this;
            r0.A = r1
            switch(r1) {
                case 26: goto L12;
                default: goto L5;
            }
        L5:
            r0.<init>()
            r0.B = r2
            cr0 r1 = new cr0
            r1.<init>()
            r0.L = r1
            return
        L12:
            r0.<init>()
            r0.B = r2
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.L = r1
            return
    }

    public /* synthetic */ u63(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.<init>()
            return
    }

    public /* synthetic */ u63(int r1, java.lang.Object r2, java.lang.Object r3, boolean r4) {
            r0 = this;
            r0.A = r1
            r0.L = r2
            r0.B = r3
            r0.<init>()
            return
    }

    public u63(int r1, defpackage.qn2 r2) {
            r0 = this;
            r0.A = r1
            switch(r1) {
                case 25: goto L12;
                default: goto L5;
            }
        L5:
            r0.<init>()
            r0.B = r2
            cr0 r1 = new cr0
            r1.<init>()
            r0.L = r1
            return
        L12:
            r0.<init>()
            r0.B = r2
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.L = r1
            return
    }

    public u63(defpackage.ai1 r2, defpackage.f36 r3) {
            r1 = this;
            r0 = 11
            r1.A = r0
            r1.<init>()
            r3.getClass()
            r1.L = r2
            r1.B = r3
            return
    }

    public u63(android.content.Context r5) {
            r4 = this;
            r0 = 13
            r4.A = r0
            r4.<init>()
            java.lang.Class<f24> r0 = defpackage.f24.class
            java.lang.String r0 = r0.getCanonicalName()
            r1 = 2130969456(0x7f040370, float:1.7547594E38)
            android.util.TypedValue r0 = defpackage.qo2.O(r5, r1, r0)
            int r0 = r0.data
            int[] r1 = defpackage.a75.m
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r0, r1)
            r1 = 4
            r2 = 0
            int r1 = r0.getResourceId(r1, r2)
            defpackage.cs1.p(r5, r1)
            r1 = 2
            int r1 = r0.getResourceId(r1, r2)
            defpackage.cs1.p(r5, r1)
            r1 = 3
            int r1 = r0.getResourceId(r1, r2)
            defpackage.cs1.p(r5, r1)
            r1 = 5
            int r1 = r0.getResourceId(r1, r2)
            defpackage.cs1.p(r5, r1)
            r1 = 7
            android.content.res.ColorStateList r1 = defpackage.np2.S(r5, r0, r1)
            r3 = 9
            int r3 = r0.getResourceId(r3, r2)
            cs1 r3 = defpackage.cs1.p(r5, r3)
            r4.B = r3
            r3 = 8
            int r3 = r0.getResourceId(r3, r2)
            defpackage.cs1.p(r5, r3)
            r3 = 10
            int r2 = r0.getResourceId(r3, r2)
            cs1 r5 = defpackage.cs1.p(r5, r2)
            r4.L = r5
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            int r5 = r1.getDefaultColor()
            r4.setColor(r5)
            r0.recycle()
            return
    }

    public u63(android.content.Context r2, defpackage.kd6 r3) {
            r1 = this;
            r0 = 3
            r1.A = r0
            r3.getClass()
            r1.<init>()
            r1.B = r2
            r1.L = r3
            return
    }

    public u63(android.view.View r3) {
            r2 = this;
            r0 = 0
            r2.A = r0
            r2.<init>()
            r2.B = r3
            xr3 r3 = defpackage.xr3.NONE
            er2 r0 = new er2
            r1 = 4
            r0.<init>(r2, r1)
            go3 r3 = defpackage.kj2.M(r3, r0)
            r2.L = r3
            return
    }

    public u63(android.widget.AbsSeekBar r2) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.B = r2
            return
    }

    public u63(android.widget.EditText r2) {
            r1 = this;
            r0 = 9
            r1.A = r0
            r1.<init>()
            r1.B = r2
            d51 r0 = new d51
            r0.<init>(r2)
            r1.L = r0
            return
    }

    public u63(defpackage.dd r3) {
            r2 = this;
            r0 = 4
            r2.A = r0
            r2.<init>()
            r2.L = r3
            cd r0 = new cd
            r1 = 0
            r0.<init>(r3, r1)
            r2.B = r0
            return
    }

    public u63(defpackage.i4 r2) {
            r1 = this;
            r2 = 23
            r1.A = r2
            r1.<init>()
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r0 = 0
            r2.<init>(r0)
            r1.B = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r2.<init>(r0)
            r1.L = r2
            return
    }

    public /* synthetic */ u63(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.L = r1
            r0.<init>()
            return
    }

    public u63(defpackage.kf0 r2, defpackage.qf0 r3) {
            r1 = this;
            r0 = 16
            r1.A = r0
            r2.getClass()
            r1.<init>()
            r1.B = r2
            r1.L = r3
            return
    }

    public u63(defpackage.n55 r2, defpackage.t57 r3) {
            r1 = this;
            r0 = 15
            r1.A = r0
            r2.getClass()
            r3.getClass()
            r1.<init>()
            r1.B = r2
            r1.L = r3
            return
    }

    public u63(defpackage.sg0 r2) {
            r1 = this;
            r0 = 28
            r1.A = r0
            r1.<init>()
            r1.B = r2
            lg0 r2 = r2.b
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE
            r0.getClass()
            qc0 r2 = (defpackage.qc0) r2
            java.lang.Object r2 = r2.c(r0)
            r2.getClass()
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            r1.L = r2
            return
    }

    public static java.net.HttpURLConnection B(defpackage.u63 r9, java.lang.String r10) {
            r9 = 0
            r0 = r9
        L2:
            r1 = 0
            r2 = 10
            if (r0 >= r2) goto Lbe
            java.net.URL r2 = new java.net.URL
            r2.<init>(r10)
            java.net.URLConnection r10 = r2.openConnection()
            r10.getClass()
            java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10
            r3 = 20000(0x4e20, float:2.8026E-41)
            r10.setConnectTimeout(r3)
            r3 = 45000(0xafc8, float:6.3058E-41)
            r10.setReadTimeout(r3)
            r10.setInstanceFollowRedirects(r9)
            java.lang.String r3 = "User-Agent"
            java.lang.String r4 = "Mozilla/5.0 (Linux; Android 14; Mobile) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Mobile Safari/537.36"
            r10.setRequestProperty(r3, r4)
            java.lang.String r3 = "Accept"
            java.lang.String r4 = "*/*"
            r10.setRequestProperty(r3, r4)
            r10.connect()
            int r3 = r10.getResponseCode()
            r4 = 301(0x12d, float:4.22E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 302(0x12e, float:4.23E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 303(0x12f, float:4.25E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 307(0x133, float:4.3E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 308(0x134, float:4.32E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Integer[] r4 = new java.lang.Integer[]{r4, r5, r6, r7, r8}
            java.util.List r4 = defpackage.hf.c0(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto La8
            java.lang.String r4 = "Location"
            java.lang.String r4 = r10.getHeaderField(r4)
            r10.disconnect()
            if (r4 == 0) goto L9c
            boolean r10 = defpackage.qs6.v0(r4)
            if (r10 != 0) goto L9c
            java.lang.String r10 = "http://"
            boolean r10 = defpackage.xs6.g0(r4, r10, r9)
            if (r10 != 0) goto L97
            java.lang.String r10 = "https://"
            boolean r10 = defpackage.xs6.g0(r4, r10, r9)
            if (r10 == 0) goto L8a
            goto L97
        L8a:
            java.net.URL r10 = new java.net.URL
            r10.<init>(r2, r4)
            java.lang.String r10 = r10.toString()
            r10.getClass()
            goto L98
        L97:
            r10 = r4
        L98:
            int r0 = r0 + 1
            goto L2
        L9c:
            java.lang.String r9 = "HTTP redirect "
            java.lang.String r10 = " with missing Location header"
            java.lang.String r9 = defpackage.lb1.k(r9, r3, r10)
            defpackage.e41.i(r9)
            return r1
        La8:
            r9 = 200(0xc8, float:2.8E-43)
            if (r9 > r3) goto Lb1
            r9 = 300(0x12c, float:4.2E-43)
            if (r3 >= r9) goto Lb1
            return r10
        Lb1:
            r10.disconnect()
            java.lang.String r9 = "HTTP error "
            java.lang.String r9 = defpackage.lb1.g(r3, r9)
            defpackage.e41.i(r9)
            return r1
        Lbe:
            java.lang.String r9 = "Too many redirects ("
            java.lang.String r10 = ")"
            java.lang.String r9 = defpackage.lb1.k(r9, r0, r10)
            defpackage.e41.i(r9)
            return r1
    }

    public static defpackage.ga C(java.io.File r3) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "meta.json"
            r0.<init>(r3, r1)
            boolean r3 = r0.isFile()
            r1 = 0
            if (r3 != 0) goto L14
            ga r3 = new ga
            r3.<init>(r1, r1)
            return r3
        L14:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = defpackage.jc2.B0(r0)     // Catch: java.lang.Throwable -> L45
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = "name"
            java.lang.String r0 = r3.optString(r0)     // Catch: java.lang.Throwable -> L45
            r0.getClass()     // Catch: java.lang.Throwable -> L45
            boolean r2 = defpackage.qs6.v0(r0)     // Catch: java.lang.Throwable -> L45
            if (r2 != 0) goto L2d
            goto L2e
        L2d:
            r0 = r1
        L2e:
            java.lang.String r2 = "libraryName"
            java.lang.String r3 = r3.optString(r2)     // Catch: java.lang.Throwable -> L45
            r3.getClass()     // Catch: java.lang.Throwable -> L45
            boolean r2 = defpackage.qs6.v0(r3)     // Catch: java.lang.Throwable -> L45
            if (r2 != 0) goto L3e
            goto L3f
        L3e:
            r3 = r1
        L3f:
            ga r2 = new ga     // Catch: java.lang.Throwable -> L45
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L45
            goto L4b
        L45:
            r3 = move-exception
            em5 r2 = new em5
            r2.<init>(r3)
        L4b:
            ga r3 = new ga
            r3.<init>(r1, r1)
            boolean r0 = r2 instanceof defpackage.em5
            if (r0 == 0) goto L55
            r2 = r3
        L55:
            ga r2 = (defpackage.ga) r2
            return r2
    }

    public static java.io.File E(java.io.File r6, defpackage.ga r7) {
            ic2 r0 = defpackage.ic2.TOP_DOWN
            hc2 r0 = defpackage.jc2.E0(r6, r0)
            k4 r1 = new k4
            r2 = 9
            r1.<init>(r2)
            pc2 r2 = new pc2
            r3 = 1
            r2.<init>(r0, r3, r1)
            java.util.List r0 = defpackage.sb6.c0(r2)
            java.lang.String r7 = r7.b
            if (r7 == 0) goto L66
            java.io.File r1 = new java.io.File
            r1.<init>(r6, r7)
            java.io.File r7 = r1.getCanonicalFile()
            java.io.File r6 = r6.getCanonicalFile()
            java.lang.String r1 = r7.getPath()
            r1.getClass()
            java.lang.String r6 = r6.getPath()
            java.lang.String r2 = java.io.File.separator
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            r4.append(r2)
            java.lang.String r6 = r4.toString()
            r2 = 0
            boolean r6 = defpackage.xs6.g0(r1, r6, r2)
            if (r6 == 0) goto L5e
            boolean r6 = r7.isFile()
            if (r6 == 0) goto L66
            java.lang.String r6 = defpackage.jc2.y0(r7)
            java.lang.String r1 = "so"
            boolean r6 = r6.equalsIgnoreCase(r1)
            if (r6 == 0) goto L66
            return r7
        L5e:
            ia r6 = new ia
            ha r7 = defpackage.ha.InvalidZip
            r6.<init>(r7)
            throw r6
        L66:
            java.lang.String r6 = "libvulkan_freedreno.so"
            java.lang.String r7 = "vulkan.adreno.so"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7}
            java.util.List r6 = defpackage.hf.c0(r6)
            java.util.Iterator r6 = r6.iterator()
        L76:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lc2
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        L8b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto La6
            java.lang.Object r4 = r2.next()
            r5 = r4
            java.io.File r5 = (java.io.File) r5
            java.lang.String r5 = r5.getName()
            boolean r5 = defpackage.xs6.Z(r5, r7, r3)
            if (r5 == 0) goto L8b
            r1.add(r4)
            goto L8b
        La6:
            int r7 = r1.size()
            if (r7 != r3) goto Lb3
            java.lang.Object r6 = defpackage.gt0.H0(r1)
            java.io.File r6 = (java.io.File) r6
            return r6
        Lb3:
            int r7 = r1.size()
            if (r7 > r3) goto Lba
            goto L76
        Lba:
            ia r6 = new ia
            ha r7 = defpackage.ha.AmbiguousDriver
            r6.<init>(r7)
            throw r6
        Lc2:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r0.iterator()
        Lcb:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L109
            java.lang.Object r0 = r7.next()
            r1 = r0
            java.io.File r1 = (java.io.File) r1
            java.lang.String r2 = r1.getName()
            r2.getClass()
            java.lang.String r4 = "libvulkan"
            boolean r2 = defpackage.xs6.g0(r2, r4, r3)
            if (r2 != 0) goto L105
            java.lang.String r2 = r1.getName()
            r2.getClass()
            java.lang.String r4 = "vulkan."
            boolean r2 = defpackage.xs6.g0(r2, r4, r3)
            if (r2 == 0) goto Lcb
            java.lang.String r1 = r1.getName()
            r1.getClass()
            java.lang.String r2 = ".so"
            boolean r1 = defpackage.xs6.Y(r1, r2, r3)
            if (r1 == 0) goto Lcb
        L105:
            r6.add(r0)
            goto Lcb
        L109:
            int r7 = r6.size()
            if (r7 == 0) goto L120
            if (r7 != r3) goto L118
            java.lang.Object r6 = defpackage.gt0.H0(r6)
            java.io.File r6 = (java.io.File) r6
            return r6
        L118:
            ia r6 = new ia
            ha r7 = defpackage.ha.AmbiguousDriver
            r6.<init>(r7)
            throw r6
        L120:
            ia r6 = new ia
            ha r7 = defpackage.ha.NoDriver
            r6.<init>(r7)
            throw r6
    }

    public static void j(java.io.InputStream r6, java.io.File r7) {
            java.io.File r7 = r7.getCanonicalFile()
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream
            boolean r1 = r6 instanceof java.io.BufferedInputStream
            if (r1 == 0) goto Ld
            java.io.BufferedInputStream r6 = (java.io.BufferedInputStream) r6
            goto L15
        Ld:
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            r2 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r6, r2)
            r6 = r1
        L15:
            r0.<init>(r6)
        L18:
            java.util.zip.ZipEntry r6 = r0.getNextEntry()     // Catch: java.lang.Throwable -> L5c
            if (r6 != 0) goto L22
            r0.close()
            return
        L22:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = r6.getName()     // Catch: java.lang.Throwable -> L5c
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L5c
            java.io.File r1 = r1.getCanonicalFile()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = r1.getPath()     // Catch: java.lang.Throwable -> L5c
            r2.getClass()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r3 = r7.getPath()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = java.io.File.separator     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r5.<init>()     // Catch: java.lang.Throwable -> L5c
            r5.append(r3)     // Catch: java.lang.Throwable -> L5c
            r5.append(r4)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L5c
            r4 = 0
            boolean r2 = defpackage.xs6.g0(r2, r3, r4)     // Catch: java.lang.Throwable -> L5c
            if (r2 == 0) goto L7d
            boolean r6 = r6.isDirectory()     // Catch: java.lang.Throwable -> L5c
            if (r6 == 0) goto L5e
            r1.mkdirs()     // Catch: java.lang.Throwable -> L5c
            goto L72
        L5c:
            r6 = move-exception
            goto L85
        L5e:
            java.io.File r6 = r1.getParentFile()     // Catch: java.lang.Throwable -> L5c
            if (r6 == 0) goto L67
            r6.mkdirs()     // Catch: java.lang.Throwable -> L5c
        L67:
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5c
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L5c
            defpackage.f04.w(r0, r6)     // Catch: java.lang.Throwable -> L76
            r6.close()     // Catch: java.lang.Throwable -> L5c
        L72:
            r0.closeEntry()     // Catch: java.lang.Throwable -> L5c
            goto L18
        L76:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L78
        L78:
            r1 = move-exception
            defpackage.ge7.t(r6, r7)     // Catch: java.lang.Throwable -> L5c
            throw r1     // Catch: java.lang.Throwable -> L5c
        L7d:
            ia r6 = new ia     // Catch: java.lang.Throwable -> L5c
            ha r7 = defpackage.ha.InvalidZip     // Catch: java.lang.Throwable -> L5c
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L5c
            throw r6     // Catch: java.lang.Throwable -> L5c
        L85:
            throw r6     // Catch: java.lang.Throwable -> L86
        L86:
            r7 = move-exception
            defpackage.ge7.t(r0, r6)
            throw r7
    }

    public void A(java.lang.String r4, android.hardware.camera2.CameraDevice.StateCallback r5) {
            r3 = this;
            java.lang.Object r0 = r3.L
            t57 r0 = (defpackage.t57) r0
            java.lang.Object r3 = r3.B
            n55 r3 = (defpackage.n55) r3
            java.lang.Object r3 = r3.get()
            android.hardware.camera2.CameraManager r3 = (android.hardware.camera2.CameraManager) r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = defpackage.xf0.b(r4)
            r1.append(r2)
            java.lang.String r2 = "#openCamera"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.os.Trace.beginSection(r1)     // Catch: java.lang.Throwable -> L49
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L49
            r2 = 28
            if (r1 < r2) goto L3e
            r3.getClass()     // Catch: java.lang.Throwable -> L49
            ex6 r0 = r0.j     // Catch: java.lang.Throwable -> L49
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L49
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0     // Catch: java.lang.Throwable -> L49
            r0.getClass()     // Catch: java.lang.Throwable -> L49
            defpackage.j2.n(r3, r4, r0, r5)     // Catch: java.lang.Throwable -> L49
            goto L45
        L3e:
            android.os.Handler r0 = r0.a()     // Catch: java.lang.Throwable -> L49
            r3.openCamera(r4, r5, r0)     // Catch: java.lang.Throwable -> L49
        L45:
            android.os.Trace.endSection()
            return
        L49:
            r3 = move-exception
            android.os.Trace.endSection()
            throw r3
    }

    public void D(java.lang.String r6) {
            r5 = this;
            r6.getClass()
            java.lang.Object r5 = r5.L
            kd6 r5 = (defpackage.kd6) r5
            ng6 r5 = (defpackage.ng6) r5
            java.util.List r0 = r5.n()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            r3 = r1
            zq7 r3 = (defpackage.zq7) r3
            java.lang.String r3 = r3.a
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L11
            goto L29
        L28:
            r1 = r2
        L29:
            zq7 r1 = (defpackage.zq7) r1
            if (r1 == 0) goto L3f
            java.lang.String r0 = r1.c
            if (r0 == 0) goto L3f
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            java.io.File r0 = r1.getParentFile()
            if (r0 == 0) goto L3f
            defpackage.jc2.x0(r0)
        L3f:
            android.content.SharedPreferences r0 = r5.b
            java.util.List r5 = r5.n()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L4e:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L67
            java.lang.Object r3 = r5.next()
            r4 = r3
            zq7 r4 = (defpackage.zq7) r4
            java.lang.String r4 = r4.a
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L4e
            r1.add(r3)
            goto L4e
        L67:
            android.content.SharedPreferences$Editor r5 = r0.edit()
            java.lang.String r3 = "video_vulkan_custom_drivers"
            java.lang.String r1 = defpackage.ng6.K(r1)
            r5.putString(r3, r1)
            java.lang.String r1 = "video_vulkan_custom_driver_dir"
            r5.remove(r1)
            java.lang.String r1 = "video_vulkan_custom_driver_name"
            r5.remove(r1)
            java.lang.String r1 = "video_vulkan_custom_driver_display_name"
            r5.remove(r1)
            java.lang.String r1 = "video_vulkan_selected_driver_id"
            java.lang.String r0 = r0.getString(r1, r2)
            boolean r6 = defpackage.nb3.k(r0, r6)
            if (r6 == 0) goto La2
            r5.remove(r1)
            java.lang.String r6 = "SYSTEM"
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r0)
            r6.getClass()
            java.lang.String r0 = "video_vulkan_driver_mode"
            r5.putString(r0, r6)
        La2:
            r5.commit()
            return
    }

    public void F(boolean r5) {
            r4 = this;
            java.lang.Object r4 = r4.L
            d51 r4 = (defpackage.d51) r4
            java.lang.Object r4 = r4.B
            yc1 r4 = (defpackage.yc1) r4
            java.lang.Object r4 = r4.B
            nt1 r4 = (defpackage.nt1) r4
            boolean r0 = r4.L
            if (r0 == r5) goto L52
            mt1 r0 = r4.B
            if (r0 == 0) goto L41
            ws1 r0 = defpackage.ws1.a()
            mt1 r1 = r4.B
            r0.getClass()
            java.lang.String r2 = "initCallback cannot be null"
            defpackage.np2.x(r1, r2)
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = r0.a
            java.util.concurrent.locks.Lock r3 = r2.writeLock()
            r3.lock()
            zu r0 = r0.b     // Catch: java.lang.Throwable -> L38
            r0.remove(r1)     // Catch: java.lang.Throwable -> L38
            java.util.concurrent.locks.Lock r0 = r2.writeLock()
            r0.unlock()
            goto L41
        L38:
            r4 = move-exception
            java.util.concurrent.locks.Lock r5 = r2.writeLock()
            r5.unlock()
            throw r4
        L41:
            r4.L = r5
            if (r5 == 0) goto L52
            android.widget.EditText r4 = r4.A
            ws1 r5 = defpackage.ws1.a()
            int r5 = r5.c()
            defpackage.nt1.a(r4, r5)
        L52:
            return
    }

    public void G(int r3, int r4, int r5, int r6) {
            r2 = this;
            java.lang.Object r2 = r2.L
            androidx.cardview.widget.CardView r2 = (androidx.cardview.widget.CardView) r2
            android.graphics.Rect r0 = r2.R
            r0.set(r3, r4, r5, r6)
            android.graphics.Rect r0 = r2.L
            int r1 = r0.left
            int r3 = r3 + r1
            int r1 = r0.top
            int r4 = r4 + r1
            int r1 = r0.right
            int r5 = r5 + r1
            int r0 = r0.bottom
            int r6 = r6 + r0
            androidx.cardview.widget.CardView.a(r2, r3, r4, r5, r6)
            return
    }

    public android.graphics.drawable.Drawable H(android.graphics.drawable.Drawable r8, boolean r9) {
            r7 = this;
            boolean r0 = r8 instanceof android.graphics.drawable.LayerDrawable
            r1 = 1
            if (r0 == 0) goto L81
            android.graphics.drawable.LayerDrawable r8 = (android.graphics.drawable.LayerDrawable) r8
            int r9 = r8.getNumberOfLayers()
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r9]
            r2 = 0
            r3 = r2
        Lf:
            if (r3 >= r9) goto L30
            int r4 = r8.getId(r3)
            android.graphics.drawable.Drawable r5 = r8.getDrawable(r3)
            r6 = 16908301(0x102000d, float:2.3877265E-38)
            if (r4 == r6) goto L26
            r6 = 16908303(0x102000f, float:2.387727E-38)
            if (r4 != r6) goto L24
            goto L26
        L24:
            r4 = r2
            goto L27
        L26:
            r4 = r1
        L27:
            android.graphics.drawable.Drawable r4 = r7.H(r5, r4)
            r0[r3] = r4
            int r3 = r3 + 1
            goto Lf
        L30:
            android.graphics.drawable.LayerDrawable r7 = new android.graphics.drawable.LayerDrawable
            r7.<init>(r0)
        L35:
            if (r2 >= r9) goto L80
            int r0 = r8.getId(r2)
            r7.setId(r2, r0)
            int r0 = r8.getLayerGravity(r2)
            r7.setLayerGravity(r2, r0)
            int r0 = r8.getLayerWidth(r2)
            r7.setLayerWidth(r2, r0)
            int r0 = r8.getLayerHeight(r2)
            r7.setLayerHeight(r2, r0)
            int r0 = r8.getLayerInsetLeft(r2)
            r7.setLayerInsetLeft(r2, r0)
            int r0 = r8.getLayerInsetRight(r2)
            r7.setLayerInsetRight(r2, r0)
            int r0 = r8.getLayerInsetTop(r2)
            r7.setLayerInsetTop(r2, r0)
            int r0 = r8.getLayerInsetBottom(r2)
            r7.setLayerInsetBottom(r2, r0)
            int r0 = r8.getLayerInsetStart(r2)
            r7.setLayerInsetStart(r2, r0)
            int r0 = r8.getLayerInsetEnd(r2)
            r7.setLayerInsetEnd(r2, r0)
            int r2 = r2 + 1
            goto L35
        L80:
            return r7
        L81:
            boolean r0 = r8 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto Lce
            android.graphics.drawable.BitmapDrawable r8 = (android.graphics.drawable.BitmapDrawable) r8
            android.graphics.Bitmap r0 = r8.getBitmap()
            java.lang.Object r2 = r7.L
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 != 0) goto L93
            r7.L = r0
        L93:
            android.graphics.drawable.ShapeDrawable r7 = new android.graphics.drawable.ShapeDrawable
            r2 = 8
            float[] r2 = new float[r2]
            r2 = {x00d0: FILL_ARRAY_DATA  , data: [1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584} // fill-array
            android.graphics.drawable.shapes.RoundRectShape r3 = new android.graphics.drawable.shapes.RoundRectShape
            r4 = 0
            r3.<init>(r2, r4, r4)
            r7.<init>(r3)
            android.graphics.BitmapShader r2 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r3 = android.graphics.Shader.TileMode.REPEAT
            android.graphics.Shader$TileMode r4 = android.graphics.Shader.TileMode.CLAMP
            r2.<init>(r0, r3, r4)
            android.graphics.Paint r0 = r7.getPaint()
            r0.setShader(r2)
            android.graphics.Paint r0 = r7.getPaint()
            android.graphics.Paint r8 = r8.getPaint()
            android.graphics.ColorFilter r8 = r8.getColorFilter()
            r0.setColorFilter(r8)
            if (r9 == 0) goto Lcd
            android.graphics.drawable.ClipDrawable r8 = new android.graphics.drawable.ClipDrawable
            r9 = 3
            r8.<init>(r7, r9, r1)
            return r8
        Lcd:
            return r7
        Lce:
            return r8
    }

    public void I() {
            r2 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r2.B     // Catch: java.lang.Throwable -> L1c
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0     // Catch: java.lang.Throwable -> L1c
            r0.decrementAndGet()     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r0 = r2.B     // Catch: java.lang.Throwable -> L1c
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0     // Catch: java.lang.Throwable -> L1c
            int r0 = r0.get()     // Catch: java.lang.Throwable -> L1c
            if (r0 < 0) goto L14
            monitor-exit(r2)
            return
        L14:
            java.lang.String r0 = "Unbalanced call to unblock() detected."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1c
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1c
            throw r1     // Catch: java.lang.Throwable -> L1c
        L1c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // defpackage.oy7
    public float a() {
            r9 = this;
            int r0 = r9.A
            switch(r0) {
                case 5: goto L62;
                default: goto L5;
            }
        L5:
            java.lang.Object r9 = r9.B
            sg0 r9 = (defpackage.sg0) r9
            lg0 r9 = r9.b
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM
            r0.getClass()
            r1 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
            qc0 r9 = (defpackage.qc0) r9
            r9.getClass()
            java.lang.Object r9 = r9.c(r0)
            if (r9 != 0) goto L22
            goto L23
        L22:
            r2 = r9
        L23:
            java.lang.Float r2 = (java.lang.Float) r2
            float r9 = r2.floatValue()
            float r0 = java.lang.Math.abs(r9)
            double r3 = (double) r0
            float r9 = java.lang.Math.abs(r9)
            float r9 = java.lang.Math.ulp(r9)
            double r5 = (double) r9
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r5 = r5 * r7
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 >= 0) goto L5d
            boolean r9 = defpackage.kj2.L()
            if (r9 == 0) goto L61
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid max zoom ratio of "
            r9.<init>(r0)
            r9.append(r2)
            java.lang.String r0 = " detected, defaulting to 1.0f"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "CXCP"
            android.util.Log.w(r0, r9)
            goto L61
        L5d:
            float r1 = r2.floatValue()
        L61:
            return r1
        L62:
            java.lang.Object r9 = r9.L
            android.util.Range r9 = (android.util.Range) r9
            java.lang.Comparable r9 = r9.getUpper()
            r9.getClass()
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            return r9
    }

    @Override // defpackage.go1
    public java.lang.Object b(defpackage.xa4 r4, defpackage.eo2 r5, defpackage.hw6 r6) {
            r3 = this;
            java.lang.Object r0 = r3.L
            dd r0 = (defpackage.dd) r0
            c12 r1 = new c12
            r2 = 0
            r1.<init>(r3, r5, r2)
            java.lang.Object r3 = r0.a(r4, r1, r6)
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            if (r3 != r4) goto L13
            return r3
        L13:
            jg7 r3 = defpackage.jg7.a
            return r3
    }

    @Override // defpackage.oy7
    public float c() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 5: goto L8;
                default: goto L5;
            }
        L5:
            r1 = 1065353216(0x3f800000, float:1.0)
            return r1
        L8:
            java.lang.Object r1 = r1.L
            android.util.Range r1 = (android.util.Range) r1
            java.lang.Comparable r1 = r1.getLower()
            r1.getClass()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            return r1
    }

    @Override // defpackage.oy7
    public defpackage.jg1 d(defpackage.li7 r3) {
            r2 = this;
            int r2 = r2.A
            r3.getClass()
            switch(r2) {
                case 5: goto L15;
                default: goto L8;
            }
        L8:
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION
            java.util.List r2 = defpackage.hf.b0(r2)
            ki7 r0 = defpackage.ki7.DEFAULT
            jg1 r2 = r3.f(r2, r0)
            return r2
        L15:
            android.hardware.camera2.CaptureRequest$Key r2 = defpackage.m2.i()
            r2.getClass()
            android.hardware.camera2.CaptureRequest$Key[] r2 = new android.hardware.camera2.CaptureRequest.Key[]{r2}
            java.util.ArrayList r2 = defpackage.hf.d0(r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L34
            android.hardware.camera2.CaptureRequest$Key r0 = defpackage.gi.g()
            r0.getClass()
            r2.add(r0)
        L34:
            ki7 r0 = defpackage.ki7.DEFAULT
            jg1 r2 = r3.f(r2, r0)
            return r2
    }

    @Override // defpackage.oy7
    public defpackage.jg1 e(defpackage.li7 r9) {
            r8 = this;
            int r0 = r8.A
            r1 = 1065353216(0x3f800000, float:1.0)
            r9.getClass()
            switch(r0) {
                case 5: goto L65;
                default: goto La;
            }
        La:
            java.lang.Object r8 = r8.L
            android.graphics.Rect r8 = (android.graphics.Rect) r8
            float r0 = java.lang.Math.abs(r1)
            double r2 = (double) r0
            float r0 = java.lang.Math.abs(r1)
            float r0 = java.lang.Math.ulp(r0)
            double r4 = (double) r0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = r4 * r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L30
            boolean r0 = defpackage.kj2.L()
            if (r0 == 0) goto L30
            java.lang.String r0 = "ZoomCompat: Invalid zoom ratio of 0.0f passed in, defaulting to 1.0f"
            java.lang.String r2 = "CXCP"
            android.util.Log.w(r2, r0)
        L30:
            int r0 = r8.width()
            float r0 = (float) r0
            float r0 = r0 / r1
            int r2 = r8.height()
            float r2 = (float) r2
            float r2 = r2 / r1
            int r1 = r8.width()
            float r1 = (float) r1
            float r1 = r1 - r0
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r3
            int r8 = r8.height()
            float r8 = (float) r8
            float r8 = r8 - r2
            float r8 = r8 / r3
            android.graphics.Rect r3 = new android.graphics.Rect
            int r4 = (int) r1
            int r5 = (int) r8
            float r1 = r1 + r0
            int r0 = (int) r1
            float r8 = r8 + r2
            int r8 = (int) r8
            r3.<init>(r4, r5, r0, r8)
            android.hardware.camera2.CaptureRequest$Key r8 = android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION
            java.util.Map r8 = java.util.Collections.singletonMap(r8, r3)
            r8.getClass()
            jg1 r8 = defpackage.li7.b(r9, r8)
            return r8
        L65:
            float r0 = r8.c()
            float r2 = r8.a()
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 > 0) goto Lc8
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Lc8
            android.hardware.camera2.CaptureRequest$Key r0 = defpackage.m2.i()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            vr4 r2 = new vr4
            r2.<init>(r0, r1)
            vr4[] r0 = new defpackage.vr4[]{r2}
            java.util.LinkedHashMap r0 = defpackage.c14.n0(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r1 < r2) goto Lc3
            kg0 r3 = defpackage.lg0.g
            java.lang.Object r8 = r8.B
            sg0 r8 = (defpackage.sg0) r8
            lg0 r8 = r8.b
            r3.getClass()
            r8.getClass()
            if (r1 < r2) goto Lc3
            android.hardware.camera2.CameraCharacteristics$Key r1 = defpackage.gi.f()
            r1.getClass()
            qc0 r8 = (defpackage.qc0) r8
            java.lang.Object r8 = r8.c(r1)
            int[] r8 = (int[]) r8
            if (r8 == 0) goto Lc3
            r1 = 1
            boolean r8 = defpackage.fv.m0(r8, r1)
            if (r8 != r1) goto Lc3
            android.hardware.camera2.CaptureRequest$Key r8 = defpackage.gi.g()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r8, r1)
        Lc3:
            jg1 r8 = defpackage.li7.b(r9, r0)
            goto Lce
        Lc8:
            java.lang.String r8 = "Failed requirement."
            defpackage.i.h(r8)
            r8 = 0
        Lce:
            return r8
    }

    @Override // defpackage.f36
    public defpackage.e36 f(java.lang.String r8) {
            r7 = this;
            r8.getClass()
            java.lang.Object r0 = r7.L
            ai1 r0 = (defpackage.ai1) r0
            java.lang.String r1 = ":memory:"
            boolean r2 = r8.equals(r1)
            if (r2 != 0) goto L20
            java.lang.Object r2 = r0.d
            bc1 r2 = (defpackage.bc1) r2
            android.content.Context r2 = r2.a
            java.io.File r8 = r2.getDatabasePath(r8)
            java.lang.String r8 = r8.getAbsolutePath()
            r8.getClass()
        L20:
            a72 r2 = new a72
            boolean r3 = r0.b
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L34
            boolean r3 = r0.c
            if (r3 != 0) goto L34
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L34
            r1 = r4
            goto L35
        L34:
            r1 = r5
        L35:
            r2.<init>(r8, r1)
            java.util.concurrent.locks.ReentrantLock r1 = r2.a
            r1.lock()
            yc1 r2 = r2.b
            if (r2 == 0) goto L49
            r2.G()     // Catch: java.lang.Throwable -> L45
            goto L49
        L45:
            r7 = move-exception
            r4 = r5
            goto Lba
        L49:
            r3 = 0
            boolean r6 = r0.c     // Catch: java.lang.Throwable -> La4
            if (r6 != 0) goto L9c
            java.lang.Object r7 = r7.B     // Catch: java.lang.Throwable -> La4
            f36 r7 = (defpackage.f36) r7     // Catch: java.lang.Throwable -> La4
            e36 r7 = r7.f(r8)     // Catch: java.lang.Throwable -> La4
            boolean r6 = r0.b     // Catch: java.lang.Throwable -> La4
            if (r6 != 0) goto L66
            r0.c = r4     // Catch: java.lang.Throwable -> L62
            defpackage.ai1.a(r0, r7)     // Catch: java.lang.Throwable -> L62
            r0.c = r5     // Catch: java.lang.Throwable -> La4
            goto L85
        L62:
            r7 = move-exception
            r0.c = r5     // Catch: java.lang.Throwable -> La4
            throw r7     // Catch: java.lang.Throwable -> La4
        L66:
            defpackage.ai1.f(r7)     // Catch: java.lang.Throwable -> La4
            java.lang.Object r5 = r0.d     // Catch: java.lang.Throwable -> La4
            bc1 r5 = (defpackage.bc1) r5     // Catch: java.lang.Throwable -> La4
            l16 r5 = r5.g     // Catch: java.lang.Throwable -> La4
            l16 r6 = defpackage.l16.WRITE_AHEAD_LOGGING     // Catch: java.lang.Throwable -> La4
            if (r5 != r6) goto L79
            java.lang.String r5 = "PRAGMA synchronous = NORMAL"
            defpackage.ii2.s(r7, r5)     // Catch: java.lang.Throwable -> La4
            goto L7e
        L79:
            java.lang.String r5 = "PRAGMA synchronous = FULL"
            defpackage.ii2.s(r7, r5)     // Catch: java.lang.Throwable -> La4
        L7e:
            java.lang.Object r0 = r0.e     // Catch: java.lang.Throwable -> La4
            ts1 r0 = (defpackage.ts1) r0     // Catch: java.lang.Throwable -> La4
            r0.s(r7)     // Catch: java.lang.Throwable -> La4
        L85:
            if (r2 == 0) goto L98
            java.lang.Object r0 = r2.B     // Catch: java.lang.Throwable -> Lb9
            java.nio.channels.FileChannel r0 = (java.nio.channels.FileChannel) r0     // Catch: java.lang.Throwable -> Lb9
            if (r0 != 0) goto L8e
            goto L98
        L8e:
            r0.close()     // Catch: java.lang.Throwable -> L94
            r2.B = r3     // Catch: java.lang.Throwable -> Lb9
            goto L98
        L94:
            r7 = move-exception
            r2.B = r3     // Catch: java.lang.Throwable -> Lb9
            throw r7     // Catch: java.lang.Throwable -> Lb9
        L98:
            r1.unlock()
            return r7
        L9c:
            java.lang.String r7 = "Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La4
            r0.<init>(r7)     // Catch: java.lang.Throwable -> La4
            throw r0     // Catch: java.lang.Throwable -> La4
        La4:
            r7 = move-exception
            if (r2 == 0) goto Lb8
            java.lang.Object r0 = r2.B     // Catch: java.lang.Throwable -> Lb9
            java.nio.channels.FileChannel r0 = (java.nio.channels.FileChannel) r0     // Catch: java.lang.Throwable -> Lb9
            if (r0 != 0) goto Lae
            goto Lb8
        Lae:
            r0.close()     // Catch: java.lang.Throwable -> Lb4
            r2.B = r3     // Catch: java.lang.Throwable -> Lb9
            goto Lb8
        Lb4:
            r7 = move-exception
            r2.B = r3     // Catch: java.lang.Throwable -> Lb9
            throw r7     // Catch: java.lang.Throwable -> Lb9
        Lb8:
            throw r7     // Catch: java.lang.Throwable -> Lb9
        Lb9:
            r7 = move-exception
        Lba:
            if (r4 == 0) goto Lbf
            throw r7     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            r7 = move-exception
            goto Ld8
        Lbf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lbd
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r3 = "Unable to open database '"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lbd
            r2.append(r8)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r8 = "'. Was a proper path / name used in Room's database builder?"
            r2.append(r8)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> Lbd
            r0.<init>(r8, r7)     // Catch: java.lang.Throwable -> Lbd
            throw r0     // Catch: java.lang.Throwable -> Lbd
        Ld8:
            r1.unlock()
            throw r7
    }

    public boolean g() {
            r1 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r1.L     // Catch: java.lang.Throwable -> L18
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0     // Catch: java.lang.Throwable -> L18
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto Le
            monitor-exit(r1)
            r1 = 0
            return r1
        Le:
            java.lang.Object r0 = r1.B     // Catch: java.lang.Throwable -> L18
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0     // Catch: java.lang.Throwable -> L18
            r0.incrementAndGet()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r1)
            r1 = 1
            return r1
        L18:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public java.lang.Object h(defpackage.hm4 r11, defpackage.ja7 r12, defpackage.s41 r13) {
            r10 = this;
            boolean r0 = r13 instanceof defpackage.ka
            if (r0 == 0) goto L13
            r0 = r13
            ka r0 = (defpackage.ka) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ka r0 = new ka
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.oi2.Y(r13)
            goto L48
        L27:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r10)
            r10 = 0
            return r10
        L2e:
            defpackage.oi2.Y(r13)
            xe1 r13 = defpackage.xk1.a
            de1 r13 = defpackage.de1.L
            la r4 = new la
            r9 = 0
            r8 = 0
            r5 = r10
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.Y = r3
            java.lang.Object r13 = defpackage.hv.d0(r13, r4, r0)
            if (r13 != r1) goto L48
            return r1
        L48:
            hm5 r13 = (defpackage.hm5) r13
            java.lang.Object r10 = r13.A
            return r10
    }

    public void i(android.net.Uri r1, java.io.File r2) {
            r0 = this;
            java.lang.Object r0 = r0.B
            android.content.Context r0 = (android.content.Context) r0
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.io.InputStream r0 = r0.openInputStream(r1)
            if (r0 == 0) goto L1c
            j(r0, r2)     // Catch: java.lang.Throwable -> L15
            r0.close()
            return
        L15:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L17
        L17:
            r2 = move-exception
            defpackage.ge7.t(r0, r1)
            throw r2
        L1c:
            ia r0 = new ia
            ha r1 = defpackage.ha.InvalidZip
            r0.<init>(r1)
            throw r0
    }

    public defpackage.gg3 k(defpackage.ar0 r4) {
            r3 = this;
            int r0 = r3.A
            switch(r0) {
                case 21: goto L30;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.L
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Class r1 = r4.a
            r1.getClass()
            java.lang.Object r2 = r0.get(r1)
            if (r2 != 0) goto L2b
            pa0 r2 = new pa0
            java.lang.Object r3 = r3.B
            qn2 r3 = (defpackage.qn2) r3
            java.lang.Object r3 = r3.g(r4)
            gg3 r3 = (defpackage.gg3) r3
            r2.<init>(r3)
            java.lang.Object r3 = r0.putIfAbsent(r1, r2)
            if (r3 != 0) goto L2a
            goto L2b
        L2a:
            r2 = r3
        L2b:
            pa0 r2 = (defpackage.pa0) r2
            gg3 r3 = r2.a
            return r3
        L30:
            java.lang.Object r0 = r3.L
            cr0 r0 = (defpackage.cr0) r0
            java.lang.Class r1 = r4.a
            r1.getClass()
            java.lang.Object r0 = defpackage.gi.k(r0, r1)
            r0.getClass()
            pa4 r0 = (defpackage.pa4) r0
            java.lang.ref.SoftReference r1 = r0.a
            java.lang.Object r1 = r1.get()
            if (r1 == 0) goto L4b
            goto L6d
        L4b:
            monitor-enter(r0)
            java.lang.ref.SoftReference r1 = r0.a     // Catch: java.lang.Throwable -> L72
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L72
            if (r1 == 0) goto L56
            monitor-exit(r0)
            goto L6d
        L56:
            pa0 r1 = new pa0     // Catch: java.lang.Throwable -> L72
            java.lang.Object r3 = r3.B     // Catch: java.lang.Throwable -> L72
            qn2 r3 = (defpackage.qn2) r3     // Catch: java.lang.Throwable -> L72
            java.lang.Object r3 = r3.g(r4)     // Catch: java.lang.Throwable -> L72
            gg3 r3 = (defpackage.gg3) r3     // Catch: java.lang.Throwable -> L72
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L72
            java.lang.ref.SoftReference r3 = new java.lang.ref.SoftReference     // Catch: java.lang.Throwable -> L72
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L72
            r0.a = r3     // Catch: java.lang.Throwable -> L72
            monitor-exit(r0)
        L6d:
            pa0 r1 = (defpackage.pa0) r1
            gg3 r3 = r1.a
            return r3
        L72:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L72
            throw r3
    }

    public java.lang.Object l(defpackage.ar0 r7, java.util.ArrayList r8) {
            r6 = this;
            int r0 = r6.A
            r1 = 0
            r2 = 10
            switch(r0) {
                case 22: goto L73;
                default: goto L8;
            }
        L8:
            java.lang.Object r0 = r6.L
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Class r3 = r7.a
            r3.getClass()
            java.lang.Object r4 = r0.get(r3)
            if (r4 != 0) goto L24
            qs4 r4 = new qs4
            r4.<init>()
            java.lang.Object r0 = r0.putIfAbsent(r3, r4)
            if (r0 != 0) goto L23
            goto L24
        L23:
            r4 = r0
        L24:
            qs4 r4 = (defpackage.qs4) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = defpackage.ht0.v0(r8, r2)
            r0.<init>(r2)
            int r2 = r8.size()
        L33:
            if (r1 >= r2) goto L46
            java.lang.Object r3 = r8.get(r1)
            int r1 = r1 + 1
            hg3 r3 = (defpackage.hg3) r3
            ig3 r5 = new ig3
            r5.<init>(r3)
            r0.add(r5)
            goto L33
        L46:
            java.util.concurrent.ConcurrentHashMap r1 = r4.a
            java.lang.Object r2 = r1.get(r0)
            if (r2 != 0) goto L6e
            java.lang.Object r6 = r6.B     // Catch: java.lang.Throwable -> L59
            eo2 r6 = (defpackage.eo2) r6     // Catch: java.lang.Throwable -> L59
            java.lang.Object r6 = r6.o(r7, r8)     // Catch: java.lang.Throwable -> L59
            gg3 r6 = (defpackage.gg3) r6     // Catch: java.lang.Throwable -> L59
            goto L60
        L59:
            r6 = move-exception
            em5 r7 = new em5
            r7.<init>(r6)
            r6 = r7
        L60:
            hm5 r7 = new hm5
            r7.<init>(r6)
            java.lang.Object r6 = r1.putIfAbsent(r0, r7)
            if (r6 != 0) goto L6d
            r2 = r7
            goto L6e
        L6d:
            r2 = r6
        L6e:
            hm5 r2 = (defpackage.hm5) r2
            java.lang.Object r6 = r2.A
            return r6
        L73:
            java.lang.Object r0 = r6.L
            cr0 r0 = (defpackage.cr0) r0
            java.lang.Class r3 = r7.a
            r3.getClass()
            java.lang.Object r0 = defpackage.gi.k(r0, r3)
            r0.getClass()
            pa4 r0 = (defpackage.pa4) r0
            java.lang.ref.SoftReference r3 = r0.a
            java.lang.Object r3 = r3.get()
            if (r3 == 0) goto L8e
            goto La6
        L8e:
            monitor-enter(r0)
            java.lang.ref.SoftReference r3 = r0.a     // Catch: java.lang.Throwable -> Lf5
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> Lf5
            if (r3 == 0) goto L99
            monitor-exit(r0)
            goto La6
        L99:
            qs4 r3 = new qs4     // Catch: java.lang.Throwable -> Lf5
            r3.<init>()     // Catch: java.lang.Throwable -> Lf5
            java.lang.ref.SoftReference r4 = new java.lang.ref.SoftReference     // Catch: java.lang.Throwable -> Lf5
            r4.<init>(r3)     // Catch: java.lang.Throwable -> Lf5
            r0.a = r4     // Catch: java.lang.Throwable -> Lf5
            monitor-exit(r0)
        La6:
            qs4 r3 = (defpackage.qs4) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = defpackage.ht0.v0(r8, r2)
            r0.<init>(r2)
            int r2 = r8.size()
        Lb5:
            if (r1 >= r2) goto Lc8
            java.lang.Object r4 = r8.get(r1)
            int r1 = r1 + 1
            hg3 r4 = (defpackage.hg3) r4
            ig3 r5 = new ig3
            r5.<init>(r4)
            r0.add(r5)
            goto Lb5
        Lc8:
            java.util.concurrent.ConcurrentHashMap r1 = r3.a
            java.lang.Object r2 = r1.get(r0)
            if (r2 != 0) goto Lf0
            java.lang.Object r6 = r6.B     // Catch: java.lang.Throwable -> Ldb
            eo2 r6 = (defpackage.eo2) r6     // Catch: java.lang.Throwable -> Ldb
            java.lang.Object r6 = r6.o(r7, r8)     // Catch: java.lang.Throwable -> Ldb
            gg3 r6 = (defpackage.gg3) r6     // Catch: java.lang.Throwable -> Ldb
            goto Le2
        Ldb:
            r6 = move-exception
            em5 r7 = new em5
            r7.<init>(r6)
            r6 = r7
        Le2:
            hm5 r7 = new hm5
            r7.<init>(r6)
            java.lang.Object r6 = r1.putIfAbsent(r0, r7)
            if (r6 != 0) goto Lef
            r2 = r7
            goto Lf0
        Lef:
            r2 = r6
        Lf0:
            hm5 r2 = (defpackage.hm5) r2
            java.lang.Object r6 = r2.A
            return r6
        Lf5:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf5
            throw r6
    }

    @Override // defpackage.f36
    public boolean m() {
            r0 = this;
            java.lang.Object r0 = r0.B
            f36 r0 = (defpackage.f36) r0
            boolean r0 = r0.m()
            return r0
    }

    public android.view.inputmethod.InputMethodManager n() {
            r0 = this;
            java.lang.Object r0 = r0.L
            go3 r0 = (defpackage.go3) r0
            java.lang.Object r0 = r0.getValue()
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            return r0
    }

    public android.text.method.KeyListener o(android.text.method.KeyListener r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.text.method.NumberKeyListener
            if (r0 != 0) goto L23
            java.lang.Object r1 = r1.L
            d51 r1 = (defpackage.d51) r1
            java.lang.Object r1 = r1.B
            yc1 r1 = (defpackage.yc1) r1
            r1.getClass()
            boolean r1 = r2 instanceof defpackage.ft1
            if (r1 == 0) goto L14
            return r2
        L14:
            if (r2 != 0) goto L18
            r1 = 0
            return r1
        L18:
            boolean r1 = r2 instanceof android.text.method.NumberKeyListener
            if (r1 == 0) goto L1d
            return r2
        L1d:
            ft1 r1 = new ft1
            r1.<init>(r2)
            return r1
        L23:
            return r2
    }

    public defpackage.ja p(android.net.Uri r11) {
            r10 = this;
            java.lang.Object r0 = r10.L
            r1 = r0
            kd6 r1 = (defpackage.kd6) r1
            java.lang.Object r0 = r10.B
            r2 = r0
            android.content.Context r2 = (android.content.Context) r2
            r11.getClass()
            boolean r0 = defpackage.q60.N(r2)
            if (r0 == 0) goto L127
            r3 = 0
            android.content.ContentResolver r4 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = "_display_name"
            java.lang.String[] r6 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L47
            r8 = 0
            r9 = 0
            r7 = 0
            r5 = r11
            android.database.Cursor r11 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L3c
            if (r11 == 0) goto L45
            boolean r0 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L37
            r0 = 0
            java.lang.String r0 = r11.getString(r0)     // Catch: java.lang.Throwable -> L34
            goto L38
        L34:
            r0 = move-exception
            r4 = r0
            goto L3f
        L37:
            r0 = r3
        L38:
            r11.close()     // Catch: java.lang.Throwable -> L3c
            goto L4f
        L3c:
            r0 = move-exception
        L3d:
            r11 = r0
            goto L4a
        L3f:
            throw r4     // Catch: java.lang.Throwable -> L40
        L40:
            r0 = move-exception
            defpackage.ge7.t(r11, r4)     // Catch: java.lang.Throwable -> L3c
            throw r0     // Catch: java.lang.Throwable -> L3c
        L45:
            r0 = r3
            goto L4f
        L47:
            r0 = move-exception
            r5 = r11
            goto L3d
        L4a:
            em5 r0 = new em5
            r0.<init>(r11)
        L4f:
            boolean r11 = r0 instanceof defpackage.em5
            if (r11 == 0) goto L54
            r0 = r3
        L54:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L63
            boolean r11 = defpackage.qs6.v0(r0)
            if (r11 != 0) goto L5f
            goto L60
        L5f:
            r0 = r3
        L60:
            if (r0 == 0) goto L63
            goto L65
        L63:
            java.lang.String r0 = "Custom Vulkan driver"
        L65:
            r11 = 1
            java.lang.String r4 = ".zip"
            boolean r11 = defpackage.xs6.Y(r0, r4, r11)
            if (r11 == 0) goto L11f
            java.util.UUID r11 = java.util.UUID.randomUUID()
            java.lang.String r11 = r11.toString()
            r11.getClass()
            java.io.File r6 = new java.io.File
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r7 = "adreno-drivers"
            r6.<init>(r2, r7)
            java.io.File r2 = new java.io.File
            java.lang.String r7 = "pending-"
            java.lang.String r7 = r7.concat(r11)
            r2.<init>(r6, r7)
            java.io.File r7 = new java.io.File
            java.lang.String r8 = "driver-"
            java.lang.String r8 = r8.concat(r11)
            r7.<init>(r6, r8)
            r2.mkdirs()     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
            r10.i(r5, r2)     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
            ga r10 = C(r2)     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
            java.io.File r5 = E(r2, r10)     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
            java.io.File r6 = r5.getParentFile()     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
            if (r6 == 0) goto L108
            java.lang.String r10 = r10.a     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
            if (r10 == 0) goto Lbf
            boolean r8 = defpackage.qs6.v0(r10)     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
            if (r8 != 0) goto Lb9
            r3 = r10
        Lb9:
            if (r3 == 0) goto Lbf
            goto Lc3
        Lbc:
            r0 = move-exception
            r10 = r0
            goto L11b
        Lbf:
            java.lang.String r3 = defpackage.qs6.E0(r0, r4)     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
        Lc3:
            defpackage.jc2.x0(r7)     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
            boolean r10 = r2.renameTo(r7)     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
            if (r10 == 0) goto L100
            java.lang.String r10 = defpackage.jc2.D0(r6, r2)     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
            java.lang.String r0 = "."
            boolean r0 = r10.equals(r0)     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
            if (r0 == 0) goto Ld9
            goto Ldf
        Ld9:
            java.io.File r0 = new java.io.File     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
            r0.<init>(r7, r10)     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
            r7 = r0
        Ldf:
            java.lang.String r10 = r7.getAbsolutePath()     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
            r10.getClass()     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
            java.lang.String r0 = r5.getName()     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
            r0.getClass()     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
            r4 = r1
            ng6 r4 = (defpackage.ng6) r4     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
            r4.L(r11, r10, r0, r3)     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
            sr7 r10 = defpackage.sr7.CUSTOM     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
            ng6 r1 = (defpackage.ng6) r1     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
            r1.P(r10)     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
            ja r10 = new ja     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
            r10.<init>(r11, r3)     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
            return r10
        L100:
            ia r10 = new ia     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
            ha r11 = defpackage.ha.InvalidZip     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
            r10.<init>(r11)     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
            throw r10     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
        L108:
            ia r10 = new ia     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
            ha r11 = defpackage.ha.NoDriver     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
            r10.<init>(r11)     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
            throw r10     // Catch: defpackage.ia -> Lbc java.lang.Exception -> L110
        L110:
            defpackage.jc2.x0(r2)
            ia r10 = new ia
            ha r11 = defpackage.ha.InvalidZip
            r10.<init>(r11)
            throw r10
        L11b:
            defpackage.jc2.x0(r2)
            throw r10
        L11f:
            ia r10 = new ia
            ha r11 = defpackage.ha.NotZip
            r10.<init>(r11)
            throw r10
        L127:
            ia r10 = new ia
            ha r11 = defpackage.ha.UnsupportedBuild
            r10.<init>(r11)
            throw r10
    }

    public defpackage.ja q(java.io.File r7, java.lang.String r8) {
            r6 = this;
            java.lang.Object r0 = r6.L
            kd6 r0 = (defpackage.kd6) r0
            java.lang.Object r6 = r6.B
            android.content.Context r6 = (android.content.Context) r6
            boolean r1 = defpackage.q60.N(r6)
            if (r1 == 0) goto Ldb
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            r1.getClass()
            java.io.File r2 = new java.io.File
            java.io.File r6 = r6.getFilesDir()
            java.lang.String r3 = "adreno-drivers"
            r2.<init>(r6, r3)
            java.io.File r6 = new java.io.File
            java.lang.String r3 = "pending-"
            java.lang.String r3 = r3.concat(r1)
            r6.<init>(r2, r3)
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "driver-"
            java.lang.String r4 = r4.concat(r1)
            r3.<init>(r2, r4)
            r6.mkdirs()     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            r2.<init>(r7)     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            j(r2, r6)     // Catch: java.lang.Throwable -> Lc5
            r2.close()     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            ga r7 = C(r6)     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            java.io.File r2 = E(r6, r7)     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            java.io.File r4 = r2.getParentFile()     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            if (r4 == 0) goto Lbd
            boolean r5 = defpackage.qs6.v0(r8)     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            if (r5 != 0) goto L5d
            goto L72
        L5d:
            java.lang.String r7 = r7.a     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            if (r7 == 0) goto L70
            boolean r8 = defpackage.qs6.v0(r7)     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            if (r8 != 0) goto L69
        L67:
            r8 = r7
            goto L6b
        L69:
            r7 = 0
            goto L67
        L6b:
            if (r8 != 0) goto L72
            goto L70
        L6e:
            r7 = move-exception
            goto Ld7
        L70:
            java.lang.String r8 = "Custom Vulkan driver"
        L72:
            defpackage.jc2.x0(r3)     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            boolean r7 = r6.renameTo(r3)     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            if (r7 == 0) goto Lb5
            java.lang.String r7 = defpackage.jc2.D0(r4, r6)     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            java.lang.String r4 = "."
            boolean r4 = r7.equals(r4)     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            if (r4 == 0) goto L88
            goto L8e
        L88:
            java.io.File r4 = new java.io.File     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            r4.<init>(r3, r7)     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            r3 = r4
        L8e:
            java.lang.String r7 = r3.getAbsolutePath()     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            r7.getClass()     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            java.lang.String r2 = r2.getName()     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            r2.getClass()     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            r3 = r0
            ng6 r3 = (defpackage.ng6) r3     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            r3.L(r1, r7, r2, r8)     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            r7 = r0
            ng6 r7 = (defpackage.ng6) r7     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            r7.O(r1)     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            sr7 r7 = defpackage.sr7.CUSTOM     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            ng6 r0 = (defpackage.ng6) r0     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            r0.P(r7)     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            ja r7 = new ja     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            r7.<init>(r1, r8)     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            return r7
        Lb5:
            ia r7 = new ia     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            ha r8 = defpackage.ha.InvalidZip     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            r7.<init>(r8)     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            throw r7     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
        Lbd:
            ia r7 = new ia     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            ha r8 = defpackage.ha.NoDriver     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            r7.<init>(r8)     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            throw r7     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
        Lc5:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> Lc7
        Lc7:
            r8 = move-exception
            defpackage.ge7.t(r2, r7)     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
            throw r8     // Catch: defpackage.ia -> L6e java.lang.Exception -> Lcc
        Lcc:
            defpackage.jc2.x0(r6)
            ia r6 = new ia
            ha r7 = defpackage.ha.InvalidZip
            r6.<init>(r7)
            throw r6
        Ld7:
            defpackage.jc2.x0(r6)
            throw r7
        Ldb:
            ia r6 = new ia
            ha r7 = defpackage.ha.UnsupportedBuild
            r6.<init>(r7)
            throw r6
    }

    public void r(android.util.AttributeSet r9, int r10) {
            r8 = this;
            int r0 = r8.A
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L2f;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r8.B
            android.widget.EditText r0 = (android.widget.EditText) r0
            android.content.Context r0 = r0.getContext()
            int[] r3 = defpackage.m75.i
            android.content.res.TypedArray r9 = r0.obtainStyledAttributes(r9, r3, r10, r2)
            r10 = 14
            boolean r0 = r9.hasValue(r10)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L24
            boolean r1 = r9.getBoolean(r10, r1)     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r8 = move-exception
            goto L2b
        L24:
            r9.recycle()
            r8.F(r1)
            return
        L2b:
            r9.recycle()
            throw r8
        L2f:
            java.lang.Object r0 = r8.B
            android.widget.AbsSeekBar r0 = (android.widget.AbsSeekBar) r0
            android.content.Context r3 = r0.getContext()
            int[] r4 = defpackage.u63.R
            m44 r9 = defpackage.m44.A(r3, r9, r4, r10)
            android.graphics.drawable.Drawable r10 = r9.l(r2)
            if (r10 == 0) goto L7a
            boolean r3 = r10 instanceof android.graphics.drawable.AnimationDrawable
            if (r3 == 0) goto L77
            android.graphics.drawable.AnimationDrawable r10 = (android.graphics.drawable.AnimationDrawable) r10
            int r3 = r10.getNumberOfFrames()
            android.graphics.drawable.AnimationDrawable r4 = new android.graphics.drawable.AnimationDrawable
            r4.<init>()
            boolean r5 = r10.isOneShot()
            r4.setOneShot(r5)
            r5 = r2
        L5a:
            r6 = 10000(0x2710, float:1.4013E-41)
            if (r5 >= r3) goto L73
            android.graphics.drawable.Drawable r7 = r10.getFrame(r5)
            android.graphics.drawable.Drawable r7 = r8.H(r7, r1)
            r7.setLevel(r6)
            int r6 = r10.getDuration(r5)
            r4.addFrame(r7, r6)
            int r5 = r5 + 1
            goto L5a
        L73:
            r4.setLevel(r6)
            r10 = r4
        L77:
            r0.setIndeterminateDrawable(r10)
        L7a:
            android.graphics.drawable.Drawable r10 = r9.l(r1)
            if (r10 == 0) goto L87
            android.graphics.drawable.Drawable r8 = r8.H(r10, r2)
            r0.setProgressDrawable(r8)
        L87:
            r9.D()
            return
    }

    public android.view.autofill.AutofillId s(long r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L22
            java.lang.Object r0 = r2.L
            android.view.contentcapture.ContentCaptureSession r0 = defpackage.yz0.g(r0)
            java.lang.Object r2 = r2.B
            android.view.View r2 = (android.view.View) r2
            u2 r2 = defpackage.hi2.z(r2)
            java.util.Objects.requireNonNull(r2)
            java.lang.Object r2 = r2.b
            android.view.autofill.AutofillId r2 = defpackage.au.b(r2)
            android.view.autofill.AutofillId r2 = defpackage.rp.h(r0, r2, r3)
            return r2
        L22:
            r2 = 0
            return r2
    }

    public void t(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            java.lang.Object r3 = r2.L
            xw r3 = (defpackage.xw) r3
            java.lang.Object r3 = r3.a
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r3.next()
            android.hardware.camera2.CameraCaptureSession$StateCallback r0 = (android.hardware.camera2.CameraCaptureSession.StateCallback) r0
            java.lang.Object r1 = r2.B
            di5 r1 = (defpackage.di5) r1
            r0.onClosed(r1)
            goto Lf
        L23:
            return
    }

    public void u(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            java.lang.Object r3 = r2.L
            xw r3 = (defpackage.xw) r3
            java.lang.Object r3 = r3.a
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r3.next()
            android.hardware.camera2.CameraCaptureSession$StateCallback r0 = (android.hardware.camera2.CameraCaptureSession.StateCallback) r0
            java.lang.Object r1 = r2.B
            di5 r1 = (defpackage.di5) r1
            r0.onConfigureFailed(r1)
            goto Lf
        L23:
            return
    }

    public void v(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            java.lang.Object r3 = r2.L
            xw r3 = (defpackage.xw) r3
            java.lang.Object r3 = r3.a
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r3.next()
            android.hardware.camera2.CameraCaptureSession$StateCallback r0 = (android.hardware.camera2.CameraCaptureSession.StateCallback) r0
            java.lang.Object r1 = r2.B
            di5 r1 = (defpackage.di5) r1
            r0.onConfigured(r1)
            goto Lf
        L23:
            return
    }

    public defpackage.ct1 w(android.view.inputmethod.InputConnection r2, android.view.inputmethod.EditorInfo r3) {
            r1 = this;
            java.lang.Object r1 = r1.L
            d51 r1 = (defpackage.d51) r1
            if (r2 != 0) goto Lb
            r1.getClass()
            r1 = 0
            goto L22
        Lb:
            java.lang.Object r1 = r1.B
            yc1 r1 = (defpackage.yc1) r1
            r1.getClass()
            boolean r0 = r2 instanceof defpackage.ct1
            if (r0 == 0) goto L17
            goto L21
        L17:
            ct1 r0 = new ct1
            java.lang.Object r1 = r1.A
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0.<init>(r3, r2, r1)
            r2 = r0
        L21:
            r1 = r2
        L22:
            ct1 r1 = (defpackage.ct1) r1
            return r1
    }

    public void x(defpackage.k8 r4) {
            r3 = this;
            java.lang.Object r0 = r3.B
            eb r0 = (defpackage.eb) r0
            java.lang.Object r1 = r0.B
            android.view.ActionMode$Callback r1 = (android.view.ActionMode.Callback) r1
            hu6 r4 = r0.C(r4)
            r1.onDestroyActionMode(r4)
            java.lang.Object r4 = r3.L
            fr r4 = (defpackage.fr) r4
            android.widget.PopupWindow r0 = r4.r0
            if (r0 == 0) goto L22
            android.view.Window r0 = r4.h0
            android.view.View r0 = r0.getDecorView()
            uq r1 = r4.s0
            r0.removeCallbacks(r1)
        L22:
            androidx.appcompat.widget.ActionBarContextView r0 = r4.q0
            if (r0 == 0) goto L42
            ip7 r0 = r4.t0
            if (r0 == 0) goto L2d
            r0.b()
        L2d:
            androidx.appcompat.widget.ActionBarContextView r0 = r4.q0
            ip7 r0 = defpackage.ao7.b(r0)
            r1 = 0
            r0.a(r1)
            r4.t0 = r0
            wq r1 = new wq
            r2 = 2
            r1.<init>(r3, r2)
            r0.d(r1)
        L42:
            r3 = 0
            r4.p0 = r3
            android.view.ViewGroup r3 = r4.v0
            java.util.WeakHashMap r0 = defpackage.ao7.a
            r3.requestApplyInsets()
            r4.M()
            return
    }

    public boolean y(defpackage.k8 r5, android.view.Menu r6) {
            r4 = this;
            java.lang.Object r0 = r4.L
            fr r0 = (defpackage.fr) r0
            android.view.ViewGroup r0 = r0.v0
            java.util.WeakHashMap r1 = defpackage.ao7.a
            r0.requestApplyInsets()
            java.lang.Object r4 = r4.B
            eb r4 = (defpackage.eb) r4
            java.lang.Object r0 = r4.B
            android.view.ActionMode$Callback r0 = (android.view.ActionMode.Callback) r0
            hu6 r5 = r4.C(r5)
            java.lang.Object r1 = r4.X
            ci6 r1 = (defpackage.ci6) r1
            java.lang.Object r2 = r1.get(r6)
            android.view.Menu r2 = (android.view.Menu) r2
            if (r2 != 0) goto L32
            e54 r2 = new e54
            java.lang.Object r4 = r4.L
            android.content.Context r4 = (android.content.Context) r4
            r3 = r6
            i44 r3 = (defpackage.i44) r3
            r2.<init>(r4, r3)
            r1.put(r6, r2)
        L32:
            boolean r4 = r0.onPrepareActionMode(r5, r2)
            return r4
    }

    public void z(defpackage.yi2 r4) {
            r3 = this;
            java.lang.Object r0 = r3.L
            d72 r0 = (defpackage.d72) r0
            java.lang.Object r3 = r3.B
            j97 r3 = (defpackage.j97) r3
            int r1 = r4.b
            if (r1 != 0) goto L18
            android.graphics.Typeface r4 = r4.a
            uo2 r1 = new uo2
            r2 = 5
            r1.<init>(r2, r3, r4)
            r0.execute(r1)
            return
        L18:
            ub0 r4 = new ub0
            r2 = 0
            r4.<init>(r3, r1, r2)
            r0.execute(r4)
            return
    }
}
