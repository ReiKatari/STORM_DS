package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v86  reason: default package */
/* loaded from: classes.dex */
public final class v86 extends defpackage.s {
    public static final android.os.Parcelable.Creator<defpackage.v86> CREATOR = null;
    public boolean L;

    static {
            lm6 r0 = new lm6
            r1 = 4
            r0.<init>(r1)
            defpackage.v86.CREATOR = r0
            return
    }

    public v86(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r2 = 0
            java.lang.Object r1 = r1.readValue(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.L = r1
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SearchView.SavedState{"
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " isIconified="
            r0.append(r1)
            boolean r2 = r2.L
            java.lang.String r1 = "}"
            java.lang.String r2 = defpackage.i61.o(r0, r2, r1)
            return r2
    }

    @Override // defpackage.s, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            boolean r0 = r0.L
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.writeValue(r0)
            return
    }
}
