package a8;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.c1;
import androidx.fragment.app.i1;
import androidx.fragment.app.m1;
import androidx.preference.b0;
import androidx.preference.m0;
import androidx.preference.n0;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.material.datepicker.q;
import j7.p1;
import j7.q1;
import java.util.ArrayList;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f666a;

    /* JADX WARN: Type inference failed for: r0v14, types: [android.view.View$BaseSavedState, java.lang.Object, ba.b] */
    /* JADX WARN: Type inference failed for: r0v26, types: [android.view.View$BaseSavedState, f6.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.fragment.app.c1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [j7.b0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, j7.p1] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, j7.q1] */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.fragment.app.i1, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Long valueOf;
        Long valueOf2;
        boolean z10;
        Long valueOf3;
        Intent intent;
        boolean z11;
        boolean z12;
        switch (this.f666a) {
            case 0:
                return new m(parcel);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new androidx.fragment.app.b(parcel);
            case 2:
                return new androidx.fragment.app.c(parcel);
            case 3:
                ?? obj = new Object();
                obj.A = parcel.readString();
                obj.B = parcel.readInt();
                return obj;
            case 4:
                ?? obj2 = new Object();
                obj2.X = null;
                obj2.Y = new ArrayList();
                obj2.Z = new ArrayList();
                obj2.A = parcel.createStringArrayList();
                obj2.B = parcel.createStringArrayList();
                obj2.L = (androidx.fragment.app.b[]) parcel.createTypedArray(androidx.fragment.app.b.CREATOR);
                obj2.R = parcel.readInt();
                obj2.X = parcel.readString();
                obj2.Y = parcel.createStringArrayList();
                obj2.Z = parcel.createTypedArrayList(androidx.fragment.app.c.CREATOR);
                obj2.f1339b0 = parcel.createTypedArrayList(c1.CREATOR);
                return obj2;
            case l1.c.f8511g /* 5 */:
                return new m1(parcel);
            case l1.c.f8509e /* 6 */:
                return new androidx.preference.c(parcel);
            case 7:
                return new androidx.preference.f(parcel);
            case 8:
                return new androidx.preference.i(parcel);
            case l1.c.f8508d /* 9 */:
                return new androidx.preference.m(parcel);
            case l1.c.f8510f /* 10 */:
                return new b0(parcel);
            case 11:
                return new m0(parcel);
            case 12:
                return new n0(parcel);
            case 13:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.A = ((Integer) parcel.readValue(ba.b.class.getClassLoader())).intValue();
                return baseSavedState;
            case 14:
                return new com.google.android.material.datepicker.b((q) parcel.readParcelable(q.class.getClassLoader()), (q) parcel.readParcelable(q.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (q) parcel.readParcelable(q.class.getClassLoader()), parcel.readInt());
            case l1.c.f8512h /* 15 */:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 16:
                return q.a(parcel.readInt(), parcel.readInt());
            case 17:
                return new ParcelImpl(parcel);
            case 18:
                parcel.getClass();
                return new eg.c(parcel.readString(), parcel.readString(), parcel.readString());
            case 19:
                parcel.getClass();
                return new eg.h(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
            case 20:
                ?? baseSavedState2 = new View.BaseSavedState(parcel);
                baseSavedState2.A = parcel.readInt();
                return baseSavedState2;
            case 21:
                parcel.getClass();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(parcel.readLong());
                }
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i2 = 0; i2 != readInt; i2++) {
                    arrayList.add(fg.b.CREATOR.createFromParcel(parcel));
                }
                return new fg.a(valueOf, readString, arrayList);
            case 22:
                parcel.getClass();
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Long.valueOf(parcel.readLong());
                }
                Long l10 = valueOf2;
                long readLong = parcel.readLong();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return new fg.b(l10, readLong, readString2, readString3, readString4, z10);
            case 23:
                parcel.getClass();
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(parcel.readLong());
                }
                Long l11 = valueOf3;
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i10 = 0; i10 != readInt2; i10++) {
                    arrayList2.add(fg.a.CREATOR.createFromParcel(parcel));
                }
                return new fg.c(l11, readString5, readString6, readString7, arrayList2);
            case 24:
                parcel.getClass();
                int readInt3 = parcel.readInt();
                if (parcel.readInt() == 0) {
                    intent = null;
                } else {
                    intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
                }
                return new h.a(intent, readInt3);
            case 25:
                parcel.getClass();
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                readParcelable.getClass();
                return new h.j((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 26:
                ?? obj3 = new Object();
                obj3.A = parcel.readInt();
                obj3.B = parcel.readInt();
                boolean z13 = true;
                if (parcel.readInt() != 1) {
                    z13 = false;
                }
                obj3.L = z13;
                return obj3;
            case 27:
                ?? obj4 = new Object();
                obj4.A = parcel.readInt();
                obj4.B = parcel.readInt();
                boolean z14 = true;
                if (parcel.readInt() != 1) {
                    z14 = false;
                }
                obj4.R = z14;
                int readInt4 = parcel.readInt();
                if (readInt4 > 0) {
                    int[] iArr = new int[readInt4];
                    obj4.L = iArr;
                    parcel.readIntArray(iArr);
                }
                return obj4;
            default:
                ?? obj5 = new Object();
                obj5.A = parcel.readInt();
                obj5.B = parcel.readInt();
                int readInt5 = parcel.readInt();
                obj5.L = readInt5;
                if (readInt5 > 0) {
                    int[] iArr2 = new int[readInt5];
                    obj5.R = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt6 = parcel.readInt();
                obj5.X = readInt6;
                if (readInt6 > 0) {
                    int[] iArr3 = new int[readInt6];
                    obj5.Y = iArr3;
                    parcel.readIntArray(iArr3);
                }
                boolean z15 = false;
                if (parcel.readInt() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                obj5.f7656b0 = z11;
                if (parcel.readInt() == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                obj5.f7657c0 = z12;
                if (parcel.readInt() == 1) {
                    z15 = true;
                }
                obj5.f7658d0 = z15;
                obj5.Z = parcel.readArrayList(p1.class.getClassLoader());
                return obj5;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f666a) {
            case 0:
                return new m[i2];
            case DSiCameraSource.FrontCamera /* 1 */:
                return new androidx.fragment.app.b[i2];
            case 2:
                return new androidx.fragment.app.c[i2];
            case 3:
                return new c1[i2];
            case 4:
                return new i1[i2];
            case l1.c.f8511g /* 5 */:
                return new m1[i2];
            case l1.c.f8509e /* 6 */:
                return new androidx.preference.c[i2];
            case 7:
                return new androidx.preference.f[i2];
            case 8:
                return new androidx.preference.i[i2];
            case l1.c.f8508d /* 9 */:
                return new androidx.preference.m[i2];
            case l1.c.f8510f /* 10 */:
                return new b0[i2];
            case 11:
                return new m0[i2];
            case 12:
                return new n0[i2];
            case 13:
                return new ba.b[i2];
            case 14:
                return new com.google.android.material.datepicker.b[i2];
            case l1.c.f8512h /* 15 */:
                return new com.google.android.material.datepicker.d[i2];
            case 16:
                return new q[i2];
            case 17:
                return new ParcelImpl[i2];
            case 18:
                return new eg.c[i2];
            case 19:
                return new eg.h[i2];
            case 20:
                return new f6.g[i2];
            case 21:
                return new fg.a[i2];
            case 22:
                return new fg.b[i2];
            case 23:
                return new fg.c[i2];
            case 24:
                return new h.a[i2];
            case 25:
                return new h.j[i2];
            case 26:
                return new j7.b0[i2];
            case 27:
                return new p1[i2];
            default:
                return new q1[i2];
        }
    }
}
