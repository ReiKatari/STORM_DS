package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k04  reason: default package */
/* loaded from: classes.dex */
public final class k04 implements mm5 {
    public boolean B;
    public boolean L;
    public boolean A = true;
    public final ja4 R = new ja4();

    public final void a() {
        ja4 ja4Var = this.R;
        Object[] objArr = ja4Var.c;
        long[] jArr = ja4Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof ca4) {
                                ca4 ca4Var = (ca4) obj;
                                Object[] objArr2 = ca4Var.a;
                                int i4 = ca4Var.b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    Object obj2 = objArr2[i5];
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        ja4Var.a();
    }
}
