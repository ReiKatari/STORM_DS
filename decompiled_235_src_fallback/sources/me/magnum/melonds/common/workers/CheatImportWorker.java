package me.magnum.melonds.common.workers;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class CheatImportWorker extends androidx.work.CoroutineWorker {
    public final defpackage.hp0 g;

    public CheatImportWorker(android.content.Context r1, androidx.work.WorkerParameters r2, defpackage.hp0 r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>(r1, r2)
            r0.g = r3
            return
    }

    @Override // androidx.work.CoroutineWorker
    public final java.lang.Object e(defpackage.r41 r12) {
            r11 = this;
            android.content.Context r0 = r11.a
            boolean r1 = r12 instanceof defpackage.ao0
            if (r1 == 0) goto L15
            r1 = r12
            ao0 r1 = (defpackage.ao0) r1
            int r2 = r1.Y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Y = r2
            goto L1c
        L15:
            ao0 r1 = new ao0
            s41 r12 = (defpackage.s41) r12
            r1.<init>(r11, r12)
        L1c:
            java.lang.Object r12 = r1.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.Y
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L39
            if (r3 == r5) goto L35
            if (r3 != r4) goto L2f
            defpackage.oi2.Y(r12)     // Catch: java.lang.Exception -> Lc8
            return r12
        L2f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r11)
            return r6
        L35:
            defpackage.oi2.Y(r12)
            goto L53
        L39:
            defpackage.oi2.Y(r12)
            r12 = 0
            wj2 r12 = r11.g(r6, r12, r5)
            r1.Y = r5
            gx3 r12 = r11.b(r12)
            java.lang.Object r12 = defpackage.gi2.m(r12, r1)
            if (r12 != r2) goto L4e
            goto L50
        L4e:
            jg7 r12 = defpackage.jg7.a
        L50:
            if (r12 != r2) goto L53
            goto Lba
        L53:
            androidx.work.WorkerParameters r12 = r11.b
            xb1 r12 = r12.b
            java.lang.String r3 = "uri"
            java.lang.String r12 = r12.b(r3)
            if (r12 == 0) goto Lce
            android.net.Uri r12 = android.net.Uri.parse(r12)
            if (r12 != 0) goto L66
            goto Lce
        L66:
            qi6 r3 = defpackage.zl1.g(r0, r12)     // Catch: java.lang.Exception -> Lc8
            boolean r7 = r3.l()     // Catch: java.lang.Exception -> Lc8
            if (r7 != r5) goto Lc2
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> Lc8
            java.lang.String r5 = "r"
            android.content.res.AssetFileDescriptor r0 = r0.openAssetFileDescriptor(r12, r5)     // Catch: java.lang.Exception -> Lc8
            if (r0 == 0) goto L98
            long r7 = r0.getLength()     // Catch: java.lang.Throwable -> L91
            r9 = -1
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 != 0) goto L88
            r5 = r6
            goto L8d
        L88:
            java.lang.Long r5 = new java.lang.Long     // Catch: java.lang.Throwable -> L91
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L91
        L8d:
            r0.close()     // Catch: java.lang.Exception -> Lc8
            goto L99
        L91:
            r11 = move-exception
            throw r11     // Catch: java.lang.Throwable -> L93
        L93:
            r12 = move-exception
            defpackage.ge7.t(r0, r11)     // Catch: java.lang.Exception -> Lc8
            throw r12     // Catch: java.lang.Exception -> Lc8
        L98:
            r5 = r6
        L99:
            java.lang.String r0 = r3.i()     // Catch: java.lang.Exception -> Lc8
            if (r0 == 0) goto La5
            r3 = 46
            java.lang.String r6 = defpackage.qs6.O0(r3, r0, r0)     // Catch: java.lang.Exception -> Lc8
        La5:
            java.lang.String r0 = "xml"
            boolean r0 = defpackage.nb3.k(r6, r0)     // Catch: java.lang.Exception -> Lc8
            if (r0 == 0) goto Lbc
            xo7 r0 = new xo7     // Catch: java.lang.Exception -> Lc8
            r0.<init>()     // Catch: java.lang.Exception -> Lc8
            r1.Y = r4     // Catch: java.lang.Exception -> Lc8
            java.lang.Object r11 = r11.h(r12, r0, r5, r1)     // Catch: java.lang.Exception -> Lc8
            if (r11 != r2) goto Lbb
        Lba:
            return r2
        Lbb:
            return r11
        Lbc:
            jx3 r11 = new jx3     // Catch: java.lang.Exception -> Lc8
            r11.<init>()     // Catch: java.lang.Exception -> Lc8
            return r11
        Lc2:
            jx3 r11 = new jx3     // Catch: java.lang.Exception -> Lc8
            r11.<init>()     // Catch: java.lang.Exception -> Lc8
            return r11
        Lc8:
            jx3 r11 = new jx3
            r11.<init>()
            return r11
        Lce:
            jx3 r11 = new jx3
            r11.<init>()
            return r11
    }

    public final defpackage.wj2 g(java.lang.String r3, int r4, boolean r5) {
            r2 = this;
            xg4 r0 = new xg4
            java.lang.String r1 = "channel_cheat_importing"
            android.content.Context r2 = r2.a
            r0.<init>(r2, r1)
            r1 = -1
            r0.h = r1
            r1 = 2131952019(0x7f130193, float:1.9540469E38)
            java.lang.String r1 = r2.getString(r1)
            java.lang.CharSequence r1 = defpackage.xg4.b(r1)
            r0.k = r1
            if (r3 != 0) goto L1d
            java.lang.String r3 = ""
        L1d:
            java.lang.CharSequence r3 = defpackage.xg4.b(r3)
            r0.e = r3
            r3 = 2131100536(0x7f060378, float:1.7813456E38)
            int r2 = r2.getColor(r3)
            r0.q = r2
            r2 = 2131230963(0x7f0800f3, float:1.8077994E38)
            android.app.Notification r3 = r0.t
            r3.icon = r2
            r2 = 100
            r0.l = r2
            r0.m = r4
            r0.n = r5
            android.app.Notification r3 = r0.a()
            r3.getClass()
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 34
            if (r4 < r5) goto L4f
            wj2 r4 = new wj2
            r5 = 1
            r4.<init>(r2, r3, r5)
            return r4
        L4f:
            wj2 r4 = new wj2
            r5 = 0
            r4.<init>(r2, r3, r5)
            return r4
    }

    public final java.lang.Object h(android.net.Uri r9, defpackage.xo7 r10, java.lang.Long r11, defpackage.s41 r12) {
            r8 = this;
            boolean r0 = r12 instanceof defpackage.bo0
            if (r0 == 0) goto L13
            r0 = r12
            bo0 r0 = (defpackage.bo0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            bo0 r0 = new bo0
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.oi2.Y(r12)
            goto L85
        L27:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            r8 = 0
            return r8
        L2e:
            defpackage.oi2.Y(r12)
            r0.Y = r3
            n36 r6 = new n36
            r41 r12 = defpackage.np2.V(r0)
            x61 r0 = defpackage.x61.UNDECIDED
            r6.<init>(r12, r0)
            android.content.Context r12 = r8.a
            android.content.ContentResolver r12 = r12.getContentResolver()
            java.io.InputStream r9 = r12.openInputStream(r9)
            if (r9 == 0) goto L7e
            g45 r5 = new g45     // Catch: java.lang.Throwable -> L75
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L75
            eb r2 = new eb     // Catch: java.lang.Throwable -> L75
            r7 = 5
            r3 = r8
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L75
            r10.getClass()     // Catch: java.lang.Throwable -> L75
            javax.xml.parsers.SAXParserFactory r8 = javax.xml.parsers.SAXParserFactory.newInstance()     // Catch: java.lang.Throwable -> L75
            javax.xml.parsers.SAXParser r8 = r8.newSAXParser()     // Catch: java.lang.Throwable -> L75
            ey7 r10 = new ey7     // Catch: java.lang.Throwable -> L75
            j97 r11 = new j97     // Catch: java.lang.Throwable -> L75
            r12 = 16
            r11.<init>(r2, r12)     // Catch: java.lang.Throwable -> L75
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L75
            r8.parse(r5, r10)     // Catch: java.lang.Throwable -> L75
            r9.close()
            goto L7e
        L75:
            r0 = move-exception
            r8 = r0
            throw r8     // Catch: java.lang.Throwable -> L78
        L78:
            r0 = move-exception
            r10 = r0
            defpackage.ge7.t(r9, r8)
            throw r10
        L7e:
            java.lang.Object r12 = r6.a()
            if (r12 != r1) goto L85
            return r1
        L85:
            r12.getClass()
            return r12
    }
}
