package androidx.lifecycle;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public q f1499a;

    /* renamed from: b  reason: collision with root package name */
    public v f1500b;

    public final void a(x xVar, p pVar) {
        q targetState = pVar.getTargetState();
        q qVar = this.f1499a;
        qVar.getClass();
        if (targetState != null && targetState.compareTo(qVar) < 0) {
            qVar = targetState;
        }
        this.f1499a = qVar;
        this.f1500b.d(xVar, pVar);
        this.f1499a = targetState;
    }
}
