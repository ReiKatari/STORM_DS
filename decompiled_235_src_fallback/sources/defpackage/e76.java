package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e76  reason: default package */
/* loaded from: classes.dex */
public final class e76 {
    public final defpackage.on2 a;
    public final defpackage.on2 b;

    public e76(defpackage.on2 r1, defpackage.on2 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ScrollAxisRange(value="
            r0.<init>(r1)
            on2 r1 = r2.a
            java.lang.Object r1 = r1.c()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r0.append(r1)
            java.lang.String r1 = ", maxValue="
            r0.append(r1)
            on2 r2 = r2.b
            java.lang.Object r2 = r2.c()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r0.append(r2)
            java.lang.String r2 = ", reverseScrolling=false)"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
