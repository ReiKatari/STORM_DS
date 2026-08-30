package k6;

import a0.j;
import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import m9.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a {
    public static c d(Context context, Uri uri) {
        c cVar = new c();
        cVar.f7986b = context;
        cVar.f7987c = uri;
        return cVar;
    }

    public static c e(Context context, Uri uri) {
        String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
        if (DocumentsContract.isDocumentUri(context, uri)) {
            treeDocumentId = DocumentsContract.getDocumentId(uri);
        }
        if (treeDocumentId != null) {
            Uri buildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, treeDocumentId);
            if (buildDocumentUriUsingTree != null) {
                return new c(context, buildDocumentUriUsingTree);
            }
            o.i(kc.a.f("Failed to build documentUri from a tree: ", uri));
            return null;
        }
        j.h(kc.a.f("Could not get document ID from Uri: ", uri));
        return null;
    }

    public abstract a a(String str, String str2);

    public abstract boolean b();

    public final a c(String str) {
        a[] k10;
        for (a aVar : k()) {
            if (str.equals(aVar.f())) {
                return aVar;
            }
        }
        return null;
    }

    public abstract String f();

    public abstract Uri g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract long j();

    public abstract a[] k();
}
