package k6;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import w.d;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7985a = 0;

    /* renamed from: b  reason: collision with root package name */
    public Context f7986b;

    /* renamed from: c  reason: collision with root package name */
    public Uri f7987c;

    public c(Context context, Uri uri) {
        this.f7986b = context;
        this.f7987c = uri;
    }

    @Override // k6.a
    public final a a(String str, String str2) {
        Uri uri;
        switch (this.f7985a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Context context = this.f7986b;
                try {
                    uri = DocumentsContract.createDocument(context.getContentResolver(), this.f7987c, str, str2);
                } catch (Exception unused) {
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return new c(context, uri);
        }
    }

    @Override // k6.a
    public final boolean b() {
        switch (this.f7985a) {
            case 0:
                try {
                    return DocumentsContract.deleteDocument(this.f7986b.getContentResolver(), this.f7987c);
                } catch (Exception unused) {
                    return false;
                }
            default:
                try {
                    return DocumentsContract.deleteDocument(this.f7986b.getContentResolver(), this.f7987c);
                } catch (Exception unused2) {
                    return false;
                }
        }
    }

    @Override // k6.a
    public final String f() {
        switch (this.f7985a) {
            case 0:
                return pc.a.I(this.f7986b, this.f7987c, "_display_name");
            default:
                return pc.a.I(this.f7986b, this.f7987c, "_display_name");
        }
    }

    @Override // k6.a
    public final Uri g() {
        switch (this.f7985a) {
            case 0:
                return this.f7987c;
            default:
                return this.f7987c;
        }
    }

    @Override // k6.a
    public final boolean h() {
        switch (this.f7985a) {
            case 0:
                return "vnd.android.document/directory".equals(pc.a.I(this.f7986b, this.f7987c, "mime_type"));
            default:
                return "vnd.android.document/directory".equals(pc.a.I(this.f7986b, this.f7987c, "mime_type"));
        }
    }

    @Override // k6.a
    public final boolean i() {
        switch (this.f7985a) {
            case 0:
                String I = pc.a.I(this.f7986b, this.f7987c, "mime_type");
                if (!"vnd.android.document/directory".equals(I) && !TextUtils.isEmpty(I)) {
                    return true;
                }
                return false;
            default:
                String I2 = pc.a.I(this.f7986b, this.f7987c, "mime_type");
                if (!"vnd.android.document/directory".equals(I2) && !TextUtils.isEmpty(I2)) {
                    return true;
                }
                return false;
        }
    }

    @Override // k6.a
    public final long j() {
        switch (this.f7985a) {
            case 0:
                return pc.a.H(this.f7986b, this.f7987c, "last_modified");
            default:
                return pc.a.H(this.f7986b, this.f7987c, "last_modified");
        }
    }

    @Override // k6.a
    public final a[] k() {
        switch (this.f7985a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Context context = this.f7986b;
                ContentResolver contentResolver = context.getContentResolver();
                Uri uri = this.f7987c;
                Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
                ArrayList arrayList = new ArrayList();
                Cursor cursor = null;
                try {
                    try {
                        try {
                            cursor = contentResolver.query(buildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                            while (cursor.moveToNext()) {
                                arrayList.add(DocumentsContract.buildDocumentUriUsingTree(uri, cursor.getString(0)));
                            }
                        } catch (Exception e6) {
                            Log.w("DocumentFile", "Failed query: " + e6);
                            if (cursor != null) {
                                try {
                                    d.z(cursor);
                                } catch (RuntimeException e10) {
                                    throw e10;
                                }
                            }
                        }
                        try {
                            d.z(cursor);
                        } catch (RuntimeException e11) {
                            throw e11;
                        }
                    } catch (Throwable th2) {
                        if (cursor != null) {
                            try {
                                d.z(cursor);
                            } catch (RuntimeException e12) {
                                throw e12;
                            } catch (Exception unused) {
                            }
                        }
                        throw th2;
                    }
                } catch (Exception unused2) {
                }
                Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[0]);
                a[] aVarArr = new a[uriArr.length];
                for (int i2 = 0; i2 < uriArr.length; i2++) {
                    aVarArr[i2] = new c(context, uriArr[i2]);
                }
                return aVarArr;
        }
    }

    public /* synthetic */ c() {
    }
}
