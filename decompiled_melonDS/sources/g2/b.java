package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends ec.j implements mc.p {
    public final /* synthetic */ int X = 0;
    public int Y;
    public /* synthetic */ float Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ Object f5045b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n nVar, float f8, cc.c cVar) {
        super(2, cVar);
        this.f5045b0 = nVar;
        this.Z = f8;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                return ((b) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            default:
                return ((b) t((cc.c) obj2, Float.valueOf(((Number) obj).floatValue()))).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new b((n) this.f5045b0, this.Z, cVar);
            default:
                b bVar = new b((h4.c) this.f5045b0, cVar);
                bVar.Z = ((Number) obj).floatValue();
                return bVar;
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        Object l10;
        switch (this.X) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                yb.y yVar = yb.y.f14813a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    n nVar = (n) this.f5045b0;
                    float f8 = this.Z;
                    this.Y = 1;
                    Object value = nVar.f5269g.getValue();
                    Object c4 = nVar.c(nVar.e(), f8, value);
                    if (!((Boolean) nVar.f5266d.k(c4)).booleanValue() ? (l10 = n0.l(nVar, value, f8, this)) != aVar : (l10 = n0.l(nVar, c4, f8, this)) != aVar) {
                        l10 = yVar;
                    }
                    if (l10 == aVar) {
                        return aVar;
                    }
                }
                return yVar;
            default:
                h4.c cVar = (h4.c) this.f5045b0;
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    float f10 = this.Z;
                    Object g10 = cVar.f6068a.f6770d.A.g(i4.l.f6744e);
                    if (g10 == null) {
                        g10 = null;
                    }
                    mc.p pVar = (mc.p) g10;
                    if (pVar != null) {
                        i4.j jVar = (i4.j) cVar.f6068a.f6770d.c(i4.t.f6801v);
                        h3.b bVar = new h3.b((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
                        this.Y = 1;
                        obj = pVar.j(bVar, this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        throw w.d.g("Required value was null.");
                    }
                }
                return new Float(Float.intBitsToFloat((int) (((h3.b) obj).f6050a & 4294967295L)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h4.c cVar, cc.c cVar2) {
        super(2, cVar2);
        this.f5045b0 = cVar;
    }
}
