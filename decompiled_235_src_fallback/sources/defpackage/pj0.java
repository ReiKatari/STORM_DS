package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pj0  reason: default package */
/* loaded from: classes.dex */
public final class pj0 extends defpackage.gi2 {
    public final android.graphics.Typeface e;
    public final defpackage.os0 f;
    public boolean g;

    public pj0(defpackage.os0 r1, android.graphics.Typeface r2) {
            r0 = this;
            r0.<init>()
            r0.e = r2
            r0.f = r1
            return
    }

    @Override // defpackage.gi2
    public final void K(int r1) {
            r0 = this;
            boolean r1 = r0.g
            if (r1 != 0) goto L16
            os0 r1 = r0.f
            java.lang.Object r1 = r1.B
            at0 r1 = (defpackage.at0) r1
            android.graphics.Typeface r0 = r0.e
            boolean r0 = r1.l(r0)
            if (r0 == 0) goto L16
            r0 = 0
            r1.j(r0)
        L16:
            return
    }

    @Override // defpackage.gi2
    public final void M(android.graphics.Typeface r1, boolean r2) {
            r0 = this;
            boolean r2 = r0.g
            if (r2 != 0) goto L14
            os0 r0 = r0.f
            java.lang.Object r0 = r0.B
            at0 r0 = (defpackage.at0) r0
            boolean r1 = r0.l(r1)
            if (r1 == 0) goto L14
            r1 = 0
            r0.j(r1)
        L14:
            return
    }
}
