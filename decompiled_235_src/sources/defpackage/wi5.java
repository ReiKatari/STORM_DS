package defpackage;

import android.content.Context;
import me.magnum.melonds.debug.ReleaseStateCommandReceiver;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wi5  reason: default package */
/* loaded from: classes.dex */
public final class wi5 extends s41 {
    public Context R;
    public long X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ReleaseStateCommandReceiver Z;
    public int d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi5(ReleaseStateCommandReceiver releaseStateCommandReceiver, s41 s41Var) {
        super(s41Var);
        this.Z = releaseStateCommandReceiver;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.Y = obj;
        this.d0 |= Integer.MIN_VALUE;
        o41 o41Var = ReleaseStateCommandReceiver.a;
        return this.Z.p(null, null, this);
    }
}
