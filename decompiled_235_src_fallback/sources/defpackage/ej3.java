package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ej3  reason: default package */
/* loaded from: classes.dex */
public final class ej3 extends defpackage.yh2 {
    public final android.net.Uri d;

    public ej3(android.net.Uri r1) {
            r0 = this;
            r0.<init>()
            r0.d = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof defpackage.ej3
            if (r0 != 0) goto L8
            goto L14
        L8:
            ej3 r2 = (defpackage.ej3) r2
            android.net.Uri r1 = r1.d
            android.net.Uri r2 = r2.d
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L16
        L14:
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            android.net.Uri r0 = r0.d
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RomUri(uri="
            r0.<init>(r1)
            android.net.Uri r2 = r2.d
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
