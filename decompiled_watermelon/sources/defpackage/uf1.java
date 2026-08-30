package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uf1  reason: default package */
/* loaded from: classes.dex */
public final class uf1 {
    public static final List b = l07.c0("zip", "7z", "rar", "tar");
    public final Context a;

    public uf1(Context context) {
        this.a = context;
    }

    public final tf1 a(Uri uri, nm4 nm4Var) {
        uri.getClass();
        nm4Var.getClass();
        c76 h = uh1.h(this.a, uri);
        String i = h.i();
        if (i == null) {
            return tf1.NOT_FOUND;
        }
        if (nm4Var == nm4.READ) {
            return tf1.OK;
        }
        if (h.l()) {
            return tf1.READ_ONLY;
        }
        String U0 = zg6.U0('.', i, "");
        if (U0.length() == 0) {
            return tf1.OK;
        }
        if (b.contains(U0)) {
            return tf1.READ_ONLY;
        }
        return tf1.OK;
    }
}
