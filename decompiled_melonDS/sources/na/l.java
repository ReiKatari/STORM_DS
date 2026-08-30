package na;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l extends k0.d {
    @Override // k0.d
    public final void y(x xVar, float f8, float f10) {
        float f11 = f10 * f8;
        xVar.d(f11, 180.0f, 90.0f);
        float f12 = f11 * 2.0f;
        t tVar = new t(0.0f, 0.0f, f12, f12);
        tVar.f10234f = 180.0f;
        tVar.f10235g = 90.0f;
        xVar.f10246f.add(tVar);
        r rVar = new r(tVar);
        xVar.a(180.0f);
        xVar.f10247g.add(rVar);
        xVar.f10244d = 270.0f;
        float f13 = (0.0f + f12) * 0.5f;
        float f14 = (f12 - 0.0f) / 2.0f;
        double d4 = 270.0f;
        xVar.f10242b = (((float) Math.cos(Math.toRadians(d4))) * f14) + f13;
        xVar.f10243c = (f14 * ((float) Math.sin(Math.toRadians(d4)))) + f13;
    }
}
