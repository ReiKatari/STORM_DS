package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qi6  reason: default package */
/* loaded from: classes.dex */
public final class qi6 extends zl1 {
    public final /* synthetic */ int a = 0;
    public Context b;
    public Uri c;

    public qi6(Context context, Uri uri) {
        this.b = context;
        this.c = uri;
    }

    @Override // defpackage.zl1
    public final boolean a() {
        switch (this.a) {
            case 0:
                Context context = this.b;
                Uri uri = this.c;
                if (context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(hv.U(context, uri, "mime_type"))) {
                    return true;
                }
                return false;
            default:
                Context context2 = this.b;
                Uri uri2 = this.c;
                if (context2.checkCallingOrSelfUriPermission(uri2, 1) == 0 && !TextUtils.isEmpty(hv.U(context2, uri2, "mime_type"))) {
                    return true;
                }
                return false;
        }
    }

    @Override // defpackage.zl1
    public final zl1 b(String str) {
        Uri uri;
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Context context = this.b;
                try {
                    uri = DocumentsContract.createDocument(context.getContentResolver(), this.c, "vnd.android.document/directory", str);
                } catch (Exception unused) {
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return new qi6(context, uri);
        }
    }

    @Override // defpackage.zl1
    public final zl1 c(String str, String str2) {
        Uri uri;
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Context context = this.b;
                try {
                    uri = DocumentsContract.createDocument(context.getContentResolver(), this.c, str, str2);
                } catch (Exception unused) {
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return new qi6(context, uri);
        }
    }

    @Override // defpackage.zl1
    public final boolean d() {
        switch (this.a) {
            case 0:
                try {
                    return DocumentsContract.deleteDocument(this.b.getContentResolver(), this.c);
                } catch (Exception unused) {
                    return false;
                }
            default:
                try {
                    return DocumentsContract.deleteDocument(this.b.getContentResolver(), this.c);
                } catch (Exception unused2) {
                    return false;
                }
        }
    }

    @Override // defpackage.zl1
    public final boolean e() {
        switch (this.a) {
            case 0:
                return hv.B(this.b, this.c);
            default:
                return hv.B(this.b, this.c);
        }
    }

    @Override // defpackage.zl1
    public final String i() {
        switch (this.a) {
            case 0:
                return hv.U(this.b, this.c, "_display_name");
            default:
                return hv.U(this.b, this.c, "_display_name");
        }
    }

    @Override // defpackage.zl1
    public final Uri j() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return this.c;
        }
    }

    @Override // defpackage.zl1
    public final boolean k() {
        switch (this.a) {
            case 0:
                return "vnd.android.document/directory".equals(hv.U(this.b, this.c, "mime_type"));
            default:
                return "vnd.android.document/directory".equals(hv.U(this.b, this.c, "mime_type"));
        }
    }

    @Override // defpackage.zl1
    public final boolean l() {
        switch (this.a) {
            case 0:
                String U = hv.U(this.b, this.c, "mime_type");
                if (!"vnd.android.document/directory".equals(U) && !TextUtils.isEmpty(U)) {
                    return true;
                }
                return false;
            default:
                String U2 = hv.U(this.b, this.c, "mime_type");
                if (!"vnd.android.document/directory".equals(U2) && !TextUtils.isEmpty(U2)) {
                    return true;
                }
                return false;
        }
    }

    @Override // defpackage.zl1
    public final long m() {
        switch (this.a) {
            case 0:
                return hv.T(this.b, this.c, "last_modified", 0L);
            default:
                return hv.T(this.b, this.c, "last_modified", 0L);
        }
    }

    @Override // defpackage.zl1
    public final long n() {
        switch (this.a) {
            case 0:
                return hv.T(this.b, this.c, "_size", 0L);
            default:
                return hv.T(this.b, this.c, "_size", 0L);
        }
    }

    @Override // defpackage.zl1
    public final zl1[] o() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Context context = this.b;
                ContentResolver contentResolver = context.getContentResolver();
                Uri uri = this.c;
                Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
                ArrayList arrayList = new ArrayList();
                Cursor cursor = null;
                try {
                    try {
                        cursor = contentResolver.query(buildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                        while (cursor.moveToNext()) {
                            arrayList.add(DocumentsContract.buildDocumentUriUsingTree(uri, cursor.getString(0)));
                        }
                        try {
                            lb1.v(cursor);
                        } catch (RuntimeException e) {
                            throw e;
                        }
                    } catch (Exception e2) {
                        Log.w("DocumentFile", "Failed query: " + e2);
                        if (cursor != null) {
                            try {
                                lb1.v(cursor);
                            } catch (RuntimeException e3) {
                                throw e3;
                            }
                        }
                    }
                    Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[0]);
                    zl1[] zl1VarArr = new zl1[uriArr.length];
                    for (int i = 0; i < uriArr.length; i++) {
                        zl1VarArr[i] = new qi6(context, uriArr[i]);
                    }
                    return zl1VarArr;
                } catch (Throwable th) {
                    if (cursor != null) {
                        try {
                            lb1.v(cursor);
                        } catch (RuntimeException e4) {
                            throw e4;
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
        }
    }

    public /* synthetic */ qi6() {
    }
}
