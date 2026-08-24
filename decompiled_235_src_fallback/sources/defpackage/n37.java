package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n37  reason: default package */
/* loaded from: classes.dex */
public final class n37 extends defpackage.s {
    public static final android.os.Parcelable.Creator<defpackage.n37> CREATOR = null;
    public java.lang.CharSequence L;
    public boolean R;

    static {
            lm6 r0 = new lm6
            r1 = 5
            r0.<init>(r1)
            defpackage.n37.CREATOR = r0
            return
    }

    public n37(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>(r1, r2)
            android.os.Parcelable$Creator r2 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r2 = r2.createFromParcel(r1)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.L = r2
            int r1 = r1.readInt()
            r2 = 1
            if (r1 != r2) goto L15
            goto L16
        L15:
            r2 = 0
        L16:
            r0.R = r2
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextInputLayout.SavedState{"
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " error="
            r0.append(r1)
            java.lang.CharSequence r2 = r2.L
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.s, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            super.writeToParcel(r2, r3)
            java.lang.CharSequence r0 = r1.L
            android.text.TextUtils.writeToParcel(r0, r2, r3)
            boolean r1 = r1.R
            r2.writeInt(r1)
            return
    }
}
