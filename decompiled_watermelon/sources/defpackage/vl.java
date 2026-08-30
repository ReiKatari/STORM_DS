package defpackage;

import android.view.ActionMode;
import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vl  reason: default package */
/* loaded from: classes.dex */
public final class vl implements jo6 {
    public final View a;
    public final mi2 b;
    public final ki2 c;
    public final x24 d = new x24();
    public final bb6 e = new bb6(new ql(this, 0));
    public final ql f = new ql(this, 1);
    public final ql g = new ql(this, 2);
    public ActionMode h;
    public u i;
    public Runnable j;

    public vl(View view, mi2 mi2Var, ki2 ki2Var) {
        this.a = view;
        this.b = mi2Var;
        this.c = ki2Var;
    }

    @Override // defpackage.jo6
    public final Object a(ao6 ao6Var, nk6 nk6Var) {
        Object b = x24.b(this.d, new kc(this, ao6Var, null, 1), nk6Var);
        if (b == p31.COROUTINE_SUSPENDED) {
            return b;
        }
        return o27.a;
    }
}
