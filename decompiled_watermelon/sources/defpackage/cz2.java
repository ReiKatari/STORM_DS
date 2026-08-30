package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cz2  reason: default package */
/* loaded from: classes.dex */
public final class cz2 extends nk6 implements aj2 {
    public /* synthetic */ float X;

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((cz2) t((j11) obj2, Float.valueOf(((Number) obj).floatValue()))).v(o27.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [nk6, cz2, j11] */
    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        ?? nk6Var = new nk6(2, j11Var);
        nk6Var.X = ((Number) obj).floatValue();
        return nk6Var;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        boolean z;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        me2.a0(obj);
        if (this.X > RecyclerView.A1) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
