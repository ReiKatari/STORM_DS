package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: le3  reason: default package */
/* loaded from: classes.dex */
public final class le3 extends defpackage.me3 {
    public /* synthetic */ le3(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r2 = r2 & 4
            if (r2 == 0) goto L6
            r2 = 0
            goto L8
        L6:
            java.lang.String r2 = "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'"
        L8:
            r0.<init>(r1, r2)
            return
    }

    public le3(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            if (r3 == 0) goto L10
            boolean r0 = defpackage.qs6.v0(r3)
            if (r0 == 0) goto L9
            goto L10
        L9:
            java.lang.String r0 = "\n"
            java.lang.String r3 = r0.concat(r3)
            goto L12
        L10:
            java.lang.String r3 = ""
        L12:
            java.lang.String r2 = r2.concat(r3)
            r1.<init>(r2)
            return
    }
}
