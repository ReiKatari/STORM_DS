package defpackage;

import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f16  reason: default package */
/* loaded from: classes.dex */
public final class f16 extends s41 {
    public Cheat R;
    public /* synthetic */ Object X;
    public final /* synthetic */ h16 Y;
    public int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f16(h16 h16Var, s41 s41Var) {
        super(s41Var);
        this.Y = h16Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.m(null, this);
    }
}
