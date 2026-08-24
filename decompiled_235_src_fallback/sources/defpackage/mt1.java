package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mt1  reason: default package */
/* loaded from: classes.dex */
public final class mt1 extends defpackage.us1 implements java.lang.Runnable {
    public final java.lang.ref.WeakReference A;

    public mt1(android.widget.EditText r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.A = r0
            return
    }

    @Override // defpackage.us1
    public final void b() {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.A
            java.lang.Object r0 = r0.get()
            android.widget.EditText r0 = (android.widget.EditText) r0
            if (r0 != 0) goto Lb
            goto L11
        Lb:
            android.os.Handler r0 = r0.getHandler()
            if (r0 != 0) goto L12
        L11:
            return
        L12:
            r0.post(r1)
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            java.lang.ref.WeakReference r1 = r1.A
            java.lang.Object r1 = r1.get()
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0 = 1
            defpackage.nt1.a(r1, r0)
            return
    }
}
