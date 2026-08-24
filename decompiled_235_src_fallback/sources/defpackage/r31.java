package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r31  reason: default package */
/* loaded from: classes.dex */
public final class r31 implements defpackage.q31, defpackage.s31 {
    public final /* synthetic */ int A;
    public android.content.ClipData B;
    public int L;
    public int R;
    public android.net.Uri X;
    public android.os.Bundle Y;

    public /* synthetic */ r31() {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            return
    }

    public r31(defpackage.r31 r6) {
            r5 = this;
            r0 = 1
            r5.A = r0
            r5.<init>()
            android.content.ClipData r1 = r6.B
            r1.getClass()
            r5.B = r1
            int r1 = r6.L
            r2 = 5
            java.lang.String r3 = "source"
            r4 = 0
            defpackage.np2.u(r1, r4, r2, r3)
            r5.L = r1
            int r1 = r6.R
            r2 = r1 & 1
            if (r2 != r1) goto L29
            r5.R = r1
            android.net.Uri r0 = r6.X
            r5.X = r0
            android.os.Bundle r6 = r6.Y
            r5.Y = r6
            return
        L29:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = java.lang.Integer.toHexString(r1)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Requested flags 0x"
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = ", but only 0x"
            r1.append(r6)
            r1.append(r0)
            java.lang.String r6 = " are allowed"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r5.<init>(r6)
            throw r5
    }

    @Override // defpackage.s31
    public int F() {
            r0 = this;
            int r0 = r0.R
            return r0
    }

    @Override // defpackage.s31
    public android.view.ContentInfo G() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.q31
    public defpackage.t31 build() {
            r2 = this;
            t31 r0 = new t31
            r31 r1 = new r31
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.s31
    public int k() {
            r0 = this;
            int r0 = r0.L
            return r0
    }

    @Override // defpackage.s31
    public android.content.ClipData l() {
            r0 = this;
            android.content.ClipData r0 = r0.B
            return r0
    }

    @Override // defpackage.q31
    public void s(android.net.Uri r1) {
            r0 = this;
            r0.X = r1
            return
    }

    @Override // defpackage.q31
    public void setExtras(android.os.Bundle r1) {
            r0 = this;
            r0.Y = r1
            return
    }

    public java.lang.String toString() {
            r5 = this;
            int r0 = r5.A
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r5 = super.toString()
            return r5
        La:
            android.net.Uri r0 = r5.X
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ContentInfoCompat{clip="
            r1.<init>(r2)
            android.content.ClipData r2 = r5.B
            android.content.ClipDescription r2 = r2.getDescription()
            r1.append(r2)
            java.lang.String r2 = ", source="
            r1.append(r2)
            int r2 = r5.L
            if (r2 == 0) goto L48
            r3 = 1
            if (r2 == r3) goto L45
            r3 = 2
            if (r2 == r3) goto L42
            r3 = 3
            if (r2 == r3) goto L3f
            r3 = 4
            if (r2 == r3) goto L3c
            r3 = 5
            if (r2 == r3) goto L39
            java.lang.String r2 = java.lang.String.valueOf(r2)
            goto L4a
        L39:
            java.lang.String r2 = "SOURCE_PROCESS_TEXT"
            goto L4a
        L3c:
            java.lang.String r2 = "SOURCE_AUTOFILL"
            goto L4a
        L3f:
            java.lang.String r2 = "SOURCE_DRAG_AND_DROP"
            goto L4a
        L42:
            java.lang.String r2 = "SOURCE_INPUT_METHOD"
            goto L4a
        L45:
            java.lang.String r2 = "SOURCE_CLIPBOARD"
            goto L4a
        L48:
            java.lang.String r2 = "SOURCE_APP"
        L4a:
            r1.append(r2)
            java.lang.String r2 = ", flags="
            r1.append(r2)
            int r2 = r5.R
            r3 = r2 & 1
            if (r3 == 0) goto L5b
            java.lang.String r2 = "FLAG_CONVERT_TO_PLAIN_TEXT"
            goto L5f
        L5b:
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L5f:
            r1.append(r2)
            java.lang.String r2 = ""
            if (r0 != 0) goto L68
            r0 = r2
            goto L83
        L68:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = ", hasLinkUri("
            r3.<init>(r4)
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            r3.append(r0)
            java.lang.String r0 = ")"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L83:
            r1.append(r0)
            android.os.Bundle r5 = r5.Y
            if (r5 != 0) goto L8b
            goto L8d
        L8b:
            java.lang.String r2 = ", hasExtras"
        L8d:
            java.lang.String r5 = "}"
            java.lang.String r5 = defpackage.i61.n(r1, r2, r5)
            return r5
    }

    @Override // defpackage.q31
    public void v(int r1) {
            r0 = this;
            r0.R = r1
            return
    }
}
