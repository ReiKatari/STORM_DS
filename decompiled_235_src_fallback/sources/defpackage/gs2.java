package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gs2  reason: default package */
/* loaded from: classes.dex */
public final class gs2 extends android.database.ContentObserver {
    public final /* synthetic */ android.app.DownloadManager a;
    public final /* synthetic */ long b;
    public final /* synthetic */ defpackage.r35 c;
    public final /* synthetic */ defpackage.hs2 d;
    public final /* synthetic */ defpackage.kt e;
    public final /* synthetic */ java.io.File f;

    public gs2(android.app.DownloadManager r1, long r2, defpackage.r35 r4, defpackage.hs2 r5, defpackage.kt r6, java.io.File r7) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.c = r4
            r0.d = r5
            r0.e = r6
            r0.f = r7
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean r13, android.net.Uri r14) {
            r12 = this;
            android.app.DownloadManager$Query r13 = new android.app.DownloadManager$Query
            r13.<init>()
            r14 = 1
            long[] r14 = new long[r14]
            r0 = 0
            long r1 = r12.b
            r14[r0] = r1
            android.app.DownloadManager$Query r13 = r13.setFilterById(r14)
            android.app.DownloadManager r14 = r12.a
            android.database.Cursor r13 = r14.query(r13)
            hs2 r0 = r12.d
            kt r3 = r12.e
            java.io.File r4 = r12.f
            boolean r5 = r13.moveToNext()     // Catch: java.lang.Throwable -> L59
            if (r5 != 0) goto L27
            r13.close()
            return
        L27:
            java.lang.String r5 = "total_size"
            int r5 = r13.getColumnIndexOrThrow(r5)     // Catch: java.lang.Throwable -> L59
            long r5 = r13.getLong(r5)     // Catch: java.lang.Throwable -> L59
            java.lang.String r7 = "bytes_so_far"
            int r7 = r13.getColumnIndexOrThrow(r7)     // Catch: java.lang.Throwable -> L59
            long r7 = r13.getLong(r7)     // Catch: java.lang.Throwable -> L59
            java.lang.String r9 = "status"
            int r9 = r13.getColumnIndexOrThrow(r9)     // Catch: java.lang.Throwable -> L59
            int r9 = r13.getInt(r9)     // Catch: java.lang.Throwable -> L59
            r10 = 0
            int r10 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            r35 r12 = r12.c
            if (r10 < 0) goto L5b
            r12.getClass()     // Catch: java.lang.Throwable -> L59
            lm1 r10 = new lm1     // Catch: java.lang.Throwable -> L59
            r10.<init>(r5, r7)     // Catch: java.lang.Throwable -> L59
            r12.c(r10)     // Catch: java.lang.Throwable -> L59
            goto L5b
        L59:
            r12 = move-exception
            goto Lab
        L5b:
            r5 = 8
            r6 = 0
            km1 r7 = defpackage.km1.a
            if (r9 == r5) goto L71
            r14 = 16
            if (r9 == r14) goto L67
            goto La7
        L67:
            r12.getClass()     // Catch: java.lang.Throwable -> L59
            r12.c(r7)     // Catch: java.lang.Throwable -> L59
            r12.w0(r6)     // Catch: java.lang.Throwable -> L59
            goto La7
        L71:
            boolean r3 = r0.c(r3, r4)     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L9b
            android.net.Uri r14 = r14.getUriForDownloadedFile(r1)     // Catch: java.lang.Throwable -> L59
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L59
            java.lang.String r2 = "android.intent.action.VIEW"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L59
            java.lang.String r2 = "application/vnd.android.package-archive"
            r1.setDataAndType(r14, r2)     // Catch: java.lang.Throwable -> L59
            r14 = 268435457(0x10000001, float:2.5243552E-29)
            r1.setFlags(r14)     // Catch: java.lang.Throwable -> L59
            android.content.Context r14 = r0.a     // Catch: java.lang.Throwable -> L59
            r14.startActivity(r1)     // Catch: java.lang.Throwable -> L59
            r12.getClass()     // Catch: java.lang.Throwable -> L59
            jm1 r14 = defpackage.jm1.a     // Catch: java.lang.Throwable -> L59
            r12.c(r14)     // Catch: java.lang.Throwable -> L59
            goto La1
        L9b:
            r12.getClass()     // Catch: java.lang.Throwable -> L59
            r12.c(r7)     // Catch: java.lang.Throwable -> L59
        La1:
            r12.getClass()     // Catch: java.lang.Throwable -> L59
            r12.w0(r6)     // Catch: java.lang.Throwable -> L59
        La7:
            r13.close()
            return
        Lab:
            throw r12     // Catch: java.lang.Throwable -> Lac
        Lac:
            r14 = move-exception
            defpackage.ge7.t(r13, r12)
            throw r14
    }
}
