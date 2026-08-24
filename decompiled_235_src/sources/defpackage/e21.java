package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e21  reason: default package */
/* loaded from: classes.dex */
public final class e21 extends s41 {
    public nx3 R;
    public /* synthetic */ Object X;
    public final /* synthetic */ ConstraintTrackingWorker Y;
    public int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e21(ConstraintTrackingWorker constraintTrackingWorker, s41 s41Var) {
        super(s41Var);
        this.Y = constraintTrackingWorker;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.h(this.Y, this);
    }
}
