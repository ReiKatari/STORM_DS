package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: py  reason: default package */
/* loaded from: classes.dex */
public final class py {
    public final long a;

    public py(long r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static defpackage.py a(java.io.BufferedReader r3) {
            android.util.JsonReader r0 = new android.util.JsonReader
            r0.<init>(r3)
            r0.beginObject()     // Catch: java.lang.Throwable -> L33
        L8:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r3 == 0) goto L46
            java.lang.String r3 = r0.nextName()     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "nextRequestWaitMillis"
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L33
            if (r3 == 0) goto L42
            android.util.JsonToken r3 = r0.peek()     // Catch: java.lang.Throwable -> L33
            android.util.JsonToken r1 = android.util.JsonToken.STRING     // Catch: java.lang.Throwable -> L33
            if (r3 != r1) goto L35
            java.lang.String r3 = r0.nextString()     // Catch: java.lang.Throwable -> L33
            long r1 = java.lang.Long.parseLong(r3)     // Catch: java.lang.Throwable -> L33
            py r3 = new py     // Catch: java.lang.Throwable -> L33
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L33
            r0.close()
            return r3
        L33:
            r3 = move-exception
            goto L4e
        L35:
            long r1 = r0.nextLong()     // Catch: java.lang.Throwable -> L33
            py r3 = new py     // Catch: java.lang.Throwable -> L33
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L33
            r0.close()
            return r3
        L42:
            r0.skipValue()     // Catch: java.lang.Throwable -> L33
            goto L8
        L46:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "Response is missing nextRequestWaitMillis field."
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L33
            throw r3     // Catch: java.lang.Throwable -> L33
        L4e:
            r0.close()
            throw r3
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof defpackage.py
            r2 = 0
            if (r1 == 0) goto L14
            py r6 = (defpackage.py) r6
            long r3 = r5.a
            long r5 = r6.a
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L14
            return r0
        L14:
            return r2
    }

    public final int hashCode() {
            r5 = this;
            r0 = 32
            long r1 = r5.a
            long r3 = r1 >>> r0
            long r0 = r3 ^ r1
            int r5 = (int) r0
            r0 = 1000003(0xf4243, float:1.401303E-39)
            r5 = r5 ^ r0
            return r5
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LogResponse{nextRequestWaitMillis="
            r0.<init>(r1)
            long r1 = r3.a
            java.lang.String r3 = "}"
            java.lang.String r3 = defpackage.lb1.p(r0, r1, r3)
            return r3
    }
}
