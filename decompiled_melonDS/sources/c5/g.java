package c5;

import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g implements Comparable {
    public boolean A;
    public float X;

    /* renamed from: c0  reason: collision with root package name */
    public f f2611c0;
    public int B = -1;
    public int L = -1;
    public int R = 0;
    public boolean Y = false;
    public final float[] Z = new float[9];

    /* renamed from: b0  reason: collision with root package name */
    public final float[] f2610b0 = new float[9];

    /* renamed from: d0  reason: collision with root package name */
    public b[] f2612d0 = new b[16];

    /* renamed from: e0  reason: collision with root package name */
    public int f2613e0 = 0;

    /* renamed from: f0  reason: collision with root package name */
    public int f2614f0 = 0;

    public g(f fVar) {
        this.f2611c0 = fVar;
    }

    public final void a(b bVar) {
        int i2 = 0;
        while (true) {
            int i10 = this.f2613e0;
            b[] bVarArr = this.f2612d0;
            if (i2 < i10) {
                if (bVarArr[i2] == bVar) {
                    return;
                }
                i2++;
            } else {
                if (i10 >= bVarArr.length) {
                    this.f2612d0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f2612d0;
                int i11 = this.f2613e0;
                bVarArr2[i11] = bVar;
                this.f2613e0 = i11 + 1;
                return;
            }
        }
    }

    public final void b(b bVar) {
        int i2 = this.f2613e0;
        int i10 = 0;
        while (i10 < i2) {
            if (this.f2612d0[i10] == bVar) {
                while (i10 < i2 - 1) {
                    b[] bVarArr = this.f2612d0;
                    int i11 = i10 + 1;
                    bVarArr[i10] = bVarArr[i11];
                    i10 = i11;
                }
                this.f2613e0--;
                return;
            }
            i10++;
        }
    }

    public final void c() {
        this.f2611c0 = f.UNKNOWN;
        this.R = 0;
        this.B = -1;
        this.L = -1;
        this.X = 0.0f;
        this.Y = false;
        int i2 = this.f2613e0;
        for (int i10 = 0; i10 < i2; i10++) {
            this.f2612d0[i10] = null;
        }
        this.f2613e0 = 0;
        this.f2614f0 = 0;
        this.A = false;
        Arrays.fill(this.f2610b0, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.B - ((g) obj).B;
    }

    public final void d(c cVar, float f8) {
        this.X = f8;
        this.Y = true;
        int i2 = this.f2613e0;
        this.L = -1;
        for (int i10 = 0; i10 < i2; i10++) {
            this.f2612d0[i10].h(cVar, this, false);
        }
        this.f2613e0 = 0;
    }

    public final void e(c cVar, b bVar) {
        int i2 = this.f2613e0;
        for (int i10 = 0; i10 < i2; i10++) {
            this.f2612d0[i10].i(cVar, bVar, false);
        }
        this.f2613e0 = 0;
    }

    public final String toString() {
        return "" + this.B;
    }
}
