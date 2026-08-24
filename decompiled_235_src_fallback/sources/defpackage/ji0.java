package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ji0  reason: default package */
/* loaded from: classes.dex */
public final class ji0 {
    public final java.util.List a;

    public ji0(java.util.List r3) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            java.lang.Object r2 = defpackage.gt0.H0(r3)
            pp4 r2 = (defpackage.pp4) r2
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L12
            goto L30
        L12:
            java.util.Iterator r3 = r3.iterator()
        L16:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r3.next()
            pp4 r0 = (defpackage.pp4) r0
            int r0 = r0.b
            int r1 = r2.b
            if (r0 != r1) goto L29
            goto L16
        L29:
            java.lang.String r2 = "All outputs must have the same format!"
            defpackage.i.m(r2)
            r2 = 0
            throw r2
        L30:
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CameraStream.Config(outputs="
            r0.<init>(r1)
            java.util.List r2 = r2.a
            r0.append(r2)
            java.lang.String r2 = ", imageSourceConfig=null)"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
