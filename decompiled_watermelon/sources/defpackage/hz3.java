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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hz3  reason: default package */
/* loaded from: classes.dex */
public final class hz3 implements Comparable, Parcelable {
    public static final Parcelable.Creator<hz3> CREATOR = new x8(20);
    public final Calendar A;
    public final int B;
    public final int L;
    public final int R;
    public final int X;
    public final long Y;
    public String Z;

    public hz3(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a = z57.a(calendar);
        this.A = a;
        this.B = a.get(2);
        this.L = a.get(1);
        this.R = a.getMaximum(7);
        this.X = a.getActualMaximum(5);
        this.Y = a.getTimeInMillis();
    }

    public static hz3 a(int i, int i2) {
        Calendar c = z57.c(null);
        c.set(1, i);
        c.set(2, i2);
        return new hz3(c);
    }

    public static hz3 b(long j) {
        Calendar c = z57.c(null);
        c.setTimeInMillis(j);
        return new hz3(c);
    }

    public final String c() {
        if (this.Z == null) {
            long timeInMillis = this.A.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = z57.a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.Z = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.Z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.A.compareTo(((hz3) obj).A);
    }

    public final int d(hz3 hz3Var) {
        if (this.A instanceof GregorianCalendar) {
            return (hz3Var.B - this.B) + ((hz3Var.L - this.L) * 12);
        }
        i.i("Only Gregorian calendars are supported.");
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
        if (!(obj instanceof hz3)) {
            return false;
        }
        hz3 hz3Var = (hz3) obj;
        if (this.B == hz3Var.B && this.L == hz3Var.L) {
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
