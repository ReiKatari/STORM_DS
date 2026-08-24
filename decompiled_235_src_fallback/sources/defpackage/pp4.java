package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pp4  reason: default package */
/* loaded from: classes.dex */
public abstract class pp4 {
    public final android.util.Size a;
    public final int b;
    public final java.lang.String c;
    public final defpackage.rp4 d;
    public final defpackage.qp4 e;
    public final defpackage.sp4 f;
    public final defpackage.tp4 g;
    public final java.util.List h;

    static {
            return
    }

    public pp4(android.util.Size r1, int r2, java.lang.String r3, defpackage.rp4 r4, defpackage.qp4 r5, defpackage.sp4 r6, defpackage.tp4 r7, java.util.List r8) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Config(size="
            r0.<init>(r1)
            android.util.Size r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", format="
            r0.append(r1)
            int r1 = r2.b
            java.lang.String r1 = defpackage.fr6.b(r1)
            r0.append(r1)
            java.lang.String r1 = ", camera="
            r0.append(r1)
            java.lang.String r1 = r2.c
            if (r1 != 0) goto L26
            java.lang.String r1 = "null"
            goto L2a
        L26:
            java.lang.String r1 = defpackage.xf0.b(r1)
        L2a:
            r0.append(r1)
            java.lang.String r1 = ", mirrorMode="
            r0.append(r1)
            rp4 r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", timestampBase=null, dynamicRangeProfile="
            r0.append(r1)
            qp4 r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", streamUseCase="
            r0.append(r1)
            sp4 r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", streamUseHint="
            r0.append(r1)
            tp4 r1 = r2.g
            r0.append(r1)
            java.lang.String r1 = ", sensorPixelModes="
            r0.append(r1)
            java.util.List r2 = r2.h
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
