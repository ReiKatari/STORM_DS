package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ot6  reason: default package */
/* loaded from: classes.dex */
public final class ot6 implements nf5 {
    public final long b;
    public final nf5 c;

    public ot6(long j, nf5 nf5Var) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        nl2.y("Timeout must be non-negative.", z);
        this.b = j;
        this.c = nf5Var;
    }

    @Override // defpackage.nf5
    public final mf5 a(wt wtVar) {
        mf5 a = this.c.a(wtVar);
        long j = this.b;
        if (j > 0 && wtVar.b >= j - a.a) {
            return mf5.d;
        }
        return a;
    }

    @Override // defpackage.nf5
    public final long b() {
        return this.b;
    }
}
