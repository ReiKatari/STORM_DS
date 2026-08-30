package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new x8(2);
    public final int[] A;
    public final ArrayList B;
    public final int[] L;
    public final int[] R;
    public final int X;
    public final String Y;
    public final int Z;
    public final int c0;
    public final CharSequence d0;
    public final int e0;
    public final CharSequence f0;
    public final ArrayList g0;
    public final ArrayList h0;
    public final boolean i0;

    public b(a aVar) {
        String str;
        int size = aVar.c.size();
        this.A = new int[size * 6];
        if (aVar.i) {
            this.B = new ArrayList(size);
            this.L = new int[size];
            this.R = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                vg2 vg2Var = (vg2) aVar.c.get(i2);
                int i3 = i + 1;
                this.A[i] = vg2Var.a;
                ArrayList arrayList = this.B;
                o oVar = vg2Var.b;
                if (oVar != null) {
                    str = oVar.mWho;
                } else {
                    str = null;
                }
                arrayList.add(str);
                int[] iArr = this.A;
                iArr[i3] = vg2Var.c ? 1 : 0;
                iArr[i + 2] = vg2Var.d;
                iArr[i + 3] = vg2Var.e;
                int i4 = i + 5;
                iArr[i + 4] = vg2Var.f;
                i += 6;
                iArr[i4] = vg2Var.g;
                this.L[i2] = vg2Var.h.ordinal();
                this.R[i2] = vg2Var.i.ordinal();
            }
            this.X = aVar.h;
            this.Y = aVar.k;
            this.Z = aVar.v;
            this.c0 = aVar.l;
            this.d0 = aVar.m;
            this.e0 = aVar.n;
            this.f0 = aVar.o;
            this.g0 = aVar.p;
            this.h0 = aVar.q;
            this.i0 = aVar.r;
            return;
        }
        defpackage.i.n("Not on back stack");
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.A);
        parcel.writeStringList(this.B);
        parcel.writeIntArray(this.L);
        parcel.writeIntArray(this.R);
        parcel.writeInt(this.X);
        parcel.writeString(this.Y);
        parcel.writeInt(this.Z);
        parcel.writeInt(this.c0);
        TextUtils.writeToParcel(this.d0, parcel, 0);
        parcel.writeInt(this.e0);
        TextUtils.writeToParcel(this.f0, parcel, 0);
        parcel.writeStringList(this.g0);
        parcel.writeStringList(this.h0);
        parcel.writeInt(this.i0 ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.A = parcel.createIntArray();
        this.B = parcel.createStringArrayList();
        this.L = parcel.createIntArray();
        this.R = parcel.createIntArray();
        this.X = parcel.readInt();
        this.Y = parcel.readString();
        this.Z = parcel.readInt();
        this.c0 = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.d0 = (CharSequence) creator.createFromParcel(parcel);
        this.e0 = parcel.readInt();
        this.f0 = (CharSequence) creator.createFromParcel(parcel);
        this.g0 = parcel.createStringArrayList();
        this.h0 = parcel.createStringArrayList();
        this.i0 = parcel.readInt() != 0;
    }
}
