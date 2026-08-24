package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sb0  reason: default package */
/* loaded from: classes.dex */
public final class sb0 extends defpackage.r1 {
    public final /* synthetic */ defpackage.tb0 d0;

    public sb0(defpackage.tb0 r1) {
            r0 = this;
            r0.<init>()
            r0.d0 = r1
            return
    }

    @Override // defpackage.r1
    public final java.lang.String g() {
            r2 = this;
            tb0 r2 = r2.d0
            java.lang.ref.WeakReference r2 = r2.A
            java.lang.Object r2 = r2.get()
            qb0 r2 = (defpackage.qb0) r2
            if (r2 != 0) goto Lf
            java.lang.String r2 = "Completer object has been garbage collected, future will fail soon"
            return r2
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "tag=["
            r0.<init>(r1)
            java.lang.Object r2 = r2.a
            r0.append(r2)
            java.lang.String r2 = "]"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
