package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r11  reason: default package */
/* loaded from: classes.dex */
public final class r11 implements Parcelable {
    public static final q11 CREATOR = new Object();
    public final m11 A;

    public r11(Parcel parcel) {
        u86 u86Var;
        boolean z;
        boolean z2;
        boolean z3;
        Integer num;
        int readInt = parcel.readInt();
        ip3 ip3Var = new ip3(readInt);
        for (int i = 0; i < readInt; i++) {
            Parcelable Q = hi2.Q(parcel, k03.class.getClassLoader(), k03.class);
            if (Q != null) {
                ip3Var.add(((k03) Q).A);
            } else {
                i.i("Required value was null.");
                throw null;
            }
        }
        ip3 t = l07.t(ip3Var);
        if (parcel.dataAvail() > 0) {
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readByte() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            float readFloat = parcel.readFloat();
            if (parcel.dataAvail() <= 0 ? readInt2 != Integer.MIN_VALUE : parcel.readByte() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            Integer valueOf = Integer.valueOf(readInt2);
            if (readInt2 != Integer.MIN_VALUE) {
                num = valueOf;
            } else {
                num = null;
            }
            u86Var = new u86(num, z3, readInt3, readInt4, z, z2, readFloat);
        } else {
            u86Var = new u86();
        }
        this.A = new m11(t, u86Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.getClass();
        m11 m11Var = this.A;
        ArrayList arrayList = m11Var.b;
        parcel.writeInt(arrayList.size());
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            parcel.writeParcelable(new k03((f03) obj), i);
        }
        u86 u86Var = m11Var.a;
        Integer num = u86Var.a;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = Integer.MIN_VALUE;
        }
        parcel.writeInt(i2);
        parcel.writeInt(u86Var.c);
        parcel.writeInt(u86Var.d);
        parcel.writeByte(u86Var.e ? (byte) 1 : (byte) 0);
        parcel.writeByte(u86Var.f ? (byte) 1 : (byte) 0);
        parcel.writeFloat(u86Var.g);
        parcel.writeByte(u86Var.b ? (byte) 1 : (byte) 0);
    }

    public r11(m11 m11Var) {
        m11Var.getClass();
        this.A = m11Var;
    }
}
