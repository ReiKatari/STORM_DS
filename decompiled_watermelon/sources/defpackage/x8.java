package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.b;
import androidx.fragment.app.w;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x8  reason: default package */
/* loaded from: classes.dex */
public final class x8 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View$BaseSavedState, qr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v21, types: [jg2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v22, types: [ng2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v27, types: [java.lang.Object, fo3] */
    /* JADX WARN: Type inference failed for: r10v29, types: [android.view.View$BaseSavedState, yu3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v34, types: [android.view.View$BaseSavedState, c64, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        Intent intent = null;
        Long valueOf = null;
        Long valueOf2 = null;
        Long l = null;
        boolean z2 = true;
        int i = 0;
        switch (this.a) {
            case 0:
                parcel.getClass();
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
                }
                return new y8(intent, readInt);
            case 1:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                if (parcel.readByte() == 0) {
                    z2 = false;
                }
                baseSavedState.A = z2;
                return baseSavedState;
            case 2:
                return new b(parcel);
            case 3:
                return new uy(parcel);
            case 4:
                parcel.getClass();
                return new pz(parcel.readString(), parcel.readString(), parcel.readString());
            case 5:
                return new x80((hz3) parcel.readParcelable(hz3.class.getClassLoader()), (hz3) parcel.readParcelable(hz3.class.getClassLoader()), (m81) parcel.readParcelable(m81.class.getClassLoader()), (hz3) parcel.readParcelable(hz3.class.getClassLoader()), parcel.readInt());
            case ig7.b /* 6 */:
                parcel.getClass();
                if (parcel.readInt() != 0) {
                    l = Long.valueOf(parcel.readLong());
                }
                String readString = parcel.readString();
                int readInt2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList.add(zl0.CREATOR.createFromParcel(parcel));
                }
                return new vk0(l, readString, arrayList);
            case 7:
                parcel.getClass();
                if (parcel.readInt() != 0) {
                    valueOf2 = Long.valueOf(parcel.readLong());
                }
                Long l2 = valueOf2;
                long readLong = parcel.readLong();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new zl0(l2, readLong, readString2, readString3, readString4, z);
            case 8:
                return new m81(parcel.readLong());
            case 9:
                return new ta1(parcel.readInt());
            case 10:
                return new un1(parcel);
            case 11:
                ?? obj = new Object();
                obj.A = parcel.readString();
                obj.B = parcel.readInt();
                return obj;
            case mj2.L /* 12 */:
                ?? obj2 = new Object();
                obj2.X = null;
                obj2.Y = new ArrayList();
                obj2.Z = new ArrayList();
                obj2.A = parcel.createStringArrayList();
                obj2.B = parcel.createStringArrayList();
                obj2.L = (b[]) parcel.createTypedArray(b.CREATOR);
                obj2.R = parcel.readInt();
                obj2.X = parcel.readString();
                obj2.Y = parcel.createStringArrayList();
                obj2.Z = parcel.createTypedArrayList(uy.CREATOR);
                obj2.c0 = parcel.createTypedArrayList(jg2.CREATOR);
                return obj2;
            case 13:
                return new w(parcel);
            case 14:
                parcel.getClass();
                if (parcel.readInt() != 0) {
                    valueOf = Long.valueOf(parcel.readLong());
                }
                Long l3 = valueOf;
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                int readInt3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt3);
                while (i != readInt3) {
                    arrayList2.add(vk0.CREATOR.createFromParcel(parcel));
                    i++;
                }
                return new kk2(l3, readString5, readString6, readString7, arrayList2);
            case ig7.e /* 15 */:
                parcel.getClass();
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                readParcelable.getClass();
                return new k33((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 16:
                ?? obj3 = new Object();
                obj3.A = parcel.readInt();
                obj3.B = parcel.readInt();
                if (parcel.readInt() != 1) {
                    z2 = false;
                }
                obj3.L = z2;
                return obj3;
            case 17:
                return new zp3(parcel);
            case 18:
                ?? baseSavedState2 = new View.BaseSavedState(parcel);
                baseSavedState2.A = ((Integer) parcel.readValue(yu3.class.getClassLoader())).intValue();
                return baseSavedState2;
            case 19:
                String readString8 = parcel.readString();
                readString8.getClass();
                int readInt4 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt4);
                while (i < readInt4) {
                    String readString9 = parcel.readString();
                    readString9.getClass();
                    String readString10 = parcel.readString();
                    readString10.getClass();
                    linkedHashMap.put(readString9, readString10);
                    i++;
                }
                return new ow3(readString8, linkedHashMap);
            case 20:
                return hz3.a(parcel.readInt(), parcel.readInt());
            case 21:
                return new t04(parcel);
            case 22:
                ?? baseSavedState3 = new View.BaseSavedState(parcel);
                baseSavedState3.A = parcel.readInt();
                return baseSavedState3;
            case 23:
                return new ParcelImpl(parcel);
            case 24:
                return new pj4(parcel.readFloat());
            case 25:
                return new qj4(parcel.readInt());
            case 26:
                return new rj4(parcel.readLong());
            case 27:
                return new sr4(parcel);
            case 28:
                return new ps4(parcel);
            default:
                parcel.getClass();
                return new xm5(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new y8[i];
            case 1:
                return new qr[i];
            case 2:
                return new b[i];
            case 3:
                return new uy[i];
            case 4:
                return new pz[i];
            case 5:
                return new x80[i];
            case ig7.b /* 6 */:
                return new vk0[i];
            case 7:
                return new zl0[i];
            case 8:
                return new m81[i];
            case 9:
                return new ta1[i];
            case 10:
                return new un1[i];
            case 11:
                return new jg2[i];
            case mj2.L /* 12 */:
                return new ng2[i];
            case 13:
                return new w[i];
            case 14:
                return new kk2[i];
            case ig7.e /* 15 */:
                return new k33[i];
            case 16:
                return new fo3[i];
            case 17:
                return new zp3[i];
            case 18:
                return new yu3[i];
            case 19:
                return new ow3[i];
            case 20:
                return new hz3[i];
            case 21:
                return new t04[i];
            case 22:
                return new c64[i];
            case 23:
                return new ParcelImpl[i];
            case 24:
                return new pj4[i];
            case 25:
                return new qj4[i];
            case 26:
                return new rj4[i];
            case 27:
                return new sr4[i];
            case 28:
                return new ps4[i];
            default:
                return new xm5[i];
        }
    }
}
