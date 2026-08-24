package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wz0  reason: default package */
/* loaded from: classes.dex */
public final class wz0 {
    public boolean a;
    public boolean b;
    public java.lang.Object c;
    public java.io.Serializable d;

    public wz0() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.a = r0
            return
    }

    public defpackage.xz0 a() {
            r4 = this;
            xz0 r0 = new xz0
            boolean r1 = r4.a
            boolean r2 = r4.b
            java.lang.Object r3 = r4.c
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.io.Serializable r4 = r4.d
            java.lang.String[] r4 = (java.lang.String[]) r4
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public void b(defpackage.rq0... r7) {
            r6 = this;
            boolean r0 = r6.a
            java.lang.String r1 = "no cipher suites for cleartext connections"
            if (r0 == 0) goto L45
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r7.length
            r0.<init>(r2)
            int r2 = r7.length
            r3 = 0
            r4 = r3
        Lf:
            if (r4 >= r2) goto L1b
            r5 = r7[r4]
            java.lang.String r5 = r5.a
            r0.add(r5)
            int r4 = r4 + 1
            goto Lf
        L1b:
            java.lang.String[] r7 = new java.lang.String[r3]
            java.lang.Object[] r7 = r0.toArray(r7)
            java.lang.String[] r7 = (java.lang.String[]) r7
            int r0 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r0)
            java.lang.String[] r7 = (java.lang.String[]) r7
            boolean r0 = r6.a
            if (r0 == 0) goto L41
            int r0 = r7.length
            if (r0 == 0) goto L3b
            int r0 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r0)
            java.lang.String[] r7 = (java.lang.String[]) r7
            r6.c = r7
            goto L44
        L3b:
            java.lang.String r6 = "At least one cipher suite is required"
            defpackage.i.h(r6)
            goto L44
        L41:
            defpackage.i.h(r1)
        L44:
            return
        L45:
            defpackage.i.h(r1)
            return
    }

    public void c(defpackage.l67... r7) {
            r6 = this;
            boolean r0 = r6.a
            java.lang.String r1 = "no TLS versions for cleartext connections"
            if (r0 == 0) goto L47
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r7.length
            r0.<init>(r2)
            int r2 = r7.length
            r3 = 0
            r4 = r3
        Lf:
            if (r4 >= r2) goto L1d
            r5 = r7[r4]
            java.lang.String r5 = r5.javaName()
            r0.add(r5)
            int r4 = r4 + 1
            goto Lf
        L1d:
            java.lang.String[] r7 = new java.lang.String[r3]
            java.lang.Object[] r7 = r0.toArray(r7)
            java.lang.String[] r7 = (java.lang.String[]) r7
            int r0 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r0)
            java.lang.String[] r7 = (java.lang.String[]) r7
            boolean r0 = r6.a
            if (r0 == 0) goto L43
            int r0 = r7.length
            if (r0 == 0) goto L3d
            int r0 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r0)
            java.lang.String[] r7 = (java.lang.String[]) r7
            r6.d = r7
            goto L46
        L3d:
            java.lang.String r6 = "At least one TLS version is required"
            defpackage.i.h(r6)
            goto L46
        L43:
            defpackage.i.h(r1)
        L46:
            return
        L47:
            defpackage.i.h(r1)
            return
    }
}
