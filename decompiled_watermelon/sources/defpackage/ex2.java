package defpackage;

import android.widget.ImageView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ex2  reason: default package */
/* loaded from: classes.dex */
public final class ex2 {
    public final nn4 a;
    public final n85 b;
    public final o7 c;
    public final String d;
    public final ex2 e = this;
    public boolean f;
    public boolean g;
    public k91 h;

    public ex2(nn4 nn4Var, ImageView imageView, n85 n85Var, String str, k91 k91Var) {
        this.a = nn4Var;
        this.b = n85Var;
        this.c = new o7(this, imageView, nn4Var.h);
        this.d = str;
        this.h = k91Var;
    }

    public final Object a() {
        o7 o7Var = this.c;
        if (o7Var == null) {
            return null;
        }
        return o7Var.get();
    }
}
