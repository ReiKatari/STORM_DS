package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.b;
import androidx.fragment.app.w;
import androidx.versionedparcelable.ParcelImpl;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.ArrayList;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y8  reason: default package */
/* loaded from: classes.dex */
public final class y8 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View$BaseSavedState, java.lang.Object, ds] */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.lang.Object, il2] */
    /* JADX WARN: Type inference failed for: r10v20, types: [ml2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v25, types: [hv3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v27, types: [android.view.View$BaseSavedState, java.lang.Object, h24] */
    /* JADX WARN: Type inference failed for: r10v32, types: [android.view.View$BaseSavedState, ie4, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        Intent intent = null;
        Long valueOf = null;
        Long valueOf2 = null;
        Long l = null;
        boolean z3 = false;
        boolean z4 = false;
        switch (this.a) {
            case 0:
                parcel.getClass();
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
                }
                return new z8(intent, readInt);
            case 1:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                if (parcel.readByte() != 0) {
                    z3 = true;
                }
                baseSavedState.A = z3;
                return baseSavedState;
            case 2:
                return new b(parcel);
            case 3:
                return new l00(parcel);
            case 4:
                parcel.getClass();
                return new g10(parcel.readString(), parcel.readString(), parcel.readString());
            case 5:
                return new fb0((i74) parcel.readParcelable(i74.class.getClassLoader()), (i74) parcel.readParcelable(i74.class.getClassLoader()), (dc1) parcel.readParcelable(dc1.class.getClassLoader()), (i74) parcel.readParcelable(i74.class.getClassLoader()), parcel.readInt());
            case 6:
                parcel.getClass();
                if (parcel.readInt() != 0) {
                    l = Long.valueOf(parcel.readLong());
                }
                String readString = parcel.readString();
                int readInt2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt2);
                for (int i = 0; i != readInt2; i++) {
                    arrayList.add(ho0.CREATOR.createFromParcel(parcel));
                }
                return new dn0(l, readString, arrayList);
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
                return new ho0(l2, readLong, readString2, readString3, readString4, z);
            case 8:
                return new dc1(parcel.readLong());
            case 9:
                return new pe1(parcel.readInt());
            case 10:
                return new es1(parcel);
            case 11:
                ?? obj = new Object();
                obj.A = parcel.readString();
                obj.B = parcel.readInt();
                return obj;
            case 12:
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
                obj2.Z = parcel.createTypedArrayList(l00.CREATOR);
                obj2.d0 = parcel.createTypedArrayList(il2.CREATOR);
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
                for (int i2 = 0; i2 != readInt3; i2++) {
                    arrayList2.add(dn0.CREATOR.createFromParcel(parcel));
                }
                return new pp2(l3, readString5, readString6, readString7, arrayList2);
            case 15:
                parcel.getClass();
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                readParcelable.getClass();
                return new s93((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 16:
                ?? obj3 = new Object();
                obj3.A = parcel.readInt();
                obj3.B = parcel.readInt();
                if (parcel.readInt() == 1) {
                    z4 = true;
                }
                obj3.L = z4;
                return obj3;
            case 17:
                return new bx3(parcel);
            case 18:
                ?? baseSavedState2 = new View.BaseSavedState(parcel);
                baseSavedState2.A = ((Integer) parcel.readValue(h24.class.getClassLoader())).intValue();
                return baseSavedState2;
            case 19:
                String readString8 = parcel.readString();
                readString8.getClass();
                int readInt4 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt4);
                for (int i3 = 0; i3 < readInt4; i3++) {
                    String readString9 = parcel.readString();
                    readString9.getClass();
                    String readString10 = parcel.readString();
                    readString10.getClass();
                    linkedHashMap.put(readString9, readString10);
                }
                return new c44(readString8, linkedHashMap);
            case 20:
                return i74.a(parcel.readInt(), parcel.readInt());
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return new z84(parcel);
            case 22:
                ?? baseSavedState3 = new View.BaseSavedState(parcel);
                baseSavedState3.A = parcel.readInt();
                return baseSavedState3;
            case ConnectionResult.API_DISABLED /* 23 */:
                return new ParcelImpl(parcel);
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return new rs4(parcel.readFloat());
            case 25:
                return new ss4(parcel.readInt());
            case SubAllocator.N4 /* 26 */:
                return new ts4(parcel.readLong());
            case 27:
                return new v05(parcel);
            case 28:
                return new r15(parcel);
            default:
                parcel.getClass();
                String readString11 = parcel.readString();
                int readInt5 = parcel.readInt();
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return new mx5(readString11, readInt5, readString12, readString13, z2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new z8[i];
            case 1:
                return new ds[i];
            case 2:
                return new b[i];
            case 3:
                return new l00[i];
            case 4:
                return new g10[i];
            case 5:
                return new fb0[i];
            case 6:
                return new dn0[i];
            case 7:
                return new ho0[i];
            case 8:
                return new dc1[i];
            case 9:
                return new pe1[i];
            case 10:
                return new es1[i];
            case 11:
                return new il2[i];
            case 12:
                return new ml2[i];
            case 13:
                return new w[i];
            case 14:
                return new pp2[i];
            case 15:
                return new s93[i];
            case 16:
                return new hv3[i];
            case 17:
                return new bx3[i];
            case 18:
                return new h24[i];
            case 19:
                return new c44[i];
            case 20:
                return new i74[i];
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return new z84[i];
            case 22:
                return new ie4[i];
            case ConnectionResult.API_DISABLED /* 23 */:
                return new ParcelImpl[i];
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return new rs4[i];
            case 25:
                return new ss4[i];
            case SubAllocator.N4 /* 26 */:
                return new ts4[i];
            case 27:
                return new v05[i];
            case 28:
                return new r15[i];
            default:
                return new mx5[i];
        }
    }
}
