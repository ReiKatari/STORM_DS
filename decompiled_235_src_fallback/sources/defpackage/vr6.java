package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vr6  reason: default package */
/* loaded from: classes.dex */
public abstract class vr6 {
    public static final defpackage.xx a = null;
    public static final defpackage.p04 b = null;
    public static final defpackage.p04 c = null;

    static {
            r0 = 3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 4
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Class r2 = java.lang.Long.TYPE
            r2.getClass()
            xx r3 = new xx
            java.lang.String r4 = "camera2.streamSpec.streamUseCase"
            r5 = 0
            r3.<init>(r4, r2, r5)
            defpackage.vr6.a = r3
            p04 r2 = new p04
            r2.<init>()
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            if (r3 < r4) goto L60
            bj7 r5 = defpackage.bj7.PREVIEW
            bj7 r6 = defpackage.bj7.METERING_REPEATING
            bj7 r7 = defpackage.bj7.IMAGE_ANALYSIS
            bj7[] r8 = new defpackage.bj7[]{r5, r6, r7}
            java.util.Set r8 = defpackage.fv.V0(r8)
            r2.put(r1, r8)
            r8 = 1
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            bj7[] r5 = new defpackage.bj7[]{r5, r6, r7}
            java.util.Set r5 = defpackage.fv.V0(r5)
            r2.put(r8, r5)
            r5 = 2
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            bj7 r6 = defpackage.bj7.IMAGE_CAPTURE
            java.util.Set r6 = defpackage.ii2.R(r6)
            r2.put(r5, r6)
            bj7 r5 = defpackage.bj7.VIDEO_CAPTURE
            java.util.Set r5 = defpackage.ii2.R(r5)
            r2.put(r0, r5)
        L60:
            p04 r2 = r2.b()
            defpackage.vr6.b = r2
            p04 r2 = new p04
            r2.<init>()
            if (r3 < r4) goto L89
            bj7 r3 = defpackage.bj7.PREVIEW
            bj7 r4 = defpackage.bj7.IMAGE_CAPTURE
            bj7 r5 = defpackage.bj7.VIDEO_CAPTURE
            bj7[] r4 = new defpackage.bj7[]{r3, r4, r5}
            java.util.Set r4 = defpackage.fv.V0(r4)
            r2.put(r1, r4)
            bj7[] r1 = new defpackage.bj7[]{r3, r5}
            java.util.Set r1 = defpackage.fv.V0(r1)
            r2.put(r0, r1)
        L89:
            p04 r0 = r2.b()
            defpackage.vr6.c = r0
            return
    }

    public static defpackage.kd0 a(defpackage.yy0 r2, java.lang.Long r3) {
            xx r0 = defpackage.vr6.a
            boolean r1 = r2.i(r0)
            if (r1 == 0) goto L14
            java.lang.Object r1 = r2.e(r0)
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 == 0) goto L14
            r2 = 0
            return r2
        L14:
            da4 r2 = defpackage.da4.k(r2)
            r2.m(r0, r3)
            kd0 r3 = new kd0
            r3.<init>(r2)
            return r3
    }

    public static boolean b(defpackage.bj7 r2, long r3, java.util.List r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto L7
            goto L68
        L7:
            bj7 r0 = defpackage.bj7.STREAM_SHARING
            if (r2 != r0) goto L47
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            p04 r0 = defpackage.vr6.c
            boolean r2 = r0.containsKey(r2)
            if (r2 != 0) goto L18
            goto L68
        L18:
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            java.lang.Object r2 = r0.get(r2)
            r2.getClass()
            java.util.Set r2 = (java.util.Set) r2
            int r3 = r5.size()
            int r4 = r2.size()
            if (r3 == r4) goto L30
            goto L68
        L30:
            java.util.Iterator r3 = r5.iterator()
        L34:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L66
            java.lang.Object r4 = r3.next()
            bj7 r4 = (defpackage.bj7) r4
            boolean r4 = r2.contains(r4)
            if (r4 != 0) goto L34
            goto L68
        L47:
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            p04 r0 = defpackage.vr6.b
            boolean r5 = r0.containsKey(r5)
            if (r5 == 0) goto L68
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r3 = r0.get(r3)
            r3.getClass()
            java.util.Set r3 = (java.util.Set) r3
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L68
        L66:
            r2 = 1
            return r2
        L68:
            r2 = 0
            return r2
    }

    public static boolean c(defpackage.yy0 r2, defpackage.bj7 r3) {
            xx r0 = defpackage.zi7.Q
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r2.b(r0, r1)
            r0.getClass()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L14
            goto L3a
        L14:
            xx r0 = defpackage.e23.B
            boolean r1 = r2.i(r0)
            if (r1 != 0) goto L1d
            goto L3a
        L1d:
            java.lang.Object r2 = r2.e(r0)
            r2.getClass()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int[] r0 = defpackage.ur6.a
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            if (r3 == r0) goto L36
            goto L3a
        L36:
            r3 = 2
            if (r2 != r3) goto L3a
            return r0
        L3a:
            r2 = 0
            return r2
    }
}
