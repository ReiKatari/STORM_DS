package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f31  reason: default package */
/* loaded from: classes.dex */
public final class f31 extends defpackage.xk5 {
    public static final android.content.UriMatcher b = null;
    public final android.content.Context a;

    static {
            android.content.UriMatcher r0 = new android.content.UriMatcher
            r1 = -1
            r0.<init>(r1)
            defpackage.f31.b = r0
            java.lang.String r1 = "com.android.contacts"
            java.lang.String r2 = "contacts/lookup/*/#"
            r3 = 1
            r0.addURI(r1, r2, r3)
            java.lang.String r2 = "contacts/lookup/*"
            r0.addURI(r1, r2, r3)
            java.lang.String r2 = "contacts/#/photo"
            r3 = 2
            r0.addURI(r1, r2, r3)
            java.lang.String r2 = "contacts/#"
            r3 = 3
            r0.addURI(r1, r2, r3)
            java.lang.String r2 = "display_photo/#"
            r3 = 4
            r0.addURI(r1, r2, r3)
            return
    }

    public f31(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.xk5
    public final boolean a(defpackage.m44 r2) {
            r1 = this;
            java.lang.Object r1 = r2.B
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.String r2 = "content"
            java.lang.String r0 = r1.getScheme()
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L2b
            android.net.Uri r2 = android.provider.ContactsContract.Contacts.CONTENT_URI
            java.lang.String r2 = r2.getHost()
            java.lang.String r0 = r1.getHost()
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L2b
            android.content.UriMatcher r2 = defpackage.f31.b
            int r1 = r2.match(r1)
            r2 = -1
            if (r1 == r2) goto L2b
            r1 = 1
            return r1
        L2b:
            r1 = 0
            return r1
    }

    @Override // defpackage.xk5
    public final defpackage.aj c(defpackage.m44 r4, int r5) {
            r3 = this;
            android.content.Context r3 = r3.a
            android.content.ContentResolver r3 = r3.getContentResolver()
            java.lang.Object r4 = r4.B
            android.net.Uri r4 = (android.net.Uri) r4
            android.content.UriMatcher r5 = defpackage.f31.b
            int r5 = r5.match(r4)
            r0 = 0
            r1 = 1
            if (r5 == r1) goto L2d
            r2 = 2
            if (r5 == r2) goto L28
            r2 = 3
            if (r5 == r2) goto L35
            r1 = 4
            if (r5 != r1) goto L1e
            goto L28
        L1e:
            java.lang.String r3 = "Invalid uri: "
            java.lang.String r3 = defpackage.xg6.n(r4, r3)
            defpackage.i.m(r3)
            return r0
        L28:
            java.io.InputStream r3 = r3.openInputStream(r4)
            goto L39
        L2d:
            android.net.Uri r4 = android.provider.ContactsContract.Contacts.lookupContact(r3, r4)
            if (r4 != 0) goto L35
            r3 = r0
            goto L39
        L35:
            java.io.InputStream r3 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r3, r4, r1)
        L39:
            if (r3 != 0) goto L3c
            return r0
        L3c:
            aj r4 = new aj
            a83 r3 = defpackage.hi2.P(r3)
            qw4 r5 = defpackage.qw4.DISK
            r4.<init>(r3, r5)
            return r4
    }
}
