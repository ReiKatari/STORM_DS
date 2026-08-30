package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a8.l(14);
    public final q A;
    public final q B;
    public final d L;
    public final q R;
    public final int X;
    public final int Y;
    public final int Z;

    public b(q qVar, q qVar2, d dVar, q qVar3, int i2) {
        Objects.requireNonNull(qVar, "start cannot be null");
        Objects.requireNonNull(qVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.A = qVar;
        this.B = qVar2;
        this.R = qVar3;
        this.X = i2;
        this.L = dVar;
        if (qVar3 != null && qVar.A.compareTo(qVar3.A) > 0) {
            a0.j.h("start Month cannot be after current Month");
            throw null;
        } else if (qVar3 != null && qVar3.A.compareTo(qVar2.A) > 0) {
            a0.j.h("current Month cannot be after end Month");
            throw null;
        } else if (i2 >= 0 && i2 <= x.c(null).getMaximum(7)) {
            this.Z = qVar.d(qVar2) + 1;
            this.Y = (qVar2.L - qVar.L) + 1;
        } else {
            a0.j.h("firstDayOfWeek is not valid");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.A.equals(bVar.A) && this.B.equals(bVar.B) && Objects.equals(this.R, bVar.R) && this.X == bVar.X && this.L.equals(bVar.L)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A, this.B, this.R, Integer.valueOf(this.X), this.L});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.A, 0);
        parcel.writeParcelable(this.B, 0);
        parcel.writeParcelable(this.R, 0);
        parcel.writeParcelable(this.L, 0);
        parcel.writeInt(this.X);
    }
}
