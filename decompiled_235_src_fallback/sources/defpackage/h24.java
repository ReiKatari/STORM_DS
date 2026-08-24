package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h24  reason: default package */
/* loaded from: classes.dex */
public final class h24 extends android.view.View.BaseSavedState {
    public static final android.os.Parcelable.Creator<defpackage.h24> CREATOR = null;
    public int A;

    static {
            y8 r0 = new y8
            r1 = 18
            r0.<init>(r1)
            defpackage.h24.CREATOR = r0
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MaterialCheckBox.SavedState{"
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " CheckedState="
            r0.append(r1)
            int r2 = r2.A
            r1 = 1
            if (r2 == r1) goto L25
            r1 = 2
            if (r2 == r1) goto L22
            java.lang.String r2 = "unchecked"
            goto L27
        L22:
            java.lang.String r2 = "indeterminate"
            goto L27
        L25:
            java.lang.String r2 = "checked"
        L27:
            java.lang.String r1 = "}"
            java.lang.String r2 = defpackage.i61.n(r0, r2, r1)
            return r2
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            int r0 = r0.A
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.writeValue(r0)
            return
    }
}
