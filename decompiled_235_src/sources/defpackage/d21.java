package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d21  reason: default package */
/* loaded from: classes.dex */
public final class d21 extends s41 {
    public /* synthetic */ Object R;
    public final /* synthetic */ ConstraintTrackingWorker X;
    public int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d21(ConstraintTrackingWorker constraintTrackingWorker, s41 s41Var) {
        super(s41Var);
        this.X = constraintTrackingWorker;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.R = obj;
        this.Y |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.g(this.X, null, null, null, this);
    }
}
