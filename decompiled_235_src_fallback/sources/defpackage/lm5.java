package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lm5  reason: default package */
/* loaded from: classes.dex */
public final class lm5 {
    public final java.util.HashSet a;

    public lm5() {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.a = r0
            return
    }

    public final void a() {
            r2 = this;
            java.lang.Thread r0 = defpackage.ej2.e
            if (r0 != 0) goto Le
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            defpackage.ej2.e = r0
        Le:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.Thread r1 = defpackage.ej2.e
            if (r0 != r1) goto L28
            java.util.HashSet r2 = r2.a
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L23
            return
        L23:
            java.lang.ClassCastException r2 = defpackage.i61.j(r2)
            throw r2
        L28:
            java.lang.String r2 = "Must be called on the Main thread."
            defpackage.i.m(r2)
            return
    }
}
