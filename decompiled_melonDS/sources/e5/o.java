package e5;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o extends p {
    @Override // e5.p
    public final void V(int i2, int i10, int i11, int i12) {
        int i13 = this.f4374z0 + this.A0;
        int i14 = this.f4370v0 + this.f4371w0;
        boolean z10 = false;
        if (this.f4368u0 > 0) {
            i13 += this.f4367t0[0].r();
            i14 += this.f4367t0[0].l();
        }
        int max = Math.max(this.f4293c0, i13);
        int max2 = Math.max(this.f4295d0, i14);
        if (i2 != 1073741824) {
            if (i2 == Integer.MIN_VALUE) {
                i10 = Math.min(max, i10);
            } else if (i2 == 0) {
                i10 = max;
            } else {
                i10 = 0;
            }
        }
        if (i11 != 1073741824) {
            if (i11 == Integer.MIN_VALUE) {
                i12 = Math.min(max2, i12);
            } else if (i11 == 0) {
                i12 = max2;
            } else {
                i12 = 0;
            }
        }
        this.C0 = i10;
        this.D0 = i12;
        P(i10);
        M(i12);
        if (this.f4368u0 > 0) {
            z10 = true;
        }
        this.B0 = z10;
    }

    @Override // e5.g
    public final void b(c5.c cVar, boolean z10) {
        super.b(cVar, z10);
        if (this.f4368u0 > 0) {
            g gVar = this.f4367t0[0];
            gVar.E();
            gVar.f4299f0 = 0.5f;
            gVar.f4297e0 = 0.5f;
            c cVar2 = c.LEFT;
            gVar.e(cVar2, this, cVar2, 0);
            c cVar3 = c.RIGHT;
            gVar.e(cVar3, this, cVar3, 0);
            c cVar4 = c.TOP;
            gVar.e(cVar4, this, cVar4, 0);
            c cVar5 = c.BOTTOM;
            gVar.e(cVar5, this, cVar5, 0);
        }
    }
}
