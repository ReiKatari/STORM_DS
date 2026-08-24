package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zd7  reason: default package */
/* loaded from: classes.dex */
public class zd7 extends defpackage.yc7 {
    public zd7() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.yc7
    public final java.lang.Object b(defpackage.hf3 r4) {
            r3 = this;
            jf3 r3 = r4.n0()
            jf3 r0 = defpackage.jf3.NULL
            if (r3 != r0) goto Ld
            r4.j0()
            r3 = 0
            return r3
        Ld:
            int r3 = r4.Z()     // Catch: java.lang.NumberFormatException -> L38
            r0 = 255(0xff, float:3.57E-43)
            if (r3 > r0) goto L1f
            r0 = -128(0xffffffffffffff80, float:NaN)
            if (r3 < r0) goto L1f
            byte r3 = (byte) r3
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            return r3
        L1f:
            ne3 r0 = new ne3
            java.lang.String r1 = "Lossy conversion from "
            java.lang.String r2 = " to byte; at path "
            java.lang.StringBuilder r3 = defpackage.xg6.t(r1, r3, r2)
            java.lang.String r4 = r4.D()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L38:
            r3 = move-exception
            ne3 r4 = new ne3
            r4.<init>(r3)
            throw r4
    }

    @Override // defpackage.yc7
    public final void c(defpackage.vf3 r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Number r4 = (java.lang.Number) r4
            if (r4 != 0) goto L8
            r3.A()
            return
        L8:
            byte r2 = r4.byteValue()
            long r0 = (long) r2
            r3.X(r0)
            return
    }
}
