package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yn7  reason: default package */
/* loaded from: classes.dex */
public abstract class yn7 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static t31 b(View view, t31 t31Var) {
        ContentInfo G = t31Var.a.G();
        Objects.requireNonNull(G);
        ContentInfo performReceiveContent = view.performReceiveContent(G);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == G) {
            return t31Var;
        }
        return new t31(new os0(performReceiveContent));
    }
}
