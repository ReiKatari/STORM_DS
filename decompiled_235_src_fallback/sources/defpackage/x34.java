package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x34  reason: default package */
/* loaded from: classes.dex */
public final class x34 implements defpackage.v93 {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;

    public x34(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = r3.getPackageName()
            r2.a = r0
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L19
            r1 = 0
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r3, r1)     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = r3.versionName     // Catch: java.lang.Throwable -> L19
            goto L20
        L19:
            r3 = move-exception
            em5 r0 = new em5
            r0.<init>(r3)
            r3 = r0
        L20:
            boolean r0 = r3 instanceof defpackage.em5
            if (r0 == 0) goto L26
            r3 = 0
        L26:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L2c
            java.lang.String r3 = ""
        L2c:
            boolean r0 = defpackage.qs6.v0(r3)
            if (r0 == 0) goto L34
            java.lang.String r3 = "unknown"
        L34:
            r2.b = r3
            java.lang.String r3 = "melonDualDS-android/0.7.0"
            r2.c = r3
            return
    }

    public static java.lang.String b(java.lang.String r2) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = java.net.URLDecoder.decode(r2, r0)     // Catch: java.lang.Throwable -> Lb
            goto L12
        Lb:
            r0 = move-exception
            em5 r1 = new em5
            r1.<init>(r0)
            r0 = r1
        L12:
            boolean r1 = r0 instanceof defpackage.em5
            if (r1 == 0) goto L18
            goto L19
        L18:
            r2 = r0
        L19:
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    public static java.lang.String c(defpackage.pa r3, defpackage.kw3 r4) {
            int r0 = r4.a()
            java.util.ListIterator r4 = r4.listIterator(r0)
        L8:
            r0 = r4
            xx2 r0 = (defpackage.xx2) r0
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L23
            java.lang.Object r0 = r0.previous()
            r1 = r0
            w34 r1 = (defpackage.w34) r1
            java.lang.String r1 = r1.a
            java.lang.String r2 = "r"
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 == 0) goto L8
            goto L24
        L23:
            r0 = 0
        L24:
            w34 r0 = (defpackage.w34) r0
            if (r0 == 0) goto L2e
            java.lang.String r4 = r0.b
            if (r4 != 0) goto L2d
            goto L2e
        L2d:
            return r4
        L2e:
            java.lang.Object r3 = r3.B
            i03 r3 = (defpackage.i03) r3
            java.lang.String r3 = r3.b()
            return r3
    }

    public static java.util.List d(java.lang.String r8) {
            if (r8 == 0) goto L7b
            boolean r0 = defpackage.qs6.v0(r8)
            if (r0 == 0) goto La
            goto L7b
        La:
            java.lang.String r0 = "&"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1 = 6
            java.util.List r8 = defpackage.qs6.K0(r8, r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L1e:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r8.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = defpackage.qs6.v0(r3)
            if (r3 != 0) goto L1e
            r0.add(r2)
            goto L1e
        L35:
            java.util.ArrayList r8 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.ht0.v0(r0, r2)
            r8.<init>(r2)
            int r2 = r0.size()
            r3 = 0
            r4 = r3
        L46:
            if (r4 >= r2) goto L7a
            java.lang.Object r5 = r0.get(r4)
            int r4 = r4 + 1
            java.lang.String r5 = (java.lang.String) r5
            r6 = 61
            int r6 = defpackage.qs6.s0(r6, r3, r1, r5)
            if (r6 < 0) goto L5d
            java.lang.String r7 = r5.substring(r3, r6)
            goto L5e
        L5d:
            r7 = r5
        L5e:
            if (r6 < 0) goto L67
            int r6 = r6 + 1
            java.lang.String r5 = r5.substring(r6)
            goto L69
        L67:
            java.lang.String r5 = ""
        L69:
            w34 r6 = new w34
            java.lang.String r7 = b(r7)
            java.lang.String r5 = b(r5)
            r6.<init>(r7, r5)
            r8.add(r6)
            goto L46
        L7a:
            return r8
        L7b:
            yt1 r8 = defpackage.yt1.A
            return r8
    }

    @Override // defpackage.v93
    public final defpackage.wl5 a(defpackage.dp3 r12) {
            r11 = this;
            java.lang.Object r0 = r12.i
            r1 = r0
            pa r1 = (defpackage.pa) r1
            kw3 r2 = defpackage.hf.I()
            java.lang.Object r0 = r1.B
            i03 r0 = (defpackage.i03) r0
            java.lang.String r0 = r0.d()
            java.util.List r0 = d(r0)
            r2.addAll(r0)
            java.lang.Object r0 = r1.X
            mk5 r0 = (defpackage.mk5) r0
            r3 = 0
            if (r0 != 0) goto L20
            goto L3d
        L20:
            k80 r4 = new k80     // Catch: java.lang.Throwable -> L2d
            r4.<init>()     // Catch: java.lang.Throwable -> L2d
            r0.d(r4)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = r4.c0()     // Catch: java.lang.Throwable -> L2d
            goto L34
        L2d:
            r0 = move-exception
            em5 r4 = new em5
            r4.<init>(r0)
            r0 = r4
        L34:
            boolean r4 = r0 instanceof defpackage.em5
            if (r4 == 0) goto L3a
            goto L3b
        L3a:
            r3 = r0
        L3b:
            java.lang.String r3 = (java.lang.String) r3
        L3d:
            java.util.List r0 = d(r3)
            r2.addAll(r0)
            kw3 r3 = defpackage.hf.A(r2)
            java.lang.String r0 = c(r1, r3)
            java.lang.String r2 = " user_agent="
            java.lang.String r4 = " package="
            java.lang.String r9 = "source=kotlin_http action="
            java.lang.String r10 = r11.c
            java.lang.StringBuilder r0 = defpackage.i61.u(r9, r0, r2, r10, r4)
            java.lang.String r2 = r11.a
            r0.append(r2)
            java.lang.String r2 = " version="
            r0.append(r2)
            java.lang.String r11 = r11.b
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.lang.String r0 = "RAIdentity"
            android.util.Log.i(r0, r11)
            java.lang.String r11 = c(r1, r3)
            java.lang.Object r0 = r1.L
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L81
            java.lang.String r2 = "<none>"
            goto L92
        L81:
            v83 r7 = new v83
            r2 = 24
            r7.<init>(r2)
            r8 = 30
            java.lang.String r4 = "&"
            r5 = 0
            r6 = 0
            java.lang.String r2 = defpackage.gt0.P0(r3, r4, r5, r6, r7, r8)
        L92:
            java.lang.String r3 = " method="
            java.lang.String r4 = " params="
            java.lang.StringBuilder r11 = defpackage.i61.u(r9, r11, r3, r0, r4)
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "RARequest"
            android.util.Log.i(r0, r11)
            s9 r11 = r1.o()
            r10.getClass()
            java.lang.Object r0 = r11.c
            ww2 r0 = (defpackage.ww2) r0
            java.lang.String r1 = "User-Agent"
            r0.b(r1, r10)
            pa r0 = new pa
            r0.<init>(r11)
            wl5 r11 = r12.f(r0)
            return r11
    }
}
