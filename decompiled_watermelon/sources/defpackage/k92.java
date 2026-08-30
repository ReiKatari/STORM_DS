package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k92  reason: default package */
/* loaded from: classes.dex */
public abstract class k92 {
    public static final float[] a;

    static {
        int i;
        long[] jArr = wu5.a;
        int d = wu5.d(0);
        if (d > 0) {
            i = Math.max(7, wu5.c(d));
        } else {
            i = 0;
        }
        if (i != 0) {
            int i2 = ((i + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        int i3 = i >> 3;
        long j = 255 << ((i & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        float[] fArr = new float[i];
        a = new float[0];
    }
}
