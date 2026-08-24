package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yj1  reason: default package */
/* loaded from: classes.dex */
public final class yj1 {
    public static final List b = hf.c0("zip", "7z", "rar", "tar");
    public final Context a;

    public yj1(Context context) {
        this.a = context;
    }

    public final xj1 a(Uri uri, sv4 sv4Var) {
        uri.getClass();
        sv4Var.getClass();
        qi6 h = zl1.h(this.a, uri);
        if (!h.e() && !h.a()) {
            return xj1.NOT_FOUND;
        }
        String i = h.i();
        if (i == null && (i = uri.getLastPathSegment()) == null) {
            i = "";
        }
        if (sv4Var == sv4.READ) {
            return xj1.OK;
        }
        if (h.l()) {
            return xj1.READ_ONLY;
        }
        String O0 = qs6.O0('.', i, "");
        if (O0.length() == 0) {
            return xj1.OK;
        }
        if (b.contains(O0)) {
            return xj1.READ_ONLY;
        }
        return xj1.OK;
    }
}
