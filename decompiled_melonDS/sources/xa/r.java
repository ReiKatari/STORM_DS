package xa;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r extends ua.u {

    /* renamed from: b  reason: collision with root package name */
    public static final p f14507b = new p(0, new r(ua.r.LAZILY_PARSED_NUMBER));

    /* renamed from: a  reason: collision with root package name */
    public final ua.s f14508a;

    public r(ua.s sVar) {
        this.f14508a = sVar;
    }

    @Override // ua.u
    public final Object b(cb.a aVar) {
        cb.b d02 = aVar.d0();
        int i2 = q.f14506a[d02.ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                StringBuilder sb2 = new StringBuilder("Expecting number, got: ");
                sb2.append(d02);
                String B = aVar.B(false);
                sb2.append("; at path ");
                sb2.append(B);
                throw new RuntimeException(sb2.toString());
            }
            return this.f14508a.readNumber(aVar);
        }
        aVar.Z();
        return null;
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        cVar.X((Number) obj);
    }
}
