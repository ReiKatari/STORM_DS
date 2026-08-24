package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fb0  reason: default package */
/* loaded from: classes.dex */
public final class fb0 implements Parcelable {
    public static final Parcelable.Creator<fb0> CREATOR = new y8(5);
    public final i74 A;
    public final i74 B;
    public final dc1 L;
    public final i74 R;
    public final int X;
    public final int Y;
    public final int Z;

    public fb0(i74 i74Var, i74 i74Var2, dc1 dc1Var, i74 i74Var3, int i) {
        Objects.requireNonNull(i74Var, "start cannot be null");
        Objects.requireNonNull(i74Var2, "end cannot be null");
        Objects.requireNonNull(dc1Var, "validator cannot be null");
        this.A = i74Var;
        this.B = i74Var2;
        this.R = i74Var3;
        this.X = i;
        this.L = dc1Var;
        if (i74Var3 != null && i74Var.A.compareTo(i74Var3.A) > 0) {
            i.h("start Month cannot be after current Month");
            throw null;
        } else if (i74Var3 != null && i74Var3.A.compareTo(i74Var2.A) > 0) {
            i.h("current Month cannot be after end Month");
            throw null;
        } else if (i >= 0 && i <= uj7.c(null).getMaximum(7)) {
            this.Z = i74Var.d(i74Var2) + 1;
            this.Y = (i74Var2.L - i74Var.L) + 1;
        } else {
            i.h("firstDayOfWeek is not valid");
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
        if (!(obj instanceof fb0)) {
            return false;
        }
        fb0 fb0Var = (fb0) obj;
        if (this.A.equals(fb0Var.A) && this.B.equals(fb0Var.B) && Objects.equals(this.R, fb0Var.R) && this.X == fb0Var.X && this.L.equals(fb0Var.L)) {
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
