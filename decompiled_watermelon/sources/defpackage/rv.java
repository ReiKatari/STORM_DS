package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rv  reason: default package */
/* loaded from: classes.dex */
public final class rv implements ym6, q76 {
    public final /* synthetic */ tv a;

    public /* synthetic */ rv(tv tvVar) {
        this.a = tvVar;
    }

    @Override // defpackage.ym6
    public void a(Drawable drawable) {
        qi4 qi4Var;
        tv tvVar = this.a;
        if (drawable != null) {
            qi4Var = tvVar.j(drawable);
        } else {
            qi4Var = null;
        }
        tvVar.k(new nv(qi4Var));
    }

    @Override // defpackage.q76
    public Object c(b55 b55Var) {
        return se.u(new a7(this.a.Y, 4), b55Var);
    }
}
