package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fb0  reason: default package */
/* loaded from: classes.dex */
public final class fb0 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.fb0> CREATOR = null;
    public final defpackage.i74 A;
    public final defpackage.i74 B;
    public final defpackage.dc1 L;
    public final defpackage.i74 R;
    public final int X;
    public final int Y;
    public final int Z;

    static {
            y8 r0 = new y8
            r1 = 5
            r0.<init>(r1)
            defpackage.fb0.CREATOR = r0
            return
    }

    public fb0(defpackage.i74 r3, defpackage.i74 r4, defpackage.dc1 r5, defpackage.i74 r6, int r7) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "start cannot be null"
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.String r0 = "end cannot be null"
            java.util.Objects.requireNonNull(r4, r0)
            java.lang.String r0 = "validator cannot be null"
            java.util.Objects.requireNonNull(r5, r0)
            r2.A = r3
            r2.B = r4
            r2.R = r6
            r2.X = r7
            r2.L = r5
            r5 = 0
            if (r6 == 0) goto L30
            java.util.Calendar r0 = r3.A
            java.util.Calendar r1 = r6.A
            int r0 = r0.compareTo(r1)
            if (r0 > 0) goto L2a
            goto L30
        L2a:
            java.lang.String r2 = "start Month cannot be after current Month"
            defpackage.i.h(r2)
            throw r5
        L30:
            if (r6 == 0) goto L43
            java.util.Calendar r6 = r6.A
            java.util.Calendar r0 = r4.A
            int r6 = r6.compareTo(r0)
            if (r6 > 0) goto L3d
            goto L43
        L3d:
            java.lang.String r2 = "current Month cannot be after end Month"
            defpackage.i.h(r2)
            throw r5
        L43:
            if (r7 < 0) goto L62
            java.util.Calendar r6 = defpackage.uj7.c(r5)
            r0 = 7
            int r6 = r6.getMaximum(r0)
            if (r7 > r6) goto L62
            int r5 = r3.d(r4)
            int r5 = r5 + 1
            r2.Z = r5
            int r4 = r4.L
            int r3 = r3.L
            int r4 = r4 - r3
            int r4 = r4 + 1
            r2.Y = r4
            return
        L62:
            java.lang.String r2 = "firstDayOfWeek is not valid"
            defpackage.i.h(r2)
            throw r5
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.fb0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            fb0 r5 = (defpackage.fb0) r5
            i74 r1 = r4.A
            i74 r3 = r5.A
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3b
            i74 r1 = r4.B
            i74 r3 = r5.B
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3b
            i74 r1 = r4.R
            i74 r3 = r5.R
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L3b
            int r1 = r4.X
            int r3 = r5.X
            if (r1 != r3) goto L3b
            dc1 r4 = r4.L
            dc1 r5 = r5.L
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L3b
            return r0
        L3b:
            return r2
    }

    public final int hashCode() {
            r4 = this;
            int r0 = r4.X
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            dc1 r1 = r4.L
            i74 r2 = r4.A
            i74 r3 = r4.B
            i74 r4 = r4.R
            java.lang.Object[] r4 = new java.lang.Object[]{r2, r3, r4, r0, r1}
            int r4 = java.util.Arrays.hashCode(r4)
            return r4
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            i74 r3 = r1.A
            r0 = 0
            r2.writeParcelable(r3, r0)
            i74 r3 = r1.B
            r2.writeParcelable(r3, r0)
            i74 r3 = r1.R
            r2.writeParcelable(r3, r0)
            dc1 r3 = r1.L
            r2.writeParcelable(r3, r0)
            int r1 = r1.X
            r2.writeInt(r1)
            return
    }
}
