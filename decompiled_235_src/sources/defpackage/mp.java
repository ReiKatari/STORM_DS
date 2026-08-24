package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Locale;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mp  reason: default package */
/* loaded from: classes.dex */
public final class mp {
    public final Context a;
    public final Map b;

    public mp(Context context, uh7 uh7Var, ud4 ud4Var) {
        this.a = context;
        vd4 vd4Var = new vd4(context, uh7Var);
        this.b = c14.m0(new vr4("nds", vd4Var), new vr4("dsi", vd4Var), new vr4("ids", vd4Var), new vr4("zip", new ny0(context, uh7Var, ud4Var)), new vr4("7z", new vd6(context, uh7Var, ud4Var)), new vr4("rar", new ny0(context, uh7Var, ud4Var)));
    }

    public final pw5 a(zl1 zl1Var) {
        String i = zl1Var.i();
        if (i == null && (i = zl1Var.j().getLastPathSegment()) == null) {
            return null;
        }
        return c(i);
    }

    public final pw5 b(Uri uri) {
        uri.getClass();
        String i = zl1.g(this.a, uri).i();
        if (i == null && (i = uri.getLastPathSegment()) == null) {
            return null;
        }
        return c(i);
    }

    public final pw5 c(String str) {
        str.getClass();
        int x0 = qs6.x0('.', 0, 6, str);
        if (x0 < 0) {
            return null;
        }
        String lowerCase = str.substring(x0 + 1).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return (pw5) this.b.get(lowerCase);
    }
}
