package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hi5  reason: default package */
/* loaded from: classes.dex */
public final class hi5 extends s41 {
    public /* synthetic */ Object R;
    public final /* synthetic */ fy2 X;
    public int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi5(fy2 fy2Var, s41 s41Var) {
        super(s41Var);
        this.X = fy2Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.R = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.b(RecyclerView.B1, this);
    }
}
