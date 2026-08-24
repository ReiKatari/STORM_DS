package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rv  reason: default package */
/* loaded from: classes.dex */
public final class rv extends xk5 {
    public final Context a;
    public final Object b = new Object();
    public AssetManager c;

    public rv(Context context) {
        this.a = context;
    }

    @Override // defpackage.xk5
    public final boolean a(m44 m44Var) {
        Uri uri = (Uri) m44Var.B;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    @Override // defpackage.xk5
    public final aj c(m44 m44Var, int i) {
        if (this.c == null) {
            synchronized (this.b) {
                try {
                    if (this.c == null) {
                        this.c = this.a.getAssets();
                    }
                } finally {
                }
            }
        }
        return new aj(hi2.P(this.c.open(((Uri) m44Var.B).toString().substring(22))), qw4.DISK);
    }
}
