package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bh7  reason: default package */
/* loaded from: classes.dex */
public final class bh7 implements defpackage.go3, java.io.Serializable {
    public defpackage.on2 A;
    public java.lang.Object B;

    @Override // defpackage.go3
    public final java.lang.Object getValue() {
            r2 = this;
            java.lang.Object r0 = r2.B
            xd5 r1 = defpackage.xd5.u0
            if (r0 != r1) goto L14
            on2 r0 = r2.A
            r0.getClass()
            java.lang.Object r0 = r0.c()
            r2.B = r0
            r0 = 0
            r2.A = r0
        L14:
            java.lang.Object r2 = r2.B
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.Object r0 = r2.B
            xd5 r1 = defpackage.xd5.u0
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L14
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            return r2
        L14:
            java.lang.String r2 = "Lazy value not initialized yet."
            return r2
    }
}
