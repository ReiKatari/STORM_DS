package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zu  reason: default package */
/* loaded from: classes.dex */
public final class zu extends fb5 {
    public final Context a;
    public final Object b = new Object();
    public AssetManager c;

    public zu(Context context) {
        this.a = context;
    }

    @Override // defpackage.fb5
    public final boolean a(n85 n85Var) {
        Uri uri = (Uri) n85Var.B;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    @Override // defpackage.fb5
    public final oi c(n85 n85Var, int i) {
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
        return new oi(sn2.P(this.c.open(((Uri) n85Var.B).toString().substring(22))), ln4.DISK);
    }
}
