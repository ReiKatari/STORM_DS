package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qi6  reason: default package */
/* loaded from: classes.dex */
public final class qi6 extends defpackage.zl1 {
    public final /* synthetic */ int a;
    public android.content.Context b;
    public android.net.Uri c;

    public /* synthetic */ qi6() {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            return
    }

    public qi6(android.content.Context r2, android.net.Uri r3) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.<init>()
            r1.b = r2
            r1.c = r3
            return
    }

    @Override // defpackage.zl1
    public final boolean a() {
            r5 = this;
            int r0 = r5.a
            java.lang.String r1 = "mime_type"
            r2 = 1
            r3 = 0
            switch(r0) {
                case 0: goto L20;
                default: goto L9;
            }
        L9:
            android.content.Context r0 = r5.b
            android.net.Uri r5 = r5.c
            int r4 = r0.checkCallingOrSelfUriPermission(r5, r2)
            if (r4 == 0) goto L14
            goto L1e
        L14:
            java.lang.String r5 = defpackage.hv.U(r0, r5, r1)
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L1f
        L1e:
            r2 = r3
        L1f:
            return r2
        L20:
            android.content.Context r0 = r5.b
            android.net.Uri r5 = r5.c
            int r4 = r0.checkCallingOrSelfUriPermission(r5, r2)
            if (r4 == 0) goto L2b
            goto L35
        L2b:
            java.lang.String r5 = defpackage.hv.U(r0, r5, r1)
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L36
        L35:
            r2 = r3
        L36:
            return r2
    }

    @Override // defpackage.zl1
    public final defpackage.zl1 b(java.lang.String r5) {
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 0: goto L1e;
                default: goto L5;
            }
        L5:
            android.content.Context r0 = r4.b
            android.net.Uri r4 = r4.c
            java.lang.String r1 = "vnd.android.document/directory"
            r2 = 0
            android.content.ContentResolver r3 = r0.getContentResolver()     // Catch: java.lang.Exception -> L15
            android.net.Uri r4 = android.provider.DocumentsContract.createDocument(r3, r4, r1, r5)     // Catch: java.lang.Exception -> L15
            goto L16
        L15:
            r4 = r2
        L16:
            if (r4 == 0) goto L1d
            qi6 r2 = new qi6
            r2.<init>(r0, r4)
        L1d:
            return r2
        L1e:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            r4.<init>()
            throw r4
    }

    @Override // defpackage.zl1
    public final defpackage.zl1 c(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 0: goto L1c;
                default: goto L5;
            }
        L5:
            android.content.Context r0 = r3.b
            android.net.Uri r3 = r3.c
            r1 = 0
            android.content.ContentResolver r2 = r0.getContentResolver()     // Catch: java.lang.Exception -> L13
            android.net.Uri r3 = android.provider.DocumentsContract.createDocument(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L13
            goto L14
        L13:
            r3 = r1
        L14:
            if (r3 == 0) goto L1b
            qi6 r1 = new qi6
            r1.<init>(r0, r3)
        L1b:
            return r1
        L1c:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            r3.<init>()
            throw r3
    }

    @Override // defpackage.zl1
    public final boolean d() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            android.content.Context r0 = r1.b     // Catch: java.lang.Exception -> L12
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> L12
            android.net.Uri r1 = r1.c     // Catch: java.lang.Exception -> L12
            boolean r1 = android.provider.DocumentsContract.deleteDocument(r0, r1)     // Catch: java.lang.Exception -> L12
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
        L14:
            android.content.Context r0 = r1.b     // Catch: java.lang.Exception -> L21
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> L21
            android.net.Uri r1 = r1.c     // Catch: java.lang.Exception -> L21
            boolean r1 = android.provider.DocumentsContract.deleteDocument(r0, r1)     // Catch: java.lang.Exception -> L21
            goto L22
        L21:
            r1 = 0
        L22:
            return r1
    }

    @Override // defpackage.zl1
    public final boolean e() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            android.content.Context r0 = r1.b
            android.net.Uri r1 = r1.c
            boolean r1 = defpackage.hv.B(r0, r1)
            return r1
        Le:
            android.content.Context r0 = r1.b
            android.net.Uri r1 = r1.c
            boolean r1 = defpackage.hv.B(r0, r1)
            return r1
    }

    @Override // defpackage.zl1
    public final java.lang.String i() {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            android.content.Context r0 = r2.b
            android.net.Uri r2 = r2.c
            java.lang.String r1 = "_display_name"
            java.lang.String r2 = defpackage.hv.U(r0, r2, r1)
            return r2
        L10:
            android.content.Context r0 = r2.b
            android.net.Uri r2 = r2.c
            java.lang.String r1 = "_display_name"
            java.lang.String r2 = defpackage.hv.U(r0, r2, r1)
            return r2
    }

    @Override // defpackage.zl1
    public final android.net.Uri j() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            android.net.Uri r1 = r1.c
            return r1
        L8:
            android.net.Uri r1 = r1.c
            return r1
    }

    @Override // defpackage.zl1
    public final boolean k() {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L16;
                default: goto L5;
            }
        L5:
            android.content.Context r0 = r2.b
            android.net.Uri r2 = r2.c
            java.lang.String r1 = "mime_type"
            java.lang.String r2 = defpackage.hv.U(r0, r2, r1)
            java.lang.String r0 = "vnd.android.document/directory"
            boolean r2 = r0.equals(r2)
            return r2
        L16:
            android.content.Context r0 = r2.b
            android.net.Uri r2 = r2.c
            java.lang.String r1 = "mime_type"
            java.lang.String r2 = defpackage.hv.U(r0, r2, r1)
            java.lang.String r0 = "vnd.android.document/directory"
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // defpackage.zl1
    public final boolean l() {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L22;
                default: goto L5;
            }
        L5:
            android.content.Context r0 = r2.b
            android.net.Uri r2 = r2.c
            java.lang.String r1 = "mime_type"
            java.lang.String r2 = defpackage.hv.U(r0, r2, r1)
            java.lang.String r0 = "vnd.android.document/directory"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L20
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L1e
            goto L20
        L1e:
            r2 = 1
            goto L21
        L20:
            r2 = 0
        L21:
            return r2
        L22:
            android.content.Context r0 = r2.b
            android.net.Uri r2 = r2.c
            java.lang.String r1 = "mime_type"
            java.lang.String r2 = defpackage.hv.U(r0, r2, r1)
            java.lang.String r0 = "vnd.android.document/directory"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L3d
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L3b
            goto L3d
        L3b:
            r2 = 1
            goto L3e
        L3d:
            r2 = 0
        L3e:
            return r2
    }

    @Override // defpackage.zl1
    public final long m() {
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            android.content.Context r0 = r4.b
            android.net.Uri r4 = r4.c
            java.lang.String r1 = "last_modified"
            r2 = 0
            long r0 = defpackage.hv.T(r0, r4, r1, r2)
            return r0
        L12:
            android.content.Context r0 = r4.b
            android.net.Uri r4 = r4.c
            java.lang.String r1 = "last_modified"
            r2 = 0
            long r0 = defpackage.hv.T(r0, r4, r1, r2)
            return r0
    }

    @Override // defpackage.zl1
    public final long n() {
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            android.content.Context r0 = r4.b
            android.net.Uri r4 = r4.c
            java.lang.String r1 = "_size"
            r2 = 0
            long r0 = defpackage.hv.T(r0, r4, r1, r2)
            return r0
        L12:
            android.content.Context r0 = r4.b
            android.net.Uri r4 = r4.c
            java.lang.String r1 = "_size"
            r2 = 0
            long r0 = defpackage.hv.T(r0, r4, r1, r2)
            return r0
    }

    @Override // defpackage.zl1
    public final defpackage.zl1[] o() {
            r11 = this;
            int r0 = r11.a
            switch(r0) {
                case 0: goto L8c;
                default: goto L5;
            }
        L5:
            android.content.Context r1 = r11.b
            android.content.ContentResolver r2 = r1.getContentResolver()
            android.net.Uri r11 = r11.c
            java.lang.String r0 = android.provider.DocumentsContract.getDocumentId(r11)
            android.net.Uri r3 = android.provider.DocumentsContract.buildChildDocumentsUriUsingTree(r11, r0)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = 0
            r10 = 0
            java.lang.String r0 = "document_id"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            r6 = 0
            r7 = 0
            r5 = 0
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
        L29:
            boolean r0 = r10.moveToNext()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            if (r0 == 0) goto L41
            java.lang.String r0 = r10.getString(r9)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            android.net.Uri r0 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r11, r0)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            r8.add(r0)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            goto L29
        L3b:
            r0 = move-exception
            r11 = r0
            goto L82
        L3e:
            r0 = move-exception
            r11 = r0
            goto L48
        L41:
            defpackage.lb1.v(r10)     // Catch: java.lang.RuntimeException -> L45 java.lang.Exception -> L67
            goto L67
        L45:
            r0 = move-exception
            r11 = r0
            throw r11
        L48:
            java.lang.String r0 = "DocumentFile"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r2.<init>()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = "Failed query: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L3b
            r2.append(r11)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r11 = r2.toString()     // Catch: java.lang.Throwable -> L3b
            android.util.Log.w(r0, r11)     // Catch: java.lang.Throwable -> L3b
            if (r10 == 0) goto L67
            defpackage.lb1.v(r10)     // Catch: java.lang.RuntimeException -> L64 java.lang.Exception -> L67
            goto L67
        L64:
            r0 = move-exception
            r11 = r0
            throw r11
        L67:
            android.net.Uri[] r11 = new android.net.Uri[r9]
            java.lang.Object[] r11 = r8.toArray(r11)
            android.net.Uri[] r11 = (android.net.Uri[]) r11
            int r0 = r11.length
            zl1[] r0 = new defpackage.zl1[r0]
        L72:
            int r2 = r11.length
            if (r9 >= r2) goto L81
            qi6 r2 = new qi6
            r3 = r11[r9]
            r2.<init>(r1, r3)
            r0[r9] = r2
            int r9 = r9 + 1
            goto L72
        L81:
            return r0
        L82:
            if (r10 == 0) goto L8b
            defpackage.lb1.v(r10)     // Catch: java.lang.RuntimeException -> L88 java.lang.Exception -> L8b
            goto L8b
        L88:
            r0 = move-exception
            r11 = r0
            throw r11
        L8b:
            throw r11
        L8c:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            r11.<init>()
            throw r11
    }
}
