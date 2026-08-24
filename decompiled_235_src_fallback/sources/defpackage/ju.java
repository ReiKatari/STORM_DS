package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ju  reason: default package */
/* loaded from: classes.dex */
public abstract class ju {
    public static final defpackage.du a = null;
    public static final defpackage.du b = null;
    public static final defpackage.eu c = null;
    public static final defpackage.d90 d = null;
    public static final defpackage.vs0 e = null;

    static {
            du r0 = new du
            r1 = 3
            r0.<init>(r1)
            defpackage.ju.a = r0
            du r0 = new du
            r1 = 2
            r0.<init>(r1)
            defpackage.ju.b = r0
            eu r0 = new eu
            r0.<init>()
            defpackage.ju.c = r0
            d90 r0 = new d90
            r1 = 23
            r0.<init>(r1)
            defpackage.ju.d = r0
            vs0 r0 = new vs0
            r0.<init>(r1)
            defpackage.ju.e = r0
            return
    }

    public static void a(int r5, int[] r6, int[] r7, boolean r8) {
            int r0 = r6.length
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            if (r2 >= r0) goto Lc
            r4 = r6[r2]
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L4
        Lc:
            int r5 = r5 - r3
            float r5 = (float) r5
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
            if (r8 != 0) goto L27
            int r8 = r6.length
            r0 = r1
        L15:
            if (r1 >= r8) goto L3a
            r2 = r6[r1]
            int r3 = r0 + 1
            int r4 = java.lang.Math.round(r5)
            r7[r0] = r4
            float r0 = (float) r2
            float r5 = r5 + r0
            int r1 = r1 + 1
            r0 = r3
            goto L15
        L27:
            int r8 = r6.length
            int r8 = r8 + (-1)
        L2a:
            r0 = -1
            if (r0 >= r8) goto L3a
            r0 = r6[r8]
            int r1 = java.lang.Math.round(r5)
            r7[r8] = r1
            float r0 = (float) r0
            float r5 = r5 + r0
            int r8 = r8 + (-1)
            goto L2a
        L3a:
            return
    }

    public static void b(int r6, int[] r7, int[] r8, boolean r9) {
            int r0 = r7.length
            if (r0 != 0) goto L4
            goto L4d
        L4:
            int r0 = r7.length
            r1 = 0
            r2 = r1
            r3 = r2
        L8:
            if (r2 >= r0) goto L10
            r4 = r7[r2]
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L8
        L10:
            int r0 = r7.length
            r2 = 1
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r0, r2)
            int r6 = r6 - r3
            float r6 = (float) r6
            float r0 = (float) r0
            float r6 = r6 / r0
            if (r9 == 0) goto L22
            int r0 = r7.length
            if (r0 != r2) goto L22
            r0 = r6
            goto L23
        L22:
            r0 = 0
        L23:
            if (r9 != 0) goto L3a
            int r9 = r7.length
            r2 = r1
        L27:
            if (r1 >= r9) goto L4d
            r3 = r7[r1]
            int r4 = r2 + 1
            int r5 = java.lang.Math.round(r0)
            r8[r2] = r5
            float r2 = (float) r3
            float r2 = r2 + r6
            float r0 = r0 + r2
            int r1 = r1 + 1
            r2 = r4
            goto L27
        L3a:
            int r9 = r7.length
            int r9 = r9 - r2
        L3c:
            r1 = -1
            if (r1 >= r9) goto L4d
            r1 = r7[r9]
            int r2 = java.lang.Math.round(r0)
            r8[r9] = r2
            float r1 = (float) r1
            float r1 = r1 + r6
            float r0 = r0 + r1
            int r9 = r9 + (-1)
            goto L3c
        L4d:
            return
    }
}
