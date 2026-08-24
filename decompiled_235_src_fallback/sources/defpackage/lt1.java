package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lt1  reason: default package */
/* loaded from: classes.dex */
public final class lt1 extends defpackage.jw2 {
    public final defpackage.kt1 F;

    public lt1(android.widget.TextView r2) {
            r1 = this;
            r1.<init>()
            kt1 r0 = new kt1
            r0.<init>(r2)
            r1.F = r0
            return
    }

    @Override // defpackage.jw2
    public final void A(boolean r2) {
            r1 = this;
            boolean r0 = defpackage.ws1.d()
            if (r0 != 0) goto L7
            return
        L7:
            kt1 r1 = r1.F
            r1.A(r2)
            return
    }

    @Override // defpackage.jw2
    public final void B(boolean r2) {
            r1 = this;
            boolean r0 = defpackage.ws1.d()
            kt1 r1 = r1.F
            if (r0 != 0) goto Lb
            r1.H = r2
            return
        Lb:
            r1.B(r2)
            return
    }

    @Override // defpackage.jw2
    public final android.text.method.TransformationMethod I(android.text.method.TransformationMethod r2) {
            r1 = this;
            boolean r0 = defpackage.ws1.d()
            if (r0 != 0) goto L7
            return r2
        L7:
            kt1 r1 = r1.F
            android.text.method.TransformationMethod r1 = r1.I(r2)
            return r1
    }

    @Override // defpackage.jw2
    public final android.text.InputFilter[] s(android.text.InputFilter[] r2) {
            r1 = this;
            boolean r0 = defpackage.ws1.d()
            if (r0 != 0) goto L7
            return r2
        L7:
            kt1 r1 = r1.F
            android.text.InputFilter[] r1 = r1.s(r2)
            return r1
    }

    @Override // defpackage.jw2
    public final boolean u() {
            r0 = this;
            kt1 r0 = r0.F
            boolean r0 = r0.H
            return r0
    }
}
