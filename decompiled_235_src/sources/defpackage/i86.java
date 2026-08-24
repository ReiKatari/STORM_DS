package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i86  reason: default package */
/* loaded from: classes.dex */
public final class i86 implements p76 {
    public final /* synthetic */ m86 a;
    public final /* synthetic */ k86 b;

    public i86(m86 m86Var, k86 k86Var) {
        this.a = m86Var;
        this.b = k86Var;
    }

    @Override // defpackage.p76
    public final float a(float f) {
        int i = (Math.abs(f) > RecyclerView.B1 ? 1 : (Math.abs(f) == RecyclerView.B1 ? 0 : -1));
        m86 m86Var = this.a;
        if (i == 0 || ((Boolean) m86Var.h.c()).booleanValue()) {
            return m86Var.d(m86Var.g(this.b.a(2, m86Var.e(m86Var.h(f)))));
        }
        throw new tx4("The fling animation was cancelled", 0);
    }
}
