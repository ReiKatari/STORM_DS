package defpackage;

import me.magnum.melonds.debug.ReleaseStateCommandReceiver;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ui5  reason: default package */
/* loaded from: classes.dex */
public final class ui5 extends s41 {
    public int R;
    public int X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ ReleaseStateCommandReceiver d0;
    public int e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui5(ReleaseStateCommandReceiver releaseStateCommandReceiver, s41 s41Var) {
        super(s41Var);
        this.d0 = releaseStateCommandReceiver;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.Z = obj;
        this.e0 |= Integer.MIN_VALUE;
        o41 o41Var = ReleaseStateCommandReceiver.a;
        return this.d0.m(null, this);
    }
}
