package be;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import me.magnum.melonds.common.camera.DSiCameraSource;
import yb.j;
import zb.v;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2195a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2196b;

    public a(Context context, int i2) {
        this.f2195a = i2;
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.f2196b = context;
                return;
            default:
                this.f2196b = v.F(new j("content", new a(context, 1)), new j("file", new Object()));
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    @Override // be.c
    public final k6.a a(Uri uri) {
        int i2 = this.f2195a;
        uri.getClass();
        switch (i2) {
            case 0:
                c cVar = (c) this.f2196b.get(uri.getScheme());
                if (cVar != null) {
                    return cVar.a(uri);
                }
                return null;
            default:
                return k6.a.d((Context) this.f2196b, uri);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    @Override // be.c
    public final k6.a b(Uri uri) {
        int i2 = this.f2195a;
        uri.getClass();
        switch (i2) {
            case 0:
                c cVar = (c) this.f2196b.get(uri.getScheme());
                if (cVar != null) {
                    return cVar.b(uri);
                }
                return null;
            default:
                return k6.a.e((Context) this.f2196b, uri);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    @Override // be.c
    public final k6.a c(Uri uri) {
        int i2 = this.f2195a;
        uri.getClass();
        switch (i2) {
            case 0:
                c cVar = (c) this.f2196b.get(uri.getScheme());
                if (cVar != null) {
                    return cVar.c(uri);
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    @Override // be.c
    public final boolean d(Uri uri) {
        boolean z10;
        int i2 = this.f2195a;
        uri.getClass();
        switch (i2) {
            case 0:
                c cVar = (c) this.f2196b.get(uri.getScheme());
                if (cVar != null && cVar.d(uri)) {
                    return true;
                }
                return false;
            default:
                k6.c d4 = k6.a.d((Context) this.f2196b, uri);
                Cursor cursor = null;
                try {
                    try {
                        cursor = d4.f7986b.getContentResolver().query(d4.f7987c, new String[]{"document_id"}, null, null, null);
                        if (cursor.getCount() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } catch (Exception e6) {
                        Log.w("DocumentFile", "Failed query: " + e6);
                        pc.a.l(cursor);
                        z10 = false;
                    }
                    if (z10) {
                        return true;
                    }
                    return false;
                } finally {
                    pc.a.l(cursor);
                }
        }
    }
}
