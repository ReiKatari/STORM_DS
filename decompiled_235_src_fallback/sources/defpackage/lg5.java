package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lg5  reason: default package */
/* loaded from: classes.dex */
public final class lg5 {
    public android.util.SparseArray a;
    public int b;
    public java.util.Set c;

    public final defpackage.kg5 a(int r2) {
            r1 = this;
            android.util.SparseArray r1 = r1.a
            java.lang.Object r0 = r1.get(r2)
            kg5 r0 = (defpackage.kg5) r0
            if (r0 != 0) goto L12
            kg5 r0 = new kg5
            r0.<init>()
            r1.put(r2, r0)
        L12:
            return r0
    }
}
