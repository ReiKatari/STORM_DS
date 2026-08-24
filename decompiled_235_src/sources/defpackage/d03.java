package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d03  reason: default package */
/* loaded from: classes.dex */
public final class d03 implements ka2 {
    public final ex6 a;
    public final ex6 b;
    public final boolean c;

    public d03(ex6 ex6Var, ex6 ex6Var2, boolean z) {
        this.a = ex6Var;
        this.b = ex6Var2;
        this.c = z;
    }

    @Override // defpackage.ka2
    public final la2 a(Object obj, fo4 fo4Var, pe5 pe5Var) {
        Uri uri = (Uri) obj;
        if (!nb3.k(uri.getScheme(), "http") && !nb3.k(uri.getScheme(), "https")) {
            return null;
        }
        return new g03(uri.toString(), fo4Var, this.a, this.b, this.c);
    }
}
