package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z41  reason: default package */
/* loaded from: classes.dex */
public final class z41 implements Parcelable {
    public static final y41 CREATOR = new Object();
    public final u41 A;

    public z41(Parcel parcel) {
        kk6 kk6Var;
        boolean z;
        boolean z2;
        boolean z3;
        Integer num;
        int readInt = parcel.readInt();
        kw3 kw3Var = new kw3(readInt);
        for (int i = 0; i < readInt; i++) {
            Parcelable H = xk2.H(parcel, n63.class.getClassLoader(), n63.class);
            if (H != null) {
                kw3Var.add(((n63) H).A);
            } else {
                i.h("Required value was null.");
                throw null;
            }
        }
        kw3 A = hf.A(kw3Var);
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
            kk6Var = new kk6(num, z3, readInt3, readInt4, z, z2, readFloat);
        } else {
            kk6Var = new kk6();
        }
        this.A = new u41(A, kk6Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.getClass();
        u41 u41Var = this.A;
        ArrayList arrayList = u41Var.b;
        parcel.writeInt(arrayList.size());
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            parcel.writeParcelable(new n63((i63) obj), i);
        }
        kk6 kk6Var = u41Var.a;
        Integer num = kk6Var.a;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = Integer.MIN_VALUE;
        }
        parcel.writeInt(i2);
        parcel.writeInt(kk6Var.c);
        parcel.writeInt(kk6Var.d);
        parcel.writeByte(kk6Var.e ? (byte) 1 : (byte) 0);
        parcel.writeByte(kk6Var.f ? (byte) 1 : (byte) 0);
        parcel.writeFloat(kk6Var.g);
        parcel.writeByte(kk6Var.b ? (byte) 1 : (byte) 0);
    }

    public z41(u41 u41Var) {
        u41Var.getClass();
        this.A = u41Var;
    }
}
