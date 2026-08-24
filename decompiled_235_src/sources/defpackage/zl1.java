package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zl1  reason: default package */
/* loaded from: classes.dex */
public abstract class zl1 {
    public static qi6 g(Context context, Uri uri) {
        qi6 qi6Var = new qi6();
        qi6Var.b = context;
        qi6Var.c = uri;
        return qi6Var;
    }

    public static qi6 h(Context context, Uri uri) {
        String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
        if (DocumentsContract.isDocumentUri(context, uri)) {
            treeDocumentId = DocumentsContract.getDocumentId(uri);
        }
        if (treeDocumentId != null) {
            Uri buildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, treeDocumentId);
            if (buildDocumentUriUsingTree != null) {
                return new qi6(context, buildDocumentUriUsingTree);
            }
            u34.x(xg6.n(uri, "Failed to build documentUri from a tree: "));
            return null;
        }
        i.h(xg6.n(uri, "Could not get document ID from Uri: "));
        return null;
    }

    public abstract boolean a();

    public abstract zl1 b(String str);

    public abstract zl1 c(String str, String str2);

    public abstract boolean d();

    public abstract boolean e();

    public final zl1 f(String str) {
        zl1[] o;
        for (zl1 zl1Var : o()) {
            if (str.equals(zl1Var.i())) {
                return zl1Var;
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

    public abstract zl1[] o();
}
