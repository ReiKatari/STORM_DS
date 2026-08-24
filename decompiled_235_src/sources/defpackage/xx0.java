package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xx0  reason: default package */
/* loaded from: classes.dex */
public final class xx0 implements uh7 {
    public final /* synthetic */ int a;
    public final Object b;

    public xx0(Context context, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = context;
                return;
            default:
                this.b = c14.m0(new vr4("content", new xx0(context, 1)), new vr4("file", new Object()));
                return;
        }
    }

    @Override // defpackage.uh7
    public final zl1 a(Uri uri) {
        zl1 a;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                uri.getClass();
                String scheme = uri.getScheme();
                if (scheme == null) {
                    scheme = "file";
                }
                uh7 uh7Var = (uh7) map.get(scheme);
                if (uh7Var == null || (a = uh7Var.a(uri)) == null) {
                    uh7 uh7Var2 = (uh7) map.get("file");
                    if (uh7Var2 != null) {
                        return uh7Var2.a(uri);
                    }
                    return null;
                }
                return a;
            default:
                uri.getClass();
                return zl1.g((Context) obj, uri);
        }
    }

    @Override // defpackage.uh7
    public final zl1 b(Uri uri) {
        zl1 b;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                uri.getClass();
                String scheme = uri.getScheme();
                if (scheme == null) {
                    scheme = "file";
                }
                uh7 uh7Var = (uh7) map.get(scheme);
                if (uh7Var == null || (b = uh7Var.b(uri)) == null) {
                    uh7 uh7Var2 = (uh7) map.get("file");
                    if (uh7Var2 != null) {
                        return uh7Var2.b(uri);
                    }
                    return null;
                }
                return b;
            default:
                uri.getClass();
                return zl1.h((Context) obj, uri);
        }
    }

    @Override // defpackage.uh7
    public final zl1 c(Uri uri) {
        zl1 c;
        switch (this.a) {
            case 0:
                Map map = (Map) this.b;
                String scheme = uri.getScheme();
                if (scheme == null) {
                    scheme = "file";
                }
                uh7 uh7Var = (uh7) map.get(scheme);
                if (uh7Var != null && (c = uh7Var.c(uri)) != null) {
                    return c;
                }
                uh7 uh7Var2 = (uh7) map.get("file");
                if (uh7Var2 == null) {
                    return null;
                }
                return uh7Var2.c(uri);
            default:
                return null;
        }
    }

    @Override // defpackage.uh7
    public final boolean d(Uri uri) {
        Boolean bool;
        boolean d;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                String scheme = uri.getScheme();
                if (scheme == null) {
                    scheme = "file";
                }
                uh7 uh7Var = (uh7) map.get(scheme);
                if (uh7Var != null) {
                    d = uh7Var.d(uri);
                } else {
                    uh7 uh7Var2 = (uh7) map.get("file");
                    if (uh7Var2 != null) {
                        d = uh7Var2.d(uri);
                    } else {
                        bool = null;
                        return nb3.k(bool, Boolean.TRUE);
                    }
                }
                bool = Boolean.valueOf(d);
                return nb3.k(bool, Boolean.TRUE);
            default:
                if (zl1.g((Context) obj, uri).e()) {
                    return true;
                }
                return false;
        }
    }
}
