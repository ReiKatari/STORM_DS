package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k00  reason: default package */
/* loaded from: classes.dex */
public final class k00 extends defpackage.qo7 {
    public final java.lang.String b;
    public defpackage.j97 c;

    public k00(defpackage.v46 r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "SaveableStateHolder_BackStackEntryKey"
            java.lang.Object r1 = r3.a(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L18
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            r3.c(r1, r0)
        L18:
            r2.b = r1
            return
    }

    @Override // defpackage.qo7
    public final void d() {
            r4 = this;
            j97 r0 = r4.c
            r1 = 0
            java.lang.String r2 = "saveableStateHolderRef"
            if (r0 == 0) goto L28
            java.lang.Object r0 = r0.B
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            o46 r0 = (defpackage.o46) r0
            if (r0 == 0) goto L18
            java.lang.String r3 = r4.b
            r0.f(r3)
        L18:
            j97 r4 = r4.c
            if (r4 == 0) goto L24
            java.lang.Object r4 = r4.B
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            r4.clear()
            return
        L24:
            defpackage.nb3.a0(r2)
            throw r1
        L28:
            defpackage.nb3.a0(r2)
            throw r1
    }
}
