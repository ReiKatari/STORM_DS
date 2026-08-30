package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ln3  reason: default package */
/* loaded from: classes.dex */
public final class ln3 extends ra7 {
    public final j14 b;

    public ln3() {
        j14 j14Var = z23.a;
        this.b = new j14();
    }

    @Override // defpackage.ra7
    public final void d() {
        j14 j14Var = this.b;
        int[] iArr = j14Var.b;
        Object[] objArr = j14Var.c;
        long[] jArr = j14Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            int i5 = iArr[i4];
                            w14 w14Var = (w14) objArr[i4];
                            Object[] objArr2 = w14Var.a;
                            int i6 = w14Var.b;
                            for (int i7 = 0; i7 < i6; i7++) {
                                kn3 kn3Var = (kn3) objArr2[i7];
                                kh0 kh0Var = kn3Var.d;
                                if (kh0Var != null) {
                                    kh0Var.cancel();
                                }
                                kn3Var.d = null;
                                ht3 ht3Var = (ht3) kn3Var.a.B;
                                ht3Var.B = true;
                                ht3Var.A = false;
                                ht3Var.a();
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
