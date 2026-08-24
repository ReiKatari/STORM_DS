package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nb6  reason: default package */
/* loaded from: classes.dex */
public final class nb6 extends p96 {
    public final /* synthetic */ AtomicReferenceArray Z;

    public nb6(long j, nb6 nb6Var, int i) {
        super(j, nb6Var, i);
        this.Z = new AtomicReferenceArray(mb6.f);
    }

    @Override // defpackage.p96
    public final int l() {
        return mb6.f;
    }

    @Override // defpackage.p96
    public final void m(int i, l61 l61Var) {
        this.Z.set(i, mb6.e);
        n();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.X + ", hashCode=" + hashCode() + ']';
    }
}
