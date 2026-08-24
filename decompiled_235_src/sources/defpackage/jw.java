package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jw  reason: default package */
/* loaded from: classes.dex */
public final class jw implements iz6, fj6 {
    public final /* synthetic */ lw a;

    public /* synthetic */ jw(lw lwVar) {
        this.a = lwVar;
    }

    @Override // defpackage.iz6
    public void a(Drawable drawable) {
        sr4 sr4Var;
        lw lwVar = this.a;
        if (drawable != null) {
            sr4Var = lwVar.j(drawable);
        } else {
            sr4Var = null;
        }
        lwVar.k(new fw(sr4Var));
    }

    @Override // defpackage.fj6
    public Object e(oe5 oe5Var) {
        return f04.B(new b7(this.a.Y, 4), oe5Var);
    }
}
