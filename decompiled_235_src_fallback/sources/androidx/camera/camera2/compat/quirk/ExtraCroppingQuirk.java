package androidx.camera.camera2.compat.quirk;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ExtraCroppingQuirk implements defpackage.u65 {
    public static final java.util.LinkedHashMap a = null;

    static {
            vr4 r0 = new vr4
            java.lang.String r1 = "SM-T580"
            r2 = 0
            r0.<init>(r1, r2)
            android.util.Range r1 = new android.util.Range
            r3 = 21
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 26
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.<init>(r3, r4)
            r5 = r1
            vr4 r1 = new vr4
            java.lang.String r6 = "SM-J710MN"
            r1.<init>(r6, r5)
            r5 = r2
            vr4 r2 = new vr4
            java.lang.String r6 = "SM-A320FL"
            r2.<init>(r6, r5)
            r6 = r3
            vr4 r3 = new vr4
            java.lang.String r7 = "SM-G570M"
            r3.<init>(r7, r5)
            r7 = r4
            vr4 r4 = new vr4
            java.lang.String r8 = "SM-G610F"
            r4.<init>(r8, r5)
            android.util.Range r5 = new android.util.Range
            r5.<init>(r6, r7)
            r6 = r5
            vr4 r5 = new vr4
            java.lang.String r7 = "SM-G610M"
            r5.<init>(r7, r6)
            vr4[] r0 = new defpackage.vr4[]{r0, r1, r2, r3, r4, r5}
            java.util.LinkedHashMap r0 = defpackage.c14.n0(r0)
            androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk.a = r0
            return
    }

    public static android.util.Size b(defpackage.hv6 r2) {
            r2.getClass()
            boolean r0 = defpackage.n16.E()
            if (r0 == 0) goto L39
            int[] r0 = defpackage.d92.a
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L2f
            r0 = 2
            if (r2 == r0) goto L25
            r0 = 3
            if (r2 == r0) goto L1b
            goto L39
        L1b:
            android.util.Size r2 = new android.util.Size
            r0 = 3264(0xcc0, float:4.574E-42)
            r1 = 1836(0x72c, float:2.573E-42)
            r2.<init>(r0, r1)
            return r2
        L25:
            android.util.Size r2 = new android.util.Size
            r0 = 1280(0x500, float:1.794E-42)
            r1 = 720(0x2d0, float:1.009E-42)
            r2.<init>(r0, r1)
            return r2
        L2f:
            android.util.Size r2 = new android.util.Size
            r0 = 1920(0x780, float:2.69E-42)
            r1 = 1080(0x438, float:1.513E-42)
            r2.<init>(r0, r1)
            return r2
        L39:
            r2 = 0
            return r2
    }
}
