package k7;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p extends r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8053a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8054b;

    public p(p8.x xVar) {
        xVar.getClass();
        this.f8054b = xVar;
    }

    @Override // k7.r
    public final void b(v7.b bVar) {
        int i2 = this.f8053a;
        bVar.getClass();
        switch (i2) {
            case 0:
                ((a2.c) this.f8054b).k(bVar);
                return;
            default:
                bVar.d();
                try {
                    StringBuilder sb2 = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
                    ((p8.x) this.f8054b).getClass();
                    sb2.append(System.currentTimeMillis() - 86400000);
                    sb2.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                    bVar.v(sb2.toString());
                    bVar.F();
                    return;
                } finally {
                    bVar.t();
                }
        }
    }

    public p(a2.c cVar) {
        this.f8054b = cVar;
    }
}
