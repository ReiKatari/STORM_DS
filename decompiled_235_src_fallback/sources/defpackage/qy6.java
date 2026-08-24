package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qy6  reason: default package */
/* loaded from: classes.dex */
public final class qy6 {
    public final java.lang.String a;
    public final java.util.Map b;
    public final java.util.Set c;
    public final java.util.Set d;

    public qy6(java.lang.String r1, java.util.Map r2, java.util.AbstractSet r3, java.util.AbstractSet r4) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3a
        L3:
            boolean r0 = r3 instanceof defpackage.qy6
            if (r0 != 0) goto L8
            goto L2a
        L8:
            qy6 r3 = (defpackage.qy6) r3
            java.lang.String r0 = r3.a
            java.lang.String r1 = r2.a
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.util.Map r0 = r2.b
            java.util.Map r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            java.util.Set r0 = r2.c
            java.util.Set r1 = r3.c
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L2c
        L2a:
            r2 = 0
            return r2
        L2c:
            java.util.Set r2 = r2.d
            if (r2 == 0) goto L3a
            java.util.Set r3 = r3.d
            if (r3 != 0) goto L35
            goto L3a
        L35:
            boolean r2 = r2.equals(r3)
            return r2
        L3a:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.Map r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.Set r2 = r2.c
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\n            |TableInfo {\n            |    name = '"
            r0.<init>(r1)
            java.lang.String r1 = r4.a
            r0.append(r1)
            java.lang.String r1 = "',\n            |    columns = {"
            r0.append(r1)
            java.util.Map r1 = r4.b
            java.util.Collection r1 = r1.values()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            tp5 r2 = new tp5
            r3 = 12
            r2.<init>(r3)
            java.util.List r1 = defpackage.gt0.d1(r1, r2)
            java.lang.String r1 = defpackage.ln2.q(r1)
            r0.append(r1)
            java.lang.String r1 = "\n            |    foreignKeys = {"
            r0.append(r1)
            java.util.Set r1 = r4.c
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.String r1 = defpackage.ln2.q(r1)
            r0.append(r1)
            java.lang.String r1 = "\n            |    indices = {"
            r0.append(r1)
            java.util.Set r4 = r4.d
            if (r4 == 0) goto L52
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            tp5 r1 = new tp5
            r2 = 13
            r1.<init>(r2)
            java.util.List r4 = defpackage.gt0.d1(r4, r1)
            goto L54
        L52:
            yt1 r4 = defpackage.yt1.A
        L54:
            java.lang.String r4 = defpackage.ln2.q(r4)
            r0.append(r4)
            java.lang.String r4 = "\n            |}\n        "
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r4 = defpackage.rs6.S(r4)
            return r4
    }
}
