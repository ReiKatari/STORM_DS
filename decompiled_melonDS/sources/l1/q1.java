package l1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q1 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final float f8605a;

    /* renamed from: b  reason: collision with root package name */
    public final float f8606b;

    /* renamed from: c  reason: collision with root package name */
    public final float f8607c;

    /* renamed from: d  reason: collision with root package name */
    public final float f8608d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f8609e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ q1(float r9, float r10, float r11, float r12, int r13) {
        /*
            r8 = this;
            r0 = r13 & 1
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r0 == 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r9
        L9:
            r9 = r13 & 2
            if (r9 == 0) goto Lf
            r4 = r1
            goto L10
        Lf:
            r4 = r10
        L10:
            r9 = r13 & 4
            if (r9 == 0) goto L16
            r5 = r1
            goto L17
        L16:
            r5 = r11
        L17:
            r9 = r13 & 8
            if (r9 == 0) goto L1d
            r6 = r1
            goto L1e
        L1d:
            r6 = r12
        L1e:
            r7 = 1
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.q1.<init>(float, float, float, float, int):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b3.o, l1.s1] */
    @Override // a4.j1
    public final b3.o e() {
        ?? oVar = new b3.o();
        oVar.f8622i0 = this.f8605a;
        oVar.f8623j0 = this.f8606b;
        oVar.f8624k0 = this.f8607c;
        oVar.f8625l0 = this.f8608d;
        oVar.f8626m0 = this.f8609e;
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q1) {
                q1 q1Var = (q1) obj;
                if (!x4.f.b(this.f8605a, q1Var.f8605a) || !x4.f.b(this.f8606b, q1Var.f8606b) || !x4.f.b(this.f8607c, q1Var.f8607c) || !x4.f.b(this.f8608d, q1Var.f8608d) || this.f8609e != q1Var.f8609e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        s1 s1Var = (s1) oVar;
        s1Var.f8622i0 = this.f8605a;
        s1Var.f8623j0 = this.f8606b;
        s1Var.f8624k0 = this.f8607c;
        s1Var.f8625l0 = this.f8608d;
        s1Var.f8626m0 = this.f8609e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8609e) + w.d.b(this.f8608d, w.d.b(this.f8607c, w.d.b(this.f8606b, Float.hashCode(this.f8605a) * 31, 31), 31), 31);
    }

    public q1(float f8, float f10, float f11, float f12, boolean z10) {
        this.f8605a = f8;
        this.f8606b = f10;
        this.f8607c = f11;
        this.f8608d = f12;
        this.f8609e = z10;
    }
}
