package cd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f1 extends dd.d {

    /* renamed from: a  reason: collision with root package name */
    public long f2829a;

    /* renamed from: b  reason: collision with root package name */
    public zc.h f2830b;

    @Override // dd.d
    public final boolean a(dd.b bVar) {
        e1 e1Var = (e1) bVar;
        if (this.f2829a >= 0) {
            return false;
        }
        long j2 = e1Var.f2825c0;
        if (j2 < e1Var.f2826d0) {
            e1Var.f2826d0 = j2;
        }
        this.f2829a = j2;
        return true;
    }

    @Override // dd.d
    public final cc.c[] b(dd.b bVar) {
        long j2 = this.f2829a;
        this.f2829a = -1L;
        this.f2830b = null;
        return ((e1) bVar).w(j2);
    }
}
