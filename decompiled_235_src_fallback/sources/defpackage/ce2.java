package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ce2  reason: default package */
/* loaded from: classes.dex */
public abstract class ce2 {
    public static final float[] a = null;

    static {
            long[] r0 = defpackage.b66.a
            r1 = 0
            int r2 = defpackage.b66.d(r1)
            if (r2 <= 0) goto L13
            int r2 = defpackage.b66.c(r2)
            r3 = 7
            int r2 = java.lang.Math.max(r3, r2)
            goto L14
        L13:
            r2 = r1
        L14:
            if (r2 != 0) goto L17
            goto L28
        L17:
            int r0 = r2 + 15
            r0 = r0 & (-8)
            int r0 = r0 >> 3
            long[] r3 = new long[r0]
            r4 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            java.util.Arrays.fill(r3, r1, r0, r4)
            r0 = r3
        L28:
            int r3 = r2 >> 3
            r4 = r2 & 7
            int r4 = r4 << 3
            r5 = r0[r3]
            r7 = 255(0xff, double:1.26E-321)
            long r7 = r7 << r4
            long r9 = ~r7
            long r4 = r5 & r9
            long r4 = r4 | r7
            r0[r3] = r4
            float[] r0 = new float[r2]
            float[] r0 = new float[r1]
            defpackage.ce2.a = r0
            return
    }
}
