package mh;
/* loaded from: classes.dex */
public final class d0 extends ec.c {
    public /* synthetic */ Object R;
    public int X;
    public final /* synthetic */ a9.h Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(a9.h hVar, cc.c cVar) {
        super(cVar);
        this.Y = hVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.R = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a(null, this);
    }
}
