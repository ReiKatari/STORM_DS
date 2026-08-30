package defpackage;

import me.magnum.melonds.debug.ReleaseStateCommandReceiver;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e95  reason: default package */
/* loaded from: classes.dex */
public final class e95 extends k11 {
    public VideoRenderer R;
    public int X;
    public int Y;
    public int Z;
    public /* synthetic */ Object c0;
    public final /* synthetic */ ReleaseStateCommandReceiver d0;
    public int e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e95(ReleaseStateCommandReceiver releaseStateCommandReceiver, k11 k11Var) {
        super(k11Var);
        this.d0 = releaseStateCommandReceiver;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        this.c0 = obj;
        this.e0 |= Integer.MIN_VALUE;
        g11 g11Var = ReleaseStateCommandReceiver.a;
        return this.d0.l(null, null, this);
    }
}
