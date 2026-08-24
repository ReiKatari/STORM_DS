package defpackage;

import android.content.Intent;
import me.magnum.melonds.debug.ReleaseStateCommandReceiver;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ri5  reason: default package */
/* loaded from: classes.dex */
public final class ri5 extends s41 {
    public Intent R;
    public /* synthetic */ Object X;
    public final /* synthetic */ ReleaseStateCommandReceiver Y;
    public int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri5(ReleaseStateCommandReceiver releaseStateCommandReceiver, s41 s41Var) {
        super(s41Var);
        this.Y = releaseStateCommandReceiver;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        o41 o41Var = ReleaseStateCommandReceiver.a;
        return this.Y.j(null, null, null, this);
    }
}
