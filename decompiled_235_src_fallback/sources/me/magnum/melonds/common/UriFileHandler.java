package me.magnum.melonds.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class UriFileHandler {
    public static final java.util.List c = null;
    public final me.magnum.melonds.MelonDSApplication a;
    public final defpackage.uh7 b;

    static {
            java.lang.String r0 = "w"
            java.lang.String r1 = "a"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = defpackage.hf.c0(r0)
            me.magnum.melonds.common.UriFileHandler.c = r0
            return
    }

    public UriFileHandler(me.magnum.melonds.MelonDSApplication r1, defpackage.uh7 r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final int open(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r5.getClass()
            r6.getClass()
            android.net.Uri r5 = android.net.Uri.parse(r5)
            java.util.List r0 = me.magnum.melonds.common.UriFileHandler.c
            r0.getClass()
            r1 = 0
            vr4 r0 = defpackage.qs6.n0(r6, r0, r1)
            if (r0 == 0) goto L17
            r1 = 1
        L17:
            java.lang.String r0 = r5.getScheme()
            java.lang.String r2 = "file"
            boolean r0 = defpackage.nb3.k(r0, r2)
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L54
            java.lang.String r4 = r5.getPath()
            if (r4 == 0) goto L53
            java.io.File r5 = new java.io.File
            r5.<init>(r4)
            if (r1 == 0) goto L3b
            java.io.File r4 = r5.getParentFile()     // Catch: java.lang.Exception -> L4d
            if (r4 == 0) goto L3b
            r4.mkdirs()     // Catch: java.lang.Exception -> L4d
        L3b:
            int r4 = android.os.ParcelFileDescriptor.parseMode(r6)     // Catch: java.lang.Exception -> L4d
            android.os.ParcelFileDescriptor r4 = android.os.ParcelFileDescriptor.open(r5, r4)     // Catch: java.lang.Exception -> L4d
            if (r4 == 0) goto L4d
            int r4 = r4.detachFd()     // Catch: java.lang.Exception -> L4d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L4d
        L4d:
            if (r3 == 0) goto L53
            int r2 = r3.intValue()
        L53:
            return r2
        L54:
            me.magnum.melonds.MelonDSApplication r0 = r4.a
            if (r1 == 0) goto L90
            uh7 r4 = r4.b
            boolean r1 = r4.d(r5)
            if (r1 == 0) goto L73
            android.content.ContentResolver r4 = r0.getContentResolver()     // Catch: java.lang.Throwable -> La2
            android.os.ParcelFileDescriptor r4 = r4.openFileDescriptor(r5, r6)     // Catch: java.lang.Throwable -> La2
            if (r4 == 0) goto La2
            int r4 = r4.detachFd()     // Catch: java.lang.Throwable -> La2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> La2
            goto La2
        L73:
            zl1 r4 = r4.c(r5)
            if (r4 == 0) goto La2
            android.content.ContentResolver r5 = r0.getContentResolver()     // Catch: java.lang.Throwable -> La2
            android.net.Uri r4 = r4.j()     // Catch: java.lang.Throwable -> La2
            android.os.ParcelFileDescriptor r4 = r5.openFileDescriptor(r4, r6)     // Catch: java.lang.Throwable -> La2
            if (r4 == 0) goto La2
            int r4 = r4.detachFd()     // Catch: java.lang.Throwable -> La2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> La2
            goto La2
        L90:
            android.content.ContentResolver r4 = r0.getContentResolver()
            android.os.ParcelFileDescriptor r4 = r4.openFileDescriptor(r5, r6)
            if (r4 == 0) goto La2
            int r4 = r4.detachFd()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
        La2:
            if (r3 == 0) goto La8
            int r2 = r3.intValue()
        La8:
            return r2
    }
}
