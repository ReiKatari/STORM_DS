package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bv0  reason: default package */
/* loaded from: classes.dex */
public final class bv0 implements w37 {
    public final /* synthetic */ int a;
    public final Object b;

    public bv0(Context context, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = context;
                return;
            default:
                this.b = zt3.l0(new ti4("content", new bv0(context, 1)), new ti4("file", new Object()));
                return;
        }
    }

    @Override // defpackage.w37
    public final uh1 a(Uri uri) {
        int i = this.a;
        Object obj = this.b;
        uri.getClass();
        switch (i) {
            case 0:
                w37 w37Var = (w37) ((Map) obj).get(uri.getScheme());
                if (w37Var != null) {
                    return w37Var.a(uri);
                }
                return null;
            default:
                return uh1.g((Context) obj, uri);
        }
    }

    @Override // defpackage.w37
    public final uh1 b(Uri uri) {
        int i = this.a;
        Object obj = this.b;
        uri.getClass();
        switch (i) {
            case 0:
                w37 w37Var = (w37) ((Map) obj).get(uri.getScheme());
                if (w37Var != null) {
                    return w37Var.b(uri);
                }
                return null;
            default:
                return uh1.h((Context) obj, uri);
        }
    }

    @Override // defpackage.w37
    public final uh1 c(Uri uri) {
        switch (this.a) {
            case 0:
                w37 w37Var = (w37) ((Map) this.b).get(uri.getScheme());
                if (w37Var == null) {
                    return null;
                }
                return w37Var.c(uri);
            default:
                return null;
        }
    }

    @Override // defpackage.w37
    public final boolean d(Uri uri) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                w37 w37Var = (w37) ((Map) obj).get(uri.getScheme());
                if (w37Var == null || !w37Var.d(uri)) {
                    return false;
                }
                return true;
            default:
                if (!uh1.g((Context) obj, uri).e()) {
                    return false;
                }
                return true;
        }
    }
}
