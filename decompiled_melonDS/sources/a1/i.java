package a1;

import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final float[] f47a;

    static {
        int i2;
        long[] jArr = u0.f103a;
        int d4 = u0.d(0);
        if (d4 > 0) {
            i2 = Math.max(7, u0.c(d4));
        } else {
            i2 = 0;
        }
        if (i2 != 0) {
            int i10 = ((i2 + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i10];
            Arrays.fill(jArr2, 0, i10, -9187201950435737472L);
            jArr = jArr2;
        }
        int i11 = i2 >> 3;
        long j2 = 255 << ((i2 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j2)) | j2;
        float[] fArr = new float[i2];
        f47a = new float[0];
    }
}
