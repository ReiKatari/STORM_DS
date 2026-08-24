package defpackage;

import android.content.Context;
import android.net.Uri;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wh7  reason: default package */
/* loaded from: classes.dex */
public final class wh7 {
    public final Context a;

    public wh7(Context context) {
        this.a = context;
    }

    public final void a(Uri uri, sv4 sv4Var) {
        uri.getClass();
        sv4Var.getClass();
        try {
            this.a.getContentResolver().takePersistableUriPermission(uri, sv4Var.toFlags());
        } catch (Throwable unused) {
        }
    }
}
