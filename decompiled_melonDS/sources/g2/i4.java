package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class i4 extends nc.i implements mc.l {

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ sc.a f5179b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ nc.q f5180c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ nc.q f5181d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(sc.a aVar, nc.q qVar, nc.q qVar2) {
        super(1, nc.j.class, "scaleToOffset", "Slider$lambda$3$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
        this.f5179b0 = aVar;
        this.f5180c0 = qVar;
        this.f5181d0 = qVar2;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        float f8;
        float floatValue = ((Number) obj).floatValue();
        sc.a aVar = this.f5179b0;
        float f10 = aVar.f12863a;
        float f11 = aVar.f12864b;
        float f12 = this.f5180c0.A;
        float f13 = this.f5181d0.A;
        float f14 = f11 - f10;
        float f15 = 0.0f;
        if (f14 == 0.0f) {
            f8 = 0.0f;
        } else {
            f8 = (floatValue - f10) / f14;
        }
        if (f8 >= 0.0f) {
            f15 = f8;
        }
        if (f15 > 1.0f) {
            f15 = 1.0f;
        }
        return Float.valueOf(p7.l.w(f12, f13, f15));
    }
}
