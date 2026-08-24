package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p87  reason: default package */
/* loaded from: classes.dex */
public final class p87 {
    public java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;
    public java.lang.Object e;
    public java.lang.Object f;
    public java.lang.Object g;

    public static defpackage.ul1 b(defpackage.zl1 r7) {
            ul1 r0 = new ul1
            boolean r1 = r7.k()
            if (r1 == 0) goto Lb
            rl1 r1 = defpackage.rl1.DIRECTORY
            goto Ld
        Lb:
            rl1 r1 = defpackage.rl1.FILE
        Ld:
            long r2 = r7.m()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L18
            r2 = r4
        L18:
            boolean r4 = r7.l()
            if (r4 == 0) goto L23
            long r4 = r7.n()
            goto L25
        L23:
            r4 = -1
        L25:
            r0.<init>(r1, r2, r4)
            return r0
    }

    public static defpackage.ul1 c(java.io.File r7) {
            ul1 r0 = new ul1
            boolean r1 = r7.isDirectory()
            if (r1 == 0) goto Lb
            rl1 r1 = defpackage.rl1.DIRECTORY
            goto Ld
        Lb:
            rl1 r1 = defpackage.rl1.FILE
        Ld:
            long r2 = r7.lastModified()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L18
            r2 = r4
        L18:
            boolean r4 = r7.isFile()
            if (r4 == 0) goto L23
            long r4 = r7.length()
            goto L25
        L23:
            r4 = -1
        L25:
            r0.<init>(r1, r2, r4)
            return r0
    }

    public static java.util.LinkedHashMap d(defpackage.qi6 r19, java.io.File r20) {
            java.util.Map r0 = h(r20)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.lang.String r2 = ""
            r3 = r19
            g(r3, r2, r1)
            java.util.Set r2 = r0.keySet()
            java.util.Set r3 = r1.keySet()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.LinkedHashSet r2 = defpackage.ii2.K(r2, r3)
            java.util.List r2 = defpackage.gt0.c1(r2)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r4 = 10
            int r4 = defpackage.ht0.v0(r2, r4)
            int r4 = defpackage.c14.k0(r4)
            r5 = 16
            if (r4 >= r5) goto L33
            r4 = r5
        L33:
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L3a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L7a
            java.lang.Object r4 = r2.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.get(r5)
            ul1 r6 = (defpackage.ul1) r6
            r7 = 0
            if (r6 == 0) goto L74
            java.lang.Object r8 = r1.get(r5)
            ul1 r8 = (defpackage.ul1) r8
            if (r8 == 0) goto L6e
            sl1 r9 = new sl1
            rl1 r10 = r6.a
            long r11 = r6.b
            long r13 = r6.c
            long r5 = r8.b
            long r7 = r8.c
            r15 = r5
            r17 = r7
            r9.<init>(r10, r11, r13, r15, r17)
            r3.put(r4, r9)
            goto L3a
        L6e:
            java.lang.String r0 = "Missing document snapshot state for "
            defpackage.e41.h(r5, r0)
            return r7
        L74:
            java.lang.String r0 = "Missing local snapshot state for "
            defpackage.e41.h(r5, r0)
            return r7
        L7a:
            return r3
    }

    public static java.lang.String e(java.lang.String r1, java.lang.String r2) {
            int r0 = r1.length()
            if (r0 != 0) goto L7
            return r2
        L7:
            java.lang.String r0 = "/"
            java.lang.String r1 = defpackage.lb1.m(r1, r0, r2)
            return r1
    }

