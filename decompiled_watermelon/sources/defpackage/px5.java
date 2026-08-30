package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: px5  reason: default package */
/* loaded from: classes.dex */
public final class px5 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, hd6] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, id6] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        switch (this.a) {
            case 0:
                return new qx5(parcel);
            case 1:
                ?? obj = new Object();
                obj.A = parcel.readInt();
                obj.B = parcel.readInt();
                if (parcel.readInt() != 1) {
                    z3 = false;
                }
                obj.R = z3;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    obj.L = iArr;
                    parcel.readIntArray(iArr);
                }
                return obj;
            case 2:
                ?? obj2 = new Object();
                obj2.A = parcel.readInt();
                obj2.B = parcel.readInt();
                int readInt2 = parcel.readInt();
                obj2.L = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    obj2.R = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                obj2.X = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    obj2.Y = iArr3;
                    parcel.readIntArray(iArr3);
                }
                if (parcel.readInt() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                obj2.c0 = z;
                if (parcel.readInt() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                obj2.d0 = z2;
                if (parcel.readInt() != 1) {
                    z3 = false;
                }
                obj2.e0 = z3;
                obj2.Z = parcel.readArrayList(hd6.class.getClassLoader());
                return obj2;
            case 3:
                return new bl6(parcel);
            default:
                return new az6(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new qx5[i];
            case 1:
                return new hd6[i];
            case 2:
                return new id6[i];
            case 3:
                return new bl6[i];
            default:
                return new az6[i];
        }
    }
}
