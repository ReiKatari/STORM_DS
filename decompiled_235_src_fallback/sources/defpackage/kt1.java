package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kt1  reason: default package */
/* loaded from: classes.dex */
public final class kt1 extends defpackage.jw2 {
    public final android.widget.TextView F;
    public final defpackage.et1 G;
    public boolean H;

    public kt1(android.widget.TextView r2) {
            r1 = this;
            r1.<init>()
            r1.F = r2
            r0 = 1
            r1.H = r0
            et1 r0 = new et1
            r0.<init>(r2)
            r1.G = r0
            return
    }

    @Override // defpackage.jw2
    public final void A(boolean r2) {
            r1 = this;
            if (r2 == 0) goto Lf
            android.widget.TextView r2 = r1.F
            android.text.method.TransformationMethod r0 = r2.getTransformationMethod()
            android.text.method.TransformationMethod r1 = r1.I(r0)
            r2.setTransformationMethod(r1)
        Lf:
            return
    }

    @Override // defpackage.jw2
    public final void B(boolean r2) {
            r1 = this;
            r1.H = r2
            android.widget.TextView r2 = r1.F
            android.text.method.TransformationMethod r0 = r2.getTransformationMethod()
            android.text.method.TransformationMethod r0 = r1.I(r0)
            r2.setTransformationMethod(r0)
            android.text.InputFilter[] r0 = r2.getFilters()
            android.text.InputFilter[] r1 = r1.s(r0)
            r2.setFilters(r1)
            return
    }

    @Override // defpackage.jw2
    public final android.text.method.TransformationMethod I(android.text.method.TransformationMethod r1) {
            r0 = this;
            boolean r0 = r0.H
            if (r0 == 0) goto L14
            boolean r0 = r1 instanceof defpackage.ot1
            if (r0 == 0) goto L9
            return r1
        L9:
            boolean r0 = r1 instanceof android.text.method.PasswordTransformationMethod
            if (r0 == 0) goto Le
            return r1
        Le:
            ot1 r0 = new ot1
            r0.<init>(r1)
            return r0
        L14:
            boolean r0 = r1 instanceof defpackage.ot1
            if (r0 == 0) goto L1d
            ot1 r1 = (defpackage.ot1) r1
            android.text.method.TransformationMethod r0 = r1.A
            return r0
        L1d:
            return r1
    }

    @Override // defpackage.jw2
    public final android.text.InputFilter[] s(android.text.InputFilter[] r7) {
            r6 = this;
            boolean r0 = r6.H
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L3e
            android.util.SparseArray r6 = new android.util.SparseArray
            r6.<init>(r2)
            r0 = r1
        Lc:
            int r2 = r7.length
            if (r0 >= r2) goto L1b
            r2 = r7[r0]
            boolean r3 = r2 instanceof defpackage.et1
            if (r3 == 0) goto L18
            r6.put(r0, r2)
        L18:
            int r0 = r0 + 1
            goto Lc
        L1b:
            int r0 = r6.size()
            if (r0 != 0) goto L22
            return r7
        L22:
            int r0 = r7.length
            int r2 = r7.length
            int r3 = r6.size()
            int r2 = r2 - r3
            android.text.InputFilter[] r2 = new android.text.InputFilter[r2]
            r3 = r1
        L2c:
            if (r1 >= r0) goto L3d
            int r4 = r6.indexOfKey(r1)
            if (r4 >= 0) goto L3a
            r4 = r7[r1]
            r2[r3] = r4
            int r3 = r3 + 1
        L3a:
            int r1 = r1 + 1
            goto L2c
        L3d:
            return r2
        L3e:
            int r0 = r7.length
            r3 = r1
        L40:
            et1 r4 = r6.G
            if (r3 >= r0) goto L4c
            r5 = r7[r3]
            if (r5 != r4) goto L49
            return r7
        L49:
            int r3 = r3 + 1
            goto L40
        L4c:
            int r6 = r7.length
            int r6 = r6 + r2
            android.text.InputFilter[] r6 = new android.text.InputFilter[r6]
            java.lang.System.arraycopy(r7, r1, r6, r1, r0)
            r6[r0] = r4
            return r6
    }

    @Override // defpackage.jw2
    public final boolean u() {
            r0 = this;
            boolean r0 = r0.H
            return r0
    }
}
