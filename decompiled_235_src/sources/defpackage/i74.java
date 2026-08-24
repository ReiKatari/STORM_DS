package defpackage;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i74  reason: default package */
/* loaded from: classes.dex */
public final class i74 implements Comparable, Parcelable {
    public static final Parcelable.Creator<i74> CREATOR = new y8(20);
    public final Calendar A;
    public final int B;
    public final int L;
    public final int R;
    public final int X;
    public final long Y;
    public String Z;

    public i74(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a = uj7.a(calendar);
        this.A = a;
        this.B = a.get(2);
        this.L = a.get(1);
        this.R = a.getMaximum(7);
        this.X = a.getActualMaximum(5);
        this.Y = a.getTimeInMillis();
    }

    public static i74 a(int i, int i2) {
        Calendar c = uj7.c(null);
        c.set(1, i);
        c.set(2, i2);
        return new i74(c);
    }

    public static i74 b(long j) {
        Calendar c = uj7.c(null);
        c.setTimeInMillis(j);
        return new i74(c);
    }

    public final String c() {
        if (this.Z == null) {
            long timeInMillis = this.A.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = uj7.a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.Z = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.Z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.A.compareTo(((i74) obj).A);
    }

    public final int d(i74 i74Var) {
        if (this.A instanceof GregorianCalendar) {
            return (i74Var.B - this.B) + ((i74Var.L - this.L) * 12);
        }
        i.h("Only Gregorian calendars are supported.");
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i74)) {
            return false;
        }
        i74 i74Var = (i74) obj;
        if (this.B == i74Var.B && this.L == i74Var.L) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.B), Integer.valueOf(this.L)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.L);
        parcel.writeInt(this.B);
    }
}
