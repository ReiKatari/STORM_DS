package defpackage;

import android.widget.ImageView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i33  reason: default package */
/* loaded from: classes.dex */
public final class i33 {
    public final sw4 a;
    public final m44 b;
    public final p7 c;
    public final String d;
    public final i33 e = this;
    public boolean f;
    public boolean g;
    public yc1 h;

    public i33(sw4 sw4Var, ImageView imageView, m44 m44Var, String str, yc1 yc1Var) {
        this.a = sw4Var;
        this.b = m44Var;
        this.c = new p7(this, imageView, sw4Var.h);
        this.d = str;
        this.h = yc1Var;
    }

    public final Object a() {
        p7 p7Var = this.c;
        if (p7Var == null) {
            return null;
        }
        return p7Var.get();
    }
}
