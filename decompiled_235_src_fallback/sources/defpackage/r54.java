package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r54  reason: default package */
/* loaded from: classes.dex */
public final class r54 {
    public final android.util.SparseArray a;
    public defpackage.re7 b;

    public r54(int r2) {
            r1 = this;
            r1.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>(r2)
            r1.a = r0
            return
    }

    public final void a(defpackage.re7 r4, int r5, int r6) {
            r3 = this;
            int r0 = r4.a(r5)
            android.util.SparseArray r3 = r3.a
            if (r3 != 0) goto La
            r0 = 0
            goto L10
        La:
            java.lang.Object r0 = r3.get(r0)
            r54 r0 = (defpackage.r54) r0
        L10:
            r1 = 1
            if (r0 != 0) goto L1f
            r54 r0 = new r54
            r0.<init>(r1)
            int r2 = r4.a(r5)
            r3.put(r2, r0)
        L1f:
            if (r6 <= r5) goto L26
            int r5 = r5 + r1
            r0.a(r4, r5, r6)
            return
        L26:
            r0.b = r4
            return
    }
}
