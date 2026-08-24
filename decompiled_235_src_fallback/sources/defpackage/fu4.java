package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fu4  reason: default package */
/* loaded from: classes.dex */
public final class fu4 extends defpackage.hu4 {
    public final float c;

    public fu4(float r2) {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            r1.c = r2
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.fu4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            fu4 r4 = (defpackage.fu4) r4
            float r3 = r3.c
            float r4 = r4.c
            int r3 = java.lang.Float.compare(r3, r4)
            if (r3 == 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            float r0 = r0.c
            int r0 = java.lang.Float.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RelativeVerticalTo(dy="
            r0.<init>(r1)
            float r2 = r2.c
            r1 = 41
            java.lang.String r2 = defpackage.xg6.p(r0, r2, r1)
            return r2
    }
}
