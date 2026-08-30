package defpackage;

import android.content.Context;
import me.magnum.melonds.debug.ReleaseStateCommandReceiver;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h95  reason: default package */
/* loaded from: classes.dex */
public final class h95 extends k11 {
    public Context R;
    public long X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ReleaseStateCommandReceiver Z;
    public int c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h95(ReleaseStateCommandReceiver releaseStateCommandReceiver, k11 k11Var) {
        super(k11Var);
        this.Z = releaseStateCommandReceiver;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        this.Y = obj;
        this.c0 |= Integer.MIN_VALUE;
        g11 g11Var = ReleaseStateCommandReceiver.a;
        return this.Z.p(null, null, this);
    }
}
