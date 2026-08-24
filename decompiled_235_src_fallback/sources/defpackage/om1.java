package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: om1  reason: default package */
/* loaded from: classes.dex */
public final class om1 implements java.lang.Comparable {
    public final float A;

    public /* synthetic */ om1(float r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    public static int a(float r1, float r2) {
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L12
            boolean r0 = java.lang.Float.isNaN(r2)
            if (r0 == 0) goto Ld
            goto L12
        Ld:
            int r1 = java.lang.Float.compare(r1, r2)
            return r1
        L12:
            r1 = 0
            return r1
    }

    public static final boolean b(float r0, float r1) {
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static java.lang.String c(float r1) {
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 == 0) goto L9
            java.lang.String r1 = "Dp.Unspecified"
            return r1
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = ".dp"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r1) {
            r0 = this;
            om1 r1 = (defpackage.om1) r1
            float r1 = r1.A
            float r0 = r0.A
            int r0 = a(r0, r1)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.om1
            if (r0 != 0) goto L5
            goto L11
        L5:
            om1 r2 = (defpackage.om1) r2
            float r2 = r2.A
            float r1 = r1.A
            int r1 = java.lang.Float.compare(r1, r2)
            if (r1 == 0) goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            float r0 = r0.A
            int r0 = java.lang.Float.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            float r0 = r0.A
            java.lang.String r0 = c(r0)
            return r0
    }
}
