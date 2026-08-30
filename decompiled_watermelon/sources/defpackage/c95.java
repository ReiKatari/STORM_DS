package defpackage;

import android.content.Intent;
import me.magnum.melonds.debug.ReleaseStateCommandReceiver;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c95  reason: default package */
/* loaded from: classes.dex */
public final class c95 extends k11 {
    public Intent R;
    public /* synthetic */ Object X;
    public final /* synthetic */ ReleaseStateCommandReceiver Y;
    public int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c95(ReleaseStateCommandReceiver releaseStateCommandReceiver, k11 k11Var) {
        super(k11Var);
        this.Y = releaseStateCommandReceiver;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        g11 g11Var = ReleaseStateCommandReceiver.a;
        return this.Y.j(null, null, null, this);
    }
}
