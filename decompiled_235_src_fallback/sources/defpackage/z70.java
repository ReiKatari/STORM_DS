package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z70  reason: default package */
/* loaded from: classes.dex */
public interface z70 {
    public static final defpackage.y70 a = null;

    static {
            y70 r0 = defpackage.y70.a
            defpackage.z70.a = r0
            return
    }

    default float a(float r2, float r3, float r4) {
            r1 = this;
            y70 r1 = defpackage.z70.a
            r1.getClass()
            float r3 = r3 + r2
            r1 = 0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L10
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 > 0) goto L10
            goto L18
        L10:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L19
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 <= 0) goto L19
        L18:
            return r1
        L19:
            float r1 = java.lang.Math.abs(r2)
            float r3 = r3 - r4
            float r4 = java.lang.Math.abs(r3)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L27
            return r2
        L27:
            return r3
    }
}
