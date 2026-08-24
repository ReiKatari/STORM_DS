package defpackage;

import android.view.ActionMode;
import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hm  reason: default package */
/* loaded from: classes.dex */
public final class hm implements u07 {
    public final View a;
    public final qn2 b;
    public final on2 c;
    public final db4 d = new db4();
    public final qm6 e = new qm6(new cm(this, 0));
    public final cm f = new cm(this, 1);
    public final cm g = new cm(this, 2);
    public ActionMode h;
    public v i;
    public Runnable j;

    public hm(View view, qn2 qn2Var, on2 on2Var) {
        this.a = view;
        this.b = qn2Var;
        this.c = on2Var;
    }

    @Override // defpackage.u07
    public final Object a(m07 m07Var, hw6 hw6Var) {
        Object b = db4.b(this.d, new yc(this, m07Var, null, 1), hw6Var);
        if (b == x61.COROUTINE_SUSPENDED) {
            return b;
        }
        return jg7.a;
    }
}