    public static defpackage.vl1 f(boolean r3, boolean r4, defpackage.ul1 r5, defpackage.ul1 r6, defpackage.vl1 r7) {
            if (r3 == 0) goto L7
            if (r4 != 0) goto L7
            vl1 r3 = defpackage.vl1.LOCAL
            return r3
        L7:
            if (r4 == 0) goto Le
            if (r3 != 0) goto Le
            vl1 r3 = defpackage.vl1.DOCUMENT
            return r3
        Le:
            long r3 = r5.b
            r0 = 0
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 >= 0) goto L17
            r3 = r0
        L17:
            long r5 = r6.b
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto L1e
            goto L1f
        L1e:
            r0 = r5
        L1f:
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 == 0) goto L2b
            if (r3 <= 0) goto L28
            vl1 r3 = defpackage.vl1.LOCAL
            return r3
        L28:
            vl1 r3 = defpackage.vl1.DOCUMENT
            return r3
        L2b:
            return r7
    }

    public static void g(defpackage.zl1 r5, java.lang.String r6, java.util.LinkedHashMap r7) {
            zl1[] r5 = r5.o()
            r5.getClass()
            int r0 = r5.length
            r1 = 0
        L9:
            if (r1 >= r0) goto L2b
            r2 = r5[r1]
            java.lang.String r3 = r2.i()
            if (r3 != 0) goto L14
            goto L28
        L14:
            java.lang.String r3 = e(r6, r3)
            ul1 r4 = b(r2)
            r7.put(r3, r4)
            boolean r4 = r2.k()
            if (r4 == 0) goto L28
            g(r2, r3, r7)
        L28:
            int r1 = r1 + 1
            goto L9
        L2b:
            return
    }

    public static java.util.Map h(java.io.File r2) {
            boolean r0 = r2.exists()
            if (r0 != 0) goto L9
            zt1 r2 = defpackage.zt1.A
            return r2
        L9:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.String r1 = ""
            i(r2, r1, r0)
            return r0
    }

    public static void i(java.io.File r5, java.lang.String r6, java.util.LinkedHashMap r7) {
            java.io.File[] r5 = r5.listFiles()
            if (r5 == 0) goto L2a
            int r0 = r5.length
            r1 = 0
        L8:
            if (r1 >= r0) goto L2a
            r2 = r5[r1]
            java.lang.String r3 = r2.getName()
            r3.getClass()
            java.lang.String r3 = e(r6, r3)
            ul1 r4 = c(r2)
            r7.put(r3, r4)
            boolean r4 = r2.isDirectory()
            if (r4 == 0) goto L27
            i(r2, r3, r7)
        L27:
            int r1 = r1 + 1
            goto L8
        L2a:
            return
    }

    public static boolean l(defpackage.zl1 r5) {
            boolean r0 = r5.k()
            if (r0 == 0) goto L21
            zl1[] r0 = r5.o()
            r0.getClass()
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L10:
            if (r3 >= r1) goto L21
            r4 = r0[r3]
            r4.getClass()
            boolean r4 = l(r4)
            if (r4 != 0) goto L1e
            return r2
        L1e:
            int r3 = r3 + 1
            goto L10
        L21:
            boolean r5 = r5.d()
            return r5
    }

    public static void m(java.io.File r1) {
            boolean r0 = r1.exists()
            if (r0 == 0) goto L1d
            boolean r0 = r1.isDirectory()
            if (r0 != 0) goto L33
            boolean r0 = defpackage.jc2.x0(r1)
            if (r0 == 0) goto L13
            goto L1d
        L13:
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.String r0 = "Could not replace local DLDI file "
            defpackage.u34.B(r1, r0)
            return
        L1d:
            boolean r0 = r1.mkdirs()
            if (r0 != 0) goto L33
            boolean r0 = r1.isDirectory()
            if (r0 == 0) goto L2a
            goto L33
        L2a:
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.String r0 = "Could not create "
            defpackage.u34.B(r1, r0)
        L33:
            return
    }

    public static boolean n(java.lang.String r9, defpackage.vl1 r10, defpackage.ul1 r11, java.util.Map r12) {
            java.lang.Object r9 = r12.get(r9)
            sl1 r9 = (defpackage.sl1) r9
            r12 = 0
            r0 = 1
            if (r9 != 0) goto Le
            if (r11 == 0) goto Ld
            return r0
        Ld:
            return r12
        Le:
            if (r11 != 0) goto L11
            return r0
        L11:
            int[] r1 = defpackage.wl1.a
            int r10 = r10.ordinal()
            r10 = r1[r10]
            if (r10 == r0) goto L2e
            r1 = 2
            if (r10 != r1) goto L2a
            ul1 r2 = new ul1
            rl1 r3 = r9.a
            long r4 = r9.d
            long r6 = r9.e
            r2.<init>(r3, r4, r6)
            goto L3a
        L2a:
            defpackage.i.d()
            return r12
        L2e:
            ul1 r3 = new ul1
            rl1 r4 = r9.a
            long r5 = r9.b
            long r7 = r9.c
            r3.<init>(r4, r5, r7)
            r2 = r3
        L3a:
            boolean r9 = r11.equals(r2)
            r9 = r9 ^ r0
            return r9
    }

    public static boolean o(java.lang.String r6, defpackage.vl1 r7, java.util.Map r8, java.util.Map r9) {
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L8
            goto L9a
        L8:
            int r0 = r6.length()
            if (r0 != 0) goto L11
            java.lang.String r0 = ""
            goto L17
        L11:
            java.lang.String r0 = "/"
            java.lang.String r0 = r6.concat(r0)
        L17:
            ad6 r1 = new ad6
            r1.<init>()
            java.util.Set r2 = r9.keySet()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L26:
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 == 0) goto L43
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r5 = defpackage.nb3.k(r3, r6)
            if (r5 != 0) goto L3f
            boolean r4 = defpackage.xs6.g0(r3, r0, r4)
            if (r4 == 0) goto L26
        L3f:
            r1.add(r3)
            goto L26
        L43:
            java.util.Set r2 = r8.keySet()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L4d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L69
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r5 = defpackage.nb3.k(r3, r6)
            if (r5 != 0) goto L65
            boolean r5 = defpackage.xs6.g0(r3, r0, r4)
            if (r5 == 0) goto L4d
        L65:
            r1.add(r3)
            goto L4d
        L69:
            ad6 r6 = defpackage.ii2.p(r1)
            if (r6 == 0) goto L78
            p04 r0 = r6.A
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L78
            goto L9c
        L78:
            java.util.Iterator r6 = r6.iterator()
        L7c:
            r0 = r6
            o04 r0 = (defpackage.o04) r0
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L9c
            r0 = r6
            m04 r0 = (defpackage.m04) r0
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r9.get(r0)
            ul1 r1 = (defpackage.ul1) r1
            boolean r0 = n(r0, r7, r1, r8)
            if (r0 == 0) goto L7c
        L9a:
            r6 = 1
            return r6
        L9c:
            return r4
    }

    public defpackage.yy a() {
            r10 = this;
            java.lang.Object r0 = r10.a
            android.util.Size r0 = (android.util.Size) r0
            if (r0 != 0) goto L9
            java.lang.String r0 = " resolution"
            goto Lb
        L9:
            java.lang.String r0 = ""
        Lb:
            java.lang.Object r1 = r10.b
            android.util.Size r1 = (android.util.Size) r1
            if (r1 != 0) goto L17
            java.lang.String r1 = " originalConfiguredResolution"
            java.lang.String r0 = r0.concat(r1)
        L17:
            java.lang.Object r1 = r10.c
            yq1 r1 = (defpackage.yq1) r1
            if (r1 != 0) goto L23
            java.lang.String r1 = " dynamicRange"
            java.lang.String r0 = r0.concat(r1)
        L23:
            java.lang.Object r1 = r10.d
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L2f
            java.lang.String r1 = " sessionType"
            java.lang.String r0 = r0.concat(r1)
        L2f:
            java.lang.Object r1 = r10.e
            android.util.Range r1 = (android.util.Range) r1
            if (r1 != 0) goto L3b
            java.lang.String r1 = " expectedFrameRateRange"
            java.lang.String r0 = r0.concat(r1)
        L3b:
            java.lang.Object r1 = r10.g
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 != 0) goto L47
            java.lang.String r1 = " zslDisabled"
            java.lang.String r0 = r0.concat(r1)
        L47:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L7c
            yy r2 = new yy
            java.lang.Object r0 = r10.a
            r3 = r0
            android.util.Size r3 = (android.util.Size) r3
            java.lang.Object r0 = r10.b
            r4 = r0
            android.util.Size r4 = (android.util.Size) r4
            java.lang.Object r0 = r10.c
            r5 = r0
            yq1 r5 = (defpackage.yq1) r5
            java.lang.Object r0 = r10.d
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r6 = r0.intValue()
            java.lang.Object r0 = r10.e
            r7 = r0
            android.util.Range r7 = (android.util.Range) r7
            java.lang.Object r0 = r10.f
            r8 = r0
            yy0 r8 = (defpackage.yy0) r8
            java.lang.Object r10 = r10.g
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        L7c:
            java.lang.String r10 = "Missing required properties:"
            java.lang.String r10 = r10.concat(r0)
            defpackage.i.m(r10)
            r10 = 0
            return r10
    }

    public void j(defpackage.zl1 r3, java.io.File r4) {
            r2 = this;
            java.io.File r0 = r4.getParentFile()
            if (r0 == 0) goto L9
            m(r0)
        L9:
            boolean r0 = r4.exists()
            if (r0 == 0) goto L26
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L26
            boolean r0 = defpackage.jc2.x0(r4)
            if (r0 == 0) goto L1c
            goto L26
        L1c:
            java.lang.String r2 = r4.getAbsolutePath()
            java.lang.String r3 = "Could not replace local DLDI directory "
            defpackage.u34.B(r2, r3)
            return
        L26:
            java.lang.Object r2 = r2.a
            android.content.Context r2 = (android.content.Context) r2
            android.content.ContentResolver r2 = r2.getContentResolver()
            android.net.Uri r0 = r3.j()
            java.io.InputStream r2 = r2.openInputStream(r0)
            if (r2 == 0) goto L63
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L54
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L54
            defpackage.f04.w(r2, r0)     // Catch: java.lang.Throwable -> L56
            r0.close()     // Catch: java.lang.Throwable -> L54
            r2.close()
            long r2 = r3.m()
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L53
            r4.setLastModified(r2)
        L53:
            return
        L54:
            r3 = move-exception
            goto L5d
        L56:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L58
        L58:
            r4 = move-exception
            defpackage.ge7.t(r0, r3)     // Catch: java.lang.Throwable -> L54
            throw r4     // Catch: java.lang.Throwable -> L54
        L5d:
            throw r3     // Catch: java.lang.Throwable -> L5e
        L5e:
            r4 = move-exception
            defpackage.ge7.t(r2, r3)
            throw r4
        L63:
            android.net.Uri r2 = r3.j()
            java.lang.String r3 = "Could not open "
            defpackage.u34.B(r2, r3)
            return
    }

    public void k(defpackage.zl1 r3, java.io.File r4) {
            r2 = this;
            java.lang.Object r2 = r2.a
            android.content.Context r2 = (android.content.Context) r2
            android.content.ContentResolver r2 = r2.getContentResolver()
            android.net.Uri r0 = r3.j()
            java.lang.String r1 = "wt"
            java.io.OutputStream r2 = r2.openOutputStream(r0, r1)
            if (r2 == 0) goto L32
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L23
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L23
            defpackage.f04.w(r3, r2)     // Catch: java.lang.Throwable -> L25
            r3.close()     // Catch: java.lang.Throwable -> L23
            r2.close()
            return
        L23:
            r3 = move-exception
            goto L2c
        L25:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L27
        L27:
            r0 = move-exception
            defpackage.ge7.t(r3, r4)     // Catch: java.lang.Throwable -> L23
            throw r0     // Catch: java.lang.Throwable -> L23
        L2c:
            throw r3     // Catch: java.lang.Throwable -> L2d
        L2d:
            r4 = move-exception
            defpackage.ge7.t(r2, r3)
            throw r4
        L32:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            android.net.Uri r3 = r3.j()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Could not open "
            r4.<init>(r0)
            r4.append(r3)
            java.lang.String r3 = " for write"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public void p(defpackage.fz r41, int r42) {
            r40 = this;
            r1 = r40
            r4 = r41
            java.lang.Object r0 = r1.b
            m54 r0 = (defpackage.m54) r0
            java.lang.String r2 = r4.a
            pb7 r0 = r0.a(r2)
            java.lang.Object r2 = r1.f
            r6 = r2
            i36 r6 = (defpackage.i36) r6
            rr6 r2 = new rr6
            r3 = 9
            r2.<init>(r3, r1, r4)
            java.lang.Object r2 = r6.n(r2)
            r3 = r2
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r2 = r3.iterator()
            boolean r2 = r2.hasNext()
            if (r2 != 0) goto L2c
            return
        L2c:
            r7 = -1
            if (r0 != 0) goto L43
            java.lang.String r0 = "Uploader"
            java.lang.String r2 = "Unknown backend for %s, deleting event batch for it..."
            defpackage.nj2.l(r0, r2, r4)
            qx r0 = new qx
            m00 r2 = defpackage.m00.FATAL_ERROR
            r0.<init>(r2, r7)
            r28 = r3
        L40:
            r2 = r0
            goto L334
        L43:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r5 = r3.iterator()
        L4c:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L5e
            java.lang.Object r9 = r5.next()
            ty r9 = (defpackage.ty) r9
            hy r9 = r9.c
            r2.add(r9)
            goto L4c
        L5e:
            byte[] r5 = r4.b
            hl0 r0 = (defpackage.hl0) r0
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            int r10 = r2.size()
            r11 = 0
            r12 = r11
        L6d:
            if (r12 >= r10) goto L95
            java.lang.Object r13 = r2.get(r12)
            int r12 = r12 + 1
            hy r13 = (defpackage.hy) r13
            java.lang.String r14 = r13.a
            boolean r15 = r9.containsKey(r14)
            if (r15 != 0) goto L8b
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r15.add(r13)
            r9.put(r14, r15)
            goto L6d
        L8b:
            java.lang.Object r14 = r9.get(r14)
            java.util.List r14 = (java.util.List) r14
            r14.add(r13)
            goto L6d
        L95:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        La2:
            boolean r10 = r9.hasNext()
            java.lang.String r12 = "TransportRuntime."
            java.lang.String r14 = "CctTransportBackend"
            if (r10 == 0) goto L290
            java.lang.Object r10 = r9.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r15 = r10.getValue()
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r15 = r15.get(r11)
            hy r15 = (defpackage.hy) r15
            q65 r25 = defpackage.q65.DEFAULT
            wr0 r11 = r0.f
            long r17 = r11.a()
            wr0 r11 = r0.e
            long r19 = r11.a()
            qr0 r11 = defpackage.qr0.ANDROID_FIREBASE
            java.lang.String r13 = "sdk-version"
            int r13 = r15.b(r13)
            java.lang.Integer r27 = java.lang.Integer.valueOf(r13)
            java.lang.String r13 = "model"
            java.lang.String r28 = r15.a(r13)
            java.lang.String r13 = "hardware"
            java.lang.String r29 = r15.a(r13)
            java.lang.String r13 = "device"
            java.lang.String r30 = r15.a(r13)
            java.lang.String r13 = "product"
            java.lang.String r31 = r15.a(r13)
            java.lang.String r13 = "os-uild"
            java.lang.String r32 = r15.a(r13)
            java.lang.String r13 = "manufacturer"
            java.lang.String r33 = r15.a(r13)
            java.lang.String r13 = "fingerprint"
            java.lang.String r34 = r15.a(r13)
            java.lang.String r13 = "country"
            java.lang.String r36 = r15.a(r13)
            java.lang.String r13 = "locale"
            java.lang.String r35 = r15.a(r13)
            java.lang.String r13 = "mcc_mnc"
            java.lang.String r37 = r15.a(r13)
            java.lang.String r13 = "application_build"
            java.lang.String r38 = r15.a(r13)
            ox r26 = new ox
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r13 = r26
            wx r15 = new wx
            r15.<init>(r11, r13)
            java.lang.Object r11 = r10.getKey()     // Catch: java.lang.NumberFormatException -> L139
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.NumberFormatException -> L139
            int r11 = java.lang.Integer.parseInt(r11)     // Catch: java.lang.NumberFormatException -> L139
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.NumberFormatException -> L139
            r22 = r11
            r23 = 0
            goto L143
        L139:
            java.lang.Object r11 = r10.getKey()
            java.lang.String r11 = (java.lang.String) r11
            r23 = r11
            r22 = 0
        L143:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.Object r10 = r10.getValue()
            java.util.List r10 = (java.util.List) r10
            java.util.Iterator r10 = r10.iterator()
        L152:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L279
            java.lang.Object r13 = r10.next()
            hy r13 = (defpackage.hy) r13
            w32 r7 = r13.c
            c42 r8 = r7.a
            byte[] r7 = r7.b
            c42 r1 = new c42
            r28 = r3
            java.lang.String r3 = "proto"
            r1.<init>(r3)
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L17b
            p87 r1 = new p87
            r1.<init>()
            r1.d = r7
            goto L19b
        L17b:
            c42 r1 = new c42
            java.lang.String r3 = "json"
            r1.<init>(r3)
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L25e
            java.lang.String r1 = new java.lang.String
            java.lang.String r3 = "UTF-8"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)
            r1.<init>(r7, r3)
            p87 r3 = new p87
            r3.<init>()
            r3.e = r1
            r1 = r3
        L19b:
            long r7 = r13.d
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            r1.a = r3
            long r7 = r13.e
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            r1.c = r3
            java.lang.String r3 = "tz-offset"
            java.util.Map r7 = r13.f
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L1ba
            r7 = 0
            goto L1c2
        L1ba:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            long r7 = r3.longValue()
        L1c2:
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            r1.f = r3
            java.lang.String r3 = "net-type"
            int r3 = r13.b(r3)
            se4 r3 = defpackage.se4.forNumber(r3)
            java.lang.String r7 = "mobile-subtype"
            int r7 = r13.b(r7)
            re4 r7 = defpackage.re4.forNumber(r7)
            qy r8 = new qy
            r8.<init>(r3, r7)
            r1.g = r8
            java.lang.Integer r3 = r13.b
            if (r3 == 0) goto L1e9
            r1.b = r3
        L1e9:
            java.lang.Object r3 = r1.a
            java.lang.Long r3 = (java.lang.Long) r3
            if (r3 != 0) goto L1f2
            java.lang.String r3 = " eventTimeMs"
            goto L1f4
        L1f2:
            java.lang.String r3 = ""
        L1f4:
            java.lang.Object r7 = r1.c
            java.lang.Long r7 = (java.lang.Long) r7
            if (r7 != 0) goto L200
            java.lang.String r7 = " eventUptimeMs"
            java.lang.String r3 = r3.concat(r7)
        L200:
            java.lang.Object r7 = r1.f
            java.lang.Long r7 = (java.lang.Long) r7
            if (r7 != 0) goto L20c
            java.lang.String r7 = " timezoneOffsetSeconds"
            java.lang.String r3 = r3.concat(r7)
        L20c:
            boolean r7 = r3.isEmpty()
            if (r7 == 0) goto L254
            ny r29 = new ny
            java.lang.Object r3 = r1.a
            java.lang.Long r3 = (java.lang.Long) r3
            long r30 = r3.longValue()
            java.lang.Object r3 = r1.b
            r32 = r3
            java.lang.Integer r32 = (java.lang.Integer) r32
            java.lang.Object r3 = r1.c
            java.lang.Long r3 = (java.lang.Long) r3
            long r33 = r3.longValue()
            java.lang.Object r3 = r1.d
            r35 = r3
            byte[] r35 = (byte[]) r35
            java.lang.Object r3 = r1.e
            r36 = r3
            java.lang.String r36 = (java.lang.String) r36
            java.lang.Object r3 = r1.f
            java.lang.Long r3 = (java.lang.Long) r3
            long r37 = r3.longValue()
            java.lang.Object r1 = r1.g
            r39 = r1
            qy r39 = (defpackage.qy) r39
            r29.<init>(r30, r32, r33, r35, r36, r37, r39)
            r1 = r29
            r11.add(r1)
        L24c:
            r7 = -1
            r1 = r40
            r3 = r28
            goto L152
        L254:
            java.lang.String r0 = "Missing required properties:"
            java.lang.String r0 = r0.concat(r3)
            defpackage.i.m(r0)
            return
        L25e:
            java.lang.String r1 = r12.concat(r14)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r7 = "Received event of unsupported encoding "
            r3.<init>(r7)
            r3.append(r8)
            java.lang.String r7 = ". Skipping..."
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r1, r3)
            goto L24c
        L279:
            r28 = r3
            oy r16 = new oy
            r24 = r11
            r21 = r15
            r16.<init>(r17, r19, r21, r22, r23, r24, r25)
            r1 = r16
            r2.add(r1)
            r7 = -1
            r11 = 0
            r1 = r40
            goto La2
        L290:
            r28 = r3
            rx r1 = new rx
            r1.<init>(r2)
            java.net.URL r2 = r0.d
            if (r5 == 0) goto L2b7
            fa0 r2 = defpackage.fa0.a(r5)     // Catch: java.lang.IllegalArgumentException -> L2ac
            java.lang.String r3 = r2.b     // Catch: java.lang.IllegalArgumentException -> L2ac
            if (r3 == 0) goto L2a4
            goto L2a5
        L2a4:
            r3 = 0
        L2a5:
            java.lang.String r2 = r2.a     // Catch: java.lang.IllegalArgumentException -> L2ac
            java.net.URL r2 = defpackage.hl0.b(r2)     // Catch: java.lang.IllegalArgumentException -> L2ac
            goto L2b8
        L2ac:
            qx r0 = new qx
            m00 r1 = defpackage.m00.FATAL_ERROR
            r2 = -1
            r0.<init>(r1, r2)
            goto L40
        L2b7:
            r3 = 0
        L2b8:
            bt r5 = new bt     // Catch: java.io.IOException -> L2ff
            r7 = 11
            r5.<init>(r2, r1, r3, r7)     // Catch: java.io.IOException -> L2ff
            os0 r1 = new os0     // Catch: java.io.IOException -> L2ff
            r2 = 22
            r1.<init>(r0, r2)     // Catch: java.io.IOException -> L2ff
            r0 = 5
        L2c7:
            ou r2 = r1.O(r5)     // Catch: java.io.IOException -> L2ff
            java.lang.Object r3 = r2.c     // Catch: java.io.IOException -> L2ff
            java.net.URL r3 = (java.net.URL) r3     // Catch: java.io.IOException -> L2ff
            if (r3 == 0) goto L2e5
            java.lang.String r8 = "Following redirect to: %s"
            defpackage.nj2.l(r14, r8, r3)     // Catch: java.io.IOException -> L2ff
            bt r8 = new bt     // Catch: java.io.IOException -> L2ff
            java.lang.Object r9 = r5.L     // Catch: java.io.IOException -> L2ff
            rx r9 = (defpackage.rx) r9     // Catch: java.io.IOException -> L2ff
            java.lang.Object r5 = r5.R     // Catch: java.io.IOException -> L2ff
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.io.IOException -> L2ff
            r8.<init>(r3, r9, r5, r7)     // Catch: java.io.IOException -> L2ff
            r5 = r8
            goto L2e6
        L2e5:
            r5 = 0
        L2e6:
            if (r5 == 0) goto L2ed
            int r0 = r0 + (-1)
            r3 = 1
            if (r0 >= r3) goto L2c7
        L2ed:
            int r0 = r2.a     // Catch: java.io.IOException -> L2ff
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L301
            long r0 = r2.b     // Catch: java.io.IOException -> L2ff
            qx r2 = new qx     // Catch: java.io.IOException -> L2ff
            m00 r3 = defpackage.m00.OK     // Catch: java.io.IOException -> L2ff
            r2.<init>(r3, r0)     // Catch: java.io.IOException -> L2ff
            r0 = r2
            goto L40
        L2ff:
            r0 = move-exception
            goto L320
        L301:
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r1) goto L315
            r1 = 404(0x194, float:5.66E-43)
            if (r0 != r1) goto L30a
            goto L315
        L30a:
            qx r0 = new qx     // Catch: java.io.IOException -> L2ff
            m00 r1 = defpackage.m00.FATAL_ERROR     // Catch: java.io.IOException -> L2ff
            r2 = -1
            r0.<init>(r1, r2)     // Catch: java.io.IOException -> L2ff
            goto L40
        L315:
            qx r0 = new qx     // Catch: java.io.IOException -> L2ff
            m00 r1 = defpackage.m00.TRANSIENT_ERROR     // Catch: java.io.IOException -> L2ff
            r2 = -1
            r0.<init>(r1, r2)     // Catch: java.io.IOException -> L2ff
            goto L40
        L320:
            java.lang.String r1 = "Could not make request to the backend"
            java.lang.String r2 = r12.concat(r14)
            android.util.Log.e(r2, r1, r0)
            qx r0 = new qx
            m00 r1 = defpackage.m00.TRANSIENT_ERROR
            r2 = -1
            r0.<init>(r1, r2)
            goto L40
        L334:
            dk0 r0 = new dk0
            r1 = r40
            r5 = r42
            r3 = r28
            r0.<init>(r1, r2, r3, r4, r5)
            r6.n(r0)
            return
    }

    public defpackage.tl1 q(android.net.Uri r23) {
            r22 = this;
            r0 = r22
            java.lang.Object r0 = r0.g
            java.io.File r0 = (java.io.File) r0
            boolean r1 = r0.isFile()
            zt1 r2 = defpackage.zt1.A
            if (r1 != 0) goto L1b
            tl1 r0 = new tl1
            java.lang.String r1 = r23.toString()
            r1.getClass()
            r0.<init>(r1, r2)
            return r0
        L1b:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L41
            java.lang.String r0 = defpackage.jc2.B0(r0)     // Catch: java.lang.Throwable -> L41
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L41
            java.lang.String r0 = "documentTreeUri"
            java.lang.String r0 = r1.optString(r0)     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = r23.toString()     // Catch: java.lang.Throwable -> L41
            boolean r3 = defpackage.nb3.k(r0, r3)     // Catch: java.lang.Throwable -> L41
            if (r3 != 0) goto L44
            tl1 r0 = new tl1     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = r23.toString()     // Catch: java.lang.Throwable -> L41
            r1.getClass()     // Catch: java.lang.Throwable -> L41
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L41
            return r0
        L41:
            r0 = move-exception
            goto Lbf
        L44:
            java.lang.String r3 = "entries"
            org.json.JSONObject r1 = r1.optJSONObject(r3)     // Catch: java.lang.Throwable -> L41
            if (r1 != 0) goto L59
            tl1 r0 = new tl1     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = r23.toString()     // Catch: java.lang.Throwable -> L41
            r1.getClass()     // Catch: java.lang.Throwable -> L41
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L41
            return r0
        L59:
            p04 r3 = new p04     // Catch: java.lang.Throwable -> L41
            r3.<init>()     // Catch: java.lang.Throwable -> L41
            java.util.Iterator r4 = r1.keys()     // Catch: java.lang.Throwable -> L41
            r4.getClass()     // Catch: java.lang.Throwable -> L41
        L65:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto Lb5
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L41
            org.json.JSONObject r6 = r1.optJSONObject(r5)     // Catch: java.lang.Throwable -> L41
            if (r6 != 0) goto L78
            goto L65
        L78:
            sl1 r7 = new sl1     // Catch: java.lang.Throwable -> L41
            java.lang.String r8 = "kind"
            java.lang.String r8 = r6.getString(r8)     // Catch: java.lang.Throwable -> L41
            r8.getClass()     // Catch: java.lang.Throwable -> L41
            rl1 r8 = defpackage.rl1.valueOf(r8)     // Catch: java.lang.Throwable -> L41
            java.lang.String r9 = "localLastModified"
            r10 = 0
            long r12 = r6.optLong(r9, r10)     // Catch: java.lang.Throwable -> L41
            java.lang.String r9 = "localLength"
            r14 = -1
            long r16 = r6.optLong(r9, r14)     // Catch: java.lang.Throwable -> L41
            java.lang.String r9 = "documentLastModified"
            long r9 = r6.optLong(r9, r10)     // Catch: java.lang.Throwable -> L41
            java.lang.String r11 = "documentLength"
            long r14 = r6.optLong(r11, r14)     // Catch: java.lang.Throwable -> L41
            r18 = r12
            r20 = r14
            r13 = r9
            r9 = r18
            r11 = r16
            r15 = r20
            r7.<init>(r8, r9, r11, r13, r15)     // Catch: java.lang.Throwable -> L41
            r3.put(r5, r7)     // Catch: java.lang.Throwable -> L41
            goto L65
        Lb5:
            p04 r1 = r3.b()     // Catch: java.lang.Throwable -> L41
            tl1 r3 = new tl1     // Catch: java.lang.Throwable -> L41
            r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> L41
            goto Lc4
        Lbf:
            em5 r3 = new em5
            r3.<init>(r0)
        Lc4:
            java.lang.Throwable r0 = defpackage.hm5.a(r3)
            if (r0 != 0) goto Lcb
            goto Lde
        Lcb:
            java.lang.String r1 = "DldiFolderSync"
            java.lang.String r3 = "Could not read DLDI snapshot state"
            android.util.Log.w(r1, r3, r0)
            tl1 r3 = new tl1
            java.lang.String r0 = r23.toString()
            r0.getClass()
            r3.<init>(r0, r2)
        Lde:
            tl1 r3 = (defpackage.tl1) r3
            return r3
    }

    public void r() {
            r13 = this;
            java.lang.Object r0 = r13.e
            r3 = r0
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r0 = r13.c
            android.net.Uri r0 = (android.net.Uri) r0
            if (r0 != 0) goto Lc
            return
        Lc:
            java.lang.Object r1 = r13.a
            android.content.Context r1 = (android.content.Context) r1
            qi6 r2 = defpackage.zl1.h(r1, r0)
            boolean r1 = r2.e()
            r9 = 0
            java.lang.String r10 = "DldiFolderSync"
            if (r1 == 0) goto La1
            boolean r1 = r2.k()
            if (r1 == 0) goto La1
            android.content.Context r1 = r2.b
            android.net.Uri r4 = r2.c
            r5 = 2
            int r6 = r1.checkCallingOrSelfUriPermission(r4, r5)
            if (r6 == 0) goto L30
            goto La1
        L30:
            java.lang.String r6 = "mime_type"
            java.lang.String r6 = defpackage.hv.U(r1, r4, r6)
            java.lang.String r7 = "flags"
            r11 = 0
            long r7 = defpackage.hv.T(r1, r4, r7, r11)
            int r1 = (int) r7
            boolean r4 = android.text.TextUtils.isEmpty(r6)
            if (r4 == 0) goto L46
            goto La1
        L46:
            r4 = r1 & 4
            if (r4 == 0) goto L4b
            goto L61
        L4b:
            java.lang.String r4 = "vnd.android.document/directory"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L58
            r4 = r1 & 8
            if (r4 == 0) goto L58
            goto L61
        L58:
            boolean r4 = android.text.TextUtils.isEmpty(r6)
            if (r4 != 0) goto La1
            r1 = r1 & r5
            if (r1 == 0) goto La1
        L61:
            tl1 r1 = r13.q(r0)
            java.util.Map r6 = r1.b
            java.util.Map r7 = h(r3)
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.lang.String r1 = ""
            g(r2, r1, r8)
            vl1 r4 = defpackage.vl1.LOCAL     // Catch: java.lang.Throwable -> L8a
            java.lang.String r5 = ""
            r1 = r13
            r1.s(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L87
            java.util.LinkedHashMap r13 = d(r2, r3)     // Catch: java.lang.Throwable -> L87
            r1.v(r0, r13)     // Catch: java.lang.Throwable -> L87
            jg7 r13 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L87
            goto L93
        L87:
            r0 = move-exception
        L88:
            r13 = r0
            goto L8d
        L8a:
            r0 = move-exception
            r1 = r13
            goto L88
        L8d:
            em5 r0 = new em5
            r0.<init>(r13)
            r13 = r0
        L93:
            java.lang.Throwable r13 = defpackage.hm5.a(r13)
            if (r13 == 0) goto L9e
            java.lang.String r0 = "Could not sync DLDI folder after emulation"
            android.util.Log.w(r10, r0, r13)
        L9e:
            r1.c = r9
            return
        La1:
            r1 = r13
            java.lang.String r13 = "Skipping DLDI sync-back because the selected folder is not writable"
            android.util.Log.w(r10, r13)
            r1.c = r9
            return
    }

    public void s(defpackage.zl1 r19, java.io.File r20, defpackage.vl1 r21, java.lang.String r22, java.util.Map r23, java.util.Map r24, java.util.Map r25) {
            r18 = this;
            m(r20)
            zl1[] r0 = r19.o()
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.length
            r3 = 0
            r4 = r3
        L12:
            r5 = 0
            if (r4 >= r2) goto L2a
            r6 = r0[r4]
            java.lang.String r7 = r6.i()
            if (r7 == 0) goto L22
            vr4 r5 = new vr4
            r5.<init>(r7, r6)
        L22:
            if (r5 == 0) goto L27
            r1.add(r5)
        L27:
            int r4 = r4 + 1
            goto L12
        L2a:
            java.util.Map r8 = defpackage.c14.r0(r1)
            java.io.File[] r0 = r20.listFiles()
            if (r0 == 0) goto L52
            int r1 = r0.length
            int r1 = defpackage.c14.k0(r1)
            r2 = 16
            if (r1 >= r2) goto L3e
            r1 = r2
        L3e:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r1)
            int r1 = r0.length
        L44:
            if (r3 >= r1) goto L52
            r2 = r0[r3]
            java.lang.String r4 = r2.getName()
            r5.put(r4, r2)
            int r3 = r3 + 1
            goto L44
        L52:
            zt1 r9 = defpackage.zt1.A
            if (r5 != 0) goto L58
            r10 = r9
            goto L59
        L58:
            r10 = r5
        L59:
            java.util.Set r0 = r8.keySet()
            java.util.Set r1 = r10.keySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.LinkedHashSet r0 = defpackage.ii2.K(r0, r1)
            java.util.List r0 = defpackage.gt0.c1(r0)
            java.util.Iterator r11 = r0.iterator()
        L6f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L1b7
            java.lang.Object r0 = r11.next()
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r0 = r8.get(r7)
            r12 = r0
            zl1 r12 = (defpackage.zl1) r12
            java.lang.Object r0 = r10.get(r7)
            r3 = r0
            java.io.File r3 = (java.io.File) r3
            r7.getClass()
            r13 = r22
            java.lang.String r4 = e(r13, r7)
            if (r12 != 0) goto La3
            if (r3 == 0) goto L98
            goto La3
        L98:
            r14 = r20
        L9a:
            r7 = r23
        L9c:
            r12 = r24
            r15 = r25
            r5 = r9
            goto L1ab
        La3:
            if (r12 != 0) goto Lb5
            if (r3 == 0) goto Lb5
            r0 = r18
            r2 = r19
            r1 = r21
            r5 = r23
            r6 = r24
            r0.u(r1, r2, r3, r4, r5, r6)
            goto L98
        Lb5:
            if (r12 == 0) goto Lcd
            if (r3 != 0) goto Lcd
            java.io.File r3 = new java.io.File
            r14 = r20
            r3.<init>(r14, r7)
            r0 = r18
            r1 = r21
            r5 = r23
            r6 = r25
            r2 = r12
            r0.t(r1, r2, r3, r4, r5, r6)
            goto L9a
        Lcd:
            r14 = r20
            r2 = r12
            r2.getClass()
            boolean r0 = r2.k()
            if (r0 == 0) goto Lf4
            r3.getClass()
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto Lf4
            r0 = r18
            r5 = r23
            r6 = r24
            r7 = r25
            r1 = r2
            r2 = r3
            r3 = r21
            r0.s(r1, r2, r3, r4, r5, r6, r7)
            r1 = r3
            r7 = r5
            goto L9c
        Lf4:
            r0 = r18
            r1 = r21
            r7 = r23
            boolean r5 = r2.l()
            if (r5 == 0) goto L144
            r3.getClass()
            boolean r5 = r3.isFile()
            if (r5 == 0) goto L144
            ul1 r5 = c(r3)
            ul1 r15 = b(r2)
            boolean r16 = r5.equals(r15)
            if (r16 == 0) goto L118
            goto L9c
        L118:
            vl1 r6 = defpackage.vl1.LOCAL
            boolean r6 = n(r4, r6, r5, r7)
            vl1 r12 = defpackage.vl1.DOCUMENT
            boolean r4 = n(r4, r12, r15, r7)
            vl1 r4 = f(r6, r4, r5, r15, r1)
            int[] r5 = defpackage.wl1.a
            int r4 = r4.ordinal()
            r4 = r5[r4]
            r5 = 1
            if (r4 == r5) goto L13f
            r5 = 2
            if (r4 != r5) goto L13b
            r0.j(r2, r3)
            goto L9c
        L13b:
            defpackage.i.d()
            return
        L13f:
            r0.k(r2, r3)
            goto L9c
        L144:
            r3.getClass()
            vl1 r5 = defpackage.vl1.LOCAL
            r12 = r24
            boolean r5 = o(r4, r5, r7, r12)
            vl1 r6 = defpackage.vl1.DOCUMENT
            r15 = r25
            boolean r6 = o(r4, r6, r7, r15)
            ul1 r0 = c(r3)
            r17 = r2
            ul1 r2 = b(r17)
            vl1 r0 = f(r5, r6, r0, r2, r1)
            int[] r2 = defpackage.wl1.a
            int r0 = r0.ordinal()
            r0 = r2[r0]
            r5 = 1
            if (r0 == r5) goto L198
            r5 = 2
            if (r0 != r5) goto L194
            boolean r0 = r3.exists()
            if (r0 == 0) goto L18a
            boolean r0 = defpackage.jc2.x0(r3)
            if (r0 == 0) goto L180
            goto L18a
        L180:
            java.lang.String r0 = r3.getAbsolutePath()
            java.lang.String r1 = "Could not replace local DLDI entry "
            defpackage.u34.B(r0, r1)
            return
        L18a:
            r6 = r9
            r0 = r18
            r5 = r9
            r2 = r17
            r0.t(r1, r2, r3, r4, r5, r6)
            goto L1ab
        L194:
            defpackage.i.d()
            return
        L198:
            r5 = r9
            r2 = r17
            boolean r0 = l(r2)
            if (r0 == 0) goto L1ae
            r6 = r5
            r0 = r18
            r2 = r19
            r1 = r21
            r0.u(r1, r2, r3, r4, r5, r6)
        L1ab:
            r9 = r5
            goto L6f
        L1ae:
            android.net.Uri r0 = r2.j()
            java.lang.String r1 = "Could not replace DLDI document entry "
            defpackage.u34.B(r0, r1)
        L1b7:
            return
    }

    public void t(defpackage.vl1 r10, defpackage.zl1 r11, java.io.File r12, java.lang.String r13, java.util.Map r14, java.util.Map r15) {
            r9 = this;
            java.lang.Object r0 = r14.get(r13)
            sl1 r0 = (defpackage.sl1) r0
            vl1 r1 = defpackage.vl1.DOCUMENT
            boolean r1 = o(r13, r1, r14, r15)
            if (r0 == 0) goto L21
            if (r1 != 0) goto L21
            boolean r9 = l(r11)
            if (r9 == 0) goto L17
            goto L43
        L17:
            android.net.Uri r9 = r11.j()
            java.lang.String r10 = "Could not propagate DLDI delete for "
            defpackage.u34.B(r9, r10)
            return
        L21:
            boolean r0 = r11.k()
            if (r0 == 0) goto L37
            m(r12)
            zt1 r7 = defpackage.zt1.A
            r1 = r9
            r4 = r10
            r2 = r11
            r3 = r12
            r5 = r13
            r6 = r14
            r8 = r15
            r1.s(r2, r3, r4, r5, r6, r7, r8)
            return
        L37:
            r1 = r9
            r2 = r11
            r3 = r12
            boolean r9 = r2.l()
            if (r9 == 0) goto L43
            r1.j(r2, r3)
        L43:
            return
    }

    public void u(defpackage.vl1 r11, defpackage.zl1 r12, java.io.File r13, java.lang.String r14, java.util.Map r15, java.util.Map r16) {
            r10 = this;
            java.lang.Object r0 = r15.get(r14)
            sl1 r0 = (defpackage.sl1) r0
            vl1 r1 = defpackage.vl1.LOCAL
            r8 = r16
            boolean r1 = o(r14, r1, r15, r8)
            if (r0 == 0) goto L24
            if (r1 != 0) goto L24
            boolean r10 = defpackage.jc2.x0(r13)
            if (r10 == 0) goto L1a
            goto Led
        L1a:
            java.lang.String r10 = r13.getAbsolutePath()
            java.lang.String r11 = "Could not propagate DLDI delete for "
            defpackage.u34.B(r10, r11)
            return
        L24:
            boolean r0 = r13.isDirectory()
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L8c
            java.lang.String r0 = r13.getName()
            r0.getClass()
            zl1 r3 = r12.f(r0)
            if (r3 == 0) goto L6b
            boolean r4 = r3.k()
            if (r4 == 0) goto L40
            goto L71
        L40:
            int[] r4 = defpackage.wl1.a
            int r5 = r11.ordinal()
            r4 = r4[r5]
            if (r4 == r2) goto L5a
            if (r4 == r1) goto L50
            defpackage.i.d()
            return
        L50:
            android.net.Uri r10 = r3.j()
            java.lang.String r11 = "Cannot replace DLDI file with directory at "
            defpackage.u34.B(r10, r11)
            return
        L5a:
            boolean r1 = l(r3)
            if (r1 == 0) goto L61
            goto L6b
        L61:
            android.net.Uri r10 = r3.j()
            java.lang.String r11 = "Could not replace DLDI file "
            defpackage.u34.B(r10, r11)
            return
        L6b:
            zl1 r3 = r12.b(r0)
            if (r3 == 0) goto L7c
        L71:
            zt1 r9 = defpackage.zt1.A
            r2 = r10
            r5 = r11
            r4 = r13
            r6 = r14
            r7 = r15
            r2.s(r3, r4, r5, r6, r7, r8, r9)
            return
        L7c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Could not create DLDI directory "
            java.lang.String r11 = r11.concat(r0)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L8c:
            boolean r15 = r13.isFile()
            if (r15 == 0) goto Led
            java.lang.String r15 = r13.getName()
            r15.getClass()
            zl1 r0 = r12.f(r15)
            if (r0 == 0) goto Ld1
            boolean r3 = r0.l()
            if (r3 == 0) goto La6
            goto Ld9
        La6:
            int[] r3 = defpackage.wl1.a
            int r11 = r11.ordinal()
            r11 = r3[r11]
            if (r11 == r2) goto Lc0
            if (r11 == r1) goto Lb6
            defpackage.i.d()
            return
        Lb6:
            android.net.Uri r10 = r0.j()
            java.lang.String r11 = "Cannot replace DLDI directory with file at "
            defpackage.u34.B(r10, r11)
            return
        Lc0:
            boolean r11 = l(r0)
            if (r11 == 0) goto Lc7
            goto Ld1
        Lc7:
            android.net.Uri r10 = r0.j()
            java.lang.String r11 = "Could not replace DLDI directory "
            defpackage.u34.B(r10, r11)
            return
        Ld1:
            java.lang.String r11 = "application/octet-stream"
            zl1 r0 = r12.c(r11, r15)
            if (r0 == 0) goto Ldd
        Ld9:
            r10.k(r0, r13)
            return
        Ldd:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Could not create DLDI file "
            java.lang.String r11 = r11.concat(r15)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        Led:
            return
    }

    public void v(android.net.Uri r8, java.util.LinkedHashMap r9) {
            r7 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>(r9)
            java.util.Set r9 = r1.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L12:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r9.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            sl1 r1 = (defpackage.sl1) r1
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            rl1 r4 = r1.a
            java.lang.String r4 = r4.name()
            java.lang.String r5 = "kind"
            r3.put(r5, r4)
            java.lang.String r4 = "localLastModified"
            long r5 = r1.b
            r3.put(r4, r5)
            java.lang.String r4 = "localLength"
            long r5 = r1.c
            r3.put(r4, r5)
            java.lang.String r4 = "documentLastModified"
            long r5 = r1.d
            r3.put(r4, r5)
            java.lang.String r4 = "documentLength"
            long r5 = r1.e
            r3.put(r4, r5)
            r0.put(r2, r3)
            goto L12
        L5a:
            java.lang.Object r7 = r7.g
            java.io.File r7 = (java.io.File) r7
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            java.lang.String r1 = "documentTreeUri"
            java.lang.String r8 = r8.toString()
            r9.put(r1, r8)
            java.lang.String r8 = "entries"
            r9.put(r8, r0)
            java.lang.String r8 = r9.toString()
            r8.getClass()
            defpackage.jc2.F0(r7, r8)
            return
    }
}
