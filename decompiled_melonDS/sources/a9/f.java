package a9;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import p8.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends ec.c {
    public u R;
    public /* synthetic */ Object X;
    public final /* synthetic */ ConstraintTrackingWorker Y;
    public int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ConstraintTrackingWorker constraintTrackingWorker, ec.c cVar) {
        super(cVar);
        this.Y = constraintTrackingWorker;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.f(this.Y, this);
    }
}
