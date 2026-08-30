package com.squareup.picasso;

import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends f0 {

    /* renamed from: b  reason: collision with root package name */
    public static final UriMatcher f3215b;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3216a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f3215b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public g(Context context) {
        this.f3216a = context;
    }

    @Override // com.squareup.picasso.f0
    public final boolean a(a4.n nVar) {
        Uri uri = (Uri) nVar.B;
        if ("content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f3215b.match(uri) != -1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    @Override // com.squareup.picasso.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cd.h1 c(a4.n r5, int r6) {
        /*
            r4 = this;
            android.content.Context r6 = r4.f3216a
            android.content.ContentResolver r6 = r6.getContentResolver()
            java.lang.Object r5 = r5.B
            android.net.Uri r5 = (android.net.Uri) r5
            android.content.UriMatcher r0 = com.squareup.picasso.g.f3215b
            int r0 = r0.match(r5)
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L2e
            r3 = 2
            if (r0 == r3) goto L29
            r3 = 3
            if (r0 == r3) goto L36
            r2 = 4
            if (r0 != r2) goto L1e
            goto L29
        L1e:
            java.lang.String r6 = "Invalid uri: "
            java.lang.String r5 = kc.a.f(r6, r5)
            a0.j.p(r5)
            r5 = 0
            return r5
        L29:
            java.io.InputStream r5 = r6.openInputStream(r5)
            goto L3a
        L2e:
            android.net.Uri r5 = android.provider.ContactsContract.Contacts.lookupContact(r6, r5)
            if (r5 != 0) goto L36
            r5 = r1
            goto L3a
        L36:
            java.io.InputStream r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r6, r5, r2)
        L3a:
            if (r5 != 0) goto L3d
            return r1
        L3d:
            cd.h1 r6 = new cd.h1
            fj.r r5 = ij.a.w0(r5)
            com.squareup.picasso.y r0 = com.squareup.picasso.y.DISK
            r6.<init>(r5, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.g.c(a4.n, int):cd.h1");
    }
}
