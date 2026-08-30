package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uh1  reason: default package */
/* loaded from: classes.dex */
public abstract class uh1 {
    public static c76 g(Context context, Uri uri) {
        c76 c76Var = new c76();
        c76Var.b = context;
        c76Var.c = uri;
        return c76Var;
    }

    public static c76 h(Context context, Uri uri) {
        String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
        if (DocumentsContract.isDocumentUri(context, uri)) {
            treeDocumentId = DocumentsContract.getDocumentId(uri);
        }
        if (treeDocumentId != null) {
            Uri buildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, treeDocumentId);
            if (buildDocumentUriUsingTree != null) {
                return new c76(context, buildDocumentUriUsingTree);
            }
            c44.i(wh1.i(uri, "Failed to build documentUri from a tree: "));
            return null;
        }
        i.i(wh1.i(uri, "Could not get document ID from Uri: "));
        return null;
    }

    public abstract boolean a();

    public abstract uh1 b(String str);

    public abstract uh1 c(String str, String str2);

    public abstract boolean d();

    public abstract boolean e();

    public final uh1 f(String str) {
        uh1[] o;
        for (uh1 uh1Var : o()) {
            if (str.equals(uh1Var.i())) {
                return uh1Var;
            }
        }
        return null;
    }

    public abstract String i();

    public abstract Uri j();

    public abstract boolean k();

    public abstract boolean l();

    public abstract long m();

    public abstract long n();

    public abstract uh1[] o();
}
