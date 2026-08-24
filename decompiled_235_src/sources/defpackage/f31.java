package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.InputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f31  reason: default package */
/* loaded from: classes.dex */
public final class f31 extends xk5 {
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

    public f31(Context context) {
        this.a = context;
    }

    @Override // defpackage.xk5
    public final boolean a(m44 m44Var) {
        Uri uri = (Uri) m44Var.B;
        if ("content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && b.match(uri) != -1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    @Override // defpackage.xk5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final aj c(m44 m44Var, int i) {
        InputStream inputStream;
        ContentResolver contentResolver = this.a.getContentResolver();
        Uri uri = (Uri) m44Var.B;
        int match = b.match(uri);
        if (match != 1) {
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        i.m(xg6.n(uri, "Invalid uri: "));
                        return null;
                    }
                }
                inputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
                if (inputStream != null) {
                    return null;
                }
                return new aj(hi2.P(inputStream), qw4.DISK);
            }
            inputStream = contentResolver.openInputStream(uri);
            if (inputStream != null) {
            }
        } else {
            uri = ContactsContract.Contacts.lookupContact(contentResolver, uri);
            if (uri == null) {
                inputStream = null;
                if (inputStream != null) {
                }
            }
            inputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
            if (inputStream != null) {
            }
        }
    }
}
