package defpackage;

import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ma3  reason: default package */
/* loaded from: classes.dex */
public final class ma3 extends s41 {
    public UUID R;
    public /* synthetic */ Object X;
    public final /* synthetic */ wa3 Y;
    public int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma3(wa3 wa3Var, s41 s41Var) {
        super(s41Var);
        this.Y = wa3Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.d(null, this);
    }
}
