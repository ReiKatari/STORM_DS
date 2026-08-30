package id;

import ed.r;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends r {
    public final /* synthetic */ AtomicReferenceArray X;

    public j(long j2, j jVar, int i2) {
        super(j2, jVar, i2);
        this.X = new AtomicReferenceArray(i.f7041f);
    }

    @Override // ed.r
    public final int g() {
        return i.f7041f;
    }

    @Override // ed.r
    public final void h(int i2, cc.g gVar) {
        this.X.set(i2, i.f7040e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.L + ", hashCode=" + hashCode() + ']';
    }
}
