package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zy0  reason: default package */
/* loaded from: classes.dex */
public final class zy0 extends k11 {
    public mq3 R;
    public /* synthetic */ Object X;
    public final /* synthetic */ ConstraintTrackingWorker Y;
    public int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy0(ConstraintTrackingWorker constraintTrackingWorker, k11 k11Var) {
        super(k11Var);
        this.Y = constraintTrackingWorker;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.h(this.Y, this);
    }
}
