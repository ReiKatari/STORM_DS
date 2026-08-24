package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c1  reason: default package */
/* loaded from: classes.dex */
public abstract class c1 {
    protected int memoizedHashCode;

    public abstract int a();

    public final java.lang.String b(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Serializing "
            r0.<init>(r1)
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r2 = " to a "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = " threw an IOException (should never happen)."
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public final byte[] c() {
            r3 = this;
            int r0 = r3.a()     // Catch: java.io.IOException -> L1c
            byte[] r1 = new byte[r0]     // Catch: java.io.IOException -> L1c
            ms0 r2 = new ms0     // Catch: java.io.IOException -> L1c
            r2.<init>(r1, r0)     // Catch: java.io.IOException -> L1c
            r3.d(r2)     // Catch: java.io.IOException -> L1c
            int r2 = r2.d     // Catch: java.io.IOException -> L1c
            int r0 = r0 - r2
            if (r0 != 0) goto L14
            return r1
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.io.IOException -> L1c
            java.lang.String r1 = "Did not write as much data as expected."
            r0.<init>(r1)     // Catch: java.io.IOException -> L1c
            throw r0     // Catch: java.io.IOException -> L1c
        L1c:
            r0 = move-exception
            java.lang.String r1 = "byte array"
            java.lang.String r3 = r3.b(r1)
            defpackage.u34.p(r3, r0)
            r3 = 0
            return r3
    }

    public abstract void d(defpackage.ms0 r1);
}
