package w3;

import a0.j;
import m9.o;
import zb.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f14117a;

    /* renamed from: b  reason: collision with root package name */
    public final b f14118b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14119c;

    /* renamed from: d  reason: collision with root package name */
    public final a[] f14120d;

    /* renamed from: e  reason: collision with root package name */
    public int f14121e;

    /* renamed from: f  reason: collision with root package name */
    public final float[] f14122f;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f14123g;

    /* renamed from: h  reason: collision with root package name */
    public final float[] f14124h;

    public d(boolean z10, b bVar) {
        this.f14117a = z10;
        this.f14118b = bVar;
        if (z10 && bVar.equals(b.Lsq2)) {
            j.p("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int i2 = c.f14116a[bVar.ordinal()];
        int i10 = 2;
        if (i2 != 1) {
            if (i2 == 2) {
                i10 = 3;
            } else {
                o.o();
                throw null;
            }
        }
        this.f14119c = i10;
        this.f14120d = new a[20];
        this.f14122f = new float[20];
        this.f14123g = new float[20];
        this.f14124h = new float[3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [w3.a, java.lang.Object] */
    public final void a(long j2, float f8) {
        int i2 = (this.f14121e + 1) % 20;
        this.f14121e = i2;
        a[] aVarArr = this.f14120d;
        a aVar = aVarArr[i2];
        if (aVar == 0) {
            ?? obj = new Object();
            obj.f14114a = j2;
            obj.f14115b = f8;
            aVarArr[i2] = obj;
            return;
        }
        aVar.f14114a = j2;
        aVar.f14115b = f8;
    }

    public final float b(float f8) {
        b bVar;
        float[] fArr;
        float[] fArr2;
        float f10;
        boolean z10;
        int i2;
        float signum;
        float f11;
        int i10;
        float f12 = f8;
        float f13 = 0.0f;
        if (f12 <= 0.0f) {
            x3.a.c("maximumVelocity should be a positive value. You specified=" + f12);
        }
        int i11 = this.f14121e;
        a[] aVarArr = this.f14120d;
        a aVar = aVarArr[i11];
        if (aVar == null) {
            f10 = 0.0f;
        } else {
            int i12 = 0;
            a aVar2 = aVar;
            while (true) {
                a aVar3 = aVarArr[i11];
                boolean z11 = this.f14117a;
                bVar = this.f14118b;
                fArr = this.f14122f;
                fArr2 = this.f14123g;
                if (aVar3 == null) {
                    f10 = f13;
                    z10 = z11;
                    i2 = 1;
                    break;
                }
                long j2 = aVar.f14114a;
                f10 = f13;
                int i13 = i11;
                long j10 = aVar3.f14114a;
                float f14 = (float) (j2 - j10);
                z10 = z11;
                i2 = 1;
                float abs = (float) Math.abs(j10 - aVar2.f14114a);
                if (bVar != b.Lsq2 && !z10) {
                    aVar2 = aVar;
                } else {
                    aVar2 = aVar3;
                }
                if (f14 > 100.0f || abs > 40.0f) {
                    break;
                }
                fArr[i12] = aVar3.f14115b;
                fArr2[i12] = -f14;
                if (i13 == 0) {
                    i10 = 20;
                } else {
                    i10 = i13;
                }
                i11 = i10 - 1;
                i12++;
                if (i12 >= 20) {
                    break;
                }
                f13 = f10;
            }
            if (i12 >= this.f14119c) {
                int i14 = c.f14116a[bVar.ordinal()];
                if (i14 != i2) {
                    if (i14 == 2) {
                        try {
                            float[] fArr3 = this.f14124h;
                            k.G(fArr2, fArr, i12, fArr3);
                            signum = fArr3[i2];
                        } catch (IllegalArgumentException unused) {
                            signum = f10;
                        }
                    } else {
                        o.o();
                        return 0.0f;
                    }
                } else {
                    int i15 = i12 - i2;
                    float f15 = fArr2[i15];
                    int i16 = i15;
                    float f16 = f10;
                    while (i16 > 0) {
                        int i17 = i16 - 1;
                        float f17 = fArr2[i17];
                        if (f15 != f17) {
                            if (z10) {
                                f11 = -fArr[i17];
                            } else {
                                f11 = fArr[i16] - fArr[i17];
                            }
                            float f18 = f11 / (f15 - f17);
                            f16 += Math.abs(f18) * (f18 - (Math.signum(f16) * ((float) Math.sqrt(Math.abs(f16) * 2))));
                            if (i16 == i15) {
                                f16 *= 0.5f;
                            }
                        }
                        i16--;
                        f15 = f17;
                    }
                    signum = Math.signum(f16) * ((float) Math.sqrt(Math.abs(f16) * 2));
                }
                f13 = signum * 1000;
            } else {
                f13 = f10;
            }
        }
        if (f13 == f10 || Float.isNaN(f13)) {
            return f10;
        }
        if (f13 > f10) {
            if (f13 <= f12) {
                f12 = f13;
            }
        } else {
            f12 = -f12;
            if (f13 >= f12) {
                return f13;
            }
        }
        return f12;
    }

    public d() {
        this(true, b.Impulse);
    }
}
