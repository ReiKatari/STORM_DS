package androidx.fragment.app;

import android.os.Bundle;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements q7.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1344a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1345b;

    public /* synthetic */ k0(int i2, Object obj) {
        this.f1344a = i2;
        this.f1345b = obj;
    }

    @Override // q7.c
    public final Bundle a() {
        switch (this.f1344a) {
            case 0:
                l.i iVar = (l.i) this.f1345b;
                do {
                } while (o0.u(iVar.t(), androidx.lifecycle.q.CREATED));
                iVar.p0.f(androidx.lifecycle.p.ON_STOP);
                return new Bundle();
            default:
                return ((g1) this.f1345b).W();
        }
    }
}
