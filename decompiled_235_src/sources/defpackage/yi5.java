package defpackage;

import me.magnum.melonds.debug.ReleaseStateCommandReceiver;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yi5  reason: default package */
/* loaded from: classes.dex */
public final class yi5 extends s41 {
    public VideoRenderer R;
    public int X;
    public int Y;
    public int Z;
    public long d0;
    public long e0;
    public long f0;
    public /* synthetic */ Object g0;
    public final /* synthetic */ ReleaseStateCommandReceiver h0;
    public int i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi5(ReleaseStateCommandReceiver releaseStateCommandReceiver, s41 s41Var) {
        super(s41Var);
        this.h0 = releaseStateCommandReceiver;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.g0 = obj;
        this.i0 |= Integer.MIN_VALUE;
        o41 o41Var = ReleaseStateCommandReceiver.a;
        return this.h0.s(null, 0, 0, 0L, this);
    }
}
