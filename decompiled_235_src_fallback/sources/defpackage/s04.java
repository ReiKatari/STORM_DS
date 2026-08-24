package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s04  reason: default package */
/* loaded from: classes.dex */
public final class s04 {
    public final java.util.Map a;

    public s04(java.util.Map r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final java.lang.Object a(float r7) {
            r6 = this;
            java.util.Map r6 = r6.a
            java.util.Set r6 = r6.entrySet()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            boolean r0 = r6.hasNext()
            r1 = 0
            if (r0 != 0) goto L15
            r0 = r1
            goto L58
        L15:
            java.lang.Object r0 = r6.next()
            boolean r2 = r6.hasNext()
            if (r2 != 0) goto L20
            goto L58
        L20:
            r2 = r0
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r2 = r7 - r2
            float r2 = java.lang.Math.abs(r2)
        L33:
            java.lang.Object r3 = r6.next()
            r4 = r3
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            float r4 = r7 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = java.lang.Float.compare(r2, r4)
            if (r5 <= 0) goto L52
            r0 = r3
            r2 = r4
        L52:
            boolean r3 = r6.hasNext()
            if (r3 != 0) goto L33
        L58:
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            if (r0 == 0) goto L61
            java.lang.Object r6 = r0.getKey()
            return r6
        L61:
            return r1
    }

    public final java.lang.Object b(float r9, boolean r10) {
            r8 = this;
            java.util.Map r8 = r8.a
            java.util.Set r8 = r8.entrySet()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            boolean r0 = r8.hasNext()
            r1 = 0
            if (r0 != 0) goto L15
            r0 = r1
            goto L65
        L15:
            java.lang.Object r0 = r8.next()
            boolean r2 = r8.hasNext()
            if (r2 != 0) goto L20
            goto L65
        L20:
            r2 = r0
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            if (r10 == 0) goto L31
            float r2 = r2 - r9
            goto L33
        L31:
            float r2 = r9 - r2
        L33:
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r5 = 2139095040(0x7f800000, float:Infinity)
            if (r4 >= 0) goto L3b
            r2 = r5
        L3b:
            java.lang.Object r4 = r8.next()
            r6 = r4
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            if (r10 == 0) goto L50
            float r6 = r6 - r9
            goto L52
        L50:
            float r6 = r9 - r6
        L52:
            int r7 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r7 >= 0) goto L57
            r6 = r5
        L57:
            int r7 = java.lang.Float.compare(r2, r6)
            if (r7 <= 0) goto L5f
            r0 = r4
            r2 = r6
        L5f:
            boolean r4 = r8.hasNext()
            if (r4 != 0) goto L3b
        L65:
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            if (r0 == 0) goto L6e
            java.lang.Object r8 = r0.getKey()
            return r8
        L6e:
            return r1
    }

    public final float c(java.lang.Object r1) {
            r0 = this;
            java.util.Map r0 = r0.a
            java.lang.Object r0 = r0.get(r1)
            java.lang.Float r0 = (java.lang.Float) r0
            if (r0 == 0) goto Lf
            float r0 = r0.floatValue()
            return r0
        Lf:
            r0 = 2143289344(0x7fc00000, float:NaN)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof defpackage.s04
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            s04 r2 = (defpackage.s04) r2
            java.util.Map r2 = r2.a
            java.util.Map r1 = r1.a
            boolean r1 = defpackage.nb3.k(r1, r2)
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.util.Map r0 = r0.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MapDraggableAnchors("
            r0.<init>(r1)
            java.util.Map r2 = r2.a
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
