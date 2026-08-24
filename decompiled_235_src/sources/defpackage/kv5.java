package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kv5  reason: default package */
/* loaded from: classes.dex */
public final class kv5 extends s41 {
    public Map R;
    public /* synthetic */ Object X;
    public final /* synthetic */ qv5 Y;
    public int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv5(qv5 qv5Var, s41 s41Var) {
        super(s41Var);
        this.Y = qv5Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.e(null, null, this);
    }
}
