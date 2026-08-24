package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f53  reason: default package */
/* loaded from: classes.dex */
public final class f53 extends hw6 implements eo2 {
    public /* synthetic */ float X;

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((f53) q((r41) obj2, Float.valueOf(((Number) obj).floatValue()))).s(jg7.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [f53, hw6, r41] */
    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        ?? hw6Var = new hw6(2, r41Var);
        hw6Var.X = ((Number) obj).floatValue();
        return hw6Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        boolean z;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        if (this.X > RecyclerView.B1) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
