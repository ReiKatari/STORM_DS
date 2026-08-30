package e5;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class p extends m {

    /* renamed from: v0  reason: collision with root package name */
    public int f4370v0 = 0;

    /* renamed from: w0  reason: collision with root package name */
    public int f4371w0 = 0;

    /* renamed from: x0  reason: collision with root package name */
    public int f4372x0 = 0;

    /* renamed from: y0  reason: collision with root package name */
    public int f4373y0 = 0;

    /* renamed from: z0  reason: collision with root package name */
    public int f4374z0 = 0;
    public int A0 = 0;
    public boolean B0 = false;
    public int C0 = 0;
    public int D0 = 0;
    public final f5.b E0 = new Object();
    public i5.g F0 = null;

    @Override // e5.m
    public final void U() {
        for (int i2 = 0; i2 < this.f4368u0; i2++) {
            g gVar = this.f4367t0[i2];
            if (gVar != null) {
                gVar.F = true;
            }
        }
    }

    public abstract void V(int i2, int i10, int i11, int i12);

    public final void W(g gVar, f fVar, int i2, f fVar2, int i10) {
        i5.g gVar2;
        g gVar3;
        while (true) {
            gVar2 = this.F0;
            if (gVar2 != null || (gVar3 = this.U) == null) {
                break;
            }
            this.F0 = ((h) gVar3).f4335x0;
        }
        f5.b bVar = this.E0;
        bVar.f4842a = fVar;
        bVar.f4843b = fVar2;
        bVar.f4844c = i2;
        bVar.f4845d = i10;
        gVar2.b(gVar, bVar);
        gVar.P(bVar.f4846e);
        gVar.M(bVar.f4847f);
        gVar.E = bVar.f4849h;
        gVar.J(bVar.f4848g);
    }
}
