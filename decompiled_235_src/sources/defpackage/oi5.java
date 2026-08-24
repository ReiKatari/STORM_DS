package defpackage;

import android.net.Uri;
import me.magnum.melonds.debug.ReleaseStateCommandReceiver;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oi5  reason: default package */
/* loaded from: classes.dex */
public final class oi5 extends s41 {
    public Uri R;
    public int X;
    public int Y;
    public boolean Z;
    public /* synthetic */ Object d0;
    public final /* synthetic */ ReleaseStateCommandReceiver e0;
    public int f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi5(ReleaseStateCommandReceiver releaseStateCommandReceiver, s41 s41Var) {
        super(s41Var);
        this.e0 = releaseStateCommandReceiver;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.d0 = obj;
        this.f0 |= Integer.MIN_VALUE;
        o41 o41Var = ReleaseStateCommandReceiver.a;
        return this.e0.g(null, null, this);
    }
}
