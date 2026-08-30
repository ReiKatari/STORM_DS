package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x80  reason: default package */
/* loaded from: classes.dex */
public final class x80 implements Parcelable {
    public static final Parcelable.Creator<x80> CREATOR = new x8(5);
    public final hz3 A;
    public final hz3 B;
    public final m81 L;
    public final hz3 R;
    public final int X;
    public final int Y;
    public final int Z;

    public x80(hz3 hz3Var, hz3 hz3Var2, m81 m81Var, hz3 hz3Var3, int i) {
        Objects.requireNonNull(hz3Var, "start cannot be null");
        Objects.requireNonNull(hz3Var2, "end cannot be null");
        Objects.requireNonNull(m81Var, "validator cannot be null");
        this.A = hz3Var;
        this.B = hz3Var2;
        this.R = hz3Var3;
        this.X = i;
        this.L = m81Var;
        if (hz3Var3 != null && hz3Var.A.compareTo(hz3Var3.A) > 0) {
            i.i("start Month cannot be after current Month");
            throw null;
        } else if (hz3Var3 != null && hz3Var3.A.compareTo(hz3Var2.A) > 0) {
            i.i("current Month cannot be after end Month");
            throw null;
        } else if (i >= 0 && i <= z57.c(null).getMaximum(7)) {
            this.Z = hz3Var.d(hz3Var2) + 1;
            this.Y = (hz3Var2.L - hz3Var.L) + 1;
        } else {
            i.i("firstDayOfWeek is not valid");
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
        if (!(obj instanceof x80)) {
            return false;
        }
        x80 x80Var = (x80) obj;
        if (this.A.equals(x80Var.A) && this.B.equals(x80Var.B) && Objects.equals(this.R, x80Var.R) && this.X == x80Var.X && this.L.equals(x80Var.L)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A, this.B, this.R, Integer.valueOf(this.X), this.L});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A, 0);
        parcel.writeParcelable(this.B, 0);
        parcel.writeParcelable(this.R, 0);
        parcel.writeParcelable(this.L, 0);
        parcel.writeInt(this.X);
    }
}
