package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ol  reason: default package */
/* loaded from: classes.dex */
public final class ol extends s41 {
    public Iterator R;
    public ab5 X;
    public int Y;
    public int Z;
    public /* synthetic */ Object d0;
    public final /* synthetic */ pl e0;
    public int f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol(pl plVar, s41 s41Var) {
        super(s41Var);
        this.e0 = plVar;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.d0 = obj;
        this.f0 |= Integer.MIN_VALUE;
        Object E = this.e0.E(this);
        if (E == x61.COROUTINE_SUSPENDED) {
            return E;
        }
        return new hm5(E);
    }
}
