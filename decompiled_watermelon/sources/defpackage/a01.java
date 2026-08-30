package defpackage;

import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a01  reason: default package */
/* loaded from: classes.dex */
public final class a01 extends fb5 {
    public static final UriMatcher b;
    public final Context a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public a01(Context context) {
        this.a = context;
    }

    @Override // defpackage.fb5
    public final boolean a(n85 n85Var) {
        Uri uri = (Uri) n85Var.B;
        if ("content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && b.match(uri) != -1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    @Override // defpackage.fb5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.oi c(defpackage.n85 r4, int r5) {
        /*
            r3 = this;
            android.content.Context r3 = r3.a
            android.content.ContentResolver r3 = r3.getContentResolver()
            java.lang.Object r4 = r4.B
            android.net.Uri r4 = (android.net.Uri) r4
            android.content.UriMatcher r5 = defpackage.a01.b
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
            java.lang.String r3 = defpackage.wh1.i(r4, r3)
            defpackage.i.n(r3)
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
            oi r4 = new oi
            t13 r3 = defpackage.sn2.P(r3)
            ln4 r5 = defpackage.ln4.DISK
            r4.<init>(r3, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a01.c(n85, int):oi");
    }
}
