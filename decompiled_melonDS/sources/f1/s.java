package f1;

import android.text.Layout;
import java.io.Serializable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements mc.l {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ long B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Serializable R;
    public final /* synthetic */ Object X;

    public /* synthetic */ s(long j2, float[] fArr, nc.r rVar, nc.q qVar) {
        this.B = j2;
        this.L = fArr;
        this.R = rVar;
        this.X = qVar;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        int f8;
        float[] fArr;
        long j2;
        l4.b bVar;
        boolean z10;
        int i2;
        float a10;
        float a11;
        switch (this.A) {
            case 0:
                h3.c cVar = (h3.c) this.L;
                nc.t tVar = (nc.t) this.R;
                long j10 = this.B;
                i3.l lVar = (i3.l) this.X;
                a4.r0 r0Var = (a4.r0) obj;
                r0Var.a();
                float f10 = cVar.f6052a;
                float f11 = cVar.f6053b;
                k3.b bVar2 = r0Var.A;
                ((d2.t) bVar2.B.B).F(f10, f11);
                try {
                    k3.d.l0(r0Var, (i3.f) tVar.A, j10, 0L, 0.0f, lVar, 0, 890);
                    break;
                } finally {
                    ((d2.t) bVar2.B.B).F(-f10, -f11);
                }
            default:
                float[] fArr2 = (float[]) this.L;
                nc.r rVar = (nc.r) this.R;
                nc.q qVar = (nc.q) this.X;
                l4.s sVar = (l4.s) obj;
                int i10 = sVar.f8891b;
                l4.b bVar3 = sVar.f8890a;
                int i11 = sVar.f8892c;
                long j11 = this.B;
                if (i10 > l4.q0.f(j11)) {
                    f8 = sVar.f8891b;
                } else {
                    f8 = l4.q0.f(j11);
                }
                if (i11 >= l4.q0.e(j11)) {
                    i11 = l4.q0.e(j11);
                }
                long b10 = l4.i0.b(sVar.d(f8), sVar.d(i11));
                int i12 = rVar.A;
                m4.k kVar = bVar3.f8783d;
                int f12 = l4.q0.f(b10);
                int e6 = l4.q0.e(b10);
                Layout layout = kVar.f9221f;
                int length = layout.getText().length();
                if (f12 < 0) {
                    r4.a.a("startOffset must be > 0");
                }
                if (f12 >= length) {
                    r4.a.a("startOffset must be less than text length");
                }
                if (e6 <= f12) {
                    r4.a.a("endOffset must be greater than startOffset");
                }
                if (e6 > length) {
                    r4.a.a("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i12 < (e6 - f12) * 4) {
                    r4.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(f12);
                int lineForOffset2 = layout.getLineForOffset(e6 - 1);
                h4.f fVar = new h4.f(kVar);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        fArr = fArr2;
                        int f13 = kVar.f(lineForOffset);
                        int max = Math.max(f12, lineStart);
                        int min = Math.min(e6, f13);
                        float g10 = kVar.g(lineForOffset);
                        float e10 = kVar.e(lineForOffset);
                        j2 = b10;
                        bVar = bVar3;
                        boolean z11 = false;
                        if (layout.getParagraphDirection(lineForOffset) == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        while (max < min) {
                            boolean isRtlCharAt = layout.isRtlCharAt(max);
                            if (z10 && !isRtlCharAt) {
                                a10 = fVar.a(max, z11, z11, true);
                                i2 = min;
                                a11 = fVar.a(max + 1, true, true, true);
                            } else {
                                if (z10 && isRtlCharAt) {
                                    z11 = false;
                                    float a12 = fVar.a(max, false, false, false);
                                    i2 = min;
                                    a10 = fVar.a(max + 1, true, true, false);
                                    a11 = a12;
                                } else {
                                    i2 = min;
                                    z11 = false;
                                    if (!z10 && isRtlCharAt) {
                                        a11 = fVar.a(max, false, false, true);
                                        a10 = fVar.a(max + 1, true, true, true);
                                    } else {
                                        a10 = fVar.a(max, false, false, false);
                                        a11 = fVar.a(max + 1, true, true, false);
                                    }
                                }
                                fArr[i12] = a10;
                                fArr[i12 + 1] = g10;
                                fArr[i12 + 2] = a11;
                                fArr[i12 + 3] = e10;
                                i12 += 4;
                                max++;
                                min = i2;
                            }
                            z11 = false;
                            fArr[i12] = a10;
                            fArr[i12 + 1] = g10;
                            fArr[i12 + 2] = a11;
                            fArr[i12 + 3] = e10;
                            i12 += 4;
                            max++;
                            min = i2;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            bVar3 = bVar;
                            fArr2 = fArr;
                            b10 = j2;
                        }
                    }
                } else {
                    fArr = fArr2;
                    j2 = b10;
                    bVar = bVar3;
                }
                int d4 = (l4.q0.d(j2) * 4) + rVar.A;
                for (int i13 = rVar.A; i13 < d4; i13 += 4) {
                    int i14 = i13 + 1;
                    float f14 = fArr[i14];
                    float f15 = qVar.A;
                    fArr[i14] = f14 + f15;
                    int i15 = i13 + 3;
                    fArr[i15] = fArr[i15] + f15;
                }
                rVar.A = d4;
                qVar.A = bVar.b() + qVar.A;
                break;
        }
        return yb.y.f14813a;
    }

    public /* synthetic */ s(h3.c cVar, nc.t tVar, long j2, i3.l lVar) {
        this.L = cVar;
        this.R = tVar;
        this.B = j2;
        this.X = lVar;
    }
}
