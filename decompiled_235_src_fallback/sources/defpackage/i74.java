package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i74  reason: default package */
/* loaded from: classes.dex */
public final class i74 implements java.lang.Comparable, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.i74> CREATOR = null;
    public final java.util.Calendar A;
    public final int B;
    public final int L;
    public final int R;
    public final int X;
    public final long Y;
    public java.lang.String Z;

    static {
            y8 r0 = new y8
            r1 = 20
            r0.<init>(r1)
            defpackage.i74.CREATOR = r0
            return
    }

    public i74(java.util.Calendar r4) {
            r3 = this;
            r3.<init>()
            r0 = 5
            r1 = 1
            r4.set(r0, r1)
            java.util.Calendar r4 = defpackage.uj7.a(r4)
            r3.A = r4
            r2 = 2
            int r2 = r4.get(r2)
            r3.B = r2
            int r1 = r4.get(r1)
            r3.L = r1
            r1 = 7
            int r1 = r4.getMaximum(r1)
            r3.R = r1
            int r0 = r4.getActualMaximum(r0)
            r3.X = r0
            long r0 = r4.getTimeInMillis()
            r3.Y = r0
            return
    }

    public static defpackage.i74 a(int r2, int r3) {
            r0 = 0
            java.util.Calendar r0 = defpackage.uj7.c(r0)
            r1 = 1
            r0.set(r1, r2)
            r2 = 2
            r0.set(r2, r3)
            i74 r2 = new i74
            r2.<init>(r0)
            return r2
    }

    public static defpackage.i74 b(long r1) {
            r0 = 0
            java.util.Calendar r0 = defpackage.uj7.c(r0)
            r0.setTimeInMillis(r1)
            i74 r1 = new i74
            r1.<init>(r0)
            return r1
    }

    public final java.lang.String c() {
            r4 = this;
            java.lang.String r0 = r4.Z
            if (r0 != 0) goto L2f
            java.util.Calendar r0 = r4.A
            long r0 = r0.getTimeInMillis()
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.util.concurrent.atomic.AtomicReference r3 = defpackage.uj7.a
            java.lang.String r3 = "yMMMM"
            android.icu.text.DateFormat r2 = android.icu.text.DateFormat.getInstanceForSkeleton(r3, r2)
            java.lang.String r3 = "UTC"
            android.icu.util.TimeZone r3 = android.icu.util.TimeZone.getTimeZone(r3)
            r2.setTimeZone(r3)
            android.icu.text.DisplayContext r3 = android.icu.text.DisplayContext.CAPITALIZATION_FOR_STANDALONE
            r2.setContext(r3)
            java.util.Date r3 = new java.util.Date
            r3.<init>(r0)
            java.lang.String r0 = r2.format(r3)
            r4.Z = r0
        L2f:
            java.lang.String r4 = r4.Z
            return r4
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r1) {
            r0 = this;
            i74 r1 = (defpackage.i74) r1
            java.util.Calendar r0 = r0.A
            java.util.Calendar r1 = r1.A
            int r0 = r0.compareTo(r1)
            return r0
    }

    public final int d(defpackage.i74 r3) {
            r2 = this;
            java.util.Calendar r0 = r2.A
            boolean r0 = r0 instanceof java.util.GregorianCalendar
            if (r0 == 0) goto L14
            int r0 = r3.L
            int r1 = r2.L
            int r0 = r0 - r1
            int r0 = r0 * 12
            int r3 = r3.B
            int r2 = r2.B
            int r3 = r3 - r2
            int r3 = r3 + r0
            return r3
        L14:
            java.lang.String r2 = "Only Gregorian calendars are supported."
            defpackage.i.h(r2)
            r2 = 0
            return r2
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
            boolean r1 = r5 instanceof defpackage.i74
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            i74 r5 = (defpackage.i74) r5
            int r1 = r4.B
            int r3 = r5.B
            if (r1 != r3) goto L19
            int r4 = r4.L
            int r5 = r5.L
            if (r4 != r5) goto L19
            return r0
        L19:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.B
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r1.L
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}
            int r1 = java.util.Arrays.hashCode(r1)
            return r1
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.L
            r1.writeInt(r2)
            int r0 = r0.B
            r1.writeInt(r0)
            return
    }
}
