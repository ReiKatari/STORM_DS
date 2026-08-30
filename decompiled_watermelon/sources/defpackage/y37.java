package defpackage;

import android.content.Context;
import android.net.Uri;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y37  reason: default package */
/* loaded from: classes.dex */
public final class y37 {
    public final Context a;

    public y37(Context context) {
        this.a = context;
    }

    public final void a(Uri uri, nm4 nm4Var) {
        uri.getClass();
        nm4Var.getClass();
        this.a.getContentResolver().takePersistableUriPermission(uri, nm4Var.toFlags());
    }
}
