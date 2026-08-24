package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gs4  reason: default package */
/* loaded from: classes.dex */
public final class gs4 extends defpackage.uj2 {
    public final java.lang.reflect.Method h;
    public final int i;
    public final defpackage.b51 j;

    public gs4(java.lang.reflect.Method r1, int r2, defpackage.b51 r3) {
            r0 = this;
            r0.<init>()
            r0.h = r1
            r0.i = r2
            r0.j = r3
            return
    }

    @Override // defpackage.uj2
    public final void l(defpackage.ok5 r5, java.lang.Object r6) {
            r4 = this;
            r0 = 0
            int r1 = r4.i
            java.lang.reflect.Method r2 = r4.h
            if (r6 == 0) goto L2d
            b51 r4 = r4.j     // Catch: java.io.IOException -> L12
            java.lang.Object r4 = r4.h(r6)     // Catch: java.io.IOException -> L12
            mk5 r4 = (defpackage.mk5) r4     // Catch: java.io.IOException -> L12
            r5.k = r4
            return
        L12:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to convert "
            r5.<init>(r3)
            r5.append(r6)
            java.lang.String r6 = " to RequestBody"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r4 = defpackage.ak7.w0(r2, r4, r1, r5, r6)
            throw r4
        L2d:
            java.lang.String r4 = "Body parameter value must not be null."
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r4 = defpackage.ak7.v0(r2, r1, r4, r5)
            throw r4
    }
}
