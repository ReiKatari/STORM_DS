package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yz5  reason: default package */
/* loaded from: classes.dex */
public final class yz5 extends dy5 {
    public final /* synthetic */ AtomicReferenceArray Z;

    public yz5(long j, yz5 yz5Var, int i) {
        super(j, yz5Var, i);
        this.Z = new AtomicReferenceArray(xz5.f);
    }

    @Override // defpackage.dy5
    public final int l() {
        return xz5.f;
    }

    @Override // defpackage.dy5
    public final void m(int i, e31 e31Var) {
        this.Z.set(i, xz5.e);
        n();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.X + ", hashCode=" + hashCode() + ']';
    }
}
