package com.google.android.material.datepicker;

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
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q implements Comparable, Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new a8.l(16);
    public final Calendar A;
    public final int B;
    public final int L;
    public final int R;
    public final int X;
    public final long Y;
    public String Z;

    public q(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a10 = x.a(calendar);
        this.A = a10;
        this.B = a10.get(2);
        this.L = a10.get(1);
        this.R = a10.getMaximum(7);
        this.X = a10.getActualMaximum(5);
        this.Y = a10.getTimeInMillis();
    }

    public static q a(int i2, int i10) {
        Calendar c4 = x.c(null);
        c4.set(1, i2);
        c4.set(2, i10);
        return new q(c4);
    }

    public static q b(long j2) {
        Calendar c4 = x.c(null);
        c4.setTimeInMillis(j2);
        return new q(c4);
    }

    public final String c() {
        if (this.Z == null) {
            long timeInMillis = this.A.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = x.f3064a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.Z = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.Z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.A.compareTo(((q) obj).A);
    }

    public final int d(q qVar) {
        if (this.A instanceof GregorianCalendar) {
            return (qVar.B - this.B) + ((qVar.L - this.L) * 12);
        }
        a0.j.h("Only Gregorian calendars are supported.");
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
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.B == qVar.B && this.L == qVar.L) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.B), Integer.valueOf(this.L)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.L);
        parcel.writeInt(this.B);
    }
}
