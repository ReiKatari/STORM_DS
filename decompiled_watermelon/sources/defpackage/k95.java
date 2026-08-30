package defpackage;

import me.magnum.melonds.debug.ReleaseStateCommandReceiver;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k95  reason: default package */
/* loaded from: classes.dex */
public final class k95 extends k11 {
    public int R;
    public long X;
    public long Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ ReleaseStateCommandReceiver c0;
    public int d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k95(ReleaseStateCommandReceiver releaseStateCommandReceiver, k11 k11Var) {
        super(k11Var);
        this.c0 = releaseStateCommandReceiver;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        this.Z = obj;
        this.d0 |= Integer.MIN_VALUE;
        g11 g11Var = ReleaseStateCommandReceiver.a;
        return this.c0.t(null, 0, 0L, this);
    }
}
