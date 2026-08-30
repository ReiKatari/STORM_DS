package defpackage;

import me.magnum.melonds.common.workers.RetroArchShaderInstallWorker;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ve5  reason: default package */
/* loaded from: classes.dex */
public final class ve5 extends k11 {
    public /* synthetic */ Object R;
    public final /* synthetic */ RetroArchShaderInstallWorker X;
    public int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve5(RetroArchShaderInstallWorker retroArchShaderInstallWorker, k11 k11Var) {
        super(k11Var);
        this.X = retroArchShaderInstallWorker;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        this.R = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.e(this);
    }
}
