package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nu3  reason: default package */
/* loaded from: classes.dex */
public final class nu3 extends qo7 {
    public final p94 b;

    public nu3() {
        p94 p94Var = h93.a;
        this.b = new p94();
    }

    @Override // defpackage.qo7
    public final void d() {
        p94 p94Var = this.b;
        int[] iArr = p94Var.b;
        Object[] objArr = p94Var.c;
        long[] jArr = p94Var.a;
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
                            ca4 ca4Var = (ca4) objArr[i4];
                            Object[] objArr2 = ca4Var.a;
                            int i6 = ca4Var.b;
                            for (int i7 = 0; i7 < i6; i7++) {
                                mu3 mu3Var = (mu3) objArr2[i7];
                                tj0 tj0Var = mu3Var.d;
                                if (tj0Var != null) {
                                    tj0Var.cancel();
                                }
                                mu3Var.d = null;
                                k04 k04Var = (k04) mu3Var.a.B;
                                k04Var.B = true;
                                k04Var.A = false;
                                k04Var.a();
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
