package jg;

import cd.a0;
/* loaded from: classes.dex */
public final class q extends ec.c {
    public /* synthetic */ Object R;
    public int X;
    public final /* synthetic */ a0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a0 a0Var, cc.c cVar) {
        super(cVar);
        this.Y = a0Var;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.R = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a(null, this);
    }
}
