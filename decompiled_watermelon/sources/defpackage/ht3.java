package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ht3  reason: default package */
/* loaded from: classes.dex */
public final class ht3 implements sc5 {
    public boolean B;
    public boolean L;
    public boolean A = true;
    public final d24 R = new d24();

    public final void a() {
        d24 d24Var = this.R;
        Object[] objArr = d24Var.c;
        long[] jArr = d24Var.a;
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
                            if (obj instanceof w14) {
                                w14 w14Var = (w14) obj;
                                Object[] objArr2 = w14Var.a;
                                int i4 = w14Var.b;
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
        d24Var.a();
    }
}
